package xxrexraptorxx.orecore.main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xxrexraptorxx.orecore.blocks.*;
import xxrexraptorxx.orecore.util.NameUtils;

@Mod.EventBusSubscriber
public class ModBlocks {

	
	

	public static Block mixedOre;
	
	public static Block compressedCoalOre;
	public static Block compressedIronOre;
	public static Block compressedGoldOre;
	public static Block compressedRedstoneOre;
	public static Block compressedLapisOre;
	public static Block compressedEmeraldOre;
	public static Block compressedDiamondOre;
	
	public static Block netherCoalOre;
	public static Block netherIronOre;
	public static Block netherGoldOre;
	public static Block netherRedstoneOre;
	public static Block netherLapisOre;
	public static Block netherEmeraldOre;
	public static Block netherDiamondOre;
	public static Block netherGlowstoneOre;
	
	public static Block endCoalOre;
	public static Block endIronOre;
	public static Block endGoldOre;
	public static Block endRedstoneOre;
	public static Block endLapisOre;
	public static Block endEmeraldOre;
	public static Block endDiamondOre;
	public static Block endGlowstoneOre;
	
	public static Block boneOre;
	public static Block fossilOre;
	public static Block fossilOre1;
	public static Block fossilOre2;
	public static Block fossilOre3;
	public static Block fossilOre4;
	public static Block fossilOre5;
	public static Block fossilOre6;
	
	public static Block netherBoneOre;
	public static Block netherFossilOre;
	public static Block netherFossilOre1;
	public static Block netherFossilOre2;
	public static Block netherFossilOre3;
	public static Block netherFossilOre4;
	public static Block netherFossilOre5;
	public static Block netherFossilOre6;
	
	public static Block endBoneOre;
	public static Block endFossilOre;
	public static Block endFossilOre1;
	public static Block endFossilOre2;
	public static Block endFossilOre3;
	public static Block endFossilOre4;
	public static Block endFossilOre5;
	public static Block endFossilOre6;
	
	public static Block xpOre;
	public static Block netherXpOre;
	public static Block endXpOre;
	
	public static Block basaltBlock;
	public static Block basaltOre;
	public static Block marmorBlock;
	public static Block marmorOre;
	public static Block slateBlock;
	public static Block slateOre;
	public static Block oilSlateOre;
	
	public static Block asheBlock;
	public static Block lavaCrystalBlock;
	public static Block lavaCrystalOre;
	public static Block magmarackBlock;
	public static Block loamBlock;
	public static Block loamBrickBlock;
	public static Block meteorBlock;
	
	public static Block goldGravelOre;
	public static Block ironGravelOre;
	public static Block netherEyeBlock;
	public static Block netherEyeBlock2;
	public static Block endEyeBlock;
	public static Block netherMobBlock;
	public static Block endMobBlock;
	
	public static Block netherAluminiumOre;
	public static Block netherAmethystOre;
	public static Block netherCopperOre;
	public static Block netherIridiumOre;
	public static Block netherLeadOre;
	public static Block netherPlatinOre;
	public static Block netherRubyOre;
	public static Block netherSapphireOre;
	public static Block netherSilverOre;
	public static Block netherTinOre;
	public static Block netherUraniumOre;
	
	public static Block endAluminiumOre;
	public static Block endAmethystOre;
	public static Block endCopperOre;
	public static Block endIridiumOre;
	public static Block endLeadOre;
	public static Block endPlatinOre;
	public static Block endRubyOre;
	public static Block endSapphireOre;
	public static Block endSilverOre;
	public static Block endTinOre;
	public static Block endUraniumOre;
	
	public static Block fossilStandBase;
	public static Block fossilStandBone;
	public static Block fossilStand0;
	public static Block fossilStand1;
	public static Block fossilStand2;
	public static Block fossilStand3;
	public static Block fossilStand4;
	public static Block fossilStand5;
	public static Block fossilStand6;


	
	
	
	
