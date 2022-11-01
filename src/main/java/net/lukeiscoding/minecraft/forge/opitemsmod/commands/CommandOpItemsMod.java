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

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.lukeiscoding.minecraft.forge.opitemsmod.OpItemsMod;
import net.minecraft.Util;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;

import java.util.ArrayList;
import java.util.List;

public class CommandOpItemsMod {

    public static void register(final CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("opitemsmod").executes((command) -> sendInfo(command)));
    }

    private static int sendInfo(final CommandContext<CommandSourceStack> command) {
        if (command.getSource().getEntity() instanceof Player) {
            Player player = (Player) command.getSource().getEntity();

            final List<String> messages = new ArrayList<>();
            messages.add("OpItemsMod for Minecraft 1.18.2");
            messages.add("Version: " + OpItemsMod.MOD_VERSION);
            messages.add("Mod ID: " + OpItemsMod.MOD_ID);
            messages.add("Made by: Luke Is Coding");
            messages.add("My website: https://lukeiscoding.net");
            messages.add("Donation link: https://ko-fi.com/lukeiscoding");

            for (String s : messages) {
                player.sendMessage(new TextComponent(s), Util.NIL_UUID);
            }
        }

        return Command.SINGLE_SUCCESS;
    }
}
