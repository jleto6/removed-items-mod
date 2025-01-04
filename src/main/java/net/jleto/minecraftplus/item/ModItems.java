package net.jleto.minecraftplus.item;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.entity.ModEntities;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.client.renderer.RenderType;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftPlus.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HUMAN_SPAWN_EGG = ITEMS.register("human_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HUMAN, 0x3B78FF, 0x3942A1,
                    new Item.Properties()));

    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties().food(ModFoods.FLESH)));

    public static final RegistryObject<Item> MOSQUITO = ITEMS.register("mosquito",
            () -> new Item(new Item.Properties().food(ModFoods.MOSQUITO)));

    public static final RegistryObject<Item> COOKED_MOSQUITO = ITEMS.register("cooked_mosquito",
            () -> new Item(new Item.Properties().food(Foods.BEEF)));

    public static final RegistryObject<Item> MOSQUITO_LEATHER = ITEMS.register("mosquito_leather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_DROP = ITEMS.register("blood_drop",
            () -> new Item(new Item.Properties().food(Foods.HONEY_BOTTLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
