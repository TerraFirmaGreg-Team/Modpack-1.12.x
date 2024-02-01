// MODS_LOADED: hgp

import classes.array.Minecraft
import classes.array.HGP


// --- Создание рецептов

// Чистая панель -> Чистая горизонтальная панель
crafting.addShapeless(item('hgp:hgppane'), [item('minecraft:glass_pane')])
mods.gregtech.assembler.recipeBuilder()
	.circuitMeta(20)
	.inputs(item('minecraft:glass_pane'))
	.outputs(item('hgp:hgppane'))
	.duration(16).EUt(2).buildAndRegister()

// Крашенная панель 1х -> 1 Крашенная горизонтальная панель 1х
for (int i = 0; i < HGP.horizontalGlassPanes.size(); i++) {
    // Верстак
    crafting.addShapeless(HGP.horizontalGlassPanes[i], [Minecraft.glassPanes[i]])

    // Ассемблер
    mods.gregtech.assembler.recipeBuilder()
		.circuitMeta(20)
        .inputs(Minecraft.glassPanes[i])
        .outputs(HGP.horizontalGlassPanes[i])
        .duration(16).EUt(2).buildAndRegister()

    // Хим.ванна, наложение цвета на панели
    mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(item('hgp:hgppane'))
        .fluidInputs(Minecraft.colorLiquid[i] * 18)
        .outputs(HGP.horizontalGlassPanes[i])
        .duration(20).EUt(7).buildAndRegister()

    // Хим.ванна, очистка цвета с панелей
    mods.gregtech.chemical_bath.recipeBuilder()
        .inputs(HGP.horizontalGlassPanes[i])
        .fluidInputs(fluid('chlorine') * 144)
        .outputs(item('hgp:hgppane'))
        .duration(400).EUt(2).buildAndRegister()
}
