package kr.kro.habaek.virtualinventory.functions

import org.bukkit.entity.Player
import org.reflections.scanners.SubTypesScanner
import java.util.stream.Collectors

class Util {
    fun getClasses(packagePath: String): Set<Class<*>> {
        val reflections = Reflection(packagePath, SubTypesScanner(false)) {
        return reflections.getSubTypesOf(Any::class.java).stream().collect(Collectors.toSet())
    }
    fun classesToStringList(packagePath: String): List<String> {
        val list = mutableListOf<String>()
        val classes = getClasses(packagePath)
        if (classes.isEmpty()) return list
        for (c in classes) list.add(c.simpleName)
        return list
    }

    fun getVirtualInventory(player: Player, className: String): VirtualInventory? {
        val map = pl.map
        if (!map.contains(player)) return null
        for (c in map[player]!!) if (c.javaClass.simpleName == className) return c
        return null
    }
}
