package kr.kro.habaek.virtualinventory.functions.inventory

import kr.kro.habaek.utility.item.Slot
import kr.kro.habaek.utility.item.item
import kr.kro.habaek.utility.item.setDisplay
import kr.kro.habaek.virtualinventory.Main.Companion.pl
import kr.kro.habaek.virtualinventory.functions.VirtualInventory
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import java.io.File

class MineralInventory(override val player: Player) : VirtualInventory {
    override val title = "[광물 인벤토리]"
    override val iconItem = Material.DIAMOND.item().setDisplay("§b[§f광물 인벤토리§b]")
    override val file = File("${pl.dataFolder}/${player.uniqueId}", "${this.javaClass.simpleName}.yml")
    override val data = YamlConfiguration.loadConfiguration(file)
    override val map: HashMap<Slot, Int> = hashMapOf(
        Pair(Slot(0, 0, Material.COBBLESTONE.item()), 0),
        Pair(Slot(0, 1, Material.COBBLED_DEEPSLATE.item()), 0),
        Pair(Slot(0, 2, Material.COAL.item()), 0),
        Pair(Slot(0, 3, Material.LAPIS_LAZULI.item()), 0),
        Pair(Slot(0, 4, Material.RAW_COPPER.item()), 0),
        Pair(Slot(0, 5, Material.RAW_IRON.item()), 0),
        Pair(Slot(0, 6, Material.RAW_GOLD.item()), 0),
        Pair(Slot(0, 7, Material.EMERALD.item()), 0),
        Pair(Slot(0, 8, Material.DIAMOND.item()), 0),
    )
    override val blockList = lisfOf(
        Material.STONE,
        Material.COBBLESTONE,
        Material.DEEPSLATE,
        Material.COBBLED_DEEPSLATE,
        Material.COAL_ORE,
        Material.LAPIS_ORE,
        Material.COPPER_ORE,
        Material.IRON_ORE,
        Material.GOLD_ORE,
        Material.EMERALD_ORE,
        Material.DIAMOND_ORE,
        Material.DEEPSLATE_COAL_ORE,
        Material.DEEPSLATE_LAPIS_ORE,
        Material.DEEPSLATE_COPPER_ORE,
        Material.DEEPSLATE_IRON_ORE,
        Material.DEEPSLATE_GOLD_ORE,
        Material.DEEPSLATE_EMERALD_ORE,
        Material.DEEPSLATE_DIAMOND_ORE,
    )
    override val gui: Inventory = Bukkit.createInventory(null, 9 * 2, title)

    init {
        init()
    }
}