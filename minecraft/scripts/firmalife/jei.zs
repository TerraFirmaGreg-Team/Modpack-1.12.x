#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Barrel;
import mods.firmalife.Oven;


// --- Удаление рецептов

// Молотки
Anvil.removeRecipe(<firmalife:bismuth_bronze_mallet_head>);
Anvil.removeRecipe(<firmalife:black_bronze_mallet_head>);
Anvil.removeRecipe(<firmalife:bronze_mallet_head>);
Anvil.removeRecipe(<firmalife:copper_mallet_head>);
Anvil.removeRecipe(<firmalife:wrought_iron_mallet_head>);
Anvil.removeRecipe(<firmalife:steel_mallet_head>);
Anvil.removeRecipe(<firmalife:black_steel_mallet_head>);
Anvil.removeRecipe(<firmalife:blue_steel_mallet_head>);
Anvil.removeRecipe(<firmalife:red_steel_mallet_head>);

// Cooked Pizza
Oven.removeRecipe(<firmalife:cooked_pizza>);

// Treated Lumber
Barrel.removeRecipe(<firmalife:treated_lumber>);

// Бафф крафта крыши теплицы
Anvil.removeRecipe(<firmalife:greenhouse_roof> * 2);

// Бафф крафта стен теплицы
Anvil.removeRecipe(<firmalife:greenhouse_wall> * 2);

// Greenhouse Door
Anvil.removeRecipe(<firmalife:greenhouse_door>);
