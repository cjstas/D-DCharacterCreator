package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;


public class DiceRollTests {

    @Test
    public void TestRollD100WithinRange() {
        int value = DiceRoll.D100();
        boolean assertion = false;
        if (value <=100 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD20WithinRange() {
        int value = DiceRoll.D20();
        boolean assertion = false;
        if (value <=20 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD10WithinRange() {
        int value = DiceRoll.D10();
        boolean assertion = false;
        if (value <=10 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD12WithinRange() {
        int value = DiceRoll.D12();
        boolean assertion = false;
        if (value <=12 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD8WithinRange() {
        int value = DiceRoll.D8();
        boolean assertion = false;
        if (value <=8 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD6WithinRange() {
        int value = DiceRoll.D6();
        boolean assertion = false;
        if (value <=6 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }
    @Test
    public void TestRollD4WithinRange() {
        int value = DiceRoll.D4();
        boolean assertion = false;
        if (value <=4 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }

}
