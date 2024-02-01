import classes.Function

// Массивы
def triton = [
   item('extraplanets:triton:3'),
   item('extraplanets:triton:4'),
   item('extraplanets:triton:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in triton) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("triton", -1504, 7, 10, 16)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('triton_air') * 10000)
   .fluidOutputs(fluid('dinitrogen_tetroxide') * 4200)
   .fluidOutputs(fluid('helium') * 100)
   .duration(1600).EUt(580466).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('triton_liquid_air') * 1100000)
   .fluidOutputs(fluid('dinitrogen_tetroxide')* 240700)
   .fluidOutputs(fluid('helium') * 2000)
   .duration(2000).EUt(840520).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:triton'), item('extraplanets:triton:1'), item('extraplanets:triton:2'), metaitem('dustStoneTriton'), 7, 7)

// Пыль Тритона
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneTriton') * 3)
   .chancedOutput(metaitem('dustBastnasite'), 3700, 1200)
   .chancedOutput(metaitem('dustGalena'), 1100, 500)
   .chancedOutput(metaitem('dustGrossular'), 1150, 500)
   .chancedOutput(metaitem('dustNiobium'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Nitrogen Ice
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:iapetus', 6))
   .fluidOutputs(fluid('nitrogen_fluid') * 100)
   .outputs(metaitem('dustDryIce') * 17)
   .duration(1250).EUt(32550).buildAndRegister()