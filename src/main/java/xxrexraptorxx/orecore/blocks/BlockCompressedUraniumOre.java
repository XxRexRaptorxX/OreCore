package xxrexraptorxx.orecore.blocks;

import java.util.Random;

import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCompressedUraniumOre extends Block {

	public BlockCompressedUraniumOre() {
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		if(OreCore.activateShowModOres) {
			this.setCreativeTab(OreCore.mainTab);
		}

	}
	
	/* Effect */
	protected static final AxisAlignedBB CUSTOM_COLLISION_AABB = new AxisAlignedBB(0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return CUSTOM_COLLISION_AABB;
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn instanceof EntityPlayer && !worldIn.isRemote) {
			EntityPlayer player = (EntityPlayer) entityIn;
			player.addPotionEffect(new PotionEffect(MobEffects.POISON, 200));
		}

		if (entityIn instanceof EntityLiving && !worldIn.isRemote) {
			EntityLiving entity = (EntityLiving) entityIn;
			entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 200));
		}
	}

	/* Drop */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.uranium;
	}
	
	
	@Override
	public int quantityDropped(Random random) {
		return 2;
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