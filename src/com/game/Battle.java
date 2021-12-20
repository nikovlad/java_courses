package com.game;

class Battle {
    public static boolean fight(Warrior warrior1, Warrior warrior2) {
        Warrior attacker = warrior1;
        Warrior defender = warrior2;
        while (attacker.isAlive()) {
            attacker.dealDamage(defender);
            Warrior change = attacker;
            attacker = defender;
            defender = change;
        }
        return warrior1.isAlive();
    }

    public static boolean armyFight(Army army1, Army army2){
        Army attackArmy = army1;
        Army defendArmy = army2;
        while(attackArmy.isAlive() && defendArmy.isAlive())
        {
            Warrior attacker = attackArmy.getUnit();
            Warrior defender = defendArmy.getUnit();
            fight(attacker,defender);
            if(fight(attacker,defender))
                defendArmy.removeWarrior(defender);
            else
                attackArmy.removeWarrior(attacker);
        }
        return attackArmy.isAlive();
    }
}
