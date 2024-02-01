// MODS_LOADED: gregtechfoodoption1

import classes.Array.TerraFirmaCraft
import classes.Function

	// --- Добавление рецептов
	
	// Adobe Bricks
	crafting.addShaped("tfg/gtfo/adobe_bricks", item('gregtechfoodoption:gtfo_casing'),
		[[ore('mudBrick'), ore('mudBrick'), null],
		[ore('mudBrick'), ore('mudBrick'), null],
		[null, null, null]])
	
	// Reinforced Adobe Bricks
	crafting.addShaped("tfg/gtfo/reinforced_adobe_bricks", item('gregtechfoodoption:gtfo_casing:1'),
		[[null, ore('toolHammer').transform(Function.setToolDamage), null],
		[ore('mudBrick'), metaitem('plateBronze'), ore('mudBrick')],
		[null, item('gregtechfoodoption:gtfo_casing'), null]])
	
	mods.gregtech.assembler.recipeBuilder()
		.circuitMeta(1)
		.inputs(
			item('gregtechfoodoption:gtfo_casing:0'), 
			ore('mudBrick') * 2, 
			metaitem('plateBronze'))
		.outputs(item('gregtechfoodoption:gtfo_casing:1'))
		.duration(20).EUt(28).buildAndRegister()
	
	mods.gregtech.assembler.recipeBuilder()
		.circuitMeta(3)
		.inputs(
			item('gregtechfoodoption:gtfo_casing:0') * 3, 
			ore('mudBrick') * 6, 
			metaitem('plateBronze') * 3)
		.outputs(item('gregtechfoodoption:gtfo_casing:1') * 3)
		.duration(80).EUt(28).buildAndRegister()
	
	// Unfired Cup
	forming_press.recipeBuilder()
		.inputs(ore('ingotClay') * 5)
		.notConsumable(metaitem('component.paper_cone'))
		.outputs(metaitem('component.unfired_cup') * 2)
		.duration(30).EUt(18).buildAndRegister()
	
	// Baking Oven
	crafting.addShaped("tfg/gtfo/baking_oven", metaitem('gregtechfoodoption:baking_oven'),
		[[ore('toolScrewdriver').transform(Function.setToolDamage), ore('screwIronAny'), ore('screwIronAny')],
		[ore('stickIronAny'), ore('stickIronAny'), item('gregtechfoodoption:gtfo_casing')],
		[ore('toolFile').transform(Function.setToolDamage), ore('screwIronAny'), ore('screwIronAny')]])
	
	// Apple Slice
	crafting.addShapeless("tfg/gtfo/apple_slice", metaitem('component.apple_slice'), [ore('toolKnife').transform(Function.setToolDamage), ore('apple')])
	
	slicer.recipeBuilder()
		.inputs(ore('apple'))
		.notConsumable(metaitem('config.slicer_blade.octagonal'))
		.outputs(metaitem('component.apple_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Mushroom Slice
	crafting.addShapeless("tfg/gtfo/myshroom_slice", metaitem('component.mushroom_slice'), [ore('toolKnife').transform(Function.setToolDamage), item('tfc:plants/porcini')])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:plants/porcini'))
		.notConsumable(metaitem('config.slicer_blade.octagonal'))
		.outputs(metaitem('component.mushroom_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Apple Structural Mesh
	extractor.recipeBuilder()
		.inputs(ore('apple'))
		.outputs(metaitem('component.structural_mesh.apple'))
		.duration(200).EUt(1920).buildAndRegister()
	
	// Kebab Meat Raw
	crafting.addShapeless("tfg/gtfo/kebab_meat_raw", metaitem('component.kebab.meat') * 2, [ore('craftingToolRollingPin'), metaitem('component.skewer'), metaitem('component.skewer'), ore('categoryMeat'), ore('categoryMeat'), ore('categoryMeat'), ore	('categoryMeat'), metaitem('dustSmallSalt')])
	
	cuisine_assembler.recipeBuilder()
		.inputs(
			ore('categoryMeat') * 4, 
			metaitem('component.skewer') * 4, 
			metaitem('dustTinySalt') * 4)
		.outputs(metaitem('component.kebab.meat') * 4)
		.duration(50).EUt(16).buildAndRegister()
	
	// Mince Meat
	large_chemical_reactor.recipeBuilder()
		.inputs(ore('categoryMeat') * 32)
		.fluidInputs(
			fluid('methanol') * 4000, 
			fluid('chloroform') * 4000)
		.outputs(
			metaitem('dustMeat') * 40, 
			item('minecraft:dye:15') * 16)
		.fluidOutputs(
			fluid('gtfo_stearin') * 32000, 
			fluid('gtfo_sludge') * 12000, 
			fluid('chlorine') * 12000)
		.duration(1000).EUt(256).buildAndRegister()
	
	// Mince Meat + BoneMeal + Animal Fat
	centrifuge.recipeBuilder()
		.notConsumable(circuit0)
		.inputs(ore('categoryMeat') * 8)
		.outputs(
			metaitem('dustMeat') * 13, 
			metaitem('dustSmallBone') * 8, 
			metaitem('fat_ingot') * 8)
		.chancedOutput(metaitem('fat_ingot') * 4, 5000, 2000)
		.duration(400).EUt(20).buildAndRegister()
	
	// Fish Oil
	extractor.recipeBuilder()
		.inputs(item('tfc:food/fish'))
		.fluidOutputs(fluid('fish_oil') * 70)
		.duration(16).EUt(4).buildAndRegister()
	
	// Sludge
	mixer.recipeBuilder()
		.inputs(ore('categoryMeat'))
		.fluidInputs(fluid('sulfuric_acid') * 200)
		.fluidOutputs(fluid('gtfo_sludge') * 200)
		.duration(250).EUt(16).buildAndRegister()
	
	mixer.recipeBuilder()
		.inputs(ore('categoryMeat'))
		.fluidInputs(fluid('water') * 400)
		.fluidOutputs(fluid('gtfo_sludge') * 100)
		.duration(500).EUt(16).buildAndRegister()
	
	// Potato Juice
	fermenter.recipeBuilder()
		.inputs(item('tfc:food/potato'))
		.fluidInputs(fluid('water') * 1000)
		.fluidOutputs(fluid('gtfo_potato_juice') * 1000)
		.duration(1000).EUt(8).buildAndRegister()
	
	// Rotten Food
	fermenter.recipeBuilder()
		.inputs(ore('categoryMeat'))
		.fluidInputs(fluid('water') * 100)
		.outputs(metaitem('food.meat_rotten'))
		.fluidOutputs(fluid('water') * 100)
		.duration(100).EUt(8).buildAndRegister()
	
	// Cooked Meat
	for (int i = 0; i < arrayTFC.tfcCookedMeat.size(); i++) {
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcRawMeat[i], 
				item('minecraft:coal:*') * 2)
			.outputs(arrayTFC.tfcCookedMeat[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
	
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcRawMeat[i], 
				metaitem('gemCoke'))
			.outputs(arrayTFC.tfcCookedMeat[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
	
		// electric_baking_oven.recipeBuilder()
		//     .inputs(arrayTFC.tfcRawMeat[i])
		//     .outputs(arrayTFC.tfcCookedMeat[i])
		//     .temperature(400)
		//     .duration(225).EUt(1).buildAndRegister()
	}
	
	// Bread
	for (int i = 0; i < arrayTFC.tfcBreads.size(); i++) {
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcDoughs[i], 
				item('minecraft:coal:*') * 2)
			.outputs(arrayTFC.tfcBreads[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
		
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcDoughs[i], 
				metaitem('gemCoke'))
			.outputs(arrayTFC.tfcBreads[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
		
		// electric_baking_oven.recipeBuilder()
		// 	.inputs(arrayTFC.tfcDoughs[i])
		// 	.outputs(arrayTFC.tfcBreads[i])
		//  .temperature(500)
		// 	.duration(225).EUt(1).buildAndRegister()
	}
	
	// Flatbread
	for (int i = 0; i < arrayTFC.tfcFlatBreads.size(); i++) {
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcFlatDoughs[i], 
				item('minecraft:coal:*') * 2)
			.outputs(arrayTFC.tfcFlatBreads[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
		
		baking_oven.recipeBuilder()
			.inputs(
				arrayTFC.tfcFlatDoughs[i], 
				metaitem('gemCoke'))
			.outputs(arrayTFC.tfcFlatBreads[i])
			.temperature(500)
			.duration(400).EUt(1).buildAndRegister()
		
		// electric_baking_oven.recipeBuilder()
		// 	.inputs(arrayTFC.tfcFlatDoughs[i])
		// 	.outputs(arrayTFC.tfcFlatBreads[i])
		//  .temperature(500)
		// 	.duration(225).EUt(1).buildAndRegister()
	}
	
	// Flour -> Flat Dough
	for (int i = 0; i < arrayTFC.tfcFlatDoughs.size(); i++) {
		mixer.recipeBuilder()
			.inputs(
				arrayTFC.tfcFlour[i], 
				metaitem('dustSmallSalt'))
			.fluidInputs(fluid('fresh_water') * 1000)
			.outputs(arrayTFC.tfcFlatDoughs[i])
			.duration(400).EUt(2).buildAndRegister()
	}
	
	// Flat Dough -> Dough
	for (int i = 0; i < arrayTFC.tfcDoughs.size(); i++) {
		mixer.recipeBuilder()
			.inputs(
				arrayTFC.tfcFlatDoughs[i], 
				ore('sweetener'))
			.fluidInputs(fluid('yeast_starter') * 1000)
			.outputs(arrayTFC.tfcDoughs[i])
			.duration(400).EUt(2).buildAndRegister()
	}
	
	// Uncooked Bacon
	crafting.addShapeless("tfg/gtfo/uncooked_bacon", metaitem('component.bacon') * 3, [item('tfc:food/pork'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/pork'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.bacon') * 6)
		.duration(30).EUt(18).buildAndRegister()
	
	// Beef Slice
	slicer.recipeBuilder()
		.inputs(item('tfc:food/beef'))
		.notConsumable(metaitem('config.slicer_blade.stripes'))
		.outputs(metaitem('component.beef_slice') * 9)
		.duration(80).EUt(24).buildAndRegister()
	
	// Meat Sandwich
	crafting.addShapeless("tfg/gtfo/meat_sandwich", metaitem('food.sandwich.steak'), [metaitem('component.breads'), ore('categoryCookedMeat')])
	
	cuisine_assembler.recipeBuilder()
		.inputs(
			metaitem('component.breads') * 3, 
			metaitem('food.cheddar_slice') * 3, 
			ore('categoryCookedMeat'))
		.outputs(metaitem('food.sandwich.steak') * 3)
		.duration(120).EUt(30).buildAndRegister()
	
	// Large Meat Sandwich
	cuisine_assembler.recipeBuilder()
		.inputs(
			metaitem('component.baguettes') * 3, 
			metaitem('food.cheddar_slice') * 3, 
			ore('categoryCookedMeat') * 3)
		.outputs(metaitem('food.sandwich.steak.large') * 3)
		.duration(240).EUt(75).buildAndRegister()
	
	// Rabbit Stew
	mixer.recipeBuilder()
		.inputs(
			item('tfc:food/cooked_rabbit'), 
			item('tfc:food/carrot'), 
			item('tfc:plants/porcini'), 
			metaitem('mashed_potato_dust'), 
			ore('flour'))
		.fluidInputs(fluid('water') * 50)
		.fluidOutputs(fluid('gtfo_rabbit_stew') * 125)
		.duration(100).EUt(8).buildAndRegister()
	
	// Melon Seeds
	macerator.recipeBuilder()
		.inputs(item('firmalife:melon'))
		.outputs(item('firmalife:crop/seeds/melon'))
		.duration(400).EUt(2).buildAndRegister()
	
	macerator.recipeBuilder()
		.inputs(item('firmalife:melon_fruit'))
		.outputs(item('firmalife:melon') * 8)
		.chancedOutput(item('firmalife:crop/seeds/melon'), 8000, 500)
		.duration(400).EUt(2).buildAndRegister()
	
	// Melon Block
	packer.recipeBuilder()
		.notConsumable(circuit9)
		.inputs(item('firmalife:melon') * 9)
		.outputs(item('firmalife:melon_fruit'))
		.duration(200).EUt(2).buildAndRegister()
	
	// Glistering Melon
	chemical_reactor.recipeBuilder()
		.inputs(item('firmalife:melon'), ore('nuggetGold') * 8)
		.outputs(item('minecraft:speckled_melon'))
		.duration(50).EUt(30).buildAndRegister()
	
	// Pre-Sliced Bread
	crafting.addShapeless("tfg/gtfo/presliced_bread", metaitem('component.breads'), [ore('categoryBread'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(ore('categoryBread'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.breads'))
		.duration(30).EUt(18).buildAndRegister()
	
	// Carrot Slice
	crafting.addShapeless("tfg/gtfo/carrot_slice", metaitem('component.carrot_slice') * 4, [item('tfc:food/carrot'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/carrot'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.carrot_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Onion Slice
	crafting.addShapeless("tfg/gtfo/onion_slice", metaitem('component.onion_slice') * 4, [item('tfc:food/onion'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/onion'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.onion_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Olive Slice
	crafting.addShapeless("tfg/gtfo/olive_slice", metaitem('component.olive_slice') * 4, [item('tfc:food/olive'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/olive'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.olive_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Tomato Slice
	crafting.addShapeless("tfg/gtfo/tomato_slice", metaitem('component.tomato_slice') * 4, [item('tfc:food/tomato'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/tomato'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.tomato_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Cabbage Slice
	crafting.addShapeless("tfg/gtfo/cabbage_slice", metaitem('component.cucumber_slice') * 4, [item('tfc:food/cabbage'), ore('toolKnife').transform(Function.setToolDamage)])
	
	slicer.recipeBuilder()
		.inputs(item('tfc:food/cabbage'))
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.cucumber_slice') * 8)
		.duration(30).EUt(18).buildAndRegister()
	
	// Peeled Potato
	slicer.recipeBuilder()
		.inputs(item('tfc:food/potato'))
		.fluidInputs(fluid('water') * 500)
		.notConsumable(metaitem('config.slicer_blade.flat'))
		.outputs(metaitem('component.potato.peeled'))
		.fluidOutputs(fluid('gtfo_starch_filled_water') * 500)
		.duration(40).EUt(8).buildAndRegister()
	
	// Mashed Potato
	macerator.recipeBuilder()
		.inputs(item('tfc:food/potato'))
		.outputs(metaitem('mashed_potato_dust'))
		.duration(40).EUt(4).buildAndRegister()
	
	// Carrot Structural Mesh
	extractor.recipeBuilder()
		.inputs(item('tfc:food/carrot'))
		.outputs(metaitem('mashed_potato_dust'))
		.duration(200).EUt(1920).buildAndRegister()
	
	// Carrots on a Skewel Kebab
	crafting.addShapeless("tfg/gtfo/kebab_carrot", metaitem('component.kebab.carrot') * 2, [ore('toolKnife').transform(Function.setToolDamage), metaitem('dustSalt'), item('tfc:food/carrot'), item('tfc:food/carrot'), metaitem('component.skewer'), metaitem	('component.skewer')])
	
	// Beetroot Soup
	mixer.recipeBuilder()
		.inputs(
			item('tfc:food/beet') * 2, 
			ore('flour'))
		.fluidInputs(fluid('water') * 100)
		.fluidOutputs(fluid('gtfo_beetroot_soup') * 125)
		.duration(100).EUt(8).buildAndRegister()
	
	// Chum * 3
	mixer.recipeBuilder()
		.inputs(
			metaitem('food.meat_rotten'), 
			item('minecraft:fermented_spider_eye'), 
			item('tfc:plants/amanita'))
		.fluidInputs(fluid('gtfo_sludge') * 100)
		.outputs(metaitem('food.chum') * 3)
		.duration(100).EUt(24).buildAndRegister()
	
	// Chum * 6
	mixer.recipeBuilder()
		.inputs(
			metaitem('food.meat_rotten'), 
			item('minecraft:fermented_spider_eye'), 
			item('tfc:plants/amanita'))
		.fluidInputs(
			fluid('gtfo_sludge') * 100, 
			fluid('gtfo_purple_drink') * 100)
		.outputs(metaitem('food.chum') * 6)
		.duration(100).EUt(24).buildAndRegister()
	
	// Raw Olive and Mushroom Pizza
	cuisine_assembler.recipeBuilder()
		.inputs(
			item('firmalife:pizza_dough'), 
			metaitem('component.mozzarella_slice') * 3, 
			metaitem('component.mushroom_slice') * 8, 
			metaitem('component.olive_slice') * 8)
		.fluidInputs(fluid('gtfo_tomato_sauce') * 300)
		.outputs(metaitem('component.pizza.veggie'))
		.duration(400).EUt(180).buildAndRegister()
	
	// Raw Cheese Pizza
	cuisine_assembler.recipeBuilder()
		.circuitMeta(0)
		.inputs(
			item('firmalife:pizza_dough'), 
			metaitem('component.mozzarella_slice') * 8)
		.fluidInputs(fluid('gtfo_tomato_sauce') * 600)
		.outputs(metaitem('component.pizza.cheese'))
		.duration(400).EUt(180).buildAndRegister()
	
	// Raw Mince Meat Pizza
	cuisine_assembler.recipeBuilder()
		.inputs(
			item('firmalife:pizza_dough'), 
			metaitem('component.mozzarella_slice') * 4, 
			metaitem('dustMeat') * 10)
		.fluidInputs(fluid('gtfo_tomato_sauce') * 450)
		.outputs(metaitem('component.pizza.mince_meat'))
		.duration(400).EUt(180).buildAndRegister()
	
	// Pie Crust
	crafting.addShapeless("tfg/gtfo/pie_crust", metaitem('component.pie_crust'), [ore('doughYeast'), ore('craftingToolRollingPin')])
	
	// Unbaked Baguette
	crafting.addShaped("tfg/gtfo/unbaked_baguette", metaitem('component.baguette'),[
		[null, null, null],
		[ore('dough'), ore('dough'), ore('dough')],
		[null, metaitem('wooden_form.baguette').reuse(), null]])
	
	forming_press.recipeBuilder()
		.notConsumable(metaitem('wooden_form.baguette'))
		.inputs(ore('dough') * 2)
		.outputs(metaitem('component.baguette'))
		.duration(100).EUt(20).buildAndRegister()
	
	// Unbaked Bun
	crafting.addShaped("tfg/gtfo/unbaked_bun", metaitem('component.bun'),[
		[null, null, null],
		[null, ore('dough'), null],
		[null, metaitem('wooden_form.baguette').reuse(), null]])
	
	forming_press.recipeBuilder()
		.inputs(ore('dough') * 2)
		.notConsumable(metaitem('wooden_form.bun'))
		.outputs(metaitem('component.bun'))
		.duration(100).EUt(20).buildAndRegister()
	
	// Mushroom Stew
	mixer.recipeBuilder()
		.inputs(
			ore('mushroombrown'), 
			item('tfc:plants/amanita'), 
			ore('flour'))
		.fluidInputs(fluid('milk') * 25)
		.fluidOutputs(fluid('gtfo_mushroom_soup') * 50)
		.duration(100).EUt(8).buildAndRegister()
	
	// Zest
	extractor.recipeBuilder()
		.inputs(item('tfc:food/lemon'))
		.outputs(metaitem('zest_dust'))
		.fluidOutputs(fluid('gtfo_mushroom_soup') * 50)
		.duration(200).EUt(5).buildAndRegister()
	
	// Raw Koobideh Kebab
	crafting.addShaped("tfg/gtfo/raw_koobideh_kebab", metaitem('component.kebab.kubide'), [
		[ore('craftingToolRollingPin'), metaitem('kubide_meat_dust'), metaitem('kubide_meat_dust')],
		[metaitem('dustSmallSalt'), metaitem('kubide_meat_dust'), metaitem('kubide_meat_dust')],
		[metaitem('component.skewer'), item('tfc:food/tomato'), metaitem('dustSmallSalt')]])
	
	// Toughened Meat
	crafting.addShapeless("tfg/gtfo/toughende_meat", metaitem('tough_meat_dust'), [ore('flour'), metaitem('dustMeat'), metaitem('dustMeat'), item('minecraft:water_bucket')])
	
	mixer.recipeBuilder()
		.inputs(
			ore('flour'), 
			metaitem('dustMeat'))
		.fluidInputs(fluid('water') * 500)
		.outputs(metaitem('tough_meat_dust'))
		.duration(90).EUt(16).buildAndRegister()
	
	// Olive Oil
	extractor.recipeBuilder()
		.inputs(item('tfc:food/olive'))
		.fluidOutputs(fluid('gtfo_olive_oil') * 100)
		.duration(60).EUt(27).buildAndRegister()
	
	// Koobideh Ingredients
	crafting.addShaped("tfg/gtfo/koobideh_ingredients", metaitem('kubide_meat_dust') * 4, [
		[metaitem('dustSalt'), item('tfc:food/tomato'), item('tfc:food/onion')],
		[metaitem('dustMeat'), metaitem('dustMeat'), metaitem('dustMeat')],
		[metaitem('fat_ingot'), metaitem('dustMeat'), metaitem('fat_ingot')]])
	
	// Barg Ingredients
	crafting.addShaped("tfg/gtfo/barg_ingredients", metaitem('barg_meat_dust') * 4, [
		[metaitem('dustSalt'), metaitem('dustMeat'), item('firmalife:dried_olive')],
		[metaitem('dustMeat'), item('tfc:food/onion'), metaitem('dustMeat')],
		[metaitem('zest_dust'), metaitem('dustMeat'), metaitem('zest_dust')]])
	
	// Nailed Onions Kebab
	crafting.addShapeless("tfg/gtfo/nailed_onions_kebab", metaitem('component.kebab.onion') * 2, [ore('toolKnife').transform(Function.setToolDamage), metaitem('dustSalt'), item('tfc:food/onion'), item('tfc:food/onion'), metaitem('component.skewer'), metaitem	('component.skewer')])
	
	// Kebab e Soltani!
	cuisine_assembler.recipeBuilder()
		.inputs(
			metaitem('food.kebab.barg') * 2, 
			metaitem('food.kebab.kubide'), 
			item('tfc:food/tomato') * 3, 
			item('tfc:food/onion') * 2, 
			item('tfc:food/lemon'))
		.fluidInputs(
			fluid('gtfo_lemon_extract') * 250, 
			fluid('gtfo_stearin') * 1000)
		.outputs(
			metaitem('food.kebab.soltani') * 2, 
			metaitem('component.skewer'))
		.duration(200).EUt(120).buildAndRegister()
	
	// Chum on Skewel
	cuisine_assembler.recipeBuilder()
		.inputs(
			metaitem('food.chum') * 8, 
			metaitem('component.banana_peel') * 2, 
			item('tfc:food/onion'), 
			metaitem('mashed_potato_dust') * 4, 
			metaitem('component.skewer') * 4)
		.fluidInputs(
			fluid('gtfo_lemon_extract') * 200, 
			fluid('gtfo_stearin') * 400)
		.outputs(metaitem('component.kebab.chum') * 4)
		.duration(200).EUt(16).buildAndRegister()
	
	// Banana Peel
	canner.recipeBuilder()
		.inputs(item('tfc:food/banana'))
		.outputs(
			metaitem('component.banana_peel'), 
			metaitem('food.peeled_banana'))
		.duration(35).EUt(32).buildAndRegister()
	
	// Seed Oil
	extractor.recipeBuilder()
		.inputs(item('tfc:crop/seeds/soybean'))
		.outputs(metaitem('dustSmallWood'))
		.fluidOutputs(fluid('seed_oil') * 28)
		.duration(200).EUt(16).buildAndRegister()
	
	// Zest From Lemon
	crafting.addShapeless("tfg/gtfo/zest_from_lemon", metaitem('zest_dust'), [item('tfc:food/lemon'), item('tfc:food/lemon'), item('tfc:food/lemon'), item('tfc:food/lemon'), ore('toolMortar').transform(Function.setToolDamage)])
	
	// Zest From Orange
	crafting.addShapeless("tfg/gtfo/zest_from_orange", metaitem('zest_dust'), [item('tfc:food/orange'), item('tfc:food/orange'), item('tfc:food/orange'), item('tfc:food/orange'), ore('toolMortar').transform(Function.setToolDamage)])
	
	// Zest + Orange Juice
	extractor.recipeBuilder()
		.inputs(item('tfc:food/orange'))
		.outputs(metaitem('zest_dust'))
		.fluidOutputs(fluid('gtfo_orange_extract') * 100)
		.duration(100).EUt(5).buildAndRegister()
	
	// Leninade
	mixer.recipeBuilder()
		.inputs(
			ore('flour'), 
			metaitem('dustMeat'))
		.fluidInputs(
			fluid('vodka') * 1000, 
			fluid('gtfo_lemon_extract') * 100)
		.fluidOutputs(fluid('gtfo_leninade') * 1100)
		.duration(30).EUt(12).buildAndRegister()
	
	// Vodka Jar
	canner.recipeBuilder()
		.inputs(item('minecraft:glass_bottle'))
		.fluidInputs(fluid('vodka') * 100)
		.outputs(metaitem('food.vodka'))
		.duration(30).EUt(12).buildAndRegister()
	
	// // Vodka Liquid
	// fermenter.recipeBuilder()
	// 	.fluidInputs([fluid('gtfo_potato_juice') * 2000])
	// 	.fluidOutputs([fluid('vodka') * 2000])
	// 	.duration(3000).EUt(8).buildAndRegister()
	
	// // Cider Liquid
	// fermenter.recipeBuilder()
	// 	.fluidInputs([fluid('gtfo_apple_extract') * 100])
	// 	.fluidOutputs([fluid('cider') * 100])
	// 	.duration(150).EUt(2).buildAndRegister()
	
	// Cider -> Plant Ball
	distillation_tower.recipeBuilder()
		.fluidInputs(fluid('cider') * 1000)
		.outputs(metaitem('plant_ball'))
		.fluidOutputs(
			fluid('methanol') * 100, 
			fluid('carbon_dioxide') * 400, 
			fluid('methane') * 500, 
			fluid('acetic_acid') * 80, 
			fluid('ethanol') * 210, 
			fluid('water') * 400)
		.duration(40).EUt(120).buildAndRegister()
