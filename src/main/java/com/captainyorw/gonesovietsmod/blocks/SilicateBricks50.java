package com.captainyorw.gonesovietsmod.blocks;

import java.util.List;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilicateBricks50 extends Block{

	public SilicateBricks50(String name, Material material) {
		super(material);  
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(8f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(27);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
	}
	
		@Override
		public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			super.addInformation(stack, worldIn, tooltip, flagIn);

			tooltip.add(I18n.format("Some description"));
	}
	

}
