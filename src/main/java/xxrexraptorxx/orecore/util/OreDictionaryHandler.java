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
	OreDictionary.registerOre("crystalCertusQuartz", ModItems.quartz);

	
	
		
		//blocks
	
	OreDictionary.registerOre("oreMixed", ModBlocks.mixedOre);
	
	OreDictionary.registerOre("oreCompressedCoal", ModBlocks.compressedCoalOre);
	OreDictionary.registerOre("oreCompressedDiamond", ModBlocks.compressedDiamondOre);
	OreDictionary.registerOre("oreCompressedEmerald", ModBlocks.compressedEmeraldOre);
	OreDictionary.registerOre("oreCompressedGold", ModBlocks.compressedGoldOre);
	OreDictionary.registerOre("oreCompressedIron", ModBlocks.compressedIronOre);
	OreDictionary.registerOre("oreCompressedLapis", ModBlocks.compressedLapisOre);
	OreDictionary.registerOre("oreCompressedRedstone", ModBlocks.compressedRedstoneOre);
	
	OreDictionary.registerOre("oreCompressedAluminium", ModBlocks.compressedAluminiumOre);
	OreDictionary.registerOre("oreCompressedAmethyst", ModBlocks.compressedAmethystOre);
	OreDictionary.registerOre("oreCompressedCopper", ModBlocks.compressedCopperOre);
	OreDictionary.registerOre("oreCompressedIridium", ModBlocks.compressedIridiumOre);
	OreDictionary.registerOre("oreCompressedLead", ModBlocks.compressedLeadOre);
	OreDictionary.registerOre("oreCompressedPlatinum", ModBlocks.compressedPlatinumOre);
	OreDictionary.registerOre("oreCompressedQuartz", ModBlocks.compressedQuartzOre);
	OreDictionary.registerOre("oreCompressedRuby", ModBlocks.compressedRubyOre);
	OreDictionary.registerOre("oreCompressedSapphire", ModBlocks.compressedSapphireOre);
	OreDictionary.registerOre("oreCompressedSilver", ModBlocks.compressedSilverOre);
	OreDictionary.registerOre("oreCompressedTin", ModBlocks.compressedTinOre);
	OreDictionary.registerOre("oreCompressedUranium", ModBlocks.compressedUraniumOre);

	OreDictionary.registerOre("oreNetherCoal", ModBlocks.netherCoalOre);
	OreDictionary.registerOre("oreNetherDiamond", ModBlocks.netherDiamondOre);
	OreDictionary.registerOre("oreNetherEmerald", ModBlocks.netherEmeraldOre);
	OreDictionary.registerOre("oreNetherGold", ModBlocks.netherGoldOre);
	OreDictionary.registerOre("oreNetherIron", ModBlocks.netherIronOre);
	OreDictionary.registerOre("oreNetherLapis", ModBlocks.netherLapisOre);
	OreDictionary.registerOre("oreNetherRedstone", ModBlocks.netherRedstoneOre);
	OreDictionary.registerOre("oreNetherGlowstone", ModBlocks.netherGlowstoneOre);
	
	OreDictionary.registerOre("oreEndCoal", ModBlocks.endCoalOre);
	OreDictionary.registerOre("oreEndDiamond", ModBlocks.endDiamondOre);
	OreDictionary.registerOre("oreEndEmerald", ModBlocks.endEmeraldOre);
	OreDictionary.registerOre("oreEndGold", ModBlocks.endGoldOre);
	OreDictionary.registerOre("oreEndIron", ModBlocks.endIronOre);
	OreDictionary.registerOre("oreEndLapis", ModBlocks.endLapisOre);
	OreDictionary.registerOre("oreEndRedstone", ModBlocks.endRedstoneOre);
	OreDictionary.registerOre("oreEndGlowstone", ModBlocks.endGlowstoneOre);
	
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
   	
   	OreDictionary.registerOre("oreNetherAluminium", ModBlocks.netherAluminiumOre);
   	OreDictionary.registerOre("oreNetherAmethyst", ModBlocks.netherAmethystOre);
   	OreDictionary.registerOre("oreNetherCopper", ModBlocks.netherCopperOre);
   	OreDictionary.registerOre("oreNetherIridium", ModBlocks.netherIridiumOre);
   	OreDictionary.registerOre("oreNetherLead", ModBlocks.netherLeadOre);
   	OreDictionary.registerOre("oreNetherPlatinum", ModBlocks.netherPlatinOre);
   	OreDictionary.registerOre("oreNetherRuby", ModBlocks.netherRubyOre);
   	OreDictionary.registerOre("oreNetherSapphire", ModBlocks.netherSapphireOre);
   	OreDictionary.registerOre("oreNetherSilver", ModBlocks.netherSilverOre);
   	OreDictionary.registerOre("oreNetherTin", ModBlocks.netherTinOre);
   	OreDictionary.registerOre("oreNetherUranium", ModBlocks.netherUraniumOre);
   	
   	OreDictionary.registerOre("oreEndAluminium", ModBlocks.endAluminiumOre);
   	OreDictionary.registerOre("oreEndAmethyst", ModBlocks.endAmethystOre);
   	OreDictionary.registerOre("oreEndCopper", ModBlocks.endCopperOre);
   	OreDictionary.registerOre("oreEndIridium", ModBlocks.endIridiumOre);
   	OreDictionary.registerOre("oreEndLead", ModBlocks.endLeadOre);
   	OreDictionary.registerOre("oreEndPlatinum", ModBlocks.endPlatinOre);
   	OreDictionary.registerOre("oreEndRuby", ModBlocks.endRubyOre);
   	OreDictionary.registerOre("oreEndSapphire", ModBlocks.endSapphireOre);
   	OreDictionary.registerOre("oreEndSilver", ModBlocks.endSilverOre);
   	OreDictionary.registerOre("oreEndTin", ModBlocks.endTinOre);
   	OreDictionary.registerOre("oreEndUranium", ModBlocks.endUraniumOre);
   	
   	OreDictionary.registerOre("oreAluminium", ModBlocks.aluminiumOre);
   	OreDictionary.registerOre("oreAmethyst", ModBlocks.amethystOre);
   	OreDictionary.registerOre("oreCopper", ModBlocks.copperOre);
   	OreDictionary.registerOre("oreIridium", ModBlocks.iridiumOre);
   	OreDictionary.registerOre("oreLead", ModBlocks.leadOre);
   	OreDictionary.registerOre("orePlatinum", ModBlocks.platinumOre);
   	OreDictionary.registerOre("oreRuby", ModBlocks.rubyOre);
   	OreDictionary.registerOre("oreSapphire", ModBlocks.sapphireOre);
   	OreDictionary.registerOre("oreSilver", ModBlocks.silverOre);
   	OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
   	OreDictionary.registerOre("oreUranium", ModBlocks.uraniumOre);
   	OreDictionary.registerOre("oreCertusQuartz", ModBlocks.quartzOre);
   	
   	OreDictionary.registerOre("blockStandFossil", ModBlocks.fossilStandBase);


   	
	}
}
