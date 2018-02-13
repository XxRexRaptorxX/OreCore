package xxrexraptorxx.orecore.worldGen;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class WorldRegister {

	public static void MainRegister(){
	registerWorldGen(new WorldGenOre(),1);
	}

	public static void registerWorldGen(IWorldGenerator iGenerator, int weightedProbability) {
		GameRegistry.registerWorldGenerator(iGenerator, weightedProbability);
	}
}
