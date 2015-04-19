package jeckelfoodmod.core;

import jeckelfoodmod.common.configs.ConfigHandlerValues;
import net.minecraftforge.common.config.Configuration;

public class ConfigValues extends ConfigHandlerValues
{
	private static final long serialVersionUID = 4987431302893679225L;

	public ConfigValues()
	{
		this.add(this._updateChecking);
	}

	public boolean isUpdateCheckingEnabled() { return this._updateChecking.getValue(); }
	protected final ConfigValueBoolean _updateChecking = new ConfigValueBoolean("EnableUpdateChecking", Configuration.CATEGORY_GENERAL,
			"Control automatic update checking.\n.Setting this option to false will disable version checking.",
			true);

	@Override public void update(final Configuration config)
	{
		super.update(config);

		Refs.getUpdateChecker().enable(this.isUpdateCheckingEnabled());
	}
}
