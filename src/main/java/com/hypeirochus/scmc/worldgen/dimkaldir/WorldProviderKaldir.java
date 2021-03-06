package com.hypeirochus.scmc.worldgen.dimkaldir;

import com.hypeirochus.api.client.render.world.IClimateProvider;
import com.hypeirochus.api.client.render.world.ICloudProvider;
import com.hypeirochus.api.client.render.world.IStormProvider;
import com.hypeirochus.scmc.handlers.ConfigHandler;
import com.hypeirochus.scmc.handlers.DimensionHandler;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderKaldir extends WorldProvider implements IClimateProvider {

	private StormProviderKaldir	storm	= new StormProviderKaldir();
	private CloudProviderKaldir	clouds	= new CloudProviderKaldir();
	private IRenderHandler		skyRenderer;
	private IRenderHandler		climateProvider;

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getWeatherRenderer() {
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getCloudRenderer() {
		return climateProvider == null ? climateProvider = new CloudProviderKaldir() : climateProvider;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getSkyRenderer() {
		return skyRenderer == null ? skyRenderer = new RenderSkyKaldir() : skyRenderer;
	}

	@Override
	public void onWorldUpdateEntities() {
		super.onWorldUpdateEntities();
	}

	@Override
	public void updateWeather() {
		super.updateWeather();
	}

	@Override
	protected void createBiomeProvider() {
		biomeProvider = new KaldirBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderKaldir(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	/**
	 * A Message to display to the user when they transfer out of this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {

		// Always true
		if (this instanceof WorldProviderKaldir) {
			return "Leaving Kaldir";
		}

		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float var1, float var2) {
		return new Vec3d(.65D, 0.95D, 0.95D);
	}

	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return new Vec3d(.65D, 0.95D, 0.95D);
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.kaldir_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * 
	 * @param player
	 *            The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return ConfigHandler.INT_DIMENSION_KALDIR;
	}

	/**
	 * A message to display to the user when they transfer to this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {

		// Always true
		if (this instanceof WorldProviderKaldir) {
			return "Entering Kaldir";
		}

		return null;
	}

	@Override
	public ICloudProvider getCloudProvider() {
		return clouds;
	}

	@Override
	public IStormProvider getStormProvider() {
		return storm;
	}
}
