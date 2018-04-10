package dotblock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import dotblock.block.BlockDotBlock;
import dotblock.DotBlock;

@Mod.EventBusSubscriber(modid = DotBlock.MOD_ID)
public final class Blocks
{
  public static final Block dotblock = new BlockDotBlock();

  @SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> evt) {
    DotBlock.LOGGER.info("registerBlocks: getting registry");

		IForgeRegistry<Block> r = evt.getRegistry();

    DotBlock.LOGGER.info("registerBlocks: registering blocks");

    r.register(dotblock);

    DotBlock.LOGGER.info("registerBlocks: complete");
  }

  @SubscribeEvent
  public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
    DotBlock.LOGGER.info("registerItemBlocks: getting registry");

    IForgeRegistry<Item> r = evt.getRegistry();

    DotBlock.LOGGER.info("registerItemBlocks: registering item blocks");

    r.register(new ItemBlock(dotblock).setRegistryName(dotblock.getRegistryName()));

    DotBlock.LOGGER.info("registerItemBlocks: complete");
  }
}
