package xxrexraptorxx.orecore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockLavaCrystal extends Block {
	
	public BlockLavaCrystal() {
		super(Material.IRON);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);

	}
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        return true;
    }
	

}