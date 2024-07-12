
package tech.setacaie.lifestreamcomponents.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GilSilverItem extends Item {
	public GilSilverItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
