package com.hypeirochus.scmc.items.structurespawns;

import java.util.Random;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.worldgen.structure.StructureProtossWarpGateTemplate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossWarpGateSpawner extends Item {

	public ItemProtossWarpGateSpawner() {
		setUnlocalizedName("protoss.spawner.warpgate");
		setRegistryName("protoss.spawner.warpgate");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		StructureProtossWarpGateTemplate PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		Random rand = new Random();
		PROTOSS_WARPGATE.generate(0, 3, worldIn, rand, 0, 0, 0, pos, false);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundHandler.STRUC_GATEWAY_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}