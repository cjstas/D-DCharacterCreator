package edu.bsu.cs222.finalproject.functionality;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTests {

    private static Barbarian character1 = new Barbarian("character1", "Barbarian", 1, "Dwarf", "acolyte", "Chaotic Neutral", "Christo", 3000, 1, 2, 3,4,5,6);
    @Test
    public void testRaceBonusSetSpeed() {
        character1.subrace = 0;
        Assert.assertEquals(25, character1.speed);
    }


}
