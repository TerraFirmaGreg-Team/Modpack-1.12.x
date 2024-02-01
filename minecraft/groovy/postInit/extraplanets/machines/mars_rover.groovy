import gregtech.api.metatileentity.multiblock.CleanroomType


if (isLoaded("extraplanets")) {

   // --- Массивы

   def rover = [
      item('extraplanets:mars_rover'),
      item('extraplanets:mars_rover:1'),
      item('extraplanets:mars_rover:2'),
      item('extraplanets:mars_rover:3')
   ]
   def crate = [
      metaitem('plateSteel'),
      metaitem('crate.aluminium'),
      metaitem('crate.stainless_steel'),
      metaitem('crate.titanium')
   ]

   // --- Добавление рецептов

   for (int i = 0; i < rover.size(); i++)  {
   // Ровер
   mods.gregtech.assembly_line.recipeBuilder()
      .inputs(item('extraplanets:electric_parts:2') * 6)
      .inputs(item('galacticraftcore:buggymat:1'))
      .inputs(item('galacticraftplanets:item_basic_mars:3') * 13)
      .inputs(item('extraplanets:electric_parts') * 5)
      .inputs(item('galacticraftcore:basic_item:19'))
      .inputs(metaitem('screwStainlessSteel') * 8)
      .inputs(metaitem('stickStainlessSteel') * 4)
      .inputs(metaitem('electric.motor.iv') * 4)
      .inputs(item('tfg:meta_item', 54))
      .inputs(item('extraplanets:schematic_mars_rover'))
      .inputs(crate[i] * 2)
      .fluidInputs(fluid('tungsten_steel') * 4608)
      .fluidInputs(fluid('titanium') * 4608)
      .outputs(rover[i])
      .duration(1200).EUt(1024).buildAndRegister()
   }
   // Ракетный компьютер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
         item('opencomputers:case1'),
         item('gregtech:meta_item_1', 372),
         ore('circuitIv'),
         metaitem('emitter.iv'),
         metaitem('sensor.iv'),
         item('galacticraftplanets:item_basic_mars:3'))
      .fluidInputs(fluid('soldering_alloy') * 864)
      .outputs(item('tfg:meta_item', 54))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(600).EUt(1024).buildAndRegister()

   // Колесо
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         metaitem('plateDenseTitanium') * 2, 
         metaitem('stickPlatinum') * 8)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 544)
      .outputs(item('extraplanets:electric_parts:2'))
      .duration(200).EUt(1340).buildAndRegister()

   // Батарея
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         ore('batteryIv') * 3, 
         item('galacticraftplanets:item_basic_mars:3') * 2)
      .outputs(item('extraplanets:electric_parts'))
      .duration(200).EUt(8180).buildAndRegister()

   // Схема
   mods.gregtech.laser_engraver.recipeBuilder()
       .inputs(item('tfg:meta_item', 46))
      .notConsumable(metaitem('glass_lens.red'))
       .outputs(item('extraplanets:schematic_mars_rover'))
      .cleanroom(CleanroomType.CLEANROOM)
       .duration(9000).EUt(1024).buildAndRegister()
}