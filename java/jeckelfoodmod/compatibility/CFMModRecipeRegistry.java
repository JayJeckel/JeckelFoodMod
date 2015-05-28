package jeckelfoodmod.compatibility;

import jeckelfoodmod.content.ContentManager;
import jeckelfoodmod.core.Refs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;

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
		ItemStack input, output;

		input = new ItemStack(Items.egg);
		output = new ItemStack(ContentManager.ModItems.egg_fried);
		CFMUtil.register(registry, input, output, "oven", "microwave");

		input = new ItemStack(Items.carrot);
		output = new ItemStack(ContentManager.ModItems.carrot_cooked);
		CFMUtil.register(registry, input, output, "oven", "microwave");

		input = new ItemStack(Items.pumpkin_pie);
		output = new ItemStack(ContentManager.ModItems.pumpkin_pie_baked);
		CFMUtil.register(registry, input, output, "oven", "microwave");

		input = new ItemStack(ContentManager.ModItems.apple_pie);
		output = new ItemStack(ContentManager.ModItems.apple_pie_baked);
		CFMUtil.register(registry, input, output, "oven", "microwave");

		input = new ItemStack(ContentManager.ModItems.melon_pie);
		output = new ItemStack(ContentManager.ModItems.melon_pie_baked);
		CFMUtil.register(registry, input, output, "oven", "microwave");
	}
}
