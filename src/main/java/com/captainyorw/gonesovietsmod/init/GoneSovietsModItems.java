package com.captainyorw.gonesovietsmod.init;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;
import com.captainyorw.gonesovietsmod.items.*;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GoneSovietsMod.MODID)
public class GoneSovietsModItems {	
	static Item ICONITEM;
	
	public static void init() {
		ICONITEM = new ItemIcon("item_icon");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ICONITEM);
	}
	
	@SubscribeEvent 
	public static void registerRenders(ModelRegistryEvent event) { 
	 		registerRender(ICONITEM); 
	 	} 
	 	 
	private static void registerRender(Item item) { 
	 		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory")); 
	 	} 

}