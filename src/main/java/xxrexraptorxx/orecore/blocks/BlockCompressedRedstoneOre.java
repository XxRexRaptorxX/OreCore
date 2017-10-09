package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class BlockCompressedRedstoneOre extends Block {
	
	public BlockCompressedRedstoneOre() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);

	}
	
	
	/* Drop */
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.REDSTONE;
	}

    public int quantityDropped(Random random)
    {
        return this == ModBlocks.compressedRedstoneOre? 5 + random.nextInt(5) : 1;
    }

	
	/* Exp */
	@Override
	public int getExpDrop(IBlockState state,
			net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand
				: new Random();
		if (this.getItemDropped(state, rand, fortune) != Item
				.getItemFromBlock(this)) {
			int i = 0;

			i = MathHelper.getInt(rand, 3, 6);
			return i;
		}
		return 0;
	}

	
}