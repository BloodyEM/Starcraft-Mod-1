package com.hypeirochus.scmc.items.tools;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolAxe extends ItemAxe {

	public ToolAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
	}
}