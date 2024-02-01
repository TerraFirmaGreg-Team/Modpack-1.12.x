import classes.Function

// Массивы
def eris = [
    item('extraplanets:eris:3'),
    item('extraplanets:eris:4'),
    item('extraplanets:eris:5'),
    item('extraplanets:eris:6'),
    item('extraplanets:eris:7'),
    item('extraplanets:eris_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in eris) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера



// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:eris'), item('extraplanets:eris:1'), item('extraplanets:eris:2'), metaitem('dustStoneEris'), 9, 9)

// Пыль Эриды
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(metaitem('dustStoneEris') * 3)
    .chancedOutput(metaitem('dustBeryllium'), 3700, 1200)
    .chancedOutput(metaitem('dustCadmium'), 1100, 500)
    .chancedOutput(metaitem('dustCassiterite'), 1150, 500)
    .chancedOutput(metaitem('dustPlutonium'), 950, 500)
    .duration(1250).EUt(1640).buildAndRegister()