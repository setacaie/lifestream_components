
package tech.setacaie.lifestreamcomponents.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GilNetheriteItem extends Item {
	public GilNetheriteItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
