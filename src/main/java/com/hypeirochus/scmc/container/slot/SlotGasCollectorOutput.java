package com.hypeirochus.scmc.container.slot;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class SlotGasCollectorOutput extends SlotItemHandler {

	public SlotGasCollectorOutput(IItemHandler handler, int slotIndex, int xPosition, int yPosition) {
		super(handler, slotIndex, xPosition, yPosition);
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the
	 * armor slots.
	 */
	@Override
	public boolean isItemValid(@Nullable ItemStack stack) {
		return false;
	}
}