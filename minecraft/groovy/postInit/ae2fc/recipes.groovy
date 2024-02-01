// MODS_LOADED: ae2fc


// --- Добавление рецептов

// Fluid pattern encoder
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    metaitem('plateDenseIron') * 8, 
    item('appliedenergistics2:fluid_interface') * 2, 
    item('appliedenergistics2:material:23') * 3, 
    ore('craftingTableWood'))
  .fluidInputs(fluid('rubber') * 144)
  .outputs(item('ae2fc:fluid_pattern_encoder'))
  .duration(20).EUt(480).buildAndRegister()

// Ultimate encoder
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:material', 24) * 8, 
    item('ae2fc:part_fluid_pattern_ex_terminal'), 
    ore('blockFluix') * 2, 
    item('ae2fc:fluid_pattern_encoder') * 3)
  .fluidInputs(fluid('rubber') * 144)
  .outputs(item('ae2fc:ultimate_encoder'))
  .duration(20).EUt(748).buildAndRegister()

// Fluid discretizer
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:condenser'), 
    item('appliedenergistics2:part:221'), 
    item('appliedenergistics2:part:220'), 
    item('appliedenergistics2:material:24') * 8, 
    metaitem('plateDenseTitanium') * 6)
  .outputs(item('ae2fc:fluid_discretizer'))
  .duration(100).EUt(480).buildAndRegister()

// Fluid packet decoder
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    metaitem('fluid_filter') * 3, 
    ore('ae2.cable.glass') * 4, 
    item('appliedenergistics2:fluid_interface') * 2, 
    item('appliedenergistics2:material:24') * 8, 
    metaitem('plateDenseTitanium') * 4)
  .outputs(item('ae2fc:fluid_packet_decoder'))
  .duration(100).EUt(480).buildAndRegister()

// Ingredient buffer
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:material:54') * 3, 
    item('appliedenergistics2:material:43') * 4, 
    item('appliedenergistics2:material:44') * 4, 
    item('appliedenergistics2:quartz_glass') * 2, 
    metaitem('plateDenseTitanium') * 4, 
    item('appliedenergistics2:material:35') * 2)
  .outputs(item('ae2fc:ingredient_buffer'))
  .duration(100).EUt(480).buildAndRegister()

// Fluid packet decoder
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    metaitem('fluid_filter') * 2, 
    item('appliedenergistics2:material:23') * 4, 
    item('gregtech:machine:1612'), 
    metaitem('plateDenseTitanium') * 4, 
    item('appliedenergistics2:quartz_glass') * 4)
  .outputs(item('ae2fc:burette'))
  .duration(100).EUt(480).buildAndRegister()

// Fluid pattern ex terminal
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('ae2fc:part_fluid_pattern_terminal') * 2, 
    metaitem('sensor.iv') * 4, 
    metaitem('emitter.iv'), 
    metaitem('electric.pump.ev'))
  .outputs(item('ae2fc:part_fluid_pattern_ex_terminal'))
  .duration(10).EUt(880).buildAndRegister()

// Fluid pattern terminal
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:part:340'), 
    metaitem('sensor.ev') * 4, 
    metaitem('emitter.ev'), 
    metaitem('electric.pump.hv'))
  .outputs(item('ae2fc:part_fluid_pattern_terminal'))
  .duration(10).EUt(480).buildAndRegister()

// Fluid level maintainer
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:crafting_monitor'), 
    item('appliedenergistics2:material:24') * 4, 
    metaitem('dustFluix') * 8, 
    item('appliedenergistics2:part:281'), 
    metaitem('plateLapis') * 2)
  .outputs(item('ae2fc:fluid_level_maintainer'))
  .duration(10).EUt(480).buildAndRegister()

// Large ingredient buffer
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('ae2fc:ingredient_buffer') * 4, 
    item('appliedenergistics2:quartz_glass') * 4, 
    item('appliedenergistics2:material:24') * 8)
  .outputs(item('ae2fc:large_ingredient_buffer'))
  .duration(10).EUt(980).buildAndRegister()

// Dual interface
crafting.addShapeless("tfg/ae2fc/dual_interface", item('ae2fc:dual_interface'), [item('ae2fc:part_dual_interface')])
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(24)
  .inputs(
    item('appliedenergistics2:fluid_interface'), 
    item('appliedenergistics2:interface'))
  .outputs(item('ae2fc:dual_interface'))
  .duration(10).EUt(480).buildAndRegister()

// Очистка шаблона
  crafting.addShapeless(item('appliedenergistics2:material:52'), [item('ae2fc:dense_encoded_pattern')])

// Жидкостный сборщик
mods.gregtech.assembler.recipeBuilder()
  .inputs([
    ore('paneGlassColorless') * 2,
    ore('circuitHv') * 2,
    metaitem('conveyor.module.hv') * 2,
    metaitem('fluid.regulator.hv') * 2,
    metaitem('plateSteel') * 4])
  .fluidInputs(fluid('plastic') * 144)
  .outputs([item('ae2fc:fluid_assembler')])
  .duration(200).EUt(480).buildAndRegister()