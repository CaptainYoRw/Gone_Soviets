package com.captainyorw.gonesovietsmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class GreenRailing50 extends Block{
	//1:16 = 0.0625
	//(x1, y1, z1, x2, y2, z2)
    public static final AxisAlignedBB BOUNDING_BOX_EAST = new AxisAlignedBB(0.0625 * 16, 0, 0, 0.0625 * 14, 0.0625 * 13, 0.0625 * 16);
    public static final AxisAlignedBB BOUNDING_BOX_WEST = new AxisAlignedBB(0, 0, 0, 0.0625 * 2, 0.0625 * 13, 0.0625 * 16);
    public static final AxisAlignedBB BOUNDING_BOX_NORTH = new AxisAlignedBB(0, 0, 0, 0.0625 * 16, 0.0625 * 13, 0.0625 * 2);
    public static final AxisAlignedBB BOUNDING_BOX_SOUTH = new AxisAlignedBB(0, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 13, 0.0625 * 14);
    
    public static final AxisAlignedBB COLLISION_BOX_EAST = new AxisAlignedBB(0.0625 * 15.5, 0, 0, 0.0625 * 14.5, 0.0625 * 21, 0.0625 * 16);
    public static final AxisAlignedBB COLLISION_BOX_WEST = new AxisAlignedBB(0.0625 * 0.5, 0, 0, 0.0625 * 1.5, 0.0625 * 21, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_NORTH = new AxisAlignedBB(0, 0, 0.0625 * 0.5, 0.0625 * 16, 0.0625 * 21, 0.0625 * 1.5);
    public static final AxisAlignedBB COLLISION_BOX_SOUTH = new AxisAlignedBB(0, 0, 0.0625 * 15.5, 0.0625 * 16, 0.0625 * 21, 0.0625 * 14.5);
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public static final PropertyEnum<GreenRailing50.EnumRotationPosition> ROTATION = PropertyEnum.<GreenRailing50.EnumRotationPosition>create("rotation", GreenRailing50.EnumRotationPosition.class);
	
	public GreenRailing50(String name, Material material) {
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(12.5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(24);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ROTATION, GreenRailing50.EnumRotationPosition.LEFT));
	}
	
	   public static enum EnumRotationPosition implements IStringSerializable
	    {
	        LEFT,
	        RIGHT;

	        public String toString()
	        {
	            return this.getName();
	        }

	        public String getName()
	        {
	            return this == LEFT ? "left" : "right";
	        }
	    }
	
	    @Override
	    public boolean isOpaqueCube(IBlockState state) {
	        return false;
	    }

	    @Override
	    public boolean isFullCube(IBlockState state) {
	        return false;
	    }
	
		@Override
		public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			super.addInformation(stack, worldIn, tooltip, flagIn);

			tooltip.add(I18n.format("Some description"));
	}
		
		public EnumBlockRenderType getRenderType(IBlockState state) {
	        return EnumBlockRenderType.MODEL;
	    }
			
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			
			switch(state.getValue(FACING)) {
			
			    default:
			        return BOUNDING_BOX_EAST;
			        
			    case EAST:    
			    	return BOUNDING_BOX_EAST;
			    	
			    case WEST:
			    	return BOUNDING_BOX_WEST;
			    	
			    case NORTH:
			    	return BOUNDING_BOX_NORTH;
			    	
			    case SOUTH:	
			    	return BOUNDING_BOX_SOUTH;
			}
	    }
		
		@Override
	    public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta & 3)).withProperty(ROTATION, (meta & 4) > 0 ? GreenRailing50.EnumRotationPosition.RIGHT : GreenRailing50.EnumRotationPosition.LEFT);
	    }

	    @Override
	    public int getMetaFromState(IBlockState state) {
	        int i = 0;
	        if (state.getValue(ROTATION) == GreenRailing50.EnumRotationPosition.LEFT)
            {
                i = i |= 4;
            } 
	       
	        i |= state.getValue(FACING).getHorizontalIndex();
	        return i;
	    }

	    @Override
	    protected BlockStateContainer createBlockState() {
	        return new BlockStateContainer(this, FACING, ROTATION);
	        
	    }
	    
	    @Override
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
	        iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing());
	        
	        EnumFacing enumfacing = EnumFacing.fromAngle((double)placer.rotationYaw);
            int i = enumfacing.getFrontOffsetX();
            int j = enumfacing.getFrontOffsetZ();              
            boolean LEFT = i < 0 && hitZ < 0.5F || i > 0 && hitZ > 0.5F || j < 0 && hitX > 0.5F || j > 0 && hitX < 0.5F; 
            iblockstate = iblockstate.withProperty(ROTATION, LEFT ? EnumRotationPosition.LEFT : EnumRotationPosition.RIGHT);
            /*
             * same as:
             * if(LEFT) {
               iblockstate = iblockstate.withProperty(LEFT)
               } Else {
               iblockstate = iblockstaye.withProperty(RIGHT)
               }
             */
            return iblockstate;
	    }
	    
	    
	    
	    @Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
	    	
	    	switch(state.getValue(FACING)) {
	    	    
	    	    default:
	    	    	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_EAST);
	        	    break;
	    	
	            case EAST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_EAST);
	        	    break;
	        	    
	            case WEST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_WEST);
	        	    break;
	        	    
	            case NORTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_NORTH);
	        	    break;
	        	    
	            case SOUTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_SOUTH);
	        	    break;    
	    	}    	
	    }
	    
}
	    

		
		

		    
		    



