package gregtech.common.tools;

import gregtech.api.enums.Materials;
import gregtech.api.enums.Textures;
import gregtech.api.enums.Textures.ItemIcons;
import gregtech.api.interfaces.IIconContainer;
import gregtech.api.items.GT_MetaGenerated_Tool;
import net.minecraft.item.ItemStack;

public class GT_Tool_Wrench_HV
  extends GT_Tool_Wrench_LV
{
  public int getToolDamagePerBlockBreak()
  {
    return 800;
  }
  
  public int getToolDamagePerDropConversion()
  {
    return 1600;
  }
  
  public int getToolDamagePerContainerCraft()
  {
    return 12800;
  }
  
  public int getToolDamagePerEntityAttack()
  {
    return 3200;
  }
  
  public int getBaseQuality()
  {
    return 1;
  }
  
  public float getBaseDamage()
  {
    return 2.0F;
  }
  
  public float getSpeedMultiplier()
  {
    return 4.0F;
  }
  
  public float getMaxDurabilityMultiplier()
  {
    return 4.0F;
  }
  
  public boolean canBlock()
  {
    return false;
  }
  
  public IIconContainer getIcon(boolean aIsToolHead, ItemStack aStack)
  {
    return aIsToolHead ? GT_MetaGenerated_Tool.getPrimaryMaterial(aStack).mIconSet.mTextures[gregtech.api.enums.OrePrefixes.toolHeadWrench.mTextureIndex] : Textures.ItemIcons.POWER_UNIT_HV;
  }
  
  public short[] getRGBa(boolean aIsToolHead, ItemStack aStack)
  {
    return aIsToolHead ? GT_MetaGenerated_Tool.getPrimaryMaterial(aStack).mRGBa : GT_MetaGenerated_Tool.getSecondaryMaterial(aStack).mRGBa;
  }
}


/* Location:           F:\Torrent\minecraft\jd-gui-0.3.6.windows\gregtech_1.7.10-5.07.07-dev.jar
 * Qualified Name:     gregtech.common.tools.GT_Tool_Wrench_HV
 * JD-Core Version:    0.7.0.1
 */