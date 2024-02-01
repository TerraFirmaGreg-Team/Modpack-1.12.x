// MODS_LOADED: tfc

import classes.array.TerraFirmaCraft


// --- Добавление

// Raw Igneous Intrusive Rocks To One OreDict
for (item in TerraFirmaCraft.rawIgneousIntrusive) {
	ore('rawIgneousIntrusive').add(item)
}

// Raw Igneous Extrusive Rocks To One OreDict
for (item in TerraFirmaCraft.rawIgneousExtrusive) {
	ore('rawIgneousExtrusive').add(item)
}

// Rock Metamorphic Rocks To One OreDict
for (item in TerraFirmaCraft.rawMetamorphic) {
	ore('rawMetamorphic').add(item)
}

// Rock Sedimentary Rocks To One OreDict
for (item in TerraFirmaCraft.rawSedimentary) {
	ore('rawSedimentary').add(item)
}

// OreDicionary for all seeds
for (item in TerraFirmaCraft.tfcSeeds) {
	ore('allSeeds').add(item)
}

for (item in TerraFirmaCraft.tfcLooms) {
	ore('loom').add(item)
}

// OreDicionary for all slab
for (item in TerraFirmaCraft.tfcSlabsSmooth) {
	ore('slabStone').add(item)
}

// OreDicionary for all helmets
for (item in TerraFirmaCraft.tfcHelmets) {
	ore('helmet').add(item)
}

// OreDicionary for all chestplates
for (item in TerraFirmaCraft.tfcChestplates) {
	ore('chestplate').add(item)
}

// OreDicionary for all greaves
for (item in TerraFirmaCraft.tfcGreaves) {
	ore('greaves').add(item)
}

// OreDicionary for all boots
for (item in TerraFirmaCraft.tfcBoots) {
	ore('boots').add(item)
}

ore('sugarcane').add(item('tfc:food/sugarcane'))
ore('ingotUnfinishedWroughtIron').add(item('tfc:metal/ingot/wrought_iron'))

// Single Sheets = Single Plates
ore('sheetCopper').add(metaitem('plateCopper'))
ore('sheetBismuth').add(metaitem('plateBismuth'))
ore('sheetBrass').add(metaitem('plateBrass'))
ore('sheetGold').add(metaitem('plateGold'))
ore('sheetLead').add(metaitem('plateLead'))
ore('sheetNickel').add(metaitem('plateNickel'))
ore('sheetRoseGold').add(metaitem('plateRoseGold'))
ore('sheetSilver').add(metaitem('plateSilver'))
ore('sheetTin').add(metaitem('plateTin'))
ore('sheetZinc').add(metaitem('plateZinc'))
ore('sheetSterlingSilver').add(metaitem('plateSterlingSilver'))
ore('sheetPlatinum').add(metaitem('platePlatinum'))
ore('sheetBismuthBronze').add(metaitem('plateBismuthBronze'))
ore('sheetBronze').add(metaitem('plateBronze'))
ore('sheetBlackBronze').add(metaitem('plateBlackBronze'))
ore('sheetWroughtIron').add(metaitem('plateWroughtIron'))
ore('sheetSteel').add(metaitem('plateSteel'))
ore('sheetBlackSteel').add(metaitem('plateBlackSteel'))
ore('sheetBlueSteel').add(metaitem('plateBlueSteel'))
ore('sheetRedSteel').add(metaitem('plateRedSteel'))

// Double Sheets = Double Plates
ore('sheetDoubleCopper').add(metaitem('plateDoubleCopper'))
ore('sheetDoubleBismuth').add(metaitem('plateDoubleBismuth'))
ore('sheetDoubleBrass').add(metaitem('plateDoubleBrass'))
ore('sheetDoubleGold').add(metaitem('plateDoubleGold'))
ore('sheetDoubleLead').add(metaitem('plateDoubleLead'))
ore('sheetDoubleNickel').add(metaitem('plateDoubleNickel'))
ore('sheetDoubleRoseGold').add(metaitem('plateDoubleRoseGold'))
ore('sheetDoubleSilver').add(metaitem('plateDoubleSilver'))
ore('sheetDoubleTin').add(metaitem('plateDoubleTin'))
ore('sheetDoubleZinc').add(metaitem('plateDoubleZinc'))
ore('sheetDoubleSterlingSilver').add(metaitem('plateDoubleSterlingSilver'))
ore('sheetDoublePlatinum').add(metaitem('plateDoublePlatinum'))
ore('sheetDoubleBismuthBronze').add(metaitem('plateDoubleBismuthBronze'))
ore('sheetDoubleBronze').add(metaitem('plateDoubleBronze'))
ore('sheetDoubleBlackBronze').add(metaitem('plateDoubleBlackBronze'))
ore('sheetDoubleWroughtIron').add(metaitem('plateDoubleWroughtIron'))
ore('sheetDoubleSteel').add(metaitem('plateDoubleSteel'))
ore('sheetDoubleBlackSteel').add(metaitem('plateDoubleBlackSteel'))
ore('sheetDoubleBlueSteel').add(metaitem('plateDoubleBlueSteel'))
ore('sheetDoubleRedSteel').add(metaitem('plateDoubleRedSteel'))

