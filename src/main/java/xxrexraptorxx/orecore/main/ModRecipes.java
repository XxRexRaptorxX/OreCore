package xxrexraptorxx.orecore.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public ModRecipes() {
	}
		public void register() {

		/** Smelting **/
		
		GameRegistry.addSmelting(ModBlocks.netherIronOre, new ItemStack(Items.IRON_INGOT, 1), 10);
		GameRegistry.addSmelting(ModBlocks.netherGoldOre, new ItemStack(Items.GOLD_INGOT, 1), 10);
		
		GameRegistry.addSmelting(ModBlocks.endIronOre, new ItemStack(Items.IRON_INGOT, 1), 10);
		GameRegistry.addSmelting(ModBlocks.endGoldOre, new ItemStack(Items.GOLD_INGOT, 1), 10);
		
		GameRegistry.addSmelting(ModBlocks.compressedIronOre, new ItemStack(Items.IRON_INGOT, 2), 20);
		GameRegistry.addSmelting(ModBlocks.compressedGoldOre, new ItemStack(Items.GOLD_INGOT, 2), 20);
		
		GameRegistry.addSmelting(ModItems.loamBall, new ItemStack(ModItems.loamBrick), 5);
		
		
		GameRegistry.addSmelting(ModItems.ironDust, new ItemStack(Items.IRON_INGOT), 5);
		GameRegistry.addSmelting(ModItems.goldDust, new ItemStack(Items.GOLD_INGOT), 5);


	if(OreCore.activateUseOwnModdedItems) {
		GameRegistry.addSmelting(ModBlocks.netherAluminiumOre, new ItemStack(ModItems.aluminiumIngot), 10);
		GameRegistry.addSmelting(ModBlocks.netherCopperOre, new ItemStack(ModItems.copperIngot), 10);
		GameRegistry.addSmelting(ModBlocks.netherIridiumOre, new ItemStack(ModItems.iridium), 20);
		GameRegistry.addSmelting(ModBlocks.netherLeadOre, new ItemStack(ModItems.leadIngot), 10);
		GameRegistry.addSmelting(ModBlocks.netherPlatinOre, new ItemStack(ModItems.platinumIngot), 10);
		GameRegistry.addSmelting(ModBlocks.netherSilverOre, new ItemStack(ModItems.silverIngot), 10);
		GameRegistry.addSmelting(ModBlocks.netherTinOre, new ItemStack(ModItems.tinIngot), 10);
		
		GameRegistry.addSmelting(ModBlocks.endAluminiumOre, new ItemStack(ModItems.aluminiumIngot), 10);
		GameRegistry.addSmelting(ModBlocks.endCopperOre, new ItemStack(ModItems.copperIngot), 10);
		GameRegistry.addSmelting(ModBlocks.endIridiumOre, new ItemStack(ModItems.iridium), 20);
		GameRegistry.addSmelting(ModBlocks.endLeadOre, new ItemStack(ModItems.leadIngot), 10);
		GameRegistry.addSmelting(ModBlocks.endPlatinOre, new ItemStack(ModItems.platinumIngot), 10);
		GameRegistry.addSmelting(ModBlocks.endSilverOre, new ItemStack(ModItems.silverIngot), 10);
		GameRegistry.addSmelting(ModBlocks.endTinOre, new ItemStack(ModItems.tinIngot), 10);
	}		
			
			
			
			
			
		}
	}