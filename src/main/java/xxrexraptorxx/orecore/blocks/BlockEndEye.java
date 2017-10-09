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

public class BlockEndEye extends Block {

	public BlockEndEye() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.1F);
		this.setResistance(15.0F);
		this.setSoundType(SoundType.STONE);

	}
	

	
    /* Drop */
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
	      ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	      		drops.add(new ItemStack(Blocks.END_STONE));
	      		drops.add(new ItemStack(Items.ENDER_EYE));
	      		return drops;
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

			i = MathHelper.getInt(rand, 5, 7);
			return i;
		}
		return 0;
	}


}
