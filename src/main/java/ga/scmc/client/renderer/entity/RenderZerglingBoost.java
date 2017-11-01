package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingBoostColor;
import ga.scmc.client.renderer.entity.layers.LayerZerglingBoostGlowStatic;
import ga.scmc.client.renderer.model.ModelZerglingBoost;
import ga.scmc.entity.living.EntityZerglingBoost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//You know the drill; no more of these comments
public class RenderZerglingBoost<T> extends RenderLiving<EntityZerglingBoost> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGBOOST_BASE);
	protected ModelZerglingBoost model;

	public RenderZerglingBoost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingBoost) mainModel);
		addLayer(new LayerZerglingBoostColor(this));
		addLayer(new LayerZerglingBoostGlowStatic(this));
	}

	@Override
	public void doRender(EntityZerglingBoost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingBoost entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingBoost entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}
}