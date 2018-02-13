package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockNetherMob extends Block {

	public BlockNetherMob() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(0.8F);
		this.setSoundType(SoundType.STONE);

	}
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        if (side != EnumFacing.UP)
            return false;
        return true;
    }
	
	
	/* Drop */
	public Block getBlockDropped(IBlockState state, Random rand, int fortune) {
		return Blocks.NETHERRACK;
	}

	
	@Override
	  public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	    {
	        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops"))
	        {
	            EntitySilverfish entitysilverfish = new EntitySilverfish(worldIn);
	            entitysilverfish.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
	            worldIn.spawnEntity(entitysilverfish);
	            entitysilverfish.spawnExplosionParticle();
	        }
	    }


}
