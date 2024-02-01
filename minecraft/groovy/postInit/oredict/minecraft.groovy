// MODS_LOADED: minecraft

// --- Удаление

ore('grass').remove(item('minecraft:grass'))
ore('sand').remove(item('minecraft:sand'))
ore('dirt').remove(item('minecraft:dirt'))
ore('stone').remove(item('minecraft:stone'))
ore('stoneSmooth').remove(item('minecraft:stone'))
ore('gravel').remove(item('minecraft:gravel'))
ore('stoneGranite').remove(item('minecraft:stone', 1))
ore('stoneDiorite').remove(item('minecraft:stone', 3))
ore('stoneAndesite').remove(item('minecraft:stone', 5))
ore('oreCoal').remove(item('minecraft:coal_ore'))
ore('oreRedstone').remove(item('minecraft:redstone_ore'))
ore('oreDiamond').remove(item('minecraft:diamond_ore'))
ore('oreEmerald').remove(item('minecraft:emerald_ore'))
ore('oreGold').remove(item('minecraft:gold_ore'))
ore('oreIron').remove(item('minecraft:iron_ore'))
ore('sugarcane').remove(item('minecraft:reeds'))
ore('bookshelf').remove(item('minecraft:bookshelf'))
ore('treeSapling').remove(item('minecraft:sapling:*'))
ore('slabWood').remove(item('minecraft:wooden_slab:*'))
ore('plankWood').remove(item('minecraft:planks:*'))
ore('logWood').remove(item('minecraft:log:*'), item('minecraft:log2:*'))
ore('chest').remove(item('minecraft:chest'), item('minecraft:trapped_chest'))
ore('chestWood').remove(item('minecraft:trapped_chest'), item('minecraft:chest'))
ore('chestTrapped').remove(item('minecraft:trapped_chest'))
ore('stairWood').remove([
    item('minecraft:oak_stairs'), 
    item('minecraft:spruce_stairs'), 
    item('minecraft:birch_stairs'), 
    item('minecraft:jungle_stairs'), 
    item('minecraft:acacia_stairs'), 
    item('minecraft:dark_oak_stairs')
])

// Cobblestone
ore('cobblestone').remove(item('minecraft:cobblestone'))
ore('stoneCobble').remove(item('minecraft:cobblestone'))

// Polished Granite
ore('stoneGranite').remove(item('minecraft:stone', 2))
ore('stoneGranitePolished').remove(item('minecraft:stone', 2))

// Polished Diorite
ore('stoneDiorite').remove(item('minecraft:stone', 4))
ore('stoneDioritePolished').remove(item('minecraft:stone', 4))

// Polished Andesite
ore('stoneAndesite').remove(item('minecraft:stone', 6))
ore('stoneAndesitePolished').remove(item('minecraft:stone', 6))

