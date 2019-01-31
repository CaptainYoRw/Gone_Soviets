package com.captainyorw.gonesovietsmod.init;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;
import com.captainyorw.gonesovietsmod.blocks.RedBricks50;
import com.captainyorw.gonesovietsmod.blocks.RedBricks50R;
import com.captainyorw.gonesovietsmod.blocks.SilicateBricks50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteBlocks50;
import com.captainyorw.gonesovietsmod.blocks.Concrete50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteStairsLeft;
import com.captainyorw.gonesovietsmod.blocks.WhiteTile;
import com.captainyorw.gonesovietsmod.blocks.YellowTile;
import com.captainyorw.gonesovietsmod.blocks.RedTile;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Mod.EventBusSubscriber(modid = GoneSovietsMod.MODID) 
 public class GoneSovietsModBlocks { 
 
 
 	static Block BRICKSRED50;
 	static Block BRICKSRED50R;
 	static Block BRICKSSILICATE50;
 	static Block BLOCKSCONCRETE50;
 	static Block CONCRETE50;
 	static Block TILEWHITE;
 	static Block TILEYELLOW;
 	static Block TILERED;
 	static Block STAIRSCONCRETELEFT;
 	 
 	public static void init() {
 		BRICKSRED50 = new RedBricks50("red_bricks_50", Material.ROCK);
 		BRICKSRED50R = new RedBricks50R("red_bricks_50_r", Material.ROCK);
 		BRICKSSILICATE50 = new SilicateBricks50("silicate_bricks_50", Material.ROCK);
 		BLOCKSCONCRETE50 = new ConcreteBlocks50("concrete_blocks_50", Material.ROCK);
 		CONCRETE50 = new Concrete50("concrete_50", Material.ROCK);
 		TILEWHITE = new WhiteTile("white_tile", Material.ROCK);
 		TILEYELLOW = new YellowTile("yellow_tile", Material.ROCK);
 		TILERED = new RedTile("red_tile", Material.ROCK);
 		STAIRSCONCRETELEFT = new ConcreteStairsLeft("concrete_stairs_left", Material.ROCK);

 	} 
 	 
 	@SubscribeEvent 
 	public static void registerBlocks(RegistryEvent.Register<Block> event) {
 		event.getRegistry().registerAll(BRICKSRED50);
 		event.getRegistry().registerAll(BRICKSRED50R);
 		event.getRegistry().registerAll(BRICKSSILICATE50);
 		event.getRegistry().registerAll(BLOCKSCONCRETE50);
 		event.getRegistry().registerAll(CONCRETE50);
 		event.getRegistry().registerAll(TILEWHITE);
 		event.getRegistry().registerAll(TILEYELLOW);
 		event.getRegistry().registerAll(TILERED);
 		event.getRegistry().registerAll(STAIRSCONCRETELEFT);
 		 
 	} 
 	 
 	@SubscribeEvent 
 	public static void registerItemBlocks(RegistryEvent.Register<Item> event) { 
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50).setRegistryName(BRICKSRED50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50R).setRegistryName(BRICKSRED50R.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSSILICATE50).setRegistryName(BRICKSSILICATE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BLOCKSCONCRETE50).setRegistryName(BLOCKSCONCRETE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(CONCRETE50).setRegistryName(CONCRETE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEWHITE).setRegistryName(TILEWHITE.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEYELLOW).setRegistryName(TILEYELLOW.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILERED).setRegistryName(TILERED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(STAIRSCONCRETELEFT).setRegistryName(STAIRSCONCRETELEFT.getRegistryName()));
 		 
 	} 
 	 
 	@SubscribeEvent 
 	public static void registerRenders(ModelRegistryEvent event) { 
 		registerRender(Item.getItemFromBlock(BRICKSRED50));
 		registerRender(Item.getItemFromBlock(BRICKSRED50R));
 		registerRender(Item.getItemFromBlock(BRICKSSILICATE50));
 		registerRender(Item.getItemFromBlock(BLOCKSCONCRETE50));
 		registerRender(Item.getItemFromBlock(CONCRETE50));
 		registerRender(Item.getItemFromBlock(TILEWHITE));
 		registerRender(Item.getItemFromBlock(TILEYELLOW));
 		registerRender(Item.getItemFromBlock(TILERED));
		registerRender(Item.getItemFromBlock(STAIRSCONCRETELEFT));
 		 
 	} 
 	 
 	public static void registerRender(Item item) { 
 		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory")); 
 		 
 	} 
} 
