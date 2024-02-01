// MODS_LOADED: galacticresearch


// --- Создание рецептов

// Satellite controller
mods.gregtech.assembler.recipeBuilder()
   .circuitMeta(7)
   .inputs(
      ore('circuitIv'), 
      metaitem('plateDenseTin') * 4,
      item('gregtech:meta_item_1', 372) * 2, 
      metaitem('wireGtQuadrupleAluminium') * 2, 
      metaitem('sensor.iv'),
      item('galacticraftcore:telemetry'))
   .outputs(item('galacticresearch:mission_control_station'))
   .duration(200).EUt(2000).buildAndRegister()

// Satellite launcher
mods.gregtech.assembler.recipeBuilder()
   .circuitMeta(7)
   .inputs(
      item('galacticraftcore:grating') * 8, 
      metaitem('plateDenseSteel') * 8 , 
      item('gregtech:meta_item_1', 372) * 2, 
      metaitem('wireGtQuadrupleAluminium') * 2,
      item('galacticraftcore:steel_pole') * 2,
      item('galacticraftcore:cargo', 4),
      item('galacticraftcore:cargo'))
   .outputs(item('galacticresearch:launchpad_tower'))
   .duration(150).EUt(2000).buildAndRegister()

// Telescope
mods.gregtech.assembler.recipeBuilder()
   .circuitMeta(7)
   .inputs(
      metaitem('sensor.iv'), 
      metaitem('plateDenseAluminium') * 4,
      metaitem('plateDenseBronze') * 4,
      ore('craftingLensWhite') * 3, 
      ore('circuitEv') * 2, 
      metaitem('sensor.ev') * 2,
      item('galacticraftcore:view_screen'))
   .outputs(item('galacticresearch:telescope'))
   .duration(200).EUt(1700).buildAndRegister()

// Спутник
mods.gregtech.assembly_line.recipeBuilder()
   .inputs(metaitem('cover.solar.panel') * 36)
   .inputs(metaitem('field.generator.iv') * 4)
   .inputs(ore('circuitEv') * 4)
   .inputs(item('galacticraftcore:engine'))
   .inputs(metaitem('sensor.ev') * 8)
   .inputs(ore('batteryHv') * 3)
   .inputs(metaitem('electric.motor.ev') * 4)
   .inputs(metaitem('emitter.ev') * 4)
   .fluidInputs(fluid('soldering_alloy') * 9216)
   .fluidInputs(fluid('lead') * 4608)
   .outputs(item('galacticresearch:probe'))
   .duration(200).EUt(2000).buildAndRegister()


// Ракета со спутником
mods.gregtech.assembly_line.recipeBuilder()
   .inputs(item('galacticraftcore:nose_cone'))
   .inputs(item('galacticraftcore:heavy_plating') * 4)
   .inputs(item('galacticraftcore:rocket_fins') * 4)
   .inputs(item('galacticresearch:probe') * 4)
   .inputs(item('galacticraftcore:engine'))
   .inputs(metaitem('electric.motor.ev') * 4)
   .inputs(metaitem('emitter.ev') * 4)
   .fluidInputs(fluid('soldering_alloy') * 9216)
   .fluidInputs(fluid('lead') * 4608)
   .outputs(item('galacticresearch:satellite_rocket'))
   .duration(300).EUt(4000).buildAndRegister()

// Добывающая ракета
mods.gregtech.assembly_line.recipeBuilder()
   .inputs(item('galacticraftcore:nose_cone'))
   .inputs(item('galacticraftplanets:item_basic_mars', 3) * 9)
   .inputs(item('galacticraftcore:rocket_fins') * 6)
   .inputs(item('galacticraftplanets:astro_miner') * 2)
   .inputs(item('galacticraftplanets:item_basic_asteroids', 1) * 2)
   .inputs(item('galacticresearch:mining_rocket_schematic'))
   .inputs(metaitem('electric.motor.ev') * 4)
   .inputs(metaitem('emitter.ev') * 4)
   .inputs(metaitem('crate.steel'))
   .fluidInputs(fluid('soldering_alloy') * 9216)
   .fluidInputs(fluid('lead') * 4608)
   .outputs(item('galacticresearch:mining_rocket'))
   .duration(300).EUt(4000).buildAndRegister()
