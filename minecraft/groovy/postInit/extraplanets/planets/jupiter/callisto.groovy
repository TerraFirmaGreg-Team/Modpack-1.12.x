import classes.Function

// Массивы
def callisto = [
    item('extraplanets:callisto:3'),
    item('extraplanets:callisto:4'),
    item('extraplanets:callisto:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in callisto) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("callisto", -1505, 5, 7, 11)
// Air
mods.gregtech.centrifuge.recipeBuilder()
    .fluidInputs(fluid('callisto_air') * 10000)
    .fluidOutputs(fluid('carbon_dioxide') * 9500)
    .duration(1600).EUt(31400).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
    .fluidInputs(fluid('callisto_liquid_air') * 600000)
    .fluidOutputs(fluid('carbon') * 165000)
    .fluidOutputs(fluid('oxygen') * 310000)
    .duration(2000).EUt(32768).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:callisto'), item('extraplanets:callisto:1'), item('extraplanets:callisto:2'), metaitem('dustStoneCallisto'), 4, 4)

// Пыль Каллисто
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(metaitem('dustStoneCallisto') * 3)
    .chancedOutput(metaitem('dustBastnasite'), 3700, 1200)
    .chancedOutput(metaitem('dustIlmenite'), 1100, 500)
    .chancedOutput(metaitem('dustScheelite'), 1150, 500)
    .chancedOutput(metaitem('dustUranium'), 950, 500)
    .duration(1250).EUt(1640).buildAndRegister()

// Fossil Block
mods.gregtech.macerator.recipeBuilder()
    .inputs(item('extraplanets:fossil'))
    .outputs(item('minecraft:dye:15') * 27)
    .duration(200).EUt(480).buildAndRegister()

// Shale Oil
mods.gregtech.extractor.recipeBuilder()
    .inputs(item('extraplanets:callisto:7'))
    .fluidOutputs(fluid('oil_medium') * 240)
    .outputs(metaitem('dustDarkAsh') * 4)
    .duration(1250).EUt(1940).buildAndRegister()

// Dried Oil
mods.gregtech.extractor.recipeBuilder()
    .inputs(item('extraplanets:callisto:6'))
    .fluidOutputs(fluid('oil_light') * 160)
    .outputs(metaitem('dustDarkAsh') * 4)
    .duration(1250).EUt(1940).buildAndRegister()