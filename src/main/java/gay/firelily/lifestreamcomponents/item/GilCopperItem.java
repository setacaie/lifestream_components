
package gay.firelily.lifestreamcomponents.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GilCopperItem extends Item {
	public GilCopperItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
