import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("galacticraftcore")) {

    // --- Массивы
    
    def rocket = [
        item('galacticraftplanets:rocket_t2'),
        item('galacticraftplanets:rocket_t2:1'),
        item('galacticraftplanets:rocket_t2:2'),
        item('galacticraftplanets:rocket_t2:3')
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
        .inputs(item('tfg:meta_item', 14) * 10)
        .inputs(item('galacticraftcore:rocket_fins') * 4)
        .inputs(item('galacticraftcore:engine') * 2)
        .inputs(item('galacticraftcore:engine:1') * 2)
        .inputs(item('galacticraftcore:oil_canister_partial:1001') * 4)
        .inputs(item('tfg:meta_item', 48))
        .inputs(metaitem('electric.motor.ev') * 4)
        .inputs(metaitem('emitter.ev') * 4)
        .inputs(ore('circuitEv') * 8)
        .inputs(item('tfg:meta_item', 36))
        .inputs(item('galacticraftcore:schematic:1'))
        .inputs(crate[i] * 6)
        .fluidInputs(fluid('moon_liquid_air') * 9216)
        .fluidInputs(fluid('tungsten_steel') * 4608)
        .fluidInputs(fluid('titanium') * 4608)
        .outputs(rocket[i])
        .duration(1200).EUt(1024).buildAndRegister()
    }
    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(
            item('opencomputers:case1'),
            item('opencomputers:keyboard'),
            item('opencomputers:screen1'),
            metaitem('emitter.ev'),
            metaitem('sensor.ev'),
            item('galacticraftplanets:item_basic_mars:3'))
        .fluidInputs(fluid('soldering_alloy') * 864)
        .outputs(item('tfg:meta_item', 36))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(1024).buildAndRegister()
    // Корпус
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(
            item('galacticraftplanets:item_basic_mars:3') * 2,
            metaitem('voltage_coil.ev') * 2,
            metaitem('field.generator.ev') * 2)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('tfg:meta_item', 14))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(300).EUt(1024).buildAndRegister()
    // Ускорители
    mods.gregtech.assembler.recipeBuilder()// метеоритоное железо
        .circuitMeta(2)
        .inputs(
            item('galacticraftplanets:item_basic_mars:3') * 2,
            item('galacticraftcore:fuel_canister_partial:1'),
            item('galacticraftcore:heavy_plating') * 4,
            metaitem('electric.pump.ev') * 4,
            metaitem('cableGtSingleAnnealedCopper') * 16,
            metaitem('pipeSmallFluidStainlessSteel') * 16,
            item('galacticraftcore:air_vent') * 2)
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('galacticraftcore:engine:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(1024).buildAndRegister()
    // Сплав сверх-прочных пластин
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(
            item('galacticraftcore:heavy_plating'),
            metaitem('plateDenseMeteoricIron') * 2)
        .fluidInputs(fluid('tungsten_steel') * 72)
        .outputs(item('tfg:meta_item', 25))
        .duration(300).EUt(1024).buildAndRegister()
    // Сверх-прочные пластины
    mods.gregtech.implosion_compressor.recipeBuilder()
        .inputs(item('tfg:meta_item', 25))
        .outputs(
          item('galacticraftplanets:item_basic_mars:3'),
          metaitem('dustTinyTungstenSteel') * 2)
        .explosivesAmount(12)
        .duration(20).EUt(30).buildAndRegister()
    // Схема ракеты
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
        .notConsumable(metaitem('glass_lens.orange'))
        .outputs(item('galacticraftcore:schematic:1'))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(1024).buildAndRegister()
}