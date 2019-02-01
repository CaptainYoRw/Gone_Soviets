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


public class ConcreteStairsLeft extends Block{
	//1:16 = 0.0625
	//(x1, y1, z1, x2, y2, z2)
    public static final AxisAlignedBB B0UNDING_BOX_STAIRS = new AxisAlignedBB(0, 0, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
    
    public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_1 = new AxisAlignedBB(0, 0, 0, 0.0625 * 4, 0.0625 * 4, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_2 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 4, 0, 0.0625 * 8, 0.0625 * 8, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_3 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 8, 0, 0.0625 * 12, 0.0625 * 12, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_EAST_4 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 12, 0, 0.0625 * 16, 0.0625 * 16, 0.0625 * 16);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_1 = new AxisAlignedBB(0, 0.0625 * 4, 0.0625 * 0.5, 0.0625 * 1, 0.0625 * 21, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_2 = new AxisAlignedBB(0.0625 * 2, 0.0625 * 4, 0.0625 * 0.5, 0.0625 * 3, 0.0625 * 23, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_3 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 8, 0.0625 * 0.5, 0.0625 * 5, 0.0625 * 26, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_4 = new AxisAlignedBB(0.0625 * 6, 0.0625 * 8, 0.0625 * 0.5, 0.0625 * 7, 0.0625 * 28, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_5 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 12, 0.0625 * 0.5, 0.0625 * 9, 0.0625 * 31, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_6 = new AxisAlignedBB(0.0625 * 10, 0.0625 * 12, 0.0625 * 0.5, 0.0625 * 11, 0.0625 * 33, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_7 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 16, 0.0625 * 0.5, 0.0625 * 13, 0.0625 * 36, 0.0625 * 1.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_EAST_8 = new AxisAlignedBB(0.0625 * 14, 0.0625 * 16, 0.0625 * 0.5, 0.0625 * 15, 0.0625 * 38, 0.0625 * 1.5);
	
    public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_1 = new AxisAlignedBB(0.0625 * 16, 0, 0.0625 * 16, 0.0625 * 12, 0.0625 * 4, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_2 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 4, 0.0625 * 16, 0.0625 * 8, 0.0625 * 8, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_3 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 8, 0.0625 * 16, 0.0625 * 4, 0.0625 * 12, 0);
	public static final AxisAlignedBB COLLISION_BOX_STAIR_WEST_4 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 12, 0.0625 * 16, 0, 0.0625 *16, 0);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_1 = new AxisAlignedBB(0.0625 * 16, 0.0625 * 4, 0.0625 * 14.5, 0.0625 * 15, 0.0625 * 21, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_2 = new AxisAlignedBB(0.0625 * 14, 0.0625 * 4, 0.0625 * 14.5, 0.0625 * 13, 0.0625 * 23, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_3 = new AxisAlignedBB(0.0625 * 12, 0.0625 * 8, 0.0625 * 14.5, 0.0625 * 11, 0.0625 * 26, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_4 = new AxisAlignedBB(0.0625 * 10, 0.0625 * 8, 0.0625 * 14.5, 0.0625 * 9, 0.0625 * 28, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_5 = new AxisAlignedBB(0.0625 * 8, 0.0625 * 12, 0.0625 * 14.5, 0.0625 * 7, 0.0625 * 31, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_6 = new AxisAlignedBB(0.0625 * 6, 0.0625 * 12, 0.0625 * 14.5, 0.0625 * 5, 0.0625 * 33, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_7 = new AxisAlignedBB(0.0625 * 4, 0.0625 * 16, 0.0625 * 14.5, 0.0625 * 3, 0.0625 * 36, 0.0625 * 15.5);
	public static final AxisAlignedBB COLLISION_BOX_RAILING_WEST_8 = new AxisAlignedBB(0.0625 * 2, 0.0625 * 16, 0.0625 * 14.5, 0.0625 * 1, 0.0625 * 38, 0.0625 * 15.5);

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public ConcreteStairsLeft(String name, Material material) {
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(15.5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(47);
		setCreativeTab(GoneSovietsMod.gonesovietsmodtab);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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
	        return B0UNDING_BOX_STAIRS;
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
	    	
	    	switch ((EnumFacing)((IBlockState) blockState).getValue(FACING)) {
	    	    
	    	    default:
	    	    	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_1);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_5);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_6);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_7);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_8);
	        	    break;
	    	
	            case EAST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_1);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_5);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_6);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_7);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_8);
	        	    break;
	        	    
	            case WEST:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_1);
	    			addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_2);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_3);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_1);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_5);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_6);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_7);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_8);
	        	    break;
	            case NORTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_1);
	        		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_1);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_5);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_6);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_7);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_8);
	        	    break;
	        	    
	            case SOUTH:
	            	addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_1);
	    			addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_2);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_3);
	    	        addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_STAIR_WEST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_1);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_2);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_3);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_4);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_5);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_6);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_7);
	        	    addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_RAILING_EAST_8);
	        	    break;    
	    	}    	
    }
}
	    

		
		

		    
		    


