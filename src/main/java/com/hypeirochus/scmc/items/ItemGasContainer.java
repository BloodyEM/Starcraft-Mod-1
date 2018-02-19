package com.hypeirochus.scmc.items;

import java.awt.Container;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.ContainerType;
import com.hypeirochus.scmc.enums.MetaHandler.MineralType;
import com.hypeirochus.scmc.enums.MetaHandler.VespeneType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemGasContainer extends StarcraftItem {

	public ItemGasContainer() {
		super("container");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < ContainerType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}

		if(tab == StarcraftCreativeTabs.PROTOSS)
			items.add(new ItemStack(this, 1, 0));
		if(tab == StarcraftCreativeTabs.TERRAN)
			items.add(new ItemStack(this, 1, 1));
		if(tab == StarcraftCreativeTabs.ZERG)
			items.add(new ItemStack(this, 1, 2));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ContainerType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ContainerType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ContainerType.PROTOSS.getName();
	}
}