package com.hypeirochus.scmc.items.structurespawns;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossCyberneticsCoreSpawner extends Item {

	public ItemProtossCyberneticsCoreSpawner() {
		setUnlocalizedName("protoss.spawner.cyberneticscore");
		setRegistryName("protoss.spawner.cyberneticscore");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		StructureProtossCyberneticsCoreTemplate CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		CYBERNETICS_CORE.generate_r0(0, 3, worldIn, 0, 0, 0, pos, false);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundHandler.STRUC_CYBERNETICSCORE_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}