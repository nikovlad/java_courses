package com.game;

class Vampire extends Warrior{

    private int vampirism = 50;

    public Vampire(){
        super(40,4);
    }

    private void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void dealDamage(Warrior defender){
        int heal = getHealth() + (defender.damageTaken(attack) * vampirism /100);
        if(heal>0)
        {
            if(heal >= 40)
                setHealth(40);
            else
                setHealth(heal);
        }
        defender.takeDamage(attack);
    }

}
