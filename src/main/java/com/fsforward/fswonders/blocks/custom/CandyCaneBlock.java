package com.fsforward.fswonders.blocks.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class CandyCaneBlock extends HorizontalFacingBlock {
    public CandyCaneBlock(Settings settings) {
        super(settings);
    }

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch (dir) {
            case NORTH:
                return VoxelShapes.cuboid(6.0 / 16.0, 0.0, 3.5 / 16.0, 10.0 / 16.0, 10.0 / 16.0, 8.5 / 16.0);
            case SOUTH:
                return VoxelShapes.cuboid(6.0 / 16.0, 0.0, 7.5 / 16.0, 10.0 / 16.0, 10.0 / 16.0, 12.5 / 16.0);
            case EAST:
                return VoxelShapes.cuboid(7.5 / 16.0, 0.0, 6.0 / 16.0, 12.5 / 16.0, 10.0 / 16.0, 10.0 / 16.0);
            case WEST:
                return VoxelShapes.cuboid(3.5 / 16.0, 0.0, 6.0 / 16.0, 8.5 / 16.0, 10.0 / 16.0, 10.0 / 16.0);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN && !this.canPlaceAt(state, world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockBelowState = world.getBlockState(pos.down());
        //Block blockBelow = blockBelowState.getBlock();

        return blockBelowState.isSolidBlock(world, pos.down());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
