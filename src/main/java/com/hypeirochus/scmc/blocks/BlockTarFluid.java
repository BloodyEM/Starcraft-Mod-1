package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.handlers.FluidHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Acid fluid. Hurts entities that come into contact<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockTarFluid extends BlockFluidClassic {

	public BlockTarFluid() {
		super(FluidHandler.TAR, Material.WATER);
		setUnlocalizedName("fluid.tar");
		setRegistryName("fluid.tar");
		setCreativeTab(null);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.BLACK;
	}

	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		entityIn.setInWeb();
	}
}
