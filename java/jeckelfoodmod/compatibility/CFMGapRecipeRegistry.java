package jeckelfoodmod.compatibility;

import jeckelfoodmod.core.Refs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeVariables;

import cpw.mods.fml.common.event.FMLInterModComms;

public class CFMGapRecipeRegistry
{
	public static void send()
	{
		FMLInterModComms.sendMessage("cfm", "register",
		Refs.ModId + ".compatibility.CFMGapRecipeRegistry.initialize");
	}

	public static void initialize(IRecipeRegistry registry)
	{
		RecipeVariables var;

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.porkchop));
		var.addValue("output", new ItemStack(Items.cooked_porkchop));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.chicken));
		var.addValue("output", new ItemStack(Items.cooked_chicken));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.fish, 1, 0));
		var.addValue("output", new ItemStack(Items.cooked_fished, 1, 0));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.fish, 1, 1));
		var.addValue("output", new ItemStack(Items.cooked_fished, 1, 1));
		registry.registerRecipe("microwave", var);
	}
}
