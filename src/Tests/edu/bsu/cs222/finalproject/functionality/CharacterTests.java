package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTests {

    private static Barbarian Barbarian = new Barbarian("Barbarian", "Barbarian", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Bard Bard = new Bard("Bard", "Bard", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Cleric Cleric = new Cleric("Cleric", "Cleric", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Druid Druid = new Druid("Druid", "Druid", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Fighter Fighter = new Fighter("Fighter", "Fighter", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Monk Monk = new Monk("Monk", "Monk", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Paladin Paladin = new Paladin("Paladin", "Paladin", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Ranger Ranger = new Ranger("Ranter", "Ranger", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Rogue Rogue = new Rogue("Rogue", "Rogue", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Sourcerer Sourcerer = new Sourcerer("Sourcerer", "Sourcerer", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Warlock Warlock = new Warlock("Warlock", "Warlock", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    private static Wizard Wizard = new Wizard("Wizard", "Wizard", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);

    @Test
    public void testRaceBonusSetSpeed() {
        Barbarian.subrace = 0;
        Assert.assertEquals(25, Barbarian.speed);
    }

    @Test
    public void testBarbarianHealth() {
        Assert.assertEquals(9, Barbarian.health);
    }
    @Test
    public void testBardHealth() {
        Assert.assertEquals(5, Bard.health);
    }
    @Test
    public void testClericHealth() {
        Assert.assertEquals(5, Cleric.health);
    }
    @Test
    public void testDruidHealth() {
        Assert.assertEquals(5, Druid.health);
    }
    @Test
    public void testFighterHealth() {
        Assert.assertEquals(7, Fighter.health);
    }
    @Test
    public void testMonkHealth() {
        Assert.assertEquals(5, Monk.health);
    }
    @Test
    public void testPaladinHealth() {
        Assert.assertEquals(7, Paladin.health);
    }
    @Test
    public void testRangerHealth() {
        Assert.assertEquals(7, Ranger.health);
    }
    @Test
    public void testRogueHealth() {
        Assert.assertEquals(5, Rogue.health);
    }
    @Test
    public void testSourcererHealth() {
        Assert.assertEquals(3, Sourcerer.health);
    }
    @Test
    public void testWarlockHealth() {
        Assert.assertEquals(5, Warlock.health);
    }
    @Test
    public void testWizardHealth() {
        Assert.assertEquals(3, Wizard.health);
    }

    @Test
    public void testBardHasSpellMods() {
        boolean trueorfalse = true;
        if(Bard.spellCastingModifier == 0 || Bard.spellAttackBonus == 0|| Bard.spellSaveDC == 0) {
            trueorfalse = false;
        }
        Assert.assertTrue(trueorfalse);
    }
    @Test
    public void testBarbarianHasNoSpellMods() {
        boolean trueorfalse = false;
        if(Barbarian.spellCastingModifier == 0 && Barbarian.spellAttackBonus == 0&& Barbarian.spellSaveDC == 0) {
            trueorfalse = true;
        }
        Assert.assertTrue(trueorfalse);
    }

    @Test
    public void testBardSpellAttackModIsCorrect() {
        Assert.assertEquals(-2, Bard.spellAttackBonus);
    }
    @Test
    public void testBardSpellCastingModIsCorrect() {
        Assert.assertEquals(-2, Bard.spellCastingModifier);
    }
    @Test
    public void testBardSpellSaveDCIsCorrect() {
        Assert.assertEquals(6, Bard.spellSaveDC);
    }

    @Test
    public void testWizardSpellAttackModIsCorrect() {
        Assert.assertEquals(-3, Wizard.spellAttackBonus);
    }
    @Test
    public void testWizardSpellCastingModIsCorrect() {
        Assert.assertEquals(-3, Wizard.spellCastingModifier);
    }
    @Test
    public void testWizardSpellSaveDCIsCorrect() {
        Assert.assertEquals(5, Wizard.spellSaveDC);
    }


}
