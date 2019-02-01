package com.captainyorw.gonesovietsmod;

import com.captainyorw.gonesovietsmod.init.GoneSovietsModBlocks;
import com.captainyorw.gonesovietsmod.init.GoneSovietsModItems;
import com.captainyorw.gonesovietsmod.init.GoneSovietsModTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GoneSovietsMod.MODID, name = GoneSovietsMod.NAME, version = GoneSovietsMod.VERSION, acceptedMinecraftVersions=GoneSovietsMod.ACCEPTED_MINECRAFT_VERSIONS)
public class GoneSovietsMod {
	public static final CreativeTabs gonesovietsmodtab = new GoneSovietsModTab("gonesovietsmodtab");
	
	@Instance
	public static GoneSovietsMod instance;
	
    public static final String MODID = "gonesovietsmod"; //ID мода
    public static final String NAME = "Gone Soviets"; //название мода
    public static final String VERSION = "0.15 pre-alpha"; //версия мода
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "1.12.2"; //совместимая версия игры

    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {   /*различные стадии инициализации мода,
	                                                         что-то вроде пре-рендера, рендера и пост рендера*/
		System.out.println(GoneSovietsMod.MODID + ":preInit");
		GoneSovietsModItems.init(); //инициализируем наши предметы
		GoneSovietsModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(GoneSovietsMod.MODID + ":init");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(GoneSovietsMod.MODID + ":postInit");
		
	}
	
}
