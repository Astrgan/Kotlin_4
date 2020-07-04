package Warriors

interface Warrior {
    val chance: Int
    var isKilled: Boolean

    fun fire(unit: Warrior)
    fun loss(damage: Int)
}