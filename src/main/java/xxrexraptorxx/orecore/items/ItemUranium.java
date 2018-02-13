package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemUranium extends Item {
	
	public ItemUranium() {
		super();
		if(OreCore.activateShowModOres){
		 this.setCreativeTab(OreCore.mainTab);
		} 
	}

}
