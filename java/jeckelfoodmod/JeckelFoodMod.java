package jeckelfoodmod;

import jeckelfoodmod.common.InfoModCommand;
import jeckelfoodmod.core.Refs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod
(
modid = Refs.ModId,
useMetadata = true,
canBeDeactivated = false,
guiFactory = Refs.ConfigFactoryTypeName
)
public class JeckelFoodMod
{
	@Mod.Instance (value = Refs.ModId)
	public static JeckelFoodMod INSTANCE;

	public JeckelFoodMod() { }

	@Mod.EventHandler
	public void preInitialize(FMLPreInitializationEvent event) { Refs.pre(INSTANCE, event); }

	@Mod.EventHandler
	public void initialize(FMLInitializationEvent event) { Refs.initialize(event); }

	@Mod.EventHandler
	public void postInitialization(FMLPostInitializationEvent event) { Refs.post(event); }

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new InfoModCommand(Refs.getMetadata(), Refs.getUpdateChecker(), "Display info about the mod."));
	}

	/*@SubscribeEvent public void onItemTooltip(ItemTooltipEvent event)
	{
		if (!(event.itemStack.getItem() instanceof ItemFood)) { return; }
		final ItemFood food = (ItemFood) event.itemStack.getItem();

		String text;

		final int shanks = food.func_150905_g(event.itemStack);
		text = EnumChatFormatting.RED.toString();
		for (int n = 0; n < shanks; n++) { text += (n % 2 == 0 ? "[" : "]"); }
		event.toolTip.add(text);

		final float satModifier = food.func_150906_h(event.itemStack);
		final float sat = 2 * (shanks * satModifier);
		event.toolTip.add("Saturation: " + sat);

		final float quality = shanks + sat;
		event.toolTip.add("Quality: " + quality);

		final float ratio = sat / (float) shanks;
		event.toolTip.add("Ratio: " + ratio);


		if (food.isWolfsFavoriteMeat()) { event.toolTip.add("Wolf Meat"); }
	}*/
}
