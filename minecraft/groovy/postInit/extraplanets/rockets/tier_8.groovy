import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

    // --- Массивы

    def rocket = [
        item('extraplanets:item_tier8_rocket'),
        item('extraplanets:item_tier8_rocket:1'),
        item('extraplanets:item_tier8_rocket:2'),
        item('extraplanets:item_tier8_rocket:3'),
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
        .inputs(item('extraplanets:nose_cone_tier8'))
        .inputs(item('tfg:meta_item', 20) * 12)
        .inputs(item('extraplanets:tier8_items:2') * 8)
        .inputs(item('extraplanets:tier8_items:1') * 6)
        .inputs(item('extraplanets:tier8_items') * 5)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 64)
        .inputs(item('tfg:meta_item', 49))
        .inputs(metaitem('electric.motor.uev') * 4)
        .inputs(metaitem('emitter.uev') * 4)
        .inputs(ore('circuitUhv') * 8)
        .inputs(crate[i] * 18)
        .inputs(item('tfg:meta_item', 42))
        .inputs(item('extraplanets:schematic_tier8'))
        .fluidInputs(fluid('naquadria') * 9216)
        .fluidInputs(fluid('soldering_alloy') * 4608)
        .fluidInputs(fluid('tritanium') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(4194304).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('opencomputers:case3'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen3'),
            metaitem('emitter.uev'),
            metaitem('sensor.uev'),
            item('extraplanets:tier8_items:3'))
        .fluidInputs(fluid('soldering_alloy') * 6912)
        .outputs(item('tfg:meta_item', 42))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4194304).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('extraplanets:nose_cone_tier4'),
            item('extraplanets:tier8_items:3') * 4,
            metaitem('sensor.uev') * 2,
            metaitem('screwTungstenSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:nose_cone_tier8'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4194304).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('extraplanets:tier8_items:3') * 2,
            metaitem('voltage_coil.uv') * 2,
            metaitem('field.generator.uev'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 20))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(4194304).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('extraplanets:tier8_items:3') * 2,
            item('extraplanets:tier7_items:3') * 2,
            metaitem('screwRuridit') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier8_items:2'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(4194304).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('extraplanets:tier8_items:3') * 5,
            item('galacticraftplanets:item_basic_asteroids:1') * 2,
            item('galacticraftcore:engine:1') * 2,
            metaitem('electric.pump.uev') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier8_items'))
        .duration(300).EUt(4194304).buildAndRegister()
    // Ускорители
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(8)
        .inputs(
            item('galacticraftcore:engine:1'),
            item('extraplanets:tier8_items:3') * 4,
            metaitem('plateDenseIce') * 3)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('extraplanets:tier8_items:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(4194304).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(
            item('extraplanets:tier7_items:3'),
            metaitem('plateDenseNaquadria') * 4,
            metaitem('plateDenseNaquadria') * 4,
            metaitem('boltTritanium') * 8)
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs(item('tfg:meta_item', 31))
        .duration(300).EUt(4194304).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 31))
        .outputs(
            item('extraplanets:tier8_items:3'),
            metaitem('dustTinyTritanium') * 6)
        .explosivesAmount(36)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.gray'))
        .outputs(item('extraplanets:schematic_tier8'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(4194304).buildAndRegister()
}