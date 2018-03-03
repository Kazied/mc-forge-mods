package net.kazied;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = FirstJoin.modId, name = FirstJoin.name, version = FirstJoin.version)
public class FirstJoin {

    public static final String modId = "firstjoin";
    public static final String name = "First Join";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static FirstJoin instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading! :D");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent even) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

