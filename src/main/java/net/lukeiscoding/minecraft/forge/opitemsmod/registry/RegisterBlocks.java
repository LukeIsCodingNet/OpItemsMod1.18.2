package net.lukeiscoding.minecraft.forge.opitemsmod.registry;
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

import net.lukeiscoding.minecraft.forge.opitemsmod.OpItemsMod;
import net.lukeiscoding.minecraft.forge.opitemsmod.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TntBlock;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterBlocks {

    // create a deferred register to register blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpItemsMod.MOD_ID);

    // create a method to call in the main mod class constrictor to register blocks
    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // blocks...
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", TopazBlock::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> CARBONADO_BLOCK = BLOCKS.register("carbonado_block", CarbonadoBlock::new);

    // slabs
    public static final RegistryObject<Block> RUBY_SLAB = BLOCKS.register("ruby_slab", RubySlab::new);
    public static final RegistryObject<Block> TOPAZ_SLAB = BLOCKS.register("topaz_slab", TopazSlab::new);
    public static final RegistryObject<Block> CARBONADO_SLAB = BLOCKS.register("carbonado_slab", CarbonadoSlab::new);

    // ores...
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", TopazOre::new);
    public static final RegistryObject<Block> TOPAZ_DEEPSLATE_ORE = BLOCKS.register("topaz_deepslate_ore", TopazDeepslateOre::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> RUBY_DEEPSLATE_ORE = BLOCKS.register("ruby_deepslate_ore", RubyDeepslateOre::new);
    public static final RegistryObject<Block> CARBONADO_ORE = BLOCKS.register("carbonado_ore", CarbonadoOre::new);
    public static final RegistryObject<Block> CARBONADO_DEEPSLATE_ORE = BLOCKS.register("carbonado_deepslate_ore", CarbonadoDeepslateOre::new);

    // TNT...
    public static final RegistryObject<TntBlock> NUKE_BLOCK = BLOCKS.register("nuke", NukeBlock::new);
    public static final RegistryObject<TntBlock> TEST_TNT = BLOCKS.register("test_tnt", TestTNT::new);
}
