package com.jdd050.bettervanillamod.effect;

import com.jdd050.bettervanillamod.item.ModArmorMaterials;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RegrowthEffect extends MobEffect {
    public RegrowthEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    private static boolean isInSunlight(LivingEntity entity) {
        BlockPos pos = entity.blockPosition();
        Level level = entity.level();
        return level.canSeeSky(pos) && level.isDay() && !(level.isRaining() || level.isThundering());
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (isInSunlight(livingEntity)) {
            if (livingEntity.level().getGameTime() % 20 == 0) {
                if (!(livingEntity.level().isClientSide())) {
                    livingEntity.heal(0.25F * amplifier);
                }
                return true;
            }
        }
        return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
