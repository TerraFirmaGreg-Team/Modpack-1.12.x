// MODS_LOADED: appliedenergistics2

import gregtech.api.metatileentity.multiblock.CleanroomType
import classes.array.Minecraft
import classes.array.AppliedEnergistics2
import classes.Function



    // --- Добавление рецептов
    
    // Покраска, обесвечивание кабелей
    // Стеклянные кабеля
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        metaitem('stickAluminium') * 2,
        item('appliedenergistics2:part', 140) * 3)
      .fluidInputs(fluid('fluix') * 144)
      .outputs(item('appliedenergistics2:part', 16) * 6)
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        metaitem('stickAluminium') * 2,
        item('appliedenergistics2:part', 140) * 3,
        metaitem('dustFluix'))
      .outputs(item('appliedenergistics2:part', 16) * 6)
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.chemical_bath.recipeBuilder()
      .inputs(ore('ae2.cable.glass.colors'))
      .fluidInputs(fluid('chlorine') * 144)
      .outputs(item('appliedenergistics2:part', 16))
      .duration(8).EUt(480).buildAndRegister()
    
    for (int i = 0; i < 16; i++)  {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.cable.glass'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.glassCables[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    
    // Закрытый кабель
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 108)
      .outputs(item('appliedenergistics2:part', 36))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('silicone_rubber') * 216)
      .outputs(item('appliedenergistics2:part', 36))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('rubber') * 432)
      .outputs(item('appliedenergistics2:part', 36))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.chemical_bath.recipeBuilder()
      .inputs(ore('ae2.cable.covered.colors'))
      .fluidInputs(fluid('chlorine') * 144)
      .outputs(item('appliedenergistics2:part', 36))
      .duration(8).EUt(480).buildAndRegister()
    for (int i = 0; i < 16; i++)  {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.cable.covered'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.coveredCables[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    
    // Умный кабель
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 36))
      .outputs(item('appliedenergistics2:part:56'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 108)
      .outputs(item('appliedenergistics2:part:56'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('silicone_rubber') * 216)
      .outputs(item('appliedenergistics2:part:56'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 3)
      .fluidInputs(fluid('rubber') * 432)
      .outputs(item('appliedenergistics2:part:56'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.chemical_bath.recipeBuilder()
      .inputs(ore('ae2.cable.smart.colors'))
      .fluidInputs(fluid('chlorine') * 144)
      .outputs(item('appliedenergistics2:part:56'))
      .duration(8).EUt(480).buildAndRegister()
    for (int i = 0; i < 16; i++) {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.cable.smart'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.smartCables[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    
    // Плотный закрытый кабель
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(item('appliedenergistics2:part', 36) * 4)
      .outputs(item('appliedenergistics2:part:516'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 432)
      .outputs(item('appliedenergistics2:part:516'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('silicone_rubber') * 864)
      .outputs(item('appliedenergistics2:part:516'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('rubber') * 1728)
      .outputs(item('appliedenergistics2:part:516'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.chemical_bath.recipeBuilder()
      .inputs(ore('ae2.cable.dense.covered.colors'))
      .fluidInputs(fluid('chlorine') * 144)
      .outputs(item('appliedenergistics2:part:516'))
      .duration(8).EUt(480).buildAndRegister()
    for (int i = 0; i < 16; i++) {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.cable.dense.covered'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.denseCoveredCables[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    
    // Плотный умный кабель
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(item('appliedenergistics2:part:56') * 4)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part:516'))
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 36) * 4)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('styrene_butadiene_rubber') * 432)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('silicone_rubber') * 864)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(4)
      .inputs(
        item('minecraft:redstone'),
        item('minecraft:glowstone_dust'),
        item('appliedenergistics2:part', 16) * 12)
      .fluidInputs(fluid('rubber') * 1728)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.chemical_bath.recipeBuilder()
      .inputs(ore('ae2.cable.dense.smart.colors'))
      .fluidInputs(fluid('chlorine') * 144)
      .outputs(item('appliedenergistics2:part', 76))
      .duration(8).EUt(480).buildAndRegister()
    for (int i = 0; i < 16; i++) {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.cable.dense.smart'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.denseSmartCables[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    
    // Шарик с краской
    for (int i = 0; i < 16; i++) {
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(item('appliedenergistics2:material', 6))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.paintBalls[i])
        .duration(20).EUt(7).buildAndRegister()
      mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(ore('ae2.paint.ball.colors'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(AppliedEnergistics2.paintBallsLumen[i])
        .duration(20).EUt(7).buildAndRegister()
    }
    for (int i = 0; i < 4; i++) {
      // Предметные ячейки
      // Сбор
      mods.gregtech.packer.recipeBuilder()
        .inputs(
          item('appliedenergistics2:material', 39),
          AppliedEnergistics2.storageComponents[i])
        .outputs(AppliedEnergistics2.storageCells[i])
        .cleanroom(CleanroomType.CLEANROOM )
        .duration(10).EUt(7).buildAndRegister()
      // Разбор
      mods.gregtech.packer.recipeBuilder()
        .inputs(AppliedEnergistics2.storageCells[i])
        .outputs(
          item('appliedenergistics2:material', 39),
          AppliedEnergistics2.storageComponents[i])
        .duration(10).EUt(7).buildAndRegister()
    
      // Жидкостные ячейки
      // Сбор
      mods.gregtech.packer.recipeBuilder()
        .inputs(
          item('tfg:meta_item', 50),
          AppliedEnergistics2.fluidStorageComponents[i])
        .outputs(AppliedEnergistics2.fluidStorageCells[i])
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(10).EUt(7).buildAndRegister()
      // Разбор
      mods.gregtech.packer.recipeBuilder()
        .inputs(AppliedEnergistics2.fluidStorageCells[i])
        .outputs(
          item('tfg:meta_item', 50),
          AppliedEnergistics2.fluidStorageComponents[i])
        .duration(10).EUt(7).buildAndRegister()

    
    // Хранилища крафта
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:crafting_unit'),
        AppliedEnergistics2.storageComponents[i])
      .outputs(AppliedEnergistics2.craftingStorage[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
      .inputs(AppliedEnergistics2.craftingStorage[i])
      .outputs(
        item('appliedenergistics2:crafting_unit'),
        AppliedEnergistics2.storageComponents[i])
      .duration(10).EUt(7).buildAndRegister()
    }
    
    // Сетевой инструмент
    crafting.addShaped("tfg/ae2/network_tool", item('appliedenergistics2:network_tool'), [
      [ore('toolWrench').transform(Function.setToolDamage), ore('circuitLv')],
      [item('appliedenergistics2:material', 23), ore('itemIlluminatedPanel')]])
    
    // Wireless Access Point
    crafting.addShaped(item('appliedenergistics2:wireless_access_point'), [
      [null, item('appliedenergistics2:material', 41), null],
      [null, item('appliedenergistics2:material', 23), null],
      [null, ore('ae2.cable.glass'), null]])
    
    // Беспроводной раздатчик сигнала
    crafting.addShaped("tfg/ae2/wireless_part", item('appliedenergistics2:material', 41), [
      [ore('ae2.cable.glass'), item('appliedenergistics2:material', 9), ore('ae2.cable.glass')],
      [metaitem('sensor.ev'), metaitem('stickTitanium'), metaitem('sensor.ev')],
      [metaitem('plateCertusQuartz'), ore('circuitEv'), metaitem('plateCertusQuartz')]])
    
    // Quartz Fiber
    mods.gregtech.wiremill.recipeBuilder()
      .inputs(ore('stickQuartz'))
      .outputs(item('appliedenergistics2:part', 140))
      .duration(20).EUt(480).buildAndRegister()
    
    // Quartz Glass
    mods.gregtech.alloy_smelter.recipeBuilder()
      .inputs(
        ore('blockGlass') * 4,
        metaitem('dustCertusQuartz') * 5)
      .outputs(item('appliedenergistics2:quartz_glass') * 4)
      .duration(20).EUt(480).buildAndRegister()
    
    // Vibrant Quartz Glass
    mods.gregtech.alloy_smelter.recipeBuilder()
      .inputs(
        item('appliedenergistics2:quartz_glass'),
        item('minecraft:glowstone_dust') * 8)
      .outputs(item('appliedenergistics2:quartz_vibrant_glass'))
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.alloy_smelter.recipeBuilder()
      .inputs(
        item('minecraft:glowstone'),
        metaitem('dustAluminium') * 8)
      .outputs(item('appliedenergistics2:quartz_vibrant_glass'))
      .duration(20).EUt(480).buildAndRegister()
    
    // Pure Fluix Crystal
    mods.gregtech.mixer.recipeBuilder()
      .inputs(metaitem('dustFluix'), ore('sand'))
      .outputs(item('appliedenergistics2:crystal_seed', 1200).withNbt([progress: 1200]) * 2)
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed', 1200).withNbt([progress: 1200]))
      .fluidInputs(fluid('distilled_water') * 144)
      .outputs(item('appliedenergistics2:material', 12))
      .chancedOutput(item('appliedenergistics2:material', 12), 8600, 700)
      .duration(50).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed', 1200).withNbt([progress: 1200]))
         .fluidInputs(fluid('water') * 144)
      .outputs(item('appliedenergistics2:material', 12))
         .chancedOutput(item('appliedenergistics2:material', 12) * 1, 7500, 500)
      .duration(50).EUt(480).buildAndRegister()
    
    // Pure Certus Quartz Crystal
    mods.gregtech.mixer.recipeBuilder()
      .inputs(metaitem('dustCertusQuartz'), ore('sand'))
      .outputs(item('appliedenergistics2:crystal_seed').withNbt([progress: 0]) * 2)
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed').withNbt([progress: 0]))
      .fluidInputs(fluid('distilled_water') * 144)
      .outputs(item('appliedenergistics2:material', 10))
      .chancedOutput(item('appliedenergistics2:material', 10) * 1, 8600, 700)
      .duration(50).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed').withNbt([progress: 0]))
      .fluidInputs(fluid('water') * 144)
      .outputs(item('appliedenergistics2:material', 10))
      .chancedOutput(item('appliedenergistics2:material', 10) * 1, 7500, 500)
      .duration(50).EUt(480).buildAndRegister()
    
    // Pure Nether Quartz Crystal
    mods.gregtech.mixer.recipeBuilder()
      .inputs(metaitem('dustNetherQuartz'), ore('sand'))
      .outputs(item('appliedenergistics2:crystal_seed', 600).withNbt([progress: 600]) * 2)
      .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed', 600).withNbt([progress: 600]))
      .fluidInputs(fluid('distilled_water') * 144)
      .outputs(item('appliedenergistics2:material', 11))
      .chancedOutput(item('appliedenergistics2:material', 11) * 1, 8600, 700)
      .duration(50).EUt(480).buildAndRegister()
    mods.gregtech.autoclave.recipeBuilder()
      .inputs(item('appliedenergistics2:crystal_seed', 600).withNbt([progress: 600]))
      .fluidInputs(fluid('water') * 144)
      .outputs(item('appliedenergistics2:material', 11))
      .chancedOutput(item('appliedenergistics2:material', 11) * 1, 7500, 500)
      .duration(50).EUt(480).buildAndRegister()
    
    // Флакс кристалл 1
    mods.gregtech.mixer.recipeBuilder()
         .inputs(
        item('minecraft:quartz'), 
        item('minecraft:redstone') * 4, 
        item('appliedenergistics2:material', 1))
        .outputs(item('appliedenergistics2:material', 7))
        .duration(40).EUt(18).buildAndRegister()
    
    // Флакс кристалл 2
    mods.gregtech.mixer.recipeBuilder()
        .inputs(
        item('minecraft:quartz'), 
        metaitem('gemExquisiteRuby'), 
        item('appliedenergistics2:material', 1))
         .outputs(item('appliedenergistics2:material', 7) * 4)
        .duration(40).EUt(18).buildAndRegister()
    
    // Флакс кристалл 3
    mods.gregtech.mixer.recipeBuilder()
         .inputs(
        metaitem('gemExquisiteNetherQuartz') * 1, 
        item('minecraft:redstone') * 4, 
        item('appliedenergistics2:material', 1) * 1)
         .outputs(item('appliedenergistics2:material', 7) * 4)
        .duration(40).EUt(18).buildAndRegister()
    
    // Флакс кристалл 4
    mods.gregtech.mixer.recipeBuilder()
        .inputs(
        metaitem('gemExquisiteNetherQuartz'),
        metaitem('gemExquisiteRuby'), 
        item('appliedenergistics2:material', 1))
         .outputs(item('appliedenergistics2:material', 7) * 12)
        .duration(40).EUt(18).buildAndRegister()
    
    // Флакс пыль
    mods.gregtech.macerator.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 7))
      .outputs(metaitem('dustFluix'))
      .duration(30).EUt(2).buildAndRegister()
    
    // Inscriber Silicon Press
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateIron'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('appliedenergistics2:material', 19))
        .duration(12000).EUt(116).buildAndRegister()
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateWroughtIron'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('appliedenergistics2:material', 19))
        .duration(8000).EUt(116).buildAndRegister()
    
    // Inscriber Logic Press
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateIron'))
        .notConsumable(ore('craftingLensGreen'))
        .outputs(item('appliedenergistics2:material', 15))
        .duration(12000).EUt(116).buildAndRegister()
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateWroughtIron'))
        .notConsumable(ore('craftingLensGreen'))
        .outputs(item('appliedenergistics2:material', 15))
        .duration(8000).EUt(118).buildAndRegister()
    
    // Inscriber Engineering Press
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateIron'))
        .notConsumable(ore('lensFluix'))
        .outputs(item('appliedenergistics2:material', 14))
        .duration(12000).EUt(120).buildAndRegister()
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateWroughtIron'))
        .notConsumable(ore('lensFluix'))
        .outputs(item('appliedenergistics2:material', 14))
        .duration(8000).EUt(120).buildAndRegister()
    
    // Inscriber Calulation Press
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateIron'))
         .notConsumable(ore('craftingLensBlue') * 1)
         .outputs(item('appliedenergistics2:material', 13) * 1)
        .duration(12000).EUt(122).buildAndRegister()
    mods.gregtech.laser_engraver.recipeBuilder()
        .inputs(metaitem('plateWroughtIron'))
        .notConsumable(ore('craftingLensBlue'))
        .outputs(item('appliedenergistics2:material', 13))
        .duration(8000).EUt(122).buildAndRegister()
    
    // Printed Silicon
    mods.gregtech.forming_press.recipeBuilder()
      .inputs(metaitem('plateSilicon'))
      .notConsumable(item('appliedenergistics2:material', 19))
      .outputs(item('appliedenergistics2:material', 20))
      .duration(20).EUt(480).buildAndRegister()
    
    // Printed Logic Circuit
    mods.gregtech.forming_press.recipeBuilder()
      .inputs(metaitem('plateGold'))
      .notConsumable(item('appliedenergistics2:material', 15))
      .outputs(item('appliedenergistics2:material:18'))
      .duration(20).EUt(480).buildAndRegister()
    
    // Printed Engineering Circuit
    mods.gregtech.forming_press.recipeBuilder()
      .inputs(metaitem('plateDiamond'))
      .notConsumable(item('appliedenergistics2:material', 14))
      .outputs(item('appliedenergistics2:material:17'))
      .duration(20).EUt(480).buildAndRegister()
    
    // Printed Calulation Circuit
    mods.gregtech.forming_press.recipeBuilder()
      .inputs(metaitem('plateCertusQuartz'))
      .notConsumable(item('appliedenergistics2:material', 13))
      .outputs(item('appliedenergistics2:material', 16))
      .duration(20).EUt(480).buildAndRegister()
    
    // Logic Processor
    mods.gregtech.circuit_assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 20),
        item('appliedenergistics2:material:18'),
        ore('circuitLv'),
        ore('componentResistor'),
        metaitem('wireFineTin') * 2)
        .fluidInputs(fluid('redstone') * 144)
      .outputs(item('appliedenergistics2:material', 22) * 2)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(480).buildAndRegister()
    
    // Engineering Processor
    mods.gregtech.circuit_assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 20),
        item('appliedenergistics2:material:17'),
        ore('circuitLv'),
        ore('componentResistor'),
        metaitem('wireFineTin') * 2)
        .fluidInputs(fluid('redstone') * 144)
      .outputs(item('appliedenergistics2:material', 24) * 2)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(480).buildAndRegister()
    
    // Calulation Processor
    mods.gregtech.circuit_assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 20),
        item('appliedenergistics2:material', 16),
        ore('circuitLv'),
        ore('componentResistor'),
        metaitem('wireFineTin') * 2)
        .fluidInputs(fluid('redstone') * 144)
      .outputs(item('appliedenergistics2:material', 23) * 2)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(480).buildAndRegister()
    
    // Charged Certus Quartz
    mods.gregtech.electrolyzer.recipeBuilder()
        .inputs(metaitem('gemCertusQuartz'))
        .outputs(item('appliedenergistics2:material', 1))
        .duration(520).EUt(82).buildAndRegister()
    
    // Charged Certus Quartz dust
    mods.gregtech.macerator.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 1))
      .outputs(metaitem('dustChargedCertusQuartz'))
      .duration(30).EUt(2).buildAndRegister()
    
    // Blank Pattern
    mods.gregtech.assembler.recipeBuilder()
      .inputs(metaitem('plateSteel') * 3)
      .inputs(metaitem('platePlastic') * 2)
      .inputs(metaitem('wireFineRedAlloy') * 4)
      .inputs(ore('circuitMv'))
      .outputs(item('appliedenergistics2:material', 52))
      .duration(200).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(metaitem('plateSteel') * 3)
      .inputs(metaitem('platePolyvinylChloride') * 2)
      .inputs(metaitem('wireFineRedAlloy') * 4)
      .inputs(ore('circuitMv'))
      .outputs(item('appliedenergistics2:material', 52) * 4)
      .duration(200).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(metaitem('plateSteel') * 3)
      .inputs(metaitem('platePolytetrafluoroethylene') * 2)
      .inputs(metaitem('wireFineRedAlloy') * 4)
      .inputs(ore('circuitMv'))
      .outputs(item('appliedenergistics2:material', 52) * 16)
      .duration(200).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(metaitem('plateSteel') * 3)
      .inputs(metaitem('platePolybenzimidazole') * 2)
      .inputs(metaitem('wireFineRedAlloy') * 4)
      .inputs(ore('circuitMv'))
      .outputs(item('appliedenergistics2:material', 52) * 64)
      .duration(200).EUt(480).buildAndRegister()
    
    // Illuminated Panel
    crafting.addShaped("tfg/ae2/illuminated_panel", item('appliedenergistics2:part:180'), [
        [null, metaitem('plateGlowstone'), null],
        [metaitem('plateAluminium'), metaitem('plateRedAlloy'), item('minecraft:redstone')],
        [null, metaitem('plateGlowstone'), null]])
    
    // Toggle Bus
    crafting.addShaped("tfg/ae2/toggle_bus", item('appliedenergistics2:part', 80), [
      [null, metaitem('plateRedAlloy'), null],
      [ore('ae2.cable.glass'), item('minecraft:lever'), ore('ae2.cable.glass')],
      [null, metaitem('plateRedAlloy'), null]])
    
    // Capacity Card
    crafting.addShaped("tfg/ae2/capacity_card", item('appliedenergistics2:material', 27), [
      [item('appliedenergistics2:material', 25), item('appliedenergistics2:material', 35), null],
      [item('appliedenergistics2:material', 35), metaitem('gemCertusQuartz'), null],
      [null, null, null]])
    
    // Crafting Card
    crafting.addShaped("tfg/ae2/crafting_card", item('appliedenergistics2:material', 53), [
      [item('appliedenergistics2:material', 25), item('appliedenergistics2:material', 35), null],
      [item('appliedenergistics2:material', 35), ore('workbench'), null],
      [null, null, null]])
    
    // Redstone Card
    crafting.addShaped("tfg/ae2/redstone_card", item('appliedenergistics2:material', 26), [
      [item('appliedenergistics2:material', 25), item('minecraft:redstone_torch'), null],
      [item('minecraft:redstone_torch'), item('appliedenergistics2:material', 23), null],
      [null, null, null]])
    
    // Fuzzy Card
    crafting.addShaped("tfg/ae2/fuzzy_card", item('appliedenergistics2:material', 29), [
      [item('appliedenergistics2:material', 28), item('appliedenergistics2:material', 24), null],
        [item('appliedenergistics2:material', 22), item('appliedenergistics2:material', 23), null],
      [null, null, null]])
    
    // Inverter Card
    crafting.addShaped("tfg/ae2/inverter_card", item('appliedenergistics2:material', 31), [
      [item('appliedenergistics2:material', 28), item('appliedenergistics2:part', 100), null],
      [item('appliedenergistics2:part', 100), item('appliedenergistics2:material', 23), null],
      [null, null, null]])
    
    // Acceleration Card
    crafting.addShaped("tfg/ae2/acceleration_card", item('appliedenergistics2:material', 30), [
      [item('appliedenergistics2:material', 28), item('appliedenergistics2:material', 24), null],
      [item('appliedenergistics2:material', 22), ore('crystalFluix'), null],
      [null, null, null]])
    
    // Quartz Fixture
    crafting.addShapeless("tfg/ae2/quartz_fixture", item('appliedenergistics2:quartz_fixture'), 
        [item('appliedenergistics2:material', 1), metaitem('stickAluminium')])
    
    // Light Detecting Fixture
    crafting.addShapeless("tfg/ae2/light_detector", item('appliedenergistics2:light_detector'), 
        [metaitem('gemCertusQuartz'), ore('stickIronAny')])
    
    // Cable Anchor
    mods.gregtech.extruder.recipeBuilder()
      .inputs(metaitem('plateSteel'))
      .notConsumable(metaitem('shape.extruder.bolt'))
      .outputs(item('appliedenergistics2:part', 120) * 8)
      .duration(20).EUt(16).buildAndRegister()
    
    // Annihilation Core
    crafting.addShaped("tfg/ae2/annihilation_core_alt", item('appliedenergistics2:material', 44), [
      [metaitem('stickAluminium'), item('appliedenergistics2:material', 24), metaitem('stickAluminium')],
      [item('appliedenergistics2:material', 24), ore('crystalPureCertusQuartz'), item('appliedenergistics2:material', 24)],
      [metaitem('stickAluminium'), item('appliedenergistics2:material', 24), metaitem('stickAluminium')]])
    
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
            metaitem('stickAluminium') * 2,
            item('appliedenergistics2:material', 24) * 2,
            ore('crystalPureCertusQuartz'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:material', 44) * 4)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(7680).buildAndRegister()
    
    // Formation Core
    crafting.addShaped("tfg/ae2/formation_core_alt", item('appliedenergistics2:material', 43) * 2, [
      [metaitem('stickAluminium'), item('appliedenergistics2:material', 24), metaitem('stickAluminium')],
      [item('appliedenergistics2:material', 24), ore('crystalPureNetherQuartz'), item('appliedenergistics2:material', 24)],
      [metaitem('stickAluminium'), item('appliedenergistics2:material', 24), metaitem('stickAluminium')]])
    
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        metaitem('stickAluminium') * 2,
        item('appliedenergistics2:material', 24) * 2,
        ore('crystalPureNetherQuartz'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:material', 43) * 4)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(7680).buildAndRegister()
    
    // Wireless Terminal
    crafting.addShaped("tfg/ae2/wireless_terminal", item('appliedenergistics2:wireless_terminal', 0), [
      [item('appliedenergistics2:material', 41), item('appliedenergistics2:part:380'), item('appliedenergistics2:material', 41)],
      [item('appliedenergistics2:material', 24), ore('circuitHv'), item('appliedenergistics2:material', 24)],
      [metaitem('plateNetherQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateNetherQuartz')]])
    
    // Wireless Crafting Terminal
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:dense_energy_cell') * 2, 
        item('appliedenergistics2:wireless_terminal') * 1,
        metaitem('sensor.luv') * 2,
        item('appliedenergistics2:part', 360),
        metaitem('emitter.luv'),
        metaitem('stickOsmiridium') * 2)
      .outputs(item('appliedenergistics2:wireless_crafting_terminal', 0))
      .duration(30).EUt(250).buildAndRegister()
    
    // Wireless Pattern Terminal
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:dense_energy_cell') * 2, 
        item('appliedenergistics2:wireless_terminal') * 1,
        metaitem('sensor.luv') * 2,
        item('appliedenergistics2:part', 340),
        metaitem('emitter.luv'),
        metaitem('stickOsmiridium') * 2)
      .outputs(item('appliedenergistics2:wireless_pattern_terminal', 0))
      .duration(30).EUt(250).buildAndRegister()
    
    // Wireless Fluid Terminal
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:dense_energy_cell') * 2, 
        item('appliedenergistics2:wireless_terminal') * 1,
        metaitem('sensor.luv') * 2,
        item('appliedenergistics2:part', 520),
        metaitem('emitter.luv'),
        metaitem('stickOsmiridium') * 2)
      .outputs(item('appliedenergistics2:wireless_fluid_terminal', 0))
      .duration(30).EUt(250).buildAndRegister()
    
    // // Wireless Interface Terminal
    // mods.gregtech.assembler.recipeBuilder()
    //   .inputs(
    //     item('appliedenergistics2:dense_energy_cell') * 2, 
    //     item('appliedenergistics2:wireless_terminal') * 1,
    //     metaitem('sensor.luv') * 2,
    //     item('appliedenergistics2:part:480'),
    //     metaitem('emitter.luv'),
    //     metaitem('stickOsmiridium') * 2)
    //   .outputs(item('appliedenergistics2:wireless_interface_terminal'))
    //   .duration(30).EUt(250).buildAndRegister()
    
    // Magnet Card
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('ingotNeodymiumMagnetic'), 
        metaitem('stickNeodymiumMagnetic') * 4,
        item('appliedenergistics2:part:300'),
        metaitem('plateRedstone'),
        metaitem('plateLapis'),
        item('appliedenergistics2:material', 28))
      .outputs(item('appliedenergistics2:material:60'))
      .duration(30).EUt(250).buildAndRegister()
    
    // Quantum link Card
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('sensor.iv') * 4, 
        item('appliedenergistics2:material', 42) * 4,
        metaitem('sensor.luv') * 2,
        metaitem('cover.digital.wireless'))
      .outputs(item('appliedenergistics2:material', 59))
      .duration(30).EUt(250).buildAndRegister()
    
    // Basic Card
    crafting.addShaped("tfg/ae2/basic_card", item('appliedenergistics2:material', 25) * 2, [
      [metaitem('wireFineRedAlloy'), metaitem('plateAluminium'), null],
      [item('appliedenergistics2:material', 23), ore('circuitMv'), metaitem('plateAluminium')],
      [metaitem('wireFineGold'), metaitem('plateAluminium'), null]])
    
    // Advanced Card
    crafting.addShaped("tfg/ae2/advanced_card", item('appliedenergistics2:material', 28) * 2, [
      [metaitem('wireFineRedAlloy'), metaitem('plateStainlessSteel'), null],
      [item('appliedenergistics2:material', 23), ore('circuitHv'), metaitem('plateStainlessSteel')],
      [metaitem('wireFineSilver'), metaitem('plateStainlessSteel'), null]])
    
    // Pattern Expansion Card
    crafting.addShapeless("tfg/ae2/pattern_expansion_card", item('appliedenergistics2:material', 58), [
      item('appliedenergistics2:material', 28), ore('ae2.interface.item'), 
      ore('ae2.interface.fluid'), item('appliedenergistics2:material', 23)])
    
    // Wireless Booster
    crafting.addShaped("tfg/ae2/wireless_booster", item('appliedenergistics2:material', 42), [
      [metaitem('dustFluix'), metaitem('gemCertusQuartz'), metaitem('plateEnderPearl')],
      [metaitem('plateTitanium'), metaitem('plateTitanium'), metaitem('plateTitanium')],
      [null, null, null]])
    
    // Fluix Pearl
    mods.gregtech.chemical_reactor.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 12) * 4)
      .inputs(item('minecraft:ender_eye'))
      .fluidInputs(fluid('fluix') * 400)
      .outputs(item('appliedenergistics2:material', 9))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(480).buildAndRegister()
    
    // Matter Cannon
    crafting.addShaped("tfg/ae2/matter_cannon", item('appliedenergistics2:matter_cannon'), [
      [metaitem('plateSteel'), metaitem('plateSteel'), item('appliedenergistics2:material', 43)],
      [item('appliedenergistics2:material', 36), item('appliedenergistics2:dense_energy_cell'), null],
      [metaitem('plateSteel'), null, null]])
    
    // Memory Card
    crafting.addShaped("tfg/ae2/network_memory_card", item('appliedenergistics2:memory_card'), [
      [item('appliedenergistics2:material', 23), metaitem('plateIron'), metaitem('plateIron')],
      [metaitem('plateGold'), metaitem('plateRedAlloy'), metaitem('plateGold')],
      [null, null, null]])
    
    // Entropy Manipulator
    crafting.addShaped("tfg/ae2/entropy_manipulator",item('appliedenergistics2:entropy_manipulator'), [
      [null, item('appliedenergistics2:material', 22), item('appliedenergistics2:material', 7)],
      [null, item('appliedenergistics2:energy_cell'), item('appliedenergistics2:material', 24)],
      [metaitem('stickSteel'), null, null]])
    
    // Color Applicator
    crafting.addShaped("tfg/ae2/color_applicator", item('appliedenergistics2:color_applicator'), [
      [metaitem('wireGtSingleAluminium'), item('appliedenergistics2:material', 43), metaitem('wireGtSingleAluminium')],
      [item('appliedenergistics2:material', 36), item('appliedenergistics2:energy_cell'), item('appliedenergistics2:material', 36)],
      [null, metaitem('stickSteel'), null]])
    
    // Biometric Card
    crafting.addShaped("tfg/ae2/biometric_card", item('appliedenergistics2:biometric_card'), [
      [item('appliedenergistics2:material', 24), metaitem('plateIron'), metaitem('plateIron')],
      [metaitem('plateGold'), metaitem('plateRedAlloy'), metaitem('plateGold')],
      [null, null, null]])
    
    // View Cell
    mods.gregtech.canner.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 39))
      .inputs(metaitem('gemCertusQuartz'))
      .outputs(item('appliedenergistics2:view_cell'))
      .duration(100).EUt(4).buildAndRegister()
    
    // ME Storage Housing
    crafting.addShaped("tfg/ae2/me_storage_housing", item('appliedenergistics2:material', 39), [
      [item('appliedenergistics2:quartz_glass'), metaitem('plateSteel'), item('appliedenergistics2:quartz_glass')],
      [metaitem('wireFineRedAlloy'), ore('circuitLv'), metaitem('wireFineRedAlloy')],
      [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')]])
    
    // Recycle - Storage Housing
    mods.gregtech.macerator.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 39))
      .outputs(
        metaitem('dustSteel') * 2,
        metaitem('dustTinySteel') * 2)
      .duration(100).EUt(16).buildAndRegister()
    mods.gregtech.arc_furnace.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 39))
      .fluidInputs(fluid('oxygen') * 56)
      .outputs(
        metaitem('ingotSteel') * 2,
        metaitem('nuggetSteel') * 2)
      .duration(56).EUt(30).buildAndRegister()
    
    // ME Fluid Storage Housing
    crafting.addShaped("tfg/ae2/me_fluid_storage_housing", item('tfg:meta_item', 50), [
      [item('appliedenergistics2:quartz_glass'), metaitem('plateStainlessSteel'), item('appliedenergistics2:quartz_glass')],
      [metaitem('wireFineRedAlloy'), ore('circuitLv'), metaitem('wireFineRedAlloy')],
      [metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel')]])
    
    // Recycle - Fluid Storage Housing
    mods.gregtech.macerator.recipeBuilder()
      .inputs(item('tfg:meta_item', 50))
      .outputs(
        metaitem('dustStainlessSteel') * 2,
        metaitem('dustTinyStainlessSteel') * 2)
      .duration(100).EUt(16).buildAndRegister()
    mods.gregtech.arc_furnace.recipeBuilder()
      .inputs(item('tfg:meta_item', 50))
      .fluidInputs(fluid('oxygen') * 56)
      .outputs(
        metaitem('ingotStainlessSteel') * 2,
        metaitem('nuggetStainlessSteel') * 2)
      .duration(56).EUt(30).buildAndRegister()
    
    // 1k Storage Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('batteryUlv') * 4,
        metaitem('plateWroughtIron') * 4,
        metaitem('dustCertusQuartz') * 4,
        item('appliedenergistics2:material', 22))
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material', 35))
      .duration(200).EUt(480).buildAndRegister()
    // 4k Storage Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitEv') * 4,
        metaitem('plateTitanium') * 4,
        metaitem('dustCertusQuartz') * 4,
        item('appliedenergistics2:material', 22))
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material', 36))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 22),
        ore('circuitEv') * 2,
        item('appliedenergistics2:material', 35) * 4)
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material', 36))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(1920).buildAndRegister()
    // 16k Storage Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitIv') * 4,
        metaitem('plateTungstenSteel') * 4,
        metaitem('dustCertusQuartz') * 8,
        item('appliedenergistics2:material', 24))
      .fluidInputs(fluid('steel') * 144)
      .outputs([item('appliedenergistics2:material:37')])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7680).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 24),
        ore('circuitIv') * 2,
        item('appliedenergistics2:material', 36) * 4)
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material:37'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(7680).buildAndRegister()
    // 64k Storage Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitLuv') * 4,
        metaitem('plateRhodiumPlatedPalladium') * 4,
        metaitem('dustCertusQuartz') * 8,
        item('appliedenergistics2:material', 24))
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material:38'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(30720).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        item('appliedenergistics2:material', 24),
        ore('circuitLuv') * 2,
        item('appliedenergistics2:material:37') * 4)
      .fluidInputs(fluid('steel') * 144)
      .outputs(item('appliedenergistics2:material:38'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(30720).buildAndRegister()
    
    // 1k Fluid Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('batteryUlv') * 4,
        metaitem('plateWroughtIron') * 4,
        metaitem('dustNetherQuartz') * 4,
        item('appliedenergistics2:material', 22))
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:54'))
      .duration(200).EUt(480).buildAndRegister()
    // 4k Fluid Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitEv') * 4,
        metaitem('plateTitanium') * 4,
        metaitem('dustNetherQuartz') * 4,
        item('appliedenergistics2:material', 22))
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:55'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 22),
        ore('circuitEv') * 2,
        item('appliedenergistics2:material:54') * 4)
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:55'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1920).buildAndRegister()
    // 16k Fluid Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitIv') * 4,
        metaitem('plateTungstenSteel') * 4,
        metaitem('dustNetherQuartz') * 8,
        item('appliedenergistics2:material', 24))
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:56'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 24),
        ore('circuitIv') * 2,
        item('appliedenergistics2:material:55') * 4)
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:56'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7680).buildAndRegister()
    // 64k Fluid Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitLuv') * 4,
        metaitem('plateRhodiumPlatedPalladium') * 4,
        metaitem('dustNetherQuartz') * 8,
        item('appliedenergistics2:material', 24))
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:57'))
      .duration(400).EUt(30720).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 24),
        ore('circuitLuv') * 2,
        item('appliedenergistics2:material:56') * 4)
      .fluidInputs(fluid('stainless_steel') * 144)
      .outputs(item('appliedenergistics2:material:57'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(30720).buildAndRegister()
    
    // 2³ Spatial Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitEv') * 4,
        metaitem('plateTitanium') * 4,
        metaitem('dustCertusQuartz') * 32,
        item('appliedenergistics2:material', 23))
      .fluidInputs(fluid('hsla_steel') * 144)
      .outputs([item('appliedenergistics2:material:32')])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1920).buildAndRegister()
    // 16³ Spatial Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitIv') * 4,
        metaitem('plateTungstenSteel') * 4,
        metaitem('dustCertusQuartz') * 32,
        item('appliedenergistics2:material', 23))
      .fluidInputs(fluid('tungsten_steel') * 144)
      .outputs(item('appliedenergistics2:material:33'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7680).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 23),
        ore('circuitLuv') * 4,
        item('appliedenergistics2:material:32') * 4)
      .fluidInputs(fluid('tungsten_steel') * 144)
      .outputs(item('appliedenergistics2:material:33'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(7680).buildAndRegister()
    // 128³ Spatial Component
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('circuitLuv') * 4,
        metaitem('plateRhodiumPlatedPalladium') * 4,
        metaitem('dustCertusQuartz') * 32,
        item('appliedenergistics2:material', 23))
      .fluidInputs(fluid('tungsten_steel') * 144)
      .outputs(item('appliedenergistics2:material:34'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(30720).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 23),
        ore('circuitLuv') * 4,
        item('appliedenergistics2:material:33') * 4)
      .fluidInputs(fluid('tungsten_steel') * 144)
      .outputs(item('appliedenergistics2:material:34'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(400).EUt(30720).buildAndRegister()

    // 2³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 39),
        item('appliedenergistics2:material:32'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
        .outputs(
            item('appliedenergistics2:material', 39),
            item('appliedenergistics2:material:32'))
        .duration(10).EUt(7).buildAndRegister()
    
    // 16³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 39),
        item('appliedenergistics2:material:33'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
        .outputs(
            item('appliedenergistics2:material', 39),
            item('appliedenergistics2:material:33'))
        .duration(10).EUt(7).buildAndRegister()
    
    // 128³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 39),
        item('appliedenergistics2:material:34'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
        .outputs(
            item('appliedenergistics2:material', 39),
            item('appliedenergistics2:material:34'))
        .duration(10).EUt(7).buildAndRegister()
    
    // Crafting Co-Processing Unit
    mods.gregtech.packer.recipeBuilder()
      .inputs(item('appliedenergistics2:crafting_unit'))
      .inputs(item('appliedenergistics2:material', 24))
      .outputs(item('appliedenergistics2:crafting_accelerator'))
      .duration(100).EUt(4).buildAndRegister()
    
    // Монитор хранения
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        ore('itemIlluminatedPanel'),
        item('appliedenergistics2:part', 280))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 400))
      .duration(200).EUt(480).buildAndRegister()
    
    // Монитор преобразования
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 44) * 2,
        item('appliedenergistics2:material', 43) * 2,
        item('appliedenergistics2:part', 400))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 420))
      .duration(200).EUt(480).buildAndRegister()
    
    // Плоскость истребления ID
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:part:300'),
        ore('pearlFluix'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 301))
      .duration(200).EUt(480).buildAndRegister()
    
    // Излучатель уровня
    crafting.addShaped(item('appliedenergistics2:part', 280), [
      [null, metaitem('plateSteel'), null],
      [ore('ae2.cable.glass'), item('minecraft:redstone_torch'), ore('ae2.cable.glass')],
      [null, metaitem('plateSteel'), null]])
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        item('minecraft:redstone_torch'),
        ore('ae2.cable.glass'),
        metaitem('plateSteel'))
      .outputs(item('appliedenergistics2:part', 280))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(7680).buildAndRegister()
    
    // Шина хранения по словарю руд
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        ore('ae2.interface.item'),
        ore('craftingBook'),
        metaitem('electric.piston.mv') * 2)
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 222))
      .duration(200).EUt(480).buildAndRegister()
    
    // Шина хранения
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        ore('ae2.interface.item'),
        metaitem('electric.piston.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 220))
      .duration(200).EUt(480).buildAndRegister()
    
    // Жидкостная шина хранения
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        ore('ae2.interface.fluid'),
        metaitem('electric.pump.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part', 221))
      .duration(200).EUt(480).buildAndRegister()
    
    // Шина импорта
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        ore('plateIronAny'),
        item('appliedenergistics2:material', 44),
        metaitem('robot.arm.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part:240'))
      .duration(200).EUt(480).buildAndRegister()
    
    // Жидкостная шина импорта
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(20)
      .inputs(
        ore('plateIronAny'),
        item('appliedenergistics2:material', 44),
        metaitem('electric.pump.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part:241'))
      .duration(200).EUt(480).buildAndRegister()
    
    // Шина экспорта
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(
        ore('plateIronAny'),
        item('appliedenergistics2:material', 43),
        metaitem('robot.arm.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part:260'))
      .duration(200).EUt(480).buildAndRegister()
    
    // Жидкостная шина экспорта
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(3)
      .inputs(
        ore('plateIronAny'),
        item('appliedenergistics2:material', 43),
        metaitem('electric.pump.mv') * 2,
        ore('ae2.cable.glass'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:part:261'))
      .duration(200).EUt(480).buildAndRegister()
    
    // Crafting Monitor
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:crafting_unit'),
        item('appliedenergistics2:part', 400))
      .outputs(item('appliedenergistics2:crafting_monitor'))
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
      .inputs(item('appliedenergistics2:crafting_monitor'))
      .outputs(
        item('appliedenergistics2:crafting_unit'),
        item('appliedenergistics2:part', 400))
      .duration(10).EUt(7).buildAndRegister()
    
    // CPU Crafting Unit
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        item('appliedenergistics2:material', 22),
        item('appliedenergistics2:material', 24),
        item('appliedenergistics2:material', 23),
        ore('circuitHv'),
        metaitem('plateSteel') * 2)
      .outputs(item('appliedenergistics2:crafting_unit'))
      .duration(20).EUt(680).buildAndRegister()
    
    // Molecular Assembler
    // HV
    mods.gregtech.assembler.recipeBuilder()
      .inputs([
        item('appliedenergistics2:quartz_glass') * 2,
        ore('circuitHv') * 2,
            item('appliedenergistics2:material', 44),
            item('appliedenergistics2:material', 43),
        metaitem('conveyor.module.hv') * 2,
        metaitem('robot.arm.hv') * 2,
        metaitem('plateStainlessSteel') * 4])
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:molecular_assembler'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(480).buildAndRegister()
    // EV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:quartz_glass') * 2,
        ore('circuitHv') * 2,
            item('appliedenergistics2:material', 44),
            item('appliedenergistics2:material', 43),
        metaitem('conveyor.module.ev') * 2,
        metaitem('robot.arm.ev') * 2,
        metaitem('plateTitanium') * 4)
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:molecular_assembler') * 2)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1980).buildAndRegister()
    // IV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:quartz_glass') * 2,
        ore('circuitHv') * 2,
            item('appliedenergistics2:material', 44),
            item('appliedenergistics2:material', 43),
        metaitem('conveyor.module.iv') * 2,
        metaitem('robot.arm.iv') * 2,
        metaitem('plateTungstenSteel') * 4)
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:molecular_assembler') * 8)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7480).buildAndRegister()
    
    // Charged Stuff
    crafting.addShaped("tfg/ae2/charged_staff", item('appliedenergistics2:charged_staff'), [
      [null, ore('toolHammer').transform(Function.setToolDamage), item('appliedenergistics2:material', 1)],
      [null, ore('stickIronAny'), ore('toolFile').transform(Function.setToolDamage)],
      [ore('stickIronAny'), null, null]])
    
    // Датчик жидкостного уровня
    crafting.addShaped(item('appliedenergistics2:part:281'), [
      [null, metaitem('plateStainlessSteel'), null],
      [ore('ae2.cable.glass'), item('minecraft:redstone_torch'), ore('ae2.cable.glass')],
      [null, metaitem('plateStainlessSteel'), null]])
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
        item('minecraft:redstone_torch'),
        ore('ae2.cable.glass'),
        metaitem('plateStainlessSteel'))
      .outputs(item('appliedenergistics2:part:281'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(7680).buildAndRegister()
    
    // Очистка шаблона
    crafting.addShapeless(item('appliedenergistics2:material', 52), [item('appliedenergistics2:encoded_pattern')])
    
    // P2P Tunnel
    crafting.addShaped("tfg/ae2/tunnels_p2p", item('appliedenergistics2:part:460') * 2, [
      [item('appliedenergistics2:material', 24), metaitem('plateAluminium'), item('appliedenergistics2:material', 24)],
      [metaitem('plateAluminium'), item('appliedenergistics2:part:180'), metaitem('plateAluminium')],
      [item('appliedenergistics2:material', 12), item('appliedenergistics2:material', 12), item('appliedenergistics2:material', 12)]])
    
    // P2P Tunnel Fluid
    crafting.addShapeless("tfg/ae2/tunnels_p2p_fluid", item('appliedenergistics2:part:463'), [item('appliedenergistics2:part:460'), item('minecraft:water_bucket')])
    
    // P2P Tunnel Redstone
    crafting.addShapeless("tfg/ae2/tunnels_p2p_redstone", item('appliedenergistics2:part:461'), [item('appliedenergistics2:part:460'), item('minecraft:redstone_torch')])
    
    // P2P Tunnel Light
    crafting.addShapeless("tfg/ae2/tunnels_p2p_light", item('appliedenergistics2:part:467'), [item('appliedenergistics2:part:460'), ore('glowstone')])
    
    // P2P Tunnel Item
    crafting.addShapeless("tfg/ae2/tunnels_p2p_item", item('appliedenergistics2:part:462'), [item('appliedenergistics2:part:460'), metaitem('pipeLargeItemCobalt')])
    
    // P2P Tunnel FE
    crafting.addShapeless("tfg/ae2/tunnels_p2p_fe", item('appliedenergistics2:part:469'), [item('appliedenergistics2:part:460'), metaitem('cableGtQuadrupleCobalt')])
    
    // P2P Tunnel EU
    crafting.addShapeless("tfg/ae2/tunnels_p2p_eu", item('appliedenergistics2:part:470'), [item('appliedenergistics2:part:460'), metaitem('cableGtDoubleCobalt')])
    
    // ME Контроллер
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 24) * 2,
        ore('circuitHv') * 2,
        metaitem('plateTitanium') * 4,
        item('appliedenergistics2:fluix_block'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:controller'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(480).buildAndRegister()
    
    // Energy Cell
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        metaitem('plateCertusQuartz') * 6,
        ore('batteryHv'),
        ore('circuitHv'),
        ore('ae2.cable.covered'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:energy_cell'))
      .duration(200).EUt(500).buildAndRegister()
    
    // Dense Energy Cell
    mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
        item('appliedenergistics2:energy_cell') * 8,
        metaitem('battery_buffer.ev.16'),
        item('appliedenergistics2:material', 43) * 3,
        ore('circuitEv'),
        ore('ae2.cable.dense.covered'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:dense_energy_cell'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(20).EUt(7680).buildAndRegister()
    
    // ME Chest
    crafting.addShaped("tfg/ae2/storage_chest", item('appliedenergistics2:chest'), [
        [metaitem('plateStainlessSteel'), ore('circuitMv'), metaitem('plateStainlessSteel')],
        [ore('ae2.cable.glass'), metaitem('crate.aluminium'), ore('ae2.cable.glass')],
        [metaitem('plateStainlessSteel'), ore('circuitMv'), metaitem('plateStainlessSteel')]])
    
    // ME Drive
    crafting.addShaped("tfg/ae2/storage_drive", item('appliedenergistics2:drive'), [
      [metaitem('plateSteel'), item('appliedenergistics2:material', 24), metaitem('plateSteel')],
      [ore('ae2.cable.glass'), ore('circuitLv'), ore('ae2.cable.glass')],
      [metaitem('plateTitanium'), item('appliedenergistics2:material', 24), metaitem('plateTitanium')]])
    
    // Cutting knife
    crafting.addShaped("tfg/ae2/cutting_knife", item('appliedenergistics2:certus_quartz_cutting_knife'), [
        [null, null, metaitem('stickTreatedWood')],
        [item('minecraft:iron_ingot'), metaitem('stickTreatedWood'), null],
        [metaitem('gemCertusQuartz'), metaitem('gemCertusQuartz'), null]])
    
    // Quantum Ring
    mods.gregtech.assembly_line.recipeBuilder()
      .inputs(ore('batteryHv') * 3)
      .inputs(ore('circuitIv') * 12)
      .inputs(metaitem('emitter.iv') * 16)
        .inputs(item('appliedenergistics2:material', 24) * 8)
      .inputs(metaitem('sensor.iv') * 14)
        .inputs(item('appliedenergistics2:dense_energy_cell'))
        .inputs(item('appliedenergistics2:material', 22))
      .fluidInputs(fluid('titanium') * 1144)
        .outputs(item('appliedenergistics2:quantum_ring'))
      .cleanroom(CleanroomType.CLEANROOM)
        .duration(900).EUt(8300).buildAndRegister()
    
    // Quantum Link Chamber
    mods.gregtech.assembly_line.recipeBuilder()
      .inputs(item('appliedenergistics2:material', 9) * 8)
      .inputs(item('appliedenergistics2:quartz_vibrant_glass') * 6)
        .inputs(item('appliedenergistics2:material', 24) * 8)
      .inputs(metaitem('sensor.iv') * 14)
        .inputs(item('appliedenergistics2:dense_energy_cell'))
      .fluidInputs(fluid('titanium') * 1088)
        .outputs(item('appliedenergistics2:quantum_link'))
      .cleanroom(CleanroomType.CLEANROOM)
        .duration(700).EUt(8300).buildAndRegister()
    
    // Spatial Pylon
    crafting.addShaped("tfg/ae2/spatial_pylon", item('appliedenergistics2:spatial_pylon'), [
      [metaitem('plateGlass'), ore('ae2.cable.glass'), metaitem('plateGlass')],
      [metaitem('dustFluix'), item('appliedenergistics2:material', 7), metaitem('dustFluix')],
      [metaitem('plateGlass'), ore('ae2.cable.glass'), metaitem('plateGlass')]])
    
    // IO Port
    crafting.addShaped("tfg/ae2/io_port", item('appliedenergistics2:io_port'), [
      [metaitem('plateGlass'), metaitem('plateGlass'), metaitem('plateGlass')],
      [item('appliedenergistics2:drive'), ore('ae2.cable.glass'), item('appliedenergistics2:drive')],
      [metaitem('plateTitanium'), item('appliedenergistics2:material', 24), metaitem('plateTitanium')]])
    
    // Spatial IO Port
    crafting.addShaped("tfg/ae2/spatial_io_port",item('appliedenergistics2:spatial_io_port'), [
      [metaitem('plateGlass'), metaitem('plateGlass'), metaitem('plateGlass')],
      [ore('ae2.cable.glass'), item('appliedenergistics2:io_port'), ore('ae2.cable.glass')],
      [metaitem('plateTitanium'), item('appliedenergistics2:material', 24), metaitem('plateTitanium')]])
    
    // Интерфейс
    crafting.addShapeless(item('appliedenergistics2:interface'), [item('appliedenergistics2:part:440')])
    crafting.addShapeless(item('appliedenergistics2:part:440'), [item('appliedenergistics2:interface')])
    // MV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('conveyor.module.mv'),
        metaitem('plateGlass') * 8,
        metaitem('plateSteel') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:interface'))
      .duration(200).EUt(120).buildAndRegister()
    // HV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('conveyor.module.hv'),
        metaitem('plateGlass') * 8,
        metaitem('plateAluminium') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:interface') * 2)
      .duration(200).EUt(480).buildAndRegister()
    // EV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('conveyor.module.ev'),
        metaitem('plateGlass') * 8,
        metaitem('plateStainlessSteel') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:interface') * 4)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1980).buildAndRegister()
    // IV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('conveyor.module.iv'),
        metaitem('plateGlass') * 8,
        metaitem('plateTitanium') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:interface') * 8)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7480).buildAndRegister()
    
    // Жидкостный интерфейс
    crafting.addShapeless(item('appliedenergistics2:fluid_interface'), [item('appliedenergistics2:part:441')])
    crafting.addShapeless(item('appliedenergistics2:part:441'), [item('appliedenergistics2:fluid_interface')])
    // MV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('electric.pump.mv'),
        metaitem('plateGlass') * 8,
        metaitem('plateSteel') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:fluid_interface'))
      .duration(200).EUt(120).buildAndRegister()
    // HV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('electric.pump.hv'),
        metaitem('plateGlass') * 8,
        metaitem('plateAluminium') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:fluid_interface') * 2)
      .duration(200).EUt(480).buildAndRegister()
    // EV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('electric.pump.ev'),
        metaitem('plateGlass') * 8,
        metaitem('plateStainlessSteel') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:fluid_interface') * 4)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(1980).buildAndRegister()
    // IV
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        metaitem('electric.pump.iv'),
        metaitem('plateGlass') * 8,
        metaitem('plateTitanium') * 4,
        item('appliedenergistics2:material', 44),
        item('appliedenergistics2:material', 43))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:fluid_interface') * 8)
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(7480).buildAndRegister()
    
    // Cell Workbench
    crafting.addShaped("tfg/ae2/cell_workbench", item('appliedenergistics2:cell_workbench'), [
      [metaitem('item_filter'), metaitem('cover.screen'), metaitem('fluid_filter')],
      [metaitem('plateAluminium'), item('appliedenergistics2:material', 23), metaitem('plateAluminium')],
      [metaitem('plateAluminium'), metaitem('plateAluminium'), metaitem('plateAluminium')]])
    
    // Matter Condenser
    crafting.addShaped("tfg/ae2/matter_condenser", item('appliedenergistics2:condenser'), [
      [metaitem('plateStainlessSteel'), metaitem('electric.piston.hv'), metaitem('plateStainlessSteel')],
      [metaitem('electric.piston.hv'), ore('circuitHv'), metaitem('electric.piston.hv')],
      [metaitem('plateStainlessSteel'), metaitem('electric.piston.hv'), metaitem('plateStainlessSteel')]])
    
    // Energy Acceptor
    crafting.addShaped("tfg/ae2/energy_acceptor", item('appliedenergistics2:energy_acceptor'), [
      [metaitem('plateSteel'), metaitem('plateStainlessSteel'), metaitem('plateSteel')],
      [metaitem('plateStainlessSteel'), metaitem('voltage_coil.lv'), metaitem('plateStainlessSteel')],
      [metaitem('plateSteel'), metaitem('plateStainlessSteel'), metaitem('plateSteel')]])
    
    // Security Terminal
    crafting.addShaped(item('appliedenergistics2:security_station'), [
      [metaitem('plateSteel'), item('appliedenergistics2:chest'), metaitem('plateSteel')],
      [ore('ae2.cable.glass'), item('appliedenergistics2:material:37'), ore('ae2.cable.glass')],
      [metaitem('plateSteel'), item('appliedenergistics2:material', 22), metaitem('plateSteel')]])
    
    // ME Fluid Formation Plane
    crafting.addShaped("tfg/ae2/planes_formation_fluid", item('appliedenergistics2:part:321'), [
      [metaitem('dustFluix'), metaitem('dustFluix'), metaitem('dustFluix')],
      [item('minecraft:dye:4'), item('minecraft:dye:4'), item('minecraft:dye:4')],
      [metaitem('plateAluminium'), item('appliedenergistics2:material', 43), metaitem('plateAluminium')]])
    
    // ME Fluid Annihilation Plane
    crafting.addShaped("tfg/ae2/planes_annihilation_fluid", item('appliedenergistics2:part:302'), [
      [metaitem('dustFluix'), metaitem('dustFluix'), metaitem('dustFluix')],
      [item('minecraft:dye:4'), item('minecraft:dye:4'), item('minecraft:dye:4')],
      [metaitem('plateAluminium'), item('appliedenergistics2:material', 44), metaitem('plateAluminium')]])
    
    // ME Annihilation Plane
    crafting.addShaped("tfg/ae2/planes_annihilation", item('appliedenergistics2:part:300'), [
      [metaitem('dustFluix'), metaitem('dustFluix'), metaitem('dustFluix')],
      [metaitem('plateAluminium'), item('appliedenergistics2:material', 44), metaitem('plateAluminium')],
      [null, null, null]])
    
    // ME Formation Plane
    crafting.addShaped("tfg/ae2/planes_formation", item('appliedenergistics2:part:320'), [
      [metaitem('dustFluix'), metaitem('dustFluix'), metaitem('dustFluix')],
      [metaitem('plateAluminium'), item('appliedenergistics2:material', 43), metaitem('plateAluminium')],
      [null, null, null]])
    
    // ME Terminal
    crafting.addShaped("tfg/ae2/terminals", item('appliedenergistics2:part:380'), [
      [ore('toolScrewdriver').transform(Function.setToolDamage), ore('itemIlluminatedPanel'), ore('toolMallet').transform(Function.setToolDamage)],
      [metaitem('stickSteel'), ore('circuitHv'), metaitem('stickSteel')],
      [metaitem('plateSteel'),  metaitem('screwSteel'), metaitem('plateSteel')]])
    
    // ME Fluid Terminal
    crafting.addShaped("tfg/ae2/terminals_fluid", item('appliedenergistics2:part:520'), [
      [ore('toolScrewdriver').transform(Function.setToolDamage), ore('itemIlluminatedPanel'), ore('toolMallet').transform(Function.setToolDamage)],
      [metaitem('stickStainlessSteel'), ore('circuitHv'), metaitem('stickStainlessSteel')],
      [metaitem('plateStainlessSteel'),  metaitem('screwStainlessSteel'), metaitem('plateStainlessSteel')]])
    
    // ME Crafting Terminal
    crafting.addShaped("tfg/ae2/terminals_crafting", item('appliedenergistics2:part', 360), [
      [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part:380'), ore('toolMallet').transform(Function.setToolDamage)],
      [metaitem('screwSteel'), ore('workbench'), metaitem('screwSteel')],
      [metaitem('plateSteel'), item('appliedenergistics2:material', 24), metaitem('plateSteel')]])
    
    // ME Interface Terminal
    crafting.addShaped("tfg/ae2/terminals_interface", item('appliedenergistics2:part:480'), [
      [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part:380'), ore('toolMallet').transform(Function.setToolDamage)],
      [metaitem('screwSteel'), ore('ae2.interface.item'), metaitem('screwSteel')],
      [metaitem('plateSteel'), item('appliedenergistics2:material', 24), metaitem('plateSteel')]])
    
    // ME Pattern Terminal
    crafting.addShaped("tfg/ae2/terminals_pattern", item('appliedenergistics2:part', 340), [
        [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part:380'), ore('toolMallet').transform(Function.setToolDamage)],
        [metaitem('screwSteel'), item('appliedenergistics2:material', 52), metaitem('screwSteel')],
        [metaitem('plateSteel'), item('appliedenergistics2:material', 24), metaitem('plateSteel')]])
    
    // ME Extanded Pattern Terminal
    crafting.addShaped("tfg/ae2/terminals_extended_pattern", item('appliedenergistics2:part:341'), [
        [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part', 340), ore('toolMallet').transform(Function.setToolDamage)],
        [metaitem('plateTitanium'), item('appliedenergistics2:material', 52), metaitem('plateTitanium')],
        [metaitem('plateTitanium'), item('appliedenergistics2:material', 24), metaitem('plateTitanium')]])
    
    // МЭ Терминал жидкостной конфигурации интерфейсов
    crafting.addShaped("tfg/ae2/terminals_conf_interface_fluid", item('appliedenergistics2:part:522'), [
        [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part:480'), ore('toolMallet').transform(Function.setToolDamage)],
        [metaitem('stickTitanium'), item('appliedenergistics2:part:520'), metaitem('stickTitanium')],
        [metaitem('plateTitanium'), metaitem('screwTitanium'), metaitem('plateTitanium')]])
    
    // МЭ Терминал конфигурации интерфейсов
    crafting.addShaped("tfg/ae2/terminals_conf_interface", item('appliedenergistics2:part:521'), [
        [ore('toolScrewdriver').transform(Function.setToolDamage), item('appliedenergistics2:part:480'), ore('toolMallet').transform(Function.setToolDamage)],
        [metaitem('stickTitanium'), item('appliedenergistics2:part:380'), metaitem('stickTitanium')],
        [metaitem('plateTitanium'), metaitem('screwTitanium'), metaitem('plateTitanium')]])
    
    // Переносное предметное хранилище
    mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 35),
        item('appliedenergistics2:chest'),
        item('appliedenergistics2:energy_cell'))
      .fluidInputs(fluid('plastic') * 144)
      .outputs(item('appliedenergistics2:portable_cell'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(200).EUt(480).buildAndRegister()
    // Флакс блок
    mods.gregtech.compressor.recipeBuilder()
        .inputs(ore('gemFluix') * 9)
        .outputs(item('appliedenergistics2:fluix_block'))
        .duration(300).EUt(480).buildAndRegister()
    mods.gregtech.compressor.recipeBuilder()
        .inputs(item('appliedenergistics2:material', 12) * 9)
        .outputs(item('appliedenergistics2:fluix_block'))
        .duration(300).EUt(480).buildAndRegister()
    // Флакс линза
    mods.gregtech.lathe.recipeBuilder()
        .inputs(metaitem('plateFluix'))
        .outputs(
            metaitem('lensFluix'),
            metaitem('dustSmallFluix'))
        .duration(1200).EUt(120).buildAndRegister()
    // Флакс жидкость
    mods.gregtech.mixer.recipeBuilder()
        .inputs(
            item('minecraft:redstone'),
            metaitem('dustNetherQuartz'))
        .fluidInputs(fluid('charged_certus_quartz') * 144)
        .fluidOutputs(fluid('fluix') * 144)
        .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.mixer.recipeBuilder()
        .inputs(
            item('minecraft:redstone'),
            metaitem('dustChargedCertusQuartz'))
        .fluidInputs(fluid('nether_quartz') * 144)
        .fluidOutputs(fluid('fluix') * 144)
        .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.mixer.recipeBuilder()
        .inputs(
            metaitem('dustNetherQuartz'),
            metaitem('dustChargedCertusQuartz'))
        .fluidInputs(fluid('redstone') * 144)
        .fluidOutputs(fluid('fluix') * 144)
        .duration(20).EUt(480).buildAndRegister()
    mods.gregtech.extractor.recipeBuilder()
        .inputs(item('appliedenergistics2:material', 12))
        .fluidOutputs(fluid('fluix') * 72)
        .duration(20).EUt(30).buildAndRegister()
    mods.gregtech.extractor.recipeBuilder()
        .inputs(ore('gemFluix'))
        .fluidOutputs(fluid('fluix') * 144)
        .duration(20).EUt(7).buildAndRegister()
    mods.gregtech.extractor.recipeBuilder()
        .inputs(item('appliedenergistics2:fluix_block'))
        .fluidOutputs(fluid('fluix') * 576)
        .duration(80).EUt(30).buildAndRegister()
    
    // Certus Quartz (Override)
    mods.gregtech.extractor.recipeBuilder()
        .inputs(ore('crystalPureCertusQuartz'))
        .fluidOutputs(fluid('certus_quartz') * 72)
        .duration(20).EUt(30).buildAndRegister()
        // Liquid Certus Quartz * 72

    
    // Charged Certus Quartz Crystal
    mods.gregtech.electrolyzer.recipeBuilder()
        .fluidInputs(fluid('certus_quartz') * 144)
        .fluidOutputs(fluid('charged_certus_quartz') * 144)
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.extractor.recipeBuilder()
        .inputs(item('appliedenergistics2:material', 1))
        .fluidOutputs(fluid('charged_certus_quartz') * 144)
        .duration(20).EUt(7).buildAndRegister()