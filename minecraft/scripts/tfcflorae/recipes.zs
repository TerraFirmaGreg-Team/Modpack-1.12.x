import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;

import mods.terrafirmacraft.Barrel;

import mods.horsepower.Press;
import mods.firmalife.Drying;


// --- Массивы
val CleanNets as IItemStack[] = [
	<tfc:crop/product/jute_net>,
	<tfcflorae:crop/product/sisal_net>,
	<tfcflorae:crop/product/silk_net>,
	<tfcflorae:crop/product/cotton_net>,
	<tfcflorae:crop/product/linen_net>,
	<tfcflorae:crop/product/hemp_net>
];
val ItemsForJuices as IItemStack[] = [
	<tfc:food/snow_berry>,
	<tfc:food/raspberry>,
	<tfc:food/gooseberry>,
	<tfc:food/elderberry>,
	<tfc:food/cranberry>,
	<tfc:food/cloud_berry>,
	<tfc:food/bunch_berry>,
	<tfc:food/blueberry>,
	<tfc:food/blackberry>,
	<tfcflorae:food/green_cayenne_pepper>,
	<tfc:food/banana>,
	<tfc:food/lemon>,
	<tfcflorae:food/juniper>,
	<tfc:food/cherry>,
	<tfcflorae:crop/product/agave>,
	<tfc:food/wintergreen_berry>,
	<tfc:food/strawberry>,
	<tfc:plants/barrel_cactus>,
	<tfcflorae:food/purple_grape>,
	<tfc:food/plum>,
	<tfc:food/peach>,
	<tfc:food/orange>
];
val FluidsForJuices as ILiquidStack[] = [
	<liquid:juice_snow_berry>,
	<liquid:juice_raspberry>,
	<liquid:juice_gooseberry>,
	<liquid:juice_elderberry>,
	<liquid:juice_cranberry>,
	<liquid:juice_cloud_berry>,
	<liquid:juice_bunch_berry>,
	<liquid:juice_blueberry>,
	<liquid:juice_blackberry>,
	<liquid:juice_green_grape>,
	<liquid:juice_banana>,
	<liquid:juice_lemon>,
	<liquid:juice_juniper>,
	<liquid:juice_cherry>,
	<liquid:juice_agave>,
	<liquid:juice_wintergreen_berry>,
	<liquid:juice_strawberry>,
	<liquid:juice_barrel_cactus>,
	<liquid:juice_purple_grape>,
	<liquid:juice_plum>,
	<liquid:juice_peach>,
	<liquid:juice_orange>
];
val DirtyNets as IItemStack[] = [
	<tfc:crop/product/dirty_jute_net>,
	<tfcflorae:crop/product/dirty_sisal_net>,
	<tfcflorae:crop/product/dirty_silk_net>,
	<tfcflorae:crop/product/dirty_cotton_net>,
	<tfcflorae:crop/product/dirty_linen_net>,
	<tfcflorae:crop/product/dirty_hemp_net>
];
val MissingFreshFruits as IItemStack[] = [
	<tfcflorae:food/baobab_fruit>,
	<tfcflorae:food/barrel_cactus_fruit>,
	<tfcflorae:food/hawthorn>,
	<tfcflorae:food/osage_orange>,
	<tfcflorae:food/pink_ivory_drupe>,
	<tfcflorae:food/riberry>,
	<tfcflorae:food/rowan_berry>,
	<tfcflorae:food/sky_fruit>,
	<tfcflorae:food/yew_berry>,
	<tfcflorae:food/green_grape>,
	<tfcflorae:food/purple_grape>
];
val MissingDriedFruits as IItemStack[] = [
	<tfcflorae:food/dried/baobab_fruit>,
	<tfcflorae:food/dried/barrel_cactus_fruit>,
	<tfcflorae:food/dried/hawthorn>,
	<tfcflorae:food/dried/osage_orange>,
	<tfcflorae:food/dried/pink_ivory_drupe>,
	<tfcflorae:food/dried/riberry>,
	<tfcflorae:food/dried/rowan_berry>,
	<tfcflorae:food/dried/sky_fruit>,
	<tfcflorae:food/dried/yew_berry>,
	<tfcflorae:food/dried/green_grape>,
	<tfcflorae:food/dried/purple_grape>
];

// Сок из ...
for i, FluidsForJuices in FluidsForJuices {
  	// Конский пресс
	Press.add(ItemsForJuices[i], FluidsForJuices * 10);

}

// Сок из яблок

Press.add(<ore:apple>, <liquid:juice_apple> * 10);


// Net -> Dirty Net
for i, DirtyNets in DirtyNets {
    
    Barrel.addRecipe("tfg/tfcflorae/olive_oil_water_to_olive_oil_" + i, CleanNets[i], <liquid:olive_oil_water> * 250, DirtyNets, <liquid:olive_oil> * 50, 0);
}

// GT Orange Juice -> Orange Vine
Barrel.addRecipe("tfg/tfcflorae/orange_juice_to_orange_vine", <tfcflorae:yeast>, <liquid:juice_orange> * 500, <liquid:orange_wine> * 500, 72);

// Сушенная еда
for i, MissingFreshFruits in MissingFreshFruits{
	Drying.addRecipe("tfg/tfcflorae/drying/" + i, MissingFreshFruits, MissingDriedFruits[i], 12000);
}


mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_knife_1", <gregtech:meta_tool_head_knife:2049> * 2, "X  X ", "XX XX", "XX XX", "XX XX", "XX XX");
mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_knife_2", <gregtech:meta_tool_head_knife:2049> * 2, "X   X", "XX XX", "XX XX", "XX XX", "XX XX");
mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_knife_3", <gregtech:meta_tool_head_knife:2049> * 2, " X X ", "XX XX", "XX XX", "XX XX", "XX XX");

mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_shovel", <gregtech:meta_tool_head_shovel:2049> * 2, " XXX ", " XXX ", " XXX ", " XXX ", "  X  ");

mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_hoe", <gregtech:meta_tool_head_hoe:2049> * 2, " XXX ", " XXX ", " XXX ", " XXX ", "  X  ");
mods.tfcflorae.knapping.add("flint", "tfg/tfcflorae/flint/head_hoe_2", <gregtech:meta_tool_head_hoe:2049> * 2, " XXX ", " XXX ", " XXX ", " XXX ", "  X  ");
