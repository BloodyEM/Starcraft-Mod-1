package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerProbe;
import ga.scmc.entity.living.EntityProbe;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProbe<T> extends RenderLiving<EntityProbe> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/probe.png");
	protected ModelProbe model;

	public RenderProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelProbe) mainModel);
		addLayer(new LayerProbe(this));
	}

	@Override
	public void doRender(EntityProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProbe entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}
}
