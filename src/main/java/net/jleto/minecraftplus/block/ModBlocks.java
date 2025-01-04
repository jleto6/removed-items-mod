package net.jleto.minecraftplus.block;

import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.block.Custom.CogBlock;
import net.jleto.minecraftplus.block.Custom.CogBlockTest;
import net.jleto.minecraftplus.block.Custom.CryingObsidianBlock;
import net.jleto.minecraftplus.block.Custom.NetherReactorCore;
import net.jleto.minecraftplus.item.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.client.renderer.RenderType;


import java.util.function.Supplier;


public class ModBlocks  {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftPlus.MODID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.STONE)
                                .strength(2f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> CYAN_FLOWER = registerBlock("cyan_flower",
            () -> new FlowerBlock( MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.ALLIUM).noOcclusion().noCollission()
            ));

    public static final RegistryObject<Block> POTTED_CYAN_FLOWER = BLOCKS.register("potted_cyan_flower",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT), ModBlocks.CYAN_FLOWER,
                    BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> COG = registerBlock("cog",
            () -> new CogBlockTest(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WIRE)
                    .noOcclusion().sound(SoundType.METAL)
                    .noCollission().strength(0.5f).noOcclusion()));

    public static final RegistryObject<Block> COG_ANIMATED = registerBlock("cog_animated",
            () -> new CogBlockTest(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WIRE)
                    .noOcclusion().sound(SoundType.METAL)
                    .noCollission().strength(0.5f).noOcclusion()));

    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));

    public static final RegistryObject<Block> CRYING_OBSIDIAN = registerBlock("crying_obsidian",
            () -> new CryingObsidianBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
                   // .lightLevel(LightBlock.LIGHT_EMISSION)));

    public static final RegistryObject<Block> NETHER_REACTOR_CORE = registerBlock("nether_reactor_core",
            () -> new NetherReactorCore(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> INITIALIZED_NETHER_REACTOR_CORE = registerBlock("initialized_nether_reactor_core",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> FINISHED_NETHER_REACTOR_CORE = registerBlock("finished_nether_reactor_core",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}