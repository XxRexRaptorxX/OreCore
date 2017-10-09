package xxrexraptorxx.orecore.util;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class ChiselHelper {
	
	public static void chisel() {
		
		FMLInterModComms.sendMessage("chisel", "variation:add", "basalt|OreCore:basalt_ore|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "basalt|OreCore:basalt_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "marble|OreCore:marmor_ore|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "marble|OreCore:marmor_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "slate|OreCore:slate_ore|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "slate|OreCore:slate_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "netherrack|OreCore:magmarack_block|0");
	}

}
