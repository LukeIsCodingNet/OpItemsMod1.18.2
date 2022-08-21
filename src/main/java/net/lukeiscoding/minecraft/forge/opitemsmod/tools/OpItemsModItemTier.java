package net.lukeiscoding.minecraft.forge.opitemsmod.tools;
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

import net.lukeiscoding.minecraft.forge.opitemsmod.registry.RegisterItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum OpItemsModItemTier {

    DRAGON_SLAYER(3, 6000, 4.5f, 800.0f, 2, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.DRAGON_SAYER.get())
    ),
    TOPAZ_SWORD(3, 9000, 400.0f, 400.0f, 800, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.TOPAZ_SWORD.get())
    ),
    TOPAZ_SHOVEL(3, 9000, 400.0f, 40.0f, 800, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.TOPAZ_SHOVEL.get())
    ),
    TOPAZ_PICKAXE(3, 9000, 400.0f, 40.0f, 800, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.TOPAZ_PICKAXE.get())
    ),
    TOPAZ_AXE(3, 9000, 400.0f, 40.0f, 800, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.TOPAZ_AXE.get())
    ),
    TOPAZ_HOE(3, 9000, 400.0f, 40.0f, 800, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(RegisterItems.TOPAZ_HOE.get())
    );

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final TagKey<Block> tag;
    private final Supplier<Ingredient> repairIngredient;

    OpItemsModItemTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Block> tag, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.tag = tag;
        this.repairIngredient = repairIngredient;
    }

    public int getLevel() {
        return level;
    }

    public int getUses() {
        return uses;
    }

    public float getSpeed() {
        return speed;
    }

    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public TagKey<Block> getTag() {
        return tag;
    }

    public Supplier<Ingredient> getRepairIngredient() {
        return repairIngredient;
    }
}
