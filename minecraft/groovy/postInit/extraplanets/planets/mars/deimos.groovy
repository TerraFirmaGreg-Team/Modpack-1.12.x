import classes.Function

// Массивы
def deimos = [
    item('extraplanets:deimos:3'),
    item('extraplanets:deimos:4'),
    item('extraplanets:deimos:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in deimos) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера



// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:deimos'), item('extraplanets:deimos:1'), item('extraplanets:deimos:2'), metaitem('dustStoneDeimos'), 2, 2)

// Пыль деймоса
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(metaitem('dustStoneDeimos') * 3)
    .chancedOutput(metaitem('dustBastnasite'), 3700, 1200)
    .chancedOutput(metaitem('dustGarnierite'), 1100, 500)
    .chancedOutput(metaitem('dustMagnetite'), 1150, 500)
    .chancedOutput(metaitem('dustTetrahedrite'), 950, 500)
    .duration(1250).EUt(512).buildAndRegister()