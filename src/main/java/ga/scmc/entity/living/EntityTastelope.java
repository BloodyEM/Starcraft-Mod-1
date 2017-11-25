package ga.scmc.entity.living;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTastelope extends EntityCreature {

	public EntityTastelope(World world) {
		super(world);
		setSize(1.0F, 1.5F);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000298023224D);
	}
	
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		//ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.PROTOSS_INGOT, 1 + this.rand.nextInt(2), EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		//drop.tryDrop(this);
	}
}