package xxrexraptorxx.orecore.util;

import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem().equals(ModItems.oilPaste)) {
			return 300;   //Burntime (200=1Item, coal=10Items) 	
		}
		if(fuel.getItem().equals(ModItems.oilBucket)) {
			return 2000;  
		}	
		if(fuel.getItem().equals(ModItems.lavaCrystal)) {
			return 1000;  
		}
		if(fuel.getItem().equals(ModBlocks.magmarackBlock)) {
			return 800;  
		}	
		if(fuel.getItem().equals(ModBlocks.lavaCrystalBlock)) {
			return 9500;  
		}	
		if(fuel.getItem().equals(ModItems.coalDust)) {
			return 20;
		}
		if(fuel.getItem().equals(ModItems.tinyCoalDust)) {
			return 5;		
		}
	return 0;
	
	}

}