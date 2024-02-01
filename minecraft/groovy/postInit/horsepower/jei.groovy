// MODS_LOADED: horsepower


// --- Массивы

def removeAndHide = [
   item('horsepower:flour'),
   item('horsepower:dough') 
]


// --- Удаление рецептов

for (item in removeAndHide) {
   mods.jei.removeAndHide(item)
}
