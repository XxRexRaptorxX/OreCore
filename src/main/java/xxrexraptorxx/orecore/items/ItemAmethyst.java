package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemAmethyst extends Item {
	
	public ItemAmethyst() {
		super();
		if(OreCore.activateShowModOres){
		 this.setCreativeTab(OreCore.mainTab);
		} 
	}

}
