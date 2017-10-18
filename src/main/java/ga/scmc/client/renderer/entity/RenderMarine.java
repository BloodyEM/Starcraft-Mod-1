package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityMarine;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelMarine;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarine extends RenderLiving<EntityMarine> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/marine.png");
	protected ModelMarine model;

	public RenderMarine(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMarine) mainModel);
	}

	@Override
	public void doRender(EntityMarine entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMarine entity) {
		return TEXTURE;
	}
}