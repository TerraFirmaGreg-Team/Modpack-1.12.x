// MODS_LOADED: galacticresearch


// --- Массивы
def hideCategory = [
]

def removeAndHide = [
]

def removeRecipe = [
	item('galacticresearch:mission_control_station'),
	item('galacticresearch:launchpad_tower'),
	item('galacticresearch:probe'),
	item('galacticresearch:telescope')
]

// --- Удаление рецептов

for(item in hideCategory) {
	mods.jei.hideCategory(item)
}

for (item in removeAndHide) {
   mods.jei.removeAndHide(item)
}

for (item in removeRecipe) {
	crafting.removeByOutput(item)
}
