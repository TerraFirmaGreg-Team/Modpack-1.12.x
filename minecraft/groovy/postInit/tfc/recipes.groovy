import classes.array.Minecraft
import classes.array.TerraFirmaCraft
import classes.array.GregTech
import classes.Function


if (isLoaded("tfc")) {

	// Alabaster Bricks
	crafting.addShapeless("tfg/tfc/alabaster_bricks", item('tfc:alabaster_brick') * 4, [metaitem('dustGypsum'), ore('toolFile').transform(Function.setToolDamage)])
	
	// Cladding
	mods.gregtech.alloy_smelter.recipeBuilder()
		.inputs(
	        metaitem('plateWroughtIron'), 
	        metaitem('plateCopper'))
		.outputs(item('tfc:metal/sheet/wrought_iron'))
		.duration(400).EUt(2).buildAndRegister()
	
	// Контроллер доменной печи
	crafting.addShaped("tfg/tfc/blast_furnace", item('tfc:blast_furnace'), [
		[ore('plateDoubleIronAny'), ore('plateDoubleIronAny'), ore('plateDoubleIronAny')],
		[ore('plateDoubleIronAny'), item('tfc:crucible'), ore('plateDoubleIronAny')],
		[ore('plateDoubleIronAny'), ore('plateDoubleIronAny'), ore('plateDoubleIronAny')]])
	
	// Огнеупорная глина
	crafting.addShaped("tfg/tfc/fire_clay", item('tfc:ceramics/fire_clay'), [
		[item('tfc:powder/kaolinite'), item('tfc:powder/graphite'), item('tfc:powder/kaolinite')],
		[item('tfc:powder/graphite'), ore('clay'), item('tfc:powder/graphite')],
		[item('tfc:powder/kaolinite'), item('tfc:powder/graphite'), item('tfc:powder/kaolinite')]])
	
	// TFC Resin -> Sticky resin
	furnace.add(metaitem('rubber_drop'), item('tfc:plants/resin'))
	
	// Сырой камень -> Сырой камень
	for (int i = 0; i < TerraFirmaCraft.tfcRaws.size(); i++) {
		mods.gregtech.rock_breaker.recipeBuilder()
			.notConsumable(TerraFirmaCraft.tfcRaws[i])
			.outputs(TerraFirmaCraft.tfcRaws[i])
			.duration(16).EUt(32).buildAndRegister()
	}
	
	// Сырой камень -> Булыжник
	for (int i = 0; i < TerraFirmaCraft.tfcCobbles.size(); i++) {
		mods.gregtech.forge_hammer.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRaws[i])
			.outputs(TerraFirmaCraft.tfcCobbles[i])
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Сырой камень -> Гладкий
	for (int i = 0; i < TerraFirmaCraft.tfcSmooths.size(); i++) {
		mods.gregtech.laser_engraver.recipeBuilder()
	        .notConsumable(ore('craftingLensGlass'))
			.inputs(TerraFirmaCraft.tfcRaws[i])
			.outputs(TerraFirmaCraft.tfcSmooths[i])
			.duration(200).EUt(30).buildAndRegister()
	}
	
	// Булыжник -> Гравий
	for (int i = 0; i < TerraFirmaCraft.tfcCobbles.size(); i++) {
		mods.gregtech.forge_hammer.recipeBuilder()
				.inputs(TerraFirmaCraft.tfcCobbles[i])
				.outputs(TerraFirmaCraft.tfcGravel[i])
				.duration(200).EUt(7).buildAndRegister()
	}
	
	// Гравий -> Песок
	for (int i = 0; i < TerraFirmaCraft.tfcSands.size(); i++) {
		mods.gregtech.forge_hammer.recipeBuilder()
				.inputs(TerraFirmaCraft.tfcGravel[i])
				.outputs(TerraFirmaCraft.tfcSands[i])
				.duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи -> Блоки кирпичей
	for (int i = 0; i < TerraFirmaCraft.tfcBricksBlock.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(4)
		    .inputs(TerraFirmaCraft.tfcBricksItem[i] * 4)
			.fluidInputs(fluid('concrete') * 100)
		    .outputs(TerraFirmaCraft.tfcBricksBlock[i] * 4)
		    .duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи из грязи -> Блоки кирпичей
	for (int i = 0; i < TerraFirmaCraft.tfcMudBricksItem.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(4)
		    .inputs(TerraFirmaCraft.tfcMudBricksItem[i] * 4)
			.fluidInputs(fluid('concrete') * 100)
		    .outputs(TerraFirmaCraft.tfcMudBricksBlock[i] * 4)
		    .duration(200).EUt(7).buildAndRegister()
	}
	
	// Булыжник -> Полублок
	for (int i = 0; i < TerraFirmaCraft.tfcCobbles.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcCobbles[i])
			.outputs(TerraFirmaCraft.tfcSlabsCobble[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Булыжник -> Ступенька
	for (int i = 0; i < TerraFirmaCraft.tfcCobbles.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(7)
			.inputs(TerraFirmaCraft.tfcCobbles[i] * 6)
			.outputs(TerraFirmaCraft.tfcStairsCobble[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи -> Полублок
	for (int i = 0; i < TerraFirmaCraft.tfcBricksBlock.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcBricksBlock[i])
			.outputs(TerraFirmaCraft.tfcSlabsBricks[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи -> Ступенька
	for (int i = 0; i < TerraFirmaCraft.tfcBricksBlock.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(7)
			.inputs(TerraFirmaCraft.tfcBricksBlock[i] * 6)
			.outputs(TerraFirmaCraft.tfcStairsBricks[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Гладкий блок -> Полублок
	for (int i = 0; i < TerraFirmaCraft.tfcSmooths.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcSmooths[i])
			.outputs(TerraFirmaCraft.tfcSlabsSmooth[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Гладкий блок -> Ступенька
	for (int i = 0; i < TerraFirmaCraft.tfcSmooths.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcSmooths[i] * 6)
			.circuitMeta(7)
			.outputs(TerraFirmaCraft.tfcStairsSmooth[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Сырой блок -> Полублок
	for (int i = 0; i < TerraFirmaCraft.tfcRaws.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRaws[i])
			.outputs(TerraFirmaCraft.tfcRawSlabs[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Сырой блок -> Ступенька
	for (int i = 0; i < TerraFirmaCraft.tfcRaws.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRaws[i] * 6)
			.circuitMeta(7)
			.outputs(TerraFirmaCraft.tfcRawStairs[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи из грязи -> Полублок
	for (int i = 0; i < TerraFirmaCraft.tfcMudBricksBlock.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcMudBricksBlock[i])
			.outputs(TerraFirmaCraft.tfcMudBricksSlabs[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Кирпичи из грязи -> Ступенька
	for (int i = 0; i < TerraFirmaCraft.tfcMudBricksBlock.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcMudBricksBlock[i] * 6)
			.circuitMeta(7)
			.outputs(TerraFirmaCraft.tfcMudBricksStairs[i])
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Сырой камень -> Нажимные каменные пластины
	for (int i = 0; i < TerraFirmaCraft.tfcRaws.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.tfcRaws[i] * 2, 
	            metaitem('springIron'))
			.outputs(TerraFirmaCraft.tfcStonePressurePlates[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Нажимные каменные пластины -> Кнопки
	for (int i = 0; i < TerraFirmaCraft.tfcStoneButtons.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcStonePressurePlates[i] * 6)
			.fluidInputs(fluid('lubricant') * 1)
			.outputs(TerraFirmaCraft.tfcStoneButtons[i] * 12)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	for (int i = 0; i == 83 < TerraFirmaCraft.lumbers.size(); i++) {
	// Бочки
	    // if (i != 83 .. 107) {
			mods.gregtech.assembler.recipeBuilder()
	            .circuitMeta(15)
				.inputs(TerraFirmaCraft.lumbers[i] * 7)
				.outputs(TerraFirmaCraft.tfcBarrels[i])
				.duration(205).EUt(4).buildAndRegister()
		// }
	}
	// 
	for (int i = 0; i < GregTech.gtDustsForRawStones.size(); i++) {
		// Raw Block
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRaws[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 3)
			.duration(100).EUt(4).buildAndRegister()
	
		// Raw Stairs
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRawStairs[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 2)
			.duration(100).EUt(4).buildAndRegister()
	
		// Raw Slab
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcRawSlabs[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 1)
			.duration(100).EUt(4).buildAndRegister()
	
		// Smooth Block
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcSmooths[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 3)
			.duration(100).EUt(4).buildAndRegister()
	
		// Smooth Stairs
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcStairsSmooth[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 2)
			.duration(100).EUt(4).buildAndRegister()
	
		// Smooth Slab
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcSlabsSmooth[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 1)
			.duration(100).EUt(4).buildAndRegister()
	
		// Cobble Block
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcCobbles[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 3)
			.duration(100).EUt(4).buildAndRegister()
	
		// Cobble Stairs
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcStairsCobble[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 2)
			.duration(100).EUt(4).buildAndRegister()
	
		// Cobble Slab
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcSlabsCobble[i])
			.outputs(GregTech.gtDustsForRawStones[i] * 1)
			.duration(100).EUt(4).buildAndRegister()
	}
	
	// Дерево -> Пиломатериалы (Для эвкалипта)
	for (int i = 0; i < TerraFirmaCraft.tfcEucaliptusLogs.size(); i++) {
		
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcEucaliptusLogs[i])
			.fluidInputs(fluid('lubricant') * 1)
			.outputs(
	            item('tfc:wood/lumber/eucalyptus') * 16, 
	            metaitem('dustWood') * 2)
			.duration(200).EUt(7).buildAndRegister()
	
		// saw_mill.recipeBuilder()
		// 	.circuitMeta(1)
		// 	.inputs([TerraFirmaCraft.tfcEucaliptusLogs])
		// 	.fluidInputs(fluid('lubricant') * 1000)
		// 	.outputs(
		// 		item('tfc:wood/lumber/eucalyptus') * 64, 
		// 		metaitem('dustWood') * 8)
		// 	.duration(450)
		// 	.EUt(32)
		// 	.buildAndRegister()
	}
	
	// Доски -> Пиломатериалы
	for (int i = 0; i < TerraFirmaCraft.tfcPlanks.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcPlanks[i])
			.fluidInputs(fluid('lubricant') * 1)
			.outputs(TerraFirmaCraft.lumbers[i] * 4)
			.duration(200).EUt(7).buildAndRegister()
	
	// Пиломатериалы -> Доски
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.lumbers[i] * 4)
			.circuitMeta(3)
			.outputs(TerraFirmaCraft.tfcPlanks[i])
			.duration(200).EUt(7).buildAndRegister()
	
	// Доски -> Полу-блоки
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcPlanks[i])
			.circuitMeta(6)
			.outputs(TerraFirmaCraft.tfcSlabs[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	
	// Доски -> Ступеньки
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcPlanks[i] * 6)
			.circuitMeta(7)
			.outputs(TerraFirmaCraft.tfcStairs[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	
	// Доски -> Нажимные деревянные пластины
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.tfcPlanks[i] * 2, 
	            metaitem('springIron'))
			.circuitMeta(4)
			.outputs(TerraFirmaCraft.tfcPressurePlates[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	
	// Доски -> Забор
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.tfcPlanks[i] * 2, 
	            item('minecraft:stick') * 2)
			.circuitMeta(1)
			.outputs(TerraFirmaCraft.tfcFences[i] * 8)
			.duration(200).EUt(7).buildAndRegister()
	
	// Доски -> Калитка
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.tfcPlanks[i] * 2, 
	            item('minecraft:stick') * 3)
			.circuitMeta(2)
			.outputs(TerraFirmaCraft.tfcFenceGates[i] * 2)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Нажимные деревянные пластины -> Кнопки
	for (int i = 0; i < TerraFirmaCraft.tfcPressurePlates.size(); i++) {
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcPressurePlates[i] * 6)
			.fluidInputs(fluid('lubricant') * 1)
			.outputs(TerraFirmaCraft.tfcButtons[i] * 12)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	// Бревна -> Забор из бревен
	for (int i = 0; i < TerraFirmaCraft.tfcFenceLog.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.circuitMeta(1)
			.inputs(
				TerraFirmaCraft.logs[i + 83] * 2, 
				item('minecraft:stick') * 3)
			.outputs(TerraFirmaCraft.tfcFenceLog[i])
			.duration(200).EUt(7).buildAndRegister()
	}
	
	for (int i = 0; i < TerraFirmaCraft.logs.size(); i++) {
	
	// Бревна -> Калитка из бревен
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
				TerraFirmaCraft.logs[i] * 2, 
				item('minecraft:stick') * 3)
			.circuitMeta(2)
			.outputs(TerraFirmaCraft.tfcFenceGatesLog[i] * 8)
			.duration(200).EUt(7).buildAndRegister()
	
	// Бревна -> Опоры
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(7)
			.inputs(TerraFirmaCraft.logs[i] * 2)
			.outputs(TerraFirmaCraft.tfcSupports[i] * 16)
			.duration(200).EUt(7).buildAndRegister()
	}
	
	for (int i = 0; i < TerraFirmaCraft.lumbers.size(); i++) {
	
	// Двери
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(8)
			.inputs(TerraFirmaCraft.lumbers[i] * 6)
			.outputs(TerraFirmaCraft.tfcDoors[i] * 2)
			.duration(350).EUt(4).buildAndRegister()
	
	// Люки
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(9)
			.inputs(TerraFirmaCraft.lumbers[i] * 6)
			.outputs(TerraFirmaCraft.tfcTrapdoors[i] * 3)
			.duration(320).EUt(4).buildAndRegister()
	
	// Сундуки
		crafting.addShaped("tfg/tfc/chest_" + i, TerraFirmaCraft.tfcChests[i], [
			[TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i]],
			[TerraFirmaCraft.lumbers[i], null, TerraFirmaCraft.lumbers[i]],
			[TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i]]])
		
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(12)
			.inputs(TerraFirmaCraft.lumbers[i] * 8)
			.outputs(TerraFirmaCraft.tfcChests[i])
			.duration(280).EUt(4).buildAndRegister()
	
	// Прялки
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(13)
			.inputs(
	            TerraFirmaCraft.lumbers[i] * 7, 
	            item('minecraft:stick'))
			.outputs(TerraFirmaCraft.tfcLooms[i])
			.duration(210).EUt(4).buildAndRegister()
	
	
	// Полка для инструментов
		mods.gregtech.assembler.recipeBuilder()
	    	.circuitMeta(14)
			.inputs(TerraFirmaCraft.lumbers[i] * 6)
			.outputs(TerraFirmaCraft.tfcToolRacks[i])
			.duration(205).EUt(4).buildAndRegister()
	
	// Лодки
		crafting.addShaped("tfg/tfc/boat_" + i, TerraFirmaCraft.tfcBoats[i], [
			[item('gregtech:meta_screw:*'), item('gregtech:meta_screw:*'), item('gregtech:meta_screw:*')],
			[TerraFirmaCraft.lumbers[i], metaitem('rubber_drop'), TerraFirmaCraft.lumbers[i]],
			[TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i], TerraFirmaCraft.lumbers[i]]])
	
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.lumbers[i] * 5, 
	            metaitem('rubber_drop'), 
	            item('gregtech:meta_screw:*') * 3)
			.circuitMeta(16)
			.outputs(TerraFirmaCraft.tfcBoats[i])
			.duration(270).EUt(4).buildAndRegister()
	
	// Lumber -> dustWood
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.lumbers[i])
			.outputs(
				metaitem('dustWood') * 5,
				metaitem('dustSmallWood') * 2)
			.duration(400).EUt(12).buildAndRegister()
	
	// Дерево -> Пиломатериалы
		mods.gregtech.cutter.recipeBuilder()
			.inputs(TerraFirmaCraft.logs[i])
			.fluidInputs(fluid('lubricant') * 1)
			.outputs(
	            TerraFirmaCraft.lumbers[i] * 16, 
	            metaitem('dustWood') * 2)
			.duration(200).EUt(7).buildAndRegister()
		
		// saw_mill.recipeBuilder()
		// 	.circuitMeta(1)
		// 	.inputs([TerraFirmaCraft.logs[i]])
		// 	.fluidInputs(fluid('lubricant') * 1000)
		// 	.outputs(
		// 		TerraFirmaCraft.lumbers * 64, 
		// 		metaitem('dustWood') * 8)
		// 	.duration(450)
		// 	.EUt(32)
		// 	.buildAndRegister()
	}

	crafting.addShapeless("tfg/tfc/sticks_from_bundle", item('minecraft:stick') * 18, [item('tfc:stick_bundle'), ore('toolSaw').transform(Function.setToolDamage)])
	crafting.addShapeless("tfg/tfc/sticks_from_bunch", item('minecraft:stick') * 9, [item('tfc:stick_bunch')])
	crafting.addShapeless("tfg/tfc/sticks_from_twig", item('minecraft:stick') * 3, [item('tfcflorae:groundcover/twig')])
	crafting.addShapeless("tfg/tfc/sticks_from_lumber", item('minecraft:stick') * 6, [ore('lumber'), ore('toolSaw').transform(Function.setToolDamage)])
	crafting.addShapeless("tfg/tfc/sticks_from_driftwood", item('minecraft:stick') * 6, [item('tfcflorae:groundcover/driftwood')])

	mods.gregtech.cutter.recipeBuilder()
		.inputs(item('tfc:stick_bundle'))
		.fluidInputs(fluid('lubricant') * 1)
		.outputs(item('minecraft:stick') * 18)
		.duration(200).EUt(7).buildAndRegister()
	
	mods.gregtech.cutter.recipeBuilder()
		.inputs(ore('lumber'))
		.fluidInputs(fluid('lubricant') * 1)
		.outputs(item('minecraft:stick') * 9)
		.duration(200).EUt(7).buildAndRegister()
	
	
	// Железные люки
	for (int i = 0; i < GregTech.gtTFCPlates.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
	        .circuitMeta(22)
			.inputs(GregTech.gtTFCPlates[i])
			.outputs(TerraFirmaCraft.tfcMetalTrapdoors[i])
			.duration(205).EUt(8).buildAndRegister()	
	}
	
	// Книжные полки
	for (int i = 0; i < TerraFirmaCraft.tfcPlanks.size(); i++) {
		mods.gregtech.assembler.recipeBuilder()
			.inputs(
	            TerraFirmaCraft.tfcPlanks[i] * 6, 
	            item('minecraft:book') * 3)
			.circuitMeta(10)
			.outputs(TerraFirmaCraft.tfcBookshelfs[i])
			.duration(400).EUt(4).buildAndRegister()
	
	// Верстаки
		mods.gregtech.assembler.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcPlanks[i] * 4)
			.circuitMeta(11)
			.outputs(TerraFirmaCraft.tfcWorkbenchs[i])
			.duration(250).EUt(4).buildAndRegister()
	}
	
	// --- Furnace recipes for TFC items
	// Хавка
	for (int i = 0; i < TerraFirmaCraft.tfcCookedMeat.size(); i++) {
		furnace.add(TerraFirmaCraft.tfcRawMeat[i], TerraFirmaCraft.tfcCookedMeat[i])
	}
	
	// Керамика
	for (int i = 0; i < TerraFirmaCraft.tfcFiredCeramics.size(); i++) {
		//furnace.add(TerraFirmaCraft.tfcFiredCeramics[i], TerraFirmaCraft.tfcUnfiredCeramics[i])
	}
	
	// Spindle
	furnace.add(item('tfc:ceramics/fired/spindle'), item('tfc:ceramics/unfired/spindle'))
	
	// Macerator recipes for Quern/Grindstone recipes
	for (int i = 0; i < TerraFirmaCraft.tfcQuernToMaceratorInput.size(); i++) {
		mods.gregtech.macerator.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcQuernToMaceratorInput[i])
			.outputs(TerraFirmaCraft.tfcQuernToMaceratorOutput[i] * 2)
			.duration(50).EUt(2).buildAndRegister()
	}
	
	// Переработка TFC камня в ресурсы
	
	// Breccia
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustBreccia') * 3)
		.chancedOutput(metaitem('dustSmallSilicon'), 6700, 700)
		.chancedOutput(metaitem('dustTinyLithium'), 6700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 16)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Catlinite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustCatlinite') * 3)
		.chancedOutput(metaitem('dustSmallSodium'), 6700, 700)
		.chancedOutput(metaitem('dustTinySilicon'), 6700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 24)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Chalk
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustChalk') * 3)
		.chancedOutput(metaitem('dustSmallCalcium'), 6700, 700)
		.chancedOutput(metaitem('dustSmallCarbon'), 6700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 24)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Chert
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustChert') * 3)
		.chancedOutput(metaitem('dustSmallSilicon'), 6700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 5700, 700)
		.fluidOutputs(fluid('oxygen') * 24)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Claystone
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustClaystone') * 3)
		.chancedOutput(metaitem('dustTinyAluminium'), 6700, 700)
		.chancedOutput(metaitem('dustTinySilicon'), 6700, 700)
		.chancedOutput(metaitem('dustTinyBandedIron'), 6700, 700)
		.fluidOutputs(fluid('oxygen') * 5)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Conglomerate
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustConglomerate') * 3)
		.chancedOutput(metaitem('dustSmallBandedIron'), 6700, 700)
		.chancedOutput(metaitem('dustSmallSilicon'), 6700, 700)
		.chancedOutput(metaitem('dustSmallTricalciumPhosphate'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 5)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Dacite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustDacite') * 3)
		.chancedOutput(metaitem('dustSodium'), 6700, 700)
		.chancedOutput(metaitem('dustSmallCalcium'), 6700, 700)
		.chancedOutput(metaitem('dustSmallSiliconDioxide'), 6700, 700)
		.chancedOutput(metaitem('dustSmallAluminium'), 3700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 12)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Dolomite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustDolomite') * 3)
		.chancedOutput(metaitem('dustSmallMagnesium'), 6700, 700)
		.chancedOutput(metaitem('dustSmallCalcium'), 5700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 16)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Gabbro
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustGabbro') * 3)
		.chancedOutput(metaitem('dustSmallTitanium'), 6700, 700)
		.chancedOutput(metaitem('dustSmallIron'), 3700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 24)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Gneiss
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustGneiss') * 3)
		.chancedOutput(metaitem('dustSmallQuartzite'), 6700, 700)
		.chancedOutput(metaitem('dustSmallBiotite'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 2)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Komatiite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustKomatiite') * 3)
		.chancedOutput(metaitem('dustSmallManganese'), 8700, 700)
		.fluidOutputs(fluid('oxygen') * 12)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Limestone
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustLimestone') * 3)
		.chancedOutput(metaitem('dustSmallCalcium'), 8700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 36)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Mudstone
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustMudstone') * 3)
		.chancedOutput(metaitem('dustSmallClay'), 8700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 46)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Novaculite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustNovaculite') * 3)
		.chancedOutput(metaitem('dustSmallSiliconDioxide'), 8700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 46)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Peridotite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustPeridotite') * 3)
		.chancedOutput(metaitem('dustOlivine'), 5700, 700)
		.chancedOutput(metaitem('dustTinyAluminium'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 12)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Phyllite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustPhyllite') * 3)
		.chancedOutput(metaitem('dustSmallQuartzite'), 5700, 700)
		.chancedOutput(metaitem('dustSmallCalciumChloride'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 2)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Porphyry
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustPorphyry') * 3)
		.chancedOutput(metaitem('dustSmallSodium'), 9500, 700)
		.chancedOutput(metaitem('dustSmallQuartzite'), 8700, 700)
		.chancedOutput(metaitem('dustSmallCalcium'), 1700, 700)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Rhyolite
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustRhyolite') * 3)
		.chancedOutput(metaitem('dustSiliconDioxide'), 8700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 100, 100)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Sandstone
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustSandstone') * 3)
		.chancedOutput(metaitem('dustTinyCalcium'), 6700, 700)
		.chancedOutput(metaitem('dustTinyAluminium'), 3700, 700)
		.chancedOutput(metaitem('dustTinySilicon'), 1700, 700)
		.fluidOutputs(fluid('oxygen') * 6)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Schist
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustSchist') * 3)
		.chancedOutput(metaitem('dustSmallMica'), 6700, 700)
		.chancedOutput(metaitem('dustSmallTalc'), 5700, 700)
		.chancedOutput(metaitem('dustSmallGraphite'), 3700, 700)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 3700, 700)
		.fluidOutputs(fluid('oxygen') * 12)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Shale
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustShale') * 3)
		.chancedOutput(metaitem('dustSodium'), 9500, 500)
		.chancedOutput(metaitem('dustTinyMetalMixture'), 1500, 500)
		.fluidOutputs(fluid('oxygen') * 16)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Siltstone
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustSiltstone') * 3)
		.chancedOutput(metaitem('dustCertusQuartz'), 6700, 700)
		.chancedOutput(metaitem('dustQuartzite'), 5700, 700)
		.fluidOutputs(fluid('oxygen') * 2)
		.duration(450).EUt(64).buildAndRegister()
	
	// - Slate
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(metaitem('dustSlate') * 3)
		.chancedOutput(metaitem('dustSmallMetalMixture'), 6700, 700)
		.fluidOutputs(fluid('oxygen') * 4)
		.duration(450).EUt(64).buildAndRegister()
	
	// Цемент из тфк -> цемент разных цветов
	// White Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_white') * 144).outputs(item('minecraft:concrete_powder') * 4).duration(15).EUt(7).buildAndRegister()
	// Orange Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_orange') * 144).outputs(item('minecraft:concrete_powder:1') * 4).duration(15).EUt(7).buildAndRegister()
	// Magenta Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_magenta') * 144).outputs(item('minecraft:concrete_powder:2') * 4).duration(15).EUt(7).buildAndRegister()
	// Light Blue Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_light_blue') * 144).outputs(item('minecraft:concrete_powder:3') * 4).duration(15).EUt(7).buildAndRegister()	
	// Yellow Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_yellow') * 144).outputs(item('minecraft:concrete_powder:4') * 4).duration(15).EUt(7).buildAndRegister()	
	// Lime Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_lime') * 144).outputs(item('minecraft:concrete_powder:5') * 4).duration(15).EUt(7).buildAndRegister()	
	// Pink Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_pink') * 144).outputs(item('minecraft:concrete_powder:6') * 4).duration(15).EUt(7).buildAndRegister()	
	// Gray Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_gray') * 144).outputs(item('minecraft:concrete_powder:7') * 4).duration(15).EUt(7).buildAndRegister()
	// Light Gray Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_light_gray') * 144).outputs(item('minecraft:concrete_powder:8') * 4).duration(15).EUt(7).buildAndRegister()
	// Cyan Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_cyan') * 144).outputs(item('minecraft:concrete_powder:9') * 4).duration(15).EUt(7).buildAndRegister()
	// Purple Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_purple') * 144).outputs(item('minecraft:concrete_powder:10') * 4).duration(15).EUt(7).buildAndRegister()
	// Blue Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_blue') * 144).outputs(item('minecraft:concrete_powder:11') * 4).duration(15).EUt(7).buildAndRegister()
	// Brown Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_brown') * 144).outputs(item('minecraft:concrete_powder:12') * 4).duration(15).EUt(7).buildAndRegister()
	// Green Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_green') * 144).outputs(item('minecraft:concrete_powder:13') * 4).duration(15).EUt(7).buildAndRegister()
	// Red Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_red') * 144).outputs(item('minecraft:concrete_powder:14') * 4).duration(15).EUt(7).buildAndRegister()
	// Black Concrete Powder * 8
	mods.gregtech.mixer.recipeBuilder().inputs(item('tfc:aggregate') * 4).fluidInputs(fluid('dye_black') * 144).outputs(item('minecraft:concrete_powder:15') * 4).duration(15).EUt(7).buildAndRegister()
	
	// Переработка тфк еды в метан
	// Мясо
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(1).inputs(ore('categoryMeat')).fluidOutputs(fluid('methane') * 72).duration(40).EUt(5).buildAndRegister()
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(2).inputs(ore('categoryCookedMeat')).fluidOutputs(fluid('methane') * 144).duration(40).EUt(5).buildAndRegister()
	// Фрукты
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(3).inputs(ore('categoryFruit')).fluidOutputs(fluid('methane') * 48).duration(40).EUt(5).buildAndRegister()
	// Овощи
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(4).inputs(ore('categoryVegetable')).fluidOutputs(fluid('methane') * 62).duration(40).EUt(5).buildAndRegister()
	// Крупы
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(5).inputs(ore('categoryGrain')).fluidOutputs(fluid('methane') * 44).duration(40).EUt(5).buildAndRegister()
	// Хлеб
	mods.gregtech.centrifuge.recipeBuilder().circuitMeta(6).inputs(ore('categoryBread')).fluidOutputs(fluid('methane') * 26).duration(40).EUt(5).buildAndRegister()
	
	// Переработка слитков
	// Первичная
	mods.gregtech.forge_hammer.recipeBuilder().inputs(ore('ingotPigIron')).outputs(item('tfc:metal/ingot/high_carbon_steel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.forge_hammer.recipeBuilder().inputs(ore('ingotHighCarbonSteel')).outputs(metaitem('ingotSteel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.forge_hammer.recipeBuilder().inputs(ore('ingotHighCarbonBlueSteel')).outputs(metaitem('ingotBlueSteel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.forge_hammer.recipeBuilder().inputs(ore('ingotHighCarbonRedSteel')).outputs(metaitem('ingotRedSteel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.forge_hammer.recipeBuilder().inputs(ore('ingotHighCarbonBlackSteel')).outputs(metaitem('ingotBlackSteel')).duration(100).EUt(2).buildAndRegister()
	// Вторичная
	mods.gregtech.alloy_smelter.recipeBuilder().inputs(ore('ingotWeakBlueSteel'), ore('ingotBlackSteel')).outputs(item('tfc:metal/ingot/high_carbon_blue_steel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.alloy_smelter.recipeBuilder().inputs(ore('ingotWeakRedSteel'), ore('ingotBlackSteel')).outputs(item('tfc:metal/ingot/high_carbon_red_steel')).duration(100).EUt(2).buildAndRegister()
	mods.gregtech.alloy_smelter.recipeBuilder().inputs(ore('ingotWeakSteel'), ore('ingotPigIron')).outputs(item('tfc:metal/ingot/high_carbon_black_steel')).duration(100).EUt(2).buildAndRegister()
	
	// Рецепты для льда
	mods.gregtech.vacuum_freezer.recipeBuilder().fluidInputs(fluid('fresh_water') * 1000).outputs(item('minecraft:ice')).duration(1500).EUt(256).buildAndRegister()
	mods.gregtech.vacuum_freezer.recipeBuilder().fluidInputs(fluid('salt_water') * 1000).outputs(item('tfc:sea_ice')).duration(1500).EUt(256).buildAndRegister()
	// mods.gregtech.vacuum_freezer.recipeBuilder().fluidInputs(fluid('fresh_water') * 2000).outputs(item('minecraft:packed_ice')).duration(1500).EUt(512).buildAndRegister()
	
	// Различные крафты для лассо
	mods.gregtech.assembler.recipeBuilder()
		.inputs(ore('string') * 2, ore('leather'))
		.outputs(item('minecraft:lead'))
		.duration(250).EUt(2).buildAndRegister()
	
	// Песок -> Диоксид кремния
	mods.gregtech.electrolyzer.recipeBuilder()
		.inputs(ore('sandSilica') * 8)
		.outputs(metaitem('dustSiliconDioxide'))
		.duration(150).EUt(26).buildAndRegister()
	
	// Разбор книжных полок
	mods.gregtech.arc_furnace.recipeBuilder()
		.inputs(ore('bookshelf'))
		.outputs(metaitem('dustTinyAsh') * 16)
		.duration(1).EUt(30).buildAndRegister()
	mods.gregtech.macerator.recipeBuilder()
		.inputs(ore('bookshelf'))
		.outputs(metaitem('dustPaper') * 9, metaitem('dustWood') * 6)
		.duration(196).EUt(2).buildAndRegister()
	
	// Рецепты теплой воды
	mods.gregtech.fluid_heater.recipeBuilder()
		.circuitMeta(5)
		.fluidInputs(fluid('fresh_water') * 100)
		.fluidOutputs(fluid('hot_water') * 100)
		.duration(600).EUt(2).buildAndRegister()
	mods.gregtech.fluid_heater.recipeBuilder()
		.circuitMeta(6)
		.fluidInputs(fluid('water') * 100)
		.fluidOutputs(fluid('hot_water') * 100)
		.duration(600).EUt(2).buildAndRegister()
	
	// Рецепты свежей воды
	mods.gregtech.vacuum_freezer.recipeBuilder()
		.fluidInputs(fluid('hot_water') * 100)
		.fluidOutputs(fluid('fresh_water') * 100)
		.duration(1000).EUt(128).buildAndRegister()
	mods.gregtech.centrifuge.recipeBuilder()
		.fluidInputs(fluid('water') * 100)
		.circuitMeta(5)
		.fluidOutputs(fluid('fresh_water') * 100)
		.duration(750).EUt(32).buildAndRegister()
	
	// Saplings -> Logs + Saplings (Greenhouse)
	
	// for (int i = 0; i < TerraFirmaCraft.tfcSaplings.size(); i++) {
	// 	mods.gregtech.greenhouse.recipeBuilder()
	// 		.inputs(
	//             TerraFirmaCraft.tfcSaplings[i], 
	//             metaitem('fertilizer') * 4)
	// 		.circuitMeta(1)
	// 		.fluidInputs(fluid('fresh_water') * 1000)
	// 		.outputs(
	//             TerraFirmaCraft.logs[i] * 16, 
	//             TerraFirmaCraft.tfcSaplings[i])
	// 		.chancedOutput(TerraFirmaCraft.tfcSaplings[i], 5000, 0)
	// 		.duration(2000).EUt(80).buildAndRegister()
	
	// 	mods.gregtech.greenhouse.recipeBuilder()
	// 		.inputs(
	//             TerraFirmaCraft.tfcSaplings[i], 
	//             metaitem('fertilizer') * 4)
	// 		.circuitMeta(2)
	// 		.fluidInputs(fluid('distilled_water') * 1000)
	// 		.outputs(
	//             TerraFirmaCraft.logs[i] * 16, 
	//             TerraFirmaCraft.tfcSaplings[i])
	// 		.chancedOutput(TerraFirmaCraft.tfcSaplings[i].withAmount(2), 5000, 0)
	// 		.duration(1500).EUt(80).buildAndRegister()
	
	// }
	
	// // Seeds -> AnyPlant (Greenhouse)
	// for (int i = 0; i < TerraFirmaCraft.tfcSeeds.size(); i++) {
	// 	mods.gregtech.greenhouse.recipeBuilder()
	// 		.notConsumable(TerraFirmaCraft.tfcSeeds[i])
	// 		.circuitMeta(1)
	// 		.inputs(metaitem('fertilizer') * 2)
	// 		.fluidInputs(fluid('fresh_water') * 1000)
	// 		.outputs(TerraFirmaCraft.tfcPlants[i] * 2)
	// 		.duration(1500).EUt(80).buildAndRegister()
	
	// 	mods.gregtech.greenhouse.recipeBuilder()
	// 		.notConsumable(TerraFirmaCraft.tfcSeeds[i])
	// 		.circuitMeta(2)
	// 		.inputs(metaitem('fertilizer') * 2)
	// 		.fluidInputs(fluid('distilled_water') * 1000)
	// 		.outputs(TerraFirmaCraft.tfcPlants[i] * 2)
	// 		.chancedOutput(TerraFirmaCraft.tfcPlants[i].withAmount(2), 7500, 0)
	// 		.duration(1000).EUt(80).buildAndRegister()
	// }
	
	// Hide Raw Small -> Hide Soaked Small
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/raw/small'))
		.fluidInputs(fluid('limewater') * 100)
		.circuitMeta(16)
		.outputs(item('tfc:hide/soaked/small'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Raw Medium -> Hide Soaked Medium
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/raw/medium'))
		.fluidInputs(fluid('limewater') * 200)
		.circuitMeta(16)
		.outputs(item('tfc:hide/soaked/medium'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Raw Large -> Hide Soaked Large
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/raw/large'))
		.fluidInputs(fluid('limewater') * 300)
		.circuitMeta(16)
		.outputs(item('tfc:hide/soaked/large'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Soaked Small -> Hide Scraped Small
	mods.gregtech.assembler.recipeBuilder()
		.inputs(item('tfc:hide/soaked/small'))
		.circuitMeta(16)
		.outputs(item('tfc:hide/scraped/small'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Soaked Medium -> Hide Scraped Medium
	mods.gregtech.assembler.recipeBuilder()
		.inputs(item('tfc:hide/soaked/medium'))
		.circuitMeta(16)
		.outputs(item('tfc:hide/scraped/medium'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Soaked Large -> Hide Scraped Large
	mods.gregtech.assembler.recipeBuilder()
		.inputs(item('tfc:hide/soaked/large'))
		.circuitMeta(16)
		.outputs(item('tfc:hide/scraped/large'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Scrapped Small -> Hide Prepared Small
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/small'))
		.fluidInputs(fluid('fresh_water') * 100)
		.circuitMeta(16)
		.outputs(item('tfc:hide/prepared/small'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Scrapped Medium -> Hide Prepared Medium
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/medium'))
		.fluidInputs(fluid('fresh_water') * 200)
		.circuitMeta(16)
		.outputs(item('tfc:hide/prepared/medium'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Scrapped Large -> Hide Prepared Large
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/large'))
		.fluidInputs(fluid('fresh_water') * 300)
		.circuitMeta(16)
		.outputs(item('tfc:hide/prepared/large'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Prepared Small -> Leather
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/small'))
		.fluidInputs(fluid('tannin') * 100)
		.circuitMeta(16)
		.outputs(item('minecraft:leather'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Prepared Medium -> Leather
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/medium'))
		.fluidInputs(fluid('tannin') * 200)
		.circuitMeta(16)
		.outputs(item('minecraft:leather') * 2)
		.duration(150).EUt(2).buildAndRegister()
	
	// Hide Prepared Large -> Leather
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:hide/scraped/large'))
		.fluidInputs(fluid('tannin') * 300)
		.circuitMeta(16)
		.outputs(item('minecraft:leather') * 3)
		.duration(150).EUt(2).buildAndRegister()
	
	// WoodTannin -> Liquid Tanin
	mods.gregtech.mixer.recipeBuilder()
		.inputs(ore('logWoodTannin'))
		.fluidInputs(fluid('fresh_water') * 1000)
		.circuitMeta(16)
		.fluidOutputs(fluid('tannin') * 16000)
		.duration(150).EUt(2).buildAndRegister()
	
	// BoneMeal -> Primitive Glue
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('minecraft:dye:15'))
		.fluidInputs(fluid('limewater') * 500)
		.circuitMeta(16)
		.outputs(item('tfc:glue'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Primitive Glue -> GT Glue
	mods.gregtech.centrifuge.recipeBuilder()
		.inputs(item('tfc:glue'))
		.fluidOutputs(fluid('glue') * 10)
		.duration(150).EUt(2).buildAndRegister()
	
	// Jute -> Jute Fiber
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:crop/product/jute'))
		.fluidInputs(fluid('fresh_water') * 100)
		.circuitMeta(16)
		.outputs(item('tfc:crop/product/jute_fiber') * 2)
		.duration(150).EUt(2).buildAndRegister()
	
	// Sand -> Mortar
	mods.gregtech.mixer.recipeBuilder()
		.inputs(ore('sand'))
		.fluidInputs(fluid('limewater') * 50)
		.circuitMeta(16)
		.outputs(item('tfc:mortar') * 32)
		.duration(150).EUt(2).buildAndRegister()
	
	// Wood Ash - ') Lye
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:wood_ash'))
		.fluidInputs(fluid('hot_water') * 125)
		.circuitMeta(16)
		.fluidOutputs(fluid('lye') * 125)
		.duration(150).EUt(2).buildAndRegister()
	
	// Salt Water -> Brine
	mods.gregtech.mixer.recipeBuilder()
		.fluidInputs(
	        fluid('salt_water') * 9000, 
	        fluid('vinegar') * 1000)
		.circuitMeta(16)
		.fluidOutputs(fluid('brine') * 10000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Soy Milk -> Vinegar Milk
	mods.gregtech.mixer.recipeBuilder()
		.fluidInputs(
	        fluid('soy_milk') * 9000, 
	        fluid('vinegar') * 1000)
		.circuitMeta(16)
		.fluidOutputs(fluid('milk_vinegar') * 10000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Flux -> Limewater
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:powder/flux'))
		.fluidInputs(fluid('fresh_water') * 500)
		.circuitMeta(16)
		.fluidOutputs(fluid('limewater') * 500)
		.duration(150).EUt(2).buildAndRegister()
	
	// Gypsum -> Alabaster
	mods.gregtech.mixer.recipeBuilder()
		.inputs(metaitem('dustGypsum') * 2)
		.fluidInputs(fluid('limewater') * 100)
		.circuitMeta(16)
		.outputs(item('tfc:alabaster/raw/plain'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Powderkeg
	mods.gregtech.assembler.recipeBuilder()
		.inputs(
			item('minecraft:gunpowder'), 
			ore('barrel'), 
			ore('dyeRed'))
		.circuitMeta(16)
		.outputs(item('tfc:powderkeg'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Kaolinite Dust
	mods.gregtech.macerator.recipeBuilder()
		.inputs(metaitem('dustMica'))
		.outputs(item('tfc:powder/kaolinite') * 6)
		.duration(100).EUt(2).buildAndRegister()
	
	// Flux Dust
	mods.gregtech.macerator.recipeBuilder()
		.inputs(ore('rockFlux'))
		.outputs(item('tfc:powder/flux') * 6)
		.duration(100).EUt(2).buildAndRegister()
	
	// Graphite Dust
	mods.gregtech.macerator.recipeBuilder()
		.inputs(metaitem('dustGraphite'))
		.outputs(item('tfc:powder/graphite') * 6)
		.duration(100).EUt(2).buildAndRegister()
	
	// Alabaster -> Colored Alabaster
	for (int i = 0; i < TerraFirmaCraft.tfcAlabaster.size(); i++) {
		mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(item('tfc:alabaster/raw/plain'))
			 .fluidInputs(Minecraft.colorLiquid[i] * 18)
			.outputs(TerraFirmaCraft.tfcAlabaster[i])
			.duration(20).EUt(7).buildAndRegister()
	}
	
	// Smooth Alabaster -> Colored Smooth Alabaster
	for (int i = 0; i < TerraFirmaCraft.tfcAlabasterPolished.size(); i++) {
		mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(item('tfc:alabaster/polished/plain'))
			 .fluidInputs(Minecraft.colorLiquid[i] * 18)
			.outputs(TerraFirmaCraft.tfcAlabasterPolished[i])
			.duration(20).EUt(7).buildAndRegister()
	}
	
	// Bricks Alabaster -> Colored Bricks Alabaster
	for (int i = 0; i < TerraFirmaCraft.tfcAlabasterBricks.size(); i++) {
		mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(item('tfc:alabaster/bricks/plain'))
			 .fluidInputs(Minecraft.colorLiquid[i] * 18)
			.outputs(TerraFirmaCraft.tfcAlabasterBricks[i])
			.duration(20).EUt(7).buildAndRegister()
	}
	
	// Any Alabaster Raw -> Alabaster Plain
	mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(ore('alabasterRaw'))
			 .fluidInputs(fluid('chlorine') * 20)
			.outputs(item('tfc:alabaster/raw/plain'))
			.duration(20).EUt(7).buildAndRegister()
	
	// Any Alabaster Polished -> Alabaster Polished
	mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(ore('alabasterPolished'))
			 .fluidInputs(fluid('chlorine') * 20)
			.outputs(item('tfc:alabaster/polished/plain'))
			.duration(20).EUt(7).buildAndRegister()
	
	// Any Alabaster Bricks -> Alabaster Bricks
	mods.gregtech.chemical_bath.recipeBuilder()
			.inputs(ore('alabasterBricks'))
			 .fluidInputs(fluid('chlorine') * 20)
			.outputs(item('tfc:alabaster/bricks/plain'))
			.duration(20).EUt(7).buildAndRegister()
	
	// Milk -> Curdled Milk
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:rennet'))
		.fluidInputs(fluid('milk') * 2000)
		.circuitMeta(16)
		.fluidOutputs(fluid('milk_curdled') * 2000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Yak Milk -> Curdled Yak Milk
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:rennet'))
		.fluidInputs(fluid('yak_milk') * 2000)
		.circuitMeta(16)
		.fluidOutputs(fluid('curdled_yak_milk') * 2000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Goat Milk -> Curdled Goat Milk
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:rennet'))
		.fluidInputs(fluid('goat_milk') * 2000)
		.circuitMeta(16)
		.fluidOutputs(fluid('curdled_goat_milk') * 2000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Zebu Milk -> Curdled Milk
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:rennet'))
		.fluidInputs(fluid('zebu_milk') * 2000)
		.circuitMeta(16)
		.fluidOutputs(fluid('milk_curdled') * 2000)
		.duration(150).EUt(2).buildAndRegister()
	
	// Kaolinite -> Kaolinite Clay
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('tfc:powder/kaolinite'))
		.fluidInputs(fluid('fresh_water') * 100)
		.circuitMeta(16)
		.outputs(item('tfcflorae:ceramics/kaolinite/kaolinite_clay'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Milk Curd -> Gouda Wheel
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:milk_curd') * 3)
		.fluidInputs(fluid('salt_water') * 750)
		.circuitMeta(16)
		.outputs(item('firmalife:gouda_wheel'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Goat Curd -> Feta Wheel
	mods.gregtech.mixer.recipeBuilder()
		.inputs(item('firmalife:goat_curd') * 3)
		.fluidInputs(fluid('salt_water') * 750)
		.circuitMeta(16)
		.outputs(item('firmalife:feta_wheel'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Yak Curd -> Shosha Wheel
	mods.gregtech.mixer.recipeBuilder()
	    .circuitMeta(16)
		.inputs(item('firmalife:yak_curd') * 3)
		.fluidInputs(fluid('salt_water') * 750)
		.outputs(item('firmalife:shosha_wheel'))
		.duration(150).EUt(2).buildAndRegister()
	
	// Wiremill recipes for yarn from fibers
	for (int i = 0; i < TerraFirmaCraft.tfcStrings.size(); i++) {
		mods.gregtech.wiremill.recipeBuilder()
			.inputs(TerraFirmaCraft.tfcFibres[i])
			.outputs(TerraFirmaCraft.tfcStrings[i] * 12)
			.duration(20).EUt(7).buildAndRegister()
	}
}