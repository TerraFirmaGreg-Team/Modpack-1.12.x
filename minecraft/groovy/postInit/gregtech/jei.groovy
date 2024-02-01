

if (isLoaded("gregtech")) {

   // --- Массивы

   def removeAndHide = [
   	// Marble and Basalt
   	item('gregtech:stone_tiled_small', 2),
   	item('gregtech:stone_bricks_small', 2),
   	item('gregtech:stone_windmill_a', 2),
   	item('gregtech:stone_windmill_b', 2),
   	item('gregtech:stone_bricks_square', 2),
   	item('gregtech:stone_smooth', 3),
   	item('gregtech:stone_cobble', 3),
   	item('gregtech:stone_cobble_mossy', 3),
   	item('gregtech:stone_polished', 3),
   	item('gregtech:stone_bricks', 3),
   	item('gregtech:stone_bricks_cracked', 3),
   	item('gregtech:stone_bricks_mossy', 3),
   	item('gregtech:stone_chiseled', 3),
   	item('gregtech:stone_tiled', 3),
   	item('gregtech:stone_tiled_small', 3),
   	item('gregtech:stone_bricks_small', 3),
   	item('gregtech:stone_windmill_a', 3),
   	item('gregtech:stone_windmill_b', 3),
   	item('gregtech:stone_bricks_square', 3),
   	item('gregtech:stone_smooth', 2),
   	item('gregtech:stone_cobble', 2),
   	item('gregtech:stone_cobble_mossy', 2),
   	item('gregtech:stone_polished', 2),
   	item('gregtech:stone_bricks', 2),
   	item('gregtech:stone_bricks_cracked', 2),
   	item('gregtech:stone_bricks_mossy', 2),
   	item('gregtech:stone_chiseled', 2),
   	item('gregtech:stone_tiled', 2),
   	// Tools
   	/*
   	metaitem('toolHeadSwordFlint'),
   	metaitem('toolHeadPickaxeFlint'),
   	metaitem('toolHeadShovelFlint'),
   	metaitem('toolHeadAxeFlint'),
   	metaitem('toolHeadHoeFlint'),
   	metaitem('toolHeadHammerFlint'),
   	metaitem('toolHeadFileFlint'),
   	metaitem('toolHeadSawFlint'),
   	metaitem('toolHeadSenseFlint'),
   	*/
   	// Rubber Stuff
   	item('gregtech:planks'),
   	item('gregtech:rubber_log'),
   	item('gregtech:rubber_leaves'),
   	item('gregtech:rubber_sapling'),
   	// Primitive Blast Furnace
   	metaitem('primitive_blast_furnace.bronze'),
   	// Flour
   	metaitem('dustWheat'),
   	metaitem('dustSmallWheat'),
   	metaitem('dustTinyWheat'),
   	// Compressed Clay
   	metaitem('compressed.fireclay'),
   	// Compressed FireClay
   	metaitem('compressed.fireclay'),
   	metaitem('dustFireclay'),
   	metaitem('dustSmallFireclay'),
   	metaitem('dustTinyFireclay'),
   	// Wooden Barrel
   	metaitem('drum.wood'),
   	// Nether dust
   	metaitem('dustNetherrack'),
   	metaitem('dustSmallNetherrack'),
   	metaitem('dustTinyNetherrack')
   ]

   def removeRecipe = [
      //item('minecraft:paper') * 2,
      item('gregtech:metal_casing:1'),
      item('gregtech:steam_casing:4'),
      metaitem('coke_oven'),
      metaitem('steam_miner'),
      metaitem('steam_macerator_bronze'),
      metaitem('steam_rock_breaker_bronze'),
      metaitem('pump_hatch'),
      metaitem('primitive_water_pump'),
      metaitem('steam_boiler_coal_bronze'),
      metaitem('steam_boiler_coal_steel'),
      metaitem('steam_furnace_bronze'),
      metaitem('steam_alloy_smelter_bronze'),
      metaitem('electric_blast_furnace'),
      metaitem('multi_furnace'),
      metaitem('workbench'),
      metaitem('energy_hatch.input.mv'),
      metaitem('compressed.coke_clay'),
      metaitem('steam_hammer_bronze'),
      metaitem('steam_hammer_steel'),
      metaitem('cover.solar.panel.ulv'),
      metaitem('cover.solar.panel.lv'),
      // metaitem('cover.solar.panel.mv'),
      // metaitem('cover.solar.panel.hv'),
      // metaitem('cover.solar.panel.ev'),
      // metaitem('cover.solar.panel.iv'),
      // metaitem('cover.solar.panel.luv'),
      // metaitem('cover.solar.panel.zpm'),
      // metaitem('cover.solar.panel.uv'),
      metaitem('passthrough_hatch_item')
   ]

   def removeRecipesByName = [
      "gregtech:cobblestone_hammer",
      "gregtech:piston_iron",
      "gregtech:sticky_resin_torch",
      "gregtech:torch_phosphorus",
      "gregtech:torch_coke",
      "gregtech:torch_coke_dust",
      "gregtech:torch_sulfur",
      "gregtech:iron_trapdoor",
      "gregtech:iron_door",
      "gregtech:iron_bars",
      "gregtech:quartz_sand",
      "gregtech:lead",
      "gregtech:redstone_lamp",
      "gregtech:repeater",
      "gregtech:comparator",
      "gregtech:comparator_certus",
      "gregtech:comparator_quartzite",
      "gregtech:daylight_detector",
      "gregtech:daylight_detector_certus",
      "gregtech:daylight_detector_quartzite",
      "gregtech:lever",
      "gregtech:steam_output_bus",
      "gregtech:steam_input_bus",
      "gregtech:glass_pane",
      "gregtech:plank_to_wooden_shape",
      "gregtech:sticks_from_bundle_saw",
      "gregtech:gravel_to_flint",
      "gregtech:dust_bronze",
      "gregtech:bow",
      "gregtech:iron_horse_armor",
      "gregtech:gold_horse_armor",
      "gregtech:diamond_horse_armor",
      "gregtech:sadle",
      "gregtech:wooden_crate",
      "gregtech:painting",
      "gregtech:item_frame",
      "gregtech:tripwire_hook",
      "gregtech:jukebox",
      "gregtech:minecart",
      "gregtech:anvil",
      "gregtech:hopper",
      "gregtech:cauldron",
      "gregtech:light_weighted_pressure_plate",
      "gregtech:observer",
      "gregtech:observer_certus",
      "gregtech:observer_quartzite",
      "gregtech:dispenser",
      "gregtech:dropper",
      "gregtech:clipboard",
      "gregtech:coke_oven_hatch",
      "gregtech:cover_fluid_voiding",
      "gregtech:cover_item_voiding"
   ]


   // --- Удаление рецептов

   for (item in removeAndHide) {
      mods.jei.removeAndHide(item)
   }

   for (item in removeRecipe) {
      crafting.removeByOutput(item)
   }

   // Поименное удаление рецептов
   for (item in removeRecipesByName) {
      crafting.remove(item)
   }

   // Sodium Dust * 1 (#144)
   mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustSalt') * 2], null)

   // ULV Input Bus * 1
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('glue') * 250])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('plastic') * 72])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('polytetrafluoroethylene') * 36])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('polybenzimidazole') * 4])

   // LV Input Bus * 1
   mods.gregtech.assembler.removeByInput(30, [metaitem('hull.lv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('glue') * 500])
   mods.gregtech.assembler.removeByInput(30, [metaitem('hull.lv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('plastic') * 144])
   mods.gregtech.assembler.removeByInput(30, [metaitem('hull.lv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('polytetrafluoroethylene') * 72])
   mods.gregtech.assembler.removeByInput(30, [metaitem('hull.lv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('polybenzimidazole') * 9])

   // ULV Output Bus * 1
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('glue') * 250])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('plastic') * 72])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('polytetrafluoroethylene') * 36])
   mods.gregtech.assembler.removeByInput(7, [metaitem('hull.ulv'), item('minecraft:chest'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('polybenzimidazole') * 4])









}