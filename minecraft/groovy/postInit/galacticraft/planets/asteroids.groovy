import classes.Function
import gregtech.api.GTValues

if (isLoaded("galacticraftcore")) {

   // Массивы
   def asteroids = [
      item('galacticraftplanets:asteroids_block:3'),
      item('galacticraftplanets:asteroids_block:4'),
      item('galacticraftplanets:asteroids_block:5'),
      item('galacticraftplanets:asteroids_block:7'),
      item('galacticraftplanets:item_basic_asteroids'),
      item('galacticraftplanets:item_basic_asteroids:3'),
      item('galacticraftplanets:item_basic_asteroids:4'),
      item('galacticraftplanets:item_basic_asteroids:6'),
      item('galacticraftplanets:item_basic_asteroids:9'),
      item('galacticraftplanets:titanium_pickaxe'),
      item('galacticraftplanets:titanium_axe'),
      item('galacticraftplanets:titanium_hoe'),
      item('galacticraftplanets:titanium_shovel'),
      item('galacticraftplanets:titanium_sword'),
      item('galacticraftplanets:titanium_helmet'),
      item('galacticraftplanets:titanium_chestplate'),
      item('galacticraftplanets:titanium_leggings'),
      item('galacticraftplanets:titanium_boots'),
   ]

   // --- Удаление рецептов

   // Удаление рецептов
   for (item in asteroids) {
      mods.jei.removeAndHide(item)
   }

   // --- Добавление рецептов

   // --- Атмосфера



   // --- Породы
   // Поверхности
   Function.GenerateRecipesForSurfaceStones1(item('galacticraftplanets:asteroids_block'), metaitem('dustStoneAsteroidBlack'), 3, 3)

   mods.gregtech.centrifuge.recipeBuilder()
      .inputs(metaitem('dustStoneAsteroidBlack') * 2)
      .chancedOutput(metaitem('dustImpureNickel'), 3000, 500)
      .chancedOutput(metaitem('dustImpureYellowLimonite'), 4500, 100)
      .chancedOutput(metaitem('dustImpureBrownLimonite'), 4500, 100)
      .chancedOutput(metaitem('dustImpureGold'), 1100, 100)
      .chancedOutput(metaitem('dustTinyIridiumMetalResidue'), 500, 100)
      .chancedOutput(metaitem('dustTinyIndium'), 10, 1)
      .duration(1600).EUt(1640).buildAndRegister()

   // Поверхности
   Function.GenerateRecipesForSurfaceStones1(item('galacticraftplanets:asteroids_block:1'), metaitem('dustStoneAsteroidGray'), 3, 3)

   mods.gregtech.centrifuge.recipeBuilder()
      .inputs(metaitem('dustStoneAsteroidGray') * 2)
      .chancedOutput(metaitem('dustImpureBauxite'), 3000, 500)
      .chancedOutput(metaitem('dustImpureDiamond'), 3500, 100)
      .chancedOutput(metaitem('dustImpureRedstone'), 1500, 100)
      .chancedOutput(metaitem('dustImpureMonazite'), 1100, 100)
      .chancedOutput(metaitem('dustImpureMolybdenum'), 5000, 500)
      .chancedOutput(metaitem('dustTinyRareEarth'), 500, 500)
      .duration(1600).EUt(1640).buildAndRegister()

   // Поверхности
   Function.GenerateRecipesForSurfaceStones1(item('galacticraftplanets:asteroids_block:2'), metaitem('dustStoneAsteroidBlack'), 3, 3)

   mods.gregtech.centrifuge.recipeBuilder()
      .inputs(metaitem('dustStoneAsteroidLightgray') * 3)
      .chancedOutput(metaitem('dustTinyCobalt'), 7500, 1000)
      .chancedOutput(metaitem('dustTinyBeryllium'), 5000, 500)
      .chancedOutput(metaitem('dustTinyPlatinum'), 2500, 250)
      .chancedOutput(metaitem('dustTinyBarium'), 1100, 100)
      .chancedOutput(metaitem('dustTinyNaquadah'), 100, 100)
      .duration(1600).EUt(1640).buildAndRegister()

   // Пластина плотного льда
   mods.gregtech.cutter.recipeBuilder()
       .inputs(item('galacticraftplanets:dense_ice'))
       .outputs(metaitem('plateDenseIce') * 9)
       .duration(200).EUt(7).buildAndRegister()

   // Пыль плотного льда
   mods.gregtech.macerator.recipeBuilder()
       .inputs(item('galacticraftplanets:dense_ice'))
       .outputs(metaitem('dustDenseIce') * 9)
       .duration(300).EUt(2).buildAndRegister()

   // Плотная пластина плотного льда
   mods.gregtech.bender.recipeBuilder()
      .circuitMeta(9)
      .inputs(metaitem('plateDenseIce') * 9)
      .outputs(metaitem('plateDenseDenseIce'))
      .duration(100).EUt(48).buildAndRegister()
}