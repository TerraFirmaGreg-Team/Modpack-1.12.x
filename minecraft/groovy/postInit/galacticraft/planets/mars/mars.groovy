import classes.Function

if (isLoaded("galacticraftcore")) {

   // Массивы
   def mars = [
      item('galacticraftplanets:mars'),
      item('galacticraftplanets:mars:1'),
      item('galacticraftplanets:mars:2'),
      item('galacticraftplanets:mars:3'),
      item('galacticraftplanets:treasure_t2'),
      item('galacticraftplanets:key'),
      item('galacticraftplanets:item_basic_mars'),
      item('galacticraftplanets:item_basic_mars:6'),
      item('galacticraftplanets:item_basic_mars:5'),
      item('galacticraftplanets:desh_pick'),
      item('galacticraftplanets:desh_pick_slime'),
      item('galacticraftplanets:desh_axe'),
      item('galacticraftplanets:desh_hoe'),
      item('galacticraftplanets:desh_spade'),
      item('galacticraftplanets:desh_sword'),
      item('galacticraftplanets:desh_helmet'),
      item('galacticraftplanets:desh_chestplate'),
      item('galacticraftplanets:desh_leggings'),
      item('galacticraftplanets:desh_boots')
   ]

   // --- Удаление рецептов

   // Удаление рецептов
   for (item in mars) {
      mods.jei.removeAndHide(item)
   }


   // --- Добавление рецептов

   // --- Атмосфера
   Function.GenerateRecipesForAir("mars", -29, 4, 6, 7)
   // Air
   mods.gregtech.centrifuge.recipeBuilder()
      .fluidInputs(fluid('mars_air') * 10000)
      .fluidOutputs(fluid('carbon_dioxide') * 6700)
      .fluidOutputs(fluid('oxygen') * 140)
      .duration(1600).EUt(2048).buildAndRegister()
   // Liquid Air
   mods.gregtech.distillation_tower.recipeBuilder()
      .fluidInputs(fluid('mars_liquid_air') * 200000)
      .fluidOutputs(fluid('carbon_dioxide') * 67000)
      .fluidOutputs(fluid('hydrogen_sulfide') * 7500)
      .fluidOutputs(fluid('helium_3') * 2500)
      .fluidOutputs(fluid('neon') * 500)
      .fluidOutputs(fluid('oxygen') * 1140)
      .duration(2000).EUt(7680).buildAndRegister()


   // --- Породы
   // Поверхности
   Function.GenerateRecipesForSurfaceStones3(item('galacticraftplanets:mars:5'), item('galacticraftplanets:mars:6'), item('galacticraftplanets:mars:9'), metaitem('dustStoneMars'), 2, 2)

   // Пыль марса
   mods.gregtech.centrifuge.recipeBuilder()
      .inputs(metaitem('dustStoneMars') * 3)
      .chancedOutput(metaitem('dustMagnetite'), 3700, 1200)
      .chancedOutput(metaitem('dustSmallTungsten'), 1100, 500)
      .chancedOutput(metaitem('dustSmallAluminium'), 1150, 500)
      .chancedOutput(metaitem('dustSmallZinc'), 950, 500)
      .chancedOutput(metaitem('dustSmallNiobium'), 750, 350)
      .chancedOutput(metaitem('dustSmallGold'), 650, 250)
      .duration(1250).EUt(512).buildAndRegister()

   // Dash --> пыль Dash
   mods.gregtech.macerator.recipeBuilder()
      .inputs(item('galacticraftplanets:mars:8'))
      .outputs(metaitem('dustDesh') * 7)
      .chancedOutput(metaitem('dustDesh'), 2500, 500)
      .duration(760).EUt(510).buildAndRegister()

   // Raw Dash --> пыль Dash
   mods.gregtech.macerator.recipeBuilder()
      .inputs(item('galacticraftplanets:item_basic_mars'))
      .outputs(metaitem('dustSmallDesh') * 1)
      .chancedOutput(metaitem('dustSmallDesh'), 2500, 500)
      .duration(760).EUt(510).buildAndRegister()

   // Дэш блок
   mods.gregtech.compressor.recipeBuilder()
      .inputs(item('galacticraftplanets:item_basic_mars:2') * 9)
      .outputs(item('galacticraftplanets:mars:8'))
      .duration(300).EUt(480).buildAndRegister()

   // Плотная пластина Дэш
   mods.gregtech.bender.recipeBuilder()
      .circuitMeta(9)
      .inputs(item('galacticraftplanets:item_basic_mars:2') * 9)
      .outputs(metaitem('plateDenseDesh'))
      .duration(100).EUt(48).buildAndRegister()
   mods.gregtech.bender.recipeBuilder()
      .circuitMeta(9)
      .inputs(metaitem('plateDesh') * 9)
      .outputs(metaitem('plateDenseDesh'))
      .duration(100).EUt(48).buildAndRegister()

   // Слиток Дэш
   mods.gregtech.implosion_compressor.recipeBuilder()
       .inputs(metaitem('plateDesh') * 4)
       .outputs(item('galacticraftplanets:item_basic_mars:2'))
       .explosivesAmount(2)
       .duration(20).EUt(380).buildAndRegister()

   // Палка Дэш
   crafting.addShaped("tfg/gc/desh_stick", item('galacticraftplanets:item_basic_mars:1'), [
      [ore('toolFile').transform(Function.setToolDamage), null, null],
      [null, item('galacticraftplanets:item_basic_mars:2'), null],
      [null, null, null]])
}