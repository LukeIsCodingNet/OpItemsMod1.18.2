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

    public static final Holder<PlacedFeature> TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed", ModConfigureFeatures.TOPAZ_ORE, OrePlacement.commonOrePlacement(35, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(30))));
    public static final Holder<PlacedFeature> TOPAZ_DEEPSLATE_ORE_PLACED = PlacementUtils.register("topaz_deepslate_ore_placed", ModConfigureFeatures.TOPAZ_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(35, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(30))));

    public static final Holder<PlacedFeature> CARBONADO_ORE_PLACED = PlacementUtils.register("carbonado_ore_placed", ModConfigureFeatures.CARBONADO_ORE, OrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> CARBONADO_DEEPSLATE_ORE_PLACED = PlacementUtils.register("carbonado_deepslate_ore_placed", ModConfigureFeatures.CARBONADO_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(20))));

    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed", ModConfigureFeatures.RUBY_ORE, OrePlacement.commonOrePlacement(18, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(16))));
    public static final Holder<PlacedFeature> RUBY_DEEPSLATE_ORE_PLACED = PlacementUtils.register("ruby_deepslate_ore_placed", ModConfigureFeatures.RUBY_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(18, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(16))));

    public static final Holder<PlacedFeature> BRASS_ORE_PLACED = PlacementUtils.register("brass_ore_placed", ModConfigureFeatures.BRASS_ORE, OrePlacement.commonOrePlacement(56, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-18), VerticalAnchor.aboveBottom(18))));
    public static final Holder<PlacedFeature> BRASS_DEEPSLATE_ORE_PLACED = PlacementUtils.register("brass_deepslate_ore_placed", ModConfigureFeatures.RUBY_DEEPSLATE_ORE, OrePlacement.commonOrePlacement(56, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-18), VerticalAnchor.aboveBottom(18))));
}
