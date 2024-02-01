// MODS_LOADED: ftbquests


// --- Массивы
def hideCategory = [
    "ftbquests.quests"
]

def removeAndHide = [
    item('ftbquests:chest'),
    item('ftbquests:barrier'),
    item('ftbquests:detector:1'),
    item('ftbquests:detector'),
    item('ftbquests:reward_collector'),
    item('ftbquests:loot_crate_opener'),
    item('ftbquests:loot_crate_storage'),
    item('itemfilters:filter')
]

// --- Удаление рецептов
for(item in hideCategory) {
    mods.jei.hideCategory(item)
}

for (item in removeAndHide) {
   mods.jei.removeAndHide(item)
}
