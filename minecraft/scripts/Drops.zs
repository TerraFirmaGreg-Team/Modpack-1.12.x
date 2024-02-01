import mods.dropt.Dropt;

// Рандомный дроп с урны Florae
Dropt.list("tfg/dropt/florae_urn").add(Dropt.rule()
  .matchBlocks(["tfcflorae:storage/urn_loot"])
  .replaceStrategy("REPLACE_ITEMS")
  .addDrop(Dropt.drop()
    .selector(Dropt.weight(33))
    .items([<metaitem:dustSmallCopper> * 2, <metaitem:dustSmallTin> * 4, <metaitem:dustSmallGold>])
  )
  .addDrop(Dropt.drop()
    .selector(Dropt.weight(33))
    .items([<metaitem:ingotCopper> * 2, <metaitem:ingotTin> * 4])
  )
  .addDrop(Dropt.drop()
    .selector(Dropt.weight(33))
    .items([<tfc:crop/seeds/oat>, <tfc:crop/seeds/rice>, <tfc:crop/seeds/wheat>, <tfc:crop/seeds/carrot>, <tfc:crop/seeds/tomato>])
  )
  .addDrop(Dropt.drop()
    .selector(Dropt.weight(1))
    .items([<gregtech:tongs>.withTag({"GT.ToolStats": {Material: "diamond"}})])
  )
);

// Исправление выпадения луж
Dropt.list("tfg/dropt/puddles").add(Dropt.rule()
  .matchDrops([<puddles:puddle>])
  .replaceStrategy("REPLACE_ITEMS")
  .addDrop(Dropt.drop()));

// Выпадение секвои
Dropt.list("tfg/dropt/sequoia").add(Dropt.rule()
  .matchBlocks(["tfc:wood/leaves/sequoia"])
  .replaceStrategy("ADD")
  .addDrop(Dropt.drop()
      .selector(Dropt.weight(65))) // шанс, что ничего не выпадет
  .addDrop(Dropt.drop()
      .selector(Dropt.weight(35))
      .items([<tfc:wood/sapling/sequoia>])));

// Морской лед
Dropt.list("tfg/dropt/sea_ice").add(Dropt.rule()
  .matchBlocks(["tfc:sea_ice"])
  .matchDrops([<tfc:sea_ice>])
  .matchHarvester(Dropt.harvester().type("PLAYER").mainHand("BLACKLIST", [], "craftingToolSaw"))
  .addDrop(Dropt.drop().items([<cellars:sea_ice_shard>])));

// Обычный лед
Dropt.list("tfg/dropt/ice").add(Dropt.rule()
  .matchBlocks(["minecraft:ice"])
  .matchDrops([<minecraft:ice>])
  .matchHarvester(Dropt.harvester().type("PLAYER").mainHand("BLACKLIST", [], "craftingToolSaw"))
  .addDrop(Dropt.drop().items([<cellars:ice_shard>])));

// Плотный лед
Dropt.list("tfg/dropt/packed_ice").add(Dropt.rule()
  .matchBlocks(["minecraft:packed_ice"])
  .matchDrops([<minecraft:packed_ice>])
  .matchHarvester(Dropt.harvester().type("PLAYER").mainHand("BLACKLIST", [], "craftingToolSaw"))
  .addDrop(Dropt.drop().items([<cellars:packed_ice_shard>])));

// При копке ванильных блоков выпадают TFC варианты
// Камень
Dropt.list("tfg/dropt/gc_fix/basalt")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:stone"]).addDrop(Dropt.drop().items([<tfc:raw/basalt>])));
// Гранит
Dropt.list("tfg/dropt/gc_fix/granite")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:stone:1"]).addDrop(Dropt.drop().items([<tfc:raw/granite>])));
// Диорит
Dropt.list("tfg/dropt/gc_fix/diorite")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:stone:3"]).addDrop(Dropt.drop().items([<tfc:raw/diorite>])));
// Андезит
Dropt.list("tfg/dropt/gc_fix/andesite")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:stone:5"]).addDrop(Dropt.drop().items([<tfc:raw/andesite>])));
// Булыжник
Dropt.list("tfg/dropt/gc_fix/cobble")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:cobblestone"]).addDrop(Dropt.drop().items([<tfc:cobble/basalt>])));
// Дерн
Dropt.list("tfg/dropt/gc_fix/grass")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:grass"]).addDrop(Dropt.drop().items([<tfc:grass/basalt>])));
// Земля
Dropt.list("tfg/dropt/gc_fix/dirt")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dirt"]).addDrop(Dropt.drop().items([<tfc:dirt/basalt>])));
// Каменистая земля
Dropt.list("tfg/dropt/gc_fix/coarse_dirt")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dirt:1"]).addDrop(Dropt.drop().items([<tfcflorae:coarse_dirt/basalt>])));
// Подзол
Dropt.list("tfg/dropt/gc_fix/podzol")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dirt:2"]).addDrop(Dropt.drop().items([<tfcflorae:podzol/basalt>])));
// Гравий
Dropt.list("tfg/dropt/gc_fix/gravel")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:gravel"]).addDrop(Dropt.drop().items([<tfc:gravel/basalt>])));
// Сундук
Dropt.list("tfg/dropt/gc_fix/chest")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:chest:*"]).addDrop(Dropt.drop().items([<tfc:wood/chest/oak>])));
// Доски
Dropt.list("tfg/dropt/gc_fix/wooden_planks")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:planks:*"]).addDrop(Dropt.drop().items([<tfc:wood/planks/oak>])));
// Дерево
Dropt.list("tfg/dropt/gc_fix/log")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:log:*"]).addDrop(Dropt.drop().items([<tfc:wood/log/oak>])));
Dropt.list("tfg/dropt/gc_fix/log2")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:log2:*"]).addDrop(Dropt.drop().items([<tfc:wood/log/oak>])));
// Саженцы
Dropt.list("tfg/dropt/gc_fix/birch_sapling")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:sapling:*"]).addDrop(Dropt.drop().items([<minecraft:stick>])));
// Пашня
Dropt.list("tfg/dropt/gc_fix/farmland")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:farmland:*"]).addDrop(Dropt.drop().items([<tfc:dirt/granite>])));
// Калитка
Dropt.list("tfg/dropt/gc_fix/spruce_fence_gate")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:spruce_fence_gate"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/birch_fence_gate")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:birch_fence_gate"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/jungle_fence_gate")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:jungle_fence_gate"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/dark_oak_fence_gate")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dark_oak_fence_gate"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/acacia_fence_gate")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:acacia_fence_gate"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
// Забор
Dropt.list("tfg/dropt/gc_fix/dark_oak_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dark_oak_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/spruce_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:spruce_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/birch_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:birch_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/jungle_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:jungle_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/dark_oak_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:dark_oak_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
Dropt.list("tfg/dropt/gc_fix/acacia_fence")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:acacia_fence"]).addDrop(Dropt.drop().items([<tfc:wood/fence_gate/box>])));
// картошка
Dropt.list("tfg/dropt/gc_fix/seeds/potato")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:potatoes:*"]).addDrop(Dropt.drop().items([<minecraft:stick>])));
// Пшеница
Dropt.list("tfg/dropt/gc_fix/seeds/wheat")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:wheat:*"]).addDrop(Dropt.drop().items([<minecraft:stick>])));
// Морковка
Dropt.list("tfg/dropt/gc_fix/seeds/carrot")
  .add(Dropt.rule()
  .matchBlocks(["minecraft:carrots:*"]).addDrop(Dropt.drop().items([<minecraft:stick>])));