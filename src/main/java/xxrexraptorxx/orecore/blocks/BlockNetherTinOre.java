package xxrexraptorxx.orecore.blocks;

import java.util.List;
import java.util.Random;

import xxrexraptorxx.orecore.main.OreCore;
import xxrexraptorxx.orecore.util.Reflection;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;


public class BlockNetherTinOre extends Block {
	
	public BlockNetherTinOre() {
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(1.0F);
		this.setResistance(2.5F);
		this.setSoundType(SoundType.STONE);
		if(OreCore.activateShowModOres) {
			this.setCreativeTab(OreCore.mainTab);
		}
	}
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        if (side != EnumFacing.UP)
            return false;
        return true;
    }
	
	
	@Override       //Code by Insane-96
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		this.PigmanAggro(worldIn, pos, state, player);
	}
	
	private void PigmanAggro(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		float radius = OreCore.pigmenAggroRange;
		float chanceAggro = 1;
		int chanceSeeAggro = 5;
		
		BlockPos corner1 = new BlockPos(pos.getX() - radius, pos.getY() - radius, pos.getZ() - radius);
		BlockPos corner2 = new BlockPos(pos.getX() + radius, pos.getY() + radius, pos.getZ() + radius);
		AxisAlignedBB AABBradius = new AxisAlignedBB(corner1, corner2);
		List<EntityPigZombie> pigmen = worldIn.getEntitiesWithinAABB(EntityPigZombie.class, AABBradius);
		
		for (EntityPigZombie pigman : pigmen) {
			RayTraceResult rayTraceResult = pigman.world.rayTraceBlocks(player.getPositionEyes(1.0f), pigman.getPositionEyes(1.0f), true, true, false);
			if ((rayTraceResult == null && worldIn.rand.nextInt(chanceSeeAggro) == 0)
				|| (rayTraceResult != null && worldIn.rand.nextFloat() < chanceAggro / 100f)) {
				DamageSource damageSource = new EntityDamageSourceIndirect("generic", player, player);
				
				Reflection.Invoke(Reflection.becomeAngryAt, pigman, player);
			}
		}	
	}
	

	/* Exp */
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
            return 3 + RANDOM.nextInt(6);
        }
        return 0;
    }
	
}