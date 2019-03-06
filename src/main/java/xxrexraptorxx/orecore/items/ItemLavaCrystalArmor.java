package xxrexraptorxx.orecore.items;

import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent.PotionShiftEvent;

public class ItemLavaCrystalArmor extends ItemArmor {

	public ItemLavaCrystalArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(OreCore.mainTab);
	}

	
	
	
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!world.isRemote && player.inventory.armorInventory.get(3) != ItemStack.EMPTY && player.inventory.armorInventory.get(3).getItem() == ModItems.lavacrystalHelmet
		        && player.inventory.armorInventory.get(2) != ItemStack.EMPTY && player.inventory.armorInventory.get(2).getItem() == ModItems.lavacrystalChestplate
		        && player.inventory.armorInventory.get(1) != ItemStack.EMPTY && player.inventory.armorInventory.get(1).getItem() == ModItems.lavacrystalLeggins
		        && player.inventory.armorInventory.get(0) != ItemStack.EMPTY && player.inventory.armorInventory.get(0).getItem() == ModItems.lavacrystalBoots) {
		        this.effectPlayer(player, MobEffects.FIRE_RESISTANCE, 0);
			}
		}
	

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, amplifier, true, false));
	}

	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
		return stack.getItem() == ModItems.lavaCrystal;
	}  
}
