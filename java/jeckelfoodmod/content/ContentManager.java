package jeckelfoodmod.content;

import jeckelfoodmod.core.Refs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ContentManager
{
	public static class ModItems
	{
		public static Item egg_fried;

		public static Item carrot_cooked;

		public static Item apple_pie;

		public static Item melon_pie;

		public static Item pumpkin_pie_baked;

		public static Item apple_pie_baked;

		public static Item melon_pie_baked;
	}

	public void pre()
	{
		ModItems.egg_fried = (new ItemFood(3, 0.3F, false)).setUnlocalizedName("egg_fried").setTextureName(Refs.ModId + ":egg_fried");
		GameRegistry.registerItem(ModItems.egg_fried, ModItems.egg_fried.getUnlocalizedName());

		ModItems.carrot_cooked = (new ItemFood(6, 0.8F, false)).setUnlocalizedName("carrot_cooked").setTextureName(Refs.ModId + ":carrot_cooked");
		GameRegistry.registerItem(ModItems.carrot_cooked, ModItems.carrot_cooked.getUnlocalizedName());

		ModItems.apple_pie = (new ItemFood(8, 0.4F, false)).setUnlocalizedName("apple_pie").setTextureName(Refs.ModId + ":apple_pie");
		GameRegistry.registerItem(ModItems.apple_pie, ModItems.apple_pie.getUnlocalizedName());

		ModItems.melon_pie = (new ItemFood(6, 0.4F, false)).setUnlocalizedName("melon_pie").setTextureName(Refs.ModId + ":melon_pie");
		GameRegistry.registerItem(ModItems.melon_pie, ModItems.melon_pie.getUnlocalizedName());

		ModItems.pumpkin_pie_baked = (new ItemFood(8, 0.8F, false)).setUnlocalizedName("pumpkin_pie_baked").setTextureName(Refs.ModId + ":pumpkin_pie_baked");
		GameRegistry.registerItem(ModItems.pumpkin_pie_baked, ModItems.pumpkin_pie_baked.getUnlocalizedName());

		ModItems.apple_pie_baked = (new ItemFood(8, 0.8F, false)).setUnlocalizedName("apple_pie_baked").setTextureName(Refs.ModId + ":apple_pie_baked");
		GameRegistry.registerItem(ModItems.apple_pie_baked, ModItems.apple_pie_baked.getUnlocalizedName());

		ModItems.melon_pie_baked = (new ItemFood(8, 0.8F, false)).setUnlocalizedName("melon_pie_baked").setTextureName(Refs.ModId + ":melon_pie_baked");
		GameRegistry.registerItem(ModItems.melon_pie_baked, ModItems.melon_pie_baked.getUnlocalizedName());
	}

	public void initialize()
	{
		GameRegistry.addSmelting(Items.egg, new ItemStack(ModItems.egg_fried), 0.0F);
		GameRegistry.addSmelting(Items.carrot, new ItemStack(ModItems.carrot_cooked), 0.0F);

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.apple_pie), new ItemStack(Items.apple), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.melon_pie), new ItemStack(Items.melon), new ItemStack(Items.sugar), new ItemStack(Items.egg));

		GameRegistry.addSmelting(Items.pumpkin_pie, new ItemStack(ModItems.pumpkin_pie_baked), 0.0F);
		GameRegistry.addSmelting(ModItems.apple_pie, new ItemStack(ModItems.apple_pie_baked), 0.0F);
		GameRegistry.addSmelting(ModItems.melon_pie, new ItemStack(ModItems.melon_pie_baked), 0.0F);
	}

	public void post()
	{
	}
}
