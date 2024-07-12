
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gay.firelily.lifestreamcomponents.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import gay.firelily.lifestreamcomponents.LifestreamComponentsMod;

public class LifestreamComponentsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LifestreamComponentsMod.MODID);
	public static final RegistryObject<CreativeModeTab> LIFESTREAM = REGISTRY.register("lifestream",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lifestream_components.lifestream")).icon(() -> new ItemStack(LifestreamComponentsModItems.GIL_GOLD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LifestreamComponentsModItems.SHINRA_ID.get());
				tabData.accept(LifestreamComponentsModItems.GIL_COPPER.get());
				tabData.accept(LifestreamComponentsModItems.GIL_SILVER.get());
				tabData.accept(LifestreamComponentsModItems.GIL_GOLD.get());
				tabData.accept(LifestreamComponentsModItems.GIL_DIAMOND.get());
				tabData.accept(LifestreamComponentsModItems.GIL_NETHERITE.get());
			})

					.build());
}
