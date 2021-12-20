package com.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    @DisplayName("Test 1: Warrior vs Knight")
    void Test1() {
        var carl = new Warrior();
        var jim = new Knight();


        var result = Battle.fight(carl, jim);

        assertFalse(result, "Carl should have lose");
    }

    @Test
    @DisplayName("Test 2: Knight vs Warrior")
    void Test2() {
        var ramon = new Knight();
        var slevin = new Warrior();


        var result = Battle.fight(ramon, slevin);

        assertTrue(result, "Ramon should have won");
    }

    @Test
    @DisplayName("Test 3: Warrior vs Warrior")
    void Test3() {
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);
        var result = bob.isAlive();

        assertTrue(result, "Bob is Alive");
    }

    @Test
    @DisplayName("Test 4: Knight vs Warrior")
    void Test4() {
        var zeus = new Knight();
        var godkiller = new Warrior();

        Battle.fight(zeus, godkiller);
        var result = zeus.isAlive();

        assertTrue(result, "Zeus is Alive");
    }

    @Test
    @DisplayName("Test 5: Warrior vs Warrior")
    void Test5() {
        var husband = new Warrior();
        var wife = new Warrior();

        Battle.fight(husband, wife);
        var result = wife.isAlive();

        assertFalse(result, "Wife is Alive");
    }

    @Test
    @DisplayName("Test 6: Warrior vs Knight")
    void Test6() {
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);
        var result = knight.isAlive();

        assertTrue(result, "Knight is Alive");
    }

    @Test
    @DisplayName("Test 7: Warrior vs Knight")
    void Test7() {
        var unit_1 = new Warrior();
        var unit_2 = new Knight();
        var unit_3 = new Warrior();
        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_2, unit_3);

        assertFalse(result, "unit_2 should have won");
    }
    @ParameterizedTest(name = "[{index}] {0} vs {1} Result => {2}")
    @CsvSource({"Defender,Warrior,true",
            "Defender,Rookie,true",})
    void fightWarriors(String firstWarriorType,
                       String SecondWarriorType,
                       boolean expected){
        var first = Defender.of(firstWarriorType);
        var second = Warrior.of(SecondWarriorType);
        var result = Battle.fight(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Battle 1")
    void Test8(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",1);
        army_2.addUnits("Warrior",2);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 2")
    void Test9(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",2);
        army_2.addUnits("Warrior",3);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 3")
    void Test10(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",5);
        army_2.addUnits("Warrior",7);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 4")
    void Test11(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 5")
    void Test12(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",10);
        army_2.addUnits("Warrior",11);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 6")
    void Test13(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",11);
        army_2.addUnits("Warrior",7);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 7")
    void Test14(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",5);
        army_1.addUnits("Defender",4);
        army_1.addUnits("Defender",5);
        army_2.addUnits("Warrior",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 8")
    void Test15(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",20);
        army_1.addUnits("Defender",5);
        army_1.addUnits("Defender",4);
        army_2.addUnits("Warrior",21);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 9")
    void Test16(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",15);
        army_1.addUnits("Defender",5);
        army_2.addUnits("Warrior",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 10")
    void Test17(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",1);
        army_1.addUnits("Defender",3);
        army_2.addUnits("Warrior",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }

    @Test
    @DisplayName("Battle 11")
    void Test18(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",2);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",3);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 12")
    void Test19(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",5);
        army_1.addUnits("Vampire",6);
        army_1.addUnits("Warrior",7);
        army_2.addUnits("Warrior",6);
        army_2.addUnits("Defender",6);
        army_2.addUnits("Vampire",6);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 13")
    void Test20(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",11);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",13);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 14")
    void Test21(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",9);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",8);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",13);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }

    @Test
    @DisplayName("Battle 15")
    void Test22(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",5);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Defender",2);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 16")
    void Test23(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",7);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Defender",2);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
}