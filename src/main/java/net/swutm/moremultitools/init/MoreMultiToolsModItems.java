
/*
 *    swutm note: This file will be REGENERATED on each build.
 */
package net.swutm.moremultitools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.swutm.moremultitools.item.WoodMultiToolsItem;
import net.swutm.moremultitools.item.UkraineMultiToolsItem;
import net.swutm.moremultitools.item.StoneMultiToolsItem;
import net.swutm.moremultitools.item.NetheriteMultiToolsItem;
import net.swutm.moremultitools.item.IronMultiToolsItem;
import net.swutm.moremultitools.item.GoldMultiToolsItem;
import net.swutm.moremultitools.item.DiamondMultiToolsItem;
import net.swutm.moremultitools.moremultitools;

public class MoreMultiToolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, moremultitools.MOD_ID);
	public static final RegistryObject<Item> WOOD_MULTI_TOOLS = REGISTRY.register("wood_multi_tools", () -> new WoodMultiToolsItem());
	public static final RegistryObject<Item> STONE_MULTI_TOOLS = REGISTRY.register("stone_multi_tools", () -> new StoneMultiToolsItem());
	public static final RegistryObject<Item> IRON_MULTI_TOOLS = REGISTRY.register("iron_multi_tools", () -> new IronMultiToolsItem());
	public static final RegistryObject<Item> GOLD_MULTI_TOOLS = REGISTRY.register("gold_multi_tools", () -> new GoldMultiToolsItem());
	public static final RegistryObject<Item> DIAMOND_MULTI_TOOLS = REGISTRY.register("diamond_multi_tools", () -> new DiamondMultiToolsItem());
	public static final RegistryObject<Item> NETHERITE_MULTI_TOOLS = REGISTRY.register("netherite_multi_tools", () -> new NetheriteMultiToolsItem());
	public static final RegistryObject<Item> UKRAINE_MULTI_TOOLS = REGISTRY.register("ukraine_multi_tools", () -> new UkraineMultiToolsItem());
}
