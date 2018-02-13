package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemQuartz extends Item {
	
	public ItemQuartz() {
		super();
		if(OreCore.activateShowModOres){
		 this.setCreativeTab(OreCore.mainTab);
		} 
	}

}
