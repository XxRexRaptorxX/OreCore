package xxrexraptorxx.orecore.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

import com.google.gson.JsonObject;

public class Factory implements IRecipeFactory {

	@Override
	public IRecipe parse(final JsonContext context, final JsonObject json) {
		final String group = JsonUtils.getString(json, "group", "");
		final NonNullList<Ingredient> ingredients = RecipeUtil.parseShapeless(context, json);
		final ItemStack result = CraftingHelper.getItemStack(JsonUtils.getJsonObject(json, "result"), context);

		return new BucketHelper(group.isEmpty() ? null : new ResourceLocation(group), ingredients, result);
	}
}