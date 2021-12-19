package com.kwpugh.powder_power;

import com.kwpugh.powder_power.config.ModConfig;
import com.kwpugh.powder_power.groups.GroupPowderPower;
import com.kwpugh.powder_power.init.BlockInit;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("powder_power")
public class PowderPower
{
	public static final String modid = "powder_power";
	public static final Logger logger = LogManager.getLogger(modid);
	public static final CreativeModeTab powder_power = new GroupPowderPower();

    public PowderPower()
    {
    	ModConfig.loadConfig(ModConfig.config, FMLPaths.CONFIGDIR.get().resolve("powder_power.toml").toString());
    	BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        logger.info("PowderPower common setup");
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
    	logger.info("PowderPower client setup");
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        InterModComms.sendTo("powder_power", "hello world", () -> { logger.info("Hello world from PowderPower"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
    	logger.info("PowderPower IMC setup {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    	logger.info("PowderPower server setup");
    }
}
