import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

   // --- Массивы

   def rover = [
      item('extraplanets:venus_rover'),
      item('extraplanets:venus_rover:1'),
      item('extraplanets:venus_rover:2'),
      item('extraplanets:venus_rover:3')
   ]
   def crate = [
      metaitem('plateSteel'),
      metaitem('crate.aluminium'),
      metaitem('crate.stainless_steel'),
      metaitem('crate.titanium')
   ]

   // --- Добавление рецептов

   for (int i = 0; i < rover.size(); i++) {
   // Ровер
   mods.gregtech.assembly_line.recipeBuilder()
      .inputs(item('extraplanets:electric_parts:3') * 4)
      .inputs(item('galacticraftcore:buggymat:1'))
      .inputs(item('galacticraftplanets:item_basic_asteroids:5') * 14)
      .inputs(item('extraplanets:electric_parts:1') * 2)
      .inputs(metaitem('screwStainlessSteel') * 8)
      .inputs(metaitem('stickStainlessSteel') * 4)
      .inputs(metaitem('electric.motor.luv') * 4)
      .inputs(item('tfg:meta_item', 55))
      .inputs(item('extraplanets:schematic_venus_rover'))
      .inputs(crate[i] * 2)
      .fluidInputs(fluid('tungsten_steel') * 4608)
      .fluidInputs(fluid('titanium') * 4608)
      .outputs(rover[i])
      .duration(1200).EUt(4096).buildAndRegister()
   }

   // Ракетный компьютер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(
         item('opencomputers:case1'),
         item('gregtech:meta_item_1', 372),
         ore('circuitLuv'),
         metaitem('emitter.iv'),
         metaitem('sensor.iv'),
         item('galacticraftplanets:item_basic_asteroids:5'))
      .fluidInputs(fluid('soldering_alloy') * 1152)
      .outputs(item('tfg:meta_item', 55))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(600).EUt(4096).buildAndRegister()

   // Колесо
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         metaitem('plateDenseTungstenSteel') * 2, 
         metaitem('stickPolytetrafluoroethylene') * 8)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 544)
      .outputs(item('extraplanets:electric_parts:3'))
      .duration(200).EUt(1340).buildAndRegister()

   // Батарея
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
         ore('batteryLuv') * 3, 
         item('galacticraftplanets:item_basic_mars:3') * 3)
      .outputs(item('extraplanets:electric_parts:1'))
      .duration(200).EUt(12680).buildAndRegister()

   // Схема
   mods.gregtech.laser_engraver.recipeBuilder()
       .inputs(item('tfg:meta_item', 46))
      .notConsumable(metaitem('glass_lens.purple'))
       .outputs(item('extraplanets:schematic_venus_rover'))
      .cleanroom(CleanroomType.CLEANROOM)
       .duration(9000).EUt(4096).buildAndRegister()
}