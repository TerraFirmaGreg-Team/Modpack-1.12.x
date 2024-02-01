import mods.terrafirmacraft.Anvil;

// --- Удаление рецептов
Anvil.removeRecipe(<waterflasks:unfinished_iron_flask>);

// --- Добавление рецептов
Anvil.addRecipe("tfg/waterflasks/waterflask", <metaitem:plateWroughtIron>, <waterflasks:unfinished_iron_flask>, 3, "general", "PUNCH_LAST", "BEND_SECOND_LAST", "BEND_THIRD_LAST");