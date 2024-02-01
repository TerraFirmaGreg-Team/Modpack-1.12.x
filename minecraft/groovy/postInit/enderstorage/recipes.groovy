// MODS_LOADED: enderstorage


// ---- Добавление рецептов

// Chest
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(1)
  .inputs(
    metaitem('foilBronze') * 4,
    metaitem('plateEnderPearl') * 4,
    metaitem('plateObsidian') * 32, 
    ore('wool'), 
    metaitem('cover.ender_fluid_link'), 
    metaitem('super_chest.hv'))
    .fluidInputs(fluid('blaze') * 1152)
  .outputs(item('enderstorage:ender_storage'))
  .duration(980).EUt(7080).buildAndRegister()

// Tank
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(2)
  .inputs(
    metaitem('foilBronze') * 4,
    metaitem('plateEnderPearl') * 4,
    metaitem('plateObsidian') * 32, 
    ore('wool'), 
    metaitem('cover.ender_fluid_link'), 
    metaitem('super_tank.hv'))
    .fluidInputs(fluid('blaze') * 1152)
  .outputs(item('enderstorage:ender_storage:1'))
  .duration(980).EUt(7080).buildAndRegister()

// Pouch
mods.gregtech.assembler.recipeBuilder()
  .circuitMeta(3)
  .inputs(
    metaitem('foilBronze') * 4,
    metaitem('plateEnderPearl') * 4,
    item('travelersbackpack:travelers_backpack'),
    ore('wool'),
    metaitem('cover.ender_fluid_link'))
  .fluidInputs(fluid('blaze') * 1152)
  .outputs(item('enderstorage:ender_pouch'))
  .duration(980).EUt(7080).buildAndRegister()
