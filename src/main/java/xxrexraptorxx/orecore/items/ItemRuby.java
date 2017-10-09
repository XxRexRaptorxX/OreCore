package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemRuby extends Item {
	
	public ItemRuby() {
		super();
		if(OreCore.activateShowModOres){
		 this.setCreativeTab(OreCore.mainTab);
		} 
	}

}
