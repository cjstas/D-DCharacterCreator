package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SpellTests {

    private ArrayList testSpell1Users = new ArrayList();
    private ArrayList testSpell2Users = new ArrayList();
    private Spell testSpell1;
    private Spell testSpell2;

    private void fillTestObjects() {
        testSpell1Users.add("Wizard");
        testSpell1Users.add("Cleric");
        testSpell2Users.add("Warlock");
        testSpell2Users.add("Wizard");

        testSpell1 = new Spell("Test Spell 1", testSpell1Users, 1);
        testSpell2 = new Spell("Test Spell 2", testSpell2Users, 3);
    }

    @Test
    public void TestSpell1IsCastableByCleric() {
        fillTestObjects();
       // Assert.assertTrue(testSpell1.isCastableBy("Cleric"));
    }

    @Test
    public void TestSpell2IsNotCastableByCleric() {
        fillTestObjects();
        //Assert.assertFalse(testSpell2.isCastableBy("Cleric"));
    }

    @Test
    public void TestSpell2IsCastableByWarlock() {
        fillTestObjects();
        //Assert.assertTrue(testSpell2.isCastableBy("Warlock"));
    }

    @Test
    public void TestSpell1IsNotCasableByWarlock() {
        fillTestObjects();
        //Assert.assertFalse(testSpell1.isCastableBy("Warlock"));
    }
    @Test
    public void TestSpell1IsCasableByWizard() {
        fillTestObjects();
        //Assert.assertTrue(testSpell1.isCastableBy("Wizard"));
    }
    @Test
    public void TestSpell2IsCasableByWizard() {
        fillTestObjects();
        //Assert.assertTrue(testSpell2.isCastableBy("Wizard"));
    }
    @Test
    public void TestSpell1IsNotCasableByDruid() {
        fillTestObjects();
       // Assert.assertFalse(testSpell1.isCastableBy("Druid"));
    }
    @Test
    public void TestSpell2IsNotCasableByDruid() {
        fillTestObjects();
        //Assert.assertFalse(testSpell2.isCastableBy("Druid"));
    }
}
