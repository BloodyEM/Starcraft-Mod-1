package ga.scmc.worldgen.dimslayn;

import com.arisux.mdx.lib.client.render.world.IClimateProvider;
import com.arisux.mdx.lib.client.render.world.ICloudProvider;
import com.arisux.mdx.lib.client.render.world.IStormProvider;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderSlayn extends WorldProvider implements IClimateProvider {
	
	private StormProviderSlayn storm = new StormProviderSlayn();
    private CloudProviderSlayn clouds = new CloudProviderSlayn();
	private IRenderHandler skyRenderer;
    private IRenderHandler climateProvider;

    @SideOnly(Side.CLIENT)
    @Override
    public IRenderHandler getWeatherRenderer()
    {
        return null;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IRenderHandler getCloudRenderer()
    {
        return climateProvider == null ? climateProvider = new CloudProviderSlayn() : climateProvider;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IRenderHandler getSkyRenderer()
    {
        return skyRenderer == null ? skyRenderer = new RenderSkySlayn() : skyRenderer;
    }

    @Override
    public void onWorldUpdateEntities()
    {
        super.onWorldUpdateEntities();
    }

    @Override
    public void updateWeather()
    {
        super.updateWeather();
    }
    
    @Override
	protected void createBiomeProvider() {
		biomeProvider = new SlaynBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderSlayn(world);
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		
		//Always true
		if(this instanceof WorldProviderSlayn) {
			return "Leaving Slayn";
		}
		
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.slayn_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_SLAYN;
	}
	
	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		
		//Always true
		if(this instanceof WorldProviderSlayn) {
			return "Entering Slayn";
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