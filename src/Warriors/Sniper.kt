package Warriors

import Weapons

class Sniper: AbstractWarrior(
    maxLife=10,
    accuracy = 5,
    weapon = Weapons.rifle,
    chance = 1
)