package com.captainyorw.gonesovietsmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.captainyorw.gonesovietsmod.GoneSovietsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ConcreteStairsMiddle50 extends Block{
	//1:16 = 0.0625
	//(x1, y1, z1, x2, y2, z2)
    public static final AxisAlignedBB BOUNDING_BOX_STAIRS = new AxisAlignedBB(0, 0, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
    
    public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_1 = new AxisAlignedBB(0, 0, 0, 0.0625 * 4, 0.0625 * 4, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_2 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 4, 0, 0.0625 * 8, 0.0625 * 8, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_3 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 8, 0, 0.0625 * 12, 0.0625 * 12, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_4 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 12, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
	
    public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_1 = new AxisAlignedBB(0.0625 * 16, 0, 0.0625 * 16, 0.0625 * 12, 0.0625 * 4, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_2 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 4, 0.0625 * 16, 0.0625 * 8, 0.0625 * 8, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_3 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 8, 0.0625 * 16, 0.0625 * 4, 0.0625 * 12, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_4 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 12, 0.0625 * 16, 0, 0.0625 *16, 0);

	public static final AxisAlignedBB COLLISION_BOX_STAIR_NORTH_1 = new AxisAlignedBB(0, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 4, 0.0625 * 12);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_NORTH_2 = new AxisAlignedBB(0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 16, 0.0625 * 8, 0.0625 * 8);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_NORTH_3 = new AxisAlignedBB(0, 0.0625 * 8, 0.0625 * 8, 0.0625 * 16, 0.0625 * 12, 0.0625 * 4);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_NORTH_4 = new AxisAlignedBB(0, 0.0625 * 12, 0.0625 * 4, 0.0625 * 16, 0.0625 * 16, 0);

    public static final AxisAlignedBB COLLISION_BOX_STAIR_SOUTH_1 = new AxisAlignedBB(0, 0, 0, 0.0625 * 16, 0.0625 * 4, 0.0625 * 4);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_SOUTH_2 = new AxisAlignedBB(0, 0.0625 * 4, 0.0625 * 4, 0.0625 * 16, 0.0625 * 8, 0.0625 * 8);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_SOUTH_3 = new AxisAlignedBB(0, 0.0625 * 8, 0.0625 * 8, 0.0625 * 16, 0.0625 * 12, 0.0625 * 12);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_SOUTH_4 = new AxisAlignedBB(0, 0.0625 * 12, 0.0625 * 12, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public ConcreteStairsMiddle50(String name, Material material) {
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(15.5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(47);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		setLightOpacity(255);
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
	        return BOUNDING_BOX_STAIRS;
	    }
		
		@Override
	    public IBlockState getStateFromMeta(int meta) {
	        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	    }

	    @Override
	    public int getMetaFromState(IBlockState state) {
	        return state.getValue(FACING).getHorizontalIndex();
	    }

	    @Override
	    protected BlockStateContainer createBlockState() {
	        return new BlockStateContainer(this, FACING);
	    }
	    
	    @Override
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
	        iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing());
	        return iblockstate;
		}
		   
	    
	    @Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
	    	
	    	switch(state.getValue(FACING)) {
	    	    
	    	    default:
	    	    	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_4);
	        	    break;
	    	
	            case EAST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_4);
	        	    break;
	        	    
	            case WEST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_1);
	    			addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_2);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_3);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_4);
	        	    break;
	        	    
	            case NORTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_NORTH_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_NORTH_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_NORTH_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_NORTH_4);
	        	    break;
	        	    
	            case SOUTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_SOUTH_1);
	    			addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_SOUTH_2);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_SOUTH_3);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_SOUTH_4);
	        	    break;    
	    	}    	
	    }
}
	    

		
		

		    
		    


