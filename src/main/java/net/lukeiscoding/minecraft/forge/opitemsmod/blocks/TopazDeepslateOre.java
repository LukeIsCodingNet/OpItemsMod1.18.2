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

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class TopazDeepslateOre extends Block {

    public TopazDeepslateOre() {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .sound(SoundType.STONE)
                .strength(9.0f, 13.2f)
                .requiresCorrectToolForDrops());
    }
}
