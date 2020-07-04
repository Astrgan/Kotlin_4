package Warriors

import AbstractWeapon

abstract class AbstractWarrior(
    private val maxLife: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon,
    override val chance: Int,
    var life: Int = maxLife
): Warrior {
    override var isKilled: Boolean = true

    override fun fire(unit: Warrior) {
        TODO("Not yet implemented")
    }

    override fun loss(damage: Int) {
        life -= damage
    }
    /*
    Методы:
        атаковать (override) - если патроны в оружии закончились - перезарядить
         оружие и не стрелять в этом ходу. Иначе получить патроны для выстрела.
          Для каждого патрона проверить, попадает ли он в соответствии с
          точностью воина и шансом избежать попадания врагом. Для патронов,
          которые попадают во врага, посчитать суммарный урон. Нанести урон
          врагу.

     */

}