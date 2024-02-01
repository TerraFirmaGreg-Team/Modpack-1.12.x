import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

    // --- Массивы

    def rocket = [
        item('extraplanets:item_tier7_rocket'),
        item('extraplanets:item_tier7_rocket:1'),
        item('extraplanets:item_tier7_rocket:2'),
        item('extraplanets:item_tier7_rocket:3'),
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
        .inputs(item('extraplanets:nose_cone_tier7'))
        .inputs(item('tfg:meta_item', 19) * 12)
        .inputs(item('extraplanets:tier7_items:2') * 8)
        .inputs(item('extraplanets:tier7_items:1') * 6)
        .inputs(item('extraplanets:tier7_items') * 5)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 64)
        .inputs(item('tfg:meta_item', 49))
        .inputs(metaitem('electric.motor.uhv') * 4)
        .inputs(metaitem('emitter.uhv') * 4)
        .inputs(ore('circuitUhv') * 8)
        .inputs(crate[i] * 18)
        .inputs(item('tfg:meta_item', 41))
        .inputs(item('extraplanets:schematic_tier7'))
        .fluidInputs(fluid('naquadria') * 9216)
        .fluidInputs(fluid('soldering_alloy') * 4608)
        .fluidInputs(fluid('tritanium') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(1048576).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('opencomputers:case2'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen2'),
            metaitem('emitter.uhv'),
            metaitem('sensor.uhv'),
            item('extraplanets:tier7_items:3'))
        .fluidInputs(fluid('soldering_alloy') * 4608)
        .outputs(item('tfg:meta_item', 41))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(1048576).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('extraplanets:nose_cone_tier4'),
            item('extraplanets:tier7_items:3') * 4,
            metaitem('sensor.uhv') * 2,
            metaitem('screwTungstenSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:nose_cone_tier7'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(1048576).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('extraplanets:tier7_items:3') * 2,
            metaitem('voltage_coil.uv') * 2,
            metaitem('field.generator.uhv'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 19))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(1048576).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('extraplanets:tier7_items:3') * 2,
            item('extraplanets:tier6_items:3') * 2,
            metaitem('screwRuridit') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier7_items:2'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(1048576).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('extraplanets:tier7_items:3') * 5,
            item('galacticraftplanets:item_basic_asteroids:1') * 2,
            item('galacticraftcore:engine:1') * 2,
            metaitem('electric.pump.uhv') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier7_items'))
        .duration(300).EUt(1048576).buildAndRegister()
    // Ускорители
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(7)
        .inputs(
            item('galacticraftcore:engine:1'),
            item('extraplanets:tier7_items:3') * 4,
            metaitem('plateDenseIce') * 3)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier7_items:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(1048576).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(
            item('extraplanets:tier6_items:3'),
            metaitem('plateDoubleTritanium') * 6,
            metaitem('plateDoubleTritanium') * 6,
            metaitem('boltNeutronium') * 10)
        .fluidInputs(fluid('indium') * 288)
        .outputs(item('tfg:meta_item', 30))
        .duration(300).EUt(1048576).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 30))
        .outputs(
          item('extraplanets:tier7_items:3'),
          metaitem('dustTinyTritanium') * 6)
        .explosivesAmount(36)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.pink'))
        .outputs(item('extraplanets:schematic_tier7'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(1048576).buildAndRegister()
}