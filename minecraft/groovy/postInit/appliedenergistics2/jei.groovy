// MODS_LOADED: appliedenergistics2

// --- Массивы
def hideCategory = [
    "appliedenergistics2.inscriber"
]

def hide = [
    item('appliedenergistics2:creative_storage_cell'),
    item('appliedenergistics2:creative_energy_cell')
]

def removeAndHide = [
    item('appliedenergistics2:quartz_block'),
    item('appliedenergistics2:quartz_stairs'),
    item('appliedenergistics2:quartz_slab'),
    item('appliedenergistics2:quartz_pillar'),
    item('appliedenergistics2:quartz_pillar_stairs'),
    item('appliedenergistics2:quartz_pillar_slab'),
    item('appliedenergistics2:chiseled_quartz_block'),
    item('appliedenergistics2:chiseled_quartz_stairs'),
    item('appliedenergistics2:chiseled_quartz_slab'),
    item('appliedenergistics2:material'),
    item('appliedenergistics2:material', 5),
    item('appliedenergistics2:material', 21),
    item('appliedenergistics2:material', 46),
    item('appliedenergistics2:encoded_pattern')
]

def removeRecipe = [
    // item('appliedenergistics2:quartz_glass'),
    // item('appliedenergistics2:quartz_vibrant_glass'),
    // item('appliedenergistics2:quartz_fixture'),
    // item('appliedenergistics2:wireless_access_point'),
    // item('appliedenergistics2:security_station'),
    // item('appliedenergistics2:quantum_ring'),
    // item('appliedenergistics2:quantum_link'),
    // item('appliedenergistics2:spatial_pylon'),
    // item('appliedenergistics2:spatial_io_port'),
    // item('appliedenergistics2:controller'),
    // item('appliedenergistics2:drive'),
    // item('appliedenergistics2:chest'),
    // item('appliedenergistics2:cell_workbench'),
    // item('appliedenergistics2:io_port'),
    // item('appliedenergistics2:condenser'),
    // item('appliedenergistics2:energy_acceptor'),
    // item('appliedenergistics2:energy_cell'),
    // item('appliedenergistics2:dense_energy_cell'),
    // item('appliedenergistics2:crafting_unit'),
    // item('appliedenergistics2:crafting_accelerator'),
    // item('appliedenergistics2:crafting_storage_1k'),
    // item('appliedenergistics2:crafting_storage_4k'),
    // item('appliedenergistics2:crafting_storage_16k'),
    // item('appliedenergistics2:crafting_storage_64k'),
    // item('appliedenergistics2:crafting_monitor'),
    // item('appliedenergistics2:molecular_assembler'),
    // item('appliedenergistics2:light_detector'),
    // item('appliedenergistics2:entropy_manipulator'),
    // item('appliedenergistics2:wireless_terminal'),
    // item('appliedenergistics2:wireless_fluid_terminal'),
    // item('appliedenergistics2:wireless_pattern_terminal'),
    // item('appliedenergistics2:wireless_crafting_terminal'),
    // item('appliedenergistics2:charged_staff'),
    // item('appliedenergistics2:matter_cannon'),
    // item('appliedenergistics2:portable_cell'),
    // item('appliedenergistics2:color_applicator'),
    // item('appliedenergistics2:biometric_card'),
    // item('appliedenergistics2:memory_card'),
    // item('appliedenergistics2:network_tool'),
    // item('appliedenergistics2:view_cell'),
    // item('appliedenergistics2:material', 9),
    // item('appliedenergistics2:material', 25),
    // item('appliedenergistics2:material', 26),
    // item('appliedenergistics2:material', 27),
    // item('appliedenergistics2:material', 28),
    // item('appliedenergistics2:material', 29),
    // item('appliedenergistics2:material', 30),
    // item('appliedenergistics2:material', 31),
    // item('appliedenergistics2:material', 32),
    // item('appliedenergistics2:material', 33),
    // item('appliedenergistics2:material', 34),
    // item('appliedenergistics2:material', 35),
    // item('appliedenergistics2:material', 36),
    // item('appliedenergistics2:material', 37),
    // item('appliedenergistics2:material', 38),
    // item('appliedenergistics2:material', 39),
    // item('appliedenergistics2:material', 41),
    // item('appliedenergistics2:material', 42),
    // item('appliedenergistics2:material', 43),
    // item('appliedenergistics2:material', 44),
    // item('appliedenergistics2:material', 52),
    // item('appliedenergistics2:material', 53),
    // item('appliedenergistics2:material', 54),
    // item('appliedenergistics2:material', 55),
    // item('appliedenergistics2:material', 56),
    // item('appliedenergistics2:material', 57),
    // item('appliedenergistics2:material', 58),
    // item('appliedenergistics2:storage_cell_1k'),
    // item('appliedenergistics2:storage_cell_4k'),
    // item('appliedenergistics2:storage_cell_16k'),
    // item('appliedenergistics2:storage_cell_64k'),
    // item('appliedenergistics2:fluid_storage_cell_1k'),
    // item('appliedenergistics2:fluid_storage_cell_4k'),
    // item('appliedenergistics2:fluid_storage_cell_16k'),
    // item('appliedenergistics2:fluid_storage_cell_64k'),
    // item('appliedenergistics2:spatial_storage_cell_2_cubed'),
    // item('appliedenergistics2:spatial_storage_cell_16_cubed'),
    // item('appliedenergistics2:spatial_storage_cell_128_cubed'),
    // item('appliedenergistics2:part', 340),
    // item('appliedenergistics2:part', 341),
    // item('appliedenergistics2:part', 180),
    // item('appliedenergistics2:part', 300),
    // item('appliedenergistics2:part', 420),
    // item('appliedenergistics2:part', 360),
    // item('appliedenergistics2:part', 260),
    // item('appliedenergistics2:part', 302),
    // item('appliedenergistics2:part', 261),
    // item('appliedenergistics2:part', 321),
    // item('appliedenergistics2:part', 241),
    // item('appliedenergistics2:part', 281),
    // item('appliedenergistics2:part', 221),
    // item('appliedenergistics2:part', 520),
    // item('appliedenergistics2:part', 320),
    // item('appliedenergistics2:part', 301),
    // item('appliedenergistics2:part', 240),
    // item('appliedenergistics2:part', 480),
    // item('appliedenergistics2:part', 280),
    // item('appliedenergistics2:part', 222),
    // item('appliedenergistics2:part', 220),
    // item('appliedenergistics2:part', 400),
    // item('appliedenergistics2:part', 380),
    // item('appliedenergistics2:part', 80),
    // item('appliedenergistics2:part', 460),
    // item('appliedenergistics2:part', 140),
    // item('appliedenergistics2:interface'),
    // item('appliedenergistics2:fluid_interface'),
    // item('appliedenergistics2:fluix_block'),
    // item('appliedenergistics2:paint_ball')
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

// for (item in removeRecipe) {
//     crafting.removeByOutput(item)
// }