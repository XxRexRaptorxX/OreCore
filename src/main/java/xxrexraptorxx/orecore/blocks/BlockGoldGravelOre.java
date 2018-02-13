package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockGoldGravelOre extends BlockFalling {

	public BlockGoldGravelOre() {
		super(Material.SAND);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.6F);
		this.setSoundType(SoundType.SAND);

	}
	
	
	/* Drop */
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.GOLD_NUGGET;
	}



	@Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }


	@Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

				/* Exp */
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 1 + RANDOM.nextInt(2);
        }
        return 0;
    }

}
