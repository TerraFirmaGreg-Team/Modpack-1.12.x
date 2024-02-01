// MODS_LOADED: hgp

import classes.array.HGP



// --- Удаление рецептов

for (item in HGP.horizontalGlassPanes) {
    crafting.removeByOutput(item)
}

crafting.removeByOutput(item('hgp:hgppane'))
