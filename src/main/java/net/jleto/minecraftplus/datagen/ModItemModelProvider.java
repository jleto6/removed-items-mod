package net.jleto.minecraftplus.datagen;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraft.resources.ResourceLocation;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MinecraftPlus.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.RUBY);
    }

        private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(MinecraftPlus.MODID,"item/" + item.getId().getPath()));

    }
}
