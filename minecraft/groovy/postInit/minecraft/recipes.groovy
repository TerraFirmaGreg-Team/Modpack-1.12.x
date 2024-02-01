import classes.Function


// --- Добавление рецептов

// Водная хрень
crafting.addShapeless("tfg/vanilla/prismarine/block_raw_0", item('minecraft:prismarine'), [item('minecraft:prismarine_shard'), item('minecraft:prismarine_shard'), item('minecraft:prismarine_shard'), item('minecraft:prismarine_shard')])
crafting.addShapeless("tfg/vanilla/prismarine/block_raw_1", item('minecraft:prismarine'), [ore('blockQuartz'), ore('dyeCyan')])
crafting.addShapeless("tfg/vanilla/prismarine/bricks", item('minecraft:prismarine:1') * 4, [item('minecraft:prismarine'), item('minecraft:prismarine'), item('minecraft:prismarine'), item('minecraft:prismarine')])
crafting.addShapeless("tfg/vanilla/prismarine/sea_lantern", item('minecraft:sea_lantern'), [ore('glowstone'), ore('dyeCyan')])
crafting.addShapeless("tfg/vanilla/prismarine/dark", item('minecraft:prismarine:2'), [item('minecraft:prismarine'), ore('dyeBlack')])

// Табличка
crafting.addShaped("tfg/vanilla/sign", item('minecraft:sign'), [
	[ore('plankWood'), ore('plankWood'), ore('plankWood')],
	[ore('plankWood'), ore('plankWood'), ore('plankWood')],
	[null, item('minecraft:stick'), null]])

// Раздатчик
crafting.addShaped("tfg/vanilla/dispenser", item('minecraft:dispenser'), [
	[ore('cobblestone'), ore('ringIronAny'), ore('cobblestone')],
	[ore('springIronAny'), ore('string'), ore('springIronAny')],
	[ore('gearSmallIronAny'), metaitem('stickRedAlloy'), ore('gearSmallIronAny')]])

// Выбрасыватель
crafting.addShaped("tfg/vanilla/dropper", item('minecraft:dropper'), [
	[ore('cobblestone'), ore('ringIronAny'), ore('cobblestone')],
	[ore('springSmallIronAny'), ore('string'), ore('springSmallIronAny')],
	[ore('gearSmallIronAny'), metaitem('stickRedAlloy'), ore('gearSmallIronAny')]])

// Наблюдатель - истинный кварц
crafting.addShaped("tfg/vanilla/observer/certus_quartz", item('minecraft:observer'), [
	[ore('ringIronAny'), ore('cobblestone'), ore('ringIronAny')],
	[ore('cobblestone'), metaitem('plateCertusQuartz'), ore('cobblestone')],
	[ore('ringIronAny'), metaitem('stickRedAlloy'), ore('ringIronAny')]])

// Наблюдатель - адский кварц
crafting.addShaped("tfg/vanilla/observer/nether_quartz", item('minecraft:observer'), [
	[ore('ringIronAny'), ore('cobblestone'), ore('ringIronAny')],
	[ore('cobblestone'), metaitem('plateNetherQuartz'), ore('cobblestone')],
	[ore('ringIronAny'), metaitem('stickRedAlloy'), ore('ringIronAny')]])

// Наблюдатель - кварцит
crafting.addShaped("tfg/vanilla/observer/quartzite", item('minecraft:observer'), [
	[ore('ringIronAny'), ore('cobblestone'), ore('ringIronAny')],
	[ore('cobblestone'), metaitem('plateQuartzite'), ore('cobblestone')],
	[ore('ringIronAny'), metaitem('stickRedAlloy'), ore('ringIronAny')]])

// Железная нажимная плита
crafting.addShaped("tfg/vanilla/light_weighted_pressure_plate", item('minecraft:heavy_weighted_pressure_plate'), [
	[metaitem('screwSteel'), ore('toolHammer').transform(Function.setToolDamage), metaitem('screwSteel')],
	[ore('plateIronAny'), metaitem('springSteel'), ore('plateIronAny')],
	[metaitem('screwSteel'), ore('toolScrewdriver').transform(Function.setToolDamage), metaitem('screwSteel')]])

// Котёл
crafting.addShaped("tfg/vanilla/cauldron", item('minecraft:cauldron'), [
	[ore('plateIronAny'), null, ore('plateIronAny')],
	[ore('plateIronAny'), ore('toolHammer').transform(Function.setToolDamage), ore('plateIronAny')],
	[ore('plateIronAny'), ore('plateIronAny'), ore('plateIronAny')]])

