package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class BlockNetherXpOre extends Block {
	
	public BlockNetherXpOre() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(1.0F);
		this.setResistance(2.5F);
		this.setSoundType(SoundType.STONE);

	}
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        if (side != EnumFacing.UP)
            return false;
        return true;
    }
	
	
	/* Drop */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.NETHERRACK);
	}

	
	
	/* Exp */
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 15 + RANDOM.nextInt(20);
        }
        return 0;
    }
	
}