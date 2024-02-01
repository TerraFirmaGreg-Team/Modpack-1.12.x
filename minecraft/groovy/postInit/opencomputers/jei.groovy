// MODS_LOADED: opencomputers


// --- Массивы

def hide = [
    item('opencomputers:casecreative'),
    item('opencomputers:material', 19),
    item('opencomputers:material', 22),
    item('opencomputers:material', 25),
    item('opencomputers:component', 12),
    item('opencomputers:component', 18),
    item('opencomputers:upgrade', 32)
]

// --- Удаление рецептов

for (item in hide) {
    mods.jei.hide(item)
}