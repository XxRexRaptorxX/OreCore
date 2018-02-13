package xxrexraptorxx.orecore.blocks;

import java.util.ArrayList;
import java.util.Random;

import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockEndFossilOre1 extends Block {
	
	public BlockEndFossilOre1() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(1.0F);
		this.setResistance(2.5F);
		this.setSoundType(SoundType.STONE);

	}
	
	/* Drop */
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		Random random = new Random();
	    	if (random.nextFloat() < 0.5F) {
	    		drops.add(new ItemStack(ModItems.fossil1, 1));
	    		drops.add(new ItemStack(Items.BONE, random.nextInt(2)));
	    	} else {
	    		drops.add(new ItemStack(Items.BONE, random.nextInt(3) + 1));
	    	}
	    return drops;
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
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
            return 3 + RANDOM.nextInt(6);
        }
        return 0;
    }
	
}