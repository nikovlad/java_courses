package com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Warrior {
   public static Warrior of(String clazz){
        switch (clazz){
            case "Warrior": return new Warrior();
            case  "Knight": return new Knight();
            case  "Defender": return new Defender();
            case  "Rookie": return new Rookie();
            case  "Vampire": return new Vampire();
            case  "Lancer": return new Lancer();

            default: throw new IllegalArgumentException("Unknown Warrior type" + clazz);
        }
    }

    protected int health;
    protected int attack;



    private Warrior behind;



    public Warrior(){
        health = 50;
        attack = 5;
    }

    public Warrior(int hp, int dmg){
        health = hp;
        attack = dmg;
    }

    public boolean isAlive(){ return health > 0; }

    protected Warrior getBehind() { return behind; }

    private void setBehind(Warrior behind) { this.behind = behind; }

    protected void setBehindWarrior(Warrior warrior){ setBehind(warrior); }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return this.attack;
    }

    public void dealDamage(Warrior defender){
        defender.takeDamage(attack);
    }

    protected void takeDamage(int attack){ setHealth(getHealth()-attack); }

    protected int damageTaken(int attack){
        if(getHealth() - attack >= 0)
            return attack;
        else
            return getHealth();
    }
}





