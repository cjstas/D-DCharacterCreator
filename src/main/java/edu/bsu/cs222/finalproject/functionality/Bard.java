package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bard extends Character {

    public Bard() {

    }

    public Bard(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        dexST = true;
        chaST = true;


        int spellAttackBonus = returnSpellAttackBonus("Charisma");
        int spellSaveDC = returnSpellSaveDC("Charisma");
        int spellCastingModifier = returnSpellCastingModifier("Charisma");
        health = setHealth();

        ArrayList<String> validSkills = new ArrayList<>();
        validSkills.add("acrobatics");
        validSkills.add("animalHandeling");
        validSkills.add("arcana");
        validSkills.add("athletics");
        validSkills.add("deception");
        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("investigation");
        validSkills.add("medicine");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("performance");
        validSkills.add("persuasion");
        validSkills.add("religion");
        validSkills.add("sleightofHand");
        validSkills.add("stealth");
        validSkills.add("survival");

        Random randomize = new Random();
        for (int i = 0; i < 3; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Light armor");
        proficiency.add("Simple weapons");
        proficiency.add("Hand crossbows");

        equipment.add("Choose one: Rapier, Longsword, Any simple weapon");
        equipment.add("Choose one: Diplomat's pack or Entertainer's pack");
        equipment.add("Choose one: A Lute or any other musical instrument");
        equipment.add("Leather Armour");
        equipment.add("Dagger");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Spellcasting");
        classAbilities.add("Bardic Inspiration (D6)");

        cantripKnown = 2;
        spellsKnown = 4;
        spellSlot1 = 2;

        if (level >= 2) {
            classAbilities.add("Jack of all Trades");
            classAbilities.add("Song of Rest (D6)");
            spellsKnown = 5;
            spellSlot1 = 3;
        }
        if (level >= 3) {
            classAbilities.add("Bard College: choose one");
            classAbilities.add("Expertise");
            spellsKnown = 6;
            spellSlot1 = 4;
            spellSlot2 = 2;
        }
        if (level >= 4) {
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown = 3;
            spellsKnown = 7;
            spellSlot2 = 3;
        }
        if (level >= 5) {
            classAbilities.add("Bardic Inspiration (D8)");
            classAbilities.add("Font of Inspiration");
            spellsKnown = 8;
            spellSlot3 = 2;
        }
        if (level >= 6) {
            classAbilities.add("Countercharm");
            classAbilities.add("Bard College Feature lvl 6");
            spellsKnown = 9;
            spellSlot3 = 3;
        }
        if (level >= 7) {
            spellsKnown = 10;
            spellSlot4 = 1;
        }
        if (level >= 8) {
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown = 11;
            spellSlot4 = 2;
        }
        if (level >= 9) {
            classAbilities.set(classAbilities.indexOf("Song of Rest (D6)"), "Song of Rest (D8)");
            spellsKnown = 12;
            spellSlot4 = 3;
            spellSlot5 = 1;
        }
        if (level >= 10) {
            classAbilities.set(classAbilities.indexOf("Bardic Inspiration (D6)"), "Bardic Inspiration (D10)");
            classAbilities.add("Expertise");
            classAbilities.add("Magical Secrets");
            cantripKnown = 4;
            spellsKnown = 14;
            spellSlot5 = 2;
        }
        if (level >= 11) {
            spellsKnown = 15;
            spellSlot6 = 1;
        }
        if (level >= 12) {
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level >= 13) {
            classAbilities.set(classAbilities.indexOf("Song of Rest (D8)"), "Song of Rest (D10)");
            spellsKnown = 16;
            spellSlot7 = 1;
        }
        if (level >= 14) {
            classAbilities.add("Magical Secrets");
            classAbilities.add("Bard College feature lvl 14");
            spellsKnown = 18;
        }
        if (level >= 15) {
            classAbilities.set(classAbilities.indexOf("Bardic Inspiration (D8)"), "Bardic Inspiration (D12)");
            spellsKnown = 19;
            spellSlot8 = 1;
        }
        if (level >= 16) {
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level >= 17) {
            classAbilities.set(classAbilities.indexOf("Song of Rest (D10)"), "Song of Rest (D12)");
            spellsKnown = 20;
            spellSlot9 = 1;
        }
        if (level >= 18) {
            classAbilities.add("Magical Secrets");
            spellsKnown = 22;
            spellSlot5 = 3;
        }
        if (level >= 19) {
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6 = 2;
        }
        if (level >= 20) {
            classAbilities.add("Superior Inspiration");
            spellSlot7 = 2;
        }
    }

    public int setHealth() {
        int i = 0;
        health = health + 8 + modMap.get(this.constitution);
        if (level > 1) {
            while (i <= level) {
                int healthAdd = DiceRoll.D8()+modMap.get(this.constitution);
                if (healthAdd <0){
                    healthAdd = 0;
                }
                health = health + healthAdd;
                i++;
            }
        }
        return health;
    }
}