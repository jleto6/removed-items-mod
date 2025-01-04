package net.jleto.minecraftplus.event;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.entity.ModEntities;
import net.jleto.minecraftplus.entity.custom.HumanEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MinecraftPlus.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HUMAN.get(), HumanEntity.createAttributes().build());
    }
}
