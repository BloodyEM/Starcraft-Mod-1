package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderHydraliskPrimal;
import ga.scmc.entity.living.EntityHydraliskPrimal;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerHydraliskPrimalColor<T extends EntityHydraliskPrimal> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISKPRIMAL_OVERLAY);
	private final RenderHydraliskPrimal<T> RENDERER;

	public LayerHydraliskPrimalColor(RenderHydraliskPrimal<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityHydraliskPrimal entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}