package com.teamfractal.ecp.common;

import com.teamfractal.ecp.common.util.ECPRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EyeContactProhibited.MODID)
public class EyeContactProhibited
{
    public static final String MODID = "ecp";

    public EyeContactProhibited()
    {
        ECPRegistryHandler.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
