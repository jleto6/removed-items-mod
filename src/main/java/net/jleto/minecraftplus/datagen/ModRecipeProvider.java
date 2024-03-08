package net.jleto.minecraftplus.datagen;

import net.jleto.minecraftplus.item.ModItems;
import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.block.ModBlocks;
import net.jleto.minecraftplus.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                    .pattern("SSS")
                    .pattern("SSS")
                    .pattern("SSS")
                    .define('S', ModItems.RUBY.get())
                    .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                    .save(recipeOutput);

        }
    }
