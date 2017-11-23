package ga.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.element.LarvaOption;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageMorphLarva;
import ga.scmc.network.message.MessageSyncLarvaGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.InventoryUtils;
import ocelot.api.utils.SoundUtils;
import ocelot.api.utils.TextureUtils;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiLarvaMorph extends BasicGui {

	public static final GuiLarvaMorph INSTANCE = new GuiLarvaMorph();
	/** The player being traded with. */
	private EntityPlayer customer;
	private EntityLarva larva;

	public GuiLarvaMorph(EntityPlayer player) {
		this.customer = player;
	}

	public GuiLarvaMorph() {
	}

	@Override
	public void initGui() {
		xSize = 104;
		ySize = 68;
		super.initGui();
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		bindGuiTexture();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawCenterLayer(int mouseX, int mouseY) {

	}

	public void openGUI(EntityPlayer player, Object mod, int guiID, World world, int x, int y, int z, EntityLarva larva) {
		player.openGui(Starcraft.instance, guiID, world, x, y, z);
		setLarva(larva);
		NetworkHandler.sendToClient(new MessageSyncLarvaGui(larva));
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int index = 5 * i + j;
				if (index < GuiLists.LARVA_OPTIONS.size()) {
					LarvaOption option = GuiLists.LARVA_OPTIONS.get(index);
					bindIconTexture();
					drawTexturedModalRect(8 + j * 18, 8 + i * 18, (option.getIconId() % 16) * 16, (option.getIconId() / 16) * 16, 16, 16);
				}
			}
		}
	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int index = 5 * i + j;
				if (index < GuiLists.LARVA_OPTIONS.size()) {
					List<String> tooltip = new ArrayList<String>();
					for (int i2 = 0; i2 < GuiLists.LARVA_OPTIONS.get(index).getTooltip().size(); i2++) {
						tooltip.add(GuiLists.LARVA_OPTIONS.get(index).getTooltip().get(i2));
					}
					tooltip.add("");
					tooltip.add(TextFormatting.GRAY + "Mineral Cost: " + GuiLists.LARVA_OPTIONS.get(index).getMineralCost());
					tooltip.add(TextFormatting.GRAY + "Vespene Cost: " + GuiLists.LARVA_OPTIONS.get(index).getVespeneCost());
					drawTooltip(tooltip, guiLeft + 7 + j * 18, guiTop + 7 + i * 18, 17, 18, mouseX, mouseY);
				}
			}
		}
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);

		if (mouseButton == 0) {
			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 5; x++) {
					int index = 5 * y + x;
					if (index < GuiLists.LARVA_OPTIONS.size()) {
						if (GuiUtils.isMouseInside(guiLeft + 7 + x * 18, guiTop + 7 + y * 18, 17, 18, mouseX, mouseY)) {
							SoundUtils.playButtonClick();
							EntityPlayer player = Minecraft.getMinecraft().player;
							if (InventoryUtils.hasItemAndAmount(player, ItemHandler.MINERAL_SHARD, GuiLists.LARVA_OPTIONS.get(index).getMineralCost(), 0) && InventoryUtils.hasItemAndAmount(player, ItemHandler.VESPENE, GuiLists.LARVA_OPTIONS.get(index).getVespeneCost())) {
								InventoryUtils.removeItemWithAmount(player, ItemHandler.MINERAL_SHARD, GuiLists.LARVA_OPTIONS.get(index).getMineralCost(), 0);
								InventoryUtils.removeItemWithAmount(player, ItemHandler.VESPENE, GuiLists.LARVA_OPTIONS.get(index).getVespeneCost(), 0);
								NetworkHandler.sendToServer(new MessageMorphLarva(larva, index));
							}
							return;
						}
					}
				}
			}
		}
	}

	@Override
	public void updateScreen() {
		if (larva.isDead) {
			Minecraft.getMinecraft().player.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void bindGuiTexture() {
		TextureUtils.bindTexture("textures/gui/larva.png");
	}

	private void bindIconTexture() {
		TextureUtils.bindTexture("textures/gui/larva_icons.png");
	}

	public EntityLarva getLarva() {
		return larva;
	}

	public void setLarva(EntityLarva larva) {
		this.larva = larva;
	}
}