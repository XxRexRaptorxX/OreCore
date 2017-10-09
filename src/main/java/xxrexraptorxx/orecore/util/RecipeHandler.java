package xxrexraptorxx.orecore.util;

import xxrexraptorxx.orecore.main.OreCore;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class RecipeHandler {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

     if(!OreCore.activateOilCrafting) {
    	ResourceLocation oil = new ResourceLocation("orecore:oil_bucket");
        modRegistry.remove(oil);
     }   
     
     if(!OreCore.activateBoneArmor) {
     	ResourceLocation boneArmor = new ResourceLocation("orecore:bone_helmet");
        modRegistry.remove(boneArmor);
       	ResourceLocation boneArmor1 = new ResourceLocation("orecore:bone_chestplate");
        modRegistry.remove(boneArmor1);
       	ResourceLocation boneArmor2 = new ResourceLocation("orecore:bone_leggins");
        modRegistry.remove(boneArmor2);
       	ResourceLocation boneArmor3 = new ResourceLocation("orecore:bone_boots");
        modRegistry.remove(boneArmor3);
       	ResourceLocation boneArmor4 = new ResourceLocation("orecore:fossil_helmet");
        modRegistry.remove(boneArmor4);
       	ResourceLocation boneArmor5 = new ResourceLocation("orecore:fossil_chestplate");
        modRegistry.remove(boneArmor5);
       	ResourceLocation boneArmor6 = new ResourceLocation("orecore:fossil_leggins");
        modRegistry.remove(boneArmor6);
       	ResourceLocation boneArmor7 = new ResourceLocation("orecore:fossil_boots");
        modRegistry.remove(boneArmor7);
     }
     
     if(!OreCore.activateEmeraldArmor) {
        ResourceLocation emeraldArmor1 = new ResourceLocation("orecore:emerald_helmet");
        modRegistry.remove(emeraldArmor1);
        ResourceLocation emeraldArmor2 = new ResourceLocation("orecore:emerald_chestplate");
        modRegistry.remove(emeraldArmor2);
        ResourceLocation emeraldArmor3 = new ResourceLocation("orecore:emerald_leggins");
        modRegistry.remove(emeraldArmor3);
        ResourceLocation emeraldArmor4 = new ResourceLocation("orecore:emerald_boots");
        modRegistry.remove(emeraldArmor4);
     }
     
     if(!OreCore.activateEmeraldTools) {
         ResourceLocation emeraldTools1 = new ResourceLocation("orecore:emerald_sword");
         modRegistry.remove(emeraldTools1);
         ResourceLocation emeraldTools2 = new ResourceLocation("orecore:emerald_axe");
         modRegistry.remove(emeraldTools2);
         ResourceLocation emeraldTools3 = new ResourceLocation("orecore:emerald_pickaxe");
         modRegistry.remove(emeraldTools3);
         ResourceLocation emeraldTools4 = new ResourceLocation("orecore:emerald_shovel");
         modRegistry.remove(emeraldTools4);
         ResourceLocation emeraldTools5 = new ResourceLocation("orecore:emerald_hoe");
         modRegistry.remove(emeraldTools5);
     }
     
     if(!OreCore.activateLavaCrystalArmor) {
     	 ResourceLocation lavaArmor1 = new ResourceLocation("orecore:lava_crystal_chestplate");
         modRegistry.remove(lavaArmor1);
     	 ResourceLocation lavaArmor2 = new ResourceLocation("orecore:lava_crystal_helmet");
         modRegistry.remove(lavaArmor2);
     	 ResourceLocation lavaArmor3 = new ResourceLocation("orecore:lava_crystal_leggins");
         modRegistry.remove(lavaArmor3);
     	 ResourceLocation lavaArmor4 = new ResourceLocation("orecore:lava_crystal_boots");
         modRegistry.remove(lavaArmor4);
     }
     
     if(!OreCore.activateLavaCrystalTools) {
     	 ResourceLocation lavaTools1 = new ResourceLocation("orecore:lava_crystal_sword");
         modRegistry.remove(lavaTools1);
     	 ResourceLocation lavaTools2 = new ResourceLocation("orecore:lava_crystal_axe");
         modRegistry.remove(lavaTools2);
     	 ResourceLocation lavaTools3 = new ResourceLocation("orecore:lava_crystal_pickaxe");
         modRegistry.remove(lavaTools3);
     	 ResourceLocation lavaTools4 = new ResourceLocation("orecore:lava_crystal_shovel");
         modRegistry.remove(lavaTools4);
     	 ResourceLocation lavaTools5 = new ResourceLocation("orecore:lava_crystal_hoe");
         modRegistry.remove(lavaTools5);
     }

    }
}  