// BronzeAny Single Sheets
ore('sheetAnyBronze').add(
	metaitem('plateBronze'), 
	metaitem('plateBlackBronze'), 
	metaitem('plateBismuthBronze'))

// BronzeAny Double Sheets
ore('sheetDoubleAnyBronze').add(
	metaitem('plateDoubleBronze'), 
	metaitem('plateDoubleBlackBronze'), 
	metaitem('plateDoubleBismuthBronze'))

// Резиновые деревья
ore('rubberTrees').add(
    item('tfc:wood/log/rubber_fig'), 
    item('tfc:wood/log/hevea')
)

// Грибы
ore('mushrooms').add(
    item('tfc:plants/amanita'), 
    item('tfc:plants/porcini'),
	item('tfc:plants/stinkhorn')
)

// --- Удаление
// ore('gemDiamond').remove(
// 	item('tfc:gem/diamond'),
// 	item('tfc:gem/diamond:1'),
// 	item('tfc:gem/diamond:2'),
// 	item('tfc:gem/diamond:3'),
// 	item('tfc:gem/diamond:4'))
// ore('gemLapis').remove(item('tfc:ore/lapis_lazuli'))
// ore('gemEmerald').remove(item('tfc:gem/emerald', 2))
// ore('gemSulfur').remove(item('tfc:ore/sulfur'))
// ore('gemSaltpeter').remove(item('tfc:ore/saltpeter'))
// ore('gemGraphite').remove(item('tfc:ore/graphite'))
	// 	item('tfc:gem/lapis_lazuli:*'),
	// item('tfc:gem/emerald:*'),
	// item('tfc:gem/sulfur:*'),
	// item('tfc:gem/saltpeter:*'),
	// item('tfc:gem/graphite:*'),
ore('gemDiamond').remove(
	item('tfc:gem/diamond')
)
ore('dustSalt').remove(item('tfc:powder/salt'))
ore('dustSaltpeter').remove(item('tfc:powder/saltpeter'))
ore('dustGraphite').remove(item('tfc:powder/graphite'))
ore('logWood').remove(item('tfc:stick_bundle'))
ore('sheetDoubleAnyBronze').remove(
	item('tfc:metal/double_sheet/bismuth_bronze'), 
	item('tfc:metal/double_sheet/bronze'), 
	item('tfc:metal/double_sheet/black_bronze'))

// Removing OreDicts from TFC ingots
ore('ingotBismuth').remove(item('tfc:metal/ingot/bismuth'))
ore('ingotBismuthBronze').remove(item('tfc:metal/ingot/bismuth_bronze'))
ore('ingotBlackBronze').remove(item('tfc:metal/ingot/black_bronze'))
ore('ingotBrass').remove(item('tfc:metal/ingot/brass'))
ore('ingotBronze').remove(item('tfc:metal/ingot/bronze'))
ore('ingotCopper').remove(item('tfc:metal/ingot/copper'))
ore('ingotGold').remove(item('tfc:metal/ingot/gold'))
ore('ingotLead').remove(item('tfc:metal/ingot/lead'))
ore('ingotNickel').remove(item('tfc:metal/ingot/nickel'))
ore('ingotRoseGold').remove(item('tfc:metal/ingot/rose_gold'))
ore('ingotSilver').remove(item('tfc:metal/ingot/silver'))
ore('ingotTin').remove(item('tfc:metal/ingot/tin'))
ore('ingotZinc').remove(item('tfc:metal/ingot/zinc'))
ore('ingotWroughtIron').remove(item('tfc:metal/ingot/wrought_iron'))
ore('ingotSterlingSilver').remove(item('tfc:metal/ingot/sterling_silver'))
ore('ingotSteel').remove(item('tfc:metal/ingot/steel'))
ore('ingotPlatinum').remove(item('tfc:metal/ingot/platinum'))
ore('ingotBlackSteel').remove(item('tfc:metal/ingot/black_steel'))
ore('ingotBlueSteel').remove(item('tfc:metal/ingot/blue_steel'))
ore('ingotRedSteel').remove(item('tfc:metal/ingot/red_steel'))

