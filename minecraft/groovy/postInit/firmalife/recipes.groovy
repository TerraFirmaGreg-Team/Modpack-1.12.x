// MODS_LOADED: firmalife

import classes.array.TerraFirmaCraftFL
import classes.array.TerraFirmaCraft
import classes.Function


// --- Добавление рецептов

// Забор
for (int i = 0; i < TerraFirmaCraftFL.flFences.size(); i++) {
    crafting.addShaped("tfg/firmalife/fence_" + i, TerraFirmaCraftFL.flFences[i] * 8,
        [[null, null, null],
        [TerraFirmaCraft.tfcPlanks[i + 95], TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.tfcPlanks[i + 95]],
        [TerraFirmaCraft.tfcPlanks[i + 95], TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.tfcPlanks[i + 95]]])
}

// Калитки
for (int i = 0; i < TerraFirmaCraftFL.flFenceGates.size(); i++)  {
    crafting.addShaped("tfg/firmalife/fencegate_" + i, TerraFirmaCraftFL.flFenceGates[i] * 2,
        [[null, null, null],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.tfcPlanks[i + 95], TerraFirmaCraft.lumbers[i + 95]],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.tfcPlanks[i + 95], TerraFirmaCraft.lumbers[i + 95]]])
}

// Двери
for (int i = 0; i < TerraFirmaCraftFL.flDoors.size(); i++) {
    crafting.addShaped("tfg/firmalife/door_" + i, TerraFirmaCraftFL.flDoors[i] * 2,
        [[TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95], null],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95], null],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95], null]])
}

// Люки
for (int i = 0; i < TerraFirmaCraftFL.flTrapdoors.size(); i++) {
    crafting.addShaped("tfg/firmalife/trapdoor_" + i, TerraFirmaCraftFL.flTrapdoors[i] * 3,
        [[null, null, null],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95]],
        [TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95], TerraFirmaCraft.lumbers[i + 95]]])
}

// Климатическая станция уровня 0
crafting.addShaped("tfg/firmalife/climate_station_0", item('firmalife:climate_station'), [
    [metaitem('plateWroughtIron'), ore('plankWood'), metaitem('plateWroughtIron')],
    [item('minecraft:redstone'), ore('blockGlass'), item('minecraft:redstone')],
    [metaitem('plateWroughtIron'), ore('plankWood'), metaitem('plateWroughtIron')]])

// Климатическая станция уровня 1
crafting.addShaped("tfg/firmalife/climate_station_1", item('firmalife:climate_station_1'), [
    [metaitem('plateWroughtIron'), ore('blockGlass'), metaitem('plateWroughtIron')],
    [ore('blockGlass'), item('firmalife:climate_station'), ore('blockGlass')],
    [metaitem('plateWroughtIron'), ore('blockGlass'), metaitem('plateWroughtIron')]])

// Климатическая станция уровня 5
crafting.addShaped("tfg/firmalife/climate_station_5", item('firmalife:climate_station_5'), [
    [metaitem('gearCobaltBrass'), ore('gemFlawless'), metaitem('gearCobaltBrass')],
    [ore('gemFlawless'), item('firmalife:climate_station_4'), ore('gemFlawless')],
    [metaitem('gearCobaltBrass'), ore('gemFlawless'), metaitem('gearCobaltBrass')]])

// Разбрызгиватель
crafting.addShaped("tfg/firmalife/sprinkler", item('firmalife:sprinkler'), [
    [metaitem('gearCobaltBrass'), null, metaitem('gearCobaltBrass')],
    [metaitem('plateRedSteel'), item('firmalife:spout'), metaitem('plateRedSteel')],
    [metaitem('gearCobaltBrass'), null, metaitem('gearCobaltBrass')]])

// Jar
crafting.addShaped("tfg/firmalife/jar", item('firmalife:jar'), [
    [null, ore('plateIronAny'), null],
    [ore('paneGlass'), null, ore('paneGlass')],
    [null, ore('paneGlass'), null]])


// Pizza Dough
crafting.addShapeless("tfg/firmalife/pizza_dough", item('firmalife:pizza_dough'), [ore('toolKnife').transform(Function.setToolDamage), ore('doughFlat'), item('tfc:plants/basil'), item('firmalife:tomato_sauce'), ore('craftingToolRollingPin')])

// Свечка
crafting.addShapeless("tfg/firmalife/candle", item('firmalife:candle') * 6, [ore('itemBeeswax'), ore('string')])

// Обработанное дерево
crafting.addShapeless("tfg/firmalife/treated_lumber", item('firmalife:treated_lumber'), [ore('lumber'), ore('itemBeeswax'), metaitem('dustSalt')])

// Furnace recipes for TFC item
furnace.add(item('firmalife:unfired_mallet_mold'), item('firmalife:mallet_mold'))

// Высушивание соли
crafting.addShapeless(metaitem('dustSmallSalt') * 2, [item('tfg:meta_item', 51).transform({item('tfc:wooden_bucket')})])

crafting.addShapeless(item('firmalife:trellis'), [item('firmalife:greenhouse_wall'), item('firmalife:greenhouse_wall'), ore('dustFertilizer')])
crafting.addShapeless(item('firmalife:pumpkin_hanging_planter'), [item('firmalife:greenhouse_wall'), item('firmalife:crop/seeds/pumpkin'), ore('dustFertilizer')])
crafting.addShapeless(item('firmalife:melon_hanging_planter'), [item('firmalife:greenhouse_wall'), item('firmalife:crop/seeds/melon'), ore('dustFertilizer')])
crafting.addShapeless(item('firmalife:squash_hanging_planter'), [item('firmalife:greenhouse_wall'), item('tfc:crop/seeds/squash'), ore('dustFertilizer')])


// Chestnut Dough
mods.gregtech.mixer.recipeBuilder()
    .inputs(
        ore('chestnutFlour'), 
        metaitem('dustSmallSalt'), 
        ore('fruitDry'))
    .fluidInputs(fluid('fresh_water') * 1000)
    .outputs(item('firmalife:chestnut_dough') * 2)
    .duration(400).EUt(2).buildAndRegister()

// Greenhouse parts
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(metaitem('plateWroughtIron'))
    .outputs(item('firmalife:greenhouse_roof') * 4)
    .duration(205).EUt(8).buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(metaitem('plateWroughtIron'))
    .outputs(item('firmalife:greenhouse_door') * 4)
    .duration(205).EUt(8).buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(3)
    .inputs(metaitem('plateWroughtIron'))
    .outputs(item('firmalife:greenhouse_wall') * 4)
    .duration(205).EUt(8).buildAndRegister()

crafting.addShaped(item('firmalife:quad_planter'), [
    [null, ore('dustFertilizer'), null],
    [null, ore('dirt'), null],
    [null, item('minecraft:flower_pot'), null]])
