package jeckelfoodmod.compatibility;

import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeVariables;

public class CFMUtil
{
	public static void register(final IRecipeRegistry registry, final ItemStack input, final ItemStack output, final String key)
	{
		RecipeVariables var = new RecipeVariables();
		var.addValue("input", input.copy());
		var.addValue("output", output.copy());
		registry.registerRecipe(key, var);
	}

	public static void register(final IRecipeRegistry registry, final ItemStack input, final ItemStack output, final String... keys)
	{
		for (final String key : keys) { register(registry, input, output, key); }
	}

}
