package hypeirochus.api.world.tile;

import net.minecraft.util.EnumFacing;

public interface IRotatableXAxis {
	public EnumFacing getRotationXAxis();

	public void setRotationXAxis(EnumFacing facing);
}