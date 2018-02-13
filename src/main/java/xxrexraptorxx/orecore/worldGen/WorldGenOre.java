package xxrexraptorxx.orecore.worldGen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.OreCore;

import com.google.common.base.Predicate;

public class WorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		
		case 1:
			GenerateEnd(world, random, chunkX *16, chunkZ * 16);
			break;
			
		case 0:
			GenerateOverworld(world, random, chunkX *16, chunkZ * 16);
			break;
			
		case -1:
			GenerateNether(world, random, chunkX *16, chunkZ * 16);
			break;	
		
		}
		
	}


	 private void addOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		//   System.out.println("Ore generated: " + posX + " " + posY + " " + posZ + " " + block);
		   }
		 }                                                    
		
	
	 private void addNetherOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		  }
		 }   
                                                   
	 
	 private void addEndOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		  }
		 }   
	
	
	 
	 
	 
	 

	
	
	private void GenerateOverworld(World world, Random random, int chunkX, int chunkZ) {
		if (OreCore.activateOverworldGeneration) {					        		//MaxVeinSize | rarity | MinY | MaxY | Terrain
		if (OreCore.activateClayVeins) {	
			addOre(Blocks.CLAY.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 5, 30, 128, BlockMatcher.forBlock(Blocks.STONE));	
		}	
		if (OreCore.activateSandVeins) {	
			addOre(Blocks.SAND.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 5, 30, 128, BlockMatcher.forBlock(Blocks.STONE));	
		}	
		if (OreCore.activateSandstoneVeins) {	
			addOre(Blocks.SANDSTONE.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 25, 5, 30, 128, BlockMatcher.forBlock(Blocks.STONE));	
		}	
		if (OreCore.activateCompressedOres) {
			addOre(ModBlocks.compressedCoalOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 128, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedIronOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 64, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedGoldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 32, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedLapisOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 22, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedRedstoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 16, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedDiamondOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 1, 16, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.compressedEmeraldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 1, 32, BlockMatcher.forBlock(Blocks.STONE));	
			
		if (OreCore.activateModdedOres) {
			if (OreCore.activateCopperOre) {
			addOre(ModBlocks.compressedCopperOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 70, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateAluminiumOre) {
			addOre(ModBlocks.compressedAluminiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 3, 64, BlockMatcher.forBlock(Blocks.STONE));
		   } if (OreCore.activateAmethystOre) {
			addOre(ModBlocks.compressedAmethystOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 3, 30, BlockMatcher.forBlock(Blocks.STONE));
		   } if (OreCore.activateIridiumOre) {	
			addOre(ModBlocks.compressedIridiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 10, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateLeadOre) {	
			addOre(ModBlocks.compressedLeadOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 3, 3, 25, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activatePlatinumOre) {	
			addOre(ModBlocks.compressedPlatinumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 40, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateRubyOre) {	
			addOre(ModBlocks.compressedRubyOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateSapphireOre) {	
			addOre(ModBlocks.compressedSapphireOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.STONE));
		   } if (OreCore.activateSilverOre) {	
			addOre(ModBlocks.compressedSilverOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 15, 35, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateTinOre) {	
			addOre(ModBlocks.compressedTinOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 3, 40, BlockMatcher.forBlock(Blocks.STONE));	
		   } if (OreCore.activateUraniumOre) {	
			addOre(ModBlocks.compressedUraniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 50, BlockMatcher.forBlock(Blocks.STONE));	
		  } }
		}
	    if	(OreCore.activateOreGenerationFix) {
			addOre(Blocks.COAL_ORE.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 18, 130, 250, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(Blocks.IRON_ORE.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 7, 66, 200, BlockMatcher.forBlock(Blocks.STONE));	
	    }
	    if (OreCore.activateFossils) {
			addOre(ModBlocks.boneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 20, 200, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.fossilOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.fossilOre1.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.fossilOre2.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.fossilOre3.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.fossilOre4.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.fossilOre5.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.fossilOre6.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 20, 64, BlockMatcher.forBlock(Blocks.STONE));
	    }
	    if (OreCore.activateXPOres) {
			addOre(ModBlocks.xpOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 2, 30, BlockMatcher.forBlock(Blocks.STONE));		
	    }
	    if (OreCore.activateBasalt) {
			addOre(ModBlocks.basaltOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 30, 5, 10, 128, BlockMatcher.forBlock(Blocks.STONE));	
	    }
	    if (OreCore.activateMarmor) {
			addOre(ModBlocks.marmorOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 30, 5, 10, 128, BlockMatcher.forBlock(Blocks.STONE));	
	    }
	    if (OreCore.activateSlate) {
			addOre(ModBlocks.slateOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 30, 5, 10, 128, BlockMatcher.forBlock(Blocks.STONE));	
			addOre(ModBlocks.oilSlateOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 20, 10, 128, BlockMatcher.forBlock(ModBlocks.slateOre));	
	    }
	    if (OreCore.activateLoam) {
    		addOre(ModBlocks.loamBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 15, 1, 30, 150, BlockMatcher.forBlock(Blocks.HARDENED_CLAY));	
	    }
	    if (OreCore.activateGravelOres) {
    		addOre(ModBlocks.goldGravelOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 10, 200, BlockMatcher.forBlock(Blocks.GRAVEL));	
    	//	addOre(ModBlocks.ironGravelOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 10, 200, BlockMatcher.forBlock(Blocks.GRAVEL));	
	    }
    		addOre(ModBlocks.meteorBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 230, 256, BlockMatcher.forBlock(Blocks.STONE));	
		}	
	}	
	
	
	
	
	private void GenerateNether(World world, Random random, int chunkX, int chunkZ) {
		if (OreCore.activateNetherGeneration) {					        			//MaxVeinSize | % | MinY | MaxY | Terrain
		if (OreCore.activateVanillaNetherOres) {
			addOre(ModBlocks.netherCoalOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 10, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherIronOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherGoldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 2, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherLapisOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 1, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherRedstoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 3, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherEmeraldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 35, BlockMatcher.forBlock(Blocks.NETHERRACK));				
			addOre(ModBlocks.netherDiamondOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 3, 35, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherGlowstoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 10, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));		
		}
		if (OreCore.activateLavaVeins) {
			addOre(Blocks.LAVA.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 17, 10, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		}
		if (OreCore.activateCoalBlockVeins) {
			addOre(Blocks.COAL_BLOCK.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 17, 8, 10, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		}	
	    if (OreCore.activateFossils) {
			addOre(ModBlocks.netherBoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 8, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherFossilOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));
			addOre(ModBlocks.netherFossilOre1.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));
			addOre(ModBlocks.netherFossilOre2.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherFossilOre3.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherFossilOre4.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherFossilOre5.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.netherFossilOre6.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 10, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));
	    }
	    if (OreCore.activateXPOres) {
			addOre(ModBlocks.netherXpOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 2, 30, BlockMatcher.forBlock(Blocks.NETHERRACK));		
	    }
	    if (OreCore.activateGravelOres) {
    		addOre(ModBlocks.goldGravelOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 10, 118, BlockMatcher.forBlock(Blocks.GRAVEL));	
    	//	addOre(ModBlocks.ironGravelOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 10, 118, BlockMatcher.forBlock(Blocks.GRAVEL));	
	    }	
	    if (OreCore.activateMonsterBlocks) {
    		addOre(ModBlocks.netherMobBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 1, 2, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
	    }	
	    if (OreCore.activateEyeBlocks) {
    		addOre(ModBlocks.netherEyeBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 5, 20, 100, BlockMatcher.forBlock(Blocks.NETHERRACK));	
	    }	
	    	addOre(ModBlocks.magmarackBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 5, 2, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	
	    	addOre(ModBlocks.asheBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 15, 5, 3, 35, BlockMatcher.forBlock(Blocks.NETHERRACK));	
			addOre(ModBlocks.lavaCrystalOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 118, BlockMatcher.forBlock(Blocks.NETHERRACK));	

		
		if (OreCore.activateModdedOres) {
		if (OreCore.activateModdedNetherOres) {                                                     //MaxVeinSize | % | MinY | MaxY | Terrain
			if (OreCore.activateCopperOre) {
			addOre(ModBlocks.netherCopperOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 10, 70, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateAluminiumOre) {
			addOre(ModBlocks.netherAluminiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 3, 64, BlockMatcher.forBlock(Blocks.NETHERRACK));
		   } if (OreCore.activateAmethystOre) {
			addOre(ModBlocks.netherAmethystOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 3, 30, BlockMatcher.forBlock(Blocks.NETHERRACK));
		   } if (OreCore.activateIridiumOre) {	
			addOre(ModBlocks.netherIridiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 2, 1, 3, 10, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateLeadOre) {	
			addOre(ModBlocks.netherLeadOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 3, 3, 25, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activatePlatinumOre) {	
			addOre(ModBlocks.netherPlatinOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 40, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateRubyOre) {	
			addOre(ModBlocks.netherRubyOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateSapphireOre) {	
			addOre(ModBlocks.netherSapphireOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.NETHERRACK));
		   } if (OreCore.activateSilverOre) {	
			addOre(ModBlocks.netherSilverOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 15, 35, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateTinOre) {	
			addOre(ModBlocks.netherTinOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 3, 40, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   } if (OreCore.activateUraniumOre) {	
			addOre(ModBlocks.netherUraniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 50, BlockMatcher.forBlock(Blocks.NETHERRACK));	
		   }
		}
		}
		
	 } 
	}

	
	

	private void GenerateEnd(World world, Random random, int chunkX, int chunkZ) {
		if (OreCore.activateEndGeneration) {					        			//MaxVeinSize | % | MinY | MaxY | Terrain
		if (OreCore.activateVanillaEndOres) {
			addOre(ModBlocks.endCoalOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endIronOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 2, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endGoldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 2, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endLapisOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 1, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endRedstoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 2, 2, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endEmeraldOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 35, BlockMatcher.forBlock(Blocks.END_STONE));				
			addOre(ModBlocks.endDiamondOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 2, 1, 3, 35, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endGlowstoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 10, 55, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
		}
		if (OreCore.activateObsidianVeins) {
			addOre(Blocks.OBSIDIAN.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 50, 10, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
		}
	    if (OreCore.activateFossils) {
			addOre(ModBlocks.endBoneOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endFossilOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));
			addOre(ModBlocks.endFossilOre1.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));
			addOre(ModBlocks.endFossilOre2.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endFossilOre3.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endFossilOre4.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endFossilOre5.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
			addOre(ModBlocks.endFossilOre6.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));
	    }
	    if (OreCore.activateXPOres) {
			addOre(ModBlocks.endXpOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 3, 2, 50, BlockMatcher.forBlock(Blocks.END_STONE));		
	    }
	    if (OreCore.activateMonsterBlocks) {
    		addOre(ModBlocks.endMobBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 3, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
	    }	
	    if (OreCore.activateEyeBlocks) {
    		addOre(ModBlocks.endEyeBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 5, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
	    }
    		addOre(ModBlocks.meteorBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 2, 10, 118, BlockMatcher.forBlock(Blocks.END_STONE));	
    		
    		
    	if (OreCore.activateModdedOres) {
    	if (OreCore.activateModdedNetherOres) {                                                     //MaxVeinSize | % | MinY | MaxY | Terrain
		     if (OreCore.activateCopperOre) {	
    		addOre(ModBlocks.endCopperOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 10, 70, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateAluminiumOre) {	
    		addOre(ModBlocks.endAluminiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 3, 64, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateAmethystOre) {	
    		addOre(ModBlocks.endAmethystOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 3, 30, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateIridiumOre) {
    		addOre(ModBlocks.endIridiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 2, 1, 3, 10, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateLeadOre) {
    		addOre(ModBlocks.endLeadOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 3, 3, 25, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activatePlatinumOre) {
    		addOre(ModBlocks.endPlatinOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 40, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateRubyOre) {
    		addOre(ModBlocks.endRubyOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateSapphireOre) {
    		addOre(ModBlocks.endSapphireOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 2, 3, 64, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateSilverOre) {
    		addOre(ModBlocks.endSilverOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 15, 35, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateTinOre) {
    		addOre(ModBlocks.endTinOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 5, 5, 3, 40, BlockMatcher.forBlock(Blocks.END_STONE));	
		   } if (OreCore.activateUraniumOre) {
    		addOre(ModBlocks.endUraniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 3, 50, BlockMatcher.forBlock(Blocks.END_STONE));	
		   }
    	}
    	}
    			
    } 
   }

}
