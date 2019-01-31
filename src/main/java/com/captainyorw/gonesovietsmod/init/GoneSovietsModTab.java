package com.captainyorw.gonesovietsmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoneSovietsModTab extends CreativeTabs {
	public GoneSovietsModTab(String label) {
		super("gonesovietsmodtab");
		this.setBackgroundImageName("gonesovietsmod.png");
		
	}	
        public ItemStack getTabIconItem() {
		return new ItemStack(GoneSovietsModItems.ICONITEM);
	}
}
       
