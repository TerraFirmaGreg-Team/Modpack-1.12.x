import crafttweaker.item.IItemStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.terrafirmacraft.ItemRegistry;


// --- Массивы

val Rocket as IItemStack[] = [
  <extraplanets:item_tier9_rocket>,
  <extraplanets:item_tier9_rocket:1>,
  <extraplanets:item_tier9_rocket:2>,
  <extraplanets:item_tier9_rocket:3>,
];
val Crate as IItemStack[] = [
  <metaitem:plateAluminium>,
  <metaitem:crate.aluminium>,
  <metaitem:crate.stainless_steel>,
  <metaitem:crate.titanium>
];


// Вес и размер
ItemRegistry.registerItemSize(<extraplanets:item_tier9_rocket:*>, "HUGE", "VERY_HEAVY");


// --- Добавление рецептов

for i, Rocket in Rocket {
// Ракета
assembly_line.recipeBuilder()
  .inputs(<extraplanets:nose_cone_tier9>)
  .inputs(<metaitem:rocket.body.tier.9> * 12)
  .inputs(<extraplanets:tier9_items:2> * 8)
  .inputs(<extraplanets:tier9_items:1> * 6)
  .inputs(<extraplanets:tier9_items> * 5)
  .inputs(<galacticraftcore:oil_canister_partial:1001> * 64)
  .inputs(<metaitem:lander.tier.3>)
  .inputs(<metaitem:electric.motor.uiv> * 4)
  .inputs(<metaitem:emitter.uiv> * 4)
  .inputs(<ore:circuitUhv> * 8)
  .inputs([Crate[i] * 18])
  .inputs(<metaitem:rocket.control.computer.tier.9>)
  .inputs(<extraplanets:schematic_tier9>)
  .fluidInputs([<liquid:naquadria> * 9216])
  .fluidInputs([<liquid:soldering_alloy> * 4608])
  .fluidInputs([<liquid:tritanium> * 4608])
  .outputs([Rocket])
  .duration(1200).EUt(16777216).buildAndRegister();
}
// Ракетный компьютер
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <opencomputers:case3>,
    <opencomputers:keyboard>,
    <opencomputers:screen3>,
    <metaitem:emitter.uiv>,
    <metaitem:sensor.uiv>,
    <extraplanets:tier9_items:3>])
  .fluidInputs([<liquid:soldering_alloy> * 7612])
  .outputs(<metaitem:rocket.control.computer.tier.9>)
  .property("cleanroom", "cleanroom")
  .duration(600).EUt(16777216).buildAndRegister();
// Головоной обтекатель
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <extraplanets:nose_cone_tier4>,
    <extraplanets:tier9_items:3> * 4,
    <metaitem:sensor.uiv> * 2,
    <metaitem:screwTungstenSteel> * 4])
  .fluidInputs([<liquid:soldering_alloy> * 288])
  .outputs(<extraplanets:nose_cone_tier9>)
  .property("cleanroom", "cleanroom")
  .duration(600).EUt(16777216).buildAndRegister();
// Корпус
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <extraplanets:tier9_items:3> * 2,
    <metaitem:voltage_coil.uv> * 2,
    <metaitem:field.generator.uiv>])
  .fluidInputs([<liquid:soldering_alloy> * 288])
  .outputs(<metaitem:rocket.body.tier.9>)
  .property("cleanroom", "cleanroom")
  .duration(300).EUt(16777216).buildAndRegister();
// Стабилизаторы
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <extraplanets:tier9_items:3> * 2,
    <extraplanets:tier8_items:3> * 2,
    <metaitem:screwRuridit> * 4])
  .fluidInputs([<liquid:soldering_alloy> * 288])
  .outputs(<extraplanets:tier9_items:2>)
  .property("cleanroom", "cleanroom")
  .duration(300).EUt(16777216).buildAndRegister();
// Ракетные двигатели
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <extraplanets:tier9_items:3> * 5,
    <galacticraftplanets:item_basic_asteroids:1> * 2,
    <galacticraftcore:engine:1> * 2,
    <metaitem:electric.pump.uiv> * 4,
    <metaitem:cableGtSingleAnnealedCopper> * 16])
  .fluidInputs([<liquid:soldering_alloy> * 288])
  .outputs(<extraplanets:tier9_items>)
  .duration(300).EUt(16777216).buildAndRegister();
// Ускорители
assembler.recipeBuilder()
  .circuit(9)
  .inputs([
    <galacticraftcore:engine:1>,
    <extraplanets:tier9_items:3> * 4,
    <metaitem:plateDenseIce> * 3])
  .fluidInputs([<liquid:soldering_alloy> * 288])
  .outputs(<extraplanets:tier9_items:1>)
  .property("cleanroom", "cleanroom")
  .duration(600).EUt(16777216).buildAndRegister();
// Сплав сверх-прочных пластин
assembly_line.recipeBuilder()
  .inputs([
    <extraplanets:tier8_items:3>,
    <metaitem:plateDenseNaquadria> * 4,
    <metaitem:plateDenseNaquadria> * 4,
    <metaitem:boltTritanium> * 8])
  .fluidInputs([<liquid:soldering_alloy> * 144])
  .outputs(<metaitem:alloy.ingot.tier.9>)
  .duration(300).EUt(16777216).buildAndRegister();
// Сверх-прочные пластины
implosion_compressor.recipeBuilder()
	.inputs([<metaitem:alloy.ingot.tier.9>])
	.outputs(
      <extraplanets:tier9_items:3>,
      <metaitem:dustTinyTritanium> * 6)
	.property("explosives", 36)
	.duration(20).EUt(30).buildAndRegister();
// Схема ракеты
laser_engraver.recipeBuilder()
	.inputs([<metaitem:schematic.blank>])
  .notConsumable([<metaitem:glass_lens.light_gray>])
	.outputs(<extraplanets:schematic_tier9>)
  .property("cleanroom", "cleanroom")
	.duration(9000).EUt(16777216).buildAndRegister();