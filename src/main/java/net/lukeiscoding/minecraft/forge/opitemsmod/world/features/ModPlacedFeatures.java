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

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed", ModConfigureFeatures.TOPAZ_ORE, OrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> TOPAZ_DEEPSLATE_ORE_PLACED = PlacementUtils.register("topaz_deepslate_ore_placed", ModConfigureFeatures.TOPAZ_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(40, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(20))));

    public static final Holder<PlacedFeature> CARBONADO_ORE_PLACED = PlacementUtils.register("carbonado_ore_placed", ModConfigureFeatures.CARBONADO_ORE, OrePlacement.commonOrePlacement(60, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> CARBONADO_DEEPSLATE_ORE_PLACED = PlacementUtils.register("carbonado_deepslate_ore_placed", ModConfigureFeatures.CARBONADO_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(80, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(20))));
}
