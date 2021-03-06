package com.hypeirochus.scmc.items.metaitems;

import java.util.List;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.EnumMetaItem.FocuserType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPsiBladeFocuserUncharged extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemPsiBladeFocuserUncharged() {
		setUnlocalizedName("protoss.focuser");
		setRegistryName("protoss.focuser");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < FocuserType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link FocuserType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < FocuserType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + FocuserType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + FocuserType.AIUR.getName();
	}
}