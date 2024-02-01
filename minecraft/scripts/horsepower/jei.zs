#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.horsepower.Grindstone;


// --- Массивы


val RemoveRecipesGrindstone as IItemStack[] = [
   <tfc:powder/flux> * 4,
   <minecraft:redstone> * 8,
   <tfc:powder/fertilizer> * 8,
   <minecraft:glowstone_dust> * 8
];

// --- Удаление рецептов


// Дробилка
for item in RemoveRecipesGrindstone {
   Grindstone.remove(item);
}

furnace.remove(<minecraft:bread>);
