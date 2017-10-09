package xxrexraptorxx.orecore.worldGen;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler 
	{
	    private void addLoot(LootPool pool, Item plakat, int weight)
	    {
	        pool.addEntry(new LootEntryItem(plakat, weight, 0, new LootFunction[0], new LootCondition[0], plakat.getRegistryName().toString()));
	    }

	    @SubscribeEvent
	    public void onLootLoad(LootTableLoadEvent event)
	    {
	        if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, Items.AIR, 20);
	            
	        }
	        
	    }
	}
