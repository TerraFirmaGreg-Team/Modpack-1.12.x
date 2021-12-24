import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

val QuartzPlates = <ore:plateCertusQuartz> | <ore:plateNetherQuartz> | <ore:plateQuartzite>;

//Отключение крафтов
val RemoveItemsFromJEI as IItemStack[] = [
    //Ores
    <minecraft:gold_ore>,
    <minecraft:iron_ore>,
    <minecraft:coal_ore>,
    <minecraft:lapis_ore>,
    <minecraft:diamond_ore>,
    <minecraft:redstone_ore>,
    <minecraft:emerald_ore>,
    <minecraft:quartz_ore>,
    //Food
    <minecraft:apple>,
    <minecraft:mushroom_stew>,
    <minecraft:bread>,
    <minecraft:porkchop>,
    <minecraft:cooked_porkchop>,
    <minecraft:fish>,
    <minecraft:fish:1>,
    <minecraft:fish:2>,
    <minecraft:fish:3>,
    <minecraft:cooked_fish>,
    <minecraft:cooked_fish:1>,
    <minecraft:cake>,
    <minecraft:cookie>,
    <minecraft:melon>,
    <minecraft:beef>,
    <minecraft:cooked_beef>,
    <minecraft:chicken>,
    <minecraft:cooked_chicken>,
    <minecraft:carrot>,
    <minecraft:potato>,
    <minecraft:baked_potato>,
    <minecraft:poisonous_potato>,
    <minecraft:pumpkin_pie>,
    <minecraft:rabbit>,
    <minecraft:cooked_rabbit>,
    <minecraft:rabbit_stew>,
    <minecraft:mutton>,
    <minecraft:cooked_mutton>,
    <minecraft:beetroot>,
    <minecraft:beetroot_soup>,
    <minecraft:double_plant:2>,
    //Tools
    <minecraft:diamond_pickaxe>,
    <minecraft:golden_pickaxe>,
    <minecraft:iron_pickaxe>,
    <minecraft:diamond_shovel>,
    <minecraft:golden_shovel>,
    <minecraft:iron_shovel>,
    <minecraft:diamond_sword>,
    <minecraft:golden_sword>,
    <minecraft:iron_sword>,
    <minecraft:diamond_axe>,
    <minecraft:golden_axe>,
    <minecraft:iron_axe>,
    <minecraft:iron_hoe>,
    <minecraft:diamond_hoe>,
    <minecraft:golden_hoe>,
    <minecraft:wooden_sword>,
    <minecraft:wooden_pickaxe>,
    <minecraft:wooden_axe>,
    <minecraft:wooden_shovel>,
    <minecraft:wooden_hoe>,
    <minecraft:stone_sword>,
    <minecraft:stone_pickaxe>,
    <minecraft:stone_axe>,
    <minecraft:stone_shovel>,
    <minecraft:stone_hoe>,
    //Armor
    <minecraft:diamond_leggings>,
    <minecraft:diamond_boots>,
    <minecraft:diamond_chestplate>,
    <minecraft:diamond_helmet>,
    <minecraft:golden_helmet>,
    <minecraft:golden_chestplate>,
    <minecraft:golden_leggings>,
    <minecraft:golden_boots>,
    <minecraft:iron_helmet>,
    <minecraft:iron_chestplate>,
    <minecraft:iron_leggings>,
    <minecraft:iron_boots>,
    <minecraft:chainmail_helmet>,
    <minecraft:chainmail_chestplate>,
    <minecraft:chainmail_leggings>,
    <minecraft:chainmail_boots>,
    //Other
    <minecraft:crafting_table>,
    <minecraft:furnace>,
    <minecraft:chest>,
    <minecraft:trapped_chest>,
    <minecraft:stone_pressure_plate>,
    <minecraft:wooden_pressure_plate>,
    <minecraft:wooden_button>,
    <minecraft:stone_button>,
    <minecraft:trapdoor>,
    <minecraft:wooden_door>,
    <minecraft:spruce_door>,
    <minecraft:birch_door>,
    <minecraft:jungle_door>,
    <minecraft:acacia_door>,
    <minecraft:dark_oak_door>
] as IItemStack[];
for item in RemoveItemsFromJEI{
    mods.jei.JEI.removeAndHide(item);
}

