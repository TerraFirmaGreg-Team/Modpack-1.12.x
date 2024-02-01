import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("galacticraftcore")) {

    // --- Массивы
    
    def rocket = [
        item('galacticraftcore:rocket_t1'),
        item('galacticraftcore:rocket_t1:1'),
        item('galacticraftcore:rocket_t1:2'),
        item('galacticraftcore:rocket_t1:3')
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
        .inputs(item('galacticraftcore:nose_cone'))
        .inputs(item('tfg:meta_item', 13) * 8)
        .inputs(item('galacticraftcore:rocket_fins') * 4)
        .inputs(item('galacticraftcore:engine'))
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 2)
        .inputs(item('tfg:meta_item', 47))
        .inputs(metaitem('electric.motor.hv') * 4)
        .inputs(metaitem('emitter.hv') * 4)
        .inputs(ore('circuitHv') * 8)
        .inputs(item('tfg:meta_item', 35))
        .inputs(crate[i] * 3)
        .fluidInputs(fluid('black_steel') * 9216)
        .fluidInputs(fluid('aluminium') * 4608)
        .fluidInputs(fluid('bronze') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(480).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:case1'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen1'),
            metaitem('emitter.hv'),
            metaitem('sensor.hv'),
            item('galacticraftcore:heavy_plating'))
        .fluidInputs(fluid('soldering_alloy') * 576)
        .outputs(item('tfg:meta_item', 35))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(480).buildAndRegister()
    // Головоной обтекатель
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('galacticraftcore:heavy_plating') * 4,
            item('projectred-illumination:inverted_cage_lamp:14'),
            metaitem('sensor.hv') * 2,
            metaitem('screwStainlessSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftcore:nose_cone'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(480).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('galacticraftcore:heavy_plating') * 2,
            metaitem('voltage_coil.hv') * 2,
            metaitem('field.generator.hv'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 13))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(480).buildAndRegister()
    // Стабилизаторы
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('galacticraftcore:heavy_plating') * 4,
            metaitem('plateDenseSteel') * 2,
            metaitem('screwStainlessSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftcore:rocket_fins'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(480).buildAndRegister()
    // Ракетные двигатели
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('galacticraftcore:heavy_plating') * 6,
            item('galacticraftcore:oil_canister_partial:1001'),
            metaitem('cover.activity.detector'),
            metaitem('electric.pump.hv') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16,
            item('gregtech:boiler_firebox_casing:1'))
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftcore:engine'))
        .duration(300).EUt(480).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('plateDenseBlackSteel'),
            metaitem('plateDenseAluminium'),
            metaitem('plateDenseBronze'))
        .fluidInputs(fluid('stainless_steel') * 72)
        .outputs(item('tfg:meta_item', 24))
        .duration(300).EUt(480).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 24))
        .outputs(
          item('galacticraftcore:heavy_plating'),
          metaitem('dustTinyStainlessSteel'))
        .explosivesAmount(6)
        .duration(20).EUt(30).buildAndRegister()
}