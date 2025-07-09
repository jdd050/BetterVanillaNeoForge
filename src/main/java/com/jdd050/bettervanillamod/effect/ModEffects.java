package com.jdd050.bettervanillamod.effect;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, BetterVanillaMod.MODID);

    public static final Holder<MobEffect> REGROWTH_EFFECT = MOB_EFFECTS.register("regrowth",
            () -> new RegrowthEffect(MobEffectCategory.BENEFICIAL, 0x0d5e0b));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
