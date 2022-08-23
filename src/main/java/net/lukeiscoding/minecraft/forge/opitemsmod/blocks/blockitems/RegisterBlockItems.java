package net.lukeiscoding.minecraft.forge.opitemsmod.blocks.blockitems;
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
import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterBlocks;
import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterCreativeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterBlockItems {

    // create a deferred register to register block items
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpItemsMod.MOD_ID);

    // create a method to call in the main mod class constructor to register block items
    public static void registerBlockItems() {
        BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = BLOCK_ITEMS.register("topaz_block", () ->
            new BlockItem(RegisterBlocks.TOPAZ_BLOCK.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = BLOCK_ITEMS.register("topaz_ore", () ->
            new BlockItem(RegisterBlocks.TOPAZ_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> TOPAZ_DEEPSLATE_ORE_ITEM = BLOCK_ITEMS.register("topaz_deepslate_ore", () ->
            new BlockItem(RegisterBlocks.TOPAZ_DEEPSLATE_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> RUBY_ORE_ITEM = BLOCK_ITEMS.register("ruby_ore", () ->
            new BlockItem(RegisterBlocks.RUBY_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> RUBY_DEEPSLATE_ORE_ITEM = BLOCK_ITEMS.register("ruby_deepslate_ore", () ->
            new BlockItem(RegisterBlocks.RUBY_DEEPSLATE_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> CARBONADO_ORE_ITEM = BLOCK_ITEMS.register("carbonado_ore", () ->
            new BlockItem(RegisterBlocks.CARBONADO_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> CARBONADO_DEEPSLATE_ORE_ITEM = BLOCK_ITEMS.register("carbonado_deepslate_ore", () ->
            new BlockItem(RegisterBlocks.CARBONADO_DEEPSLATE_ORE.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = BLOCK_ITEMS.register("ruby_block", () ->
            new BlockItem(RegisterBlocks.RUBY_BLOCK.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> RUBY_SLAB_ITEM = BLOCK_ITEMS.register("ruby_slab", () ->
            new BlockItem(RegisterBlocks.RUBY_SLAB.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> TOPAZ_SLAB_ITEM = BLOCK_ITEMS.register("topaz_slab", () ->
            new BlockItem(RegisterBlocks.TOPAZ_SLAB.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> CARBONADO_SLAB_ITEM = BLOCK_ITEMS.register("carbonado_slab", () ->
            new BlockItem(RegisterBlocks.CARBONADO_SLAB.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> TEST_TNT_BLOCK_ITEM = BLOCK_ITEMS.register("test_tnt", () ->
            new BlockItem(RegisterBlocks.TEST_TNT.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> NUKE_BLOCK_ITEM = BLOCK_ITEMS.register("nuke", () ->
            new BlockItem(RegisterBlocks.NUKE_BLOCK.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> CARBONADO_BLOCK_ITEM = BLOCK_ITEMS.register("carbonado_block", () ->
            new BlockItem(RegisterBlocks.CARBONADO_BLOCK.get(), new Item.Properties().tab(RegisterCreativeTabs.OP_BLOCKS_TAB))
    );
}
