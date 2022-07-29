package com.kwpugh.powder_power.config;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.kwpugh.powder_power.PowderPower;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModConfig
{
	private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;
	
	static
	{
		com.electronwill.nightconfig.core.Config.setInsertionOrderPreserved(true);

		ConfigPowderPower.init(builder);
		
		config = builder.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		PowderPower.logger.info("Loading PowderPower config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		PowderPower.logger.info("Built PowderPower config:" + path);
		
		file.load();
		
		PowderPower.logger.info("Loaded PowderPower config: " + path);
		config.setConfig(file);
		
	}
}