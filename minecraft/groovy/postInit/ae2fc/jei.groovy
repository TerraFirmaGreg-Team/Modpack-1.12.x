// MODS_LOADED: ae2fc


// --- Массивы

def removeRecipe = [
   item('ae2fc:fluid_level_maintainer'),
   item('ae2fc:fluid_assembler'),
   item('ae2fc:burette'),
   item('ae2fc:ingredient_buffer'),
   item('ae2fc:large_ingredient_buffer'),
   item('ae2fc:dual_interface'),
   item('ae2fc:fluid_packet_decoder'),
   item('ae2fc:fluid_pattern_encoder'),
   item('ae2fc:fluid_discretizer'),
   item('ae2fc:part_fluid_pattern_terminal'),
   item('ae2fc:part_fluid_pattern_ex_terminal'),
   item('ae2fc:ultimate_encoder')
]


// --- Удаление рецептов

for (item in removeRecipe) {
    crafting.removeByOutput(item)
}
