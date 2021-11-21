package mods.realdarkgamer.darksmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import mods.realdarkgamer.darksmod.block.DarkEssenceBlockBlock;
import mods.realdarkgamer.darksmod.DarksmodMod;

import java.util.Map;

public class DarkPowderBlockCheckForWaterProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DarksmodMod.LOGGER.warn("Failed to load dependency x for procedure DarkPowderBlockCheckForWater!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DarksmodMod.LOGGER.warn("Failed to load dependency y for procedure DarkPowderBlockCheckForWater!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DarksmodMod.LOGGER.warn("Failed to load dependency z for procedure DarkPowderBlockCheckForWater!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DarksmodMod.LOGGER.warn("Failed to load dependency world for procedure DarkPowderBlockCheckForWater!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = (double) (-1);
		found = (boolean) (false);
		for (int index0 = 0; index0 < (int) (3); index0++) {
			sy = (double) (-1);
			for (int index1 = 0; index1 < (int) (3); index1++) {
				sz = (double) (-1);
				for (int index2 = 0; index2 < (int) (3); index2++) {
					if (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.WATER)) {
						found = (boolean) (true);
					}
					if (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.WATER)) {
						found = (boolean) (true);
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		if ((found == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarkEssenceBlockBlock.block.getDefaultState(), 3);
		}
	}
}
