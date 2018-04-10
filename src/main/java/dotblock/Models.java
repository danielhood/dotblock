package dotblock;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IRegistryDelegate;
import dotblock.DotBlock;
import dotblock.Blocks;
import java.util.Map;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = DotBlock.MOD_ID)
public final class Models {

  private static final Map<IRegistryDelegate<Block>, IStateMapper> customStateMappers = ReflectionHelper.getPrivateValue(ModelLoader.class, null, "customStateMappers");
  private static final DefaultStateMapper fallbackMapper = new DefaultStateMapper();

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent evt) {
    DotBlock.LOGGER.info("registerModels: registering models");

    Block block = Blocks.dotblock;
    IBlockState state = block.getDefaultState();

    ModelLoader.setCustomModelResourceLocation(
				Item.getItemFromBlock(block),
				0,
        customStateMappers
				.getOrDefault(state.getBlock().delegate, fallbackMapper)
				.putStateModelLocations(state.getBlock())
				.get(state)
				);

      DotBlock.LOGGER.info("registerModels: complete");
  }
}
