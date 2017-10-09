package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockLoam extends Block {
	
	public BlockLoam() {
		super(Material.GROUND);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.5F);
		this.setResistance(0.0F);
		this.setSoundType(SoundType.GROUND);

	}
	
	
	/* Drop */
    public int quantityDropped(Random random)
    {
        return 4;
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.loamBall;
    }
    
    /* Stats */
    protected static final AxisAlignedBB LOAM_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.800D, 1.0D);

    
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return LOAM_AABB;
    }
    
	
	/* Events */
	@Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.2D;
        entityIn.motionZ *= 0.2D;
    }

}