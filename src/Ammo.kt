enum class Ammo(val damage: Int, val chanceCritical: Int, val critical:Int) {
    PISTOL(1, 3, 4),
    AUTOMATIC(2, 3, 4),
    GUN(3,1,7),
    RIFLE(5, 3,9);

    fun damaging():Int{
        return damage + if ((0..10).random()==chanceCritical) critical else 0
    }
}