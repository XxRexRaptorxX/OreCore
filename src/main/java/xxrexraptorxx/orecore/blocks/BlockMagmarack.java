package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockMagmarack extends Block {
	
	public BlockMagmarack() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(0.5F);
		this.setResistance(0.0F);
		this.setSoundType(SoundType.STONE);
	//	this.setLightLevel(3.0F);
	//	this.setLightOpacity(3);

	}
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        return true;
    }
	
	
	
	@Override
	  public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	    {
	        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase)entityIn))
	        {
	            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.5F);
	        }

	        super.onEntityWalk(worldIn, pos, entityIn);
	    }



	@Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        BlockPos blockpos = pos.up();
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);

	        if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER)
	        {
	            worldIn.setBlockToAir(blockpos);
	            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

	            if (worldIn instanceof WorldServer)
	            {
	                ((WorldServer)worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.25D, (double)blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D, new int[0]);
	            }
	        }
	    }

	@Override
	    public boolean canEntitySpawn(IBlockState state, Entity entityIn)
	    {
	        return entityIn.isImmuneToFire();
	    }
	
	
	
	@Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        double d0 = (double)((float)pos.getX() + rand.nextFloat());
        double d1 = (double)((float)pos.getY() + 0.0F);
        double d2 = (double)((float)pos.getZ() + rand.nextFloat());
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    
}