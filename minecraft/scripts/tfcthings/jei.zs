#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.terrafirmacraft.Welding;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Heating;
import mods.terrafirmacraft.ClayKnapping;
import mods.terrafirmacraft.Quern;


// --- Удаление рецептов

// Removing Prospect Hammer
ClayKnapping.removeRecipe(<tfcthings:mold/unfired/prospectors_hammer_head>);
Heating.removeRecipe(<tfcthings:mold/prospectors_hammer_head>);

// Remove carrots
Anvil.removeRecipe(<tfcthings:pig_iron_carrot>);
Anvil.removeRecipe(<tfcthings:black_steel_carrot>);
Anvil.removeRecipe(<tfcthings:blue_steel_carrot>);
Anvil.removeRecipe(<tfcthings:red_steel_carrot>);

// Bracing
Anvil.removeRecipe(<tfcthings:metal_bracing>);
Anvil.removeRecipe(<tfcthings:metal_bracing> * 2);

// Молотки
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/bismuth_bronze>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/black_bronze>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/bronze>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/copper>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/wrought_iron>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/steel>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/black_steel>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/blue_steel>);
Anvil.removeRecipe(<tfcthings:prospectors_hammer_head/red_steel>);

// Black Steel Grindstone
Welding.removeRecipe(<tfcthings:grindstone_steel>);

// Heavy Sling Ammo recipe
Anvil.removeRecipe(<tfcthings:sling_ammo> * 8);
Anvil.removeRecipe(<tfcthings:sling_ammo> * 16);

// Отключение затачивалок всех типов (Временно)
Welding.removeRecipe(<tfcthings:honing_steel_diamond>);
Welding.removeRecipe(<tfcthings:honing_steel_head_diamond>);
Anvil.removeRecipe(<tfcthings:honing_steel_head>);
Quern.removeRecipe(<tfcthings:whetstone>);