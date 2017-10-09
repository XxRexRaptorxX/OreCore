package xxrexraptorxx.orecore.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockOilSlateOre extends Block {
	
	public BlockOilSlateOre() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);

	}
	
    
    /* Drop */
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
	      ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	        drops.add(new ItemStack(ModBlocks.slateOre));
	        drops.add(new ItemStack(ModItems.oilPaste));
	        	return drops;
	}
}