package net.lukeiscoding.minecraft.forge.opitemsmod.items.food;
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
        along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterCreativeTabs;
import net.minecraft.world.item.Item;

public class WeedBrownie extends Item {

    public WeedBrownie() {
        super(new Item.Properties().tab(RegisterCreativeTabs.OP_FOODS_TAB)
                .food(ModFoodProperties.WEED_BROWNIE));
    }
}
