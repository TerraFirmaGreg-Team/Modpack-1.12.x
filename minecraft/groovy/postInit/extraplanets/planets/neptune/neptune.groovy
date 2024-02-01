import classes.Function

// Массивы
def neptune = [
    item('extraplanets:neptune:3'),
    item('extraplanets:neptune:4'),
    item('extraplanets:neptune:5'),
    item('extraplanets:neptune:6'),
   item('extraplanets:neptune:7'),
    item('extraplanets:neptune:10'),
   item('extraplanets:neptune:11'),
   item('extraplanets:neptune_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in neptune) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("neptune", -18, 7, 9, 15)
// Air
mods.gregtech.centrifuge.recipeBuilder()
    .fluidInputs(fluid('neptune_air') * 10000)
    .fluidOutputs(fluid('hydrogen') * 8800)
    .fluidOutputs(fluid('helium') * 900)
    .duration(1600).EUt(524288).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('neptune_liquid_air') * 1000000)
   .fluidOutputs(fluid('hydrogen') * 920700)
   .fluidOutputs(fluid('helium') * 80000)
   .duration(2000).EUt(720520).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:neptune'), item('extraplanets:neptune:1'), item('extraplanets:neptune:2'), metaitem('dustStoneNeptune'), 7, 7)

// Liquid Nitrogen
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('nitrogen_fluid') * 1000)
   .fluidOutputs(fluid('nitrogen') * 4200)
   .duration(1650).EUt(4550).buildAndRegister()

// Radioacive water
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('radioactive_water_fluid') * 1000)
   .fluidOutputs(fluid('nitrogen') * 730, fluid('uranium') * 60, fluid('magnesium_diboride') * 20)
   .duration(1650).EUt(12550).buildAndRegister()

// Frozen Nitrogen
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:frozen_nitrogen'))
   .fluidOutputs(fluid('nitrogen_fluid') * 960)
   .duration(1250).EUt(16550).buildAndRegister()