// Воронка
crafting.addShaped("tfg/vanilla/hopper", item('minecraft:hopper'), [
	[ore('plateIronAny'), ore('chest'), ore('plateIronAny')],
	[ore('plateIronAny'), ore('gearIronAny'), ore('plateIronAny')],
	[ore('toolWrench').transform(Function.setToolDamage), ore('plateIronAny'), ore('toolHammer').transform(Function.setToolDamage)]])

// Наковальня
crafting.addShaped("tfg/vanilla/anvil", item('minecraft:anvil'), [
	[ore('blockIronAny'), ore('blockIronAny'), ore('blockIronAny')],
	[ore('screwIronAny'), ore('blockIronAny'), ore('screwIronAny')],
	[ore('plateIronAny'), ore('blockIronAny'), ore('plateIronAny')]])

// Вагонетка
crafting.addShaped("tfg/vanilla/minecart", item('minecraft:minecart'), [
	[ore('ringIronAny'), ore('toolHammer').transform(Function.setToolDamage), ore('ringIronAny')],
	[ore('plateIronAny'), ore('toolWrench').transform(Function.setToolDamage), ore('plateIronAny')],
	[ore('ringIronAny'), ore('plateIronAny'), ore('ringIronAny')]])

// Проигрыватель
crafting.addShaped("tfg/vanilla/jukebox", item('minecraft:jukebox'), [
	[ore('logWood'), metaitem('screwDiamond'), ore('logWood')],
	[item('minecraft:noteblock'), ore('ringIronAny'), item('minecraft:noteblock')],
	[ore('logWood'), ore('gearIronAny'), ore('logWood')]])

// Хук
crafting.addShaped("tfg/vanilla/tripwire_hook", item('minecraft:tripwire_hook'), [
	[ore('ringIronAny'), item('minecraft:stick'), ore('ringIronAny')],
	[ore('string'), item('minecraft:stick'), ore('string')],
	[null, ore('string'), null]])

// Картина
crafting.addShaped("tfg/vanilla/painting", item('minecraft:painting'), [
	[ore('string'), ore('ringIronAny'), ore('string')],
	[item('minecraft:stick'), ore('carpet'), item('minecraft:stick')],
	[item('minecraft:stick'), item('minecraft:stick'), item('minecraft:stick')]])

// Рамка
crafting.addShaped("tfg/vanilla/item_frame", item('minecraft:item_frame'), [
	[ore('string'), ore('ringIronAny'), ore('string')],
	[item('minecraft:stick'), ore('leather'), item('minecraft:stick')],
	[item('minecraft:stick'), item('minecraft:stick'), item('minecraft:stick')]])

// Лампа
crafting.addShaped("tfg/vanilla/redstone_lamp", item('minecraft:redstone_lamp'), [
	[metaitem('plateBrass'), ore('stickIronAny'), metaitem('plateBrass')],
	[ore('stickIronAny'), metaitem('cableGtSingleRedAlloy'), ore('stickIronAny')],
	[metaitem('plateBrass'), ore('stickIronAny'), metaitem('plateBrass')]])

mods.gregtech.assembler.recipeBuilder()
	.inputs(
		metaitem('plateBrass') * 4, 
		ore('stickIronAny') * 4)
	.fluidInputs(fluid('redstone') * 72)
	.outputs(item('minecraft:redstone_lamp'))
	.duration(100).EUt(1).buildAndRegister()

// Удочка
crafting.addShaped("tfg/vanilla/fishing_rod", item('minecraft:fishing_rod'), [
	[null, null, item('minecraft:stick')],
	[null, item('minecraft:stick'), ore('string')],
	[item('minecraft:stick'), null, ore('string')]])

// Чар стол
crafting.addShaped("tfg/vanilla/enchanting_table", item('minecraft:enchanting_table'), [
	[null, item('minecraft:book'), null],
	[ore('gemFlawless'), ore('obsidian'), ore('gemFlawless')],
	[ore('obsidian'), ore('obsidian'), ore('obsidian')]])

// Поршень
crafting.addShaped("tfg/vanilla/piston", item('minecraft:piston'), [
	[ore('lumber'), ore('lumber'), ore('lumber')],
	[ore('gearIronAny'), ore('stickLongIronAny'), ore('gearIronAny')],
	[ore('cobblestone'), item('minecraft:redstone'), ore('cobblestone')]])

// Книга
crafting.addShaped("tfg/vanilla/book", item('minecraft:book'), [
	[ore('string'), ore('paper'), ore('leather')],
	[ore('string'), ore('paper'), metaitem('rubber_drop')],
	[ore('string'), ore('paper'), ore('leather')]])

