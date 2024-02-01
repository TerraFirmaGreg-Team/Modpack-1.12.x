// MODS_LOADED: projectred-core

import classes.array.ProjectRed


// --- Добавление

ore('dustIlluminar').add(ProjectRed.illuminars)
ore('lampBlockDeactivated').add(ProjectRed.deLamps)
ore('lampBlockActivated').add(ProjectRed.aLamps)
ore('lampButton').add(ProjectRed.buttonLamps)
ore('lampButtonFeedback').add(ProjectRed.feedbackLamps)
ore('lampLanternDeactivated').add(ProjectRed.deLanternLamps)
ore('lampLanternActivated').add(ProjectRed.aLanternLamps)
ore('lampFixtureDeactivated').add(ProjectRed.deFixtureLamps)
ore('lampFixtureActivated').add(ProjectRed.aFixtureLamps)
ore('lampFalloutDeactivated').add(ProjectRed.deFalloutLamps)
ore('lampFalloutActivated').add(ProjectRed.aFalloutLamps)
ore('lampCageDeactivated').add(ProjectRed.deCageLamps)
ore('lampCageActivated').add(ProjectRed.aCageLamps)

// --- Удаление

ore('ingotCopper').remove(item('projectred-core:resource_item', 100))
ore('ingotTin').remove(item('projectred-core:resource_item', 101))
ore('ingotSilver').remove(item('projectred-core:resource_item', 102))
ore('ingotRedAlloy').remove(item('projectred-core:resource_item', 103))
ore('ingotElectrotineAlloy').remove(item('projectred-core:resource_item', 104))
ore('gemRuby').remove(item('projectred-core:resource_item', 200))
ore('gemSapphire').remove(item('projectred-core:resource_item', 201))
ore('gemPeridot').remove(item('projectred-core:resource_item', 202))
ore('dustElectrotine').remove(item('projectred-core:resource_item', 105))
