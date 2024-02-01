#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.terrafirmacraft.Welding;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Barrel;
import mods.tfctech.WireDrawing;


// --- Массивы

val RemoveRecipeWireDrawing as IItemStack[] = [
	// Wires, no GT
   <tfctech:metal/bismuth_wire:0>,
   <tfctech:metal/bismuth_wire:1>,
   <tfctech:metal/bismuth_wire:2>,
   <tfctech:metal/bismuth_wire:3>,
   <tfctech:metal/bismuth_bronze_wire:0>,
   <tfctech:metal/bismuth_bronze_wire:1>,
   <tfctech:metal/bismuth_bronze_wire:2>,
   <tfctech:metal/bismuth_bronze_wire:3>,
   <tfctech:metal/black_bronze_wire:0>,
   <tfctech:metal/black_bronze_wire:1>,
   <tfctech:metal/black_bronze_wire:2>,
   <tfctech:metal/black_bronze_wire:3>,
   <tfctech:metal/brass_wire:0>,
   <tfctech:metal/brass_wire:1>,
   <tfctech:metal/brass_wire:2>,
   <tfctech:metal/brass_wire:3>,
   <tfctech:metal/bronze_wire:0>,
   <tfctech:metal/bronze_wire:1>,
   <tfctech:metal/bronze_wire:2>,
   <tfctech:metal/bronze_wire:3>,
   <tfctech:metal/rose_gold_wire:0>,
   <tfctech:metal/rose_gold_wire:1>,
   <tfctech:metal/rose_gold_wire:2>,
   <tfctech:metal/rose_gold_wire:3>,
   <tfctech:metal/wrought_iron_wire:0>,
   <tfctech:metal/wrought_iron_wire:1>,
   <tfctech:metal/wrought_iron_wire:2>,
   <tfctech:metal/wrought_iron_wire:3>,
   <tfctech:metal/pig_iron_wire:0>,
   <tfctech:metal/pig_iron_wire:1>,
   <tfctech:metal/pig_iron_wire:2>,
   <tfctech:metal/pig_iron_wire:3>,
   <tfctech:metal/blue_steel_wire:0>,
   <tfctech:metal/blue_steel_wire:1>,
   <tfctech:metal/blue_steel_wire:2>,
   <tfctech:metal/blue_steel_wire:3>,
   <tfctech:metal/red_steel_wire:0>,
   <tfctech:metal/red_steel_wire:1>,
   <tfctech:metal/red_steel_wire:2>,
   <tfctech:metal/red_steel_wire:3>,
   <tfctech:metal/zinc_wire:0>,
   <tfctech:metal/zinc_wire:1>,
   <tfctech:metal/zinc_wire:2>,
   <tfctech:metal/zinc_wire:3>,
   <tfctech:metal/sterling_silver_wire:0>,
   <tfctech:metal/sterling_silver_wire:1>,
   <tfctech:metal/sterling_silver_wire:2>,
   <tfctech:metal/sterling_silver_wire:3>,
   // Wires, GT
   <tfctech:metal/copper_wire>,
   <tfctech:metal/gold_wire>,
   <tfctech:metal/lead_wire>,
   <tfctech:metal/nickel_wire>,
   <tfctech:metal/silver_wire>,
   <tfctech:metal/tin_wire>,
   <tfctech:metal/steel_wire>,
   <tfctech:metal/platinum_wire>,
   <tfctech:metal/black_steel_wire>
];

val RemoveRecipeAnvil as IItemStack[] = [
   // Wires - Stage 1
   <tfctech:metal/bismuth_wire:4>,
   <tfctech:metal/bismuth_bronze_wire:4>,
   <tfctech:metal/black_bronze_wire:4>,
   <tfctech:metal/brass_wire:4>,
   <tfctech:metal/bronze_wire:4>,
   <tfctech:metal/rose_gold_wire:4>,
   <tfctech:metal/zinc_wire:4>,
   <tfctech:metal/sterling_silver_wire:4>,
   <tfctech:metal/wrought_iron_wire:4>,
   <tfctech:metal/pig_iron_wire:4>,
   <tfctech:metal/blue_steel_wire:4>,
   <tfctech:metal/red_steel_wire:4>,
   // Draw Plates
   <tfctech:metal/iron_draw_plate>,
   <tfctech:metal/steel_draw_plate>,
   <tfctech:metal/black_steel_draw_plate>,
   // Blowpipes
   <tfctech:metal/wrought_iron_blowpipe>,
   <tfctech:metal/steel_blowpipe>,
   <tfctech:metal/black_steel_blowpipe>,
   <tfctech:metal/blue_steel_blowpipe>,
   <tfctech:metal/red_steel_blowpipe>,
   // Other
   <tfctech:metal/iron_tongs>,
   <tfctech:metal/iron_bowl_mount>,
   // Long
   <tfctech:metal/bismuth_long_rod>,
	<tfctech:metal/bismuth_bronze_long_rod>,
	<tfctech:metal/black_bronze_long_rod>,
	<tfctech:metal/brass_long_rod>,
	<tfctech:metal/bronze_long_rod>,
	<tfctech:metal/copper_long_rod>,
	<tfctech:metal/gold_long_rod>,
	<tfctech:metal/lead_long_rod>,
	<tfctech:metal/nickel_long_rod>,
	<tfctech:metal/rose_gold_long_rod>,
	<tfctech:metal/silver_long_rod>,
	<tfctech:metal/tin_long_rod>,
	<tfctech:metal/zinc_long_rod>,
	<tfctech:metal/sterling_silver_long_rod>,
	<tfctech:metal/wrought_iron_long_rod>,
	<tfctech:metal/pig_iron_long_rod>,
	<tfctech:metal/steel_long_rod>,
	<tfctech:metal/platinum_long_rod>,
	<tfctech:metal/black_steel_long_rod>,
	<tfctech:metal/blue_steel_long_rod>,
	<tfctech:metal/red_steel_long_rod>
];

val RemoveRecipeWelding as IItemStack[] = [
   // Gears
   <tfctech:metal/sterling_silver_gear>,
   <tfctech:metal/tin_gear>,
   <tfctech:metal/silver_gear>,
   <tfctech:metal/rose_gold_gear>,
   <tfctech:metal/lead_gear>,
   <tfctech:metal/gold_gear>,
   <tfctech:metal/copper_gear>,
   <tfctech:metal/brass_gear>,
   <tfctech:metal/bismuth_bronze_gear>,
   <tfctech:metal/steel_gear>,
   <tfctech:metal/wrought_iron_gear>,
   <tfctech:metal/zinc_gear>,
   <tfctech:metal/nickel_gear>,
   <tfctech:metal/bronze_gear>,
   <tfctech:metal/black_bronze_gear>,
   <tfctech:metal/bismuth_gear>,
   <tfctech:metal/black_steel_gear>,
   <tfctech:metal/blue_steel_gear>,
   <tfctech:metal/platinum_gear>,
   <tfctech:metal/pig_iron_gear>,
   <tfctech:metal/red_steel_gear>
];

// --- Удаление рецептов

for item in RemoveRecipeWireDrawing {
   WireDrawing.removeRecipe(item);
}

// Удаление рецептов ковки
for item in RemoveRecipeAnvil {
   Anvil.removeRecipe(item);
}

// Удаление рецептов сварки
for item in RemoveRecipeWelding {
   Welding.removeRecipe(item);
}


// Резина
Barrel.removeRecipe(<tfctech:latex/rubber_mix> * 6);