// Ведро
crafting.addShaped("tfg/vanilla/iron_bucket", item('minecraft:bucket'), [
	[null, ore('toolHammer').transform(Function.setToolDamage), null],
	[metaitem('plateBlueSteel'), item('tfc:metal/bucket/red_steel'), metaitem('plateBlueSteel')],
	[null, metaitem('plateBlueSteel'), null]])

// Рычаг
crafting.addShaped("tfg/vanilla/lever", item('minecraft:lever'), [
	[null, ore('buttonStone'), null],
	[null, item('minecraft:stick'), null]])

// Бирка
crafting.addShaped("tfg/vanilla/name_tag", item('minecraft:name_tag'), [
	[ore('string'), ore('string'), null],
	[ore('string'), item('minecraft:paper'), null],
	[ore('string'), ore('string'), null]])

// Повторитель
crafting.addShaped("tfg/vanilla/repeater", item('minecraft:repeater'), [
	[ore('screwIronAny'), null, ore('screwIronAny')],
	[item('minecraft:redstone_torch'), ore('toolScrewdriver').transform(Function.setToolDamage), item('minecraft:redstone_torch')],
	[ore('pressurePlateStone'), metaitem('stickRedAlloy'),ore('pressurePlateStone')]])

// Компаратор - истинный кварц
crafting.addShaped("tfg/vanilla/comparator/certus_quartz", item('minecraft:comparator'), [
	[ore('screwIronAny'), item('minecraft:redstone_torch'), ore('screwIronAny')],
	[item('minecraft:redstone_torch'), metaitem('plateCertusQuartz'), item('minecraft:redstone_torch')],
	[ore('pressurePlateStone'), ore('toolScrewdriver').transform(Function.setToolDamage), ore('pressurePlateStone')]])

// Компаратор - адский кварц
crafting.addShaped("tfg/vanilla/comparator/nether_quartz", item('minecraft:comparator'), [
	[ore('screwIronAny'), item('minecraft:redstone_torch'), ore('screwIronAny')],
	[item('minecraft:redstone_torch'), metaitem('plateNetherQuartz'), item('minecraft:redstone_torch')],
	[ore('pressurePlateStone'), ore('toolScrewdriver').transform(Function.setToolDamage), ore('pressurePlateStone')]])

// Компаратор - кварцит
crafting.addShaped("tfg/vanilla/comparator/quartzite", item('minecraft:comparator'), [
	[ore('screwIronAny'), item('minecraft:redstone_torch'), ore('screwIronAny')],
	[item('minecraft:redstone_torch'), metaitem('plateQuartzite'), item('minecraft:redstone_torch')],
	[ore('pressurePlateStone'), ore('toolScrewdriver').transform(Function.setToolDamage), ore('pressurePlateStone')]])

// Детектор света - истинный кварц
crafting.addShaped("tfg/vanilla/daylight_detector/certus_quartz", item('minecraft:daylight_detector'), [
	[ore('paneGlass'), ore('paneGlass'), ore('paneGlass')],
	[metaitem('plateCertusQuartz'), metaitem('plateCertusQuartz'), metaitem('plateCertusQuartz')],
	[ore('slabWood'), metaitem('stickRedAlloy'), ore('slabWood')]])

// Детектор света - адский кварц
crafting.addShaped("tfg/vanilla/daylight_detector/nether_quartz", item('minecraft:daylight_detector'), [
	[ore('paneGlass'), ore('paneGlass'), ore('paneGlass')],
	[metaitem('plateNetherQuartz'), metaitem('plateNetherQuartz'), metaitem('plateNetherQuartz')],
	[ore('slabWood'), metaitem('stickRedAlloy'), ore('slabWood')]])

// Детектор света - кварцит
crafting.addShaped("tfg/vanilla/daylight_detector/quartzite", item('minecraft:daylight_detector'), [
	[ore('paneGlass'), ore('paneGlass'), ore('paneGlass')],
	[metaitem('plateQuartzite'), metaitem('plateQuartzite'), metaitem('plateQuartzite')],
	[ore('slabWood'), metaitem('stickRedAlloy'), ore('slabWood')]])

// Конская броня - железо
crafting.addShaped("tfg/vanilla/horse_armor/iron", item('minecraft:iron_horse_armor'), [
	[ore('toolHammer').transform(Function.setToolDamage), ore('toolScrewdriver').transform(Function.setToolDamage), item('tfc:metal/helmet/wrought_iron')],
	[ore('plateIronAny'), item('tfc:metal/chestplate/wrought_iron'), ore('plateIronAny')],
	[item('tfc:metal/greaves/wrought_iron'), ore('screwIronAny'), item('tfc:metal/boots/wrought_iron')]])

