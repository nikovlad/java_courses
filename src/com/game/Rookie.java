package com.game;

class Rookie extends  Warrior{

    public Rookie(){
        super(10,1);
    }

    @Override
    public int getAttack() {
        return attack;
    }
}
