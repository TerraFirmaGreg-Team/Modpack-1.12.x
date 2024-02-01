
if (isLoaded("travelersbackpack")) {

    // --- Добавление рецептов
    
    // Рюкзак
    crafting.addShaped("tfg/travelersbackpacks/travelers_backpack", item('travelersbackpack:travelers_backpack'), [
        [ore('leather'), metaitem('plateDoubleGold'), ore('leather')],
        [metaitem('drum.steel'), ore('chestWood'), metaitem('drum.steel')],
        [ore('leather'), ore('bed'), ore('leather')]])
    
    // Носик
    crafting.addShaped("tfg/travelersbackpacks/hose_nozzle", item('travelersbackpack:hose_nozzle'), [
        [metaitem('ringGold'), item('minecraft:lever'), null]])
    
    // Шланг
    crafting.addShaped("tfg/travelersbackpacks/hose", item('travelersbackpack:hose'), [
        [item('travelersbackpack:hose_nozzle'), ore('dyeGreen'), null],
        [ore('dyeGreen'), metaitem('plateRubber'), ore('dyeGreen')],
        [null, ore('dyeGreen'), metaitem('plateRubber')]])
}