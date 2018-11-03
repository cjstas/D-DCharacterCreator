package edu.bsu.cs222.finalproject.functionality;

import edu.bsu.cs222.finalproject.functionality.DiceRoll;
import org.junit.Assert;
import org.junit.Test;

public class DiceRollTests {

    @Test
    public void TestRollD100WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D100();
        boolean assertion = false;
        if (value <=100 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD20WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D20();
        boolean assertion = false;
        if (value <=20 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD10WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D10();
        boolean assertion = false;
        if (value <=10 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD6WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D6();
        boolean assertion = false;
        if (value <=6 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD4WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D4();
        boolean assertion = false;
        if (value <=4 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }

}
