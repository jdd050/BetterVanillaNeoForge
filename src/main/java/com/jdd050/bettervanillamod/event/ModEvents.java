package com.jdd050.bettervanillamod.event;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.effect.ModEffects;
import com.jdd050.bettervanillamod.item.ModArmorMaterials;
import com.jdd050.bettervanillamod.item.custom.HammerItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;

import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber
public class ModEvents {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if (mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if (HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if (pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerStruckByLightning(LivingDamageEvent.Pre event) {
        LivingEntity entity = event.getEntity();

        if (entity instanceof Player player && event.getSource().is(DamageTypeTags.IS_LIGHTNING)) {
            if (isWearingFullCopperArmor(player)) {
                event.setNewDamage(0);
                player.level().playSound(
                        null,
                        player.getX(),
                        player.getY(),
                        player.getZ(),
                        SoundEvents.TRIDENT_RETURN,
                        player.getSoundSource(),
                        3.0F,
                        1.5F
                );

                player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 100));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, false, false));
            }
        }
    }

    private static boolean isInSunlight(LivingEntity entity) {
        BlockPos pos = entity.blockPosition();
        Level level = entity.level();
        return level.canSeeSky(pos) && level.isDay() && !(level.isRaining() || level.isThundering());
    }

    private static boolean isWearingFullCopperArmor(Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof ArmorItem armorItem)) {
                return false;
            }

            Holder<?> material = armorItem.getMaterial();
            if (!material.equals(ModArmorMaterials.COPPER_ARMOR_MATERIAL)) {
                return false;
            }
        }

        return true;
    }
}
