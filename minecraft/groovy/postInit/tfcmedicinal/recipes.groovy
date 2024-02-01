import classes.array.TerraFirmaCraftM


if (isLoaded("tfcmedicinal")) {

    for (int i = 0; i < TerraFirmaCraftM.extract.size(); i++) {
        crafting.addShapeless(TerraFirmaCraftM.extract[i], [TerraFirmaCraftM.extractHolder[i], item('tfcmedicinal:mpestle').reuse()])
        mods.gregtech.macerator.recipeBuilder()
          .inputs(TerraFirmaCraftM.extractHolder[i])
          .outputs(TerraFirmaCraftM.extract[i])
          .duration(20).EUt(7).buildAndRegister()
    }
    
    for (int i = 0; i < TerraFirmaCraftM.medicineVial.size(); i++) {
        mods.gregtech.chemical_reactor.recipeBuilder()
          .inputs(TerraFirmaCraftM.catalyst[i])
          .inputs(item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "base_concoction", "Amount": 100]]))
          .outputs(TerraFirmaCraftM.medicineVial[i])
          .duration(20).EUt(7).buildAndRegister()
    }
    
    mods.gregtech.chemical_reactor.recipeBuilder()
      .inputs(item('tfc:plants/turkey_tail'))
      .inputs(item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "salt_water", "Amount": 100]]))
      .outputs(item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "base_concoction", "Amount": 100]]))
      .duration(100).EUt(30).buildAndRegister()
    
    mods.gregtech.canner.recipeBuilder()
      .circuitMeta(12)
      .inputs(item('tfcmedicinal:medicine_vial'))
      .fluidInputs(fluid('salt_water') * 100)
     	.outputs(item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "salt_water", "Amount": 100]]) * 1)
      .duration(40).EUt(10).buildAndRegister()
}