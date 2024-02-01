import crafttweaker.item.IItemStack;

import mods.terrafirmacraft.ItemRegistry;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Barrel;

import mods.firmalife.Oven;
import mods.firmalife.Drying;


// --- Добавление рецептов

// Присвоение единиц металла
// Mallet Heads
ItemRegistry.registerItemMetal(<firmalife:bismuth_bronze_mallet_head>, "BISMUTH_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:black_bronze_mallet_head>, "BLACK_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:bronze_mallet_head>, "BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:copper_mallet_head>, "COPPER", 144, true);
ItemRegistry.registerItemMetal(<firmalife:wrought_iron_mallet_head>, "WROUGHT_IRON", 144, true);
ItemRegistry.registerItemMetal(<firmalife:steel_mallet_head>, "STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:black_steel_mallet_head>, "BLACK_STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:blue_steel_mallet_head>, "BLUE_STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:red_steel_mallet_head>, "RED_STEEL", 144, true);
// Mallets
ItemRegistry.registerItemMetal(<firmalife:bismuth_bronze_mallet>, "BISMUTH_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:black_bronze_mallet>, "BLACK_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:bronze_mallet>, "BRONZE", 144, true);
ItemRegistry.registerItemMetal(<firmalife:copper_mallet>, "COPPER", 144, true);
ItemRegistry.registerItemMetal(<firmalife:wrought_iron_mallet>, "WROUGHT_IRON", 144, true);
ItemRegistry.registerItemMetal(<firmalife:steel_mallet>, "STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:black_steel_mallet>, "BLACK_STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:blue_steel_mallet>, "BLUE_STEEL", 144, true);
ItemRegistry.registerItemMetal(<firmalife:red_steel_mallet>, "RED_STEEL", 144, true);


// Удобрение
Drying.addRecipe("tfg/firmalife/fertilizer", <tfc:wood_ash>, <tfc:powder/fertilizer>, 8000);

// Высушивание соли
Drying.addRecipe("tfg/firmalife/salt", <tfc:wooden_bucket>.withTag({Fluid: {FluidName: "salt_water", Amount: 1000}}), <tfg:meta_item:51>, 24000);

// Greenhouse Door
Anvil.addRecipe("tfg/firmalife/greenhouse_door", <metaitem:plateWroughtIron>, <firmalife:greenhouse_door> * 4, 3, "general", "HIT_NOT_LAST", "HIT_NOT_LAST", "PUNCH_LAST");

// Бафф крафта стен теплицы
Anvil.addRecipe("tfg/firmalife/greenhouse_wall", <metaitem:plateWroughtIron>, <firmalife:greenhouse_wall> * 4, 3, "general", "HIT_NOT_LAST", "PUNCH_NOT_LAST", "SHRINK_LAST");

// Бафф крафта крыши теплицы
Anvil.addRecipe("tfg/firmalife/greenhouse_roof", <metaitem:plateWroughtIron>, <firmalife:greenhouse_roof> * 4, 3, "general", "HIT_THIRD_LAST", "PUNCH_SECOND_LAST", "PUNCH_LAST");

// Treated Lumber
Barrel.addRecipe("tfg/firmalife/treated_lumber", <ore:lumber>, <liquid:olive_oil> * 500, <firmalife:treated_lumber>, 8);

// Молотки
Anvil.addRecipe("tfg:firmalife_bismuth_bronze_hammer", <metaitem:ingotBismuthBronze>, <firmalife:bismuth_bronze_mallet_head>, 2, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_black_bronze_hammer", <metaitem:ingotBlackBronze>, <firmalife:black_bronze_mallet_head>, 2, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_bronze_hammer", <metaitem:ingotBronze>, <firmalife:bronze_mallet_head>, 2, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_copper_hammer", <metaitem:ingotCopper>, <firmalife:copper_mallet_head>, 1, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_wrought_iron_hammer", <metaitem:ingotWroughtIron>, <firmalife:wrought_iron_mallet_head>, 3, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_steel_hammer", <metaitem:ingotSteel>, <firmalife:steel_mallet_head>, 4, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_black_steel_hammer", <metaitem:ingotBlackSteel>, <firmalife:black_steel_mallet_head>, 5, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_blue_steel_hammer", <metaitem:ingotBlueSteel>, <firmalife:blue_steel_mallet_head>, 6, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");
Anvil.addRecipe("tfg:firmalife_red_steel_hammer", <metaitem:ingotRedSteel>, <firmalife:red_steel_mallet_head>, 6, "general", "PUNCH_LAST", "PUNCH_SECOND_LAST", "SHRINK_THIRD_LAST");