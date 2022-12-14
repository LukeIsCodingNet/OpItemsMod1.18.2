package net.lukeiscoding.minecraft.forge.opitemsmod.commands;
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
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OpItemsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RegisterCommands {

    @SubscribeEvent
    public static void registerCommands(final RegisterCommandsEvent event) {
        CommandOpItemsMod.register(event.getDispatcher());
        CommandHeal.register(event.getDispatcher());
        CommandFeed.register(event.getDispatcher());
        CommandSetHome.register(event.getDispatcher());
        CommandReturnHome.register(event.getDispatcher());
    }
}
