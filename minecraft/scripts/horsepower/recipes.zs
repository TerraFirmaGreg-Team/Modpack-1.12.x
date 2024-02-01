import crafttweaker.item.IItemStack;

import mods.horsepower.Grindstone;
import mods.horsepower.ChoppingBlock;


// --- Добавление рецептов

// Дерево -> Пиломатериалы
for i, tfcLumber in tfcLumber {
    ChoppingBlock.add(tfcLogs[i], tfcLumber * 10, 2, false);
}

// Другие рецепты
Grindstone.add(<tfc:food/soybean>, <firmalife:ground_soybeans>, 10, false);
Grindstone.add(<ore:rockFlux>, <tfc:powder/flux> * 3, 5, false);
