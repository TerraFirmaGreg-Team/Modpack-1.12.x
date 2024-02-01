

if (isLoaded("toolbelt")) {

    // --- Добавление рецептов
    
    // Поясная сумка
    crafting.addShaped("tfg/toolbelts/pouch", item('toolbelt:pouch'), [
        [ore('string'), metaitem('ringGold'), ore('string')],
        [ore('leather'), null, ore('leather')],
        [ore('string'), ore('leather'), ore('string')]])
    
    // Пояс
    crafting.addShaped("tfg/toolbelts/belt", item('toolbelt:belt'), [
        [ore('string'), ore('leather'), ore('string')],
        [ore('leather'), null, ore('leather')],
        [ore('leather'), ore('ringIronAny'), ore('leather')]])
}