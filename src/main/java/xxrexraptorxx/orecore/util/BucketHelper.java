package xxrexraptorxx.orecore.util;

import com.google.gson.JsonObject;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import javax.annotation.Nullable;

import java.util.Random;

/**
 * @author Choonster
 */
public class BucketHelper extends ShapelessOreRecipe {
	private final Random random = new Random();

	public BucketHelper(@Nullable final ResourceLocation group, final NonNullList<Ingredient> input, final ItemStack result) {
		super(group, input, result);
	}

	
	@Override
	public NonNullList<ItemStack> getRemainingItems(final InventoryCrafting inventoryCrafting) {
		final NonNullList<ItemStack> remainingItems = NonNullList.withSize(inventoryCrafting.getSizeInventory(), ItemStack.EMPTY);

		for (int i = 0; i < remainingItems.size(); ++i) {
			final ItemStack itemstack = inventoryCrafting.getStackInSlot(i);

			if (!itemstack.isEmpty() && itemstack.getItem() instanceof ItemBucket) {
				remainingItems.set(i, new ItemStack(Items.AIR));
			} else {
				remainingItems.set(i, ForgeHooks.getContainerItem(itemstack));
			}
		}

		return remainingItems;
	}

	@Override
	public String getGroup() {
		return group == null ? "" : group.toString();
	}
}	

