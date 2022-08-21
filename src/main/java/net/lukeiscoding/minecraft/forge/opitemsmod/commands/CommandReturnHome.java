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
import net.minecraft.server.level.ServerPlayer;

public class CommandReturnHome {

    public static void register(final CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("gohome").executes((command) -> sendInfo(command)));
    }

    private static int sendInfo(final CommandContext<CommandSourceStack> command) {
        if (command.getSource().getEntity() instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) command.getSource().getEntity();
            boolean hasHomePos = player.getPersistentData().getIntArray(OpItemsMod.MOD_ID + "home_pos").length != 0;

            if (hasHomePos) {
                int[] playerPos = player.getPersistentData().getIntArray(OpItemsMod.MOD_ID + "home_pos");
                //player.setPos(playerPos[0], playerPos[1], playerPos[2]);
                player.teleportTo(playerPos[0], playerPos[1], playerPos[2]);
                player.sendMessage(new TextComponent("§f[§aOpItemsMod§f] You have returned home!"), Util.NIL_UUID);
                return 1;
            } else {
                player.sendMessage(new TextComponent("§f[§aOpItemsMod§f] No Home Position has been set!"), Util.NIL_UUID);
                return -1;
            }
        }

        return Command.SINGLE_SUCCESS;
    }
}
