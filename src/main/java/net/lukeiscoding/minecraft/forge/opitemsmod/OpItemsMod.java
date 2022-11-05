package net.lukeiscoding.minecraft.forge.opitemsmod;
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
import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterBlocks;
import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterItems;
import net.lukeiscoding.minecraft.forge.opitemsmod.world.dimension.ModDimensions;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OpItemsMod.MOD_ID)
public class OpItemsMod {

    // create a string to reference this mod's id
    public static final String MOD_ID = "opitemsmod_1182";

    // create a string to reference the mod version
    public static final String MOD_VERSION = "0.0.2-alpha";

    // get a logger
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public OpItemsMod() {
        // register the event listeners
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        // call the registerItems method in the Register items class to register items
        RegisterItems.registerItems();

        // call the registerBlocks method in the RegisterBlocks class to register blocks
        RegisterBlocks.registerBlocks();

        // call the registerBlockItems in the RegisterBlockItems class to register block items
        RegisterBlockItems.registerBlockItems();

        // call the registerDimension method in the ModDimensions class to register dimensions
        ModDimensions.registerDimensions();

        // register this mod to the forge event bus
        MinecraftForge.EVENT_BUS.register(this);
    }

    // register event listeners

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Op Items Mod has been initialized");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Op Items Mod has finished setting up client events.");
        ItemBlockRenderTypes.setRenderLayer(RegisterBlocks.RUBY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegisterBlocks.RUBY_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegisterBlocks.TOPAZ_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegisterBlocks.TOPAZ_TRAPDOOR.get(), RenderType.translucent());
    }
}
