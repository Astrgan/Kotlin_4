package Warriors

import Weapons

class Gunner: AbstractWarrior(
    maxLife=10,
    accuracy = 1,
    weapon = Weapons.gun,
    chance = 1
)