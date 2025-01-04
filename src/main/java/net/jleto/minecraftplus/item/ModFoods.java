package net.jleto.minecraftplus.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods {
    public static final FoodProperties FLESH = new FoodProperties.Builder().nutrition(2).fast()
            .nutrition(2).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 0), 0.8F).meat().build();

    public static final FoodProperties MOSQUITO = new FoodProperties.Builder().nutrition(2).fast()
            .nutrition(2).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 0), 0.8F).meat().build();

}