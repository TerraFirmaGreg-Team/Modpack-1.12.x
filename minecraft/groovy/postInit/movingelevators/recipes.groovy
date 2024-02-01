// MODS_LOADED: movingelevators


// --- Добавление рецептов

// Elevator Controller
crafting.addShaped("tfg/movingelevators/elevator_block", item('movingelevators:elevator_block'), 
    [[metaitem('gearIron'), ore('circuitLv'), metaitem('gearIron')],
     [metaitem('electric.piston.lv'), item('gregtech:machine_casing:1'), metaitem('electric.piston.lv')],
     [metaitem('gearIron'), ore('circuitLv'), metaitem('gearIron')]])

// Elevator Screen
crafting.addShaped("tfg/movingelevators/display_block", item('movingelevators:display_block'), 
    [[metaitem('plateGlass'), metaitem('plateGlass'), metaitem('plateGlass')],
     [metaitem('stickIronMagnetic'), item('gregtech:machine_casing:1'), metaitem('stickIronMagnetic')],
     [ore('circuitLv'), metaitem('stickIronMagnetic'), ore('circuitLv')]])

// Remote Elevator Panel
crafting.addShaped("tfg/movingelevators/button_block", item('movingelevators:button_block'), 
    [[null, item('appliedenergistics2:material:41'), null],
     [item('projectred-illumination:light_button'), item('movingelevators:elevator_block'), item('projectred-illumination:light_button')],
     [null, null, null]])
