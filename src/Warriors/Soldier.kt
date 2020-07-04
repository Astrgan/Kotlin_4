package Warriors

import Weapons

class Soldier: AbstractWarrior(
    maxLife=10,
    accuracy = 1,
    weapon = Weapons.pistol,
    chance = 1
)