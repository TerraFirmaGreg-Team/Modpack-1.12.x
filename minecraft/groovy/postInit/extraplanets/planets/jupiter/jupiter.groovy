import classes.Function

// Массивы
def jupiter = [
   item('extraplanets:jupiter:3'),
   item('extraplanets:jupiter:4'),
   item('extraplanets:jupiter:5'),
   item('extraplanets:jupiter:6'),
   item('extraplanets:jupiter:7'),
   item('extraplanets:jupiter:8'),
   item('extraplanets:jupiter:11'),
   item('extraplanets:jupiter:12'),
   item('extraplanets:jupiter:13'),
   item('extraplanets:jupiter_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in jupiter) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("jupiter", -15, 4, 6, 8)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('jupiter_air') * 10000)
   .fluidOutputs(fluid('hydrogen') * 8700)
   .fluidOutputs(fluid('helium') * 700)
   .duration(1600).EUt(8192).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('jupiter_liquid_air') * 300000)
   .fluidOutputs(fluid('hydrogen') * 190700)
   .fluidOutputs(fluid('helium') * 17000)
   .fluidOutputs(fluid('radon') * 2500)
   .fluidOutputs(fluid('tritium') * 1500)
   .fluidOutputs(fluid('krypton') * 1000)
   .fluidOutputs(fluid('xenon') * 700)
   .duration(2000).EUt(31240).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:jupiter'), item('extraplanets:jupiter:1'), item('extraplanets:jupiter:2'), metaitem('dustStoneJupiter'), 4, 4)

// Оранжевый песок
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:orange_sand'), metaitem('dustStoneJupiter'), 4, 4)

// Красный песок
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:red_sand'), metaitem('dustStoneJupiter'), 4, 4)

// Оранжевый песчанник
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:orange_sandstone'), metaitem('dustStoneJupiter'), 4, 4)

// Красный песчанник
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:red_sandstone'), metaitem('dustStoneJupiter'), 4, 4)

// Пыль юпитера
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneJupiter') * 3)
   .chancedOutput(metaitem('dustBastnasite'), 3700, 1200)
   .chancedOutput(metaitem('dustBasalticMineralSand'), 1100, 500)
   .chancedOutput(metaitem('dustPlatinum'), 1150, 500)
   .chancedOutput(metaitem('dustChrome'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Магма
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('magma_fluid') * 1000)
   .fluidOutputs(fluid('lava') * 744, fluid('platinum') * 14)
   .duration(2650).EUt(7600).buildAndRegister()

// Слиток вулкана
mods.gregtech.electric_blast_furnace.recipeBuilder()
   .inputs(item('extraplanets:volcanic_rock') * 3)
   .outputs(item('extraplanets:tier5_items:12'))
   .blastFurnaceTemp(1700)
   .duration(250).EUt(1640).buildAndRegister()