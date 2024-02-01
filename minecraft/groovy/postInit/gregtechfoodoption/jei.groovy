// MODS_LOADED: gregtechfoodoption1


   // --- Массивы
   
   def removeAndHide = [
   	item('gregtechfoodoption:gtfo_meta_item', 44),
   	item('gregtechfoodoption:gtfo_meta_item', 43),
   	item('gregtechfoodoption:gtfo_meta_item', 42),
   	item('gregtechfoodoption:gtfo_meta_item', 117),
   	item('gregtechfoodoption:gtfo_meta_item', 50),
   	item('gregtechfoodoption:gtfo_meta_item', 99),
   	item('gregtechfoodoption:gtfo_meta_item', 47),
   	item('gregtechfoodoption:gtfo_meta_item', 45),
   	item('gregtechfoodoption:gtfo_meta_item', 55)
   ]
   
   def removeRecipe = [
      item('gregtechfoodoption:gtfo_meta_item', 152),
      item('gregtechfoodoption:gtfo_meta_item', 75),
      item('gregtechfoodoption:gtfo_meta_item', 148),
      item('gregtechfoodoption:gtfo_meta_item', 80),
      item('gregtechfoodoption:gtfo_meta_item', 74),
      item('gregtechfoodoption:gtfo_meta_item', 79),
      item('gregtechfoodoption:gtfo_meta_item', 81)
   ]
   
   def removeRecipesByName = [
      "gregtechfoodoption:casing_adobe_bricks",
      "gregtechfoodoption:casing_reinforced_adobe_bricks",
      "gregtechfoodoption:baking_oven",
      "gregtechfoodoption:gtfo_hand_meat_kebab_0",
      "gregtechfoodoption:gtfo_hand_meat_kebab_1",
      "gregtechfoodoption:gtfo_hand_meat_kebab_2",
      "gregtechfoodoption:gtfo_hand_meat_kebab_3",
      "gregtechfoodoption:gtfo_hand_meat_kebab_4",
      "gregtechfoodoption:gtfo_bacon",
      "gregtechfoodoption:gtfo_sandwich_steak_from_oredict",
      "gregtechfoodoption:gtfo_pumpkin_pie",
      "gregtechfoodoption:gtfo_cake",
      "gregtechfoodoption:cake_bottom",
      "gregtechfoodoption:gtfo_cookie",
      "gregtechfoodoption:gtfo_slice_bread",
      "gregtechfoodoption:bread_dough",
      "gregtechfoodoption:gtfo_hand_carrot_kebab",
      "gregtechfoodoption:gtfo_flat_dough",
      "gregtechfoodoption:dough_2",
      "gregtechfoodoption:dough_4",
      "gregtechfoodoption:sugary_dough",
      "gregtechfoodoption:gtfo_pie_crust",
      "gregtechfoodoption:baguette_dough",
      "gregtechfoodoption:bun_dough",
      "gregtechfoodoption:gtfo_hand_kubide_kebab",
      "gregtechfoodoption:meat_hand_recipe",
      "gregtechfoodoption:gtfo_hand_kubide_kebab_meat",
      "gregtechfoodoption:gtfo_hand_barg_kebab_meat",
      "gregtechfoodoption:gtfo_hand_onion_kebab",
      "gregtechfoodoption:gtfo_hand_zest1",
      "gregtechfoodoption:gtfo_hand_zest2",
      "gregtechfoodoption:gtfo_hand_zest3"
   ]
   
   
   // --- Удаление рецептов
   
   for (item in removeAndHide) {
      mods.jei.removeAndHide(item)
   }
   
   for (item in removeRecipe) {
      crafting.removeByOutput(item)
   }
   
   for (item in removeRecipesByName) {
      crafting.remove(item)
   }


   // Удаление рецептов метана
   // Methane
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:nether_wart')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:brown_mushroom')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:red_mushroom')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:melon')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:carrot')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:baked_potato')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:rabbit')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:chicken')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:rabbit_stew')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_mutton')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:apple')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:potato')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beef')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish', 2)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_rabbit')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_fish')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_beef')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beetroot_soup')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:pumpkin_pie')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_chicken')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cookie')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:bread')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_porkchop')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beetroot')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish', 3)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:poisonous_potato')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:porkchop')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:mushroom_stew')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_fish', 1)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('extraplanets:caramel_bar')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('extraplanets:chocolate_bar')], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 6)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('galacticraftcore:food', 7)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('gregtechfoodoption:gtfo_meta_item', 77)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('gregtechfoodoption:gtfo_meta_item', 76)], null)
   mods.gregtech.centrifuge.removeByInput(5, [item('gregtechfoodoption:gtfo_meta_item', 124)], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.apricot')], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.mango')], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.banana')], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.orange')], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.lime')], null)
   mods.gregtech.centrifuge.removeByInput(5, [metaitem('food.lemon')], null)


   // Chum on Skewel Kebab * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [metaitem('food.chum') * 8, metaitem('component.banana_peel') * 2, metaitem('crop.onion'), metaitem('mashed_potato_dust') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], [fluid('gtfo_yolk') * 200, fluid('gtfo_stearin') * 400])
   // Kebab Meat Raw * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [item('minecraft:chicken') * 4, metaitem('dustTinySalt') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], null)
   // Kebab Meat Raw * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [item('minecraft:beef') * 4, metaitem('dustTinySalt') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], null)
   // Kebab Meat Raw * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [item('minecraft:mutton') * 4, metaitem('dustTinySalt') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], null)
   // Kebab Meat Raw * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [item('minecraft:porkchop') * 4, metaitem('dustTinySalt') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], null)
   // Kebab Meat Raw * 4
   mods.gregtech.cuisine_assembler.removeByInput(16, [item('minecraft:rabbit') * 4, metaitem('dustTinySalt') * 4, item('gregtechfoodoption:gtfo_meta_item', 135) * 4], null)
   // Cake * 1
   mods.gregtech.cuisine_assembler.removeByInput(7, [item('minecraft:sugar'), item('minecraft:egg'), metaitem('food.cake_bottom_baked')], [fluid('milk') * 3000])
   // Large Meat Sandwich * 3
   mods.gregtech.cuisine_assembler.removeByInput(75, [metaitem('component.baguettes') * 3, metaitem('food.cheddar_slice') * 3, item('minecraft:cooked_beef') * 3], null)
   // Kebab e Soltani! * 2
   mods.gregtech.cuisine_assembler.removeByInput(120, [metaitem('food.kebab.barg') * 2, metaitem('food.kebab.kubide'), metaitem('crop.tomato') * 3, metaitem('crop.onion') * 2, metaitem('food.lemon')], [fluid('gtfo_stearin') * 1000, fluid('gtfo_lemon_extract') * 250])


   // Cake Bottom * 1
   mods.gregtech.forming_press.removeByInput(30, [metaitem('component.sugary_dough') * 4, metaitem('shape.mold.cylinder')], null)
   // Unbaked Bread * 3
   mods.gregtech.forming_press.removeByInput(20, [metaitem('component.dough') * 3, metaitem('wooden_form.bread')], null)
   // Unbaked Bun * 3
   mods.gregtech.forming_press.removeByInput(20, [metaitem('component.dough') * 2, metaitem('wooden_form.bun')], null)
   // Unbaked Baguette * 1
   mods.gregtech.forming_press.removeByInput(20, [metaitem('component.dough') * 2, metaitem('wooden_form.baguette')], null)
   Unfired Cup * 2
   mods.gregtech.forming_press.removeByInput(30, [item('minecraft:clay_ball') * 5, metaitem('component.paper_cone')], null)


   // Banana Peel * 1
   mods.gregtech.canner.removeByInput(32, [metaitem('food.banana')], null)


   // Reinforced Adobe Bricks * 1
   mods.gregtech.assembler.removeByInput(28, [metaitem('plateBronze'), metaitem('brick.adobe_fired') * 2, item('gregtechfoodoption:gtfo_casing'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
   // Reinforced Adobe Bricks * 3
   mods.gregtech.assembler.removeByInput(28, [item('gregtechfoodoption:gtfo_casing') * 3, metaitem('plateBronze') * 3, metaitem('brick.adobe_fired') * 6, metaitem('circuit.integrated').withNbt(["Configuration": 3])], null)


   // Flat Dough * 1
   mods.gregtech.forge_hammer.removeByInput(60, [metaitem('component.dough')], null)


   // Sugary Dough * 2
   mods.gregtech.mixer.removeByInput(7, [item('minecraft:sugar'), metaitem('component.dough')], null)
   // Rabbit Stew * 125
   mods.gregtech.mixer.removeByInput(8, [item('minecraft:brown_mushroom'), item('minecraft:carrot'), item('minecraft:cooked_rabbit'), metaitem('mashed_potato_dust'), metaitem('dustWheat')], [fluid('water') * 50])
   // Chum * 3
   mods.gregtech.mixer.removeByInput(24, [metaitem('food.meat_rotten'), item('minecraft:red_mushroom'), item('minecraft:poisonous_potato'), item('minecraft:fermented_spider_eye')], [fluid('gtfo_sludge') * 100])
   // Chum * 6
   mods.gregtech.mixer.removeByInput(24, [metaitem('food.meat_rotten'), item('minecraft:red_mushroom'), item('minecraft:poisonous_potato'), item('minecraft:fermented_spider_eye')], [fluid('gtfo_sludge') * 100, fluid('gtfo_purple_drink') * 100])
   // Chum * 3
   mods.gregtech.mixer.removeByInput(24, [metaitem('food.fish_rotten'), item('minecraft:red_mushroom'), item('minecraft:poisonous_potato'), item('minecraft:fermented_spider_eye')], [fluid('gtfo_sludge') * 100])
   // Chum * 6
   mods.gregtech.mixer.removeByInput(24, [metaitem('food.fish_rotten'), item('minecraft:red_mushroom'), item('minecraft:poisonous_potato'), item('minecraft:fermented_spider_eye')], [fluid('gtfo_sludge') * 100, fluid('gtfo_purple_drink') * 100])




   // Zest * 1
   mods.gregtech.extractor.removeByInput(5, [metaitem('food.lemon')], null)
   // Olive Oil * 100
   mods.gregtech.extractor.removeByInput(27, [metaitem('crop.olive')], null)
   // Zest * 1
   mods.gregtech.extractor.removeByInput(5, [metaitem('food.lime')], null)
   // Zest * 1
   mods.gregtech.extractor.removeByInput(5, [metaitem('food.orange')], null)
   // Seed Oil * 8
   mods.gregtech.extractor.removeByInput(2, [metaitem('seed.soy'), metaitem('circuit.integrated').withNbt(["Configuration": 3])], null)
   // Raw Soybean Oil * 15
   mods.gregtech.extractor.removeByInput(2, [metaitem('seed.soy'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
   // Small Pile of Wood Pulp * 1
   mods.gregtech.extractor.removeByInput(64, [metaitem('seed.soy'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], null)




   // Mushroom Slice * 8
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:brown_mushroom'), metaitem('config.slicer_blade.flat')], null)
   // Uncooked Bacon
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:porkchop'), metaitem('config.slicer_blade.flat')], null)
   // Pre-Sliced Bread
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:bread'), metaitem('config.slicer_blade.flat')], null)
   // Tomato Slice
   mods.gregtech.slicer.removeByInput(18, [metaitem('crop.tomato'), metaitem('config.slicer_blade.flat')], null)
   // Cucumber Slice
   mods.gregtech.slicer.removeByInput(18, [metaitem('crop.cucumber'), metaitem('config.slicer_blade.flat')], null)
   // Olive Slice
   mods.gregtech.slicer.removeByInput(18, [metaitem('crop.olive'), metaitem('config.slicer_blade.flat')], null)
   // Onion Slice
   // mods.gregtech.slicer.removeByInput(18, [metaitem('crop.onion'), metaitem('config.slicer_blade.flat')], null)
   // Carrot Slice
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:carrot'), metaitem('config.slicer_blade.flat')], null)
   // Peeled Potato
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:potato'), metaitem('config.slicer_blade.flat')], null)
   // Apple Slice
   mods.gregtech.slicer.removeByInput(18, [item('minecraft:apple'), metaitem('config.slicer_blade.octagonal')], null)
   // Beef Slice
   mods.gregtech.slicer.removeByInput(24, [item('minecraft:beef'), metaitem('config.slicer_blade.stripes')], null)
