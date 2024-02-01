import gregtech.api.metatileentity.multiblock.CleanroomType

if (isLoaded("galacticraftcore")) {
   
   // --- Массивы
   
   def rocket = [
      item('galacticraftplanets:rocket_t2:11'),
      item('galacticraftplanets:rocket_t2:12'),
      item('galacticraftplanets:rocket_t2:13')
   ]
   def crate = [
      metaitem('crate.aluminium'),
      metaitem('crate.stainless_steel'),
      metaitem('crate.titanium')
   ]
   
   // --- Добавление рецептов
   
   for (int i = 0; i < rocket.size(); i++)  {
   // Ракета
   mods.gregtech.assembly_line.recipeBuilder()
      .inputs(item('galacticraftcore:nose_cone'))
      .inputs(item('tfg:meta_item', 14) * 8)
      .inputs(item('galacticraftcore:rocket_fins') * 4)
      .inputs(item('galacticraftcore:engine'))
      .inputs(item('galacticraftcore:oil_canister_partial:1001') * 3)
      .inputs(item('galacticraftplanets:schematic:1'))
      .inputs(item('tfg:meta_item', 56))
      .inputs(crate[i] * 3)
      .fluidInputs(fluid('black_steel') * 9216)
      .fluidInputs(fluid('aluminium') * 4608)
      .fluidInputs(fluid('bronze') * 4608)
      .outputs(rocket[i])
      .duration(1200).EUt(1920).buildAndRegister()
   }
   // Ракетный компьютер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
         item('opencomputers:case1'),
         item('gregtech:meta_item_1', 372),
         ore('circuitIv'),
         metaitem('emitter.ev'),
         metaitem('sensor.ev'),
         item('galacticraftplanets:item_basic_mars:3'))
      .fluidInputs(fluid('soldering_alloy') * 864)
      .outputs(item('tfg:meta_item', 56))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(600).EUt(1920).buildAndRegister()
   
   // Схема
   mods.gregtech.laser_engraver.recipeBuilder()
       .inputs(item('tfg:meta_item', 46))
      .notConsumable(metaitem('glass_lens.green'))
       .outputs(item('galacticraftplanets:schematic:1'))
      .cleanroom(CleanroomType.CLEANROOM)
       .duration(9000).EUt(1920).buildAndRegister()
}