package xxrexraptorxx.orecore.items;

import xxrexraptorxx.orecore.main.OreCore;
import xxrexraptorxx.orecore.util.ItemAdvancedAxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEmeraldAxe extends ItemAdvancedAxe {
	
	public ItemEmeraldAxe(ToolMaterial material) {
		super(material, -3.0F);
		this.setCreativeTab(OreCore.mainTab);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.EMERALD;
	} 

}
