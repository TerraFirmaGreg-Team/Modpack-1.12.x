import classes.Function

// Массивы
def kepler22b = [
    item('extraplanets:kepler22b:2'),
    item('extraplanets:kepler22b:3'),
    item('extraplanets:kepler22b:4'),
    item('extraplanets:kepler22b:5'),
    item('extraplanets:kepler22b:6'),
    item('extraplanets:kepler22b:7'),
    item('extraplanets:kepler22b:8'),
    item('extraplanets:kepler22b:9'),
    item('extraplanets:kepler22b:10'),
    item('extraplanets:kepler22b:13'),
    item('extraplanets:kepler22b:14'),
    item('extraplanets:kepler22b_maple_saplings:*'),
    item('extraplanets:kepler22b_flowers:*'),
]

// --- Удаление рецептов

// Удаление рецептов
for (item in kepler22b) {
    mods.jei.removeAndHide(item)
}

// --- Добавление рецептов

// --- Атмосфера



// --- Породы