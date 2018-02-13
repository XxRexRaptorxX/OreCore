package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemSapphire extends Item {
	
	public ItemSapphire() {
		super();
		if(OreCore.activateShowModOres){
		 this.setCreativeTab(OreCore.mainTab);
		} 
	}

}
