package jeckelfoodmod.compatibility;

import jeckelfoodmod.core.Refs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;

import cpw.mods.fml.common.event.FMLInterModComms;

public class CFMVanillaRecipeRegistry
{
	public static void send()
	{
		FMLInterModComms.sendMessage("cfm", "register",
		Refs.ModId + ".compatibility.CFMVanillaRecipeRegistry.initialize");
	}

	public static void initialize(IRecipeRegistry registry)
	{
		ItemStack input, output;

		input = new ItemStack(Items.porkchop);
		output = new ItemStack(Items.cooked_porkchop);
		CFMUtil.register(registry, input, output, "microwave");

		input = new ItemStack(Items.chicken);
		output = new ItemStack(Items.cooked_chicken);
		CFMUtil.register(registry, input, output, "microwave");

		input = new ItemStack(Items.fish, 1, 0);
		output = new ItemStack(Items.cooked_fished, 1, 0);
		CFMUtil.register(registry, input, output, "microwave");

		input = new ItemStack(Items.fish, 1, 1);
		output = new ItemStack(Items.cooked_fished, 1, 1);
		CFMUtil.register(registry, input, output, "microwave");
	}
}
