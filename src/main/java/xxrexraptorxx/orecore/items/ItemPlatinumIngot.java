package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemPlatinumIngot extends Item {
	
	public ItemPlatinumIngot() {
		super();
		if(OreCore.activateShowModOres){
		if(OreCore.activateUseOwnModdedItems){	
		 this.setCreativeTab(OreCore.mainTab);
		} } 
	}

}
