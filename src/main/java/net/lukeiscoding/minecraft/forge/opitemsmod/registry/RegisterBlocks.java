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
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

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
    public static final RegistryObject<Block> TIKI_PORTAL_FRAME = BLOCKS.register("tiki_portal_frame", TikiPortalFrame::new);

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

    // buttons...
    public static final RegistryObject<StoneButtonBlock> RUBY_BUTTON = BLOCKS.register("ruby_button", () ->
            new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.5f, 6.5f).requiresCorrectToolForDrops().noCollission())
    );

    // pressure plates...
    public static final RegistryObject<PressurePlateBlock> RUBY_PRESSURE_PLATE = BLOCKS.register("ruby_pressure_plate", () ->
            new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(6.5f, 7.5f).requiresCorrectToolForDrops())
    );

    // doors...
    public static final RegistryObject<DoorBlock> RUBY_DOOR = BLOCKS.register("ruby_door", RubyDoor::new);

    // trapdoors...
    public static final RegistryObject<TrapDoorBlock> RUBY_TRAPDOOR = BLOCKS.register("ruby_trapdoor", RubyTrapdoor::new);

    // helpers...
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
}
