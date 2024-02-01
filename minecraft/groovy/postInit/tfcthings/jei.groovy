

if (isLoaded("tfcthings")) {

    // --- Массивы
    
    def removeAndHide = [
        item('tfcthings:pigvil'),
        item('tfcthings:pigvil_black_steel'),
        item('tfcthings:pigvil_blue_steel'),
        item('tfcthings:pigvil_red_steel'),
        item('tfcthings:pigvil_purple_steel'),
        item('tfcthings:mold/unfired/prospectors_hammer_head'),
        item('tfcthings:mold/prospectors_hammer_head'),
        item('tfcthings:pig_iron_carrot'),
        item('tfcthings:black_steel_carrot'),
        item('tfcthings:blue_steel_carrot'),
        item('tfcthings:red_steel_carrot'),
        // Crowns
        item('tfcthings:crown/gold_beryl'),
        item('tfcthings:crown/gold_agate'),
        item('tfcthings:crown/gold_jade'),
        item('tfcthings:crown/gold_jasper'),
        item('tfcthings:crown/gold_tourmaline'),
        item('tfcthings:crown/platinum_jasper'),
        item('tfcthings:crown/platinum_jade'),
        item('tfcthings:crown/platinum_agate'),
        item('tfcthings:crown/platinum_beryl'),
        item('tfcthings:crown/platinum_tourmaline'),
        // Затачивалки (Временно)
        item('tfcthings:honing_steel'),
        item('tfcthings:honing_steel_diamond'),
        item('tfcthings:honing_steel_head'),
        item('tfcthings:honing_steel_head_diamond'),
        item('tfcthings:grindstone_quartz'),
        item('tfcthings:grindstone_steel'),
        item('tfcthings:grindstone_diamond'),
        item('tfcthings:diamond_grit'),
        item('tfcthings:grindstone_base'),
        item('tfcthings:whetstone')
    ]
    
    def removeRecipe = [
       // Платиновые короны
       item('tfcthings:crown/platinum_opal'),
       item('tfcthings:crown/platinum_garnet'),
       item('tfcthings:crown/platinum_emerald'),
       item('tfcthings:crown/platinum_diamond'),
       item('tfcthings:crown/platinum_amethyst'),
       item('tfcthings:crown/platinum_ruby'),
       item('tfcthings:crown/platinum_sapphire'),
       item('tfcthings:crown/platinum_topaz'),
       // Золотые короны
       item('tfcthings:crown/gold_garnet'),
       item('tfcthings:crown/gold_emerald'),
       item('tfcthings:crown/gold_diamond'),
       item('tfcthings:crown/gold_amethyst'),
       item('tfcthings:crown/gold_topaz'),
       item('tfcthings:crown/gold_sapphire'),
       item('tfcthings:crown/gold_ruby'),
       item('tfcthings:crown/gold_opal'),
       //Other
       item('tfcthings:sling_ammo_light'),
       item('tfcthings:sling_ammo_spread'),
    ]
    
    
    def removeRecipesByName = [
       "tfcthings:grindstone_base_steel",
       "tfcthings:grindstone_base"
    ]
    
    
    // --- Удаление рецептов
    
    for (item in removeAndHide) {
        mods.jei.removeAndHide(item)
    }
    
    for (item in removeRecipe) {
        crafting.removeByOutput(item)
    }
    
    for (item in removeRecipesByName) {
       crafting.remove(item)
    }
}