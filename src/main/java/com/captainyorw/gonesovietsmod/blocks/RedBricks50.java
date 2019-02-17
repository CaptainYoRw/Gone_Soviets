package com.captainyorw.gonesovietsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;
import java.util.List;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

public class RedBricks50 extends Block{

	public RedBricks50(String name, Material material) {
		super(material);  
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(10f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(30);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setLightOpacity(255);
	}	
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("§oCeramic"));
		tooltip.add(I18n.format("§4Nutmeg"));
    }
	
	//@Override
	//public BlockRenderLayer getBlockLayer()
    //{
       // return BlockRenderLayer.TRANSLUCENT;
   // }
	
	//@Override
   // public boolean isOpaqueCube(IBlockState state) {
     //   return false;
   // }
	
}
