

if (isLoaded("theoneprobe")) {

    // --- Массивы
    
    def removeAndHide = [
        item('theoneprobe:creativeprobe'),
        item('theoneprobe:probenote'),
        item('theoneprobe:diamond_helmet_probe'),
        item('theoneprobe:gold_helmet_probe'),
        item('theoneprobe:iron_helmet_probe')
    ]
    
    // --- Удаление рецептов
    
    for (item in removeAndHide) {
       mods.jei.removeAndHide(item)
    }
}