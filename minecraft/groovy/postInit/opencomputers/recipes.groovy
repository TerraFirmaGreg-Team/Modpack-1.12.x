// MODS_LOADED: opencomputers

    // --- Добавление рецептов
    
    // Ink Cartridge
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:7'),
            item('opencomputers:material:6') * 2,
            metaitem('pipeTinyFluidPlastic') * 8,
            metaitem('boltElectrum') * 8)
        .fluidInputs(fluid('plastic') * 36)
        .outputs(item('opencomputers:material:26'))
        .duration(100).EUt(120).buildAndRegister()
    
    // Analyzer
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('tricorder_scanner'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:material:6') * 2,
            metaitem('sensor.mv'))
        .outputs(item('opencomputers:tool'))
        .duration(100).EUt(120).buildAndRegister()
    
    // Battery Upgrade - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            item('opencomputers:capacitor'),
            item('opencomputers:material:6') * 2,
            metaitem('boltRedAlloy') * 4)
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:1'))
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            item('opencomputers:capacitor'),
            item('opencomputers:material:6') * 2,
            metaitem('boltRedAlloy') * 4)
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:upgrade:1'))
        .duration(100).EUt(120).buildAndRegister()
    
    // Battery Upgrade - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:capacitor') * 2,
            ore('componentTransistor') * 2,
            metaitem('boltSilver') * 8)
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:2'))
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:capacitor') * 2,
            ore('componentTransistor') * 2,
            metaitem('boltSilver') * 8)
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:2')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Battery Upgrade - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.extreme'),
            metaitem('plateTungstenSteel') * 2,
            item('opencomputers:capacitor') * 4,
            metaitem('component.advanced_smd.transistor'),
            metaitem('boltElectrum') * 16)
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:3')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            metaitem('plateTungstenSteel') * 2,
            item('opencomputers:capacitor') * 4,
            metaitem('component.advanced_smd.transistor'),
            metaitem('boltElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:3')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Chunkloader Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('circuitEv'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:4'))
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('circuitEv'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:upgrade:4'))
        .duration(100).EUt(120).buildAndRegister()
    
    // Card Container - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:7'))
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:5')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:7'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:5')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Card Container - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateStainlessSteel') * 2,
            ore('chestWood'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:6'))
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateStainlessSteel') * 2,
            ore('chestWood'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:6')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Card Container - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateTitanium') * 2,
            ore('chestWood'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:7'))
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            metaitem('plateTitanium') * 2,
            ore('chestWood'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:7')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Upgrade Container - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:7'))
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:8')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:7'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:upgrade:8'))
        .duration(100).EUt(120).buildAndRegister()
    
    // Upgrade Container - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel') * 2,
            ore('chestWood'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:9')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel') * 2,
            ore('chestWood'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:8')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Upgrade Container - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.extreme'),
            metaitem('plateTitanium') * 2,
            ore('chestWood'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:10'))
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.extreme'),
            metaitem('plateTitanium') * 2,
            ore('chestWood'),
            item('opencomputers:material:9'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:8')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Disassembler
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            ore('oc:materialCU'),
            ore('paneGlass'),
            ore('oc:analyzer'),
            ore('craftingPiston'),
            ore('obsidian') * 2,
            ore('ingotIron') * 2)
        .fluidInputs(fluid('lava') * 144)
        .outputs(item('opencomputers:disassembler'))
        .duration(100).EUt(1920).buildAndRegister()
    
    // Assembler
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            ore('workbench'),
            ore('screwIronAny') * 3,
            ore('craftingPiston') * 2,
            ore('oc:circuitChip2'),
            ore('circuitLv') * 2,
            ore('craftingToolScrewdriver'))
        .outputs(item('opencomputers:assembler'))
        .duration(100).EUt(1920).buildAndRegister()
    
    // Hologram1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            ore('oc:circuitChip2') * 2,
            ore('paneGlass'),
            ore('circuitEv') * 2,
            ore('gemDiamond'),
            ore('obsidian') * 2,
            item('projectred-core:resource_item', 504) * 4)
        .outputs(item('opencomputers:hologram1'))
        .duration(100).EUt(1920).buildAndRegister()
    
    // Hologram2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            ore('oc:circuitChip3') * 2,
            ore('blockGlass'),
            ore('circuitEv') * 2,
            ore('blockDiamond'),
            ore('obsidian'))
        .fluidInputs(fluid('blaze') * 144)
        .outputs(item('opencomputers:hologram2'))
        .duration(100).EUt(2920).buildAndRegister()
    
    // Printer
    crafting.addShaped('tfg/oc/printer', item('opencomputers:printer'), [
            [ore('screwIronAny'), ore('hopper'), ore('screwIronAny')],
            [ore('craftingPiston'), ore('oc:circuitChip3'), ore('craftingPiston')],
            [ore('ingotIron'), ore('circuitLv'), ore('craftingToolScrewdriver')]])
    
    // Netsplitter
    crafting.addShaped('tfg/oc/netsplitter', item('opencomputers:netsplitter'), [
            [ore('screwIronAny'), metaitem('cableGtSingleIron'), ore('screwIronAny')],
            [metaitem('cableGtSingleIron'), ore('craftingPiston'), metaitem('cableGtSingleIron')],
            [ore('screwIronAny'), ore('circuitLv'), ore('craftingToolScrewdriver')]])
    
    crafting.addShapeless('tfg/oc/carpetedcapacitor', item('opencomputers:carpetedcapacitor'), [ore('carpet'), ore  ('oc:capacitor')])
    
    // Crafting Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8'),
            item('appliedenergistics2:part', 360)
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:11')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8'),
            item('appliedenergistics2:part', 360)
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:11')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Database Upgrade - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:tool'),
            item('opencomputers:storage:2'),
            item('opencomputers:material:8') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:12')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:tool'),
            item('opencomputers:storage:2'),
            item('opencomputers:material:8') * 2
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:12')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Database Upgrade - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            item('opencomputers:tool'),
            item('opencomputers:storage:3'),
            item('opencomputers:material:9') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:13')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            item('opencomputers:tool'),
            item('opencomputers:storage:3'),
            item('opencomputers:material:9') * 2
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:13')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Database Upgrade - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            item('opencomputers:tool'),
            item('opencomputers:storage:4'),
            item('opencomputers:material:10') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:14')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            item('opencomputers:tool'),
            item('opencomputers:storage:4'),
            item('opencomputers:material:10') * 2
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:14')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Experience Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            item('opencomputers:tool'),
            item('opencomputers:material:9'),
            item('minecraft:experience_bottle'))
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:15')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            item('opencomputers:tool'),
            item('opencomputers:material:9'),
            item('minecraft:experience_bottle'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:15')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Hover Upgrade - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            metaitem('rotorSteel') * 4,
            item('opencomputers:material:8') * 2,
            metaitem('electric.motor.mv')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:27')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            metaitem('rotorSteel') * 4,
            item('opencomputers:material:8') * 2,
            metaitem('electric.motor.mv')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:27')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Hover Upgrade - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plateAluminium') * 2,
            metaitem('rotorStainlessSteel') * 4,
            item('opencomputers:material:9') * 2,
            metaitem('electric.motor.hv')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:28')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plateAluminium') * 2,
            metaitem('rotorStainlessSteel') * 4,
            item('opencomputers:material:9') * 2,
            metaitem('electric.motor.hv')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:28')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Inventory Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:8') 
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:17')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            ore('chestWood'),
            item('opencomputers:material:8')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:17')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Inventory Controller Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:upgrade:17'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:18')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:upgrade:17'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:18')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Tank Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('drum.aluminium'),
            item('opencomputers:material:8')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:23')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('drum.aluminium'),
            item('opencomputers:material:8')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:23')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Tank Controller Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:upgrade:23'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:24')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:upgrade:23'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:24')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Leash Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:11'),
            item('minecraft:lead') * 4
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:26')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:11'),
            item('minecraft:lead') * 4
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:26')])
        .duration(100).EUt(120).buildAndRegister()
    
    // MFU
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:adapter'),
            item('opencomputers:card:9') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:30')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:adapter'),
            item('opencomputers:card:9') * 2,
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:30')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Navigation Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            item('opencomputers:material:9') * 2,
            item('minecraft:map')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:19')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            item('opencomputers:material:9') * 2,
            item('minecraft:map')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:19')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Piston Upgrade
    crafting.addShapeless(item('opencomputers:upgrade:20'), [item('opencomputers:upgrade:33')])
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('drum.aluminium'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:20'))
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            metaitem('drum.aluminium'),
            item('opencomputers:material:8'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:20')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Sticky Piston Upgrade
    crafting.addShapeless(item('opencomputers:upgrade:33'), [item('opencomputers:upgrade:20'), metaitem ('rubber_drop')])
    crafting.addShapeless(item('opencomputers:upgrade:33'), [item('opencomputers:upgrade:20'), item ('minecraft:slime_ball')])
    
    // Sign Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            item('minecraft:sign'),
            item('opencomputers:material:8') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:21')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            item('minecraft:sign'),
            item('opencomputers:material:8') * 2
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:21')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Tractor Beam Upgrade
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('item_magnet.hv'),
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:upgrade:25'))
        .duration(100).EUt(480).buildAndRegister()

    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('item_magnet.hv'),
            item('opencomputers:material:9')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:upgrade:25'))
        .duration(100).EUt(480).buildAndRegister()
    
    // Microcontroller Case - Tier 1
        mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs([
            item('gregtech:machine_casing:2'),
            metaitem('circuit_board.plastic'),
            metaitem('plateAluminium') * 2,
            item('opencomputers:material:8') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:material:20')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Microcontroller Case - Tier 2
        mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs([
            item('gregtech:machine_casing:3'),
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:9') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:material:21')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Drone Case - Tier 1
        mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs([
            item('opencomputers:material:20'),
            item('opencomputers:component:4'),
            item('opencomputers:material:8') * 2,
            metaitem('electric.motor.mv') * 4
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:material:23')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Drone Case - Tier 2
        mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs([
            item('opencomputers:material:21'),
            item('opencomputers:component:5'),
            item('opencomputers:material:9') * 2,
            metaitem('electric.motor.hv') * 4
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:material:24')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Arrow Keys
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            ore('buttonStone') * 4,
            ore('circuitLv')
        ])
        .outputs([item('opencomputers:material:15')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Button Group
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            ore('buttonStone') * 6,
            ore('circuitLv')
        ])
        .outputs([item('opencomputers:material:14')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Numeric Keypad
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(3)
        .inputs([
            ore('buttonStone') * 9,
            ore('circuitLv')
        ])
        .outputs([item('opencomputers:material:16')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Keyboard
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(4)
        .inputs([
            item('opencomputers:material', 14) * 4,
            item('opencomputers:material', 15),
            item('opencomputers:material', 16),
            ore('circuitLv'),
            metaitem('plateTinAlloy')
        ])
        .outputs([item('opencomputers:keyboard')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Disk Platter
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('lensGlass'),
            metaitem('foilAluminium') * 4
        ])
        .fluidInputs(fluid('distilled_water') * 36)
        .outputs([item('opencomputers:material:12')])
        .duration(200).EUt(30).buildAndRegister()
    
    // EEPROM
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:7'),
            item('opencomputers:material:6') * 4,
            metaitem('foilElectrum')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:storage')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:7'),
            item('opencomputers:material:6') * 4,
            metaitem('foilElectrum')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:storage')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Floppy Disk
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:12'),
            metaitem('foilPlastic') * 4
        ])
        .outputs([item('opencomputers:storage:1')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Hard Disk Drive - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('plateSteel') * 2,
            item('opencomputers:material:12') * 2,
            item('opencomputers:material:7') * 2,
            item('opencomputers:component:6') * 4
        ])
        .outputs([item('opencomputers:storage:2')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Hard Disk Drive - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('plateAluminium') * 2,
            item('opencomputers:material:12') * 4,
            item('opencomputers:material:8') * 2,
            item('opencomputers:component:8') * 4
        ])
        .outputs([item('opencomputers:storage:3')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Hard Disk Drive - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('plateStainlessSteel') * 2,
            item('opencomputers:material:12') * 8,
            item('opencomputers:material:9') * 2,
            item('opencomputers:component:10') * 4
        ])
        .outputs([item('opencomputers:storage:4')])
        .duration(200).EUt(480).buildAndRegister()
    
    // Central Processing Unit - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:10') * 8,
            item('opencomputers:material:11'),
            ore('circuitLv'),
            metaitem('plateSteel')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:component')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:10') * 8,
            item('opencomputers:material:11'),
            ore('circuitLv'),
            metaitem('plateSteel')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:component')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Central Processing Unit - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 12,
            item('opencomputers:material:11') * 2,
            ore('circuitMv'),
            metaitem('plateAluminium')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:component:1')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 12,
            item('opencomputers:material:11') * 2,
            ore('circuitMv'),
            metaitem('plateAluminium')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:component:1')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Central Processing Unit - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 16,
            item('opencomputers:material:11') * 4,
            ore('circuitHv'),
            metaitem('plateStainlessSteel')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:component:2')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 16,
            item('opencomputers:material:11') * 4,
            ore('circuitHv'),
            metaitem('plateStainlessSteel')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:component:2')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Accelerated Processing Unit - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:10') * 32,
            item('opencomputers:material:11') * 4,
            ore('circuitHv'),
            metaitem('plateStainlessSteel')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:component:16')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:10') * 32,
            item('opencomputers:material:11') * 4,
            ore('circuitHv'),
            metaitem('plateStainlessSteel')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:component:16')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Accelerated Processing Unit - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 64,
            item('opencomputers:material:11') * 8,
            ore('circuitEv'),
            metaitem('plateTitanium')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:component:17')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('opencomputers:material:10') * 64,
            item('opencomputers:material:11') * 8,
            ore('circuitEv'),
            metaitem('plateTitanium')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:component:17')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // ALU
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            metaitem('plate.integrated_logic_circuit') * 8
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:material:10')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            metaitem('plate.integrated_logic_circuit') * 8
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:material:10')])
        .duration(100).EUt(30).buildAndRegister()
    
    // CU
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:6') * 2,
            ore('circuitLv'))
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:material:11')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:6') * 2,
            ore('circuitLv'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:material:11')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Transistor
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            ore('boltIron') * 3,
            item('minecraft:redstone')
        ])
        .outputs([item('opencomputers:material:6')])
        .duration(200).EUt(30).buildAndRegister()
    
    // Card Base
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            ore('circuitLv'),
            metaitem('circuit_board.good'),
            metaitem('foilElectrum')
        ])
        .outputs([item('opencomputers:material:5')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Data Card - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:7'),
            item('opencomputers:material:10') * 4,
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:10')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:7'),
            item('opencomputers:material:10') * 4,
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:10')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Data Card - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:8'),
            item('opencomputers:component'),
            metaitem('boltElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:11')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:8'),
            item('opencomputers:component'),
            metaitem('boltElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:11')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Data Card - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:9'),
            item('opencomputers:component:1'),
            metaitem('boltElectrum') * 32
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:12')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:9'),
            item('opencomputers:component:1'),
            metaitem('boltElectrum') * 32
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:12')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Memory Card - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            metaitem('plate.random_access_memory') * 16,
            item('opencomputers:material:7') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:6')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            metaitem('plate.random_access_memory') * 16,
            item('opencomputers:material:7') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:6')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Memory Card - Tier 1.5
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plate.random_access_memory') * 32,
            item('opencomputers:material:7') * 4,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:7')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            metaitem('plate.random_access_memory') * 16,
            item('opencomputers:material:7') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:7')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Memory Card - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plate.random_access_memory') * 64,
            item('opencomputers:material:8') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:8')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plate.random_access_memory') * 64,
            item('opencomputers:material:8') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:8')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Memory Card - Tier 2.5
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 16,
            item('opencomputers:material:8') * 4,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:9')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.advanced'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 16,
            item('opencomputers:material:8') * 4,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:9')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Memory Card - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1) 
        .inputs([
            metaitem('circuit_board.extreme'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 32,
            item('opencomputers:material:9') * 2,
            metaitem('foilElectrum') * 16
        ]) 
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:10')])
        .duration(100).EUt(1920).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.extreme'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 32,
            item('opencomputers:material:9') * 2,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:10')])
        .duration(100).EUt(1920).buildAndRegister()
    
    // Memory Card - Tier 3.5
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.extreme'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 64,
            item('opencomputers:material:9') * 4,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:11')])
        .duration(100).EUt(7680).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.extreme'),
            metaitem('plate.random_access_memory') * 64,
            metaitem('plate.nand_memory_chip') * 64,
            item('opencomputers:material:9') * 4,
            metaitem('foilElectrum') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:11')])
        .duration(100).EUt(7680).buildAndRegister()
    
    // Graphics Card - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 8,
            item('opencomputers:material:11'),
            item('opencomputers:material:7'),
            item('opencomputers:component:6')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:card:1')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 8,
            item('opencomputers:material:11'),
            item('opencomputers:material:7'),
            item('opencomputers:component:6')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:card:1')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Graphics Card - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 16,
            item('opencomputers:material:11') * 2,
            item('opencomputers:material:8') * 2,
            item('opencomputers:component:8')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:card:2')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 16,
            item('opencomputers:material:11') * 2,
            item('opencomputers:material:8') * 2,
            item('opencomputers:component:8')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:card:2')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Graphics Card - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 32,
            item('opencomputers:material:11') * 4,
            item('opencomputers:material:9') * 4,
            item('opencomputers:component:10')
        ])
        .fluidInputs(fluid('tin') * 288)
        .outputs([item('opencomputers:card:3')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:10') * 32,
            item('opencomputers:material:11') * 4,
            item('opencomputers:material:9') * 4,
            item('opencomputers:component:10')
        ])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs([item('opencomputers:card:3')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Redstone Card - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:7') * 2,
            item('opencomputers:cable') * 2,
            metaitem('plate.integrated_logic_circuit') * 4,
            metaitem('cover.activity.detector')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:4')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:material:5'),
            item('opencomputers:material:7') * 2,
            item('opencomputers:cable') * 2,
            metaitem('plate.integrated_logic_circuit') * 4,
            metaitem('cover.activity.detector'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:card:4'))
        .duration(100).EUt(30).buildAndRegister()
    
    // Redstone Card - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:cable') * 2,
            metaitem('plate.integrated_logic_circuit') * 16,
            metaitem('cover.activity.detector') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:5')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:cable') * 2,
            metaitem('plate.integrated_logic_circuit') * 16,
            metaitem('cover.activity.detector') * 2
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:5')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Network Card
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:cable') * 2,
            item('opencomputers:material:9'),
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:6')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:material:5'),
            item('opencomputers:cable') * 2,
            item('opencomputers:material:9'),
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:6')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Wireless Network Card - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:6'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8'),
            metaitem('emitter.mv'),
            metaitem('sensor.mv')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:upgrade:31')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:6'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8'),
            metaitem('emitter.mv'),
            metaitem('sensor.mv')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:upgrade:31')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Wireless Network Card - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:6'),
            metaitem('circuit_board.advanced'),
            item('opencomputers:material:9'),
            metaitem('emitter.hv'),
            metaitem('sensor.hv')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:7')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:6'),
            metaitem('circuit_board.advanced'),
            item('opencomputers:material:9'),
            metaitem('emitter.hv'),
            metaitem('sensor.hv')
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:7')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Internet Card
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:7'),
            item('opencomputers:material:13'),
            item('opencomputers:material:9'),
            item('projectred-illumination:light_button:14')
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:card:8')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:card:7'),
            item('opencomputers:material:13'),
            item('opencomputers:material:9'),
            item('projectred-illumination:light_button:14'))
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:card:8')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Linked Card
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:card:7'),
            item('opencomputers:material:11') * 2,
            item('opencomputers:material:13')
        ])
        .outputs([item('opencomputers:card:9')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Interweb
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('platePlastic'),
            item('minecraft:string') * 8
        ])
        .fluidInputs(fluid('glue') * 576)
        .outputs([item('opencomputers:material:13')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Component Bus - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            item('opencomputers:material:7') * 2,
            item('opencomputers:material:11'),
            metaitem('boltRedAlloy') * 4
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:3')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.good'),
            item('opencomputers:material:7') * 2,
            item('opencomputers:material:11'),
            metaitem('boltRedAlloy') * 4
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:3')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Component Bus - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:material:11') * 4,
            item('opencomputers:component:8'),
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:4')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:material:11') * 4,
            item('opencomputers:component:8'),
            metaitem('boltElectrum') * 8
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:4')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Component Bus - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            item('opencomputers:material:9') * 2,
            item('opencomputers:material:11') * 8,
            item('opencomputers:component:10'),
            metaitem('boltDiamond') * 16
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:component:5')])
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('circuit_board.advanced'),
            item('opencomputers:material:9') * 2,
            item('opencomputers:material:11') * 8,
            item('opencomputers:component:10'),
            metaitem('boltDiamond') * 16
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:component:5')])
        .duration(100).EUt(480).buildAndRegister()
    
    // Microchip - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.good'),
            ore('circuitLv'),
            item('opencomputers:material:6') * 4,
            metaitem('foilElectrum') * 4
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:material:7')])
        .duration(100).EUt(30).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.good'),
            ore('circuitLv'),
            item('opencomputers:material:6') * 4,
            metaitem('foilElectrum') * 4
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:material:7')])
        .duration(100).EUt(30).buildAndRegister()
    
    // Microchip - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            ore('circuitMv'),
            item('opencomputers:material:6') * 8,
            metaitem('foilElectrum') * 8
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:material:8')])
        .duration(100).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            metaitem('circuit_board.plastic'),
            ore('circuitMv'),
            item('opencomputers:material:6') * 8,
            metaitem('foilElectrum') * 8
        ])
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs([item('opencomputers:material:8')])
        .duration(100).EUt(120).buildAndRegister()
    
    // Microchip - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(
            metaitem('circuit_board.advanced'),
            ore('circuitHv'),
            ore('componentTransistor') * 8,
            metaitem('foilElectrum') * 16)
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:material:9'))
        .duration(100).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(
            metaitem('circuit_board.advanced'),
            ore('circuitHv'),
            ore('componentTransistor') * 8,
            metaitem('foilElectrum') * 16)
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('opencomputers:material:9'))
        .duration(100).EUt(480).buildAndRegister()
    
    // Terminal Server
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.extreme'),
            item('opencomputers:card:7') * 2,
            item('opencomputers:material:8') * 2,
            metaitem('plateObsidian') * 4,
            metaitem('boltElectrum') * 16)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:component:19'))
        .duration(200).EUt(1920).buildAndRegister()
    
    // Server - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.plastic'),
            item('opencomputers:case1'),
            item('opencomputers:material:7') * 2,
            item('opencomputers:material:8'),
            item('opencomputers:component:9'))
        .fluidInputs(fluid('plastic') * 144)
        .outputs(item('opencomputers:component:13'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Server - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.advanced'),
            item('opencomputers:case2'),
            item('opencomputers:material:8') * 2,
            item('opencomputers:material:9'),
            item('opencomputers:component:10'))
        .fluidInputs(fluid('plastic') * 144)
        .outputs(item('opencomputers:component:14'))
        .duration(200).EUt(480).buildAndRegister()
    
    // Server - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('circuit_board.extreme'),
            item('opencomputers:case3'),
            item('opencomputers:material:9') * 2,
            ore('circuitEv'),
            item('opencomputers:component:11'))
        .fluidInputs(fluid('plastic') * 144)
        .outputs(item('opencomputers:component:15'))
        .duration(200).EUt(1920).buildAndRegister()
    
    // Cable
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('cableGtSingleGold'),
            metaitem('dustTinyRedAlloy'))
        .outputs(item('opencomputers:cable'))
        .duration(200).EUt(120).buildAndRegister()
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            metaitem('cableGtSingleGold'),
            metaitem('dustTinyEmerald'))
        .outputs(item('opencomputers:cable'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Adapter
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('gregtech:machine_casing:2'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:cable') * 2,
            item('opencomputers:material:7'))
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:adapter')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Capacitor
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('gregtech:machine_casing:1'),
            metaitem('battery.re.ulv.tantalum') * 8,
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:6'),
            item('opencomputers:cable') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:capacitor')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Charger
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('gregtech:machine_casing:1'),
            item('opencomputers:capacitor'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:9'),
            item('opencomputers:cable') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:charger')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Power Distributor
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('gregtech:machine_casing:3'),
            item('opencomputers:capacitor'),
            metaitem('circuit_board.advanced'),
            metaitem('plateStainlessSteel'),
            item('opencomputers:cable') * 2,
            ore('circuitHv')
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:powerdistributor')])
        .duration(200).EUt(480).buildAndRegister()
    
    // Power Converter
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('transformer.mv'),
            metaitem('circuit_board.plastic') * 2,
            item('opencomputers:material:8') * 2,
            metaitem('plateAluminium') * 2,
            item('opencomputers:cable') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:powerconverter')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Waypoint
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs([
            item('gregtech:machine_casing:2'),
            item('opencomputers:material:13'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:7'),
            item('opencomputers:material:6') * 2,
            item('opencomputers:cable') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:waypoint')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Net Splitter
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            metaitem('buffer.mv'),
            item('opencomputers:upgrade:18'),
            item('opencomputers:upgrade:24'),
            metaitem('board.plastic') * 2,
            item('opencomputers:cable') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:transposer') * 2])
        .duration(200).EUt(120).buildAndRegister()
    
    // Screen - Tier 1
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('gregtech:machine_casing:2'),
            metaitem('cover.screen'),
            ore('circuitMv') * 2,
            item('opencomputers:material:6') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:screen1')])
        .duration(200).EUt(120).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('gregtech:machine_casing:2'),
            metaitem('cover.screen'),
            ore('circuitMv') * 2,
            item('opencomputers:material:6') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:screen1')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Screen - Tier 2
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs([
            item('opencomputers:screen1'),
            ore('circuitHv') * 2,
            ore('componentTransistor') * 2
        ])
        .fluidInputs(fluid('tin') * 144)
        .outputs([item('opencomputers:screen2')])
        .duration(200).EUt(480).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:screen1'),
            ore('circuitHv') * 2,
            ore('componentTransistor') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:screen2'))
        .duration(200).EUt(480).buildAndRegister()
    
    // Screen - Tier 3
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:screen2'),
            ore('circuitEv') * 2,
            metaitem('component.advanced_smd.transistor'))
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('opencomputers:screen3'))
        .duration(200).EUt(1920).buildAndRegister()
    mods.gregtech.circuit_assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(
            item('opencomputers:screen2'),
            ore('circuitEv') * 2,
            metaitem('component.advanced_smd.transistor'))
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:screen3'))
        .duration(200).EUt(1920).buildAndRegister()
    
    // Disk Drive
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:2'),
            item('opencomputers:material', 8) * 2,
            metaitem('electric.motor.mv'),
            metaitem('springSmallCopper'),
            metaitem('stickIronMagnetic'),
            metaitem('lensGlass'))
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:diskdrive'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Geolyzer
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:2'),
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:8'),
            item('opencomputers:tool'),
            metaitem('sensor.mv') * 2,
            metaitem('lensDiamond') * 2)
        .outputs(item('opencomputers:geolyzer'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Motion Sensor
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            metaitem('circuit_board.plastic'),
            item('opencomputers:component:1'),
            metaitem('plateGold') * 3,
            item('opencomputers:cable') * 2,
            item('minecraft:daylight_detector') * 3)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:motionsensor'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Raid
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('opencomputers:diskdrive'),
            item('opencomputers:component:2'),
            item('opencomputers:component:6') * 2,
            metaitem('platePlastic') * 4,
            item('opencomputers:cable') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:raid'))
        .duration(200).EUt(480).buildAndRegister()
    
    // Redstone I/O
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:2'),
            metaitem('circuit_board.plastic') * 2,
            item('opencomputers:material:8') * 2,
            metaitem('plateRedstone') * 2,
            item('opencomputers:card:4'),
            metaitem('cover.activity.detector'))
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:redstone'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Relay
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:2'),
            metaitem('circuit_board.plastic') * 2,
            metaitem('platePlastic') * 2,
            item('opencomputers:card:7'),
            item('opencomputers:material:8'),
            item('opencomputers:cable') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:relay'))
        .duration(200).EUt(120).buildAndRegister()
    
    // Rack
    mods.gregtech.assembler.recipeBuilder()
        .inputs([
            item('opencomputers:relay'),
            item('opencomputers:powerdistributor'),
            item('opencomputers:card:7'),
            metaitem('circuit_board.plastic') * 2,
            metaitem('rotorSteel') * 4,
            metaitem('plateSteel') * 4
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:rack')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Computer Case - Tier 1
    mods.gregtech.assembler.recipeBuilder()
        .inputs([
            item('gregtech:machine_casing:2'),
            metaitem('plateAluminium') * 4,
            metaitem('circuit_board.plastic'),
            item('opencomputers:material:7'),
            metaitem('rotorSteel') * 2
        ])
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:case1')])
        .duration(200).EUt(120).buildAndRegister()
    
    // Computer Case - Tier 2
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:3'),
            metaitem('plateStainlessSteel') * 4,
            metaitem('circuit_board.advanced'),
            item('opencomputers:material:8'),
            metaitem('rotorSteel') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs(item('opencomputers:case2'))
        .duration(200).EUt(480).buildAndRegister()
    
    // Computer Case - Tier 3
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('gregtech:machine_casing:4'),
            metaitem('plateTitanium') * 4,
            metaitem('circuit_board.extreme'),
            item('opencomputers:material:9'),
            metaitem('rotorSteel') * 2)
        .fluidInputs(fluid('plastic') * 72)
        .outputs([item('opencomputers:case3')])
        .duration(200).EUt(1920).buildAndRegister()
