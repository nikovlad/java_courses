package com.game;

class Defender extends  Warrior{

    private int defense = 2;

    public Defender(){
        super(60,3);
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private int getDefense () {
        return defense;
    }

    @Override
    protected void takeDamage(int attack){
        if(attack>= defense)
            this.setHealth(this.getHealth() - attack + getDefense());
    }

    @Override
    protected int damageTaken(int attack){
        if(getHealth() - attack + getDefense() >= 0)
            return attack - getDefense();
        else
            return getHealth();
    }
}