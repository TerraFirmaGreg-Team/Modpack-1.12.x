import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;

import mods.horsepower.Grindstone;

import mods.firmalife.Oven;

import mods.terrafirmacraft.ItemRegistry;
import mods.terrafirmacraft.Welding;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Quern;
import mods.terrafirmacraft.Heating;
import mods.terrafirmacraft.ClayKnapping;
import mods.terrafirmacraft.Barrel;
import mods.terrafirmacraft.LeatherKnapping;


// --- Добавление рецептов

// Регистрация металла
ItemRegistry.registerItemMetal(<tfc:metal/bucket/red_steel>, "WROUGHT_IRON", 144, true);

// Ковка монет
Anvil.addRecipe("tfg/gt/copper_coin", <metaitem:plateCopper>, <metaitem:credit.copper>, 1, "tools", "HIT_LAST", "HIT_LAST", "HIT_LAST");
Anvil.addRecipe("tfg/gt/gold_coin", <metaitem:plateGold>, <metaitem:credit.gold>, 2, "tools", "HIT_LAST", "HIT_LAST", "HIT_LAST");
Anvil.addRecipe("tfg/gt/silver_coin", <metaitem:plateSilver>, <metaitem:credit.silver>, 3, "tools", "HIT_LAST", "HIT_LAST", "HIT_LAST");
Anvil.addRecipe("tfg/gt/cupronickel_coin", <metaitem:plateCupronickel>, <metaitem:credit.cupronickel>, 3, "tools", "HIT_LAST", "HIT_LAST", "HIT_LAST");

// Новые рецепты ковки GT мечей
Anvil.addRecipe("tfg/tfc/sword_blade/copper", <ore:ingotDoubleCopper>, <metaitem:toolHeadSwordCopper>, 1, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/bismuth_bronze", <ore:ingotDoubleBismuthBronze>, <metaitem:toolHeadSwordBismuthBronze>, 2, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/black_bronze", <ore:ingotDoubleBlackBronze>, <metaitem:toolHeadSwordBlackBronze>, 2, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/bronze", <ore:ingotDoubleBronze>, <metaitem:toolHeadSwordBronze>, 2, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/wrought_iron", <ore:ingotDoubleWroughtIron>, <metaitem:toolHeadSwordWroughtIron>, 3, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/steel", <ore:ingotDoubleSteel>, <metaitem:toolHeadSwordSteel>, 4, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/black_steel", <ore:ingotDoubleBlackSteel>, <metaitem:toolHeadSwordBlackSteel>, 5, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/blue_steel", <ore:ingotDoubleBlueSteel>, <metaitem:toolHeadSwordBlueSteel>, 6, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sword_blade/red_steel", <ore:ingotDoubleRedSteel>, <metaitem:toolHeadSwordRedSteel>, 6, "tools", "HIT_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");

