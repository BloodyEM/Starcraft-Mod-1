package ga.scmc.events;

import java.awt.Color;

import ga.scmc.api.CapabilityUtils;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ocelot.api.utils.InventoryUtils;
import ocelot.api.utils.TextureUtils;

/**
 * This class renders anything like text on the screen as an overlay.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class GuiRenderEventHandler extends Gui {

	/** The determines whether or not the helmet overlay should be rendered. */
	public static boolean renderHelmetOverlay = true;
	/** This is the maximum amount of shield the player has. */
	private static int maxShieldLevel = 10;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int width = scaledresolution.getScaledWidth();
		int height = scaledresolution.getScaledHeight();
		FontRenderer fontRenderer = mc.fontRendererObj;
		GlStateManager.enableBlend();

		if (!player.isSpectator()) {
			ItemStack itemstack = player.inventory.armorItemInSlot(3);
			if (mc.gameSettings.thirdPersonView == 0 && itemstack != null && itemstack.getItem() == ArmorHandler.TERRAN_MARINE_T1_HELMET && renderHelmetOverlay && event.getType() == ElementType.TEXT) {
				renderHelmetOverlay(scaledresolution);
				String ammo = "Ammo: " + InventoryUtils.getTotalAmmo(player, ItemHandler.BULLET_MAGAZINE);
				if (mc.player.isCreative())
					ammo = "Ammo: Infinite";
				fontRenderer.drawString(ammo, 15, height - 18, Color.WHITE.getRGB());

				for (int i = 0; i < 4; i++) {
					ItemStack stack = mc.player.inventory.armorItemInSlot(i);
					if (stack != null) {
						String damage = stack.getMaxDamage() - stack.getItemDamage() + "/" + stack.getMaxDamage();
						RenderHelper.enableGUIStandardItemLighting();
						mc.getRenderItem().renderItemAndEffectIntoGUI(stack, (width - 18 - mc.fontRendererObj.getStringWidth(damage)) - 18, (height - 20 - i * 18) - i);
						RenderHelper.disableStandardItemLighting();
						fontRenderer.drawString(damage, width - 18 - mc.fontRendererObj.getStringWidth(damage), height - 18 - i * 18, Color.WHITE.getRGB());
					}
				}
			}

			if (mc.playerController.shouldDrawHUD() && isWearingFullProtossArmor(player)) {
				GlStateManager.color(1, 1, 1, 1);
				TextureUtils.bindTexture("textures/gui/icons.png");
				ScaledResolution resolution = new ScaledResolution(mc);
				float x = resolution.getScaledWidth() / 2 - 91;
				float y = resolution.getScaledHeight() - 39;
				double shieldLevel = CapabilityUtils.getShield(player);

				for (int i = 0; i < maxShieldLevel; i++) {
					if (i < shieldLevel) {
						if (shieldLevel - (int) shieldLevel >= 0.5 && shieldLevel != 0 && i == (int) shieldLevel) {
							drawTexturedModalRect(x + i * 8, y, 9, 0, 9, 9);
						} else {
							if (i < (int) shieldLevel) {
								drawTexturedModalRect(x + i * 8, y, 0, 0, 9, 9);
							}
						}
					}
				}

				TextureUtils.bindTexture("minecraft", "textures/gui/icons.png");
			}
		}
	}

	public void renderHelmetOverlay(ScaledResolution scaledRes) {
		GlStateManager.pushMatrix();
		GlStateManager.disableDepth();
		GlStateManager.color(1, 1, 1, 1);
		TextureUtils.bindTexture("textures/gui/helmet_overlay.png");
		drawModalRectWithCustomSizedTexture(0, 0, 0, 0, scaledRes.getScaledWidth(), scaledRes.getScaledHeight(), scaledRes.getScaledWidth(), scaledRes.getScaledHeight());
		GlStateManager.enableDepth();
		GlStateManager.popMatrix();
	}

	@SubscribeEvent
	public void onHitEvent(LivingHurtEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			if (isWearingFullProtossArmor(player)) {
				if (CapabilityUtils.getShield(player) * 2 >= event.getAmount()) {
					CapabilityUtils.removeShield(player, event.getAmount() / 2);
					event.setCanceled(true);
					return;
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent event) {
		CapabilityUtils.setShield(event.player, CapabilityUtils.getShield(event.player));
	}

	public static boolean isWearingFullProtossArmor(EntityPlayer player) {
		boolean helmet = false;
		boolean chestplate = false;
		boolean leggings = false;
		boolean boots = false;
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

		if (head != null && head.getItem() == ArmorHandler.PROTOSS_T1_HELMET) {
			helmet = true;
		}
		if (chest != null && chest.getItem() == ArmorHandler.PROTOSS_T1_CHESTPLATE) {
			chestplate = true;
		}
		if (legs != null && legs.getItem() == ArmorHandler.PROTOSS_T1_LEGGINGS) {
			leggings = true;
		}
		if (feet != null && feet.getItem() == ArmorHandler.PROTOSS_T1_BOOTS) {
			boots = true;
		}

		return helmet && chestplate && leggings && boots;
	}

	public static int getMaxShieldLevel() {
		return maxShieldLevel;
	}
}