package jeckelfoodmod.compatibility;

import jeckelfoodmod.content.ContentManager;
import jeckelfoodmod.core.Refs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeVariables;

import cpw.mods.fml.common.event.FMLInterModComms;

// ToDo: Rename this class to Register.
public class CFMModRecipeRegistry
{
	public static void send()
	{
		FMLInterModComms.sendMessage("cfm", "register",
		Refs.ModId + ".compatibility.CFMModRecipeRegistry.initialize");
	}

	public static void initialize(IRecipeRegistry registry)
	{
		RecipeVariables var;

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.egg));
		var.addValue("output", new ItemStack(ContentManager.ModItems.egg_fried));
		registry.registerRecipe("oven", var);
		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.egg));
		var.addValue("output", new ItemStack(ContentManager.ModItems.egg_fried));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.carrot));
		var.addValue("output", new ItemStack(ContentManager.ModItems.carrot_cooked));
		registry.registerRecipe("oven", var);
		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.carrot));
		var.addValue("output", new ItemStack(ContentManager.ModItems.carrot_cooked));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.pumpkin_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.pumpkin_pie_baked));
		registry.registerRecipe("oven", var);
		var = new RecipeVariables();
		var.addValue("input", new ItemStack(Items.pumpkin_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.pumpkin_pie_baked));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(ContentManager.ModItems.apple_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.apple_pie_baked));
		registry.registerRecipe("oven", var);
		var = new RecipeVariables();
		var.addValue("input", new ItemStack(ContentManager.ModItems.apple_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.apple_pie_baked));
		registry.registerRecipe("microwave", var);

		var = new RecipeVariables();
		var.addValue("input", new ItemStack(ContentManager.ModItems.melon_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.melon_pie_baked));
		registry.registerRecipe("oven", var);
		var = new RecipeVariables();
		var.addValue("input", new ItemStack(ContentManager.ModItems.melon_pie));
		var.addValue("output", new ItemStack(ContentManager.ModItems.melon_pie_baked));
		registry.registerRecipe("microwave", var);
	}
}
