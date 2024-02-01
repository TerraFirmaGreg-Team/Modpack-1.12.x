import classes.Function

// Массивы
def titan = [
   item('extraplanets:titan:3'),
   item('extraplanets:titan:4'),
   item('extraplanets:titan:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in titan) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("titan", -1508, 6, 8, 13)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('titan_air') * 10000)
   .fluidOutputs(fluid('carbon_dioxide') * 9500)
   .duration(1600).EUt(39400).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('titan_liquid_air') * 800000)
   .fluidOutputs(fluid('carbon') * 280000)
   .fluidOutputs(fluid('oxygen') * 510000)
   .duration(2000).EUt(150880).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:titan'), item('extraplanets:titan:1'), item('extraplanets:titan:2'), metaitem('dustStoneTitan'), 5, 5)

// Пыль Титана
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneTitan') * 3)
   .chancedOutput(metaitem('dustBeryllium'), 3700, 1200)
   .chancedOutput(metaitem('dustGold'), 1100, 500)
   .chancedOutput(metaitem('dustRutile'), 1150, 500)
   .chancedOutput(metaitem('dustTinyNaquadah'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Methane Surface
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:titan:6'))
   .fluidOutputs(fluid('methane_fluid') * 780)
   .duration(1250).EUt(480).buildAndRegister()

// Methane Sub-Surface
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:titan:7'))
   .fluidOutputs(fluid('methane_fluid') * 620)
   .duration(1250).EUt(480).buildAndRegister()

// Камни Титана
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:titan:8'), metaitem('dustStoneTitan'), 5, 5)