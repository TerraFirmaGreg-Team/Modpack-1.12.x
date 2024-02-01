import classes.Function

// Массивы
def europa = [
    item('extraplanets:europa:3'),
    item('extraplanets:europa:4'),
    item('extraplanets:europa:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in europa) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("europa", -1501, 5, 7, 10)
// Air
mods.gregtech.centrifuge.recipeBuilder()
    .fluidInputs(fluid('europa_air') * 10000)
    .fluidOutputs(fluid('oxygen') * 6500)
    .fluidOutputs(fluid('hydrogen_sulfide') * 150)
    .duration(1600).EUt(28600).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
    .fluidInputs(fluid('europa_liquid_air') * 500000)
    .fluidOutputs(fluid('oxygen') * 420000)
    .fluidOutputs(fluid('hydrogen') * 12000)
    .fluidOutputs(fluid('sulfur_dioxide') * 1200)
    .duration(2000).EUt(32768).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:europa'), item('extraplanets:europa:1'), item('extraplanets:europa:2'), metaitem('dustStoneEuropa'), 4, 4)

// Пыль Европы
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(metaitem('dustStoneEuropa') * 3)
    .chancedOutput(metaitem('dustBasalticMineralSand'), 3700, 1200)
    .chancedOutput(metaitem('dustCassiterite'), 1100, 500)
    .chancedOutput(metaitem('dustChrome'), 1150, 500)
    .chancedOutput(metaitem('dustMagnesite'), 950, 500)
    .duration(1250).EUt(1640).buildAndRegister()

// Dense Ice
mods.gregtech.macerator.recipeBuilder()
    .inputs(item('extraplanets:dense_ice'))
    .outputs(metaitem('dustIce') * 9)
    .duration(200).EUt(480).buildAndRegister()