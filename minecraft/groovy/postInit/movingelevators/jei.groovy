// MODS_LOADED: movingelevators


// --- Массивы

def removeRecipe = [
   item('movingelevators:display_block'),
   item('movingelevators:elevator_block'),
   item('movingelevators:button_block')
]

// --- Удаление рецептов

for (item in removeRecipe) {
    crafting.removeByOutput(item)
}
