package net.lukeiscoding.minecraft.forge.opitemsmod.world.features;
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

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlacement {

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifierIn) {
        return List.of(modifier, InSquarePlacement.spread(), modifierIn, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int size, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(size), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int size, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(size), modifier);
    }
}
