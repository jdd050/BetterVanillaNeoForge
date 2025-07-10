package com.jdd050.bettervanillamod.event;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;

@EventBusSubscriber(modid = BetterVanillaMod.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
        if (event.getPlayer().isUsingItem()) {
            Item item = event.getPlayer().getUseItem().getItem();

            if (item.toString().contains("bow")) {
                float fovModifier = 1F;
                int ticksUsingItem = event.getPlayer().getTicksUsingItem();
                float deltaTicks = (float) ticksUsingItem / 20F;
                if (deltaTicks > 1F) {
                    deltaTicks = 1F;
                } else {
                    deltaTicks *= deltaTicks;
                }
                fovModifier *= 1F - deltaTicks * 0.15F;
                event.setNewFovModifier(fovModifier);
            }
        }
    }
}
