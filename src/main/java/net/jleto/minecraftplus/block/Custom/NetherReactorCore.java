package net.jleto.minecraftplus.block.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.awt.*;


public class NetherReactorCore extends Block {
    public NetherReactorCore(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        pPlayer.displayClientMessage(Component.literal("Nether Reactor Core Activated"), true);
        pLevel.playSound(pPlayer, pPos, SoundEvents.CANDLE_PLACE, SoundSource.BLOCKS,
                1f, 1f);

           return InteractionResult.SUCCESS;
        }



        }
