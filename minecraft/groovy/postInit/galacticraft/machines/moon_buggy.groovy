import gregtech.api.metatileentity.multiblock.CleanroomType

if (isLoaded("galacticraftcore")) {

   // --- Массивы

   def buggy = [
      item('galacticraftcore:buggy'),
      item('galacticraftcore:buggy:1'),
      item('galacticraftcore:buggy:2'),
      item('galacticraftcore:buggy:3')
   ]
   def crate = [
      metaitem('plateSteel'),
      metaitem('crate.aluminium'),
      metaitem('crate.stainless_steel'),
      metaitem('crate.titanium')
   ]

   // --- Добавление рецептов

   for (int i = 0; i < buggy.size(); i++) {
   // Багги
   mods.gregtech.assembly_line.recipeBuilder()
      .inputs(item('galacticraftcore:buggymat') * 4)
      .inputs(item('galacticraftcore:buggymat:1'))
      .inputs(item('galacticraftcore:heavy_plating') * 10)
      .inputs(metaitem('plateDenseMeteoricIron') * 5)
      .inputs(item('galacticraftcore:basic_item:19'))
      .inputs(metaitem('screwStainlessSteel') * 8)
      .inputs(metaitem('stickStainlessSteel') * 4)
      .inputs(metaitem('electric.motor.ev') * 4)
      .inputs(item('tfg:meta_item', 53))
      .inputs(item('galacticraftcore:schematic'))
      .inputs(crate[i] * 2)
      .fluidInputs(fluid('tungsten_steel') * 4608)
      .fluidInputs(fluid('titanium') * 4608)
      .outputs(buggy[i])
      .duration(1200).EUt(480).buildAndRegister()
   }

   // Ракетный компьютер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         item('opencomputers:case1'),
         item('gregtech:meta_item_1', 372),
         ore('circuitEv'),
         metaitem('emitter.hv'),
         metaitem('sensor.hv'),
         item('galacticraftcore:heavy_plating'))
      .fluidInputs(fluid('soldering_alloy') * 576)
      .outputs(item('tfg:meta_item', 53))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(600).EUt(480).buildAndRegister()

   // Багги сиденье
   crafting.addShaped("tfg/gc/buggy_seat", item('galacticraftcore:buggymat:1'), [
      [metaitem('plateDenseSteel'), null, null],
      [metaitem('plateDenseSteel'), ore('leather'), null],
      [metaitem('plateDenseSteel'), metaitem('plateDenseSteel'), metaitem('plateDenseSteel')]])

   // Колесо
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         metaitem('plateDenseStainlessSteel') * 2, 
         metaitem('stickStainlessSteel') * 8)
      .fluidInputs(fluid('rubber') * 544)
      .outputs(item('galacticraftcore:buggymat'))
      .duration(200).EUt(440).buildAndRegister()

   // Схема
   mods.gregtech.laser_engraver.recipeBuilder()
       .inputs(item('tfg:meta_item', 46))
      .notConsumable(metaitem('glass_lens.black'))
       .outputs(item('galacticraftcore:schematic'))
      .cleanroom(CleanroomType.CLEANROOM)
       .duration(9000).EUt(1024).buildAndRegister()
}