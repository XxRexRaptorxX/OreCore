package xxrexraptorxx.orecore.items;

import xxrexraptorxx.orecore.main.OreCore;
import xxrexraptorxx.orecore.util.ItemAdvancedSword;
import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(OreCore.mainTab);
		
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.EMERALD;
	} 

}