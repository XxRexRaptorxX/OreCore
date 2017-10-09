package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockNetherLapisOre extends Block {

	public BlockNetherLapisOre() {
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
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.DYE;
	}
	
    public int damageDropped(IBlockState state)
    {
        return this == ModBlocks.netherLapisOre ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }

    public int quantityDropped(Random random)
    {
        return this == ModBlocks.netherLapisOre ? 8 + random.nextInt(5) : 1;
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