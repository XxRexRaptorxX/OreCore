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

public class BlockIronGravelOre extends BlockFalling {

	public BlockIronGravelOre() {
		super(Material.SAND);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.6F);
		this.setSoundType(SoundType.SAND);

	}
	
	
	/* Drop */
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.IRON_NUGGET;
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

			i = MathHelper.getInt(rand, 1, 2);
			return i;
		}
		return 0;
	}


}
