// MODS_LOADED: architecturecraft

    // --- Добавление рецептов
    
    // Arch Table
    crafting.addShaped("tfg/architecturecraft/sawbench", item('architecturecraft:sawbench'),
        [[ore('plateIronAny'), ore('toolHeadBuzzSawIronAny'), ore('plateIronAny')],
        [ore('plankWood'), ore('gearIronAny'), ore('plankWood')],
        [item('minecraft:stick'), ore('pressurePlateWood'), item('minecraft:stick')]])
    
    // Hammer
    crafting.addShaped("tfg/architecturecraft/hammer", item('architecturecraft:hammer'),
        [[ore('plateIronAny'), ore('plateIronAny'), null],
        [ore('dyeOrange'), item('minecraft:stick'), ore('plateIronAny')],
        [ore('dyeOrange'), item('minecraft:stick'), null]])
    
    // Chisel
    crafting.addShaped("tfg/architecturecraft/chisel", item('architecturecraft:chisel'),
        [[ore('plateIronAny'), null, null],
        [ore('dyeOrange'), item('minecraft:stick'), null],
        [null, null, null]])
