package com.game;

class Lancer extends  Warrior{
    private static int decay = 50;

    public Lancer(){
        super(50,6);
    }


    private void setHealth(int health) {
        this.health = health;
    }

    public void dealDamage(Warrior defender){
        defender.takeDamage(attack);
        int damageForSecondAttack = defender.damageTaken(attack) * decay/100;
        if(defender.getBehind()!=null && defender.getBehind().isAlive())
            defender.getBehind().takeDamage(damageForSecondAttack);
    }

    protected void takeDamage(int attack){
        setHealth(getHealth()-attack);
    }
}