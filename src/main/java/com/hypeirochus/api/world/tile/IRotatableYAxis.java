package com.hypeirochus.api.world.tile;

import net.minecraft.util.EnumFacing;

public interface IRotatableYAxis {
	public EnumFacing getRotationYAxis();

	public void setRotationYAxis(EnumFacing facing);
}