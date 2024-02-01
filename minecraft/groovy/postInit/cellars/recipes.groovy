// MODS_LOADED: cellars


// --- Добавление рецептов

// Стенка подвала
crafting.addShaped("tfg/cellars/cellar_wall", item('cellars:cellar_wall'), [
    [ore('lumber'), ore('straw'), ore('lumber')],
    [ore('clay'), null, ore('clay')],
    [ore('lumber'), ore('straw'), ore('lumber')]])

// Дверь подвала
crafting.addShaped("tfg/cellars/cellar_door", item('cellars:cellar_door'), [
    [ore('lumber'), ore('clay'), ore('lumber')],
    [ore('lumber'), ore('straw'), ore('lumber')],
    [ore('lumber'), ore('clay'), ore('lumber')]])