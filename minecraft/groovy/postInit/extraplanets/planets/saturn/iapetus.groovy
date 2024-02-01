import classes.Function

// Массивы
def iapetus = [
   item('extraplanets:iapetus:3'),
   item('extraplanets:iapetus:4'),
   item('extraplanets:iapetus:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in iapetus) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера



// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:iapetus'), item('extraplanets:iapetus:1'), item('extraplanets:iapetus:2'), metaitem('dustStoneIapetus'), 5, 5)

// Пыль Япета
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneIapetus') * 3)
   .chancedOutput(metaitem('dustElectrotine'), 3700, 1200)
   .chancedOutput(metaitem('dustMagnetite'), 1100, 500)
   .chancedOutput(metaitem('dustPitchblende'), 1150, 500)
   .chancedOutput(metaitem('dustTinyVanadium'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Лед Япета
mods.gregtech.macerator.recipeBuilder()
   .inputs(item('extraplanets:iapetus', 6))
   .outputs(metaitem('dustDryIce') * 7)
   .duration(200).EUt(480).buildAndRegister()

mods.gregtech.fluid_solidifier.recipeBuilder()
   .notConsumable(metaitem('shape.mold.block'))
   .fluidInputs(fluid('nitrogen_ice_fluid') * 1296)
   .outputs(item('extraplanets:iapetus', 6))
   .duration(1250).EUt(32550).buildAndRegister()