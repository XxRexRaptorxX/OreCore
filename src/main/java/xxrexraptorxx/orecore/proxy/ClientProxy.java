package xxrexraptorxx.orecore.proxy;
 
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.worldGen.WorldGenOre;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	
    	/** Register **/
    	
    	// Items //
    	
    	registerModel(ModItems.fossil, 0, new ModelResourceLocation(ModItems.fossil.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil1, 0, new ModelResourceLocation(ModItems.fossil1.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil2, 0, new ModelResourceLocation(ModItems.fossil2.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil3, 0, new ModelResourceLocation(ModItems.fossil3.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil4, 0, new ModelResourceLocation(ModItems.fossil4.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil5, 0, new ModelResourceLocation(ModItems.fossil5.getRegistryName(), "inventory"));
    	registerModel(ModItems.fossil6, 0, new ModelResourceLocation(ModItems.fossil6.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.oilPaste, 0, new ModelResourceLocation(ModItems.oilPaste.getRegistryName(), "inventory"));
    	registerModel(ModItems.oilBucket, 0, new ModelResourceLocation(ModItems.oilBucket.getRegistryName(), "inventory"));

    	registerModel(ModItems.ashe, 0, new ModelResourceLocation(ModItems.ashe.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavaCrystal, 0, new ModelResourceLocation(ModItems.lavaCrystal.getRegistryName(), "inventory"));
    	registerModel(ModItems.loamBall, 0, new ModelResourceLocation(ModItems.loamBall.getRegistryName(), "inventory"));
    	registerModel(ModItems.loamBrick, 0, new ModelResourceLocation(ModItems.loamBrick.getRegistryName(), "inventory"));
    	registerModel(ModItems.meteor, 0, new ModelResourceLocation(ModItems.meteor.getRegistryName(), "inventory"));
    	registerModel(ModItems.stone, 0, new ModelResourceLocation(ModItems.stone.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.coalDust, 0, new ModelResourceLocation(ModItems.coalDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironDust, 0, new ModelResourceLocation(ModItems.ironDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldDust, 0, new ModelResourceLocation(ModItems.goldDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.lapisDust, 0, new ModelResourceLocation(ModItems.lapisDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldDust, 0, new ModelResourceLocation(ModItems.emeraldDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondDust, 0, new ModelResourceLocation(ModItems.diamondDust.getRegistryName(), "inventory"));
    	
     	registerModel(ModItems.tinyCoalDust, 0, new ModelResourceLocation(ModItems.tinyCoalDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinyIronDust, 0, new ModelResourceLocation(ModItems.tinyIronDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinyGoldDust, 0, new ModelResourceLocation(ModItems.tinyGoldDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinyLapisDust, 0, new ModelResourceLocation(ModItems.tinyLapisDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinyEmeraldDust, 0, new ModelResourceLocation(ModItems.tinyEmeraldDust.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinyDiamondDust, 0, new ModelResourceLocation(ModItems.tinyDiamondDust.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.emeraldSword, 0, new ModelResourceLocation(ModItems.emeraldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldPickaxe, 0, new ModelResourceLocation(ModItems.emeraldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldAxe, 0, new ModelResourceLocation(ModItems.emeraldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldShovel, 0, new ModelResourceLocation(ModItems.emeraldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldHoe, 0, new ModelResourceLocation(ModItems.emeraldHoe.getRegistryName(), "inventory"));
    
    	registerModel(ModItems.lavacrystalSword, 0, new ModelResourceLocation(ModItems.lavacrystalSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalPickaxe, 0, new ModelResourceLocation(ModItems.lavacrystalPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalAxe, 0, new ModelResourceLocation(ModItems.lavacrystalAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalShovel, 0, new ModelResourceLocation(ModItems.lavacrystalShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalHoe, 0, new ModelResourceLocation(ModItems.lavacrystalHoe.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.boneHelmet, 0, new ModelResourceLocation(ModItems.boneHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneChestplate, 0, new ModelResourceLocation(ModItems.boneChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneLeggins, 0, new ModelResourceLocation(ModItems.boneLeggins.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneBoots, 0, new ModelResourceLocation(ModItems.boneBoots.getRegistryName(), "inventory"));
    	
       	registerModel(ModItems.emeraldHelmet, 0, new ModelResourceLocation(ModItems.emeraldHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldChestplate, 0, new ModelResourceLocation(ModItems.emeraldChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldLeggins, 0, new ModelResourceLocation(ModItems.emeraldLeggins.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldBoots, 0, new ModelResourceLocation(ModItems.emeraldBoots.getRegistryName(), "inventory"));
    	
       	registerModel(ModItems.lavacrystalHelmet, 0, new ModelResourceLocation(ModItems.lavacrystalHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalChestplate, 0, new ModelResourceLocation(ModItems.lavacrystalChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalLeggins, 0, new ModelResourceLocation(ModItems.lavacrystalLeggins.getRegistryName(), "inventory"));
    	registerModel(ModItems.lavacrystalBoots, 0, new ModelResourceLocation(ModItems.lavacrystalBoots.getRegistryName(), "inventory"));

    	registerModel(ModItems.aluminiumIngot, 0, new ModelResourceLocation(ModItems.aluminiumIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.amethyst, 0, new ModelResourceLocation(ModItems.amethyst.getRegistryName(), "inventory"));
    	registerModel(ModItems.copperIngot, 0, new ModelResourceLocation(ModItems.copperIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.iridium, 0, new ModelResourceLocation(ModItems.iridium.getRegistryName(), "inventory"));
    	registerModel(ModItems.leadIngot, 0, new ModelResourceLocation(ModItems.leadIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.platinumIngot, 0, new ModelResourceLocation(ModItems.platinumIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.ruby, 0, new ModelResourceLocation(ModItems.ruby.getRegistryName(), "inventory"));
    	registerModel(ModItems.sapphire, 0, new ModelResourceLocation(ModItems.sapphire.getRegistryName(), "inventory"));
    	registerModel(ModItems.silverIngot, 0, new ModelResourceLocation(ModItems.silverIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.tinIngot, 0, new ModelResourceLocation(ModItems.tinIngot.getRegistryName(), "inventory"));
    	registerModel(ModItems.uranium, 0, new ModelResourceLocation(ModItems.uranium.getRegistryName(), "inventory"));

    	
    	
    	
    	// Blocks //
    	
    
    	registerModel(ModBlocks.mixedOre, 0, new ModelResourceLocation(ModBlocks.mixedOre.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.compressedCoalOre, 0, new ModelResourceLocation(ModBlocks.compressedCoalOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedDiamondOre, 0, new ModelResourceLocation(ModBlocks.compressedDiamondOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedEmeraldOre, 0, new ModelResourceLocation(ModBlocks.compressedEmeraldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedGoldOre, 0, new ModelResourceLocation(ModBlocks.compressedGoldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedIronOre, 0, new ModelResourceLocation(ModBlocks.compressedIronOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedLapisOre, 0, new ModelResourceLocation(ModBlocks.compressedLapisOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.compressedRedstoneOre, 0, new ModelResourceLocation(ModBlocks.compressedRedstoneOre.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.netherCoalOre, 0, new ModelResourceLocation(ModBlocks.netherCoalOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherDiamondOre, 0, new ModelResourceLocation(ModBlocks.netherDiamondOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherEmeraldOre, 0, new ModelResourceLocation(ModBlocks.netherEmeraldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherGoldOre, 0, new ModelResourceLocation(ModBlocks.netherGoldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherIronOre, 0, new ModelResourceLocation(ModBlocks.netherIronOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherLapisOre, 0, new ModelResourceLocation(ModBlocks.netherLapisOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherRedstoneOre, 0, new ModelResourceLocation(ModBlocks.netherRedstoneOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherGlowstoneOre, 0, new ModelResourceLocation(ModBlocks.netherGlowstoneOre.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.endCoalOre, 0, new ModelResourceLocation(ModBlocks.endCoalOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endDiamondOre, 0, new ModelResourceLocation(ModBlocks.endDiamondOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endEmeraldOre, 0, new ModelResourceLocation(ModBlocks.endEmeraldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endGoldOre, 0, new ModelResourceLocation(ModBlocks.endGoldOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endIronOre, 0, new ModelResourceLocation(ModBlocks.endIronOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endLapisOre, 0, new ModelResourceLocation(ModBlocks.endLapisOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endRedstoneOre, 0, new ModelResourceLocation(ModBlocks.endRedstoneOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endGlowstoneOre, 0, new ModelResourceLocation(ModBlocks.endGlowstoneOre.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.boneOre, 0, new ModelResourceLocation(ModBlocks.boneOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre, 0, new ModelResourceLocation(ModBlocks.fossilOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre1, 0, new ModelResourceLocation(ModBlocks.fossilOre1.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre2, 0, new ModelResourceLocation(ModBlocks.fossilOre2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre3, 0, new ModelResourceLocation(ModBlocks.fossilOre3.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre4, 0, new ModelResourceLocation(ModBlocks.fossilOre4.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre5, 0, new ModelResourceLocation(ModBlocks.fossilOre5.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilOre6, 0, new ModelResourceLocation(ModBlocks.fossilOre6.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.netherBoneOre, 0, new ModelResourceLocation(ModBlocks.netherBoneOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre, 0, new ModelResourceLocation(ModBlocks.netherFossilOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre1, 0, new ModelResourceLocation(ModBlocks.netherFossilOre1.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre2, 0, new ModelResourceLocation(ModBlocks.netherFossilOre2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre3, 0, new ModelResourceLocation(ModBlocks.netherFossilOre3.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre4, 0, new ModelResourceLocation(ModBlocks.netherFossilOre4.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre5, 0, new ModelResourceLocation(ModBlocks.netherFossilOre5.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherFossilOre6, 0, new ModelResourceLocation(ModBlocks.netherFossilOre6.getRegistryName(), "inventory"));

    	registerModel(ModBlocks.endBoneOre, 0, new ModelResourceLocation(ModBlocks.endBoneOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre, 0, new ModelResourceLocation(ModBlocks.endFossilOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre1, 0, new ModelResourceLocation(ModBlocks.endFossilOre1.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre2, 0, new ModelResourceLocation(ModBlocks.endFossilOre2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre3, 0, new ModelResourceLocation(ModBlocks.endFossilOre3.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre4, 0, new ModelResourceLocation(ModBlocks.endFossilOre4.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre5, 0, new ModelResourceLocation(ModBlocks.endFossilOre5.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endFossilOre6, 0, new ModelResourceLocation(ModBlocks.endFossilOre6.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.xpOre, 0, new ModelResourceLocation(ModBlocks.xpOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherXpOre, 0, new ModelResourceLocation(ModBlocks.netherXpOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endXpOre, 0, new ModelResourceLocation(ModBlocks.endXpOre.getRegistryName(), "inventory"));

    	registerModel(ModBlocks.basaltBlock, 0, new ModelResourceLocation(ModBlocks.basaltBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.basaltOre, 0, new ModelResourceLocation(ModBlocks.basaltOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.marmorBlock, 0, new ModelResourceLocation(ModBlocks.marmorBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.marmorOre, 0, new ModelResourceLocation(ModBlocks.marmorOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.slateBlock, 0, new ModelResourceLocation(ModBlocks.slateBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.slateOre, 0, new ModelResourceLocation(ModBlocks.slateOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.oilSlateOre, 0, new ModelResourceLocation(ModBlocks.oilSlateOre.getRegistryName(), "inventory"));

    	registerModel(ModBlocks.asheBlock, 0, new ModelResourceLocation(ModBlocks.asheBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.lavaCrystalBlock, 0, new ModelResourceLocation(ModBlocks.lavaCrystalBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.lavaCrystalOre, 0, new ModelResourceLocation(ModBlocks.lavaCrystalOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.loamBlock, 0, new ModelResourceLocation(ModBlocks.loamBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.loamBrickBlock, 0, new ModelResourceLocation(ModBlocks.loamBrickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.meteorBlock, 0, new ModelResourceLocation(ModBlocks.meteorBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.magmarackBlock, 0, new ModelResourceLocation(ModBlocks.magmarackBlock.getRegistryName(), "inventory"));

    	registerModel(ModBlocks.goldGravelOre, 0, new ModelResourceLocation(ModBlocks.goldGravelOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.ironGravelOre, 0, new ModelResourceLocation(ModBlocks.ironGravelOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherEyeBlock, 0, new ModelResourceLocation(ModBlocks.netherEyeBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherEyeBlock2, 0, new ModelResourceLocation(ModBlocks.netherEyeBlock2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endEyeBlock, 0, new ModelResourceLocation(ModBlocks.endEyeBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherMobBlock, 0, new ModelResourceLocation(ModBlocks.netherMobBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endMobBlock, 0, new ModelResourceLocation(ModBlocks.endMobBlock.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.netherAluminiumOre, 0, new ModelResourceLocation(ModBlocks.netherAluminiumOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherAmethystOre, 0, new ModelResourceLocation(ModBlocks.netherAmethystOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherCopperOre, 0, new ModelResourceLocation(ModBlocks.netherCopperOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherIridiumOre, 0, new ModelResourceLocation(ModBlocks.netherIridiumOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherLeadOre, 0, new ModelResourceLocation(ModBlocks.netherLeadOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherPlatinOre, 0, new ModelResourceLocation(ModBlocks.netherPlatinOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherRubyOre, 0, new ModelResourceLocation(ModBlocks.netherRubyOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherSapphireOre, 0, new ModelResourceLocation(ModBlocks.netherSapphireOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherSilverOre, 0, new ModelResourceLocation(ModBlocks.netherSilverOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherTinOre, 0, new ModelResourceLocation(ModBlocks.netherTinOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.netherUraniumOre, 0, new ModelResourceLocation(ModBlocks.netherUraniumOre.getRegistryName(), "inventory"));
   
    	registerModel(ModBlocks.endAluminiumOre, 0, new ModelResourceLocation(ModBlocks.endAluminiumOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endAmethystOre, 0, new ModelResourceLocation(ModBlocks.endAmethystOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endCopperOre, 0, new ModelResourceLocation(ModBlocks.endCopperOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endIridiumOre, 0, new ModelResourceLocation(ModBlocks.endIridiumOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endLeadOre, 0, new ModelResourceLocation(ModBlocks.endLeadOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endPlatinOre, 0, new ModelResourceLocation(ModBlocks.endPlatinOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endRubyOre, 0, new ModelResourceLocation(ModBlocks.endRubyOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endSapphireOre, 0, new ModelResourceLocation(ModBlocks.endSapphireOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endSilverOre, 0, new ModelResourceLocation(ModBlocks.endSilverOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endTinOre, 0, new ModelResourceLocation(ModBlocks.endTinOre.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.endUraniumOre, 0, new ModelResourceLocation(ModBlocks.endUraniumOre.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.fossilStandBase, 0, new ModelResourceLocation(ModBlocks.fossilStandBase.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStandBone, 0, new ModelResourceLocation(ModBlocks.fossilStandBone.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand0, 0, new ModelResourceLocation(ModBlocks.fossilStand0.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand1, 0, new ModelResourceLocation(ModBlocks.fossilStand1.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand2, 0, new ModelResourceLocation(ModBlocks.fossilStand2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand3, 0, new ModelResourceLocation(ModBlocks.fossilStand3.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand4, 0, new ModelResourceLocation(ModBlocks.fossilStand4.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand5, 0, new ModelResourceLocation(ModBlocks.fossilStand5.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fossilStand6, 0, new ModelResourceLocation(ModBlocks.fossilStand6.getRegistryName(), "inventory"));

       	
    }
    
    
    
    public static void registerModel(Object obj, int meta, ModelResourceLocation loc) {
    	Item item = null;
    	if(obj instanceof Item) {
    		item = (Item) obj;
    	} else if(obj instanceof Block) {
    		item = Item.getItemFromBlock((Block)obj);
    	} else {
    		throw new IllegalArgumentException();
    	}	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
    	}
	}
   

  