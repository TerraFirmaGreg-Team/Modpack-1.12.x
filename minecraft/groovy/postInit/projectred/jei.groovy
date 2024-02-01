// MODS_LOADED: projectred-core


// --- Массивы

def removeAndHide = [
    item('projectred-core:resource_item', 100),
    item('projectred-core:resource_item', 101),
    item('projectred-core:resource_item', 102),
    item('projectred-core:resource_item', 103),
    item('projectred-core:resource_item', 104),
    item('projectred-core:resource_item', 105),
    item('projectred-core:resource_item', 200),
    item('projectred-core:resource_item', 201),
    item('projectred-core:resource_item', 202),
    item('projectred-core:resource_item', 250),
    item('projectred-core:resource_item', 251),
    item('projectred-core:resource_item', 252),
    item('projectred-core:resource_item', 300),
    item('projectred-core:resource_item', 301),
    item('projectred-core:resource_item', 310),
    item('projectred-core:resource_item', 311),
    item('projectred-core:resource_item', 312),
    item('projectred-core:resource_item', 320),
    item('projectred-core:resource_item', 341),
    item('projectred-core:resource_item', 342),
    item('projectred-core:resource_item', 400),
    item('projectred-core:resource_item', 401),
    item('projectred-core:resource_item', 402),
    item('projectred-core:resource_item', 410),
    item('projectred-core:drawplate'),
    item('projectred-core:screwdriver'),
    item('projectred-fabrication:ic_chip', 1)
]

def removeRecipe = [
    item('projectred-core:resource_item', 20),
    item('projectred-core:resource_item', 21),
    item('projectred-transmission:wire'),
    item('projectred-fabrication:ic_chip'),
    item('projectred-fabrication:ic_blueprint'),
    item('projectred-fabrication:ic_machine', 1),
    item('projectred-core:multimeter'),
    item('projectred-illumination:lamp:*'),
    item('projectred-illumination:light_button:*'),
    item('projectred-illumination:feedback_light_button:*'),
    item('projectred-illumination:lantern:*'),
    item('projectred-illumination:inverted_lantern:*'),
    item('projectred-illumination:fixture_light:*'),
    item('projectred-illumination:inverted_fixture_light:*'),
    item('projectred-illumination:fallout_lamp:*'),
    item('projectred-illumination:inverted_fallout_lamp:*'),
    item('projectred-illumination:cage_lamp:*'),
    item('projectred-illumination:inverted_cage_lamp:*'),
    item('projectred-transmission:wire:*'),
    item('projectred-core:resource_item', 500),
    item('projectred-core:resource_item', 501),
    item('projectred-core:resource_item', 502),
    item('projectred-core:resource_item', 503),
    item('projectred-core:resource_item', 504),
    item('projectred-core:resource_item', 505),
    item('projectred-core:resource_item', 506),
    item('projectred-core:resource_item', 507),
    item('projectred-core:resource_item', 508),
    item('projectred-core:resource_item', 509),
    item('projectred-core:resource_item', 510),
    item('projectred-core:resource_item', 511),
    item('projectred-core:resource_item', 512),
    item('projectred-core:resource_item', 513),
    item('projectred-core:resource_item', 514),
    item('projectred-core:resource_item', 515)
]

def removeRecipeFurnace = [
    item('projectred-core:resource_item', 250),
    item('projectred-core:resource_item', 251),
    item('projectred-core:resource_item', 252),
    item('projectred-core:resource_item', 310),
    item('projectred-core:resource_item', 311),
    item('projectred-core:resource_item', 312)
]

// --- Удаление рецептов
for (item in removeAndHide) {
    mods.jei.removeAndHide(item)
}

for (item in removeRecipe) {
    crafting.removeByOutput(item)
}

// Удаление рецептов печки
for (item in removeRecipeFurnace) {
    furnace.removeByInput(item)
}