// Ферментированный паучий глаз
mods.gregtech.mixer.recipeBuilder()
	.inputs(item('minecraft:sugar'), ore('mushrooms'), item('minecraft:spider_eye'))
	.outputs(item('minecraft:fermented_spider_eye'))
	.duration(300).EUt(2).buildAndRegister()

// Тростник -> Сахар
mods.gregtech.macerator.recipeBuilder()
	.inputs(ore('sugarcane'))
	.outputs(item('minecraft:sugar'))
	.duration(300).EUt(2).buildAndRegister()

// Тростник -> Бумага (Вода)
mods.gregtech.chemical_bath.recipeBuilder()
	.inputs(ore('sugarcane'))
	.fluidInputs(fluid('water') * 100)
	.outputs(item('minecraft:paper'))
	.duration(100).EUt(7).buildAndRegister()

// Тростник -> Бумага (Дист. Вода)
mods.gregtech.chemical_bath.recipeBuilder()
	.inputs(ore('sugarcane'))
	.fluidInputs(fluid('distilled_water') * 100)
	.outputs(item('minecraft:paper'))
	.duration(100).EUt(7).buildAndRegister()

// Саженцы -> Палки
mods.gregtech.lathe.recipeBuilder()
	.inputs(ore('treeSapling'))
	.outputs(
		item('minecraft:stick'), 
		metaitem('dustTinyWood'))
	.duration(16).EUt(7).buildAndRegister()

// Полублок -> Миска
mods.gregtech.lathe.recipeBuilder()
	.inputs(ore('slabWood'))
	.outputs(
		item('minecraft:bowl'), 
		metaitem('dustTinyWood'))
	.duration(16).EUt(7).buildAndRegister()

// Раздатчик
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		ore('cobblestone') * 2, 
		ore('ringIronAny'), 
		ore('springIronAny') * 2, 
		ore('gearSmallIronAny') * 2, 
		metaitem('stickRedAlloy'), 
		ore('string'))
	.outputs(item('minecraft:dispenser'))
	.duration(100).EUt(30).buildAndRegister()

// Гравий -> Каменная пыль, Кремний
mods.gregtech.macerator.recipeBuilder()
	.inputs(ore('gravel'))
	.outputs(metaitem('dustStone'))
	.chancedOutput(item('minecraft:flint'), 100, 100)
	.duration(105).EUt(2).buildAndRegister()

// Гравий -> Каменная пыль, Кремний
mods.gregtech.sifter.recipeBuilder()
	.inputs(ore('gravel'))
	.outputs(item('minecraft:flint'))
	.chancedOutput(item('minecraft:flint'), 2500, 0)
	.chancedOutput(item('minecraft:flint'), 3300, 0)
	.chancedOutput(item('minecraft:flint'), 6300, 0)
	.chancedOutput(item('minecraft:flint'), 8300, 0)
	.chancedOutput(item('minecraft:flint'), 9300, 0)
	.duration(275).EUt(16).buildAndRegister()

// Кусочки мяса
mods.gregtech.macerator.recipeBuilder()
	.inputs(ore('categoryMeat'))
	.outputs(metaitem('dustMeat'), metaitem('dustTinyBone'))
	.duration(105).EUt(2).buildAndRegister()

// Коричневый гриб -> Метан
mods.gregtech.centrifuge.recipeBuilder()
	.inputs(ore('mushroombrown'))
	.fluidOutputs(fluid('methane') * 18)
	.duration(150).EUt(5).buildAndRegister()

// Красный гриб -> Метан
mods.gregtech.centrifuge.recipeBuilder()
	.inputs(ore('mushroomRed'))
	.fluidOutputs(fluid('methane') * 18)
	.duration(150).EUt(5).buildAndRegister()

// Стойка для брони
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		ore('slabStonePolished'), 
		item('minecraft:stick') * 6)
	.outputs(item('minecraft:armor_stand'))
	.duration(100).EUt(7).buildAndRegister()

// Воронка
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		ore('chest'), 
		ore('plateIronAny') * 5, 
		ore('gearIronAny'))
	.outputs(item('minecraft:hopper'))
	.duration(600).EUt(2).buildAndRegister()

// Базальтовый камень
mods.gregtech.compressor.recipeBuilder()
	.inputs(metaitem('plateStone') * 9)
	.outputs(item('tfc:raw/basalt'))
	.duration(300).EUt(2).buildAndRegister()

