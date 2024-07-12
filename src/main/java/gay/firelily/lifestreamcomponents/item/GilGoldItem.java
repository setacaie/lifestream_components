
package gay.firelily.lifestreamcomponents.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GilGoldItem extends Item {
	public GilGoldItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
