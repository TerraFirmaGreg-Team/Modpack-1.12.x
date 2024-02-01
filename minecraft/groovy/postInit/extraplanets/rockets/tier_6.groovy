import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

    // --- Массивы

    def rocket = [
        item('extraplanets:item_tier6_rocket'),
        item('extraplanets:item_tier6_rocket:1'),
        item('extraplanets:item_tier6_rocket:2'),
        item('extraplanets:item_tier6_rocket:3'),
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
        .inputs(item('extraplanets:nose_cone_tier6'))
        .inputs(item('tfg:meta_item', 18) * 12)
        .inputs(item('extraplanets:tier6_items:2') * 8)
        .inputs(item('extraplanets:tier6_items:1') * 6)
        .inputs(item('extraplanets:tier6_items') * 5)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 64)
        .inputs(item('tfg:meta_item', 49))
        .inputs(metaitem('electric.motor.uv') * 4)
        .inputs(metaitem('emitter.uv') * 4)
        .inputs(ore('circuitUv') * 8)
        .inputs(crate[i] * 18)
        .inputs(item('tfg:meta_item', 40))
        .inputs(item('extraplanets:schematic_tier6'))
        .fluidInputs(fluid('naquadria') * 9216)
        .fluidInputs(fluid('soldering_alloy') * 4608)
        .fluidInputs(fluid('tritanium') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(262144).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('opencomputers:case3'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen3'),
            metaitem('emitter.uv'),
            metaitem('sensor.uv'),
            item('extraplanets:tier6_items:3'))
        .fluidInputs(fluid('soldering_alloy') * 3456)
        .outputs(item('tfg:meta_item', 40))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(262144).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('extraplanets:nose_cone_tier4'),
            item('extraplanets:tier6_items:3') * 4,
            metaitem('sensor.uv') * 2,
            metaitem('screwTungstenSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:nose_cone_tier6'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(262144).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('extraplanets:tier6_items:3') * 2,
            metaitem('voltage_coil.uv') * 2,
            metaitem('field.generator.uv'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 18))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(262144).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('extraplanets:tier6_items:3') * 2,
            item('extraplanets:tier5_items:3') * 2,
            metaitem('screwRuridit') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier6_items:2'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(262144).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('extraplanets:tier6_items:3') * 5,
            item('galacticraftplanets:item_basic_asteroids:1') * 2,
            item('galacticraftcore:engine:1') * 2,
            metaitem('electric.pump.uv') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier6_items'))
        .duration(300).EUt(262144).buildAndRegister()
    // Ускорители
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(6)
        .inputs(
            item('galacticraftcore:engine:1'),
            item('extraplanets:tier6_items:3') * 4,
            metaitem('plateDenseIce') * 3)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier6_items:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(262144).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(
            item('extraplanets:tier5_items:3'),
            metaitem('plateDoubleHsse') * 6,
            metaitem('plateDoubleHsse') * 6,
            metaitem('boltTritanium') * 8)
        .fluidInputs(fluid('indium') * 144)
        .outputs(item('tfg:meta_item', 29))
        .duration(300).EUt(262144).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 29))
        .outputs(
          item('extraplanets:tier6_items:3'),
          metaitem('dustTinyTritanium') * 6)
        .explosivesAmount(36)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.lime'))
        .outputs(item('extraplanets:schematic_tier6'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(262144).buildAndRegister()
}