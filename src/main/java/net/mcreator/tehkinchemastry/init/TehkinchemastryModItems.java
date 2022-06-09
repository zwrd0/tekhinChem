
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tehkinchemastry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tehkinchemastry.item.HydrogenItem;
import net.mcreator.tehkinchemastry.TehkinchemastryMod;

public class TehkinchemastryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TehkinchemastryMod.MODID);
	public static final RegistryObject<Item> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenItem());
}
