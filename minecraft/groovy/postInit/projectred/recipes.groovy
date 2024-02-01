// MODS_LOADED: projectred-core

import classes.array.Minecraft
import classes.array.ProjectRed


    
// --- Добавление рецептов

// Circuit Plate
furnace.add(ore('stone'), item('projectred-core:resource_item') * 2)
for (int i = 0; i < ProjectRed.illuminars.size(); i++) {
    // Illuminar dusts
    mods.gregtech.mixer.recipeBuilder()
        .circuitMeta(24)
        .inputs(item('minecraft:glowstone_dust'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(ProjectRed.illuminars[i])
        .duration(20).EUt(7).buildAndRegister()
    // Deactivated Lamps
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(12)
        .inputs(
            metaitem('wireGtSingleRedAlloy'), 
            ore('paneGlass') * 6, 
            metaitem('stickSteel') * 12, 
            ProjectRed.illuminars[i] * 2)
        .outputs(ProjectRed.deLamps[i])
        .duration(180).EUt(32).buildAndRegister()
    // Button Lamps
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(14)
        .inputs(
            ore('buttonStone'), 
            ProjectRed.illuminars[i] * 2)
        .outputs(ProjectRed.buttonLamps[i])
        .duration(180).EUt(32).buildAndRegister()
    // All Deactivated Lantern Lamps
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(16)
        .inputs(
            metaitem('wireGtSingleRedAlloy'), 
            ore('paneGlass') * 2, 
            metaitem('stickSteel') * 3, 
            metaitem('plateIron') * 4, 
            ProjectRed.illuminars[i])
        .outputs(ProjectRed.deLanternLamps[i])
        .duration(180).EUt(32).buildAndRegister()
    // Deactivated Fixture Lamps
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(18)
        .inputs(
            item('projectred-core:resource_item:1'), 
            metaitem('stickSteel') * 6, 
            metaitem('plateIron') * 4, 
            ore('paneGlass') * 5, 
            ProjectRed.illuminars[i] * 2)
        .outputs(ProjectRed.deFixtureLamps[i])
        .duration(180).EUt(32).buildAndRegister()
    // Deactivated Fallout Lamps
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(20)
        .inputs(
            item('projectred-core:resource_item:1'), 
            metaitem('stickSteel') * 6, 
            metaitem('plateIron') * 2, 
            item('galacticraftcore:grating') * 6, 
            ProjectRed.illuminars[i] * 2)
        .outputs(ProjectRed.deFalloutLamps[i])
        .duration(180).EUt(32).buildAndRegister()
}

// Activated Lamps
for (int i = 0; i < ProjectRed.aLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(13)
        .inputs(
            ProjectRed.deLamps[i], 
            item('minecraft:redstone_torch'))
        .outputs(ProjectRed.aLamps[i])
        .duration(16).EUt(2).buildAndRegister()
}

// Feedback Lamps
for (int i = 0; i < ProjectRed.feedbackLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(15)
        .inputs(
            item('minecraft:redstone_torch'), 
            ProjectRed.buttonLamps[i] * 2)
        .outputs(ProjectRed.feedbackLamps[i])
        .duration(180).EUt(32).buildAndRegister()
}

// Activated Lantern Lamps
for (int i = 0; i < ProjectRed.aLanternLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(17)
        .inputs(
            ProjectRed.deLanternLamps[i], 
            item('minecraft:redstone_torch'))
        .outputs(ProjectRed.aLanternLamps[i])
        .duration(16).EUt(2).buildAndRegister()
}

// Activated Fixture Lamps
for (int i = 0; i < ProjectRed.aFixtureLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(19)
        .inputs(
            ProjectRed.deFixtureLamps[i], 
            item('minecraft:redstone_torch'))
        .outputs(ProjectRed.aFixtureLamps[i])
        .duration(16).EUt(2).buildAndRegister()
}

// Activated Fallout Lamps
for (int i = 0; i < ProjectRed.aFalloutLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(21)
        .inputs(
            ProjectRed.deFalloutLamps[i], 
            item('minecraft:redstone_torch'))
        .outputs(ProjectRed.aFalloutLamps[i])
        .duration(16).EUt(2).buildAndRegister()
}

// Deactivated Cage Lamps
for (int i = 0; i < ProjectRed.deCageLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(22)
        .inputs(
            item('projectred-core:resource_item:1'), 
            metaitem('stickSteel') * 2,
            item('galacticraftcore:grating') * 4,
            ProjectRed.illuminars[i])
        .outputs(ProjectRed.deCageLamps[i])
        .duration(180).EUt(32).buildAndRegister()
}

// Activated Cage Lamps
for (int i = 0; i < ProjectRed.aCageLamps.size(); i++) {
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(23)
        .inputs(
            ProjectRed.deCageLamps[i], 
            item('minecraft:redstone_torch'))
        .outputs(ProjectRed.aCageLamps[i])
        .duration(16).EUt(2).buildAndRegister()
}

// Silicon Chip
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(
        item('projectred-core:resource_item'), 
        metaitem('wafer.integrated_logic_circuit'))
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('projectred-core:resource_item', 20))
    .duration(400).EUt(32).buildAndRegister()

// Energized Silicon Chip
mods.gregtech.polarizer.recipeBuilder()
    .inputs(item('projectred-core:resource_item', 20))
    .outputs(item('projectred-core:resource_item', 21))
    .duration(200).EUt(32).buildAndRegister()

// Red Alloy Wire
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(metaitem('wireGtSingleRedAlloy') * 2)
    .fluidInputs(fluid('redstone') * 144)
    .outputs(item('projectred-transmission:wire') * 12)
    .duration(180).EUt(32).buildAndRegister()
for (int i = 0; i < ProjectRed.transmissionWires.size(); i++) {
    mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(item('projectred-transmission:wire'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(ProjectRed.transmissionWires[i])
        .duration(100).EUt(16).buildAndRegister()
}

// Bundled Cable
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(3)
    .inputs(item('projectred-transmission:wire') * 5)
    .inputs(ore('string') * 4)
    .outputs(item('projectred-transmission:wire', 17) * 12)
    .duration(180).EUt(32).buildAndRegister()
for (int i = 0; i < ProjectRed.bundledCable.size(); i++) {
    mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(item('projectred-transmission:wire', 17))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(ProjectRed.bundledCable[i])
        .duration(100).EUt(16).buildAndRegister()
}

// IC Bluerprint
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(
        ore('circuitLv') * 2, 
        metaitem('dustLapis') * 4, 
        metaitem('wireGtSingleRedAlloy') * 6)
    .fluidInputs(fluid('soldering_alloy') * 144)
    .outputs(item('projectred-fabrication:ic_blueprint'))
    .duration(200).EUt(32).buildAndRegister()

// Null-Logic Routing Chip
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(
        ore('circuitUlv') * 4, 
        metaitem('wireGtSingleRedAlloy') * 2, 
        item('projectred-core:resource_item:4'))
    .fluidInputs(fluid('soldering_alloy') * 144)
    .outputs(item('projectred-core:resource_item', 600))
    .duration(200).EUt(32).buildAndRegister()

// IC Chip
crafting.addShaped(item('projectred-fabrication:ic_chip'), 
    [[metaitem('cableGtSingleGold'), metaitem('cableGtSingleGold'), metaitem('cableGtSingleGold')],
    [item('appliedenergistics2:material', 16), item('projectred-core:resource_item'), item    ('appliedenergistics2:material', 16)],
    [metaitem('cableGtSingleGold'), metaitem('cableGtSingleGold'), metaitem('cableGtSingleGold')]])

// IC Printer
crafting.addShaped(item('projectred-fabrication:ic_machine:1'), 
    [[metaitem('robot.arm.lv'), metaitem('sensor.lv'), metaitem('robot.arm.lv')],
    [metaitem('blockSteel'), ore('workbench'), metaitem('blockSteel')],
    [ore('plankWood'), ore('plankWood'), ore('plankWood')]])

// Multimeter
crafting.addShaped(item('projectred-core:multimeter'), 
    [[metaitem('wireGtSingleGold'), null, metaitem('wireGtSingleRedAlloy')],
    [metaitem('wireGtSingleGold'), metaitem('cover.screen'), metaitem('wireGtSingleRedAlloy')],
    [ore('circuitLv'), metaitem('plateIron'), ore('circuitLv')]])
