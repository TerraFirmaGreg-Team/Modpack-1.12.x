import com.cleanroommc.groovyscript.event.LootTablesLoadedEvent

event_manager.listen { LootTablesLoadedEvent event ->

    event.loot.getTable('minecraft:gameplay/fishing/fish').getPool('main').removeEntry('minecraft:fish')
    event.loot.getTable('minecraft:gameplay/fishing/fish').getPool('main').removeEntry('minecraft:fish#0')
    event.loot.getTable('minecraft:gameplay/fishing/fish').getPool('main').removeEntry('minecraft:fish#1')
    event.loot.getTable('minecraft:gameplay/fishing/fish').getPool('main').removeEntry('minecraft:fish#2')

    event.loot.getTable('minecraft:chests/stronghold_library').getPool('main').addEntry(
        event.loot.entryBuilder()
            .name('tfg:gameplay/fishing/fish')
            .item(item('tfc:food/fish'))
            .weight(100)
            .quality(1)
            .build()
    )
}