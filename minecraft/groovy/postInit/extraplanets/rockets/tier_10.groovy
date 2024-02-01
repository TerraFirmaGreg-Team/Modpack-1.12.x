import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

  // --- Массивы

  def rocket = [
    item('extraplanets:item_tier10_rocket'),
    item('extraplanets:item_tier10_rocket:1'),
    item('extraplanets:item_tier10_rocket:2'),
    item('extraplanets:item_tier10_rocket:3'),
  ]
  def crate = [
    metaitem('plateAluminium'),
    metaitem('crate.aluminium'),
    metaitem('crate.stainless_steel'),
    metaitem('crate.titanium')
  ]




  // --- Добавление рецептов

  for (int i = 0; i < rocket.size(); i++) {
  // Ракета
  mods.gregtech.assembly_line.recipeBuilder()
    .inputs(item('extraplanets:nose_cone_tier10'))
    .inputs(item('tfg:meta_item', 22) * 12)
    .inputs(item('extraplanets:tier10_items:2') * 8)
    .inputs(item('extraplanets:tier10_items:1') * 6)
    .inputs(item('extraplanets:tier10_items') * 5)
    .inputs(item('galacticraftcore:oil_canister_partial:1001') * 64)
    .inputs(item('tfg:meta_item', 49))
    .inputs(metaitem('electric.motor.uxv') * 4)
    .inputs(metaitem('emitter.uxv') * 4)
    .inputs(ore('circuitUhv') * 8)
    .inputs(crate[i] * 18)
    .inputs(item('tfg:meta_item', 44))
    .inputs(item('extraplanets:schematic_tier10'))
    .fluidInputs(fluid('naquadria') * 9216)
    .fluidInputs(fluid('soldering_alloy') * 4608)
    .fluidInputs(fluid('tritanium') * 4608)
    .outputs(rocket[i])
    .duration(1200).EUt(67108864).buildAndRegister()
  }
  // Ракетный компьютер
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('opencomputers:case3'),
      item('opencomputers:keyboard'),
      item('opencomputers:screen3'),
      metaitem('emitter.uxv'),
      metaitem('sensor.uxv'),
      item('extraplanets:tier10_items:3'))
    .fluidInputs(fluid('soldering_alloy') * 9112)
    .outputs(item('tfg:meta_item', 44))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(600).EUt(67108864).buildAndRegister()
  // Головоной обтекатель
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('extraplanets:nose_cone_tier4'),
      item('extraplanets:tier10_items:3') * 4,
      metaitem('sensor.uxv') * 2,
      metaitem('screwTungstenSteel') * 4)
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('extraplanets:nose_cone_tier10'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(600).EUt(67108864).buildAndRegister()
  // Корпус
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('extraplanets:tier10_items:3') * 2,
      metaitem('voltage_coil.uv') * 2,
      metaitem('field.generator.uxv'))
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('tfg:meta_item', 22))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(300).EUt(67108864).buildAndRegister()
  // Стабилизаторы
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('extraplanets:tier10_items:3') * 2,
      item('extraplanets:tier9_items:3') * 2,
      metaitem('screwRuridit') * 4)
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('extraplanets:tier10_items:2'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(300).EUt(67108864).buildAndRegister()
  // Ракетные двигатели
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('extraplanets:tier10_items:3') * 5,
      item('galacticraftplanets:item_basic_asteroids:1') * 2,
      item('galacticraftcore:engine:1') * 2,
      metaitem('electric.pump.uxv') * 4,
      metaitem('cableGtSingleAnnealedCopper') * 16)
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('extraplanets:tier10_items'))
    .duration(300).EUt(67108864).buildAndRegister()
  // Ускорители
  mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(
      item('galacticraftcore:engine:1'),
      item('extraplanets:tier10_items:3') * 4,
      metaitem('plateDenseIce') * 3)
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('extraplanets:tier10_items:1'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(600).EUt(67108864).buildAndRegister()
  // Сплав сверх-прочных пластин
  mods.gregtech.assembly_line.recipeBuilder()
    .inputs(
      item('extraplanets:tier9_items:3'),
      metaitem('plateDenseNaquadria') * 4,
      metaitem('plateDenseNaquadria') * 4,
      metaitem('boltTritanium') * 8)
    .fluidInputs(fluid('soldering_alloy') * 144)
    .outputs(item('tfg:meta_item', 33))
    .duration(300).EUt(67108864).buildAndRegister()
  // Сверх-прочные пластины
  mods.gregtech.implosion_compressor.recipeBuilder()
      .inputs(item('tfg:meta_item', 33))
      .outputs(
        item('extraplanets:tier10_items:3'),
        metaitem('dustTinyTritanium') * 6)
      .explosivesAmount(36)
      .duration(20).EUt(30).buildAndRegister()
  // Схема ракеты
  mods.gregtech.laser_engraver.recipeBuilder()
      .inputs(item('tfg:meta_item', 46))
    .notConsumable(metaitem('glass_lens.cyan'))
      .outputs(item('extraplanets:schematic_tier10'))
    .cleanroom(CleanroomType.CLEANROOM)
      .duration(9000).EUt(67108864).buildAndRegister()
}