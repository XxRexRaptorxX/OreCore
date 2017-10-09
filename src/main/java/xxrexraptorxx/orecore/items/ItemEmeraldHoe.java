package xxrexraptorxx.orecore.items;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemEmeraldHoe extends ItemHoe {
	
	public ItemEmeraldHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(OreCore.mainTab);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.EMERALD;
	} 

}
