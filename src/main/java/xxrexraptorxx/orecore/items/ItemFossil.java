package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemFossil extends Item {
	
	public ItemFossil () {
		super();
		this.setCreativeTab(OreCore.mainTab);
		this.setMaxStackSize(16);
	}

}
