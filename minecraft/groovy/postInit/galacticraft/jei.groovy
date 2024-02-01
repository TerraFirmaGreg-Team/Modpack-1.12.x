

if (isLoaded("galacticraftcore")) {

   // --- Массивы

   def hideCategory = [
      //  "galacticraft.buggy",
      //  "galacticraft.oxygencompressor",
      //  "galacticraft.ingotcompressor",
      //  "galacticraft.circuitMetas",
      //  "galacticraft.refinery",
      //  "galacticraft.gas_liquefier",
      //  "galacticraft.methaneSynthesizer",
      //  "galacticraft.astroMiner",
      //  "galacticraft.cargoRocket",
      //  "galacticraft.rocketT1",
      //  "galacticraft.rocketT2",
      //  "galacticraft.rocketT3"
   ]
   
   def hide = [
      item('galacticraftcore:rocket_t1', 4),
      item('galacticraftplanets:rocket_t2', 4),
      item('galacticraftplanets:rocket_t3', 4),
   ]
   
   def removeAndHide = [
      item('galacticraftplanets:slimeling_egg:*'),
      item('galacticraftplanets:creeper_egg'),
      item('galacticraftcore:basic_block_core', 5),
      item('galacticraftcore:basic_block_core', 6),
      item('galacticraftcore:basic_block_core', 7),
      item('galacticraftcore:basic_block_core', 8),
      item('galacticraftcore:basic_block_core', 9),
      item('galacticraftcore:basic_block_core', 10),
      item('galacticraftcore:basic_block_core', 11),
      item('galacticraftcore:basic_block_core', 13),
      item('galacticraftcore:rocket_workbench'),
      item('galacticraftcore:compact_workbench'),
      item('galacticraftcore:prelaunch_checklist'),
      item('galacticraftcore:fallen_meteor'),
      item('galacticraftcore:meteor_chunk:*'),
      item('galacticraftcore:standard_wrench'),
      item('galacticraftplanets:volcanic_pickaxe'),
      item('galacticraftplanets:web_torch:*'),
      item('galacticraftcore:parachest'),
      item('galacticraftcore:cheese_curd'),
      item('galacticraftcore:fluid_tank'),
      item('galacticraftplanets:strange_seed:*'),
      item('galacticraftcore:fluid_pipe'),
      item('galacticraftcore:aluminum_wire:*'),
      // Креативные предметы
      item('galacticraftcore:infinite_battery'),
      item('galacticraftcore:infinite_oxygen'),
      item('galacticraftplanets:rocket_t2', 14),
      item('galacticraftcore:dungeonfinder'),
      item('galacticraftcore:basic_item'),
      item('galacticraftcore:basic_item', 1),
      item('galacticraftcore:basic_item', 2),
      item('galacticraftcore:basic_item', 3),
      item('galacticraftcore:basic_item', 4),
      item('galacticraftcore:basic_item', 5),
      item('galacticraftcore:basic_item', 6),
      item('galacticraftcore:basic_item', 7),
      item('galacticraftcore:basic_item', 8),
      item('galacticraftcore:basic_item', 9),
      item('galacticraftcore:basic_item', 10),
      item('galacticraftcore:basic_item', 11),
      item('galacticraftcore:basic_item', 12),
      item('galacticraftcore:basic_item', 13),
      item('galacticraftcore:basic_item', 14),
      // Стальные броня и инструменты
      item('galacticraftcore:steel_pickaxe'),
      item('galacticraftcore:steel_axe'),
      item('galacticraftcore:steel_hoe'),
      item('galacticraftcore:steel_shovel'),
      item('galacticraftcore:steel_sword'),
      item('galacticraftcore:steel_helmet'),
      item('galacticraftcore:steel_chestplate'),
      item('galacticraftcore:steel_leggings'),
      item('galacticraftcore:steel_boots'),
      // Машины
      item('galacticraftcore:machine', 12),
      item('galacticraftcore:machine2'),
      item('galacticraftcore:machine2', 4),
      item('galacticraftcore:machine'),
      item('galacticraftcore:machine2', 12),
      item('galacticraftcore:refinery'),
      item('galacticraftcore:machine4'),
      item('galacticraftcore:machine_tiered', 12),
      item('galacticraftplanets:mars_machine_t2', 8),
      item('galacticraftplanets:mars_machine_t2', 4),
      item('galacticraftcore:machine_tiered', 8),
      item('galacticraftcore:machine_tiered', 4),
      item('galacticraftcore:machine_tiered'),
      item('galacticraftplanets:mars_machine_t2'),
      item('galacticraftcore:machine2', 8),
   	item('galacticraftplanets:mars_machine'),
      item('galacticraftcore:concealed_detector'),
      item('galacticraftcore:emergency_box:*'),
      item('galacticraftcore:food', 4),
      item('galacticraftcore:food', 5),
      item('galacticraftcore:food', 6),
      item('galacticraftcore:food', 7),
      item('galacticraftcore:food', 8),
      item('galacticraftcore:battery:*'),
      item('galacticraftcore:emergency_kit'),
      item('galacticraftplanets:crashed_probe'),
      item('galacticraftplanets:basic_item_venus', 6),
      item('galacticraftplanets:carbon_fragments'),
      item('galacticraftcore:canister', 1),
      item('galacticraftcore:buggymat', 2)
   ]
   
   def removeRecipe = [
   	item('galacticraftcore:landing_pad:*'),
   	item('galacticraftcore:distributor'),
   	item('galacticraftcore:oxygen_compressor:*'),
   	item('galacticraftcore:sealer'),
   	item('galacticraftcore:oxygen_detector'),
   	item('galacticraftcore:fuel_loader'),
   	item('galacticraftcore:cargo:*'),
   	item('galacticraftcore:basic_block_core:*'),
   	item('galacticraftcore:air_lock_frame:*'),
   	item('galacticraftcore:space_glass_clear:*'),
   	item('galacticraftcore:space_glass_vanilla:*'),
   	item('galacticraftcore:space_glass_strong:*'),
   	item('galacticraftcore:magnetic_table'),
   	item('galacticraftcore:enclosed:*'),
   	item('galacticraftcore:solar:*'),
   	item('galacticraftcore:dishbase'),
   	item('galacticraftcore:machine3'),
      item('galacticraftcore:panel_lighting:*'),
      item('galacticraftcore:glowstone_torch'),
      item('galacticraftcore:spin_thruster'),
      item('galacticraftcore:view_screen'),
      item('galacticraftcore:telemetry'),
      item('galacticraftcore:arclamp'),
      item('galacticraftcore:platform'),
      item('galacticraftcore:oxygen_mask'),
      item('galacticraftcore:oxygen_gear'),
      item('galacticraftcore:sensor_lens'),
      item('galacticraftcore:sensor_glasses'),
      item('galacticraftcore:air_vent'),
      item('galacticraftcore:air_fan'),
      item('galacticraftcore:oxygen_concentrator'),
      item('galacticraftcore:engine:*'),
      item('galacticraftcore:nose_cone'),
      item('galacticraftcore:rocket_fins'),
      item('galacticraftcore:steel_pole'),
      item('galacticraftcore:oil_canister_partial:*'),
      item('galacticraftcore:basic_item:19'),
      item('galacticraftcore:basic_item:20'),
      item('galacticraftcore:food:*'),
      item('galacticraftcore:parachute:*'),
      item('galacticraftplanets:mars_machine', 4),
      item('galacticraftplanets:mars_machine', 8),
      item('galacticraftplanets:item_basic_mars', 1),
      item('galacticraftplanets:item_basic_mars', 2),
      item('galacticraftplanets:item_basic_mars', 4),
      item('galacticraftplanets:thermal_padding:*'),
      item('galacticraftplanets:item_basic_asteroids', 1),
      item('galacticraftplanets:item_basic_asteroids', 2),
      item('galacticraftplanets:item_basic_asteroids', 7),
      item('galacticraftplanets:item_basic_asteroids', 8),
      item('galacticraftplanets:heavy_nose_cone'),
      item('galacticraftplanets:orion_drive'),
      item('galacticraftplanets:geothermal_generator'),
      item('galacticraftplanets:solar_array_module'),
      item('galacticraftplanets:basic_item_venus:5'),
      item('galacticraftplanets:solar_array_controller'),
      item('galacticraftplanets:thermal_padding_t2:*'),
      item('galacticraftplanets:basic_item_venus:3'),
      item('galacticraftplanets:atomic_battery'),
      item('galacticraftplanets:walkway:*'),
      item('galacticraftplanets:beam_reflector'),
      item('galacticraftplanets:beam_receiver'),
      item('galacticraftplanets:telepad_short'),
      item('galacticraftplanets:miner_base'),
      item('galacticraftcore:buggymat:*'),
      item('galacticraftplanets:grapple'),
      item('galacticraftcore:collector'),
      item('galacticraftcore:item_basic_moon'),
      item('galacticraftcore:canister'),
      // item('galacticraftcore:oxygen_tank_heavy_full')
   ]
   
   def removeRecipeFurnace = [
   	item('galacticraftcore:food', 6),
   	item('galacticraftcore:meteoric_iron_raw'),
   	item('galacticraftplanets:venus', 11),
      item('galacticraftplanets:mars', 1),
      item('galacticraftcore:canister'),
      item('galacticraftcore:canister', 1),
   	item('galacticraftplanets:mars', 2),
      item('galacticraftplanets:venus', 7),
      item('galacticraftplanets:mars'),
   ]
   
   def removeRecipesByName = [
   	"galacticraftcore:slime_ball",
   	"galacticraftcore:cobblestone",
   	"galacticraftcore:cobblestone_alt",
   	"galacticraftcore:cobblestone_alt_alt",
   	"galacticraftcore:basic_item_18",
   	"galacticraftcore:basic_item_17",
   	"galacticraftcore:basic_item_16",
   	"galacticraftcore:basic_item_15",
      "galacticraftcore:furnace",
      "galacticraftcore:oxygen_tank_light_full",
      "galacticraftcore:oxygen_tank_med_full",
      "galacticraftcore:oxygen_tank_heavy_full",
      "galacticraftcore:oxygen_tank_light_full_1",
      "galacticraftcore:oxygen_tank_med_full_1",
      "galacticraftcore:oxygen_tank_heavy_full_1"
   ]
   
   
   // --- Удаление рецептов

   for(item in hideCategory) {
      mods.jei.hideCategory(item)
   }
   
   for (item in hide) {
   	mods.jei.hide(item)
   }
   
   for (item in removeAndHide) {
   	mods.jei.removeAndHide(item)
   }
   
   for (item in removeRecipe) {
   	crafting.removeByOutput(item)
   }
   
   for (item in removeRecipeFurnace) {
   	furnace.removeByInput(item)
   }
   
   for (item in removeRecipesByName) {
   	crafting.remove(item)
   }
   
   // Метан
   // mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 4)], null)
   // mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 5)], null)
   // mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 6)], null)
   // mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 7)], null)
   // mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 8)], null)
}