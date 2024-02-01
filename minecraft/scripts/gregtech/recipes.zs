import crafttweaker.item.IItemStack;
import crafttweaker.oredict.IOreDictEntry;

import mods.terrafirmacraft.ItemRegistry;
import mods.gregtech.TerminalRegistry;


// Регистрация металлов для голов ножей
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeCopper>, "COPPER", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeBismuthBronze>, "BISMUTH_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeBronze>, "BRONZE", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeBlackBronze>, "BLACK_BRONZE", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeWroughtIron>, "WROUGHT_IRON", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeSteel>, "STEEL", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeBlackSteel>, "BLACK_STEEL", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeRedSteel>, "RED_STEEL", 144, true);
ItemRegistry.registerItemMetal(<metaitem:toolHeadKnifeBlueSteel>, "BLUE_STEEL", 144, true);

// Регистрация металлов для палок GT
ItemRegistry.registerItemMetal(<metaitem:stickGold>, "GOLD", 72, true);
ItemRegistry.registerItemMetal(<metaitem:stickWroughtIron>, "WROUGHT_IRON", 72, true);
ItemRegistry.registerItemMetal(<metaitem:stickSteel>, "STEEL", 72, true);

// Регистрация металлов для двойных пластин GregTech
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBismuth>, "BISMUTH", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBrass>, "BRASS", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBronze>, "BRONZE", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleCopper>, "COPPER", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleGold>, "GOLD", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleLead>, "LEAD", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleNickel>, "NICKEL", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleRoseGold>, "ROSE_GOLD", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleSilver>, "SILVER", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleTin>, "TIN", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBismuthBronze>, "BISMUTH_BRONZE", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBlackBronze>, "BLACK_BRONZE", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleSteel>, "STEEL", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleWroughtIron>, "WROUGHT_IRON", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleSterlingSilver>, "STERLING_SILVER", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleZinc>, "ZINC", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleRedSteel>, "RED_STEEL", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBlueSteel>, "BLUE_STEEL", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoubleBlackSteel>, "BLACK_STEEL", 288, true);
ItemRegistry.registerItemMetal(<metaitem:plateDoublePlatinum>, "PLATINUM", 288, true);


// Телепорт
TerminalRegistry.registerDevice(<charset:icon>, "disabled");
TerminalRegistry.createAppRegistryBuilder("teleport")
    .isDefaultApp(false)
    .device(0, "disabled")
    .upgrade(<charset:icon>)
    .build();