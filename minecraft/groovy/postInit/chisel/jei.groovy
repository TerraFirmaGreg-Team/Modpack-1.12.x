// MODS_LOADED: chisel


// --- Массивы

def removeRecipe = [
	item('chisel:auto_chisel'),
	item('chisel:offsettool'),
	item('chisel:chisel_iron'),
	item('chisel:chisel_diamond'),
	item('chisel:chisel_hitech'),
	item('chisel:tyrian'),
	item('chisel:laboratory'),
	item('chisel:temple'),
	item('chisel:factory'),
	item('chisel:brownstone'),
	// Glass
	// item('chisel:glasspane:*'),
	// item('chisel:glasspane1:*'),
	// item('chisel:glasspanedyedbrown:*'),
	// item('chisel:glasspanedyedcyan:*'),
	// item('chisel:glasspanedyedyellow:*'),
	// item('chisel:glasspanedyedlightblue:*'),
	// item('chisel:glasspanedyedblack:*'),
	// item('chisel:glasspanedyedblue:*'),
	// item('chisel:glasspanedyedgray:*'),
	// item('chisel:glasspanedyedwhite:*'),
	// item('chisel:glasspanedyedred:*'),
	// item('chisel:glasspanedyedlightgray:*'),
	// item('chisel:glasspanedyedpink:*'),
	// item('chisel:glasspanedyedorange:*'),
	// item('chisel:glasspanedyedgreen:*'),
	// item('chisel:glasspanedyedpurple:*'),
	// item('chisel:glasspanedyedlime:*'),
	// item('chisel:glasspanedyedmagenta:*')
]

def removeRecipesByName = [
   	'chisel:uncraft_blockiron',
	'chisel:uncraft_blockgold',
	'chisel:emerald',
	'chisel:diamond',
	'chisel:redstone',
	'chisel:coal'
]

// --- Удаление рецептов

// Удаление рецептов
for (item in removeRecipe) {
   crafting.removeByOutput(item)
}

// Поименное удаление рецептов
for (item in removeRecipesByName) {
   crafting.remove(item)
}

// Black Concrete * 1
// item('recipemap:fluid_solidifier').findRecipe(7, [metaitem('shape.mold.block')], [fluid('concrete') * 1296]).	remove()
