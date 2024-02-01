import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

    // --- Массивы

    def rocket = [
        item('extraplanets:item_tier4_rocket'),
        item('extraplanets:item_tier4_rocket:1'),
        item('extraplanets:item_tier4_rocket:2'),
        item('extraplanets:item_tier4_rocket:3'),
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
        .inputs(item('extraplanets:nose_cone_tier4'))
        .inputs(item('tfg:meta_item', 16) * 12)
        .inputs(item('extraplanets:tier4_items:2') * 6)
        .inputs(item('extraplanets:tier4_items:1') * 4)
        .inputs(item('extraplanets:tier4_items') * 2)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 16)
        .inputs(item('tfg:meta_item', 49))
        .inputs(metaitem('electric.motor.luv') * 4)
        .inputs(metaitem('emitter.luv') * 4)
        .inputs(ore('circuitLuv') * 8)
        .inputs(crate[i] * 12)
        .inputs(item('tfg:meta_item', 38))
        .inputs(item('extraplanets:schematic_tier4'))
        .fluidInputs(fluid('dense_ice') * 9216)
        .fluidInputs(fluid('soldering_alloy') * 4608)
        .fluidInputs(fluid('ruridit') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(16384).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('opencomputers:case2'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen2'),
            metaitem('emitter.luv'),
            metaitem('sensor.luv'),
            item('extraplanets:tier4_items:3'))
        .fluidInputs(fluid('soldering_alloy') * 1728)
        .outputs(item('tfg:meta_item', 38))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(16384).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('galacticraftplanets:heavy_nose_cone'),
            item('extraplanets:tier4_items:3') * 4,
            metaitem('sensor.luv') * 2,
            metaitem('screwTungstenSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:nose_cone_tier4'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(16384).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('extraplanets:tier4_items:3') * 2,
            metaitem('voltage_coil.luv') * 2,
            metaitem('field.generator.luv'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 16))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(16384).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('extraplanets:tier4_items:3') * 2,
            item('galacticraftplanets:item_basic_asteroids:5') * 2,
            metaitem('screwRuridit') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier4_items:2'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(16384).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('extraplanets:tier4_items:3') * 5,
            item('galacticraftplanets:item_basic_asteroids:1') * 2,
            item('galacticraftcore:engine:1') * 2,
            metaitem('electric.pump.luv') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier4_items'))
        .duration(300).EUt(16384).buildAndRegister()
    // Ускорители
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs(
            item('galacticraftcore:engine:1'),
            item('extraplanets:tier4_items:3') * 4,
            metaitem('plateDenseIce') * 3)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier4_items:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(16384).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(
            item('galacticraftplanets:item_basic_asteroids:5'),
            metaitem('plateDenseDenseIce') * 3,
            metaitem('plateDenseDenseIce') * 3,
            metaitem('boltRuridit') * 4)
        .fluidInputs(fluid('indium') * 36)
        .outputs(item('tfg:meta_item', 27))
        .duration(300).EUt(16384).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 27))
        .outputs(
          item('extraplanets:tier4_items:3'),
          metaitem('dustTinyRuridit') * 4)
        .explosivesAmount(24)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.light_blue'))
        .outputs(item('extraplanets:schematic_tier4'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(16384).buildAndRegister()
}