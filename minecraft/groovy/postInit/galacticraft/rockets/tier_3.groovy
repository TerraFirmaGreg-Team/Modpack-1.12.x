import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("galacticraftcore")) {

    // --- Массивы

    def rocket = [
        item('galacticraftplanets:rocket_t3'),
        item('galacticraftplanets:rocket_t3:1'),
        item('galacticraftplanets:rocket_t3:2'),
        item('galacticraftplanets:rocket_t3:3')
    ]
    def crate = [
        metaitem('plateSteel'),
       metaitem('crate.aluminium'),
       metaitem('crate.stainless_steel'),
       metaitem('crate.titanium')
    ]


    // --- Добавление рецептов

    for (int i = 0; i < rocket.size(); i++) {
    // Ракета
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(item('galacticraftplanets:heavy_nose_cone'))
        .inputs(item('galacticraftcore:heavy_plating') * 2)
        .inputs(item('tfg:meta_item', 15) * 12)
        .inputs(item('galacticraftplanets:item_basic_asteroids:2') * 4)
        .inputs(item('galacticraftplanets:item_basic_asteroids:1'))
        .inputs(item('galacticraftcore:engine:1') * 2)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 8)
        .inputs(item('tfg:meta_item', 49))
        .inputs(metaitem('electric.motor.iv') * 4)
        .inputs(metaitem('emitter.iv') * 4)
        .inputs(ore('circuitIv') * 8)
        .inputs(item('tfg:meta_item', 37))
        .inputs(item('galacticraftplanets:schematic'))
        .inputs(crate[i] * 9)
        .fluidInputs(fluid('soldering_alloy') * 9216)
        .fluidInputs(fluid('desh') * 4608)
        .fluidInputs(fluid('platinum') * 2608)
        .outputs(rocket[i])
        .duration(1200).EUt(4096).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('opencomputers:case1'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen1'),
            metaitem('emitter.iv'),
            metaitem('sensor.iv'),
            item('galacticraftplanets:item_basic_asteroids:5'))
        .fluidInputs(fluid('soldering_alloy') * 1152)
        .outputs(item('tfg:meta_item', 37))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4096).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('galacticraftcore:nose_cone'),
            item('galacticraftplanets:item_basic_asteroids:5') * 4,
            metaitem('sensor.iv') * 2,
            metaitem('screwTitanium') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftplanets:heavy_nose_cone'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4096).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('galacticraftplanets:item_basic_asteroids:5') * 2,
            metaitem('voltage_coil.iv') * 2,
            metaitem('field.generator.iv') * 3)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 15))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(4096).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('galacticraftcore:heavy_plating') * 2,
            item('galacticraftplanets:item_basic_asteroids:5') * 4,
            metaitem('screwStainlessSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftplanets:item_basic_asteroids:2'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4096).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('galacticraftplanets:item_basic_asteroids:5') * 5,
            item('galacticraftcore:engine:1') * 2,
            item('galacticraftcore:engine') * 2,
            metaitem('electric.pump.iv') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftplanets:item_basic_asteroids:1'))
        .duration(600).EUt(4096).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('galacticraftplanets:item_basic_mars:3'),
            metaitem('plateDenseDesh') * 4)
        .fluidInputs(fluid('platinum') * 72)
        .outputs(item('tfg:meta_item', 26))
        .duration(300).EUt(4096).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 26))
        .outputs(
          item('galacticraftplanets:item_basic_asteroids:5'),
          metaitem('dustTinyPlatinum') * 3)
        .explosivesAmount(18)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.magenta'))
        .outputs(item('galacticraftplanets:schematic'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(4096).buildAndRegister()
}