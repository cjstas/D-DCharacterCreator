package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListMakerTests {

    private final ArrayList<Spell> spells = ListMaker.returnSpellsArrayList5e();
    private final ArrayList<String> items = ListMaker.returnItemsArrayList5e();

    @Test
    public void testSpell0Name() {
        Assert.assertEquals(spells.get(0).name,"Acid Arrow");
    }

    @Test
    public void testSpell0Slot() {
        Assert.assertEquals(spells.get(0).spellSlotLevel, 2);
    }

    @Test
    public void testSpell0UsableBy() {
        Assert.assertTrue(spells.get(0).useableBy.contains("Wizard"));
    }

    @Test
    public void testSpell243Name() {
        Assert.assertEquals(spells.get(243).name,"Resilient Sphere");
    }

    @Test
    public void testSpell243Slot() {
        Assert.assertEquals(spells.get(243).spellSlotLevel, 4);
    }

    @Test
    public void testSpell243UsableBy() {
        Assert.assertTrue(spells.get(243).useableBy.contains("Wizard"));
    }

    @Test
    public void testItem0() {
        Assert.assertEquals(items.get(0), "Club 1D4 B");
    }

    @Test
    public void testItem255() {
        Assert.assertEquals(items.get(255), "Warship");
    }

    @Test
    public void testItem10() {
        Assert.assertEquals(items.get(10), "Crossbow, light 1D8 P");
    }
}
