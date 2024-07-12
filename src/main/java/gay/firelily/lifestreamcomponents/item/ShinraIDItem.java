
package gay.firelily.lifestreamcomponents.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ShinraIDItem extends Item {
	public ShinraIDItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}
}
