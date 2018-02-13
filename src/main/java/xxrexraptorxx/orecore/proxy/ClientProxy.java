package xxrexraptorxx.orecore.proxy;
 
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	
    	/** Register **/
    	
    	// Items //
    	
    	registerModel(ModItems.fossil);
    	registerModel(ModItems.fossil1);
    	registerModel(ModItems.fossil2);
    	registerModel(ModItems.fossil3);
    	registerModel(ModItems.fossil4);
    	registerModel(ModItems.fossil5);
    	registerModel(ModItems.fossil6);
    	
    	registerModel(ModItems.oilPaste);
    	registerModel(ModItems.oilBucket);

    	registerModel(ModItems.ashe);
    	registerModel(ModItems.lavaCrystal);
    	registerModel(ModItems.loamBall);
    	registerModel(ModItems.loamBrick);
    	registerModel(ModItems.meteor);
    	registerModel(ModItems.stone);
    	
    	registerModel(ModItems.coalDust);
    	registerModel(ModItems.ironDust);
    	registerModel(ModItems.goldDust);
    	registerModel(ModItems.lapisDust);
    	registerModel(ModItems.emeraldDust);
    	registerModel(ModItems.diamondDust);
    	
     	registerModel(ModItems.tinyCoalDust);
    	registerModel(ModItems.tinyIronDust);
    	registerModel(ModItems.tinyGoldDust);
    	registerModel(ModItems.tinyLapisDust);
    	registerModel(ModItems.tinyEmeraldDust);
    	registerModel(ModItems.tinyDiamondDust);
    	
    	registerModel(ModItems.emeraldSword);
    	registerModel(ModItems.emeraldPickaxe);
    	registerModel(ModItems.emeraldAxe);
    	registerModel(ModItems.emeraldShovel);
    	registerModel(ModItems.emeraldHoe);
    
    	registerModel(ModItems.lavacrystalSword);
    	registerModel(ModItems.lavacrystalPickaxe);
    	registerModel(ModItems.lavacrystalAxe);
    	registerModel(ModItems.lavacrystalShovel);
    	registerModel(ModItems.lavacrystalHoe);
    	
    	registerModel(ModItems.boneHelmet);
    	registerModel(ModItems.boneChestplate);
    	registerModel(ModItems.boneLeggins);
    	registerModel(ModItems.boneBoots);
    	
       	registerModel(ModItems.emeraldHelmet);
    	registerModel(ModItems.emeraldChestplate);
    	registerModel(ModItems.emeraldLeggins);
    	registerModel(ModItems.emeraldBoots);
    	
       	registerModel(ModItems.lavacrystalHelmet);
    	registerModel(ModItems.lavacrystalChestplate);
    	registerModel(ModItems.lavacrystalLeggins);
    	registerModel(ModItems.lavacrystalBoots);

    	registerModel(ModItems.aluminiumIngot);
    	registerModel(ModItems.amethyst);
    	registerModel(ModItems.copperIngot);
    	registerModel(ModItems.iridium);
    	registerModel(ModItems.leadIngot);
    	registerModel(ModItems.platinumIngot);
    	registerModel(ModItems.ruby);
    	registerModel(ModItems.sapphire);
    	registerModel(ModItems.silverIngot);
    	registerModel(ModItems.tinIngot);
    	registerModel(ModItems.uranium);
    	registerModel(ModItems.quartz);

    	
    	
    	
    	// Blocks //
    	
    
    	registerModel(ModBlocks.mixedOre);
    	
    	registerModel(ModBlocks.compressedCoalOre);
    	registerModel(ModBlocks.compressedDiamondOre);
    	registerModel(ModBlocks.compressedEmeraldOre);
    	registerModel(ModBlocks.compressedGoldOre);
    	registerModel(ModBlocks.compressedIronOre);
    	registerModel(ModBlocks.compressedLapisOre);
    	registerModel(ModBlocks.compressedRedstoneOre);
    	
    	registerModel(ModBlocks.compressedAluminiumOre);
    	registerModel(ModBlocks.compressedAmethystOre);
    	registerModel(ModBlocks.compressedCopperOre);
    	registerModel(ModBlocks.compressedIridiumOre);
    	registerModel(ModBlocks.compressedLeadOre);
    	registerModel(ModBlocks.compressedPlatinumOre);
    	registerModel(ModBlocks.compressedQuartzOre);
    	registerModel(ModBlocks.compressedRubyOre);
    	registerModel(ModBlocks.compressedSapphireOre);
    	registerModel(ModBlocks.compressedSilverOre);
    	registerModel(ModBlocks.compressedTinOre);
    	registerModel(ModBlocks.compressedUraniumOre);
    	
    	registerModel(ModBlocks.netherCoalOre);
    	registerModel(ModBlocks.netherDiamondOre);
    	registerModel(ModBlocks.netherEmeraldOre);
    	registerModel(ModBlocks.netherGoldOre);
    	registerModel(ModBlocks.netherIronOre);
    	registerModel(ModBlocks.netherLapisOre);
    	registerModel(ModBlocks.netherRedstoneOre);
    	registerModel(ModBlocks.netherGlowstoneOre);
    	
    	registerModel(ModBlocks.endCoalOre);
    	registerModel(ModBlocks.endDiamondOre);
    	registerModel(ModBlocks.endEmeraldOre);
    	registerModel(ModBlocks.endGoldOre);
    	registerModel(ModBlocks.endIronOre);
    	registerModel(ModBlocks.endLapisOre);
    	registerModel(ModBlocks.endRedstoneOre);
    	registerModel(ModBlocks.endGlowstoneOre);
    	
    	registerModel(ModBlocks.boneOre);
    	registerModel(ModBlocks.fossilOre);
    	registerModel(ModBlocks.fossilOre1);
    	registerModel(ModBlocks.fossilOre2);
    	registerModel(ModBlocks.fossilOre3);
    	registerModel(ModBlocks.fossilOre4);
    	registerModel(ModBlocks.fossilOre5);
    	registerModel(ModBlocks.fossilOre6);
    	
    	registerModel(ModBlocks.netherBoneOre);
    	registerModel(ModBlocks.netherFossilOre);
    	registerModel(ModBlocks.netherFossilOre1);
    	registerModel(ModBlocks.netherFossilOre2);
    	registerModel(ModBlocks.netherFossilOre3);
    	registerModel(ModBlocks.netherFossilOre4);
    	registerModel(ModBlocks.netherFossilOre5);
    	registerModel(ModBlocks.netherFossilOre6);

    	registerModel(ModBlocks.endBoneOre);
    	registerModel(ModBlocks.endFossilOre);
    	registerModel(ModBlocks.endFossilOre1);
    	registerModel(ModBlocks.endFossilOre2);
    	registerModel(ModBlocks.endFossilOre3);
    	registerModel(ModBlocks.endFossilOre4);
    	registerModel(ModBlocks.endFossilOre5);
    	registerModel(ModBlocks.endFossilOre6);
    	
    	registerModel(ModBlocks.xpOre);
    	registerModel(ModBlocks.netherXpOre);
    	registerModel(ModBlocks.endXpOre);

    	registerModel(ModBlocks.basaltBlock);
    	registerModel(ModBlocks.basaltOre);
    	registerModel(ModBlocks.marmorBlock);
    	registerModel(ModBlocks.marmorOre);
    	registerModel(ModBlocks.slateBlock);
    	registerModel(ModBlocks.slateOre);
    	registerModel(ModBlocks.oilSlateOre);

    	registerModel(ModBlocks.asheBlock);
    	registerModel(ModBlocks.lavaCrystalBlock);
    	registerModel(ModBlocks.lavaCrystalOre);
    	registerModel(ModBlocks.loamBlock);
    	registerModel(ModBlocks.loamBrickBlock);
    	registerModel(ModBlocks.meteorBlock);
    	registerModel(ModBlocks.magmarackBlock);

    	registerModel(ModBlocks.goldGravelOre);
    	registerModel(ModBlocks.ironGravelOre);
    	registerModel(ModBlocks.netherEyeBlock);
    	registerModel(ModBlocks.netherEyeBlock2);
    	registerModel(ModBlocks.endEyeBlock);
    	registerModel(ModBlocks.netherMobBlock);
    	registerModel(ModBlocks.endMobBlock);
    	
    	registerModel(ModBlocks.netherAluminiumOre);
    	registerModel(ModBlocks.netherAmethystOre);
    	registerModel(ModBlocks.netherCopperOre);
    	registerModel(ModBlocks.netherIridiumOre);
    	registerModel(ModBlocks.netherLeadOre);
    	registerModel(ModBlocks.netherPlatinOre);
    	registerModel(ModBlocks.netherRubyOre);
    	registerModel(ModBlocks.netherSapphireOre);
    	registerModel(ModBlocks.netherSilverOre);
    	registerModel(ModBlocks.netherTinOre);
    	registerModel(ModBlocks.netherUraniumOre);
   
    	registerModel(ModBlocks.endAluminiumOre);
    	registerModel(ModBlocks.endAmethystOre);
    	registerModel(ModBlocks.endCopperOre);
    	registerModel(ModBlocks.endIridiumOre);
    	registerModel(ModBlocks.endLeadOre);
    	registerModel(ModBlocks.endPlatinOre);
    	registerModel(ModBlocks.endRubyOre);
    	registerModel(ModBlocks.endSapphireOre);
    	registerModel(ModBlocks.endSilverOre);
    	registerModel(ModBlocks.endTinOre);
    	registerModel(ModBlocks.endUraniumOre);
    	
    	registerModel(ModBlocks.aluminiumOre);
    	registerModel(ModBlocks.amethystOre);
    	registerModel(ModBlocks.copperOre);
    	registerModel(ModBlocks.iridiumOre);
    	registerModel(ModBlocks.leadOre);
    	registerModel(ModBlocks.platinumOre);
    	registerModel(ModBlocks.rubyOre);
    	registerModel(ModBlocks.sapphireOre);
    	registerModel(ModBlocks.silverOre);
    	registerModel(ModBlocks.tinOre);
    	registerModel(ModBlocks.uraniumOre);
    	registerModel(ModBlocks.quartzOre);
    	
    	registerModel(ModBlocks.fossilStandBase);
    	registerModel(ModBlocks.fossilStandBone);
    	registerModel(ModBlocks.fossilStand0);
    	registerModel(ModBlocks.fossilStand1);
    	registerModel(ModBlocks.fossilStand2);
    	registerModel(ModBlocks.fossilStand3);
    	registerModel(ModBlocks.fossilStand4);
    	registerModel(ModBlocks.fossilStand5);
    	registerModel(ModBlocks.fossilStand6);

       	
    }
    
    
    
	public static void registerModel(Object obj) {
		if(obj instanceof Item) {
			Item item = (Item) obj;
    			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else if (obj instanceof Block) {
			Item item = Item.getItemFromBlock((Block) obj);
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else {
			throw new IllegalArgumentException("Item or Block required!");	
		}
	}
}	
   

  