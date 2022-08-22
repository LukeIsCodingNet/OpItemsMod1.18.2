package net.lukeiscoding.minecraft.forge.opitemsmod.registry;
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
import net.lukeiscoding.minecraft.forge.opitemsmod.items.BaseItem;
import net.lukeiscoding.minecraft.forge.opitemsmod.items.BaseMaterialItem;
import net.lukeiscoding.minecraft.forge.opitemsmod.tools.ModItemTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterItems {

    // create a deferred register to register items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpItemsMod.MOD_ID);

    // create a method to call in the constructor of the main mod class to register items
    public static void registerItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // items...
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", BaseItem::new);

    // materials
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", BaseMaterialItem::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", BaseMaterialItem::new);
    public static final RegistryObject<Item> CARBONADO = ITEMS.register("carbonado", BaseMaterialItem::new);

    // swords...
    public static final RegistryObject<SwordItem> DRAGON_SAYER = ITEMS.register("dragon_slayer", () ->
            new SwordItem(ModItemTiers.DRAGON_SLAYER, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_COMBAT_TAB))
    );

    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new SwordItem(ModItemTiers.TOPAZ_SWORD, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_COMBAT_TAB))
    );

    // shovels...
    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () ->
            new ShovelItem(ModItemTiers.TOPAZ_SHOVEL, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_TOOLS_TAB))
    );

    // pickaxes...
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () ->
            new PickaxeItem(ModItemTiers.TOPAZ_PICKAXE, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_TOOLS_TAB))
    );

    // axes...
    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () ->
            new AxeItem(ModItemTiers.TOPAZ_AXE, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_TOOLS_TAB))
    );

    // hoes...
    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () ->
            new HoeItem(ModItemTiers.TOPAZ_HOE, 0, 0, new Item.Properties().tab(RegisterCreativeTabs.OP_TOOLS_TAB))
    );
}