// Базальтовая земля
mods.gregtech.macerator.recipeBuilder()
	.inputs(metaitem('bio_chaff'))
	.outputs(item('tfc:dirt/basalt'))
	.duration(300).EUt(2).buildAndRegister()

// Кварцитовый песок -> Алмазы и тд.
mods.gregtech.centrifuge.recipeBuilder()
	.inputs(item('tfc:sand/quartzite'))
	.chancedOutput(metaitem('dustTinyDiamond'), 100, 100)
	.chancedOutput(metaitem('dustIron'), 5000, 500)
	.chancedOutput(item('tfc:sand/basalt'), 5000, 5000)
	.duration(275).EUt(30).buildAndRegister()

// Нефтеносные пески -> Базальтовый песок, Нефть 
mods.gregtech.centrifuge.recipeBuilder()
	.inputs(ore('oreOilsands'))
	.chancedOutput(item('tfc:sand/basalt'), 5000, 5000)
	.fluidOutputs(fluid('oil') * 500)
	.duration(200).EUt(5).buildAndRegister()

// Песок -> Кварцитовая пыль
mods.gregtech.macerator.recipeBuilder()
	.inputs(ore('sand'))
	.outputs(metaitem('dustQuartzSand'))
	.duration(50).EUt(2).buildAndRegister()

// Крюк
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		item('minecraft:stick') * 2, 
		ore('ringIronAny') * 2)
	.outputs(item('minecraft:tripwire_hook'))
	.duration(100).EUt(4).buildAndRegister()

// Проигрыватель
mods.gregtech.assembler.recipeBuilder()
	.inputs(metaitem('boltDiamond'), ore('gearIronAny'), ore('ringIronAny'), metaitem('plateWood') * 4, item('minecraft:noteblock') * 2)
	.outputs(item('minecraft:jukebox'))
	.duration(100).EUt(16).buildAndRegister()

// Поршень
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		ore('cobblestone'), 
		ore('slabWood'), 
		ore('gearSmallIronAny'), 
		ore('stickIronAny'))
	.fluidInputs(fluid('red_alloy') * 144)
	.outputs(item('minecraft:piston'))
	.duration(100).EUt(7).buildAndRegister()

// Котёл
mods.gregtech.assembler.recipeBuilder()
	.inputs(ore('plateIronAny') * 7)
	.circuitMeta(7)
	.outputs(item('minecraft:cauldron'))
	.duration(100).EUt(4).buildAndRegister()

// Компас
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		metaitem('stickIronMagnetic'), 
		ore('plateIronAny') * 4)
	.outputs(item('minecraft:compass'))
	.duration(100).EUt(4).buildAndRegister()

// Нажимная пластина из железа
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		metaitem('springSteel'), 
		ore('plateIronAny'))
	.outputs(item('minecraft:heavy_weighted_pressure_plate'))
	.duration(200).EUt(16).buildAndRegister()

// Вагонетка
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		ore('plateIronAny') * 3, 
		ore('ringIronAny') * 4)
	.outputs(item('minecraft:minecart'))
	.duration(100).EUt(4).buildAndRegister()

// Железные прутья
mods.gregtech.assembler.recipeBuilder()
	.inputs(ore('stickIronAny') * 3)
	.circuitMeta(3)
	.outputs(item('minecraft:iron_bars') * 4)
	.duration(100).EUt(4).buildAndRegister()

// Железная дверь
mods.gregtech.assembler.recipeBuilder()
	.inputs(
		item('minecraft:iron_bars'), 
		ore('plateIronAny') * 4)
	.fluidInputs(fluid('steel') * 16)
	.outputs(item('minecraft:iron_door'))
	.duration(100).EUt(7).buildAndRegister()

// Ведро
mods.gregtech.bender.recipeBuilder()
	.circuitMeta(12)
	.inputs(metaitem('plateBlueSteel') * 3)
	.outputs(item('minecraft:bucket'))
	.duration(100).EUt(7).buildAndRegister()

// Slimeball
crafting.addShaped("tfg/gc/slime_ball", item('minecraft:slime_ball'), [
	[ore('dyeGreen'), item('minecraft:sugar'), ore('dyeGreen')],
	[item('minecraft:sugar'), item('firmalife:cheddar_wheel'), item('minecraft:sugar')],
	[ore('dyeGreen'), item('minecraft:sugar'), ore('dyeGreen')]])




// Палки
crafting.addShapeless("tfg/tfc/sticks_from_rod", item('minecraft:stick') * 2, [metaitem('stickLongWood'), ore('toolSaw').transform(Function.setToolDamage)])




