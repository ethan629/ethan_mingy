package net.ethan.tutorialmod;

import net.ethan.tutorialmod.enchantment.ModEnchantments;
import net.ethan.tutorialmod.item.ModItems;
import net.ethan.tutorialmod.item.block.ModBlocks;
import net.ethan.tutorialmod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEnchantments.registerModEnchantments();
		ModRegistries.registerModStuffs();
	}
}
