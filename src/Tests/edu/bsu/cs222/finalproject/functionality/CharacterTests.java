package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTests {

    private Barbarian character1;

    private void fillTestObjects() {
        character1.setAC(19);
        character1.setAlignment("Chaotic Good");
        character1.setCharacterName("Krell");
        character1.setClassType("Cleric");
        character1.setEXP(200);
        character1.setInitiative(1);
        character1.setInspiration(false);
        character1.setLevel(4);
        character1.setPlayerName("Christo");
        character1.setRace("Tortle");
        character1.setBonds("Bonds");
        character1.setEquippedArmour("Shield");
        character1.setFeatsAndTraits("Tough", "Too long didn't include");
        character1.setFlaws("Stupid");
        character1.setHealth(40, 40);
        character1.setIdeals("Take care of people around him");
        character1.setLanguages("common, aquan");
        character1.setPersonalityTrait("none");
        character1.setSavingThrow(false);
        character1.setSkills(false);
        character1.setSpeed(30);
        character1.setSpellAttackBonus(6);
        character1.setSpellcastingAbility(4);
        character1.setSpellSaveDC(14);
        character1.setStats(15,12,14,11,18,13);
    }
    @Test
    public void testGetAC() {
        fillTestObjects();
        Assert.assertEquals(character1.getAC(), 19);
    }
    @Test
    public void testGetAlignment() {
        fillTestObjects();
        Assert.assertTrue(character1.getAlignment().equals("Chaotic Good"));
    }
    @Test
    public void testGetCharacterName() {
        fillTestObjects();
        Assert.assertTrue(character1.getCharacterName().equals("Krell"));
    }
    @Test
    public void testGetClassType() {
        fillTestObjects();
        Assert.assertTrue(character1.getClassType().equals("Cleric"));
    }
    @Test
    public void testGetEXP() {
        fillTestObjects();
        Assert.assertEquals(character1.getEXP(), 200);
    }
    @Test
    public void testGetInitiative() {
        fillTestObjects();
        Assert.assertEquals(character1.getInitiative(), 1);
    }
    @Test
    public void testGetInspiration() {
        fillTestObjects();
        Assert.assertEquals(character1.getInspiration(), false);
    }
    @Test
    public void testGetLevel() {
        fillTestObjects();
        Assert.assertEquals(character1.getLevel(), 4);
    }
    @Test
    public void testGetPlayerName() {
        fillTestObjects();
        Assert.assertTrue(character1.getPlayerName().equals("Christo"));
    }
    @Test
    public void testGetRace() {
        fillTestObjects();
        Assert.assertTrue(character1.getRace().equals("Tortle"));
    }
    @Test
    public void testGetBonds() {
        fillTestObjects();
        Assert.assertEquals(character1.getBonds(), "Bonds");
    }
    @Test
    public void testGetEquipment() {
        fillTestObjects();
        Assert.assertTrue(character1.getEquipment().equals("Stuff"));
    }
    @Test
    public void testGetEquippedArmor() {
        fillTestObjects();
        Assert.assertTrue(character1.getEquippedArmour().equals("Shield"));
    }
    @Test
    public void testGetFeatsAndTraits() { // Cant Do this until this method is implemented
        fillTestObjects();
        Assert.assertTrue(character1.getFeatsAndTraits().equals("Tough"));
    }
    @Test
    public void testGetFlaws() {
        fillTestObjects();
        Assert.assertTrue(character1.getFlaws().equals("Stupid"));
    }
    @Test
    public void testGetHealth() {
        fillTestObjects();
        Assert.assertEquals(character1.getHealth(), 40);
    }
    @Test
    public void testGetIdeals() {
        fillTestObjects();
        Assert.assertTrue(character1.getIdeals().equals("Take care of people around him"));
    }
    @Test
    public void testGetLanguages() {
        fillTestObjects();
        Assert.assertTrue(character1.getLanguages().equals("common, aquan"));
    }
    @Test
    public void testGetPersonalityTraits() {
        fillTestObjects();
        Assert.assertTrue(character1.getPersonalityTrait().equals("none"));
    }
    @Test
    public void testGetSpeed() {
        fillTestObjects();
        Assert.assertEquals(character1.getSpeed(), 30);
    }
    @Test
    public void testGetSpellAttackBonus() {
        fillTestObjects();
        Assert.assertEquals(character1.getSpellAttackBonus(), 6);
    }
    @Test
    public void testGetSpellcastingAbility() {
        fillTestObjects();
        Assert.assertEquals(character1.getSpellcastingAbility(), 4);
    }
    @Test
    public void testGetStats() { // This Dosent Work
        fillTestObjects();
        Assert.assertEquals(character1.getStats(), 19);
    }
}
