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

import net.lukeiscoding.minecraft.forge.opitemsmod.blocks.blockitems.RegisterBlockItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RegisterCreativeTabs {

    public static final CreativeModeTab OP_ITEMS_TAB = new CreativeModeTab("op_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.TEST_ITEM.get());
        }
    };

    public static final CreativeModeTab OP_MATERIALS_TAB = new CreativeModeTab("op_materials_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.TOPAZ.get());
        }
    };

    public static final CreativeModeTab OP_BLOCKS_TAB = new CreativeModeTab("op_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterBlockItems.TOPAZ_BLOCK_ITEM.get());
        }
    };

    public static final CreativeModeTab OP_COMBAT_TAB = new CreativeModeTab("op_combat_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.DRAGON_SAYER.get());
        }
    };

    public static final CreativeModeTab OP_TOOLS_TAB = new CreativeModeTab("op_tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.TOPAZ_SHOVEL.get());
        }
    };

    public static final CreativeModeTab OP_FOODS_TAB = new CreativeModeTab("op_foods_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.WEED_BROWNIE.get());
        }
    };

    public static final CreativeModeTab OP_REDSTONE_TAB = new CreativeModeTab("op_redstone_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterBlockItems.RUBY_DOOR.get());
        }
    };
}