// Removing OreDicts from TFC sheets
ore('sheetCopper').remove(item('tfc:metal/sheet/copper'))
ore('sheetBismuth').remove(item('tfc:metal/sheet/bismuth'))
ore('sheetBrass').remove(item('tfc:metal/sheet/brass'))
ore('sheetGold').remove(item('tfc:metal/sheet/gold'))
ore('sheetLead').remove(item('tfc:metal/sheet/lead'))
ore('sheetNickel').remove(item('tfc:metal/sheet/nickel'))
ore('sheetRoseGold').remove(item('tfc:metal/sheet/rose_gold'))
ore('sheetSilver').remove(item('tfc:metal/sheet/silver'))
ore('sheetTin').remove(item('tfc:metal/sheet/tin'))
ore('sheetZinc').remove(item('tfc:metal/sheet/zinc'))
ore('sheetSterlingSilver').remove(item('tfc:metal/sheet/sterling_silver'))
ore('sheetPlatinum').remove(item('tfc:metal/sheet/platinum'))
ore('sheetBismuthBronze').remove(item('tfc:metal/sheet/bismuth_bronze'))
ore('sheetBronze').remove(item('tfc:metal/sheet/bronze'))
ore('sheetBlackBronze').remove(item('tfc:metal/sheet/black_bronze'))
ore('sheetWroughtIron').remove(item('tfc:metal/sheet/wrought_iron'))
ore('sheetSteel').remove(item('tfc:metal/sheet/steel'))
ore('sheetBlackSteel').remove(item('tfc:metal/sheet/black_steel'))
ore('sheetBlueSteel').remove(item('tfc:metal/sheet/blue_steel'))
ore('sheetRedSteel').remove(item('tfc:metal/sheet/red_steel'))

// Removing OreDicts from TFC double sheets
ore('sheetDoubleCopper').remove(item('tfc:metal/double_sheet/copper'))
ore('sheetDoubleBismuth').remove(item('tfc:metal/double_sheet/bismuth'))
ore('sheetDoubleBrass').remove(item('tfc:metal/double_sheet/brass'))
ore('sheetDoubleGold').remove(item('tfc:metal/double_sheet/gold'))
ore('sheetDoubleLead').remove(item('tfc:metal/double_sheet/lead'))
ore('sheetDoubleNickel').remove(item('tfc:metal/double_sheet/nickel'))
ore('sheetDoubleRoseGold').remove(item('tfc:metal/double_sheet/rose_gold'))
ore('sheetDoubleSilver').remove(item('tfc:metal/double_sheet/silver'))
ore('sheetDoubleTin').remove(item('tfc:metal/double_sheet/tin'))
ore('sheetDoubleZinc').remove(item('tfc:metal/double_sheet/zinc'))
ore('sheetDoubleSterlingSilver').remove(item('tfc:metal/double_sheet/sterling_silver'))
ore('sheetDoublePlatinum').remove(item('tfc:metal/double_sheet/platinum'))
ore('sheetDoubleBismuthBronze').remove(item('tfc:metal/double_sheet/bismuth_bronze'))
ore('sheetDoubleBronze').remove(item('tfc:metal/double_sheet/bronze'))
ore('sheetDoubleBlackBronze').remove(item('tfc:metal/double_sheet/black_bronze'))
ore('sheetDoubleWroughtIron').remove(item('tfc:metal/double_sheet/wrought_iron'))
ore('sheetDoubleSteel').remove(item('tfc:metal/double_sheet/steel'))
ore('sheetDoubleBlackSteel').remove(item('tfc:metal/double_sheet/black_steel'))
ore('sheetDoubleBlueSteel').remove(item('tfc:metal/double_sheet/blue_steel'))
ore('sheetDoubleRedSteel').remove(item('tfc:metal/double_sheet/red_steel'))

for (item in TerraFirmaCraft.tfcSaws) {
    ore('saw').remove(item)
}

// Removing OreDicts from Gypsum
ore('gemGypsum').remove(item('tfc:ore/gypsum'))
