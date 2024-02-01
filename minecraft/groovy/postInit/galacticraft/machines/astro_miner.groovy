import gregtech.api.metatileentity.multiblock.CleanroomType

if (isLoaded("galacticraftcore")) {

    // Майнер
    mods.gregtech.assembly_line.recipeBuilder()
        .inputs(item('galacticraftplanets:item_basic_mars:3') * 8)
        .inputs(item('galacticraftplanets:item_basic_asteroids:5') * 3)
        .inputs(item('galacticraftplanets:orion_drive') * 5)
        .inputs(item('galacticraftcore:steel_pole') * 4)
        .inputs(item('galacticraftplanets:item_basic_asteroids:8'))
        .inputs(item('gregtech:meta_item_1', 372) * 4)
        .inputs(metaitem('crate.titanium') * 4)
        .inputs(metaitem('electric.motor.ev') * 4)
        .inputs(item('galacticraftplanets:beam_receiver'))
        .inputs(item('tfg:meta_item', 52))
        .fluidInputs(fluid('black_steel') * 9216)
        .fluidInputs(fluid('aluminium') * 4608)
        .fluidInputs(fluid('bronze') * 4608)
        .outputs(item('galacticraftplanets:astro_miner'))
        .duration(1200).EUt(4096).buildAndRegister()

    // Ракетный компьютер
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs(
            item('opencomputers:case2'),
            item('gregtech:meta_item_1', 372),
            ore('circuitLuv'),
            metaitem('emitter.iv'),
            metaitem('sensor.iv'),
            item('galacticraftplanets:item_basic_asteroids:5'))
        .fluidInputs(fluid('soldering_alloy') * 1152)
        .outputs(item('tfg:meta_item', 52))
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(600).EUt(7680).buildAndRegister()

    // Основания астрономического шахтера
    crafting.addShaped("tfg/gc/miner_base", item('galacticraftplanets:miner_base'), [
       [metaitem('plateDenseDesh'), metaitem('crate.stainless_steel'), metaitem('plateDenseDesh')],
       [item('galacticraftplanets:item_basic_asteroids:8'), metaitem('frameTungsten'), item('galacticraftplanets:item_basic_asteroids:8')],
       [metaitem('plateDenseDesh'), metaitem('battery_buffer.luv.16'), metaitem('plateDenseDesh')]])

    // Схема
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(item('tfg:meta_item', 46))
       .notConsumable(metaitem('glass_lens.brown'))
        .outputs(item('galacticraftplanets:schematic:2'))
       .cleanroom(CleanroomType.CLEANROOM)
        .duration(9000).EUt(1024).buildAndRegister()
}