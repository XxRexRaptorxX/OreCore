package xxrexraptorxx.orecore.items;

import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.OreCore;

public class ItemCopperIngot extends Item {
	
	public ItemCopperIngot() {
		super();
		if(OreCore.activateShowModOres){
		if(OreCore.activateUseOwnModdedItems){	
		 this.setCreativeTab(OreCore.mainTab);
		} } 
	}

}
