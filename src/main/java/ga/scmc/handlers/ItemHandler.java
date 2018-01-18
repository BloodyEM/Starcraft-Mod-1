package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.ItemC14GaussRifle;
import ga.scmc.items.ItemCarbotifier;
import ga.scmc.items.ItemFlamethrower;
import ga.scmc.items.ItemLog;
import ga.scmc.items.ItemMarineHelmetVisor;
import ga.scmc.items.ItemPhosphorus;
import ga.scmc.items.ItemStimpack;
import ga.scmc.items.ItemTest;
import ga.scmc.items.metaitems.ItemC14GaussRifleParts;
import ga.scmc.items.metaitems.ItemDust;
import ga.scmc.items.metaitems.ItemEnergy;
import ga.scmc.items.metaitems.ItemFlamethrowerParts;
import ga.scmc.items.metaitems.ItemGasContainer;
import ga.scmc.items.metaitems.ItemIngot;
import ga.scmc.items.metaitems.ItemKhaydarinCrystal;
import ga.scmc.items.metaitems.ItemMagazine;
import ga.scmc.items.metaitems.ItemMineralShard;
import ga.scmc.items.metaitems.ItemPledge;
import ga.scmc.items.metaitems.ItemProtossIngot;
import ga.scmc.items.metaitems.ItemProtossUpgrade;
import ga.scmc.items.metaitems.ItemPsiBladeFocuserUncharged;
import ga.scmc.items.metaitems.ItemTerrazine;
import ga.scmc.items.metaitems.ItemVespene;
import ga.scmc.items.metaitems.ItemZergCarapace;
import ga.scmc.items.structurespawns.ItemProtossCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemTerranBarracksSpawner;
import ga.scmc.items.structurespawns.ItemTerranBunkerSpawner;
import ga.scmc.items.structurespawns.ItemTerranCommandCenterSpawner;
import ga.scmc.items.structurespawns.ItemZergHydraliskDenSpawner;
import ga.scmc.items.structurespawns.ItemZergSpawningPoolSpawner;
import ga.scmc.items.structurespawns.ItemZergSpireSpawner;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class ItemHandler {

	public static Item BULLET_MAGAZINE;
	public static ItemC14GaussRifle C14_GAUSS_RIFLE;
	public static ItemFlamethrower FLAMETHROWER;
	public static Item C14_PARTS;
	public static Item FLAMETHROWER_PARTS;
	public static Item CREEP_RESIN;
	public static Item PROTOSS_INGOT;
	public static Item DUST;
	public static Item PLEDGE;
	public static Item ENERGY;
	public static Item INGOT;
	public static Item MINERAL_SHARD;
	public static Item PHOSPHORUS;
	public static Item ORGANIC_TISSUE;
	public static Item PSI_BLADE_FOCUSER_UNCHARGED;
	public static Item ZERG_CARAPACE;
	public static Item BIOMASS;

	public static Item NUCLEAR_MISSILE;
	public static Item STIMPACK;
	public static Item CARBOTIFIER;
	public static Item LOG;

	public static Item GAS_CONTAINER;
	public static Item VESPENE;
	public static Item TERRAZINE;

	public static Item PROTOSS_UPGRADE;

	public static Item MARINE_ARMOR_FRAME;
	public static Item MARINE_HELMET_VISOR;
	public static Item WIRE;
	public static Item MARINE_ARMOR_PLATING;
	public static Item AIR_CONDITIONER;
	public static Item MARINE_ARMOR_BATTERY;
	public static Item MARINE_ARMOR_COOLING_SYSTEM;

	public static Item KHAYDARIN_CRYSTAL;

	public static Item SPAWNER_PROTOSS_DARK_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_VOID_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_DARK_PYLON;
	public static Item SPAWNER_PROTOSS_VOID_PYLON;
	public static Item SPAWNER_PROTOSS_PYLON;
	public static Item SPAWNER_PROTOSS_DARK_WARPGATE;
	public static Item SPAWNER_PROTOSS_VOID_WARPGATE;
	public static Item SPAWNER_PROTOSS_WARPGATE;

	public static Item SPAWNER_TERRAN_BUNKER;
	public static Item SPAWNER_TERRAN_BARRACKS;
	public static Item SPAWNER_TERRAN_COMMAND_CENTER;

	public static Item SPAWNER_ZERG_SPAWNINGPOOL;
	public static Item SPAWNER_ZERG_SPIRE;
	public static Item SPAWNER_ZERG_HYDRALISKDEN;

	public static Item ICON_PROTOSS;
	public static Item ICON_TERRAN;
	public static Item ICON_ZERG;

	public static Item TEST;

	static {
		MINERAL_SHARD = new ItemMineralShard();
		PHOSPHORUS = new ItemPhosphorus();

		GAS_CONTAINER = new ItemGasContainer();
		VESPENE = new ItemVespene();
		TERRAZINE = new ItemTerrazine();

		ENERGY = new ItemEnergy();
		DUST = new ItemDust();
		PLEDGE = new ItemPledge();
		INGOT = new ItemIngot();
		PROTOSS_INGOT = new ItemProtossIngot();
		C14_GAUSS_RIFLE = new ItemC14GaussRifle();
		C14_PARTS = new ItemC14GaussRifleParts();
		FLAMETHROWER_PARTS = new ItemFlamethrowerParts();
		FLAMETHROWER = new ItemFlamethrower();
		BULLET_MAGAZINE = new ItemMagazine();
		PSI_BLADE_FOCUSER_UNCHARGED = new ItemPsiBladeFocuserUncharged();
		ZERG_CARAPACE = new ItemZergCarapace();
		CREEP_RESIN = new Item().setUnlocalizedName("zerg.creepresin").setRegistryName("zerg.creepresin").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ORGANIC_TISSUE = new Item().setUnlocalizedName("zerg.tissue").setRegistryName("zerg.tissue").setCreativeTab(StarcraftCreativeTabs.ZERG);
		BIOMASS = new Item().setUnlocalizedName("biomass").setRegistryName("biomass").setCreativeTab(StarcraftCreativeTabs.ZERG);

		NUCLEAR_MISSILE = new Item().setUnlocalizedName("terran.nuclearmisile").setRegistryName("terran.nuclearmisile").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STIMPACK = new ItemStimpack();
		CARBOTIFIER = new ItemCarbotifier();
		LOG = new ItemLog();

		PROTOSS_UPGRADE = new ItemProtossUpgrade();
		MARINE_HELMET_VISOR = new ItemMarineHelmetVisor();

		KHAYDARIN_CRYSTAL = new ItemKhaydarinCrystal();

		SPAWNER_PROTOSS_DARK_CYBERNETICSCORE = new ItemProtossDarkCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_VOID_CYBERNETICSCORE = new ItemProtossVoidCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_CYBERNETICSCORE = new ItemProtossCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_DARK_PYLON = new ItemProtossDarkPylonSpawner();
		SPAWNER_PROTOSS_VOID_PYLON = new ItemProtossVoidPylonSpawner();
		SPAWNER_PROTOSS_PYLON = new ItemProtossPylonSpawner();
		SPAWNER_PROTOSS_DARK_WARPGATE = new ItemProtossDarkWarpGateSpawner();
		SPAWNER_PROTOSS_VOID_WARPGATE = new ItemProtossVoidWarpGateSpawner();
		SPAWNER_PROTOSS_WARPGATE = new ItemProtossWarpGateSpawner();

		SPAWNER_TERRAN_BUNKER = new ItemTerranBunkerSpawner();
		SPAWNER_TERRAN_BARRACKS = new ItemTerranBarracksSpawner();
		SPAWNER_TERRAN_COMMAND_CENTER = new ItemTerranCommandCenterSpawner();

		SPAWNER_ZERG_SPAWNINGPOOL = new ItemZergSpawningPoolSpawner();
		SPAWNER_ZERG_SPIRE = new ItemZergSpireSpawner();
		SPAWNER_ZERG_HYDRALISKDEN = new ItemZergHydraliskDenSpawner();

		ICON_PROTOSS = new Item().setUnlocalizedName("icon.protoss").setRegistryName("icon.protoss").setCreativeTab(null);
		ICON_TERRAN = new Item().setUnlocalizedName("icon.terran").setRegistryName("icon.terran").setCreativeTab(null);
		ICON_ZERG = new Item().setUnlocalizedName("icon.zerg").setRegistryName("icon.zerg").setCreativeTab(null);

		TEST = new ItemTest();

		ArmorHandler.init();
		WeaponHandler.init();
		ToolHandler.init();
		register();
	}

	/**
	 * Registers all mod items. Calls registration of sub-packages.
	 */
	public static void register() {

		// Register fluids and add them to the universal bucket
		FluidRegistry.addBucketForFluid(FluidHandler.ACID);
		FluidRegistry.addBucketForFluid(FluidHandler.BLOOD);
		FluidRegistry.addBucketForFluid(FluidHandler.VESPENE);
		FluidRegistry.addBucketForFluid(FluidHandler.TERRAZINE);
		FluidRegistry.addBucketForFluid(FluidHandler.TAR);

		registerItem(MINERAL_SHARD);
		registerItem(PHOSPHORUS);

		registerItem(GAS_CONTAINER);
		registerItem(VESPENE);
		registerItem(TERRAZINE);

		registerItem(ENERGY);
		registerItem(DUST);
		registerItem(PLEDGE);
		registerItem(INGOT);
		registerItem(PROTOSS_INGOT);
		registerItem(C14_GAUSS_RIFLE);
		registerItem(FLAMETHROWER);
		registerItem(C14_PARTS);
		registerItem(FLAMETHROWER_PARTS);
		registerItem(BULLET_MAGAZINE);
		registerItem(PSI_BLADE_FOCUSER_UNCHARGED);
		registerItem(ZERG_CARAPACE);
		registerItem(CREEP_RESIN);
		registerItem(ORGANIC_TISSUE);
		registerItem(BIOMASS);

		// registerItem(NUCLEAR_MISSILE);
		registerItem(STIMPACK);
		registerItem(CARBOTIFIER);
		registerItem(LOG);

		registerItem(PROTOSS_UPGRADE);
		registerItem(MARINE_HELMET_VISOR);

		registerItem(KHAYDARIN_CRYSTAL);

		registerItem(SPAWNER_PROTOSS_DARK_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_VOID_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_DARK_PYLON);
		registerItem(SPAWNER_PROTOSS_VOID_PYLON);
		registerItem(SPAWNER_PROTOSS_PYLON);
		registerItem(SPAWNER_PROTOSS_DARK_WARPGATE);
		registerItem(SPAWNER_PROTOSS_VOID_WARPGATE);
		registerItem(SPAWNER_PROTOSS_WARPGATE);

		registerItem(SPAWNER_TERRAN_BUNKER);
		registerItem(SPAWNER_TERRAN_BARRACKS);
		registerItem(SPAWNER_TERRAN_COMMAND_CENTER);

		registerItem(SPAWNER_ZERG_SPAWNINGPOOL);
		registerItem(SPAWNER_ZERG_SPIRE);
		registerItem(SPAWNER_ZERG_HYDRALISKDEN);

		registerItem(ICON_PROTOSS);
		registerItem(ICON_TERRAN);
		registerItem(ICON_ZERG);

		registerItem(TEST);

		ArmorHandler.register();
		WeaponHandler.register();
		ToolHandler.register();
	}

	/**
	 * Register an item
	 * 
	 * @param item
	 *            The item
	 */
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}
}