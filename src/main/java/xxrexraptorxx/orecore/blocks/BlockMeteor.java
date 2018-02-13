package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;


public class BlockMeteor extends Block {
	
	public BlockMeteor() {
		super(Material.ROCK);
		this.setCreativeTab(OreCore.mainTab);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(80.0F);
		this.setResistance(5000.0F);
		this.setSoundType(SoundType.STONE);

	}


	@Override
	public void onLanded(World worldIn, Entity entityIn) {
	if(entityIn instanceof EntityPlayer && !worldIn.isRemote) {
		EntityPlayer player = (EntityPlayer) entityIn;
	    	player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 60));
		}
	if(entityIn instanceof EntityLiving && !worldIn.isRemote) {
		EntityLiving entity = (EntityLiving) entityIn;
    		entity.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 60));
		}
	}
	
	
	
	@Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
        super.updateTick(worldIn, pos, state, rand);

        if (worldIn.provider.isSurfaceWorld() && worldIn.getGameRules().getBoolean("doMobSpawning") && rand.nextInt(2000) < worldIn.getDifficulty().getDifficultyId()) {
            int i = pos.getY();
            BlockPos blockpos;

            for (blockpos = pos; !worldIn.getBlockState(blockpos).isTopSolid() && blockpos.getY() > 0; blockpos = blockpos.down()) {
                ;
            }

            if (i > 0 && !worldIn.getBlockState(blockpos.up()).isNormalCube()) {
                Entity entity = ItemMonsterPlacer.spawnCreature(worldIn, EntityList.getKey(EntityEndermite.class), (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 1.1D, (double)blockpos.getZ() + 0.5D);
                
            }
        }
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
	
	
	/* Drop */
	@Override
    public int quantityDropped(Random random) {
        return 3 + random.nextInt(4);
    }
    
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.meteor;
	}
	
	
	@Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }


	@Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
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