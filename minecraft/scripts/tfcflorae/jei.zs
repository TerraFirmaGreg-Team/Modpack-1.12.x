#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.terrafirmacraft.Barrel;
import mods.terrafirmacraft.LeatherKnapping;
import mods.terrafirmacraft.StoneKnapping;


// --- Удаление рецептов

// Недоработанные рецепты вина из Pear
Barrel.removeRecipe(<liquid:pear_wine> * 500);
Barrel.removeRecipe(<liquid:pear_brandy> * 500);

// Недоработанные рецепты вина из Papaya
Barrel.removeRecipe(<liquid:papaya_wine> * 500);
Barrel.removeRecipe(<liquid:papaya_brandy> * 500);

// Недоработанные рецепты вина из Orange
Barrel.removeRecipe(<liquid:orange_wine> * 500);

Barrel.removeRecipe(<minecraft:clay_ball>);

Barrel.removeRecipe(<tfc:crop/product/dirty_jute_net>, <liquid:olive_oil> * 50);
Barrel.removeRecipe(<tfcflorae:crop/product/dirty_sisal_net>, <liquid:olive_oil> * 50);
Barrel.removeRecipe(<tfcflorae:crop/product/dirty_silk_net>, <liquid:olive_oil> * 50);
Barrel.removeRecipe(<tfcflorae:crop/product/dirty_cotton_net>, <liquid:olive_oil> * 50);
Barrel.removeRecipe(<tfcflorae:crop/product/dirty_linen_net>, <liquid:olive_oil> * 50);
Barrel.removeRecipe(<tfcflorae:crop/product/dirty_hemp_net>, <liquid:olive_oil> * 50);

LeatherKnapping.removeRecipe(<tfcflorae:container/leather_bag>);
LeatherKnapping.removeRecipe(<tfcflorae:container/pineapple_leather_bag>);

// Удаление голов флинтовых инструментов
mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/javelin_head/flint>);

mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/hammer_head/flint>);

mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/knife_head/flint>);
mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/knife_head/flint> * 2);

mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/hoe_head/flint>);
mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/hoe_head/flint> * 2);

mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/axe_head/flint>);
mods.tfcflorae.knapping.remove("flint", <tfcflorae:tools/flint/shovel_head/flint>);

