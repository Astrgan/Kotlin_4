package Warriors

import Weapons

class Captain: AbstractWarrior(
    maxLife=30,
    accuracy = 3,
    weapon = Weapons.automatic,
    chance = 2
)