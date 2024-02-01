import classes.Function

// Массивы
def mercury = [
    item('extraplanets:ceres:3'),
    item('extraplanets:ceres:4'),
    item('extraplanets:ceres:5'),
    item('extraplanets:ceres:6'),
    item('extraplanets:ceres:7')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in mercury) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера



// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:ceres'), item('extraplanets:ceres:1'), item('extraplanets:ceres:2'), metaitem('dustStoneCeres'), 3, 3)

// Пыль цереры
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(metaitem('dustStoneCeres') * 3)
    .chancedOutput(metaitem('dustBentonite'), 3700, 1200)
    .chancedOutput(metaitem('dustBeryllium'), 1100, 500)
    .chancedOutput(metaitem('dustBrownLimonite'), 1150, 500)
    .chancedOutput(metaitem('dustChalcopyrite'), 950, 500)
    .duration(1250).EUt(512).buildAndRegister()

// Кристаллизированная вода
mods.gregtech.centrifuge.recipeBuilder()
    .fluidInputs(fluid('salt_fluid') * 1000)
    .outputs(item('extraplanets:iodide_salt') * 6)
    .duration(1250).EUt(512).buildAndRegister()