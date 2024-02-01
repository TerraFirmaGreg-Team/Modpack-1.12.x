// MODS_LOADED: architecturecraft


   // --- Массивы
   
   def removeAndHide = [
      item('architecturecraft:sawblade'),
       item('architecturecraft:largepulley')
   ]
   
   
   def removeRecipe = [
      item('architecturecraft:chisel'),
      item('architecturecraft:hammer'),
      item('architecturecraft:sawbench')
   ]
   
   // --- Удаление рецептов
   
   for (item in removeAndHide) {
      mods.jei.removeAndHide(item)
   }
   
   for (item in removeRecipe) {
       crafting.removeByOutput(item)
   }
