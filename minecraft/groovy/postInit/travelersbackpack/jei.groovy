

if (isLoaded("travelersbackpack")) {

    // --- Массивы

    def removeAndHide = [
        item('travelersbackpack:travelers_backpack', 76),
        item('travelersbackpack:travelers_backpack', 75),
        item('travelersbackpack:travelers_backpack', 74),
        item('travelersbackpack:travelers_backpack', 73),
        item('travelersbackpack:travelers_backpack', 72),
        item('travelersbackpack:travelers_backpack', 71),
        item('travelersbackpack:travelers_backpack', 70),
        item('travelersbackpack:travelers_backpack', 69),
        item('travelersbackpack:travelers_backpack', 68),
        item('travelersbackpack:travelers_backpack', 67),
        item('travelersbackpack:travelers_backpack', 66),
        item('travelersbackpack:travelers_backpack', 65),
        item('travelersbackpack:travelers_backpack', 64),
        item('travelersbackpack:travelers_backpack', 63),
        item('travelersbackpack:travelers_backpack', 62),
        item('travelersbackpack:travelers_backpack', 61),
        item('travelersbackpack:travelers_backpack', 60),
        item('travelersbackpack:travelers_backpack', 59),
        item('travelersbackpack:travelers_backpack', 58),
        item('travelersbackpack:travelers_backpack', 57),
        item('travelersbackpack:travelers_backpack', 56),
        item('travelersbackpack:travelers_backpack', 55),
        item('travelersbackpack:travelers_backpack', 54),
        item('travelersbackpack:travelers_backpack', 53),
        item('travelersbackpack:travelers_backpack', 52),
        item('travelersbackpack:travelers_backpack', 51),
        item('travelersbackpack:travelers_backpack', 50),
        item('travelersbackpack:travelers_backpack', 49),
        item('travelersbackpack:travelers_backpack', 48),
        item('travelersbackpack:travelers_backpack', 47),
        item('travelersbackpack:travelers_backpack', 46),
        item('travelersbackpack:travelers_backpack', 45),
        item('travelersbackpack:travelers_backpack', 44),
        item('travelersbackpack:travelers_backpack', 43),
        item('travelersbackpack:travelers_backpack', 42),
        item('travelersbackpack:travelers_backpack', 41),
        item('travelersbackpack:travelers_backpack', 40),
        item('travelersbackpack:travelers_backpack', 39),
        item('travelersbackpack:travelers_backpack', 38),
        item('travelersbackpack:travelers_backpack', 37),
        item('travelersbackpack:travelers_backpack', 36),
        item('travelersbackpack:travelers_backpack', 35),
        item('travelersbackpack:travelers_backpack', 34),
        item('travelersbackpack:travelers_backpack', 33),
        item('travelersbackpack:travelers_backpack', 32),
        item('travelersbackpack:travelers_backpack', 31),
        item('travelersbackpack:travelers_backpack', 30),
        item('travelersbackpack:travelers_backpack', 29),
        item('travelersbackpack:travelers_backpack', 28),
        item('travelersbackpack:travelers_backpack', 27),
        item('travelersbackpack:travelers_backpack', 26),
        item('travelersbackpack:travelers_backpack', 25),
        item('travelersbackpack:travelers_backpack', 24),
        item('travelersbackpack:travelers_backpack', 23),
        item('travelersbackpack:travelers_backpack', 22),
        item('travelersbackpack:travelers_backpack', 21),
        item('travelersbackpack:travelers_backpack', 20),
        item('travelersbackpack:travelers_backpack', 19),
        item('travelersbackpack:travelers_backpack', 18),
        item('travelersbackpack:travelers_backpack', 17),
        item('travelersbackpack:travelers_backpack', 16),
        item('travelersbackpack:travelers_backpack', 15),
        item('travelersbackpack:travelers_backpack', 14),
        item('travelersbackpack:travelers_backpack', 13),
        item('travelersbackpack:travelers_backpack', 12),
        item('travelersbackpack:travelers_backpack', 11),
        item('travelersbackpack:travelers_backpack', 10),
        item('travelersbackpack:travelers_backpack', 9),
        item('travelersbackpack:travelers_backpack', 8),
        item('travelersbackpack:travelers_backpack', 7),
        item('travelersbackpack:travelers_backpack', 6),
        item('travelersbackpack:travelers_backpack', 5),
        item('travelersbackpack:travelers_backpack', 4),
        item('travelersbackpack:travelers_backpack', 3),
        item('travelersbackpack:travelers_backpack', 2),
        item('travelersbackpack:travelers_backpack', 1),
        item('travelersbackpack:backpack_tank'),
        item('travelersbackpack:sleeping_bag_bottom'),
    ]

    def removeRecipe = [
       item('travelersbackpack:hose_nozzle'),
       item('travelersbackpack:hose'),
    ]

    // --- Удаление рецептов

    for (item in removeAndHide) {
        mods.jei.removeAndHide(item)
    }

    // Удаление рецептов
    for (item in removeRecipe) {
       crafting.removeByOutput(item)
    }

    // Поименное удаление рецептов
    crafting.remove("travelersbackpack:travelers_backpack_standard")
}