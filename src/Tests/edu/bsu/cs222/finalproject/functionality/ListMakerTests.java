package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListMakerTests {

    private ListMaker make = new ListMaker();
    private ArrayList<Spell> spells = make.returnSpellsArrayList5e();
    private ArrayList<String> items = make.returnItemsArrayList5e();

    @Test
    public void testSpell0Name() {
        Assert.assertTrue(spells.get(0).name.equals("Acid Arrow"));
    }

    @Test
    public void testSpell0Slot() {
        Assert.assertEquals(spells.get(0).spellSlotLevel, 2);
    }

    @Test
    public void testSpell0UsableBy() {
        boolean isGood = true;
        if(!spells.get(0).useableBy.contains("Wizard")) isGood = false;
        Assert.assertTrue(isGood);
    }

    @Test
    public void testSpell243Name() {
        Assert.assertTrue(spells.get(243).name.equals("Resilient Sphere"));
    }

    @Test
    public void testSpell243Slot() {
        Assert.assertEquals(spells.get(243).spellSlotLevel, 4);
    }

    @Test
    public void testSpell243UsableBy() {
        boolean isGood = true;
        if(!spells.get(243).useableBy.contains("Wizard")) isGood = false;
        Assert.assertTrue(isGood);
    }

    @Test
    public void testItem0() {
        Assert.assertTrue(items.get(0).equals("Club"));
    }

    @Test
    public void testItem255() {
        Assert.assertTrue(items.get(255).equals("Warship"));
    }

    @Test
    public void testItem10() {
        Assert.assertTrue(items.get(10).equals("Crossbow, light"));
    }
}
