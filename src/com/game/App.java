package com.game;

class App{
    public static void main(String []args){

        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",1);
        army_2.addUnits("Warrior",1);
        army_2.addUnits("Knight",1);
        var result =  Battle.armyFight(army_1,army_2);

        System.out.println(result? "lancer won" : "lancer lost");
        System.out.println("lancer hp = " + army_1.getUnit().getHealth());
        System.out.println("knight hp = " + army_2.getUnit().getHealth());


    }
}