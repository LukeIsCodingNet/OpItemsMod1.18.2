package net.lukeiscoding.minecraft.forge.opitemsmod.world.dimension;
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

import net.lukeiscoding.minecraft.forge.opitemsmod.OpItemsMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    // create a resource key for Squidword's Tiki Land
    public static final ResourceKey<Level> STL_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OpItemsMod.MOD_ID, "stl"));

    // create dimension type for SquidWard's Tiki Land
    public static final ResourceKey<DimensionType> STL_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, STL_KEY.getRegistryName());

    // create a method to call in the constructor of the main mod class to register dimensions
    public static void registerDimensions() {
        System.out.println("Registering mod dimensions for: " + OpItemsMod.MOD_ID);
    }
}
