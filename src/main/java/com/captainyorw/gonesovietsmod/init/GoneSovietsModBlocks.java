package com.captainyorw.gonesovietsmod.init;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;
import com.captainyorw.gonesovietsmod.blocks.RedBricks50;
import com.captainyorw.gonesovietsmod.blocks.CrackedRedBricks50;
import com.captainyorw.gonesovietsmod.blocks.RedBricks50R;
import com.captainyorw.gonesovietsmod.blocks.CrackedRedBricks50R;
import com.captainyorw.gonesovietsmod.blocks.SilicateBricks50;
import com.captainyorw.gonesovietsmod.blocks.CrackedSilicateBricks50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteBlocks50;
import com.captainyorw.gonesovietsmod.blocks.Concrete50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteWallSlab50;
import com.captainyorw.gonesovietsmod.blocks.GreenRailing50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteStairsLeft50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteStairsMiddle50;
import com.captainyorw.gonesovietsmod.blocks.ConcreteStairsRight50;
import com.captainyorw.gonesovietsmod.blocks.WhiteTile;
import com.captainyorw.gonesovietsmod.blocks.CrackedWhiteTile;
import com.captainyorw.gonesovietsmod.blocks.YellowTile;
import com.captainyorw.gonesovietsmod.blocks.CrackedYellowTile;
import com.captainyorw.gonesovietsmod.blocks.RedTile;
import com.captainyorw.gonesovietsmod.blocks.CrackedRedTile;
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
 	static Block BRICKSRED50CRACKED;
 	static Block BRICKSRED50R;
 	static Block BRICKSRED50RCRACKED;
 	static Block BRICKSSILICATE50;
 	static Block BRICKSSILICATE50CRACKED;
 	static Block BLOCKSCONCRETE50;
 	static Block CONCRETE50;
 	static Block SLABWALLCONCRETE50;
 	static Block TILEWHITE;
 	static Block TILEWHITECRACKED;
 	static Block TILEYELLOW;
 	static Block TILEYELLOWCRACKED;
 	static Block TILERED;
 	static Block TILEREDCRACKED;
 	static Block RAILINGGREEN;
 	static Block STAIRSCONCRETELEFT50;
 	static Block STAIRSCONCRETEMIDDLE50;
 	static Block STAIRSCONCRETERIGHT50;
 	 
 	public static void init() {
 		BRICKSRED50 = new RedBricks50("red_bricks_50", Material.ROCK);
 		BRICKSRED50CRACKED = new CrackedRedBricks50("red_bricks_50_cracked", Material.ROCK);
 		BRICKSRED50R = new RedBricks50R("red_bricks_50_r", Material.ROCK);
 		BRICKSRED50RCRACKED = new CrackedRedBricks50R("red_bricks_50_r_cracked", Material.ROCK);
 		BRICKSSILICATE50 = new SilicateBricks50("silicate_bricks_50", Material.ROCK);
 		BRICKSSILICATE50CRACKED = new CrackedSilicateBricks50("silicate_bricks_50_cracked", Material.ROCK);
 		BLOCKSCONCRETE50 = new ConcreteBlocks50("concrete_blocks_50", Material.ROCK);
 		CONCRETE50 = new Concrete50("concrete_50", Material.ROCK);
 		SLABWALLCONCRETE50 = new ConcreteWallSlab50("concrete_wall_slab_50", Material.ROCK);
 		TILEWHITE = new WhiteTile("white_tile", Material.ROCK);
 		TILEWHITECRACKED = new CrackedWhiteTile("cracked_white_tile", Material.ROCK);
 		TILEYELLOW = new YellowTile("yellow_tile", Material.ROCK);
 		TILEYELLOWCRACKED = new CrackedYellowTile("cracked_yellow_tile", Material.ROCK);
 		TILERED = new RedTile("red_tile", Material.ROCK);
 		TILEREDCRACKED = new CrackedRedTile("cracked_red_tile", Material.ROCK);
 		RAILINGGREEN = new GreenRailing50("green_railing_50", Material.ROCK);
 		STAIRSCONCRETELEFT50 = new ConcreteStairsLeft50("concrete_stairs_left_50", Material.ROCK);
 		STAIRSCONCRETEMIDDLE50 = new ConcreteStairsMiddle50("concrete_stairs_middle_50", Material.ROCK);
 		STAIRSCONCRETERIGHT50 = new ConcreteStairsRight50("concrete_stairs_right_50", Material.ROCK);

 	} 
 	 
 	@SubscribeEvent 
 	public static void registerBlocks(RegistryEvent.Register<Block> event) {
 		event.getRegistry().registerAll(BRICKSRED50);
 		event.getRegistry().registerAll(BRICKSRED50CRACKED);
 		event.getRegistry().registerAll(BRICKSRED50R);
 		event.getRegistry().registerAll(BRICKSRED50RCRACKED);
 		event.getRegistry().registerAll(BRICKSSILICATE50);
 		event.getRegistry().registerAll(BRICKSSILICATE50CRACKED);
 		event.getRegistry().registerAll(BLOCKSCONCRETE50);
 		event.getRegistry().registerAll(CONCRETE50);
 		event.getRegistry().registerAll(SLABWALLCONCRETE50);
 		event.getRegistry().registerAll(TILEWHITE);
 		event.getRegistry().registerAll(TILEWHITECRACKED);
 		event.getRegistry().registerAll(TILEYELLOW);
 		event.getRegistry().registerAll(TILEYELLOWCRACKED);
 		event.getRegistry().registerAll(TILERED);
 		event.getRegistry().registerAll(TILEREDCRACKED);
 		event.getRegistry().registerAll(RAILINGGREEN);
 		event.getRegistry().registerAll(STAIRSCONCRETELEFT50);
 		event.getRegistry().registerAll(STAIRSCONCRETEMIDDLE50);
 		event.getRegistry().registerAll(STAIRSCONCRETERIGHT50);
 		 
 	} 
 	 
 	@SubscribeEvent 
 	public static void registerItemBlocks(RegistryEvent.Register<Item> event) { 
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50).setRegistryName(BRICKSRED50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50CRACKED).setRegistryName(BRICKSRED50CRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50R).setRegistryName(BRICKSRED50R.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSRED50RCRACKED).setRegistryName(BRICKSRED50RCRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSSILICATE50).setRegistryName(BRICKSSILICATE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BRICKSSILICATE50CRACKED).setRegistryName(BRICKSSILICATE50CRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(BLOCKSCONCRETE50).setRegistryName(BLOCKSCONCRETE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(CONCRETE50).setRegistryName(CONCRETE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(SLABWALLCONCRETE50).setRegistryName(SLABWALLCONCRETE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEWHITE).setRegistryName(TILEWHITE.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEWHITECRACKED).setRegistryName(TILEWHITECRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEYELLOW).setRegistryName(TILEYELLOW.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEYELLOWCRACKED).setRegistryName(TILEYELLOWCRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILERED).setRegistryName(TILERED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(TILEREDCRACKED).setRegistryName(TILEREDCRACKED.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(RAILINGGREEN).setRegistryName(RAILINGGREEN.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(STAIRSCONCRETELEFT50).setRegistryName(STAIRSCONCRETELEFT50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(STAIRSCONCRETEMIDDLE50).setRegistryName(STAIRSCONCRETEMIDDLE50.getRegistryName()));
 		event.getRegistry().registerAll(new ItemBlock(STAIRSCONCRETERIGHT50).setRegistryName(STAIRSCONCRETERIGHT50.getRegistryName()));
 		 
 	}
 	 
 	@SubscribeEvent 
 	public static void registerRenders(ModelRegistryEvent event) { 
 		registerRender(Item.getItemFromBlock(BRICKSRED50));
 		registerRender(Item.getItemFromBlock(BRICKSRED50CRACKED));
 		registerRender(Item.getItemFromBlock(BRICKSRED50R));
 		registerRender(Item.getItemFromBlock(BRICKSRED50RCRACKED));
 		registerRender(Item.getItemFromBlock(BRICKSSILICATE50));
 		registerRender(Item.getItemFromBlock(BRICKSSILICATE50CRACKED));
 		registerRender(Item.getItemFromBlock(BLOCKSCONCRETE50));
 		registerRender(Item.getItemFromBlock(CONCRETE50));
 		registerRender(Item.getItemFromBlock(SLABWALLCONCRETE50));
 		registerRender(Item.getItemFromBlock(TILEWHITE));registerRender(Item.getItemFromBlock(TILEWHITECRACKED));
 		registerRender(Item.getItemFromBlock(TILEYELLOW));registerRender(Item.getItemFromBlock(TILEYELLOWCRACKED));
 		registerRender(Item.getItemFromBlock(TILERED));registerRender(Item.getItemFromBlock(TILEREDCRACKED));
 		registerRender(Item.getItemFromBlock(RAILINGGREEN));
		registerRender(Item.getItemFromBlock(STAIRSCONCRETELEFT50));
		registerRender(Item.getItemFromBlock(STAIRSCONCRETEMIDDLE50));
		registerRender(Item.getItemFromBlock(STAIRSCONCRETERIGHT50));
 		 
 	} 
 	 
 	public static void registerRender(Item item) { 
 		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory")); 
 		 
 	} 
} 
