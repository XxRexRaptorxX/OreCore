package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class BlockEndPlatinOre extends Block {
	
	public BlockEndPlatinOre() {
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(1.0F);
		this.setResistance(2.5F);
		this.setSoundType(SoundType.STONE);
		if(OreCore.activateShowModOres) {
			this.setCreativeTab(OreCore.mainTab);
		}
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