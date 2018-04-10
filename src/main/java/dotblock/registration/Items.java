package dotblock.registration;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import dotblock.DotBlock;
//import dotblock.item.ItemDotBlock;

@Mod.EventBusSubscriber(modid = DotBlock.MOD_ID)
public final class Items {
  //public static final Item dotblock = new ItemDotBlock();

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> evt) {

    DotBlock.LOGGER.info("registerItems: getting registry");
    IForgeRegistry<Item> r = evt.getRegistry();

    DotBlock.LOGGER.info("registerItems: registering items");
    //r.register(dotblock);

    DotBlock.LOGGER.info("registerItems: complete");
  }
}
