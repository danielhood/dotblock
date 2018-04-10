package dotblock;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod (modid = DotBlock.MOD_ID, name = DotBlock.NAME, version = DotBlock.VERSION)
public class DotBlock {
    public static final String MOD_ID = "dotblock";
    public static final String NAME = "DotBlock";
    public static final String VERSION = "$VERSION$";

    @Instance(MOD_ID)
    public static DotBlock instance;

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        LOGGER.info("preInit!");
        //System.out.println("[dotblock] preInit!");
    }
}
