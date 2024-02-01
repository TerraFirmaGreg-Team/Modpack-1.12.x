import classes.Function

// Массивы
def uranus = [
   item('extraplanets:uranus:3'),
   item('extraplanets:uranus:4'),
   item('extraplanets:uranus:7'),
   item('extraplanets:uranus:8'),
   item('extraplanets:uranus_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in uranus) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("uranus", -17, 7, 9, 14)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('uranus_air') * 10000)
   .fluidOutputs(fluid('hydrogen') * 8800)
   .fluidOutputs(fluid('helium') * 900)
   .duration(1600).EUt(131072).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('uranus_liquid_air') * 900000)
   .fluidOutputs(fluid('hydrogen') * 810700)
   .fluidOutputs(fluid('helium') * 20000)
   .duration(2000).EUt(491520).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:uranus'), item('extraplanets:uranus:1'), item('extraplanets:uranus:2'), metaitem('dustStoneUranus'), 6, 6)

// Пыль Урана
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneUranus') * 3)
   .chancedOutput(metaitem('dustDryIce'), 3700, 1200)
   .chancedOutput(metaitem('dustDryIce'), 1100, 500)
   .chancedOutput(metaitem('dustDryIce'), 1150, 500)
   .chancedOutput(metaitem('dustDryIce'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Frozen Water
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('frozen_water_fluid') * 1000)
   .fluidOutputs(fluid('water') * 1000, fluid('carbon') * 740)
   .duration(1650).EUt(4550).buildAndRegister()