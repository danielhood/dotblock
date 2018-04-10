package dotblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import dotblock.DotBlock;

public class BlockDotBlock extends Block {
  public BlockDotBlock() {
    super(Material.ROCK);

    setUnlocalizedName("dotblock");
    setRegistryName(new ResourceLocation(DotBlock.MOD_ID, "dotblock"));
    setCreativeTab(CreativeTabs.MISC);

    setHardness(2.0F);
    setResistance(10.0F);
    setSoundType(SoundType.STONE);

  }
}
