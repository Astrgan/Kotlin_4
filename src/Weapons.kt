object Weapons {

    val rifle = object :AbstractWeapon(FireType.SingleFireType, 8){
        override fun createAmmo(): MutableList<Ammo> {
            val listAmmo = mutableListOf<Ammo>()
            for (i in 1..maxAmmo) {
                listAmmo.add(Ammo.RIFLE)
            }
            return listAmmo
        }

    }

    val pistol = object :AbstractWeapon(FireType.SingleFireType, 8){
        override fun createAmmo(): MutableList<Ammo> {
           val listAmmo = mutableListOf<Ammo>()
            for (i in 1..maxAmmo) {
                listAmmo.add(Ammo.PISTOL)
            }
            return listAmmo
        }

    }

    val goldPistol = object :AbstractWeapon(FireType.SingleFireType, 12){
        override fun createAmmo(): MutableList<Ammo> {
            val listAmmo = mutableListOf<Ammo>()
            for (i in 1..maxAmmo) {
                listAmmo.add(Ammo.PISTOL)
            }
            return listAmmo
        }

    }

    val automatic = object :AbstractWeapon(FireType.SingleFireType, 30){
        override fun createAmmo(): MutableList<Ammo> {
            val listAmmo = mutableListOf<Ammo>()
            for (i in 1..maxAmmo) {
                listAmmo.add(Ammo.AUTOMATIC)
            }
            return listAmmo
        }

    }

    val gun = object :AbstractWeapon(FireType.SingleFireType, 100){
        override fun createAmmo(): MutableList<Ammo> {
            val listAmmo = mutableListOf<Ammo>()
            for (i in 1..maxAmmo) {
                listAmmo.add(Ammo.GUN)
            }
            return listAmmo
        }

    }
}