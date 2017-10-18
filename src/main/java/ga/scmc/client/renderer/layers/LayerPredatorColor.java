package ga.scmc.client.renderer.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.entity.RenderPredator;
import ga.scmc.entity.living.EntityPredator;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerPredatorColor<T extends EntityPredator> implements LayerRenderer<T> {

	private static final ResourceLocation CYBERCAT_LAYER_COLOR = new ResourceLocation(Library.RL_BASE + "textures/entity/cybercat_overlay.png");
	private final RenderPredator<T> cybercatRenderer;

	public LayerPredatorColor(RenderPredator<T> cybercatRendererIn) {
		this.cybercatRenderer = cybercatRendererIn;
	}

	public void doRenderLayer(EntityPredator entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.cybercatRenderer.bindTexture(CYBERCAT_LAYER_COLOR);
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR() / 255, entitylivingbaseIn.getTeamColor().getG() / 255, entitylivingbaseIn.getTeamColor().getB() / 255);
		this.cybercatRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		GlStateManager.resetColor();
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}