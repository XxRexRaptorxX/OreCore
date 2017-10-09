package xxrexraptorxx.orecore.util;

import net.minecraftforge.oredict.OreDictionary;
import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;

public class OreDictionaryHandler {

	
	public static void registerOreDictionary() {
		
		/** Ore Dictionary **/
    	
		// items
		
	OreDictionary.registerOre("fossil", ModItems.fossil);
	OreDictionary.registerOre("fossil", ModItems.fossil1);
	OreDictionary.registerOre("fossil", ModItems.fossil2);
	OreDictionary.registerOre("fossil", ModItems.fossil3);
	OreDictionary.registerOre("fossil", ModItems.fossil4);
	OreDictionary.registerOre("fossil", ModItems.fossil5);
	OreDictionary.registerOre("fossil", ModItems.fossil6);
	
	OreDictionary.registerOre("pasteOil", ModItems.oilPaste);
	OreDictionary.registerOre("bucketOil", ModItems.oilBucket);
	
	OreDictionary.registerOre("dustCoal", ModItems.coalDust);
	OreDictionary.registerOre("dustIron", ModItems.ironDust);
	OreDictionary.registerOre("dustGold", ModItems.goldDust);
	OreDictionary.registerOre("dustLapis", ModItems.lapisDust);
	OreDictionary.registerOre("dustEmerald", ModItems.emeraldDust);
	OreDictionary.registerOre("dustDiamond", ModItems.diamondDust);
	
	OreDictionary.registerOre("dustTinyCoal", ModItems.tinyCoalDust);
	OreDictionary.registerOre("dustTinyIron", ModItems.tinyIronDust);
	OreDictionary.registerOre("dustTinyGold", ModItems.tinyGoldDust);
	OreDictionary.registerOre("dustTinyLapis", ModItems.tinyLapisDust);
	OreDictionary.registerOre("dustTinyEmerald", ModItems.tinyEmeraldDust);
	
	OreDictionary.registerOre("swordEmerald", ModItems.emeraldSword);
	OreDictionary.registerOre("pickaxeEmerald", ModItems.emeraldPickaxe);
	OreDictionary.registerOre("axeEmerald", ModItems.emeraldAxe);
	OreDictionary.registerOre("shovelEmerald", ModItems.emeraldShovel);
	OreDictionary.registerOre("hoeEmerald", ModItems.emeraldHoe);
	OreDictionary.registerOre("swordEmerald", ModItems.emeraldSword);
	
 	OreDictionary.registerOre("swordLavaCrystal", ModItems.lavacrystalSword);
	OreDictionary.registerOre("pickaxeLavaCrystal", ModItems.lavacrystalPickaxe);
	OreDictionary.registerOre("axeLavaCrystal", ModItems.lavacrystalAxe);
	OreDictionary.registerOre("shovelLavaCrystal", ModItems.lavacrystalShovel);
	OreDictionary.registerOre("hoeLavaCrystal", ModItems.lavacrystalHoe);
	OreDictionary.registerOre("swordLavaCrystal", ModItems.lavacrystalSword);

	OreDictionary.registerOre("ingotAluminium", ModItems.aluminiumIngot);
	OreDictionary.registerOre("gemAmethyst", ModItems.amethyst);
	OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
	OreDictionary.registerOre("gemIridium", ModItems.iridium);
	OreDictionary.registerOre("ingotLead", ModItems.leadIngot);
	OreDictionary.registerOre("ingotPlatinum", ModItems.platinumIngot);
	OreDictionary.registerOre("gemRuby", ModItems.ruby);
	OreDictionary.registerOre("gemSapphire", ModItems.sapphire);
	OreDictionary.registerOre("ingotSilver", ModItems.silverIngot);
	OreDictionary.registerOre("ingotTin", ModItems.tinIngot);
	OreDictionary.registerOre("gemUranium", ModItems.uranium);

	
	
		
		//blocks
	
	OreDictionary.registerOre("oreMixed", ModBlocks.mixedOre);
	
	OreDictionary.registerOre("oreCompressedCoal", ModBlocks.compressedCoalOre);
	OreDictionary.registerOre("oreCompressedDiamond", ModBlocks.compressedDiamondOre);
	OreDictionary.registerOre("oreCompressedEmerald", ModBlocks.compressedEmeraldOre);
	OreDictionary.registerOre("oreCompressedGold", ModBlocks.compressedGoldOre);
	OreDictionary.registerOre("oreCompressedIron", ModBlocks.compressedIronOre);
	OreDictionary.registerOre("oreCompressedLapis", ModBlocks.compressedLapisOre);
	OreDictionary.registerOre("oreCompressedRedstone", ModBlocks.compressedRedstoneOre);
	
	OreDictionary.registerOre("oreCoal", ModBlocks.netherCoalOre);
	OreDictionary.registerOre("oreDiamond", ModBlocks.netherDiamondOre);
	OreDictionary.registerOre("oreEmerald", ModBlocks.netherEmeraldOre);
	OreDictionary.registerOre("oreGold", ModBlocks.netherGoldOre);
	OreDictionary.registerOre("oreIron", ModBlocks.netherIronOre);
	OreDictionary.registerOre("oreLapis", ModBlocks.netherLapisOre);
	OreDictionary.registerOre("oreRedstone", ModBlocks.netherRedstoneOre);
	OreDictionary.registerOre("oreGlowstone", ModBlocks.netherGlowstoneOre);
	
	OreDictionary.registerOre("oreCoal", ModBlocks.endCoalOre);
	OreDictionary.registerOre("oreDiamond", ModBlocks.endDiamondOre);
	OreDictionary.registerOre("oreEmerald", ModBlocks.endEmeraldOre);
	OreDictionary.registerOre("oreGold", ModBlocks.endGoldOre);
	OreDictionary.registerOre("oreIron", ModBlocks.endIronOre);
	OreDictionary.registerOre("oreLapis", ModBlocks.endLapisOre);
	OreDictionary.registerOre("oreRedstone", ModBlocks.endRedstoneOre);
	OreDictionary.registerOre("oreGlowstone", ModBlocks.endGlowstoneOre);
	
	OreDictionary.registerOre("oreXp", ModBlocks.xpOre);
	OreDictionary.registerOre("oreNetherXp", ModBlocks.netherXpOre);
	OreDictionary.registerOre("oreEndXp", ModBlocks.endXpOre);
	
	OreDictionary.registerOre("blockBasalt", ModBlocks.basaltBlock);
	OreDictionary.registerOre("blockMarble", ModBlocks.marmorBlock);
	OreDictionary.registerOre("blockSlate", ModBlocks.slateBlock);
	
	OreDictionary.registerOre("stoneBasalt", ModBlocks.basaltOre);
	OreDictionary.registerOre("stoneMarble", ModBlocks.marmorOre);
	OreDictionary.registerOre("stoneSlate", ModBlocks.slateOre);
	OreDictionary.registerOre("stoneOilSlate", ModBlocks.oilSlateOre);
	
	OreDictionary.registerOre("dustAshe", ModItems.ashe);
	OreDictionary.registerOre("gemLavaCrystal", ModItems.lavaCrystal);
	OreDictionary.registerOre("loamBall", ModItems.loamBall);
	OreDictionary.registerOre("ingotLoamBrick", ModItems.loamBrick);
	OreDictionary.registerOre("meteor", ModItems.meteor);
	OreDictionary.registerOre("itemStone", ModItems.stone);
	
   	OreDictionary.registerOre("blockAshe", ModBlocks.asheBlock);   	
   	OreDictionary.registerOre("oreLavaCrystal", ModBlocks.lavaCrystalOre);   	
   	OreDictionary.registerOre("blockLavaCrystal", ModBlocks.lavaCrystalBlock);   	
   	OreDictionary.registerOre("blockLoam", ModBlocks.loamBlock);   	
   	OreDictionary.registerOre("blockLoamBricks", ModBlocks.loamBrickBlock);   	
   	OreDictionary.registerOre("blockMeteor", ModBlocks.meteorBlock);   
   	OreDictionary.registerOre("blockMagmarack", ModBlocks.magmarackBlock);

   	OreDictionary.registerOre("oreGravelGold", ModBlocks.goldGravelOre);
   	OreDictionary.registerOre("oreGravelIron", ModBlocks.ironGravelOre);
   	OreDictionary.registerOre("blockNetherEye", ModBlocks.netherEyeBlock);
   	OreDictionary.registerOre("blockNetherEye", ModBlocks.netherEyeBlock2);
   	OreDictionary.registerOre("blockEndEye", ModBlocks.endEyeBlock);
   	OreDictionary.registerOre("blockNetherMob", ModBlocks.netherMobBlock);
   	OreDictionary.registerOre("blockEndMob", ModBlocks.endEyeBlock);
   	
   	OreDictionary.registerOre("oreAluminium", ModBlocks.netherAluminiumOre);
   	OreDictionary.registerOre("oreAmethyst", ModBlocks.netherAmethystOre);
   	OreDictionary.registerOre("oreCopper", ModBlocks.netherCopperOre);
   	OreDictionary.registerOre("oreIridium", ModBlocks.netherIridiumOre);
   	OreDictionary.registerOre("oreLead", ModBlocks.netherLeadOre);
   	OreDictionary.registerOre("orePlatinum", ModBlocks.netherPlatinOre);
   	OreDictionary.registerOre("oreRuby", ModBlocks.netherRubyOre);
   	OreDictionary.registerOre("oreSapphire", ModBlocks.netherSapphireOre);
   	OreDictionary.registerOre("oreSilver", ModBlocks.netherSilverOre);
   	OreDictionary.registerOre("oreTin", ModBlocks.netherTinOre);
   	OreDictionary.registerOre("oreUranium", ModBlocks.netherUraniumOre);
   	
   	OreDictionary.registerOre("oreAluminium", ModBlocks.endAluminiumOre);
   	OreDictionary.registerOre("oreAmethyst", ModBlocks.endAmethystOre);
   	OreDictionary.registerOre("oreCopper", ModBlocks.endCopperOre);
   	OreDictionary.registerOre("oreIridium", ModBlocks.endIridiumOre);
   	OreDictionary.registerOre("oreLead", ModBlocks.endLeadOre);
   	OreDictionary.registerOre("orePlatinum", ModBlocks.endPlatinOre);
   	OreDictionary.registerOre("oreRuby", ModBlocks.endRubyOre);
   	OreDictionary.registerOre("oreSapphire", ModBlocks.endSapphireOre);
   	OreDictionary.registerOre("oreSilver", ModBlocks.endSilverOre);
   	OreDictionary.registerOre("oreTin", ModBlocks.endTinOre);
   	OreDictionary.registerOre("oreUranium", ModBlocks.endUraniumOre);
   	       	
   	OreDictionary.registerOre("blockStandFossil", ModBlocks.fossilStandBase);


   	
	}
}
