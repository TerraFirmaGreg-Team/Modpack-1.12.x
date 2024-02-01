import classes.Function

if (isLoaded("galacticraftcore")) {

    // Массивы
    def moon = [
        item('galacticraftcore:basic_block_moon'),
        item('galacticraftcore:basic_block_moon:1'),
        item('galacticraftcore:basic_block_moon:2'),
        item('galacticraftcore:basic_block_moon:6'),
        item('galacticraftcore:item_basic_moon:1'),
        item('galacticraftcore:item_basic_moon:2'),
        item('galacticraftcore:cheese_curd'),
        item('galacticraftcore:treasure_chest'),
        item('galacticraftcore:key')
    ]

    // --- Удаление рецептов

    // Удаление рецептов
    for (item in moon) {
        mods.jei.removeAndHide(item)
    }


    // --- Добавление рецептов

    // --- Атмосфера
    Function.GenerateRecipesForAir("moon", -28, 3, 5, 6)
    // Air
    mods.gregtech.centrifuge.recipeBuilder()
        .fluidInputs(fluid('moon_air') * 10000)
        .fluidOutputs(fluid('hydrogen') * 4700)
        .fluidOutputs(fluid('nitrogen') * 250)
        .duration(1600).EUt(512).buildAndRegister()
    // Liquid Air
    mods.gregtech.distillation_tower.recipeBuilder()
        .fluidInputs(fluid('moon_liquid_air') * 100000)
        .fluidOutputs(fluid('hydrogen') * 49700)
        .fluidOutputs(fluid('nitrogen') * 21000)
        .fluidOutputs(fluid('xenon') * 190)
        .duration(2000).EUt(1920).buildAndRegister()


    // --- Породы
    // Поверхности
    Function.GenerateRecipesForSurfaceStones3(item('galacticraftcore:basic_block_moon:5'), item('galacticraftcore:basic_block_moon:3'), item('galacticraftcore:basic_block_moon:4'), metaitem('dustStoneMoon'), 1, 1)

    // Пыль луны
    mods.gregtech.centrifuge.recipeBuilder()
        .inputs(metaitem('dustStoneMoon') * 3)
        .chancedOutput(metaitem('dustSilicon'), 1200, 1200)
        .chancedOutput(metaitem('dustSmallAluminium'), 1100, 500)
        .chancedOutput(metaitem('dustSmallMagnesium'), 1150, 500)
        .chancedOutput(metaitem('dustSmallOlivine'), 950, 500)
        .chancedOutput(metaitem('dustSmallSulfur'), 750, 350)
        .chancedOutput(metaitem('dustSmallMagnetite'), 650, 250)
        .fluidOutputs(fluid('helium_3') * 1)
        .duration(1250).EUt(256).buildAndRegister()

    // Осколок метеоритного железа
    mods.gregtech.macerator.recipeBuilder()
        .inputs(item('galacticraftcore:basic_block_core', 12))
        .outputs(item('galacticraftcore:meteoric_iron_raw') * 4)
        .chancedOutput(item('galacticraftcore:meteoric_iron_raw'), 2500, 500)
        .duration(760).EUt(176).buildAndRegister()

    // Пыль метеоритного железа
    mods.gregtech.macerator.recipeBuilder()
        .inputs(item('galacticraftcore:meteoric_iron_raw'))
        .outputs(metaitem('dustSmallMeteoricIron') * 3)
        .duration(360).EUt(176).buildAndRegister()

    // Слиток метеоритного железа
    mods.gregtech.electric_blast_furnace.recipeBuilder()
        .circuitMeta(9)
           .inputs(metaitem('dustMeteoricIron'))
        .blastFurnaceTemp(1700)
           .outputs(item('galacticraftcore:item_basic_moon'))
           .duration(370).EUt(380).buildAndRegister()

    // Плотная пластина метеоритного железа
    mods.gregtech.bender.recipeBuilder()
       .circuitMeta(9)
       .inputs(item('galacticraftcore:item_basic_moon') * 9)
       .outputs(metaitem('plateDenseMeteoricIron'))
       .duration(100).EUt(48).buildAndRegister()
    mods.gregtech.bender.recipeBuilder()
       .circuitMeta(9)
       .inputs(metaitem('plateMeteoricIron') * 9)
       .outputs(metaitem('plateDenseMeteoricIron'))
       .duration(100).EUt(48).buildAndRegister()
}