		public void init() {
		
			

			mixedOre = new BlockMixedOre();
			
			compressedCoalOre = new BlockCompressedCoalOre();
			compressedIronOre = new BlockCompressedIronOre();
			compressedGoldOre = new BlockCompressedGoldOre();
			compressedRedstoneOre = new BlockCompressedRedstoneOre();
			compressedLapisOre = new BlockCompressedLapisOre();
			compressedEmeraldOre = new BlockCompressedEmeraldOre();
			compressedDiamondOre = new BlockCompressedDiamondOre();
			
			netherCoalOre = new BlockNetherCoalOre();
			netherIronOre = new BlockNetherIronOre();
			netherGoldOre = new BlockNetherGoldOre();
			netherRedstoneOre = new BlockNetherRedstoneOre();
			netherLapisOre = new BlockNetherLapisOre();
			netherEmeraldOre = new BlockNetherEmeraldOre();
			netherDiamondOre = new BlockNetherDiamondOre();
			netherGlowstoneOre = new BlockNetherGlowstoneOre();
			
			endCoalOre = new BlockEndCoalOre();
			endIronOre = new BlockEndIronOre();
			endGoldOre = new BlockEndGoldOre();
			endRedstoneOre = new BlockEndRedstoneOre();
			endLapisOre = new BlockEndLapisOre();
			endEmeraldOre = new BlockEndEmeraldOre();
			endDiamondOre = new BlockEndDiamondOre();
			endGlowstoneOre = new BlockEndGlowstoneOre();
			
			boneOre = new BlockBoneOre();
			fossilOre = new BlockFossilOre();
			fossilOre1 = new BlockFossilOre1();
			fossilOre2 = new BlockFossilOre2();
			fossilOre3 = new BlockFossilOre3();
			fossilOre4 = new BlockFossilOre4();
			fossilOre5 = new BlockFossilOre5();
			fossilOre6 = new BlockFossilOre6();
			
			netherBoneOre = new BlockNetherBoneOre();
			netherFossilOre = new BlockNetherFossilOre();
			netherFossilOre1 = new BlockNetherFossilOre1();
			netherFossilOre2 = new BlockNetherFossilOre2();
			netherFossilOre3 = new BlockNetherFossilOre3();
			netherFossilOre4 = new BlockNetherFossilOre4();
			netherFossilOre5 = new BlockNetherFossilOre5();
			netherFossilOre6 = new BlockNetherFossilOre6();
			
			endBoneOre = new BlockEndBoneOre();
			endFossilOre = new BlockEndFossilOre();
			endFossilOre1 = new BlockEndFossilOre1();
			endFossilOre2 = new BlockEndFossilOre2();
			endFossilOre3 = new BlockEndFossilOre3();
			endFossilOre4 = new BlockEndFossilOre4();
			endFossilOre5 = new BlockEndFossilOre5();
			endFossilOre6 = new BlockEndFossilOre6();
			
			xpOre = new BlockXpOre();
			netherXpOre = new BlockNetherXpOre();
			endXpOre = new BlockEndXpOre();
			
			basaltBlock = new BlockBasalt();
			basaltOre = new BlockBasaltOre();
			marmorBlock = new BlockMarmor();
			marmorOre = new BlockMarmorOre();
			slateBlock = new BlockSlate();
			slateOre = new BlockSlateOre();
			oilSlateOre = new BlockOilSlateOre();
			
			asheBlock = new BlockAshe();
			lavaCrystalBlock = new BlockLavaCrystal();
			lavaCrystalOre = new BlockLavaCrystalOre();
			magmarackBlock = new BlockMagmarack();
			loamBlock = new BlockLoam();
			loamBrickBlock = new BlockLoamBrick();
			meteorBlock = new BlockMeteor();
			
			goldGravelOre = new BlockGoldGravelOre();
			ironGravelOre = new BlockIronGravelOre();
			netherEyeBlock = new BlockNetherEye();
			netherEyeBlock2 = new BlockNetherEye2();
			endEyeBlock = new BlockEndEye();
			netherMobBlock = new BlockNetherMob();
			endMobBlock = new BlockEndMob();
			
			netherAluminiumOre = new BlockNetherAluminiumOre();
			netherAmethystOre = new BlockNetherAmethystOre();
			netherCopperOre = new BlockNetherCopperOre();
			netherIridiumOre = new BlockNetherIridiumOre();
			netherLeadOre = new BlockNetherLeadOre();
			netherPlatinOre = new BlockNetherPlatinOre();
			netherRubyOre = new BlockNetherRubyOre();
			netherSapphireOre = new BlockNetherSapphireOre();
			netherSilverOre = new BlockNetherSilverOre();
			netherTinOre = new BlockNetherTinOre();
			netherUraniumOre = new BlockNetherUraniumOre();
			
			endAluminiumOre = new BlockEndAluminiumOre();
			endAmethystOre = new BlockEndAmethystOre();
			endCopperOre = new BlockEndCopperOre();
			endIridiumOre = new BlockEndIridiumOre();
			endLeadOre = new BlockEndLeadOre();
			endPlatinOre = new BlockEndPlatinOre();
			endRubyOre = new BlockEndRubyOre();
			endSapphireOre = new BlockEndSapphireOre();
			endSilverOre = new BlockEndSilverOre();
			endTinOre = new BlockEndTinOre();
			endUraniumOre = new BlockEndUraniumOre();
			
			fossilStandBase = new BlockFossilStandBase();
			fossilStandBone = new BlockFossilStandBone();
			fossilStand0 = new BlockFossilStand0();
			fossilStand1 = new BlockFossilStand1();
			fossilStand2 = new BlockFossilStand2();
			fossilStand3 = new BlockFossilStand3();
			fossilStand4 = new BlockFossilStand4();
			fossilStand5 = new BlockFossilStand5();
			fossilStand6 = new BlockFossilStand6();

			
			
			
			
			
			

			NameUtils.setNames(mixedOre, "mixed_ore");
			
			NameUtils.setNames(compressedCoalOre, "compressed_coal_ore");
			NameUtils.setNames(compressedDiamondOre, "compressed_diamond_ore");
			NameUtils.setNames(compressedEmeraldOre, "compressed_emerald_ore");
			NameUtils.setNames(compressedGoldOre, "compressed_gold_ore");
			NameUtils.setNames(compressedIronOre, "compressed_iron_ore");
			NameUtils.setNames(compressedLapisOre, "compressed_lapis_ore");
			NameUtils.setNames(compressedRedstoneOre, "compressed_redstone_ore");
			
			NameUtils.setNames(netherCoalOre, "nether_coal_ore");
			NameUtils.setNames(netherDiamondOre, "nether_diamond_ore");
			NameUtils.setNames(netherEmeraldOre, "nether_emerald_ore");
			NameUtils.setNames(netherGoldOre, "nether_gold_ore");
			NameUtils.setNames(netherIronOre, "nether_iron_ore");
			NameUtils.setNames(netherLapisOre, "nether_lapis_ore");
			NameUtils.setNames(netherRedstoneOre, "nether_redstone_ore");
			NameUtils.setNames(netherGlowstoneOre, "nether_glowstone_ore");
			
			NameUtils.setNames(endCoalOre, "end_coal_ore");
			NameUtils.setNames(endDiamondOre, "end_diamond_ore");
			NameUtils.setNames(endEmeraldOre, "end_emerald_ore");
			NameUtils.setNames(endGoldOre, "end_gold_ore");
			NameUtils.setNames(endIronOre, "end_iron_ore");
			NameUtils.setNames(endLapisOre, "end_lapis_ore");
			NameUtils.setNames(endRedstoneOre, "end_redstone_ore");
			NameUtils.setNames(endGlowstoneOre, "end_glowstone_ore");
			
			NameUtils.setNames(boneOre, "bone_ore");
			NameUtils.setNames(fossilOre, "fossil_ore");
			NameUtils.setNames(fossilOre1, "fossil_ore1");
			NameUtils.setNames(fossilOre2, "fossil_ore2");
			NameUtils.setNames(fossilOre3, "fossil_ore3");
			NameUtils.setNames(fossilOre4, "fossil_ore4");
			NameUtils.setNames(fossilOre5, "fossil_ore5");
			NameUtils.setNames(fossilOre6, "fossil_ore6");

			NameUtils.setNames(netherBoneOre, "nether_bone_ore");
			NameUtils.setNames(netherFossilOre, "nether_fossil_ore");
			NameUtils.setNames(netherFossilOre1, "nether_fossil_ore1");
			NameUtils.setNames(netherFossilOre2, "nether_fossil_ore2");
			NameUtils.setNames(netherFossilOre3, "nether_fossil_ore3");
			NameUtils.setNames(netherFossilOre4, "nether_fossil_ore4");
			NameUtils.setNames(netherFossilOre5, "nether_fossil_ore5");
			NameUtils.setNames(netherFossilOre6, "nether_fossil_ore6");
			
			NameUtils.setNames(endBoneOre, "end_bone_ore");
			NameUtils.setNames(endFossilOre, "end_fossil_ore");
			NameUtils.setNames(endFossilOre1, "end_fossil_ore1");
			NameUtils.setNames(endFossilOre2, "end_fossil_ore2");
			NameUtils.setNames(endFossilOre3, "end_fossil_ore3");
			NameUtils.setNames(endFossilOre4, "end_fossil_ore4");
			NameUtils.setNames(endFossilOre5, "end_fossil_ore5");
			NameUtils.setNames(endFossilOre6, "end_fossil_ore6");
			
			NameUtils.setNames(xpOre, "xp_ore");
			NameUtils.setNames(netherXpOre, "nether_xp_ore");
			NameUtils.setNames(endXpOre, "end_xp_ore");
			
			NameUtils.setNames(basaltBlock, "basalt_block");
			NameUtils.setNames(basaltOre, "basalt_ore");
			NameUtils.setNames(marmorBlock, "marmor_block");
			NameUtils.setNames(marmorOre, "marmor_ore");
			NameUtils.setNames(slateBlock, "slate_block");
			NameUtils.setNames(slateOre, "slate_ore");
			NameUtils.setNames(oilSlateOre, "oil_slate_ore");
			
			NameUtils.setNames(asheBlock, "ashe_block");
			NameUtils.setNames(lavaCrystalBlock, "lava_crystal_block");
			NameUtils.setNames(lavaCrystalOre, "lava_crystal_ore");
			NameUtils.setNames(magmarackBlock, "magmarack_block");
			NameUtils.setNames(loamBlock, "loam_block");
			NameUtils.setNames(loamBrickBlock, "loam_brick_block");
			NameUtils.setNames(meteorBlock, "meteor_block");
			
			NameUtils.setNames(goldGravelOre, "gold_gravel_ore");
			NameUtils.setNames(ironGravelOre, "iron_gravel_ore");
			NameUtils.setNames(netherEyeBlock, "nether_eye_block");
			NameUtils.setNames(netherEyeBlock2, "nether_eye_block2");
			NameUtils.setNames(netherMobBlock, "nether_mob_block");
			NameUtils.setNames(endEyeBlock, "end_eye_block");
			NameUtils.setNames(endMobBlock, "end_mob_block");
			
			NameUtils.setNames(netherAluminiumOre, "nether_aluminium_ore");
			NameUtils.setNames(netherAmethystOre, "nether_amethyst_ore");
			NameUtils.setNames(netherCopperOre, "nether_copper_ore");
			NameUtils.setNames(netherIridiumOre, "nether_iridium_ore");
			NameUtils.setNames(netherLeadOre, "nether_lead_ore");
			NameUtils.setNames(netherPlatinOre, "nether_platin_ore");
			NameUtils.setNames(netherRubyOre, "nether_ruby_ore");
			NameUtils.setNames(netherSapphireOre, "nether_sapphire_ore");
			NameUtils.setNames(netherSilverOre, "nether_silver_ore");
			NameUtils.setNames(netherTinOre, "nether_tin_ore");
			NameUtils.setNames(netherUraniumOre, "nether_uranium_ore");

			NameUtils.setNames(endAluminiumOre, "end_aluminium_ore");
			NameUtils.setNames(endAmethystOre, "end_amethyst_ore");
			NameUtils.setNames(endCopperOre, "end_copper_ore");
			NameUtils.setNames(endIridiumOre, "end_iridium_ore");
			NameUtils.setNames(endLeadOre, "end_lead_ore");
			NameUtils.setNames(endPlatinOre, "end_platin_ore");
			NameUtils.setNames(endRubyOre, "end_ruby_ore");
			NameUtils.setNames(endSapphireOre, "end_sapphire_ore");
			NameUtils.setNames(endSilverOre, "end_silver_ore");
			NameUtils.setNames(endTinOre, "end_tin_ore");
			NameUtils.setNames(endUraniumOre, "end_uranium_ore");
			
			NameUtils.setNames(fossilStandBase, "fossil_stand_base");
			NameUtils.setNames(fossilStandBone, "fossil_stand_bone");
			NameUtils.setNames(fossilStand0, "fossil_stand0");
			NameUtils.setNames(fossilStand1, "fossil_stand1");
			NameUtils.setNames(fossilStand2, "fossil_stand2");
			NameUtils.setNames(fossilStand3, "fossil_stand3");
			NameUtils.setNames(fossilStand4, "fossil_stand4");
			NameUtils.setNames(fossilStand5, "fossil_stand5");
			NameUtils.setNames(fossilStand6, "fossil_stand6");
			
		}
		
		
		
		
		public void register() {
			
			

			registerBlock(mixedOre);
			
			registerBlock(compressedCoalOre);
			registerBlock(compressedDiamondOre);
			registerBlock(compressedEmeraldOre);
			registerBlock(compressedGoldOre);
			registerBlock(compressedIronOre);
			registerBlock(compressedLapisOre);
			registerBlock(compressedRedstoneOre);
			
			registerBlock(netherCoalOre);
			registerBlock(netherDiamondOre);
			registerBlock(netherEmeraldOre);
			registerBlock(netherGoldOre);
			registerBlock(netherIronOre);
			registerBlock(netherLapisOre);
			registerBlock(netherRedstoneOre);
			registerBlock(netherGlowstoneOre);
			registerBlock(lavaCrystalOre);
			registerBlock(magmarackBlock);
			
			registerBlock(endCoalOre);
			registerBlock(endDiamondOre);
			registerBlock(endEmeraldOre);
			registerBlock(endGoldOre);
			registerBlock(endIronOre);
			registerBlock(endLapisOre);
			registerBlock(endRedstoneOre);
			registerBlock(endGlowstoneOre);
			
			registerBlock(boneOre);
			registerBlock(fossilOre);
			registerBlock(fossilOre1);
			registerBlock(fossilOre2);
			registerBlock(fossilOre3);
			registerBlock(fossilOre4);
			registerBlock(fossilOre5);
			registerBlock(fossilOre6);

			registerBlock(netherBoneOre);
			registerBlock(netherFossilOre);
			registerBlock(netherFossilOre1);
			registerBlock(netherFossilOre2);
			registerBlock(netherFossilOre3);
			registerBlock(netherFossilOre4);
			registerBlock(netherFossilOre5);
			registerBlock(netherFossilOre6);
			
			registerBlock(endBoneOre);
			registerBlock(endFossilOre);
			registerBlock(endFossilOre1);
			registerBlock(endFossilOre2);
			registerBlock(endFossilOre3);
			registerBlock(endFossilOre4);
			registerBlock(endFossilOre5);
			registerBlock(endFossilOre6);
			
			registerBlock(xpOre);
			registerBlock(netherXpOre);
			registerBlock(endXpOre);
			
			registerBlock(basaltBlock);
			registerBlock(basaltOre);
			registerBlock(marmorBlock);
			registerBlock(marmorOre);
			registerBlock(slateBlock);
			registerBlock(slateOre);
			registerBlock(oilSlateOre);
			
			registerBlock(asheBlock);
			registerBlock(meteorBlock);
			registerBlock(lavaCrystalBlock);
			registerBlock(loamBlock);
			registerBlock(loamBrickBlock);
			
			registerBlock(goldGravelOre);
			registerBlock(ironGravelOre);
			registerBlock(netherEyeBlock);
			registerBlock(netherEyeBlock2);
			registerBlock(netherMobBlock);
			registerBlock(endEyeBlock);
			registerBlock(endMobBlock);
			
			registerBlock(netherAluminiumOre);
			registerBlock(netherAmethystOre);
			registerBlock(netherCopperOre);
			registerBlock(netherIridiumOre);
			registerBlock(netherLeadOre);
			registerBlock(netherPlatinOre);
			registerBlock(netherRubyOre);
			registerBlock(netherSapphireOre);
			registerBlock(netherSilverOre);
			registerBlock(netherTinOre);
			registerBlock(netherUraniumOre);
			
			registerBlock(endAluminiumOre);
			registerBlock(endAmethystOre);
			registerBlock(endCopperOre);
			registerBlock(endIridiumOre);
			registerBlock(endLeadOre);
			registerBlock(endPlatinOre);
			registerBlock(endRubyOre);
			registerBlock(endSapphireOre);
			registerBlock(endSilverOre);
			registerBlock(endTinOre);
			registerBlock(endUraniumOre);
			
			registerBlock(fossilStandBase);
			registerBlock(fossilStandBone);
			registerBlock(fossilStand0);
			registerBlock(fossilStand1);
			registerBlock(fossilStand2);
			registerBlock(fossilStand3);
			registerBlock(fossilStand4);
			registerBlock(fossilStand5);
			registerBlock(fossilStand6);
			
			
		}
		
		
		private static void registerBlock(Block block) {
			ForgeRegistries.BLOCKS.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setRegistryName(block.getRegistryName());
			ForgeRegistries.ITEMS.register(itemblock);
		}
		
}
