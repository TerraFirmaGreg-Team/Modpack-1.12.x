
public class TerraFirmaCraftM {

    // Массивы
    static extractHolder = [
      ore('herbalExtractHolder'),
      ore('livelyExtractHolder'),
      ore('energeticExtractHolder'),
      ore('focusedExtractHolder'),
      ore('earthyExtractHolder'),
      ore('pureExtractHolder'),
      ore('fragrantExtractHolder')
    ]

    static extract = [
      item('tfcmedicinal:extract/herbal'), 
      item('tfcmedicinal:extract/lively'), 
      item('tfcmedicinal:extract/energetic'),
      item('tfcmedicinal:extract/focused'),
      item('tfcmedicinal:extract/earthy'), 
      item('tfcmedicinal:extract/pure'),
      item('tfcmedicinal:extract/fragrant')
    ]

    static medicineVial = [
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "warming_panacea", "Amount": 100]]), 
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "health_boost_concoction", "Amount": 100]]), 
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "death_sickness_antidote", "Amount": 100]]),
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "cooling_panacea", "Amount": 100]]),
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "rejuvenating_concoction", "Amount": 100]]), 
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "lung_strength_concoction", "Amount": 100]]),
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "keen_sight_concoction", "Amount": 100]]),
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "stomach_strength_concoction", "Amount": 100]]),
      item('tfcmedicinal:medicine_vial').withNbt(["Fluid": ["FluidName": "nourishing_concoction", "Amount": 100]])
    ]

    static catalyst = [
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "warming_panacea", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "health_boost_concoction", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "death_sickness_antidote", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "cooling_panacea", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "rejuvenating_concoction", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "lung_strength_concoction", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "keen_sight_concoction", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "stomach_strength_concoction", "Amount": 100]]),
      item('tfcmedicinal:catalyst').withNbt(["Fluid": ["FluidName": "nourishing_concoction", "Amount": 100]])
    ]
}