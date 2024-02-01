import classes.Function

// Массивы
def saturn = [
   item('extraplanets:saturn:3'),
   item('extraplanets:saturn:4'),
   item('extraplanets:saturn:5'),
   item('extraplanets:saturn:6'),
   item('extraplanets:saturn:7'),
   item('extraplanets:saturn:12'),
   item('extraplanets:saturn_spawner')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in saturn) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("saturn", -16, 6, 8, 12)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('saturn_air') * 10000)
   .fluidOutputs(fluid('hydrogen') * 8800)
   .fluidOutputs(fluid('helium') * 900)
   .duration(1600).EUt(32768).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('saturn_liquid_air') * 700000)
   .fluidOutputs(fluid('hydrogen') * 501700)
   .fluidOutputs(fluid('helium') * 117000)
   .fluidOutputs(fluid('radon') * 10500)
   .fluidOutputs(fluid('tritium') * 12500)
   .fluidOutputs(fluid('krypton') * 8000)
   .fluidOutputs(fluid('xenon') * 1700)
   .duration(2000).EUt(122880).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:saturn'), item('extraplanets:saturn:1'), item('extraplanets:saturn:2'), metaitem('dustStoneSaturn'), 5, 5)

// Пыль Сатурна
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneSaturn') * 3)
   .chancedOutput(metaitem('dustElectrotine'), 3700, 1200)
   .chancedOutput(metaitem('dustGraphite'), 1100, 500)
   .chancedOutput(item('minecraft:redstone'), 1150, 500)
   .chancedOutput(metaitem('dustOsmium'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Гравий
Function.GenerateRecipesForSurfaceStones1(item('extraplanets:saturn_gravel'), metaitem('dustStoneSaturn'), 5, 5)

// Glowstone
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('glowstone_fluid') * 1000)
   .fluidOutputs(fluid('glowstone') * 860, fluid('redstone') * 240)
   .duration(1650).EUt(4550).buildAndRegister()

// Hydrocarbon
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('liquid_hydrocarbon_fluid') * 1000)
   .fluidOutputs(fluid('hydrogen') * 440, fluid('carbon') * 560)
   .duration(1650).EUt(4550).buildAndRegister()

// Liquid Methane
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('methane_fluid') * 1000)
   .fluidOutputs(fluid('methane') * 4600)
   .duration(405).EUt(3750).buildAndRegister()

// Saturn Broken Infected Stone
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:saturn:10'))
   .fluidOutputs(fluid('methane_fluid') * 360)
   .duration(1250).EUt(480).buildAndRegister()

// Saturn Infected Stone
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:saturn:11'))
   .fluidOutputs(fluid('methane_fluid') * 460)
   .duration(1250).EUt(480).buildAndRegister()