package xxrexraptorxx.orecore.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xxrexraptorxx.orecore.proxy.ServerProxy;
import xxrexraptorxx.orecore.util.ChiselHelper;
import xxrexraptorxx.orecore.util.Events;
import xxrexraptorxx.orecore.util.FuelHandler;
import xxrexraptorxx.orecore.util.OreDictionaryHandler;
import xxrexraptorxx.orecore.util.UpdateChecker;
import xxrexraptorxx.orecore.worldGen.LootHandler;
import xxrexraptorxx.orecore.worldGen.WorldGenOre;
import xxrexraptorxx.orecore.worldGen.WorldRegister;

/**---------------------------------------------------------------------------------*
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://minecraft.curseforge.com/projects/rex-s-ore-core
 **---------------------------------------------------------------------------------*/


@Mod(modid = OreCore.MODID, version = OreCore.VERSION)
public class OreCore {
   
    public static final String MODID = "orecore";
    public static final String VERSION = "1.3.7";
    
   
    @Instance("orecore")
    public static OreCore instance;
    
    @SidedProxy(clientSide = "xxrexraptorxx.orecore.proxy.ClientProxy", serverSide = "xxrexraptorxx.orecore.proxy.ServerProxy")
    public static ServerProxy proxy;
    
    

    
    // Items //
    public ModItems items;
    
    // Blocks //
    public ModBlocks blocks;
    
    // Recipes //
    public ModRecipes recipes;
    
    // Config //
    public static boolean activateUpdateChecker;
    public static boolean activateOverworldGeneration;
    public static boolean activateNetherGeneration;
    public static boolean activateEndGeneration;
    
    public static boolean activateClayVeins;
    public static boolean activateCompressedOres;
    public static boolean activateCompressedNetherOres;
    public static boolean activateVanillaNetherOres;
    public static boolean activateVanillaEndOres;
    public static boolean activateObsidianVeins;
    public static boolean activateCoalBlockVeins;
    public static boolean activateLavaVeins;
    public static boolean activateFossils;
    public static boolean activateXPOres;
    public static boolean activateOreGenerationFix;
    public static boolean activateOilCrafting;
    public static boolean activateMarmor;
    public static boolean activateBasalt;
    public static boolean activateSlate;
    public static boolean activateStoneDrop;
    public static boolean activateLoam;
    public static boolean activateAshe;
    public static boolean activateSandVeins;
    public static boolean activateSandstoneVeins;
    public static boolean activateExpandetOreDrops;
    public static boolean activateEyeBlocks;				
    public static boolean activateGravelOres;
    public static boolean activateMonsterBlocks;
    public static boolean activateEmeraldTools;
    public static boolean activateLavaCrystalTools;
    public static boolean activateEmeraldArmor;
    public static boolean activateLavaCrystalArmor;
    public static boolean activateBoneArmor;
    public static boolean activateShowModOres;
    public static boolean activateModdedOres;
    public static boolean activateModdedNetherOres;
    public static boolean activateModdedEndOres;
    public static boolean activateUseOwnModdedItems;
    public static boolean activateTestForMods;
    
    public static boolean activateCopperOre;
    public static boolean activateIridiumOre;
    public static boolean activateAmethystOre;
    public static boolean activateTinOre;
    public static boolean activateUraniumOre;
    public static boolean activateSilverOre;
    public static boolean activateAluminiumOre;
    public static boolean activateSapphireOre;
    public static boolean activateRubyOre;
    public static boolean activateLeadOre;
    public static boolean activatePlatinumOre;

    
    
    // Creative-Tab //
    