val ItemsToRemove as IItemStack[] = [
    //Leather Armor
    <minecraft:leather_helmet>,
    <minecraft:leather_chestplate>,
    <minecraft:leather_leggings>,
    <minecraft:leather_boots>,
    <minecraft:bucket>,
    <minecraft:enchanting_table>
] as IItemStack[];
for item in ItemsToRemove{
    recipes.remove(item);
}
/*
//Remove Workbench
assembler.findRecipe(6, [<ore:logWood>.firstItem, <minecraft:flint>], null).remove();

//Remove Wooden Pressure Plate
assembler.findRecipe(7, [<ore:plankWood>.firstItem * 2, <ore:springIron>.firstItem], null).remove();

//Remove Stone Pressure Plate
assembler.findRecipe(7, [<minecraft:stone_slab> * 2, <ore:springIron>.firstItem], null).remove();

//Remove Wooden Trapdoor
assembler.findRecipe(4, [<ore:plankWood>.firstItem * 3, <gregtech:meta_item_1:461>.withTag({Configuration: 3})], null).remove();

//Remove Wooden Trapdoor
assembler.findRecipe(16, [<ore:plateIron>.firstItem * 4, <minecraft:trapdoor>], null).remove();
*/
//Другое
recipes.removeByRecipeName("minecraft:stone_pressure_plate");
recipes.removeByRecipeName("minecraft:light_weighted_pressure_plate");
recipes.removeByRecipeName("minecraft:bone_meal_from_bone");
recipes.removeByRecipeName("minecraft:iron_door");
recipes.removeByRecipeName("minecraft:tripwire_hook");
recipes.removeByRecipeName("minecraft:stick");
recipes.removeByRecipeName("minecraft:diamond_block");

//Создание крафтов
//Iron Trapdoor
assembler.recipeBuilder()
    .inputs(<ore:plateIron>.firstItem * 4, <ore:trapdoorWood>)
    .outputs(<minecraft:iron_trapdoor>)
    .duration(100).EUt(16).buildAndRegister();

//Лампа
recipes.addShaped(<minecraft:redstone_lamp>,
[[<ore:plateBrass>, <ore:stickWroughtIron>, <ore:plateBrass>],
 [<ore:stickWroughtIron>, <ore:cableGtSingleRedAlloy>, <ore:stickWroughtIron>],
 [<ore:plateBrass>, <ore:stickWroughtIron>, <ore:plateBrass>]]);

//Чар стол
recipes.addShaped(<minecraft:enchanting_table>,
[[null, <minecraft:book>, null],
 [<ore:gemFlawless>, <ore:obsidian>, <ore:gemFlawless>],
 [<ore:obsidian>, <ore:obsidian>, <ore:obsidian>]]);

//Поршень
recipes.addShaped(<minecraft:piston>,
[[<ore:lumber>, <ore:lumber>, <ore:lumber>],
 [<ore:gearSmallIron>, <ore:fenceWood>, <ore:gearSmallIron>],
 [<ore:cobblestone>, <ore:plateRedAlloy>, <ore:cobblestone>]]);

//Ведро
recipes.addShaped(<minecraft:bucket>,
[[<ore:plateWroughtIron>, <tfc:metal/bucket/blue_steel>.noReturn(), <ore:plateWroughtIron>],
 [<ore:plateWroughtIron>, <tfc:metal/bucket/red_steel>.noReturn(), <ore:plateWroughtIron>],
 [null, <ore:plateWroughtIron>, null]]);

//Observer
recipes.addShaped(<minecraft:observer>,
[[<ore:ringIron>, <ore:cobblestone>, <ore:ringIron>],
 [<ore:cobblestone>, QuartzPlates, <ore:cobblestone>],
 [<ore:gearSmallIron>, <ore:stickRedAlloy>, <ore:gearSmallIron>]]);

//Водная хрень
recipes.addShapeless(<minecraft:prismarine>, [<ore:gemPrismarine>, <ore:gemPrismarine>, <ore:gemPrismarine>, <ore:gemPrismarine>]);
recipes.addShapeless(<minecraft:prismarine>, [<ore:blockQuartz>, <ore:dyeCyan>]);
recipes.addShapeless(<minecraft:prismarine:1> * 4, [<ore:blockPrismarine>, <ore:blockPrismarine>, <ore:blockPrismarine>, <ore:blockPrismarine>]);
recipes.addShapeless(<minecraft:sea_lantern>, [<ore:glowstone>, <ore:dyeCyan>]);
recipes.addShapeless(<minecraft:prismarine:2>, [<ore:blockPrismarine>, <ore:dyeBlack>]);
 
//Рельсовые приколы
recipes.addShapeless(<minecraft:chest_minecart>,[<minecraft:minecart>,<ore:chestWood>]);
recipes.addShapeless(<minecraft:furnace_minecart>,[<minecraft:minecart>,<minecraft:furnace>]);