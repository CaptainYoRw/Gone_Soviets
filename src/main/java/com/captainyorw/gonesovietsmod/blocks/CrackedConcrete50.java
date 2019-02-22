package com.captainyorw.gonesovietsmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class CrackedConcrete50 extends BlockDirectional{
	
	public static final PropertyEnum<CrackedConcrete50.EnumParts> PARTS = PropertyEnum.<CrackedConcrete50.EnumParts>create("part", CrackedConcrete50.EnumParts.class);
	
	public CrackedConcrete50(String name, Material material) {
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(11f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(28);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab); // By default none of the sides are connected.
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(PARTS, CrackedConcrete50.EnumParts.FULL));
		setLightOpacity(6);
	}
	
	public static enum EnumParts implements IStringSerializable
    {
		FULL,
        TOP,
        MIDDLE,
        BOTTOM;

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
        	if (this == FULL)
        		return "full";
        	if (this == TOP)
        		return "top";
        	if (this == MIDDLE)
        		return "middle";
        	if (this == BOTTOM)
        		return "bottom";
        	return null;
        }
    }
	    
	    @Override
	    public IBlockState getActualState (IBlockState state, IBlockAccess world, BlockPos position) {
			IBlockState iblockstate = world.getBlockState(position);
	    	Block up_state = world.getBlockState(position.offset((EnumFacing)state.getValue(FACING))).getBlock();
	    	Block down_state = world.getBlockState(position.offset((EnumFacing)state.getValue(FACING), -1)).getBlock();
	    	if(up_state == this && down_state == this) {
	    		iblockstate = iblockstate.withProperty(PARTS, CrackedConcrete50.EnumParts.MIDDLE);
	    	}
	    	else if(up_state == this) {
	    		iblockstate = iblockstate.withProperty(PARTS, CrackedConcrete50.EnumParts.BOTTOM);	
	    	}
	    	else if(down_state == this) {
	    		iblockstate = iblockstate.withProperty(PARTS, CrackedConcrete50.EnumParts.TOP);	
	    	}
	    	else {
	    		iblockstate = iblockstate.withProperty(PARTS, CrackedConcrete50.EnumParts.FULL);	
	    	}
	    	return iblockstate;
	    }
	
	    @Override
	    public boolean isOpaqueCube(IBlockState state) 
	    {
	        return false;
	    }
	    
	    @Override
	    public boolean isTopSolid(IBlockState state)
	    {
	        return true;
	    }
	
		@Override
		public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			super.addInformation(stack, worldIn, tooltip, flagIn);

			tooltip.add(I18n.format("Some description"));
	}
		
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
	        return EnumBlockRenderType.MODEL;
	    }
		
		@Override
	    public IBlockState getStateFromMeta(int meta) {
			
			return this.getDefaultState().withProperty(FACING, getFacing(meta)).withProperty(PARTS, (meta & 4) > 0 ? CrackedConcrete50.EnumParts.FULL : CrackedConcrete50.EnumParts.MIDDLE).withProperty(PARTS, (meta & 8) > 0 ? CrackedConcrete50.EnumParts.TOP : CrackedConcrete50.EnumParts.BOTTOM);
	    }

	    @Override
	    public int getMetaFromState(IBlockState state) {
	    	int i = 0;
	        if (state.getValue(PARTS) == CrackedConcrete50.EnumParts.FULL)
            {
                i = i |= 4;
            } 
	        
	        if (state.getValue(PARTS) == CrackedConcrete50.EnumParts.TOP)
            {
                i = i |= 8;
            } 
	       
	        i |= state.getValue(FACING).getIndex();
	        return i;
	    }

	    @Override
	    protected BlockStateContainer createBlockState() {
	    	
	    	return new BlockStateContainer(this, new IProperty[] {FACING, PARTS});
	    }
	    
	    @Override
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	    	return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
	    }
	    
	    @Nullable
	    public static EnumFacing getFacing(int meta)
	    {
	        int i = meta & 7;
	        return i > 5 ? null : EnumFacing.getFront(i);
	    }
}
	    

		
		

		    
		    



