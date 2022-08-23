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

import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterBlocks;
import net.lukeiscoding.minecraft.forge.opitemsmod.world.OreGeneration;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfigureFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVER_WORLD_TOPAZ_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RegisterBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RegisterBlocks.TOPAZ_DEEPSLATE_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> OVER_WORLD_CARBONADO_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RegisterBlocks.CARBONADO_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RegisterBlocks.CARBONADO_DEEPSLATE_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TOPAZ_ORE = FeatureUtils.register("topaz_ore", Feature.ORE, new OreConfiguration(OVER_WORLD_TOPAZ_ORE, 20));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TOPAZ_DEEPSLATE_ORE = FeatureUtils.register("topaz_deepslate_ore", Feature.ORE, new OreConfiguration(OVER_WORLD_TOPAZ_ORE, 20));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CARBONADO_ORE = FeatureUtils.register("carbonado_ore", Feature.ORE, new OreConfiguration(OVER_WORLD_CARBONADO_ORE, 12));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CARBONADO_DEEPSLATE_ORE = FeatureUtils.register("carbonado_deepslate_ore", Feature.ORE, new OreConfiguration(OVER_WORLD_CARBONADO_ORE, 20));
}
