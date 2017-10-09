package xxrexraptorxx.orecore.items;

import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import xxrexraptorxx.orecore.util.ItemAdvancedAxe;
import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLavacrystalAxe extends ItemAdvancedAxe {
	
	public ItemLavacrystalAxe(ToolMaterial material) {
		super(material, -3.0F);
		this.setCreativeTab(OreCore.mainTab);
	}

	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
	
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.FIRE_ASPECT, 1);;
			super.onUpdate(stack, world, entity, i, bool);
		}
	}
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.lavaCrystal;
	} 
	
}
