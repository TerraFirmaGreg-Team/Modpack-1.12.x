import classes.Function

// Массивы
def io = [
   item('extraplanets:io:3'),
   item('extraplanets:io:4'),
   item('extraplanets:io:5')
]

// --- Удаление рецептов

// Удаление рецептов
for (item in io) {
   mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера
Function.GenerateRecipesForAir("io", -1500, 5, 7, 9)
// Air
mods.gregtech.centrifuge.recipeBuilder()
   .fluidInputs(fluid('io_air') * 10000)
   .fluidOutputs(fluid('sulfur_dioxide') * 4100)
   .fluidOutputs(fluid('sodium_potassium') * 650)
   .duration(1600).EUt(22600).buildAndRegister()
// Liquid Air
mods.gregtech.distillation_tower.recipeBuilder()
   .fluidInputs(fluid('io_liquid_air') * 400000)
   .fluidOutputs(fluid('sulfur_dioxide') * 82100)
   .fluidOutputs(fluid('sodium_potassium') * 7600)
   .fluidOutputs(fluid('ammonia') * 790)
   .duration(2000).EUt(32768).buildAndRegister()


// --- Породы
// Поверхности
Function.GenerateRecipesForSurfaceStones3(item('extraplanets:io'), item('extraplanets:io:1'), item('extraplanets:io:2'), metaitem('dustStoneIo'), 4, 4)

// Пыль Ио
mods.gregtech.centrifuge.recipeBuilder()
   .inputs(metaitem('dustStoneIo') * 3)
   .chancedOutput(metaitem('dustGrossular'), 3700, 1200)
   .chancedOutput(metaitem('dustMagnetite'), 1100, 500)
   .chancedOutput(metaitem('dustPyrolusite'), 1150, 500)
   .chancedOutput(metaitem('dustTin'), 950, 500)
   .duration(1250).EUt(1640).buildAndRegister()

// Ash Block
mods.gregtech.macerator.recipeBuilder()
   .inputs(item('extraplanets:ash_rock'))
   .outputs(metaitem('dustDarkAsh') * 8)
   .duration(1250).EUt(1640).buildAndRegister()

// Volcanic Rock
mods.gregtech.extractor.recipeBuilder()
   .inputs(item('extraplanets:volcanic_rock'))
   .fluidOutputs(fluid('lava') * 744)
   .outputs(metaitem('dustDarkAsh') * 2)
   .duration(1250).EUt(1640).buildAndRegister()