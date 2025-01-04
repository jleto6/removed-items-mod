package net.jleto.minecraftplus.item;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.block.ModBlocks;
import net.jleto.minecraftplus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftPlus.MODID);

    public static final RegistryObject<CreativeModeTab> RemovedItems_Tab = CREATIVE_MODE_TABS.register("minecraftplus",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.removed_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.RUBY.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.CYAN_FLOWER.get());
                        output.accept(ModBlocks.COG.get());
                        output.accept(ModBlocks.DIRT_SLAB.get());
                        output.accept(ModBlocks.CRYING_OBSIDIAN.get());
                        output.accept(ModBlocks.GLOWING_OBSIDIAN.get());
                        output.accept(ModBlocks.NETHER_REACTOR_CORE.get());
                        output.accept(ModBlocks.INITIALIZED_NETHER_REACTOR_CORE.get());
                        output.accept(ModBlocks.FINISHED_NETHER_REACTOR_CORE.get());
                        output.accept(ModItems.HUMAN_SPAWN_EGG.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Mosquitos_Tab = CREATIVE_MODE_TABS.register("mosquitos",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOSQUITO.get()))
                    .title(Component.translatable("creativetab.mosquitos"))
                    .displayItems((itemDisplayParameters, output) -> {


                    output.accept(ModItems.MOSQUITO.get());
                    output.accept(ModItems.COOKED_MOSQUITO.get());
                    output.accept(ModItems.MOSQUITO_LEATHER.get());
                    output.accept(ModItems.BLOOD_DROP.get());





                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
