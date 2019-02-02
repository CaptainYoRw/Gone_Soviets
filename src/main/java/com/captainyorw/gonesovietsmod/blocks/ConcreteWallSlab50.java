package com.captainyorw.gonesovietsmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class ConcreteWallSlab50 extends Block{
	//1:16 = 0.0625
	//(x1, y1, z1, x2, y2, z2)
    public static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0.0625 * 12, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0, 0.0625 * 12, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
	
	public ConcreteWallSlab50(String name, Material material) {
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(18f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(55);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setLightOpacity(255);
	}
	
		@Override
		public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			super.addInformation(stack, worldIn, tooltip, flagIn);

			tooltip.add(I18n.format("Some description"));
		}
		
	    @Override
	    public boolean isOpaqueCube(IBlockState state) {
	        return false;
	    }

	    @Override
	    public boolean isFullCube(IBlockState state) {
	        return false;
	    }
		
		public EnumBlockRenderType getRenderType(IBlockState state) {
	        return EnumBlockRenderType.MODEL;
	    }
		
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	        return BOUNDING_BOX;
	    }
		
		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
	    	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
		}
	
}

    	        
        	

	    

		
		

		    
		    