    public static CreativeTabs mainTab = new CreativeTabs("oreTab") {
	
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModBlocks.mixedOre);		    	
		}
	};	
    
    
    
    
    /***********************************************************************************************************************************/ 
    /***********************************************************************************************************************************/
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
        // Config //
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
        
    		activateUpdateChecker = config.get("EVENTS", "Activate Update-Checker", true, "[true/false]").getBoolean();
    		activateOverworldGeneration = config.get("GENERAL", "Activate the Overworld generation", true, "[true/false]").getBoolean();
    		activateNetherGeneration = config.get("GENERAL", "Activate the Nether generation", true, "[true/false]").getBoolean();
    		activateEndGeneration = config.get("GENERAL", "Activate the End generation", true, "[true/false]").getBoolean();
    		activateModdedOres = config.get("GENERAL", "Activate the modded ore generation", false, "[true/false]").getBoolean();
    		
    		activateClayVeins = config.get("OVERWORLD GENERATION", "Activate the clay vein generation in the overworld", false, "[true/false]").getBoolean();
    		activateSandVeins = config.get("OVERWORLD GENERATION", "Activate the sand vein generation in the overworld", false, "[true/false]").getBoolean();
    		activateObsidianVeins = config.get("END GENERATION", "Activate the Obsidian vein generation in the end", true, "[true/false]").getBoolean();
    		activateCoalBlockVeins = config.get("NETHER GENERATION", "Activate the coal block vein generation in the nether", true, "[true/false]").getBoolean();    		
    		activateLavaVeins = config.get("NETHER GENERATION", "Activate the lava vein generation in the nether", false, "[true/false]").getBoolean();
    		activateCompressedOres = config.get("OVERWORLD GENERATION", "Activate the normal compressed ore generation", true, "[true/false]").getBoolean();
    		activateOreGenerationFix = config.get("FIX", "Activate the vanilla Ore generation fix", false, "[true/false] [Changes the highest spawn layer of coal & iron (no more high mountains without ores)]").getBoolean();
    		activateVanillaNetherOres = config.get("NETHER GENERATION", "Activate the vanilla Nether ore generation", true, "[true/false] [Eg. Nether Iron Ore, Nether Coal Ore,...]").getBoolean();
    		activateVanillaEndOres = config.get("END GENERATION", "Activate the vanilla End ore generation", true, "[true/false] [Eg. End Iron Ore, End Coal Ore,...]").getBoolean();
    		activateFossils = config.get("GLOBAL GENERATION", "Activate the fossil generation in all dimensions", true, "[true/false]").getBoolean();
    		activateXPOres = config.get("GLOBAL GENERATION", "Activate the experience ores in all dimensions", true, "[true/false]").getBoolean();
    		activateOilCrafting = config.get("CRAFTING", "Activate the crafting recipe for oil buckets with oil paste", true, "[true/false]").getBoolean();
    		activateMarmor = config.get("OVERWORLD GENERATION", "Activate marmor veins", true, "[true/false]").getBoolean();    		
    		activateBasalt = config.get("OVERWORLD GENERATION", "Activate basalt veins", true, "[true/false]").getBoolean();    		
    		activateSlate = config.get("OVERWORLD GENERATION", "Activate slate veins", true, "[true/false]").getBoolean();    	
    		activateLoam = config.get("OVERWORLD GENERATION", "Activate loam veins", true, "[true/false]").getBoolean();   
    		activateStoneDrop = config.get("EVENTS", "Activate the stone drop of stone blocks", false, "[true/false] [if you destroy a stone or a cobblestone drops with a small chance a rock (can be used for crafting)]").getBoolean();    		
    		activateAshe = config.get("NETHER GENERATION", "Activate the ashe generation in the nether", true, "[true/false]").getBoolean();
    		activateSandstoneVeins = config.get("OVERWORLD GENERATION", "Activate sandstone veins", false, "[true/false]").getBoolean();    		
    		activateExpandetOreDrops = config.get("EVENTS", "Activate expandet ore drops (Ores drops the material and tiny piles of dust)", false, "[true/false]").getBoolean();    		
    		activateEyeBlocks = config.get("GLOBAL GENERATION", "Activate the generation of eye blocks in the nether and end", true, "[true/false]").getBoolean();    	
    		activateGravelOres = config.get("GLOBAL GENERATION", "Activate the generation of gravel 'ores' in the nether and overworld", true, "[true/false]").getBoolean(); 
    		activateMonsterBlocks = config.get("GLOBAL GENERATION", "Activate the generation of custom monster blocks in the nether and end", true, "[true/false]").getBoolean();    	
    		activateEmeraldTools = config.get("TOOLS", "Activate the crafting of emerald tools", true, "[true/false]").getBoolean();
    		activateLavaCrystalTools = config.get("TOOLS", "Activate the crafting of lava crystal tools", true, "[true/false]").getBoolean();
    		activateEmeraldArmor = config.get("ARMOR", "Activate the crafting of emerald armor", true, "[true/false]").getBoolean();
    		activateLavaCrystalArmor = config.get("ARMOR", "Activate the crafting of lava crystal armor", true, "[true/false]").getBoolean();
    		activateBoneArmor = config.get("ARMOR", "Activate the crafting of bone armor", true, "[true/false]").getBoolean();
    		activateShowModOres = config.get("MOD ORES", "Activate if you want to see the moded ores (like copper) in the inventory", true, "[true/false]").getBoolean();
    		activateModdedNetherOres = config.get("MOD ORES", "Activate the modded nether ore generation", true, "[true/false] [Eg. Nether Copper Ore, Nether Tin Ore,...]").getBoolean();
    		activateModdedEndOres = config.get("MOD ORES", "Activate the modded end ore generation", true, "[true/false] [Eg. End Copper Ore, End Tin Ore,...]").getBoolean();
    		activateUseOwnModdedItems = config.get("MOD ORES", "Activate when the mod should use his own items for the modded ores", false, "[true/false] [Eg. Copper Ingots]").getBoolean();
    		//activateTestForMods= config.get("MOD ORES", "Activate if the mod should test for a few big mods to make it compatible", false, "[true/false] [NOT IMPLEMENTED YET]").getBoolean();
    		
    		activateCopperOre = config.get("MOD ORES", "Activate the copper ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateIridiumOre = config.get("MOD ORES", "Activate the iridium ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateAmethystOre = config.get("MOD ORES", "Activate the amethyst ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateTinOre = config.get("MOD ORES", "Activate the tin ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateUraniumOre = config.get("MOD ORES", "Activate the uranium ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateSilverOre = config.get("MOD ORES", "Activate the silver ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateAluminiumOre = config.get("MOD ORES", "Activate the aluminium ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateSapphireOre = config.get("MOD ORES", "Activate the sapphire ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateRubyOre = config.get("MOD ORES", "Activate the ruby ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activateLeadOre = config.get("MOD ORES", "Activate the lead ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		activatePlatinumOre = config.get("MOD ORES", "Activate the platinum ore generation, if modded ore generation is on", true, "[true/false]").getBoolean();
    		
    	config.save();
    	
    	
    	

    UpdateChecker.checkForUpdates();  
    	
    MinecraftForge.EVENT_BUS.register(new Events());  
       
    MinecraftForge.EVENT_BUS.register(ModItems.class);
    
    
    
    	// Blocks //
		blocks = new ModBlocks();
		blocks.init();
		blocks.register();
	
		// Items //
		items = new ModItems();
		items.init();
		items.register();

		// Handler //
	    OreDictionaryHandler.registerOreDictionary();

    }
  
    
    
    
    
   
    @EventHandler
    public void Init(FMLInitializationEvent event) {
    	
    	// Recipes //
    	recipes = new ModRecipes();
    	recipes.register();
    	
    	// proxy //
        proxy.registerClientStuff();
        
       // Handler //
       GameRegistry.registerFuelHandler(new FuelHandler());
       ChiselHelper.chisel();
    
       // Generation //
       MinecraftForge.EVENT_BUS.register(new LootHandler());
       GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);

    }
   
   
    
    
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
              
    }
 
}