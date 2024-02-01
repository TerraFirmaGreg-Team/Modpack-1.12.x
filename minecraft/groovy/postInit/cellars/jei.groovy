// MODS_LOADED: cellars

// --- Массивы

def removeAndHide = [
   // Saws
   item('cellars:bronze_ice_saw'),
   item('cellars:bismuth_bronze_ice_saw'),
   item('cellars:black_bronze_ice_saw'),
   item('cellars:wrought_iron_ice_saw'),
   item('cellars:steel_ice_saw'),
   item('cellars:black_steel_ice_saw'),
   item('cellars:red_steel_ice_saw'),
   item('cellars:blue_steel_ice_saw'),
   // Saw Heads
   item('cellars:bronze_ice_saw_head'),
   item('cellars:bismuth_bronze_ice_saw_head'),
   item('cellars:black_bronze_ice_saw_head'),
   item('cellars:wrought_iron_ice_saw_head'),
   item('cellars:steel_ice_saw_head'),
   item('cellars:black_steel_ice_saw_head'),
   item('cellars:red_steel_ice_saw_head'),
   item('cellars:blue_steel_ice_saw_head')
]

def removeRecipe = [
   item('cellars:cellar_wall'),
   item('cellars:cellar_door')
]


// --- Удаление рецептов

for (item in removeAndHide) {
   mods.jei.removeAndHide(item)
}

// Удаление рецептов верстака
for (item in removeRecipe) {
   crafting.removeByOutput(item)
}
