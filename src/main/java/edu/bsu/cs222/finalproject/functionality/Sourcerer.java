package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Sourcerer extends Character {

    public Sourcerer(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        conST=true;
        chaST=true;

        int spellAttackBonus = returnSpellAttackBonus("Charisma");
        int spellSaveDC = returnSpellSaveDC("Charisma");
        int spellCastingModifier = returnSpellCastingModifier("Charisma");
        health=setHealth();

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("arcana");
        validSkills.add("deception");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("persuasion");
        validSkills.add("religion");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Daggers");
        proficiency.add("Darts");
        proficiency.add("Slings");
        proficiency.add("Quarterstaffs");
        proficiency.add("Light crossbows");

        equipment.add("Choose one: a light crossbow and 20 bolts or any simple weapon");
        items.add("Choose one: a component pouch or an arcane focus");
        items.add("Choose one: a dungeoneer's pack or explorer;s pack");
        equipment.add("Two daggers");

        classAbilities.add("Spellcasting");
        classAbilities.add("Sorcerous Origin");

        cantripKnown=4;
        spellsKnown=2;
        spellSlot1=2;

        if (level>=2){
            classAbilities.add("Font of Magic");
            spellsKnown=3;
            spellSlot1=3;
        }
        if (level>=3){
            classAbilities.add("Metamagic");
            spellsKnown=4;
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown=5;
            spellsKnown=5;
            spellSlot2=3;
        }
        if (level>=5){
            spellsKnown=6;
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.add("Sorcerous Origin Feature lvl 6");
            spellsKnown=7;
            spellSlot3=3;
        }
        if (level>=7) {
            spellsKnown=8;
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=9;
            spellSlot4=2;
        }
        if (level>=9){
            spellsKnown=10;
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.add("Metamagic additional choice");
            cantripKnown=6;
            spellsKnown=11;
            spellSlot5=2;
        }
        if (level>=11) {
            spellsKnown=12;
            spellSlot6=1;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            spellsKnown=13;
            spellSlot7=1;
        }
        if (level>=14){
            classAbilities.add("Sorcerous Origin feature lvl 14");
        }
        if (level>=15){
            spellsKnown=14;
            spellSlot8=1;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            classAbilities.add("Metamagic additional choice");
            spellsKnown=15;
            spellSlot9=1;
        }
        if (level>=18){
            classAbilities.add("Sorcerous Origin feature lvl 18");
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.add("Sorcerous Restoration");
            spellSlot7=2;
        }
    }

    public Sourcerer() {

    }

    public int setHealth() {
        int i = 0;
        health=health+6+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D6()+modMap.get(this.constitution);
                i++;
            }
        }
        return health;
    }

    public int returnSpellcastingAbility(int ability) {
        return this.proficiencyBonus+modMap.get(ability);
    }

    public int returnSpellSaveDC(int dc) {
        return 8+this.proficiencyBonus+modMap.get(dc);
    }
}
