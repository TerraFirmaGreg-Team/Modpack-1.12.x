// MODS_LOADED: nae2

import gregtech.api.metatileentity.multiblock.CleanroomType
import classes.array.Minecraft
import classes.array.NAE2


// --- Добавление рецептов

for (int i = 0; i < 4; i++) {
    // Предметные ячейки
    // Сбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 39),
        NAE2.storageComponents[i])
      .outputs(NAE2.storageCells[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    // Разбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(NAE2.storageCells[i])
      .outputs(
        item('appliedenergistics2:material', 39),
        NAE2.storageComponents[i])
      .duration(10).EUt(7).buildAndRegister()
      
    // Жидкостные ячейки
    // Сбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:material', 39),
        NAE2.fluidStorageComponents[i])
      .outputs(NAE2.fluidStorageCells[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    // Разбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(NAE2.fluidStorageCells[i])
      .outputs(
        item('appliedenergistics2:material', 39),
        NAE2.fluidStorageComponents[i])
      .duration(10).EUt(7).buildAndRegister()

    // Хранилища крафта
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('appliedenergistics2:crafting_unit'),
        NAE2.storageComponents[i])
      .outputs(NAE2.craftingStorage[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()

    mods.gregtech.packer.recipeBuilder()
      .inputs(NAE2.craftingStorage[i])
      .outputs(
        item('appliedenergistics2:crafting_unit'),
        NAE2.storageComponents[i])
      .duration(10).EUt(7).buildAndRegister()
}

 // 256k Storage Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitZpm') * 4, 
    metaitem('plateNaquadahAlloy') * 4, 
    metaitem('dustCertusQuartz') * 16, 
    item('appliedenergistics2:material', 24))
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 1))
  .duration(400).EUt(122880).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 24), 
    ore('circuitZpm') * 2, 
    item('appliedenergistics2:material', 38) * 4)
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 1))
  .duration(200).EUt(122880).buildAndRegister()

// 1024k Storage Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitZpm') * 4, 
    metaitem('plateAmericium') * 4, 
    metaitem('dustCertusQuartz') * 16, 
    item('appliedenergistics2:material', 24))
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 2))
  .duration(400).EUt(122880).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 24), 
    ore('circuitZpm') * 2, 
    item('nae2:material', 1) * 4)
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 2))
  .duration(200).EUt(122880).buildAndRegister()

// 4096k Storage Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitUv') * 4, 
    metaitem('plateDarmstadtium') * 4, 
    metaitem('dustCertusQuartz') * 32, 
    item('appliedenergistics2:material', 23))
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 3))
  .duration(400).EUt(491520).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 23), 
    ore('circuitUv') * 2, 
    item('nae2:material', 2) * 4)
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 3))
  .duration(200).EUt(491520).buildAndRegister()

// 16384k Storage Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitUv') * 4, 
    metaitem('plateNeutronium') * 4, 
    metaitem('dustCertusQuartz') * 32, 
    item('appliedenergistics2:material', 23))
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 4))
  .duration(400).EUt(491520).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 23), 
    ore('circuitUv') * 2, 
    item('nae2:material', 3) * 4)
  .fluidInputs(fluid('steel') * 144)
  .outputs(item('nae2:material', 4))
  .duration(200).EUt(491520).buildAndRegister()

 // 256k Fluid Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitZpm') * 4, 
    metaitem('plateNaquadahAlloy') * 4, 
    metaitem('dustNetherQuartz') * 16, 
    item('appliedenergistics2:material', 24))
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 5))
  .duration(400).EUt(122880).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 24), 
    ore('circuitZpm') * 2, 
    item('appliedenergistics2:material:57') * 4)
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 5))
  .duration(200).EUt(122880).buildAndRegister()

// 1024k Fluid Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitZpm') * 4, 
    metaitem('plateAmericium') * 4, 
    metaitem('dustNetherQuartz') * 16, 
    item('appliedenergistics2:material', 24))
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 6))
  .duration(400).EUt(122880).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 24),
    ore('circuitZpm') * 2,
    item('nae2:material', 5) * 4)
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 6))
  .duration(200).EUt(122880).buildAndRegister()

// 4096k Fluid Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitUv') * 4, 
    metaitem('plateDarmstadtium') * 4, 
    metaitem('dustNetherQuartz') * 32, 
    item('appliedenergistics2:material', 23))
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 7))
  .duration(400).EUt(491520).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 23), 
    ore('circuitUv') * 2, 
    item('nae2:material', 6) * 4)
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 7))
  .duration(200).EUt(491520).buildAndRegister()

// 16384k Fluid Component
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    ore('circuitUHV') * 4, 
    metaitem('plateNeutronium') * 4, 
    metaitem('dustNetherQuartz') * 32, 
    item('appliedenergistics2:material', 23))
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 8))
  .duration(400).EUt(983040).buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
  .inputs(
    item('appliedenergistics2:material', 23), 
    ore('circuitUHV') * 2, 
    item('nae2:material', 6) * 4)
  .fluidInputs(fluid('stainless_steel') * 144)
  .outputs(item('nae2:material', 8))
  .duration(200).EUt(983040).buildAndRegister()