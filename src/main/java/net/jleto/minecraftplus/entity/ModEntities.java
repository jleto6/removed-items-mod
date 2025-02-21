package net.jleto.minecraftplus.entity;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.entity.custom.HumanEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MinecraftPlus.MODID);

    public static final RegistryObject<EntityType<HumanEntity>> HUMAN =
            ENTITY_TYPES.register("human", () -> EntityType.Builder.of(HumanEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("human"));

    public static final RegistryObject<EntityType<HumanEntity>> MOSQUITO =
            ENTITY_TYPES.register("mosqutio", () -> EntityType.Builder.of(HumanEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("mosquito"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
