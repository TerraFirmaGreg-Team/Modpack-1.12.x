// MODS_LOADED: catwalks


// --- Массивы

def removeRecipe = [
   item('catwalks:cable'),
   item('catwalks:ladder'),
   item('catwalks:blowtorch')
]

def removeRecipesByName = [
   "catwalks:catwalks/glass_catwalks",
   "catwalks:catwalks/classic_catwalks",
   "catwalks:catwalks/steel_catwalks",
   "catwalks:catwalks/custom_catwalks"
]


// --- Удаление рецептов

for (item in removeRecipe) {
    crafting.removeByOutput(item)
}

for (item in removeRecipesByName) {
   crafting.remove(item)
}

mods.jei.removeAndHide(item('catwalks:stair'))
