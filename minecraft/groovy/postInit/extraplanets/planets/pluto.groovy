import classes.Function

// Массивы
def pluto = [
   item('extraplanets:pluto:3'),
   item('extraplanets:pluto:4'),
   item('extraplanets:pluto:5'),
   item('extraplanets:pluto:6'),
   item('extraplanets:pluto:7'),
   item('extraplanets:pluto_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in pluto) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("pluto", -19, 8, 10, 17)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('pluto_air') * 10000)
   .fluidOutputs(fluid('nitrogen') * 4200)
   .fluidOutputs(fluid('carbon_monoxide') * 2100)
   .fluidOutputs(fluid('methane') * 1700)
   .duration(1600).EUt(1750400).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('pluto_liquid_air') * 1200000)
   .fluidOutputs(fluid('nitrogen') * 540000)
   .fluidOutputs(fluid('carbon_monoxide') * 170000)
   .fluidOutputs(fluid('methane') * 100000)
   .fluidOutputs(fluid('tritium') * 37500)
   .fluidOutputs(fluid('xenon') * 26000)
   .duration(2000).EUt(1900520).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:pluto'), item('extraplanets:pluto:1'), item('extraplanets:pluto:2'), metaitem('dustStonePluto'), 8, 8)

// Пыль Плутона
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStonePluto') * 3)
   .chancedOutput(metaitem('dustWulfenite'), 3700, 1200)
   .chancedOutput(metaitem('dustGraphite'), 1100, 500)
   .chancedOutput(metaitem('dustPlutonium'), 1150, 500)
   .chancedOutput(metaitem('dustNaquadah'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()