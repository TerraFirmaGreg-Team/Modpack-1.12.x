#priority 980

import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;


// - Бревна
global tfcLogs as IItemStack[] = [
	<tfc:wood/log/acacia>,
	<tfc:wood/log/african_padauk>,
	<tfc:wood/log/alder>,
	<tfc:wood/log/angelim>,
	<tfc:wood/log/ash>,
	<tfc:wood/log/aspen>,
	<tfc:wood/log/bald_cypress>,
	<tfc:wood/log/baobab>,
	<tfc:wood/log/beech>,
	<tfc:wood/log/birch>,
	<tfc:wood/log/black_walnut>,
	<tfc:wood/log/blackwood>,
	<tfc:wood/log/box>,
	<tfc:wood/log/brazilwood>,
	<tfc:wood/log/butternut>,
	<tfc:wood/log/chestnut>,
	<tfc:wood/log/cocobolo>,
	<tfc:wood/log/cypress>,
	<tfc:wood/log/douglas_fir>,
	<tfc:wood/log/ebony>,
	<tfc:wood/log/european_oak>,
	<tfc:wood/log/fever>,
	<tfc:wood/log/fruitwood>,
	<tfc:wood/log/ginkgo>,
	<tfc:wood/log/greenheart>,
	<tfc:wood/log/hawthorn>,
	<tfc:wood/log/hazel>,
	<tfc:wood/log/hemlock>,
	<tfc:wood/log/hevea>,
	<tfc:wood/log/hickory>,
	<tfc:wood/log/holly>,
	<tfc:wood/log/hornbeam>,
	<tfc:wood/log/ipe>,
	<tfc:wood/log/iroko>,
	<tfc:wood/log/ironwood>,
	<tfc:wood/log/jacaranda>,
	<tfc:wood/log/juniper>,
	<tfc:wood/log/kapok>,
	<tfc:wood/log/kauri>,
	<tfc:wood/log/larch>,
	<tfc:wood/log/limba>,
	<tfc:wood/log/locust>,
	<tfc:wood/log/logwood>,
	<tfc:wood/log/maclura>,
	<tfc:wood/log/mahoe>,
	<tfc:wood/log/mahogany>,
	<tfc:wood/log/mangrove>,
	<tfc:wood/log/maple>,
	<tfc:wood/log/marblewood>,
	<tfc:wood/log/messmate>,
	<tfc:wood/log/mountain_ash>,
	<tfc:wood/log/nordmann_fir>,
	<tfc:wood/log/norway_spruce>,
	<tfc:wood/log/oak>,
	<tfc:wood/log/palm>,
	<tfc:wood/log/pine>,
	<tfc:wood/log/pink_cherry>,
	<tfc:wood/log/pink_ivory>,
	<tfc:wood/log/poplar>,
	<tfc:wood/log/purpleheart>,
	<tfc:wood/log/red_cedar>,
	<tfc:wood/log/red_elm>,
	<tfc:wood/log/redwood>,
	<tfc:wood/log/rosewood>,
	<tfc:wood/log/rowan>,
	<tfc:wood/log/rubber_fig>,
	<tfc:wood/log/sequoia>,
	<tfc:wood/log/spruce>,
	<tfc:wood/log/sweetgum>,
	<tfc:wood/log/sycamore>,
	<tfc:wood/log/syzygium>,
	<tfc:wood/log/teak>,
	<tfc:wood/log/walnut>,
	<tfc:wood/log/wenge>,
	<tfc:wood/log/white_cedar>,
	<tfc:wood/log/white_cherry>,
	<tfc:wood/log/white_elm>,
	<tfc:wood/log/whitebeam>,
	<tfc:wood/log/willow>,
	<tfc:wood/log/yellow_meranti>,
	<tfc:wood/log/yew>,
	<tfc:wood/log/zebrawood>,
	<tfcflorae:wood/log/joshua_tree>,
	<tfcflorae:wood/pole/arrow_bamboo>,
	<tfcflorae:wood/pole/black_bamboo>,
	<tfcflorae:wood/pole/blue_bamboo>,
	<tfcflorae:wood/pole/dragon_bamboo>,
	<tfcflorae:wood/pole/golden_bamboo>,
	<tfcflorae:wood/pole/narrow_leaf_bamboo>,
	<tfcflorae:wood/pole/red_bamboo>,
	<tfcflorae:wood/pole/temple_bamboo>,
	<tfcflorae:wood/pole/thorny_bamboo>,
	<tfcflorae:wood/pole/timber_bamboo>,
	<tfcflorae:wood/pole/tinwa_bamboo>,
	<tfcflorae:wood/pole/weavers_bamboo>,
	<firmalife:cinnamon_pole>,
	<firmalife:cocoa_pole>,
	<firmalife:banana_pole>,
	<firmalife:cherry_pole>,
	<firmalife:green_apple_pole>,
	<firmalife:lemon_pole>,
	<firmalife:olive_pole>,
	<firmalife:orange_pole>,
	<firmalife:peach_pole>,
	<firmalife:plum_pole>,
	<firmalife:red_apple_pole>,
	<tfcflorae:wood/fruit_tree/pole/cassia_cinnamon>,
	<tfcflorae:wood/fruit_tree/pole/ceylon_cinnamon>,
	<tfc:wood/log/eucalyptus>,
	// <tfcflorae:wood/log/argyle_eucalyptus>,
	// <tfcflorae:wood/log/rainbow_eucalyptus>,
	// <tfcflorae:wood/log/snow_gum_eucalyptus>
];

