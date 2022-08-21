package net.lukeiscoding.minecraft.forge.opitemsmod.blocks;
/*
Copyright (C) 2022  Luke Is Coding

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

public class NukeBlock extends TntBlock {

    public static final BooleanProperty UNSTABLE = BlockStateProperties.UNSTABLE;

    public NukeBlock() {
        super(BlockBehaviour.Properties.of(Material.GRASS)
                .instabreak()
                .sound(SoundType.GRASS));
        this.registerDefaultState(this.defaultBlockState().setValue(UNSTABLE, Boolean.valueOf(false)));
    }

    @Override
    public void onCaughtFire(BlockState state, Level world, BlockPos pos, @Nullable net.minecraft.core.Direction face, @Nullable LivingEntity igniter) {
        explode(world, pos, igniter);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState blockState, boolean isPlaced) {
        if (blockState.is(state.getBlock())) {
            if (world.hasNeighborSignal(pos)) {
                onCaughtFire(state, world, pos, null, null);
                world.removeBlock(pos, false);
            }
        }
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos blockPos, boolean hasChanged) {
        if (world.hasNeighborSignal(pos)) {
            onCaughtFire(state, world, pos, null, null);
            world.removeBlock(pos, false);
        }
    }

    @Override
    public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
        if (!world.isClientSide() && !player.isCreative() && state.getValue(UNSTABLE)) {
            onCaughtFire(state, world, pos, null, null);
        }

        super.playerWillDestroy(world, pos, state, player);
    }

    @Override
    public void wasExploded(Level world, BlockPos pos, Explosion explosion) {
        if (!world.isClientSide) {
            PrimedTnt primedTnt = new PrimedTnt(world, (double) pos.getX() + 0.50d, (double) pos.getY(), (double) pos.getZ() + 0.50d, explosion.getSourceMob());
            int i = primedTnt.getFuse();
            primedTnt.setFuse((short)(world.random.nextInt(i / 4) + i / 8));
            world.addFreshEntity(primedTnt);
        }
    }

    public static void explode(Level world, BlockPos pos) {
        explode(world, pos, (LivingEntity) null);
    }


    private static void explode(Level world, BlockPos pos, @Nullable LivingEntity entity) {
        if (world.isClientSide) {
            PrimedTnt primedTnt = new PrimedTnt(world, (double) pos.getX() + 0.50d, (double) pos.getY(), (double) pos.getZ() + 0.50d, entity);
            world.addFreshEntity(primedTnt);
            world.playSound((Player) null, primedTnt.getX(), primedTnt.getY(), primedTnt.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0f, 1.0f);
            world.gameEvent(entity, GameEvent.PRIME_FUSE, pos);
        }
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack stack = player.getItemInHand(hand);
        if (!stack.is(Items.FLINT_AND_STEEL) && !stack.is(Items.FIRE_CHARGE)) {
            return super.use(state, level, pos, player, hand, result);
        } else {
            onCaughtFire(state, level, pos, result.getDirection(), player);
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 11);
            Item item = stack.getItem();
            if (!player.isCreative()) {
                if (stack.is(Items.FLINT_AND_STEEL)) {
                    stack.hurtAndBreak(1, player, (c) -> {
                        c.broadcastBreakEvent(hand);
                    });
                } else {
                    stack.shrink(1);
                }
            }
            player.awardStat(Stats.ITEM_USED.get(item));
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    @Override
    public void onProjectileHit(Level world, BlockState state, BlockHitResult result, Projectile projectile) {
        if (world.isClientSide) {
            BlockPos pos = result.getBlockPos();
            Entity entity = projectile.getOwner();
            if (projectile.isOnFire() && projectile.mayInteract(world, pos)) {
                onCaughtFire(state, world, pos, null, entity instanceof LivingEntity ? (LivingEntity) entity : null);
                world.removeBlock(pos, false);
            }
        }
    }

    @Override
    public boolean dropFromExplosion(Explosion explosion) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(UNSTABLE);
    }
}
