package com.captainyorw.gonesovietsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

public class CrackedRedBricks50 extends Block{

	public CrackedRedBricks50(String name, Material material) {
		super(material);  
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(7.5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(23);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setLightOpacity(255);
	}	
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("Some description"));
    }
	
}
