package com.kwpugh.powder_power;

import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.kwpugh.powder_power.groups.GroupPowderPower;
import com.kwpugh.powder_power.init.BlockInit;
import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.Config;
import com.kwpugh.powder_power.util.CuriosModCheck;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import top.theillusivec4.curios.api.SlotTypeMessage;

@Mod("powder_power")
public class PowderPower
{
	public static final String modid = "powder_power";
	public static final Logger logger = LogManager.getLogger(modid);
	public static final ItemGroup powder_power = new GroupPowderPower();

    public PowderPower()
    {
    	Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("powder_power.toml").toString());

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
        InterModComms.sendTo("powder_power", "helloworld", () -> { logger.info("Hello world from PowderPower"); return "Hello world";});

        if (CuriosModCheck.CURIOS.isLoaded())
        {
        	InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("belt").size(2).build());
        }
    }

    private void processIMC(final InterModProcessEvent event)
    {
    	logger.info("PowderPower IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
    	logger.info("PowderPower server setup");
    }
}
