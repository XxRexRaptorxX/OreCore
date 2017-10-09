package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockAshe extends BlockFalling {
	
	public BlockAshe() {
		super(Material.SAND);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.2F);
		this.setResistance(0.0F);
		this.setSoundType(SoundType.SAND);

	}
	
	
	/* Drop */
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.ashe;
	}

	public int quantityDropped(Random random) {
		return 4;
	}

}