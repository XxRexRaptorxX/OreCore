package xxrexraptorxx.orecore.main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import xxrexraptorxx.orecore.items.*;
import xxrexraptorxx.orecore.util.NameUtils;

@Mod.EventBusSubscriber
public class ModItems {
	
	
		// Tool Materials //
		
		public static ToolMaterial emerald;
		public static ToolMaterial lavacrystal;
		
		
		// Armor // 
		
		public static ArmorMaterial boneAM = EnumHelper.addArmorMaterial("bone", "orecore:bone", 10, new int[]{2, 4, 4, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
		public static ArmorMaterial emeraldAM = EnumHelper.addArmorMaterial("emerald", "orecore:emerald", 20, new int[]{3, 6, 5, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
		public static ArmorMaterial lavacrystalAM = EnumHelper.addArmorMaterial("lavacrystal", "orecore:lavacrystal", 17, new int[]{2, 5, 3, 1}, 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
				
	
		// Items //
		
		public static Item fossil;
		public static Item fossil1;
		public static Item fossil2;
		public static Item fossil3;
		public static Item fossil4;
		public static Item fossil5;
		public static Item fossil6;
		
		public static Item oilPaste;
		public static Item oilBucket;
		
		public static Item ashe;
		public static Item lavaCrystal;
		public static Item loamBall;
		public static Item loamBrick;
		public static Item meteor;
		public static Item stone;
		
		public static Item coalDust;
		public static Item ironDust;
		public static Item goldDust;
		public static Item emeraldDust;
		public static Item diamondDust;
		public static Item lapisDust;

		public static Item tinyCoalDust;
		public static Item tinyIronDust;
		public static Item tinyGoldDust;
		public static Item tinyEmeraldDust;
		public static Item tinyDiamondDust;
		public static Item tinyLapisDust;
		
		public static Item aluminiumIngot;
		public static Item amethyst;
		public static Item copperIngot;
		public static Item iridium;
		public static Item leadIngot;
		public static Item platinumIngot;
		public static Item ruby;
		public static Item sapphire;
		public static Item silverIngot;
		public static Item tinIngot;
		public static Item uranium;
		
		
		// Tools //
		
		public static Item emeraldSword;
		public static Item emeraldPickaxe;
		public static Item emeraldAxe;
		public static Item emeraldShovel;
		public static Item emeraldHoe;
		
		public static Item lavacrystalSword;
		public static Item lavacrystalPickaxe;
		public static Item lavacrystalAxe;
		public static Item lavacrystalShovel;
		public static Item lavacrystalHoe;
		
		
		// Armor //
		
		public static ItemArmor boneHelmet;
		public static ItemArmor boneChestplate;
		public static ItemArmor boneLeggins;
		public static ItemArmor boneBoots;
		
		public static ItemArmor emeraldHelmet;
		public static ItemArmor emeraldChestplate;
		public static ItemArmor emeraldLeggins;
		public static ItemArmor emeraldBoots;
		
		public static ItemArmor lavacrystalHelmet;
		public static ItemArmor lavacrystalChestplate;
		public static ItemArmor lavacrystalLeggins;
		public static ItemArmor lavacrystalBoots;

		
		


	
	
	
	
	public void init() {
		
		// Tool Materials //		
		
		emerald = EnumHelper.addToolMaterial("Emerald", 3, 500, 8.0F, 3.0F, 15);
		lavacrystal = EnumHelper.addToolMaterial("LavaCrystal", 2, 200, 6.0F, 2.0F, 15);
		
		
		
		// Tools //
		
		emeraldSword = new ItemEmeraldSword(emerald);
		emeraldPickaxe = new ItemEmeraldPickaxe(emerald);
		emeraldAxe = new ItemEmeraldAxe(emerald);
		emeraldShovel = new ItemEmeraldShovel(emerald);
		emeraldHoe = new ItemEmeraldHoe(emerald);
		
		lavacrystalSword = new ItemLavacrystalSword(lavacrystal);
		lavacrystalPickaxe = new ItemLavacrystalPickaxe(lavacrystal);
		lavacrystalAxe = new ItemLavacrystalAxe(lavacrystal);
		lavacrystalShovel = new ItemLavacrystalShovel(lavacrystal);
		lavacrystalHoe = new ItemLavacrystalHoe(lavacrystal);
		

   	    
   	    // Items //  
   	
		fossil = new ItemFossil();
		fossil1 = new ItemFossil1();
		fossil2 = new ItemFossil2();
		fossil3 = new ItemFossil3();
		fossil4 = new ItemFossil4();
		fossil5 = new ItemFossil5();
		fossil6 = new ItemFossil5();
		
		oilPaste = new ItemOilPaste();
		oilBucket = new ItemOilBucket();
		
		ashe = new ItemAshe();
		lavaCrystal = new ItemLavaCrystal();
		loamBall = new ItemLoamBall();
		loamBrick = new ItemLoamBrick();
		meteor = new ItemMeteor();
		stone = new ItemStone();
		
		coalDust = new ItemCoalDust();
		ironDust = new ItemIronDust();
		goldDust = new ItemGoldDust();
		lapisDust = new ItemLapisDust();
		emeraldDust = new ItemLapisDust();
		diamondDust = new ItemDiamondDust();
		
		tinyCoalDust = new ItemTinyCoalDust();
		tinyIronDust = new ItemTinyIronDust();
		tinyGoldDust = new ItemTinyGoldDust();
		tinyLapisDust = new ItemTinyLapisDust();
		tinyEmeraldDust = new ItemTinyLapisDust();
		tinyDiamondDust = new ItemTinyDiamondDust();
		
		aluminiumIngot = new ItemAluminiumIngot();
		amethyst = new ItemAmethyst();
		copperIngot = new ItemCopperIngot();
		iridium = new ItemIridium();
		leadIngot = new ItemLeadIngot();
		platinumIngot = new ItemPlatinumIngot();
		ruby = new ItemRuby();
		sapphire = new ItemSapphire();
		silverIngot = new ItemSilverIngot();
		tinIngot = new ItemTinIngot();
		uranium = new ItemUranium();
		
		
		
		// Armor //
		
		boneHelmet = new ItemBoneArmor(boneAM, 1, EntityEquipmentSlot.HEAD); 
		boneChestplate = new ItemBoneArmor(boneAM, 1, EntityEquipmentSlot.CHEST);
		boneLeggins = new ItemBoneArmor(boneAM, 2, EntityEquipmentSlot.LEGS); 
		boneBoots = new ItemBoneArmor(boneAM, 1, EntityEquipmentSlot.FEET); 
		
		emeraldHelmet = new ItemEmeraldArmor(emeraldAM, 1, EntityEquipmentSlot.HEAD); 
		emeraldChestplate = new ItemEmeraldArmor(emeraldAM, 1, EntityEquipmentSlot.CHEST);
		emeraldLeggins = new ItemEmeraldArmor(emeraldAM, 2, EntityEquipmentSlot.LEGS); 
		emeraldBoots = new ItemEmeraldArmor(emeraldAM, 1, EntityEquipmentSlot.FEET); 
		
		lavacrystalHelmet = new ItemLavaCrystalArmor(lavacrystalAM, 1, EntityEquipmentSlot.HEAD); 
		lavacrystalChestplate = new ItemLavaCrystalArmor(lavacrystalAM, 1, EntityEquipmentSlot.CHEST);
		lavacrystalLeggins = new ItemLavaCrystalArmor(lavacrystalAM, 2, EntityEquipmentSlot.LEGS); 
		lavacrystalBoots = new ItemLavaCrystalArmor(lavacrystalAM, 1, EntityEquipmentSlot.FEET); 


	
		
		
	
		
		
		
		
		NameUtils.setNames(fossil, "fossil");
		NameUtils.setNames(fossil1, "fossil1");
		NameUtils.setNames(fossil2, "fossil2");
		NameUtils.setNames(fossil3, "fossil3");
		NameUtils.setNames(fossil4, "fossil4");
		NameUtils.setNames(fossil5, "fossil5");
		NameUtils.setNames(fossil6, "fossil6");
		
		NameUtils.setNames(oilPaste, "oil_paste");
		NameUtils.setNames(oilBucket, "oil_bucket");
		
		NameUtils.setNames(ashe, "ashe");
		NameUtils.setNames(lavaCrystal, "lava_crystal");
		NameUtils.setNames(loamBall, "loam_ball");
		NameUtils.setNames(loamBrick, "loam_brick");
		NameUtils.setNames(meteor, "meteor");
		NameUtils.setNames(stone, "stone");
		
		NameUtils.setNames(coalDust, "coal_dust");
		NameUtils.setNames(ironDust, "iron_dust");
		NameUtils.setNames(goldDust, "gold_dust");
		NameUtils.setNames(lapisDust, "lapis_dust");
		NameUtils.setNames(emeraldDust, "emerald_dust");
		NameUtils.setNames(diamondDust, "diamond_dust");
		
		NameUtils.setNames(tinyCoalDust, "tiny_coal_dust");
		NameUtils.setNames(tinyIronDust, "tiny_iron_dust");
		NameUtils.setNames(tinyGoldDust, "tiny_gold_dust");
		NameUtils.setNames(tinyLapisDust, "tiny_lapis_dust");
		NameUtils.setNames(tinyEmeraldDust, "tiny_emerald_dust");
		NameUtils.setNames(tinyDiamondDust, "tiny_diamond_dust");
		
		NameUtils.setNames(aluminiumIngot, "aluminium_ingot");
		NameUtils.setNames(amethyst, "amethyst");
		NameUtils.setNames(copperIngot, "copper_ingot");
		NameUtils.setNames(iridium, "iridium");
		NameUtils.setNames(leadIngot, "lead_ingot");
		NameUtils.setNames(platinumIngot, "platinum_ingot");
		NameUtils.setNames(ruby, "ruby");
		NameUtils.setNames(sapphire, "sapphire");
		NameUtils.setNames(silverIngot, "silver_ingot");
		NameUtils.setNames(tinIngot, "tin_ingot");
		NameUtils.setNames(uranium, "uranium");
		
		
		
		// Tools //
		
		NameUtils.setNames(emeraldSword, "emerald_sword");
		NameUtils.setNames(emeraldPickaxe, "emerald_pickaxe");
		NameUtils.setNames(emeraldAxe, "emerald_axe");
		NameUtils.setNames(emeraldShovel, "emerald_shovel");
		NameUtils.setNames(emeraldHoe, "emerald_hoe");
		
		NameUtils.setNames(lavacrystalSword, "lavacrystal_sword");
		NameUtils.setNames(lavacrystalPickaxe, "lavacrystal_pickaxe");
		NameUtils.setNames(lavacrystalAxe, "lavacrystal_axe");
		NameUtils.setNames(lavacrystalShovel, "lavacrystal_shovel");
		NameUtils.setNames(lavacrystalHoe, "lavacrystal_hoe");
		
		
		// Armor //
		
		NameUtils.setNames(boneHelmet, "bone_helmet");
		NameUtils.setNames(boneChestplate, "bone_chestplate");
		NameUtils.setNames(boneLeggins, "bone_leggins");
		NameUtils.setNames(boneBoots, "bone_boots");
		
		NameUtils.setNames(emeraldHelmet, "emerald_helmet");
		NameUtils.setNames(emeraldChestplate, "emerald_chestplate");
		NameUtils.setNames(emeraldLeggins, "emerald_leggins");
		NameUtils.setNames(emeraldBoots, "emerald_boots");
		
		NameUtils.setNames(lavacrystalHelmet, "lavacrystal_helmet");
		NameUtils.setNames(lavacrystalChestplate, "lavacrystal_chestplate");
		NameUtils.setNames(lavacrystalLeggins, "lavacrystal_leggins");
		NameUtils.setNames(lavacrystalBoots, "lavacrystal_boots");
		
		
	}
	

	
	
	public void register() {
		
		registerItem(fossil);
		registerItem(fossil1);
		registerItem(fossil2);
		registerItem(fossil3);
		registerItem(fossil4);
		registerItem(fossil5);
		registerItem(fossil6);
		
		registerItem(oilPaste);
		registerItem(oilBucket);
		
		registerItem(ashe);
		registerItem(lavaCrystal);
		registerItem(loamBall);
		registerItem(loamBrick);
		registerItem(meteor);
		registerItem(stone);
		
		registerItem(coalDust);
		registerItem(ironDust);
		registerItem(goldDust);
		registerItem(lapisDust);
		registerItem(emeraldDust);
		registerItem(diamondDust);
		
		registerItem(tinyCoalDust);
		registerItem(tinyIronDust);
		registerItem(tinyGoldDust);
		registerItem(tinyLapisDust);
		registerItem(tinyEmeraldDust);
		registerItem(tinyDiamondDust);
		
		registerItem(copperIngot);
		registerItem(aluminiumIngot);
		registerItem(leadIngot);
		registerItem(platinumIngot);
		registerItem(silverIngot);
		registerItem(tinIngot);
		registerItem(iridium);
		registerItem(ruby);
		registerItem(sapphire);
		registerItem(amethyst);
		registerItem(uranium);

		
		
		
		// Tools //
		
		registerItem(emeraldSword);
		registerItem(emeraldPickaxe);
		registerItem(emeraldAxe);
		registerItem(emeraldShovel);
		registerItem(emeraldHoe);
		
		registerItem(lavacrystalSword);
		registerItem(lavacrystalPickaxe);
		registerItem(lavacrystalAxe);
		registerItem(lavacrystalShovel);
		registerItem(lavacrystalHoe);
		
		
		
		// Armor //
		
		registerItem(boneHelmet);
		registerItem(boneChestplate);
		registerItem(boneLeggins);
		registerItem(boneBoots);
		
		registerItem(emeraldHelmet);
		registerItem(emeraldChestplate);
		registerItem(emeraldLeggins);
		registerItem(emeraldBoots);
		
		registerItem(lavacrystalHelmet);
		registerItem(lavacrystalChestplate);
		registerItem(lavacrystalLeggins);
		registerItem(lavacrystalBoots);
		
		
		
	}

	
	
	private static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}
	
	
	
}
