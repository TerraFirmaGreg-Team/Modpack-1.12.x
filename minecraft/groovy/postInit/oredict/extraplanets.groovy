// MODS_LOADED: extraplanets

import classes.array.Galacticraft

// --- Добавление

// Сухой лед
ore('blockDryIce').add(item('extraplanets:iapetus:6'))

// Балоны
for (oxygenTankLight in Galacticraft.oxygenTankLight) {
    ore('gc.oxygen.tank.light').add(oxygenTankLight)
    if (oxygenTankLight == item('extraplanets:oxygen_tank_light_full_white')) {}
    else {
        ore('gc.oxygen.tank.light.colors').add(oxygenTankLight)
    }
}
for (oxygenTankMed in Galacticraft.oxygenTankMed) {
    ore('gc.oxygen.tank.med').add(oxygenTankMed)
    if (oxygenTankMed == item('extraplanets:oxygen_tank_med_full_white')) {}
    else {
        ore('gc.oxygen.tank.med.colors').add(oxygenTankMed)
    }
}
for (oxygenTankHeavy in Galacticraft.oxygenTankHeavy) {
    ore('gc.oxygen.tank.heavy').add(oxygenTankHeavy)
    if (oxygenTankHeavy == item('extraplanets:oxygen_tank_heavy_full_white')) {}
    else {
        ore('gc.oxygen.tank.heavy.colors').add(oxygenTankHeavy)
    }
}

ore('logWood').add([
    item('extraplanets:kepler22b_maple_logs:2'),
    item('extraplanets:kepler22b_maple_logs:3'),
    item('extraplanets:kepler22b_maple_logs:1'),
    item('extraplanets:kepler22b_maple_logs'),
    item('extraplanets:kepler22b_maple_logs2:1'),
    item('extraplanets:kepler22b_maple_logs2')
])

ore('plankWood').add([
    item('extraplanets:kepler22b_planks:4'),
    item('extraplanets:kepler22b_planks:1'),
    item('extraplanets:kepler22b_planks:3'),
    item('extraplanets:kepler22b_planks:2'),
    item('extraplanets:kepler22b_planks'),
    item('extraplanets:kepler22b_planks:5')
])

ore('gravel').add([
    item('extraplanets:titania_gravel'),
    item('extraplanets:deimos_gravel'),
    item('extraplanets:io_gravel'),
    item('extraplanets:europa_gravel'),
    item('extraplanets:eris_gravel'),
    item('extraplanets:pluto_gravel'),
    item('extraplanets:saturn_gravel'),
    item('extraplanets:jupiter_gravel'),
    item('extraplanets:ceres_gravel'),
    item('extraplanets:mercury_gravel'),
    item('extraplanets:iapetus_gravel'),
    item('extraplanets:titania_gravel'),
    item('extraplanets:oberon_gravel'),
    item('extraplanets:titan_gravel'),
    item('extraplanets:rhea_gravel'),
    item('extraplanets:ganymede_gravel'),
    item('extraplanets:callisto_gravel'),
    item('extraplanets:triton_gravel'),
    item('extraplanets:phobos_gravel')
])
