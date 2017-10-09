package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockEndMob extends Block {

	public BlockEndMob() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(3.5F);
		this.setResistance(15.0F);
		this.setSoundType(SoundType.STONE);

	}
	
	
	/* Drop */
	public Block getBlockDropped(IBlockState state, Random rand, int fortune) {
		return Blocks.END_STONE;
	}
	
	
	@Override
	  public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	    {
	        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops"))
	        {
	            EntityEndermite entityendermite = new EntityEndermite(worldIn);
	            entityendermite.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
	            worldIn.spawnEntity(entityendermite);
	            entityendermite.spawnExplosionParticle();
	        }
	    }


}
