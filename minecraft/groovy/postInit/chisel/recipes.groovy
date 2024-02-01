// MODS_LOADED: chisel

import classes.Function



// --- Добавление рецептов

// Авто Стамеска
crafting.addShaped("tfg/chisel/auto_chisel", item('chisel:auto_chisel'), [
    [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
    [ore('blockGlass'), ore('hiChisel'), ore('blockGlass')],
    [ore('plateIronAny'), metaitem('wireGtSingleRedAlloy'), ore('plateIronAny')]])

// Эндер палка смещения
crafting.addShaped("tfg/chisel/offsettool", item('chisel:offsettool'), [
    [metaitem('plateIron'), item('minecraft:ender_eye'), ore('toolKnife').transform(Function.setToolDamage)],
    [item('minecraft:stick'), metaitem('plateIron'), null],
    [ore('toolHammer').transform(Function.setToolDamage), null, null]])

// Железная стамеска
crafting.addShaped("tfg/chisel/chisel_iron", item('chisel:chisel_iron'), [
    [ore('toolFile').transform(Function.setToolDamage), ore('plateIronAny'), ore('plateIronAny')],
    [null, metaitem('screwSteel'), ore('plateIronAny')],
    [metaitem('stickBronze'), null, ore('toolHammer').transform(Function.setToolDamage)]])

// Алмазная стамеска
crafting.addShaped("tfg/chisel/chisel_diamond", item('chisel:chisel_diamond'), [
    [ore('toolFile').transform(Function.setToolDamage), metaitem('plateDiamond'), metaitem('plateDiamond')],
    [null, item('chisel:chisel_iron'), metaitem('plateDiamond')],
    [metaitem('stickRoseGold'), null, ore('toolHammer').transform(Function.setToolDamage)]])

// Современная стамеска
crafting.addShaped("tfg/chisel/chisel_hitech", item('chisel:chisel_hitech'), [
    [ore('toolFile').transform(Function.setToolDamage), metaitem('plateDiamond'), metaitem('plateDiamond')],
    [null, item('chisel:chisel_diamond'), metaitem('plateDiamond')],
    [metaitem('stickStainlessSteel'), null, ore('toolHammer').transform(Function.setToolDamage)]])

// Лабораторный блок
crafting.addShaped("tfg/chisel/laboratory_block", item('chisel:laboratory') * 8, [
    [ore('stone'), ore('stone'), ore('stone')],
    [ore('stone'), item('minecraft:quartz'), ore('stone')],
    [ore('stone'), ore('stone'), ore('stone')]])

// Храмовый блок
crafting.addShaped("tfg/chisel/temple_block", item('chisel:temple') * 8, [
    [ore('stone'), ore('stone'), ore('stone')],
    [ore('stone'), ore('dyeCyan'), ore('stone')],
    [ore('stone'), ore('stone'), ore('stone')]])

// Тириан блок
crafting.addShaped("tfg/chisel/tyrian_block", item('chisel:tyrian') * 8, [
    [ore('stone'), ore('stone'), ore('stone')],
    [ore('stone'), ore('plateIronAny'), ore('stone')],
    [ore('stone'), ore('stone'), ore('stone')]])

// Заводской блок
crafting.addShaped("tfg/chisel/factory_block", item('chisel:factory') * 8, [
    [ore('plateIronAny'), ore('stone'), ore('plateIronAny')],
    [ore('stone'), null, ore('stone')],
    [ore('plateIronAny'), ore('stone'), ore('plateIronAny')]])

// Коричневый камень
crafting.addShaped("tfg/chisel/brownstone", item('chisel:brownstone') * 8, [
    [ore('sand'), ore('sand'), ore('sand')],
    [ore('sand'), ore('clay'), ore('sand')],
    [ore('sand'), ore('sand'), ore('sand')]])
