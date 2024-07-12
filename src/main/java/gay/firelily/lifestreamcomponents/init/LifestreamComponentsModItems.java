
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gay.firelily.lifestreamcomponents.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import gay.firelily.lifestreamcomponents.item.ShinraIDItem;
import gay.firelily.lifestreamcomponents.item.GilSilverItem;
import gay.firelily.lifestreamcomponents.item.GilNetheriteItem;
import gay.firelily.lifestreamcomponents.item.GilGoldItem;
import gay.firelily.lifestreamcomponents.item.GilDiamondItem;
import gay.firelily.lifestreamcomponents.item.GilCopperItem;
import gay.firelily.lifestreamcomponents.LifestreamComponentsMod;

public class LifestreamComponentsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LifestreamComponentsMod.MODID);
	public static final RegistryObject<Item> GIL_COPPER = REGISTRY.register("gil_copper", () -> new GilCopperItem());
	public static final RegistryObject<Item> GIL_SILVER = REGISTRY.register("gil_silver", () -> new GilSilverItem());
	public static final RegistryObject<Item> GIL_GOLD = REGISTRY.register("gil_gold", () -> new GilGoldItem());
	public static final RegistryObject<Item> GIL_DIAMOND = REGISTRY.register("gil_diamond", () -> new GilDiamondItem());
	public static final RegistryObject<Item> GIL_NETHERITE = REGISTRY.register("gil_netherite", () -> new GilNetheriteItem());
	public static final RegistryObject<Item> SHINRA_ID = REGISTRY.register("shinra_id", () -> new ShinraIDItem());
	// Start of user code block custom items
	// End of user code block custom items
}
