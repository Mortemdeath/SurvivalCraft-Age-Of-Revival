package net.mellowdrama.survivalcraft;

import net.fabricmc.api.ModInitializer;

import net.mellowdrama.survivalcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Survivalcraft implements ModInitializer {
	public static final String MOD_ID = "survival-craft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}