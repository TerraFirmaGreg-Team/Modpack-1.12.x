import classes.Function

if (isLoaded("galacticraftcore")) {

    // Массивы
    def venus = [
        item('galacticraftplanets:venus:6'),
        item('galacticraftplanets:venus:7'),
        item('galacticraftplanets:venus:8'),
        item('galacticraftplanets:venus:9'),
        item('galacticraftplanets:venus:10'),
        item('galacticraftplanets:venus:11'),
        item('galacticraftplanets:venus:12'),
        item('galacticraftplanets:venus:13'),
        item('galacticraftplanets:spout'),
        item('galacticraftplanets:basic_item_venus:1'),
        item('galacticraftplanets:basic_item_venus:4'),
        item('galacticraftplanets:treasure_t3'),
        item('galacticraftplanets:key_t3'),
        item('galacticraftplanets:cavern_vines')
    ]

    // --- Удаление рецептов

    // Удаление рецептов
    for (item in venus) {
        mods.jei.removeAndHide(item)
    }

    // --- Добавление рецептов

    // --- Атмосфера
    Function.GenerateRecipesForAir("venus", -31, 4, 6, 5)
    // Air
    mods.gregtech.centrifuge.recipeBuilder()
        .fluidInputs(fluid('venus_air') * 10000)
        .fluidOutputs(fluid('carbon_dioxide') * 4700)
        .fluidOutputs(fluid('sulfur_dioxide') * 1200)
        .duration(1600).EUt(2048).buildAndRegister()
    // Liquid Air
    mods.gregtech.distillation_tower.recipeBuilder()
        .fluidInputs(fluid('venus_liquid_air') * 200000)
        .fluidOutputs(fluid('carbon_dioxide') * 69000)
        .fluidOutputs(fluid('sulfur_dioxide') * 7500)
        .fluidOutputs(fluid('nitrogen') * 5500)
        .fluidOutputs(fluid('neon') * 170)
        .duration(2000).EUt(7680).buildAndRegister()


    // --- Породы
    // Поверхности
    Function.GenerateRecipesForSurfaceStones2(item('galacticraftplanets:venus'), item('galacticraftplanets:venus:1'), metaitem('dustStoneVenus'), 3, 3)

    // Пыль венеры
    mods.gregtech.centrifuge.recipeBuilder()
        .inputs(metaitem('dustStoneVenus'))
        .chancedOutput(metaitem('dustSmallManganese'), 3700, 1200)
        .chancedOutput(metaitem('dustSmallTitanium'), 1100, 500)
        .chancedOutput(metaitem('dustSmallMagnesium'), 1150, 500)
        .chancedOutput(metaitem('dustSmallChalcopyrite'), 950, 500)
        .chancedOutput(metaitem('dustSmallBismuth'), 750, 350)
        .chancedOutput(metaitem('dustTinySulfur'), 650, 250)
        .duration(1250).EUt(1024).buildAndRegister()
}