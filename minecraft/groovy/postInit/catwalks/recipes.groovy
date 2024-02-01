// MODS_LOADED: catwalks

import classes.Function


// --- Добавление рецептов

// Blowtorch
crafting.addShaped("tfg/catwalks/blowtorch", item('catwalks:blowtorch'), [
    [null, metaitem('screwSteel'), item('minecraft:flint_and_steel')],
    [ore('toolScrewdriver').transform(Function.setToolDamage), metaitem('stickLongSteel'), metaitem('screwSteel')],
    [metaitem('stickLongSteel'), ore('toolWrench').transform(Function.setToolDamage).transform(Function.setToolDamage), null]])

// Раскрафты по НБТ
crafting.addShapeless("tfg/catwalks/catwalk/treated_wood", item('catwalks:catwalk').withNbt([material: "treated_wood"]), [item('catwalks:catwalk').withNbt([material: "custom_0"])])
crafting.addShapeless("tfg/catwalks/catwalk/custom_0", item('catwalks:catwalk').withNbt([material: "custom_0"]), [item('catwalks:catwalk').withNbt([material: "treated_wood"])])

// Classic Catwalk * 4
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameSteel'), 
        metaitem('screwSteel') * 2, 
        metaitem('stickLongSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "classic"]) * 4)
    .duration(20).EUt(7).buildAndRegister()

// Classic Catwalk * 16
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameBlackSteel'), 
        metaitem('screwBlackSteel') * 2, 
        metaitem('stickLongBlackSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "classic"]) * 16)
    .duration(40).EUt(7).buildAndRegister()

// Glass Catwalk * 4
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameSteel'), 
        ore('paneGlass') * 3, 
        metaitem('stickLongSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "glass"]) * 4)
    .duration(20).EUt(7).buildAndRegister()

// Glass Catwalk * 16
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameBlackSteel'), 
        ore('paneGlass') * 3, 
        metaitem('stickLongBlackSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "glass"]) * 16)
    .duration(40).EUt(7).buildAndRegister()

// Wood Catwalk * 4
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameTreatedWood'), 
        metaitem('plateTreatedWood') * 3, 
        metaitem('stickLongSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "treated_wood"]) * 4)
    .duration(20).EUt(7).buildAndRegister()

// Wood Catwalk * 16
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(
        metaitem('frameTreatedWood'), 
        metaitem('plateTreatedWood') * 3, 
        metaitem('stickLongBlackSteel') * 4)
    .outputs(item('catwalks:catwalk').withNbt([material: "treated_wood"]) * 16)
    .duration(40).EUt(7).buildAndRegister()

// Classic Ladder
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(17)
    .inputs(
        item('minecraft:ladder'), 
        metaitem('stickLongSteel') * 4)
    .outputs(item('catwalks:ladder') * 6)
    .duration(15).EUt(7).buildAndRegister()

// Classic Support Cables * 12
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(18)
    .inputs(metaitem('stickLongSteel') * 3)
    .outputs(item('catwalks:cable') * 12)
    .duration(25).EUt(7).buildAndRegister()

// Classic Support Cables * 32
mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(18)
    .inputs(metaitem('stickLongBlackSteel') * 3)
    .outputs(item('catwalks:cable') * 32)
    .duration(45).EUt(7).buildAndRegister()
