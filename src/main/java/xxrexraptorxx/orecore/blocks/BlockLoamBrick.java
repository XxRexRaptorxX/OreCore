package xxrexraptorxx.orecore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockLoamBrick extends Block {
	
	public BlockLoamBrick() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(1.5F);
		this.setResistance(7.0F);
		this.setSoundType(SoundType.STONE);

	}
	

}