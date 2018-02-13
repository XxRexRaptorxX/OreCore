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
		
		GameRegistry.addSmelting(ModBlocks.netherIronOre, new ItemStack(Blocks.IRON_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherGoldOre, new ItemStack(Blocks.GOLD_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherCoalOre, new ItemStack(Blocks.COAL_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherEmeraldOre, new ItemStack(Blocks.EMERALD_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherDiamondOre, new ItemStack(Blocks.DIAMOND_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherRedstoneOre, new ItemStack(Blocks.REDSTONE_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherLapisOre, new ItemStack(Blocks.LAPIS_ORE, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherGlowstoneOre, new ItemStack(Items.GLOWSTONE_DUST, 3), 10);


		
		GameRegistry.addSmelting(ModBlocks.endIronOre, new ItemStack(Blocks.IRON_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endGoldOre, new ItemStack(Blocks.GOLD_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endCoalOre, new ItemStack(Blocks.COAL_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endEmeraldOre, new ItemStack(Blocks.EMERALD_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endDiamondOre, new ItemStack(Blocks.DIAMOND_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endRedstoneOre, new ItemStack(Blocks.REDSTONE_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endLapisOre, new ItemStack(Blocks.LAPIS_ORE, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endGlowstoneOre, new ItemStack(Items.GLOWSTONE_DUST, 3), 15);
		
		
		GameRegistry.addSmelting(ModBlocks.compressedIronOre, new ItemStack(Items.IRON_INGOT, 2), 20);
		GameRegistry.addSmelting(ModBlocks.compressedGoldOre, new ItemStack(Items.GOLD_INGOT, 2), 20);
		
		GameRegistry.addSmelting(ModItems.loamBall, new ItemStack(ModItems.loamBrick), 5);
		
		
		GameRegistry.addSmelting(ModItems.ironDust, new ItemStack(Items.IRON_INGOT), 5);
		GameRegistry.addSmelting(ModItems.goldDust, new ItemStack(Items.GOLD_INGOT), 5);

		
	if(OreCore.activateUseOwnModdedItems) {
		GameRegistry.addSmelting(ModBlocks.netherAluminiumOre, new ItemStack(ModBlocks.aluminiumOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherCopperOre, new ItemStack(ModBlocks.copperOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherIridiumOre, new ItemStack(ModBlocks.iridiumOre, 2), 20);
		GameRegistry.addSmelting(ModBlocks.netherLeadOre, new ItemStack(ModBlocks.leadOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherPlatinOre, new ItemStack(ModBlocks.platinumOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherSilverOre, new ItemStack(ModBlocks.silverOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherTinOre, new ItemStack(ModBlocks.tinOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherAmethystOre, new ItemStack(ModBlocks.amethystOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherSapphireOre, new ItemStack(ModBlocks.sapphireOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherRubyOre, new ItemStack(ModBlocks.rubyOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.netherUraniumOre, new ItemStack(ModBlocks.uraniumOre, 2), 10);

		GameRegistry.addSmelting(ModBlocks.endAluminiumOre, new ItemStack(ModBlocks.aluminiumOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endCopperOre, new ItemStack(ModBlocks.copperOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endIridiumOre, new ItemStack(ModBlocks.iridiumOre, 2), 25);
		GameRegistry.addSmelting(ModBlocks.endLeadOre, new ItemStack(ModBlocks.leadOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endPlatinOre, new ItemStack(ModBlocks.platinumOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endSilverOre, new ItemStack(ModBlocks.silverOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endTinOre, new ItemStack(ModBlocks.tinOre, 2), 15);
		GameRegistry.addSmelting(ModBlocks.endAmethystOre, new ItemStack(ModBlocks.amethystOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.endSapphireOre, new ItemStack(ModBlocks.sapphireOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.endRubyOre, new ItemStack(ModBlocks.rubyOre, 2), 10);
		GameRegistry.addSmelting(ModBlocks.endUraniumOre, new ItemStack(ModBlocks.uraniumOre, 2), 10);
		
		GameRegistry.addSmelting(ModBlocks.aluminiumOre, new ItemStack(ModItems.aluminiumIngot), 15);
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 15);
		GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack(ModItems.iridium), 25);
		GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack(ModItems.leadIngot), 15);
		GameRegistry.addSmelting(ModBlocks.platinumOre, new ItemStack(ModItems.platinumIngot), 15);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot), 15);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot), 15);
	}		
			
			
			
			
			
		}
	}