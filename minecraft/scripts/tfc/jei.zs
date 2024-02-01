#priority 980

import mods.jei.JEI;
import crafttweaker.item.IItemStack;
import mods.terrafirmacraft.Quern;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Heating;
import mods.terrafirmacraft.Barrel;
import mods.terrafirmacraft.Welding;
import mods.terrafirmacraft.StoneKnapping;
import mods.horsepower.Grindstone;
import mods.firmalife.Oven;

// --- Массивы

val RemoveItemsQuern as IItemStack[] = [
	<tfc:gem/diamond:2>,
	<tfc:powder/fertilizer>,
	<tfc:powder/malachite>,
	<tfc:powder/limonite>,
	<tfc:ore/gypsum>,
	<tfc:powder/hematite>,
	<minecraft:redstone> * 8,
	<tfc:powder/flux> * 6
];


// --- Удаление рецептов

// Удаление неиспользуемых рецептов из Quern
for item in RemoveItemsQuern {
   Quern.removeRecipe(item);
}

// Удаление некоторых рецептов PigIron
Welding.removeRecipe(<tfc:metal/double_ingot/pig_iron>);
Anvil.removeRecipe(<tfc:metal/trapdoor/pig_iron>);

// Унификация высокоуглеродной стали
Anvil.removeRecipe(<tfc:metal/ingot/high_carbon_steel>);

// Унификация высокоуглеродной черной стали
Welding.removeRecipe(<tfc:metal/ingot/high_carbon_black_steel>);

// Унификация высокоуглеродной красной стали
Welding.removeRecipe(<tfc:metal/ingot/high_carbon_red_steel>);

// Унификация высокоуглеродной синей стали
Welding.removeRecipe(<tfc:metal/ingot/high_carbon_blue_steel>);

// Унификация стали
Anvil.removeRecipe(<tfc:metal/ingot/steel>);

// Унификация черной стали
Anvil.removeRecipe(<tfc:metal/ingot/black_steel>);

// Унификация красной стали
Anvil.removeRecipe(<tfc:metal/ingot/red_steel>);

// Унификация синей стали
Anvil.removeRecipe(<tfc:metal/ingot/blue_steel>);

// Унификация каолинита(Mica)
Quern.removeRecipe(<tfc:powder/kaolinite> * 4);
Heating.removeRecipe(<tfc:powder/kaolinite>);
Oven.removeRecipe(<tfc:powder/kaolinite>);
Grindstone.remove(<tfc:powder/kaolinite> * 6);

// Унификация графита
Quern.removeRecipe(<tfc:powder/graphite> * 4);
Grindstone.remove(<tfc:powder/graphite> * 6);

// Унификация серы
Quern.removeRecipe(<tfc:powder/sulfur> * 4);
Grindstone.remove(<tfc:powder/sulfur> * 8);

// Унификация ляписа
Quern.removeRecipe(<tfc:powder/lapis_lazuli> * 4);
Grindstone.remove(<tfc:powder/lapis_lazuli> * 8);

// Унификация древесный уголь
Quern.removeRecipe(<tfc:powder/charcoal> * 4);
Grindstone.remove(<tfc:powder/charcoal> * 8);

// Унификация соли
Quern.removeRecipe(<tfc:powder/salt>);
Grindstone.remove(<tfc:powder/salt>);

// Унификация сальпетера
Quern.removeRecipe(<tfc:powder/saltpeter>);
Grindstone.remove(<tfc:powder/saltpeter>);

// Ром
Barrel.removeRecipe(<liquid:rum> * 500);

// Удаление рецептов цемента 4х песок + 4х гравий без словаря руд
// White Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_white> * 144]).remove();
// Orange Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_orange> * 144]).remove();
// Magenta Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_magenta> * 144]).remove();
// Light Blue Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_light_blue> * 144]).remove();
// Yellow Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_yellow> * 144]).remove();
// Lime Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_lime> * 144]).remove();
// Pink Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_pink> * 144]).remove();
// Gray Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_gray> * 144]).remove();
// Light Gray Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_light_gray> * 144]).remove();
// Cyan Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_cyan> * 144]).remove();
// Purple Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_purple> * 144]).remove();
// Blue Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_blue> * 144]).remove();
// Brown Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_brown> * 144]).remove();
// Green Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_green> * 144]).remove();
// Red Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_red> * 144]).remove();
// Black Concrete Powder * 8
mixer.findRecipe(7, [<minecraft:sand:0> * 4, <minecraft:gravel:0> * 4], [<liquid:dye_black> * 144]).remove();

// Лассо
assembler.findRecipe(2, [<minecraft:string:0> * 4, <minecraft:slime_ball:0>], null).remove();

// Песок --> Диоксид кремния
electrolyzer.findRecipe(25, [<minecraft:sand> * 8], null).remove();

// Удаление рецептов голов каменных инструментов
StoneKnapping.removeRecipe(<tfc:stone/axe_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/axe_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/axe_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/axe_head/metamorphic>);
StoneKnapping.removeRecipe(<tfc:stone/shovel_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/shovel_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/shovel_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/shovel_head/metamorphic>);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/metamorphic>);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/metamorphic>);
StoneKnapping.removeRecipe(<tfc:stone/javelin_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/javelin_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/javelin_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/javelin_head/metamorphic>);
StoneKnapping.removeRecipe(<tfc:stone/hammer_head/igneous_intrusive>);
StoneKnapping.removeRecipe(<tfc:stone/hammer_head/igneous_extrusive>);
StoneKnapping.removeRecipe(<tfc:stone/hammer_head/sedimentary>);
StoneKnapping.removeRecipe(<tfc:stone/hammer_head/metamorphic>);

StoneKnapping.removeRecipe(<tfc:stone/hoe_head/igneous_intrusive> * 2);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/igneous_extrusive> * 2);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/sedimentary> * 2);
StoneKnapping.removeRecipe(<tfc:stone/hoe_head/metamorphic> * 2);

StoneKnapping.removeRecipe(<tfc:stone/knife_head/igneous_intrusive> * 2);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/igneous_extrusive> * 2);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/sedimentary> * 2);
StoneKnapping.removeRecipe(<tfc:stone/knife_head/metamorphic> * 2);