// - TFC Lumber Array
global tfcLumber as IItemStack[] = [
	<tfc:wood/lumber/acacia>,
	<tfc:wood/lumber/african_padauk>,
	<tfc:wood/lumber/alder>,
	<tfc:wood/lumber/angelim>,
	<tfc:wood/lumber/ash>,
	<tfc:wood/lumber/aspen>,
	<tfc:wood/lumber/bald_cypress>,
	<tfc:wood/lumber/baobab>,
	<tfc:wood/lumber/beech>,
	<tfc:wood/lumber/birch>,
	<tfc:wood/lumber/black_walnut>,
	<tfc:wood/lumber/blackwood>,
	<tfc:wood/lumber/box>,
	<tfc:wood/lumber/brazilwood>,
	<tfc:wood/lumber/butternut>,
	<tfc:wood/lumber/chestnut>,
	<tfc:wood/lumber/cocobolo>,
	<tfc:wood/lumber/cypress>,
	<tfc:wood/lumber/douglas_fir>,
	<tfc:wood/lumber/ebony>,
	<tfc:wood/lumber/european_oak>,
	<tfc:wood/lumber/fever>,
	<tfc:wood/lumber/fruitwood>,
	<tfc:wood/lumber/ginkgo>,
	<tfc:wood/lumber/greenheart>,
	<tfc:wood/lumber/hawthorn>,
	<tfc:wood/lumber/hazel>,
	<tfc:wood/lumber/hemlock>,
	<tfc:wood/lumber/hevea>,
	<tfc:wood/lumber/hickory>,
	<tfc:wood/lumber/holly>,
	<tfc:wood/lumber/hornbeam>,
	<tfc:wood/lumber/ipe>,
	<tfc:wood/lumber/iroko>,
	<tfc:wood/lumber/ironwood>,
	<tfc:wood/lumber/jacaranda>,
	<tfc:wood/lumber/juniper>,
	<tfc:wood/lumber/kapok>,
	<tfc:wood/lumber/kauri>,
	<tfc:wood/lumber/larch>,
	<tfc:wood/lumber/limba>,
	<tfc:wood/lumber/locust>,
	<tfc:wood/lumber/logwood>,
	<tfc:wood/lumber/maclura>,
	<tfc:wood/lumber/mahoe>,
	<tfc:wood/lumber/mahogany>,
	<tfc:wood/lumber/mangrove>,
	<tfc:wood/lumber/maple>,
	<tfc:wood/lumber/marblewood>,
	<tfc:wood/lumber/messmate>,
	<tfc:wood/lumber/mountain_ash>,
	<tfc:wood/lumber/nordmann_fir>,
	<tfc:wood/lumber/norway_spruce>,
	<tfc:wood/lumber/oak>,
	<tfc:wood/lumber/palm>,
	<tfc:wood/lumber/pine>,
	<tfc:wood/lumber/pink_cherry>,
	<tfc:wood/lumber/pink_ivory>,
	<tfc:wood/lumber/poplar>,
	<tfc:wood/lumber/purpleheart>,
	<tfc:wood/lumber/red_cedar>,
	<tfc:wood/lumber/red_elm>,
	<tfc:wood/lumber/redwood>,
	<tfc:wood/lumber/rosewood>,
	<tfc:wood/lumber/rowan>,
	<tfc:wood/lumber/rubber_fig>,
	<tfc:wood/lumber/sequoia>,
	<tfc:wood/lumber/spruce>,
	<tfc:wood/lumber/sweetgum>,
	<tfc:wood/lumber/sycamore>,
	<tfc:wood/lumber/syzygium>,
	<tfc:wood/lumber/teak>,
	<tfc:wood/lumber/walnut>,
	<tfc:wood/lumber/wenge>,
	<tfc:wood/lumber/white_cedar>,
	<tfc:wood/lumber/white_cherry>,
	<tfc:wood/lumber/white_elm>,
	<tfc:wood/lumber/whitebeam>,
	<tfc:wood/lumber/willow>,
	<tfc:wood/lumber/yellow_meranti>,
	<tfc:wood/lumber/yew>,
	<tfc:wood/lumber/zebrawood>,
	<tfc:wood/lumber/joshua_tree>,
	<tfcflorae:wood/lumber/arrow_bamboo>,
	<tfcflorae:wood/lumber/black_bamboo>,
	<tfcflorae:wood/lumber/blue_bamboo>,
	<tfcflorae:wood/lumber/dragon_bamboo>,
	<tfcflorae:wood/lumber/golden_bamboo>,
	<tfcflorae:wood/lumber/narrow_leaf_bamboo>,
	<tfcflorae:wood/lumber/red_bamboo>,
	<tfcflorae:wood/lumber/temple_bamboo>,
	<tfcflorae:wood/lumber/thorny_bamboo>,
	<tfcflorae:wood/lumber/timber_bamboo>,
	<tfcflorae:wood/lumber/tinwa_bamboo>,
	<tfcflorae:wood/lumber/weavers_bamboo>,
	<tfcflorae:wood/fruit_tree/lumber/cinnamon>,
	<tfcflorae:wood/fruit_tree/lumber/cocoa>,
	<tfcflorae:wood/fruit_tree/lumber/banana>,
	<tfcflorae:wood/fruit_tree/lumber/cherry>,
	<tfcflorae:wood/fruit_tree/lumber/green_apple>,
	<tfcflorae:wood/fruit_tree/lumber/lemon>,
	<tfcflorae:wood/fruit_tree/lumber/olive>,
	<tfcflorae:wood/fruit_tree/lumber/orange>,
	<tfcflorae:wood/fruit_tree/lumber/peach>,
	<tfcflorae:wood/fruit_tree/lumber/plum>,
	<tfcflorae:wood/fruit_tree/lumber/red_apple>,
	<tfcflorae:wood/fruit_tree/lumber/cassia_cinnamon>,
	<tfcflorae:wood/fruit_tree/lumber/ceylon_cinnamon>,
	<tfc:wood/lumber/eucalyptus>,
	// <tfc:wood/lumber/eucalyptus>,
	// <tfc:wood/lumber/eucalyptus>,
	// <tfc:wood/lumber/eucalyptus>
];