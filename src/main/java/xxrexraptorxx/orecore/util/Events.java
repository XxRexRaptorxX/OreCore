package xxrexraptorxx.orecore.util;

import java.util.Random;

import xxrexraptorxx.orecore.main.ModBlocks;
import xxrexraptorxx.orecore.main.ModItems;
import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;


public class Events {    
	
	
    	/** Update-Checker **/
	
	private boolean hasShownUp = false;
	
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		if (OreCore.activateUpdateChecker) {
		if (UpdateChecker.isNewVersionAvailable() && !hasShownUp && Minecraft.getMinecraft().currentScreen == null) {
	        
				ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.curseforge.com/projects/rex-s-ore-core");
	            Style clickableChatStyle = new Style().setClickEvent(versionCheckChatClickEvent);
	            Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BLUE + "A newer version of Ore Core is available!"));
	            TextComponentString versionWarningChatComponent = new TextComponentString(TextFormatting.GRAY + "Click here to update!");
	            versionWarningChatComponent.setStyle(clickableChatStyle);
	            Minecraft.getMinecraft().player.sendMessage(versionWarningChatComponent);

			hasShownUp = true;
			}
		}
	}
	
	
	
	
	
		/** Stone Drop **/
	
	@SubscribeEvent
	public void StoneDrop(HarvestDropsEvent event) {
		if(OreCore.activateStoneDrop){
			if(event.getState().getBlock() == Blocks.STONE) {
				Random random = new Random();
				if(random.nextInt(50) == 0) {
					event.getDrops().add(new ItemStack(ModItems.stone));
				}
			}

			if(event.getState().getBlock() == Blocks.COBBLESTONE) {
				Random random = new Random();
				if(random.nextInt(50) == 0) {
					event.getDrops().add(new ItemStack(ModItems.stone));
				}
			}
		}
	}	
	
	
	
	/** Expandet Ore Drops **/
	
	@SubscribeEvent
	public void ExpandetDrop(HarvestDropsEvent event) {
		if(OreCore.activateExpandetOreDrops){
			
			// vanilla
			if(event.getState().getBlock() == Blocks.COAL_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust)); 
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust, 2));
				}
			}

			if(event.getState().getBlock() == Blocks.IRON_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust, 2));
				}
			}

			if(event.getState().getBlock() == Blocks.GOLD_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust, 2));
				}
			}

			if(event.getState().getBlock() == Blocks.DIAMOND_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust, 2));
				}
			}
		
			if(event.getState().getBlock() == Blocks.EMERALD_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust, 2));
				}
			}
		
			if(event.getState().getBlock() == Blocks.LAPIS_ORE) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust, 2));
				}
			}
			
			
			
			
			//compressed
			if(event.getState().getBlock() == ModBlocks.compressedCoalOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust, 2)); 
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust, 4));
				}
			}

			if(event.getState().getBlock() == ModBlocks.compressedIronOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust, 2));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust, 4));
				}
			}

			if(event.getState().getBlock() == ModBlocks.compressedGoldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust, 2));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust, 4));
				}
			}

			if(event.getState().getBlock() == ModBlocks.compressedDiamondOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust, 2));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust, 4));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.compressedEmeraldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust, 2));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust, 4));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.compressedLapisOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust, 2));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust, 4));
				}
			}
		
			
			
			
			
			// nether 
			if(event.getState().getBlock() == ModBlocks.netherCoalOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust)); 
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.netherIronOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.netherGoldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.netherDiamondOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust, 2));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.netherEmeraldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust, 2));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.netherLapisOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust, 2));
				}
			}
			
			
			
			
			
			// end
			if(event.getState().getBlock() == ModBlocks.endCoalOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust)); 
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyCoalDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.endIronOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyIronDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.endGoldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyGoldDust, 2));
				}
			}

			if(event.getState().getBlock() == ModBlocks.endDiamondOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyDiamondDust, 2));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.endEmeraldOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyEmeraldDust, 2));
				}
			}
		
			if(event.getState().getBlock() == ModBlocks.endLapisOre) {
				Random random = new Random();
				if(random.nextInt(5) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust));
				}
				if(random.nextInt(10) == 0) {
					event.getDrops().add(new ItemStack(ModItems.tinyLapisDust, 2));
				}
			}
			
			
		}
	}
	


	
}


