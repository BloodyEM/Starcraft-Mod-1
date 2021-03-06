package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Dark Protoss Energy Channel block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * 
 * @author Hypeirochus
 */
public class BlockProtossEnergyChannelVoid extends Block {

	public BlockProtossEnergyChannelVoid() {
		super(Material.IRON, MapColor.LIME);
		setUnlocalizedName("protoss.energychannel.void");
		setRegistryName("protoss.energychannel.void");
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setLightLevel(1.0F);
		setResistance(15.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Gets the state of the block being dropped
	 * 
	 * @param state
	 *            the state of the block
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return 1;
	}

	/**
	 * Returns the item dropped by this block
	 * 
	 * @param state
	 *            the state of the block
	 * @param rand
	 *            an object of the Random class
	 * @param fortune
	 *            the magnitude of the fortune enchantment effect
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.ENERGY;
	}
}
