import gregtech.api.unification.ore.OrePrefix
import gregtech.api.GTValues

public class Function {


  // Урон по инструменту item('gregtech:saw').transform(Function.setToolDamage)
  static setToolDamage = { stack -> 
    stack.setItemDamage(stack.getItemDamage() + 1)
    return stack
  }


// --- Атмосферы

  static GenerateGasCollectorRecipes(int dimension, int circuitConfig) {
    mods.gregtech.gas_collector.recipeBuilder()
        .notConsumable(metaitem('circuit.integrated').withNbt([Configuration: circuitConfig]))
        .fluidOutputs(fluid('air')  * 10000)
        .dimension(dimension)
        .duration(200).EUt(256).buildAndRegister()
  }

  static GenerateRecipesForAir(input, dimension, euGas, euFreez, circuitConfig) {

    // Gas Collector
    mods.gregtech.gas_collector.recipeBuilder()
        .notConsumable(metaitem('circuit.integrated').withNbt([Configuration: circuitConfig]))
        .fluidOutputs(fluid(input + "_air")  * 10000)
        .dimension(dimension)
        .duration(200)
        .EUt(GTValues.VA[euGas])
        .buildAndRegister()

    // Vacuum Freezer
    mods.gregtech.vacuum_freezer.recipeBuilder()
        .fluidInputs(fluid(input + "_air") * 4000)
        .fluidOutputs(fluid(input + "_liquid_air")  * 4000)
        .duration(80)
        .EUt(GTValues.VA[euFreez])
        .buildAndRegister()
  }

  // --- Породы

  static GenerateRecipesForSurfaceStones3(surface, sub_surface, stone, output, durationMulti, euMulti) {

    // Поверхность --> Пыль х1
    mods.gregtech.macerator.recipeBuilder()
        .inputs(surface * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 500, 150)
        .chancedOutput(output, 250, 200)
        .duration(200 * durationMulti)
        .EUt(240 * GTValues.VA[euMulti])
        .buildAndRegister()

    // Подповерхность --> х2
    mods.gregtech.macerator.recipeBuilder()
        .inputs(sub_surface * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 7500, 150)
        .chancedOutput(output, 500, 200)
        .duration(600 * durationMulti)
        .EUt(240 * GTValues.VA[euMulti])
        .buildAndRegister()

    // Порода --> Пыль х3
    mods.gregtech.macerator.recipeBuilder()
        .inputs(stone  * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 4500, 150)
        .chancedOutput(output, 4500, 200)
        .duration(1800 * durationMulti)
        .EUt(240  * GTValues.VA[euMulti])
        .buildAndRegister()
  }

  static GenerateRecipesForSurfaceStones2(surface, sub_surface, output, durationMulti, euMulti) {

    // Поверхность --> Пыль х1
      mods.gregtech.macerator.recipeBuilder()
        .inputs(surface * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 500, 150)
        .chancedOutput(output, 250, 200)
        .duration(200 * durationMulti)
        .EUt(240 * GTValues.VA[euMulti])
        .buildAndRegister()

    // Подповерхность --> х2
    mods.gregtech.macerator.recipeBuilder()
        .inputs(sub_surface * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 7500, 150)
        .chancedOutput(output, 500, 200)
        .duration(600 * durationMulti)
        .EUt(240 * GTValues.VA[euMulti])
        .buildAndRegister()
  }

  static GenerateRecipesForSurfaceStones1(surface, output, durationMulti, euMulti) {

    // Поверхность --> Пыль х1
    mods.gregtech.macerator.recipeBuilder()
        .inputs(surface * 3)
        .outputs(output)
        .chancedOutput(output, 4500, 100)
        .chancedOutput(output, 500, 150)
        .chancedOutput(output, 250, 200)
        .duration(200 * durationMulti)
        .EUt(240 * GTValues.VA[euMulti])
        .buildAndRegister()
  }

}