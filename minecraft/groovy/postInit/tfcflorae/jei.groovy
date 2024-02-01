

if (isLoaded("tfcflorae")) {

   // --- Массивы

   def hideCategory = [
      "tfcflorae.casting"
   ]

   def removeAndHide = [
      item('tfcflorae:tools/flint/hammer/flint'),
      item('tfcflorae:tools/flint/hammer_head/flint'),
      item('tfcflorae:container/leather_bag_piece'),
      item('tfcflorae:container/leather_bag'),
      item('tfcflorae:container/pineapple_leather_bag_piece'),
      item('tfcflorae:container/pineapple_leather_bag'),
      // Bows
      item('tfcflorae:tools/bows/shortbow/shortbow'),
      item('tfcflorae:tools/bows/longbow/longbow'),
      item('tfcflorae:tools/bows/bonebow/bonebow'),
      item('tfcflorae:tools/bows/bow_of_lost_souls/bow_of_lost_souls'),
      item('tfcflorae:tools/bows/elite_power_bow/elite_power_bow'),
      item('tfcflorae:tools/bows/green_menace/green_menace'),
      item('tfcflorae:tools/bows/hunting_bow/hunting_bow'),
      item('tfcflorae:tools/bows/nocturnal_bow/nocturnal_bow'),
      item('tfcflorae:tools/bows/red_snake/red_snake'),
      item('tfcflorae:tools/bows/rosebow/rosebow'),
      item('tfcflorae:tools/bows/sabrewing/sabrewing'),
      // Gems
      item('tfcflorae:gem/amber:*')
   ]

   def removeRecipesByName = [
   	"tfcflorae:wood/joshua_tree2/joshua_tree_log",
   	"tfcflorae:wood/joshua_tree/joshua_tree_log_reverse",
   	"tfcflorae:wood/fruit_tree/firmalife/fence/cassia_cinnamon",
   	"tfcflorae:wood/fruit_tree/firmalife/fence/ceylon_cinnamon",
   	"tfcflorae:wood/fruit_tree/firmalife/fence_gate/cassia_cinnamon",
   	"tfcflorae:wood/fruit_tree/firmalife/fence_gate/ceylon_cinnamon",
   	"tfcflorae:yeast"
   ]

   // --- Удаление рецептов

   for(item in hideCategory) {
      mods.jei.hideCategory(item)
   }


   for (item in removeAndHide) {
      mods.jei.removeAndHide(item)
   }

   // Поименное удаление рецептов
   for (item in removeRecipesByName) {
      crafting.remove(item)
   }
}