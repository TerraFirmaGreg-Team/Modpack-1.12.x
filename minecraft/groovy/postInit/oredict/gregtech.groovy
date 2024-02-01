// MODS_LOADED: gregtech


// --- Добавление

for (def allToolSword : ore('toolSword')) {
    ore('damageTypeSlashing').add(allToolSword)
}

// Ящики
ore('crate').add(
    item('gregtech:machine', 1625),
    item('gregtech:machine', 1626),
    item('gregtech:machine', 1627),
    item('gregtech:machine', 1628),
    item('gregtech:machine', 1629),
    item('gregtech:machine', 1630),
    item('gregtech:machine', 1631)
)

// Wrought Iron + Iron
ore('blockIronAny').add(item('minecraft:iron_block'), metaitem('blockWroughtIron'))
ore('plateIronAny').add(metaitem('plateIron'), metaitem('plateWroughtIron'))
ore('plateDoubleIronAny').add(metaitem('plateDoubleIron'), metaitem('plateDoubleWroughtIron'))
ore('gearIronAny').add(metaitem('gearIron'), metaitem('gearWroughtIron'))
ore('gearSmallIronAny').add(metaitem('gearSmallIron'), metaitem('gearSmallWroughtIron'))
ore('springIronAny').add(metaitem('springIron'), metaitem('springWroughtIron'))
ore('springSmallIronAny').add(metaitem('springSmallIron'), metaitem('springSmallWroughtIron'))
ore('ringIronAny').add(metaitem('ringIron'), metaitem('ringWroughtIron'))
ore('stickIronAny').add(metaitem('stickIron'), metaitem('stickWroughtIron'))
ore('stickLongIronAny').add(metaitem('stickLongIron'), metaitem('stickLongWroughtIron'))
ore('boltIronAny').add(metaitem('boltIron'), metaitem('boltWroughtIron'))
ore('screwIronAny').add(metaitem('screwIron'), metaitem('screwWroughtIron'))
ore('rotorIronAny').add(metaitem('rotorIron'), metaitem('rotorWroughtIron'))
ore('toolHeadBuzzSawIronAny').add(metaitem('toolHeadBuzzSawIron'), metaitem('toolHeadBuzzSawWroughtIron'))

// BronzeAny Screws
ore('screwBronzeAny').add(metaitem('screwBismuthBronze'), metaitem('screwBronze'), metaitem('screwBlackBronze'))

// Chipped Gems from GT
ore('gemChipped').add(item('gregtech:meta_gem_chipped:*'))
// Flawed Gems from GT
ore('gemFlawed').add(item('gregtech:meta_gem_flawed:*'))
// Flawless Gems from GT
ore('gemFlawless').add(item('gregtech:meta_gem_flawless:*'))
// Exquisite Gems from GT
ore('gemExquisite').add(item('gregtech:meta_gem_exquisite:*'))

// Инструменты
ore('knife').add(item('gregtech:knife:*'))
ore('hammer').add(item('gregtech:hammer:*'))
ore('saw').add(item('gregtech:saw:*'))
ore('propick').add(item('gregtech:propick:*'))
ore('damageTypePiercing').add(item('gregtech:propick:*'))
ore('chisel').add(item('gregtech:chisel:*'))
ore('damageTypeSlashing').add(item('gregtech:chisel:*'))

// Алмазы
// ore('diamonds').add(
//     metaitem('gemFlawedDiamond'), 
//     item('minecraft:diamond'), 
//     metaitem('gemFlawlessDiamond')
// )
ore('componentResistor').add(metaitem('component.advanced_smd.resistor'))

// --- Удаление

ore('stoneBasalt').remove(item('gregtech:stone_smooth', 3))
ore('stoneMarble').remove(item('gregtech:stone_smooth', 2))
