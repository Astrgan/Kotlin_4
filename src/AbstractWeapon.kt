abstract class AbstractWeapon (
    val fireType: FireType,
    val maxAmmo: Int
){

    lateinit var listAmmo:MutableList<Ammo>
    var factAmmo:Boolean = false
    abstract fun createAmmo(): MutableList<Ammo>

    fun recharge(){
        listAmmo = createAmmo()
    }

    fun getAmmo(): Ammo {
        return listAmmo.dropLast(1).last()
    }


}


