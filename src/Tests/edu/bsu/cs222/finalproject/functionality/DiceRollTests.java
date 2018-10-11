package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

public class DiceRollTests {

    @Test
    public void TestRollD100WithinRange() {
        DiceRoll roll = new DiceRoll();
        int value = roll.D100();
        boolean assertion = false;
        if (value <=20 && value>0) {
            assertion = true;
        }
        Assert.assertTrue(assertion);
    }

}