// Новые рецепты ковки GT кирок
Anvil.addRecipe("tfg/tfc/pick_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadPickaxeCopper>, 1, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadPickaxeBismuthBronze>, 2, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadPickaxeBlackBronze>, 2, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadPickaxeBronze>, 2, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadPickaxeWroughtIron>, 3, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadPickaxeSteel>, 4, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadPickaxeBlackSteel>, 5, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadPickaxeBlueSteel>, 6, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/pick_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadPickaxeRedSteel>, 6, "tools", "PUNCH_LAST", "BEND_NOT_LAST", "DRAW_NOT_LAST");

// Новые рецепты ковки GT топоров
Anvil.addRecipe("tfg/tfc/axe_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadAxeCopper>, 1, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadAxeBismuthBronze>, 2, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadAxeBlackBronze>, 2, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadAxeBronze>, 2, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadAxeWroughtIron>, 3, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadAxeSteel>, 4, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadAxeBlackSteel>, 5, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadAxeBlueSteel>, 6, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/axe_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadAxeRedSteel>, 6, "tools", "PUNCH_LAST", "HIT_SECOND_LAST", "UPSET_THIRD_LAST");

// Новые рецепты ковки GT лопат
Anvil.addRecipe("tfg/tfc/shovel_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadShovelCopper>, 1, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadShovelBismuthBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadShovelBlackBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadShovelBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadShovelWroughtIron>, 3, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadShovelSteel>, 4, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadShovelBlackSteel>, 5, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadShovelBlueSteel>, 6, "tools", "PUNCH_LAST", "HIT_NOT_LAST");
Anvil.addRecipe("tfg/tfc/shovel_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadShovelRedSteel>, 6, "tools", "PUNCH_LAST", "HIT_NOT_LAST");

// Новые рецепты ковки GT мотыг
Anvil.addRecipe("tfg/tfc/hoe_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadHoeCopper>, 1, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadHoeBismuthBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadHoeBlackBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadHoeBronze>, 2, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadHoeWroughtIron>, 3, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadHoeSteel>, 4, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadHoeBlackSteel>, 5, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadHoeBlueSteel>, 6, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hoe_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadHoeRedSteel>, 6, "tools", "PUNCH_LAST", "HIT_NOT_LAST", "BEND_NOT_LAST");

// Новые рецепты ковки GT пил
Anvil.addRecipe("tfg/tfc/saw_blade/copper", <metaitem:ingotCopper>, <metaitem:toolHeadSawCopper>, 1, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadSawBismuthBronze>, 2, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadSawBlackBronze>, 2, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadSawBronze>, 2, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadSawWroughtIron>, 3, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/steel", <metaitem:ingotSteel>, <metaitem:toolHeadSawSteel>, 4, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadSawBlackSteel>, 5, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadSawBlueSteel>, 6, "tools", "HIT_LAST", "HIT_SECOND_LAST");
Anvil.addRecipe("tfg/tfc/saw_blade/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadSawRedSteel>, 6, "tools", "HIT_LAST", "HIT_SECOND_LAST");

// Новые рецепты ковки GT молотков
Anvil.addRecipe("tfg/tfc/hammer_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadHammerCopper>, 1, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadHammerBismuthBronze>, 2, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadHammerBlackBronze>, 2, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadHammerBronze>, 2, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadHammerWroughtIron>, 3, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadHammerSteel>, 4, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadHammerBlackSteel>, 5, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadHammerBlueSteel>, 6, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");
Anvil.addRecipe("tfg/tfc/hammer_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadHammerRedSteel>, 6, "tools", "PUNCH_LAST", "SHRINK_NOT_LAST");

// Новые рецепты ковки GT ножей
Anvil.addRecipe("tfg/tfc/knife_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadKnifeCopper>, 1, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadKnifeBismuthBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadKnifeBlackBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadKnifeBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadKnifeWroughtIron>, 3, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadKnifeSteel>, 4, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadKnifeBlackSteel>, 5, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadKnifeBlueSteel>, 6, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/knife_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadKnifeRedSteel>, 6, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "DRAW_THIRD_LAST");

// Новые рецепты ковки GT кос
Anvil.addRecipe("tfg/tfc/sense_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadSenseCopper>, 1, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadSenseBismuthBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadSenseBlackBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadSenseBronze>, 2, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadSenseWroughtIron>, 3, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadSenseSteel>, 4, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadSenseBlackSteel>, 5, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadSenseBlueSteel>, 6, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/sense_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadSenseRedSteel>, 6, "tools", "HIT_LAST", "DRAW_SECOND_LAST", "BEND_THIRD_LAST");

// Новые рецепты ковки GT напильков
Anvil.addRecipe("tfg/tfc/file_head/copper", <metaitem:ingotCopper>, <metaitem:toolHeadFileCopper>, 1, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadFileBronze>, 2, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadFileBismuthBronze>, 2, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadFileBlackBronze>, 2, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadFileWroughtIron>, 3, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/steel", <metaitem:ingotSteel>, <metaitem:toolHeadFileSteel>, 4, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadFileBlackSteel>, 5, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadFileRedSteel>, 6, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");
Anvil.addRecipe("tfg/tfc/file_head/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadFileBlueSteel>, 6, "tools", "SHRINK_NOT_LAST", "DRAW_NOT_LAST", "PUNCH_LAST");

// Новые рецепты ковки GT propick
Anvil.addRecipe("tfg/tfc/propick/copper", <metaitem:ingotCopper>, <metaitem:toolHeadPropickCopper>, 1, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadPropickBronze>, 2, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadPropickBismuthBronze>, 2, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadPropickBlackBronze>, 2, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadPropickWroughtIron>, 3, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/steel", <metaitem:ingotSteel>, <metaitem:toolHeadPropickSteel>, 4, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadPropickBlackSteel>, 5, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadPropickRedSteel>, 6, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");
Anvil.addRecipe("tfg/tfc/propick/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadPropickBlueSteel>, 6, "tools", "PUNCH_LAST", "DRAW_NOT_LAST", "BEND_NOT_LAST");

// Новые рецепты ковки GT чизеля
Anvil.addRecipe("tfg/tfc/chisel/copper", <metaitem:ingotCopper>, <metaitem:toolHeadChiselCopper>, 1, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/bronze", <metaitem:ingotBronze>, <metaitem:toolHeadChiselBronze>, 2, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:toolHeadChiselBismuthBronze>, 2, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:toolHeadChiselBlackBronze>, 2, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:toolHeadChiselWroughtIron>, 3, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/steel", <metaitem:ingotSteel>, <metaitem:toolHeadChiselSteel>, 4, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/black_steel", <metaitem:ingotBlackSteel>, <metaitem:toolHeadChiselBlackSteel>, 5, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/red_steel", <metaitem:ingotRedSteel>, <metaitem:toolHeadChiselRedSteel>, 6, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");
Anvil.addRecipe("tfg/tfc/chisel/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:toolHeadChiselBlueSteel>, 6, "tools", "HIT_LAST", "HIT_NOT_LAST", "DRAW_NOT_LAST");

// Крафт ножниц
Welding.addRecipe("tfg/tfc/shears/copper", <metaitem:toolHeadKnifeCopper>, <metaitem:toolHeadKnifeCopper>, <tfc:metal/shears/copper>, 1);
Welding.addRecipe("tfg/tfc/shears/bronze", <metaitem:toolHeadKnifeBronze>, <metaitem:toolHeadKnifeBronze>, <tfc:metal/shears/bronze>, 2);
Welding.addRecipe("tfg/tfc/shears/bismuth_bronze", <metaitem:toolHeadKnifeBismuthBronze>, <metaitem:toolHeadKnifeBismuthBronze>, <tfc:metal/shears/bismuth_bronze>, 2);
Welding.addRecipe("tfg/tfc/shears/black_bronze", <metaitem:toolHeadKnifeBlackBronze>, <metaitem:toolHeadKnifeBlackBronze>, <tfc:metal/shears/black_bronze>, 2);
Welding.addRecipe("tfg/tfc/shears/wrought_iron", <metaitem:toolHeadKnifeWroughtIron>, <metaitem:toolHeadKnifeWroughtIron>, <tfc:metal/shears/wrought_iron>, 3);
Welding.addRecipe("tfg/tfc/shears/steel", <metaitem:toolHeadKnifeSteel>, <metaitem:toolHeadKnifeSteel>, <tfc:metal/shears/steel>, 4);
Welding.addRecipe("tfg/tfc/shears/black_steel", <metaitem:toolHeadKnifeBlackSteel>, <metaitem:toolHeadKnifeBlackSteel>, <tfc:metal/shears/black_steel>, 5);
Welding.addRecipe("tfg/tfc/shears/red_steel", <metaitem:toolHeadKnifeRedSteel>, <metaitem:toolHeadKnifeRedSteel>, <tfc:metal/shears/red_steel>, 6);
Welding.addRecipe("tfg/tfc/shears/blue_steel", <metaitem:toolHeadKnifeBlueSteel>, <metaitem:toolHeadKnifeBlueSteel>, <tfc:metal/shears/blue_steel>, 6);

// --- Унификация пластин
Anvil.addRecipe("tfg/tfc/plate/bismuth", <metaitem:ingotBismuth>, <metaitem:plateBismuth>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/bismuth_bronze", <metaitem:ingotBismuthBronze>, <metaitem:plateBismuthBronze>, 2, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/black_bronze", <metaitem:ingotBlackBronze>, <metaitem:plateBlackBronze>, 2, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/brass", <metaitem:ingotBrass>, <metaitem:plateBrass>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/bronze", <metaitem:ingotBronze>, <metaitem:plateBronze>, 2, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/copper", <metaitem:ingotCopper>, <metaitem:plateCopper>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/gold", <minecraft:gold_ingot>, <metaitem:plateGold>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/lead", <metaitem:ingotLead>, <metaitem:plateLead>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/nickel", <metaitem:ingotNickel>, <metaitem:plateNickel>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/rose_gold", <metaitem:ingotRoseGold>, <metaitem:plateRoseGold>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/silver", <metaitem:ingotSilver>, <metaitem:plateSilver>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/tin", <metaitem:ingotTin>, <metaitem:plateTin>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/zinc", <metaitem:ingotZinc>, <metaitem:plateZinc>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/sterling_silver", <metaitem:ingotSterlingSilver>, <metaitem:plateSterlingSilver>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/wrought_iron", <metaitem:ingotWroughtIron>, <metaitem:plateWroughtIron>, 1, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/steel", <metaitem:ingotSteel>, <metaitem:plateSteel>, 4, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/platinum", <metaitem:ingotPlatinum>, <metaitem:platePlatinum>, 5, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/black_steel", <metaitem:ingotBlackSteel>, <metaitem:plateBlackSteel>, 5, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/blue_steel", <metaitem:ingotBlueSteel>, <metaitem:plateBlueSteel>, 6, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");
Anvil.addRecipe("tfg/tfc/plate/red_steel", <metaitem:ingotRedSteel>, <metaitem:plateRedSteel>, 6, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// --- Унификация двойных пластин
Welding.addRecipe("tfg/tfc/double_plate/bismuth", <metaitem:plateBismuth>, <metaitem:plateBismuth>, <metaitem:plateDoubleBismuth>, 1);
Welding.addRecipe("tfg/tfc/double_plate/bismuth_bronze", <metaitem:plateBismuthBronze>, <metaitem:plateBismuthBronze>, <metaitem:plateDoubleBismuthBronze>, 2);
Welding.addRecipe("tfg/tfc/double_plate/black_bronze", <metaitem:plateBlackBronze>, <metaitem:plateBlackBronze>, <metaitem:plateDoubleBlackBronze>, 2);
Welding.addRecipe("tfg/tfc/double_plate/brass", <metaitem:plateBrass>, <metaitem:plateBrass>, <metaitem:plateDoubleBrass>, 1);
Welding.addRecipe("tfg/tfc/double_plate/bronze", <metaitem:plateBronze>, <metaitem:plateBronze>, <metaitem:plateDoubleBronze>, 2);
Welding.addRecipe("tfg/tfc/double_plate/copper", <metaitem:plateCopper>, <metaitem:plateCopper>, <metaitem:plateDoubleCopper>, 1);
Welding.addRecipe("tfg/tfc/double_plate/gold", <metaitem:plateGold>, <metaitem:plateGold>, <metaitem:plateDoubleGold>, 1);
Welding.addRecipe("tfg/tfc/double_plate/lead", <metaitem:plateLead>, <metaitem:plateLead>, <metaitem:plateDoubleLead>, 1);
Welding.addRecipe("tfg/tfc/double_plate/nickel", <metaitem:plateNickel>, <metaitem:plateNickel>, <metaitem:plateDoubleNickel>, 1);
Welding.addRecipe("tfg/tfc/double_plate/rose_gold", <metaitem:plateRoseGold>, <metaitem:plateRoseGold>, <metaitem:plateDoubleRoseGold>, 1);
Welding.addRecipe("tfg/tfc/double_plate/silver", <metaitem:plateSilver>, <metaitem:plateSilver>, <metaitem:plateDoubleSilver>, 1);
Welding.addRecipe("tfg/tfc/double_plate/tin", <metaitem:plateTin>, <metaitem:plateTin>, <metaitem:plateDoubleTin>, 1);
Welding.addRecipe("tfg/tfc/double_plate/zinc", <metaitem:plateZinc>, <metaitem:plateZinc>, <metaitem:plateDoubleZinc>, 1);
Welding.addRecipe("tfg/tfc/double_plate/sterling_silver", <metaitem:plateSterlingSilver>, <metaitem:plateSterlingSilver>, <metaitem:plateDoubleSterlingSilver>, 1);
Welding.addRecipe("tfg/tfc/double_plate/wrought_iron", <metaitem:plateWroughtIron>, <metaitem:plateWroughtIron>, <metaitem:plateDoubleWroughtIron>, 3);
Welding.addRecipe("tfg/tfc/double_plate/steel", <metaitem:plateSteel>, <metaitem:plateSteel>, <metaitem:plateDoubleSteel>, 4);
Welding.addRecipe("tfg/tfc/double_plate/platinum", <metaitem:platePlatinum>, <metaitem:platePlatinum>, <metaitem:plateDoublePlatinum>, 5);
Welding.addRecipe("tfg/tfc/double_plate/black_steel", <metaitem:plateBlackSteel>, <metaitem:plateBlackSteel>, <metaitem:plateDoubleBlackSteel>, 5);
Welding.addRecipe("tfg/tfc/double_plate/blue_steel", <metaitem:plateBlueSteel>, <metaitem:plateBlueSteel>, <metaitem:plateDoubleBlueSteel>, 6);
Welding.addRecipe("tfg/tfc/double_plate/red_steel", <metaitem:plateRedSteel>, <metaitem:plateRedSteel>, <metaitem:plateDoubleRedSteel>, 6);

//  Унификация высокоуглеродной стали
Anvil.addRecipe("tfg/tfc/high_carbon_steel", <ore:ingotPigIron>, <tfc:metal/ingot/high_carbon_steel>, 3, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// Унификация высокоуглеродной черной стали
Welding.addRecipe("tfg/tfc/high_carbon_black_steel", <tfc:metal/ingot/weak_steel>, <ore:ingotPigIron>, <tfc:metal/ingot/high_carbon_black_steel>, 3);

// Унификация высокоуглеродной красной стали
Welding.addRecipe("tfg/tfc/high_carbon_red_steel", <tfc:metal/ingot/weak_red_steel>, <metaitem:ingotBlackSteel>, <tfc:metal/ingot/high_carbon_red_steel>, 4);

// Унификация высокоуглеродной синей стали
Welding.addRecipe("tfg/tfc/high_carbon_blue_steel", <tfc:metal/ingot/weak_blue_steel>, <metaitem:ingotBlackSteel>, <tfc:metal/ingot/high_carbon_blue_steel>, 4);

// Унификация стали
Anvil.addRecipe("tfg/tfc/steel_ingot", <tfc:metal/ingot/high_carbon_steel>, <metaitem:ingotSteel>, 3, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// Унификация черной стали
Anvil.addRecipe("tfg/tfc/black_steel_ingot", <tfc:metal/ingot/high_carbon_black_steel>, <metaitem:ingotBlackSteel>, 4, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// Унификация красной стали
Anvil.addRecipe("tfg/tfc/red_steel_ingot", <tfc:metal/ingot/high_carbon_red_steel>, <metaitem:ingotRedSteel>, 5, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// Унификация синей стали
Anvil.addRecipe("tfg/tfc/blue_steel_ingot", <tfc:metal/ingot/high_carbon_blue_steel>, <metaitem:ingotBlueSteel>, 5, "general", "HIT_LAST", "HIT_SECOND_LAST", "HIT_THIRD_LAST");

// Унификация каолинита(Mica)
Quern.addRecipe("tfg/tfc/quern_mica_to_kaolinite", <metaitem:dustMica>, <tfc:powder/kaolinite> * 2);
Grindstone.add(<metaitem:dustMica>, <tfc:powder/kaolinite> * 4, 10, false);

// Унификация графита
Quern.addRecipe("tfg/tfc/quern_graphite_to_graphite", <metaitem:dustGraphite>, <tfc:powder/graphite> * 2);
Grindstone.add(<metaitem:dustGraphite>, <tfc:powder/graphite> * 4, 10, false);

// Унификация соли
Quern.addRecipe("tfg/tfc/quern_saltrock_to_salt", <tfc:rock/rocksalt>, <metaitem:dustSalt> * 4);
Grindstone.add(<tfc:rock/rocksalt>, <metaitem:dustSalt> * 8, 10, false);

// Обшивка доменной печи
Welding.addRecipe("tfg/tfc/blast_furnace_cladding", <metaitem:plateWroughtIron>, <metaitem:plateCopper>, <tfc:metal/sheet/wrought_iron>, 3);

// Ведро из красной стали
Anvil.addRecipe("tfg/tfc/bucket/red_steel", <metaitem:plateWroughtIron>, <tfc:metal/bucket/red_steel>, 3, "general", "BEND_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");

// Гриль
Anvil.addRecipe("tfg/tfc/grill", <metaitem:plateDoubleWroughtIron>, <tfc:wrought_iron_grill>, 3, "general", "DRAW_ANY", "PUNCH_LAST", "PUNCH_NOT_LAST");

// Железная дверь
Anvil.addRecipe("tfg/tfc/iron_door", <metaitem:plateDoubleWroughtIron>, <minecraft:iron_door>, 3, "general", "HIT_LAST", "DRAW_NOT_LAST", "PUNCH_NOT_LAST");

// Iron Bars x8
Anvil.addRecipe("tfg/tfc/iron_bars", <metaitem:plateWroughtIron>, <minecraft:iron_bars> * 8, 3, "general", "UPSET_LAST", "PUNCH_SECOND_LAST", "PUNCH_THIRD_LAST");

// Iron Bars x16
Anvil.addRecipe("tfg/tfc/iron_bars_double", <metaitem:plateDoubleWroughtIron>, <minecraft:iron_bars> * 16, 3, "general", "UPSET_LAST", "PUNCH_SECOND_LAST", "PUNCH_THIRD_LAST");

// Ром
Barrel.addRecipe("tfg/tfc/rum", <minecraft:sugar>, <liquid:hot_water> * 500, <liquid:rum> * 500, 72);

// Липкая резина
Barrel.addRecipe("tfg/tfc/sticky_resin", <tfctech:latex/rubber_mix>, <liquid:latex> * 250, <metaitem:rubber_drop>, 6);

// Алабастер
Barrel.addRecipe("tfg/tfc/alabaster", <metaitem:dustGypsum> * 2, <liquid:limewater> * 250, <tfc:alabaster/raw/plain>, 6);

// Flux в молотилке
Quern.addRecipe("tfg/tfc/flux_rock_to_flux", <ore:rockFlux>, <tfc:powder/flux> * 2);

// Различные крафты для лассо
LeatherKnapping.addRecipe("tfg/tfc/lead", <minecraft:lead>, "XXXXX", "X XXX", "X X X", "X   X", "XXXXX");



