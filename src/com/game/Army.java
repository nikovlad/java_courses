package com.game;

import java.util.ArrayList;
import java.util.Collection;

public class Army {
    private ArrayList<Warrior> units = new ArrayList<>();

    boolean isAlive(){
        for (var unit :units)
            if(unit.isAlive())
                return true;
        return false;
    }

    Army addUnits(String classWarrior, int count){
        for(int i = 0; i < count; i++) {
            Warrior warrior = Warrior.of(classWarrior);
            units.add(warrior);
        }
        armySetBehind(units.size());
        return this;
    }

    private void armySetBehind(int count){
        for(int i = 0; i < count; i++) {
            if(i != count-1 && units.get(i+1).isAlive())
                units.get(i).setBehindWarrior(units.get(i+1));
        }
    }


    Warrior getUnit(){
        for (var unit :units)
            if (unit.isAlive())
                return unit;
        return units.get(0);
    }

    public void removeWarrior(Warrior warrior){
        units.remove(warrior);
        warrior.setBehindWarrior(null);
        units.add(warrior);
        armySetBehind(units.size());
    }
}
