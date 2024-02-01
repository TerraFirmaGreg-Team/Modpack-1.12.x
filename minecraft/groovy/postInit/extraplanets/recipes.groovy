import gregtech.api.metatileentity.multiblock.CleanroomType
import classes.array.Minecraft
import classes.array.Galacticraft


if (isLoaded("extraplanets")) {

   // --- Добавление рецептов
   
   // item('extraplanets:thermal_cloth').maxStackSize = 64
   // item('extraplanets:thermal_cloth:1').maxStackSize = 64
   // item('extraplanets:thermal_cloth:2').maxStackSize = 64
   
   
   // Кислородные баллоны
   // Обесцвечивание
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.light.colors'))
         .fluidInputs(fluid('chlorine') * 144)
         .outputs(item('extraplanets:oxygen_tank_light_full_white'))
         .duration(8).EUt(480).buildAndRegister()
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.med.colors'))
         .fluidInputs(fluid('chlorine') * 144)
         .outputs(item('extraplanets:oxygen_tank_med_full_white'))
         .duration(8).EUt(480).buildAndRegister()
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.heavy.colors'))
         .fluidInputs(fluid('chlorine') * 144)
         .outputs(item('extraplanets:oxygen_tank_heavy_full_white'))
         .duration(8).EUt(480).buildAndRegister()
   // Окрашивание
   for (int i = 0; i < 16; i++) {
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.light'))
         .fluidInputs(Minecraft.colorLiquid[i] * 18)
         .outputs(Galacticraft.oxygenTankLight[i])
         .duration(20).EUt(7).buildAndRegister()
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.med'))
         .fluidInputs(Minecraft.colorLiquid[i] * 18)
         .outputs(Galacticraft.oxygenTankMed[i])
         .duration(20).EUt(7).buildAndRegister()
      mods.gregtech.chemical_bath.recipeBuilder()
         .inputs(ore('gc.oxygen.tank.heavy'))
         .fluidInputs(Minecraft.colorLiquid[i] * 18)
         .outputs(Galacticraft.oxygenTankHeavy[i])
         .duration(20).EUt(7).buildAndRegister()
   }
   
   // Легкий
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('galacticraftcore:canister') * 2, 
         metaitem('plateDenseCopper') * 2,
         metaitem('electric.pump.lv') * 2)
      .outputs(item('extraplanets:oxygen_tank_light_full_white'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(128).buildAndRegister()
   // Средний
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('galacticraftcore:canister') * 4, 
         metaitem('plateDenseTin') * 4, 
         metaitem('electric.pump.mv') * 2)
      .outputs(item('extraplanets:oxygen_tank_med_full_white'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(512).buildAndRegister()
   // Тяжелый
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('galacticraftcore:canister') * 6, 
         metaitem('plateDenseSteel') * 6, 
         metaitem('electric.pump.hv') * 2)
      .outputs(item('extraplanets:oxygen_tank_heavy_full_white'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(2048).buildAndRegister()
   
   // Очень тяжелый
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         ore('gc.oxygen.tank.heavy') * 3, 
         metaitem('platePalladium') * 3, 
         metaitem('electric.pump.ev') * 2)
      .outputs(item('extraplanets:oxygen_tank_very_heavy_full'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(8192).buildAndRegister()
   // Экстремально тяжелый
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('extraplanets:oxygen_tank_very_heavy_full') * 3, 
         metaitem('plateZinc') * 3, 
         metaitem('electric.pump.iv') * 2)
      .outputs(item('extraplanets:oxygen_tank_extremely_heavy_full'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(32768).buildAndRegister()
   
   // Взлетная площадка 2 Tiers
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('galacticraftcore:landing_pad') * 3, 
         metaitem('plateDenseTitanium') * 6)
      .outputs(item('extraplanets:advanced_launch_pad') * 5)
      .duration(300).EUt(1000).buildAndRegister()
   
   // Взлетная площадка 3 Tiers
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('extraplanets:advanced_launch_pad') * 3, 
         metaitem('plateDenseTungstenSteel') * 18, 
         metaitem('plateLead') * 2)
      .outputs(item('extraplanets:advanced_launch_pad:1') * 5)
      .duration(1000).EUt(5208).buildAndRegister()
   
   // Взлетная площадка электрической ракеты
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('extraplanets:advanced_launch_pad:1') * 3, 
         metaitem('plateDensePlatinum') * 9, 
         metaitem('plateLead') * 2, 
         metaitem('electric.pump.lv') * 2)
      .outputs(item('extraplanets:advanced_launch_pad:3') * 5)
      .duration(1000).EUt(30038).buildAndRegister()
   
   // Площадка для роверов
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(6)
      .inputs(
         item('galacticraftplanets:mars:8') * 3, 
         metaitem('plateDenseDesh') * 3)
      .outputs(item('extraplanets:advanced_launch_pad:2') * 5)
      .duration(1000).EUt(5208).buildAndRegister()
   
   // Гравитационный контроллер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
         metaitem('plateDenseMeteoricIron') * 9, 
         ore('batteryLuv') * 8,
         ore('circuitLuv') * 8)
      .outputs(item('extraplanets:gravity_controller'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(31123).buildAndRegister()
   
   // Кислородный контроллер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
         metaitem('plateDenseDesh') * 9, 
         ore('batteryLuv') * 4,
         ore('circuitLuv') * 8,
         ore('gc.oxygen.tank.heavy'))
      .outputs(item('extraplanets:module_items:1'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(31123).buildAndRegister()
   
   // Космический контроллер
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(
         metaitem('plateDenseTitanium') * 9, 
         ore('batteryLuv') * 4,
         ore('circuitLuv') * 8,
         item('galacticraftcore:oxygen_gear'))
      .outputs(item('extraplanets:module_items:2'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(31123).buildAndRegister()
   
   // Модуль отсутствия повреждения при падении
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs( 
         item('extraplanets:tier2_un_prepared_space_suit_boots') * 4,
         item('extraplanets:gravity_controller'),
         item('extraplanets:module_items:2'))
      .outputs(item('extraplanets:module_items'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(1000).EUt(31123).buildAndRegister()
   
   // Прочная ткань
   mods.gregtech.implosion_compressor.recipeBuilder()
   	.inputs(metaitem('platePolycaprolactam') * 4)
   	.outputs(item('extraplanets:cloth'))
      .explosivesAmount(2)
   	.duration(20).EUt(380).buildAndRegister()
   
   // Защитные пластины
   // T1
   mods.gregtech.implosion_compressor.recipeBuilder()
   	.inputs(metaitem('plateDenseTitanium') * 4)
   	.outputs(item('extraplanets:tier1_armor_layer'))
   	.explosivesAmount(6)
   	.duration(20).EUt(2280).buildAndRegister()
   // T2
   mods.gregtech.implosion_compressor.recipeBuilder()
   	.inputs(metaitem('plateDenseTungstenSteel') * 6)
   	.outputs(item('extraplanets:tier2_armor_layer'))
   	.explosivesAmount(8)
   	.duration(20).EUt(8680).buildAndRegister()
   // T3
   mods.gregtech.implosion_compressor.recipeBuilder()
   	.inputs(metaitem('plateDenseRhodiumPlatedPalladium') * 12)
   	.outputs(item('extraplanets:tier3_armor_layer'))
   	.explosivesAmount(10)
   	.duration(20).EUt(38480).buildAndRegister()
   // T4
   mods.gregtech.implosion_compressor.recipeBuilder()
   	.inputs(metaitem('plateDenseNaquadahAlloy') * 24)
   	.outputs(item('extraplanets:tier4_armor_layer'))
   	.explosivesAmount(12)
   	.duration(20).EUt(139480).buildAndRegister()
   
   // Антирадиоционные пластины
   // T1
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(11)
      .inputs(
         metaitem('plateDoubleTungsten') * 6, 
         item('extraplanets:cloth') * 4)
      .outputs(item('extraplanets:tier1_radiation_layer'))
      .duration(1000).EUt(2280).buildAndRegister()
   // T2
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(12)
      .inputs(
         metaitem('plateDoubleTungsten') * 6, 
         item('extraplanets:cloth') * 4, 
         item('extraplanets:tier1_radiation_layer'))
      .outputs(item('extraplanets:tier2_radiation_layer'))
      .duration(1000).EUt(8680).buildAndRegister()
   // T3
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(13)
      .inputs(
         metaitem('plateDoubleTungsten') * 6, 
         item('extraplanets:cloth') * 4, 
         item('extraplanets:tier2_radiation_layer'))
      .outputs(item('extraplanets:tier3_radiation_layer'))
      .duration(1000).EUt(38480).buildAndRegister()
   // T4
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(14)
      .inputs(
         metaitem('plateDoubleTungsten') * 6, 
         item('extraplanets:cloth') * 4, 
         item('extraplanets:tier3_radiation_layer'))
      .outputs(item('extraplanets:tier4_radiation_layer'))
      .duration(1000).EUt(139480).buildAndRegister()
   
   // Пластины давления
   // T1
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(11)
      .inputs(
         item('galacticraftcore:oxygen_concentrator') * 4, 
         item('extraplanets:cloth') * 4)
      .outputs(item('extraplanets:tier1_pressure_layer'))
      .duration(1000).EUt(2280).buildAndRegister()
   // T2
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(12)
      .inputs(
         item('galacticraftcore:oxygen_concentrator') * 6, 
         item('extraplanets:cloth') * 8, 
         item('extraplanets:tier1_pressure_layer'))
      .outputs(item('extraplanets:tier2_pressure_layer'))
      .duration(1000).EUt(8680).buildAndRegister()
   // T3
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(13)
      .inputs(
         item('galacticraftcore:oxygen_concentrator') * 8, 
         item('extraplanets:cloth') * 16, 
         item('extraplanets:tier2_pressure_layer'))
      .outputs(item('extraplanets:tier3_pressure_layer'))
      .duration(1000).EUt(38480).buildAndRegister()
   // T4
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(14)
      .inputs(
         item('galacticraftcore:oxygen_concentrator') * 10, 
         item('extraplanets:cloth') * 32, 
         item('extraplanets:tier3_pressure_layer'))
      .outputs(item('extraplanets:tier4_pressure_layer'))
      .duration(1000).EUt(139480).buildAndRegister()
   
   // Теплоизолирующая ткань
   // T1
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(11)
      .inputs(
         item('extraplanets:cloth') * 6, 
         metaitem('wireFineBorosilicateGlass') * 3)
      .outputs(item('galacticraftplanets:item_basic_asteroids:7'))
      .duration(100).EUt(1024).buildAndRegister()
   // T2
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(12)
      .inputs(
         item('extraplanets:cloth') * 12, 
         metaitem('wireFineLead') * 3)
      .outputs(item('galacticraftplanets:basic_item_venus:3'))
      .duration(100).EUt(4096).buildAndRegister()
   // T3
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(13)
      .inputs(
         item('extraplanets:cloth') * 18, 
         metaitem('wireFineAluminium') * 3)
      .outputs(item('extraplanets:thermal_cloth'))
      .duration(100).EUt(16384).buildAndRegister()
   // T4
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(14)
      .inputs(
         item('extraplanets:cloth') * 24, 
         metaitem('wireFineIndiumTinBariumTitaniumCuprate') * 3)
      .outputs(item('extraplanets:thermal_cloth:1'))
      .duration(100).EUt(65536).buildAndRegister()
   // T5
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(15)
      .inputs(
         item('extraplanets:cloth') * 28, 
         metaitem('plateDenseCarbon'), 
         metaitem('foilIndiumTinBariumTitaniumCuprate') * 3)
      .outputs(item('extraplanets:thermal_cloth:2'))
      .duration(100).EUt(262144).buildAndRegister()
   
   // Заготовки под скафандры
   // Шлем
   for (int i = 0; i < Galacticraft.materialSpace.size(); i++) {
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(15)
      .inputs(Galacticraft.materialSpace[i] * 5)
      .outputs(Galacticraft.unSpaceSuitHelmet[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Нагрудник
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(16)
      .inputs(Galacticraft.materialSpace[i] * 8)
      .outputs(Galacticraft.unSpaceSuitChest[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Штаны
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(17)
      .inputs(Galacticraft.materialSpace[i] * 7)
      .outputs(Galacticraft.unSpaceSuitLegings[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Ботинки
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(18)
      .inputs(Galacticraft.materialSpace[i] * 4)
      .outputs(Galacticraft.unSpaceSuitBoots[i])
      .duration(500).EUt(2000).buildAndRegister()
   }
   // Скафандры
   // Шлем
   for (int i = 0; i < Galacticraft.armorLayer.size(); i++) {
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(15)
      .inputs(Galacticraft.armorLayer[i] * 2)
      .inputs(Galacticraft.radiationLayer[i] * 3)
      .inputs(Galacticraft.pressureLayer[i] * 3)
      .inputs(Galacticraft.unSpaceSuitHelmet[i])
      .outputs(Galacticraft.spaceSuitHelmet[i])
      .duration(1000).EUt(8002).buildAndRegister()
   // Нагрудник
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(16)
      .inputs(Galacticraft.armorLayer[i] * 2)
      .inputs(Galacticraft.radiationLayer[i] * 3)
      .inputs(Galacticraft.pressureLayer[i] * 3)
      .inputs(Galacticraft.unSpaceSuitChest[i])
      .outputs(Galacticraft.spaceSuitChest[i])
      .duration(1000).EUt(8002).buildAndRegister()
   // Штаны
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(17)
      .inputs(Galacticraft.armorLayer[i] * 2)
      .inputs(Galacticraft.radiationLayer[i] * 3)
      .inputs(Galacticraft.pressureLayer[i] * 3)
      .inputs(Galacticraft.unSpaceSuitLegings[i])
      .outputs(Galacticraft.spaceSuitLegings[i])
      .duration(1000).EUt(8002).buildAndRegister()
   // Ботинки
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(18)
      .inputs(Galacticraft.armorLayer[i] * 2)
      .inputs(Galacticraft.radiationLayer[i] * 3)
      .inputs(Galacticraft.pressureLayer[i] * 3)
      .inputs(Galacticraft.unSpaceSuitBoots[i])
      .outputs(Galacticraft.spaceSuitBoots[i])
      .duration(1000).EUt(8002).buildAndRegister()
   }
   for (int i = 0; i < Galacticraft.armorLayer.size(); i++) {
      mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(19)
      .inputs(Galacticraft.materialEngine[i] * 2)
      .inputs(ore('batteryLuv') * 3)
      .inputs(Galacticraft.spaceSuitChest[i])
      .outputs(Galacticraft.spaceSuitChestJet[i])
      .duration(1000).EUt(8002).buildAndRegister()
   }
   
   //  Теплоустойчивая броня
   // Шлем
   for (int i = 0; i < Galacticraft.armorLayer.size(); i++) {
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(15)
      .inputs(Galacticraft.thermalCloth[i] * 5)
      .inputs(Galacticraft.materialThermal[i] * 2)
      .outputs(Galacticraft.thermalPaddingHelmet[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Нагрудник
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(16)
      .inputs(Galacticraft.thermalCloth[i] * 8)
      .inputs(Galacticraft.materialThermal[i] * 2)
      .outputs(Galacticraft.thermalPaddingChest[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Штаны
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(17)
      .inputs(Galacticraft.thermalCloth[i] * 7)
      .inputs(Galacticraft.materialThermal[i] * 2)
      .outputs(Galacticraft.thermalPaddingLegings[i])
      .duration(500).EUt(2000).buildAndRegister()
   // Ботинки
   mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(18)
      .inputs(Galacticraft.thermalCloth[i] * 4)
      .inputs(Galacticraft.materialThermal[i] * 2)
      .outputs(Galacticraft.thermalPaddingBoots[i])
      .duration(500).EUt(2000).buildAndRegister()
   }

   
   // Гибридная солнечная панель
   crafting.addShaped("tfg/ep/machine/solar_panel/hybrid", item('extraplanets:solar'), [
      [metaitem('cover.solar.panel.luv'), metaitem('cover.solar.panel.luv'), metaitem('cover.solar.panel.luv')],
      [metaitem('gearSmallRhodiumPlatedPalladium'), metaitem('stickRhodiumPlatedPalladium'), metaitem('gearSmallRhodiumPlatedPalladium')],
      [metaitem('electric.piston.luv'), item('galacticraftcore:solar:4'), metaitem('cableGtQuadrupleNaquadah')]])

   // Ultimate солнечная панель
   crafting.addShaped("tfg/ep/machine/solar_panel/ultimate", item('extraplanets:solar:4'), [
      [metaitem('cover.solar.panel.uv'), metaitem('cover.solar.panel.uv'), metaitem('cover.solar.panel.uv')],
      [metaitem('gearSmallDarmstadtium'), metaitem('stickDarmstadtium'), metaitem('gearSmallDarmstadtium')],
      [metaitem('electric.piston.uv'), item('extraplanets:solar'), metaitem('cableGtOctalEuropium')]])

   // Улучшенный загручкик топлива
   crafting.addShaped("tfg/ep/machine/fuel_loader/advanced", item('extraplanets:advanced_fuel_loader'), [
      [metaitem('plateDenseTitanium'), ore('circuitLuv'), metaitem('plateDenseTitanium')],
      [metaitem('drum.stainless_steel'), metaitem('hull.luv'), metaitem('electric.pump.luv')],
      [metaitem('pipeLargeFluidTitanium'), metaitem('pipeLargeFluidTitanium'), metaitem('pipeLargeFluidTitanium')]])

   // Ultimate загручкик топлива
   crafting.addShaped("tfg/ep/machine/fuel_loader/ultimate", item('extraplanets:ultimate_fuel_loader'), [
      [metaitem('plateDenseDarmstadtium'), ore('circuitUv'), metaitem('plateDenseDarmstadtium')],
      [metaitem('drum.stainless_steel'), metaitem('hull.uv'), metaitem('electric.pump.uv')],
      [metaitem('pipeHugeFluidTungstenCarbide'), metaitem('pipeHugeFluidTungstenCarbide'), metaitem('pipeHugeFluidTungstenCarbide')]])

   // Улучшенный кислородный компрессор
   crafting.addShaped("tfg/gc/machine/oxygen_decompressor/advanced", item('extraplanets:advanced_oxygen_compressor:4'), [
      [ore('circuitLuv'), item('galacticraftcore:oxygen_concentrator'), metaitem('electric.pump.luv')],
      [metaitem('pipeSmallFluidTitanium'), metaitem('hull.luv'), metaitem('pipeSmallFluidTitanium')],
      [metaitem('drum.stainless_steel'), metaitem('plateDenseTitanium'), metaitem('electric.pump.luv')]])

   // Ultimate кислородный компрессор
   crafting.addShaped("tfg/gc/machine/oxygen_decompressor/ultimate", item('extraplanets:ultimate_oxygen_compressor:4'), [
      [ore('circuitUv'), item('galacticraftcore:oxygen_concentrator'), metaitem('electric.pump.uv')],
      [metaitem('pipeSmallFluidTungstenCarbide'), metaitem('hull.uv'), metaitem('pipeSmallFluidTungstenCarbide')],
      [metaitem('drum.stainless_steel'), metaitem('plateDenseDarmstadtium'), metaitem('electric.pump.uv')]])

   // Улучшенный кислородный декомпрессор
   crafting.addShaped("tfg/gc/machine/oxygen_compressor/advanced", item('extraplanets:advanced_oxygen_compressor'), [
      [metaitem('electric.pump.hv'), item('galacticraftcore:oxygen_concentrator'), metaitem('drum.stainless_steel')],
      [metaitem('pipeSmallFluidTitanium'), metaitem('hull.luv'), metaitem('pipeSmallFluidTitanium')],
      [metaitem('electric.pump.hv'), metaitem('plateDenseTitanium'), metaitem('compressor.hv')]])

   // Ultimate кислородный декомпрессор
   crafting.addShaped("tfg/gc/machine/oxygen_compressor/ultimate", item('extraplanets:ultimate_oxygen_compressor'), [
      [metaitem('electric.pump.hv'), item('galacticraftcore:oxygen_concentrator'), metaitem('drum.stainless_steel')],
      [metaitem('pipeSmallFluidTungstenCarbide'), metaitem('hull.uv'), metaitem('pipeSmallFluidTungstenCarbide')],
      [metaitem('electric.pump.hv'), metaitem('plateDenseDarmstadtium'), metaitem('compressor.hv')]])


   // Автомобильное зарядное устройство
   crafting.addShaped("tfg/gc/machine/vehicle_charger", item('extraplanets:vehicle_charger'), [
      [metaitem('battery_buffer.iv.4'), ore('batteryIv'), metaitem('battery_buffer.iv.4')],
      [metaitem('plateDenseDesh'), ore('batteryIv'), metaitem('plateDenseDesh')],
      [metaitem('plateDenseDesh'), ore('batteryIv'), metaitem('plateDenseDesh')]])

   // Блок базового обеззараживателя
   mods.gregtech.assembler.recipeBuilder()
      .inputs(
         item('extraplanets:tools:3') * 6,
         item('extraplanets:iodide_salt') * 14,
         ore('batteryLuv') * 3,
         metaitem('plateLapis') * 36,
         item('extraplanets:tier5_items:12') * 6)
      .outputs(item('extraplanets:basic_decontamination_unit'))
      .duration(200).EUt(4080).buildAndRegister()
}