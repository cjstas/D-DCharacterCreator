package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Rogue extends Character {

    public Rogue(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        dexST=true;
        intelST=true;

        spellAttackBonus = returnSpellAttackBonus("Intelligence");
        spellSaveDC = returnSpellSaveDC("Intelligence");
        spellCastingModifier = returnSpellCastingModifier("Intelligence");
        health=setHealth();

        validSkills.add("acrobatics");
        validSkills.add("athletics");
        validSkills.add("deception");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("investigation");
        validSkills.add("perception");
        validSkills.add("performance");
        validSkills.add("persuasion");
        validSkills.add("sleightofHand");
        validSkills.add("stealth");

        Random randomize = new Random();
        for (int i = 0; i < 4 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Light Armour");
        proficiency.add("Simple Weapons");
        proficiency.add("Hand Crossbow");
        proficiency.add("Longsword");
        proficiency.add("Rapier");
        proficiency.add("Shortsword");
        proficiency.add("Thieve's Tools");

        classAbilities.add("Expertise");
        classAbilities.add("Sneak Attack");
        language.add("Thieves' Cant");

        setLevelAbilities();
    }

    public Rogue() {
        dexST=true;
        intelST=true;

        validSkills.add("acrobatics");
        validSkills.add("athletics");
        validSkills.add("deception");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("investigation");
        validSkills.add("perception");
        validSkills.add("performance");
        validSkills.add("persuasion");
        validSkills.add("sleightofHand");
        validSkills.add("stealth");

        proficiency.add("Light Armour");
        proficiency.add("Simple Weapons");
        proficiency.add("Hand Crossbow");
        proficiency.add("Longsword");
        proficiency.add("Rapier");
        proficiency.add("Shortsword");
        proficiency.add("Thieve's Tools");

        classAbilities.add("Expertise");
        classAbilities.add("Sneak Attack");
        language.add("Thieves' Cant");

        setLevelAbilities();
    }

    @SuppressWarnings("Duplicates")
    public int setHealth() {
        int i = 0;
        health=health+8+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                int healthAdd = DiceRoll.D8()+modMap.get(this.constitution);
                if (healthAdd <0){
                    healthAdd = 0;
                }
                health=health+healthAdd;
                i++;
            }
        }
        return health;
    }

    @Override
    public void setLevelAbilities(){
        if (level>=2){
            classAbilities.add("Cunning Action");
        }

        if (level>=3){
            classAbilities.add("Roguish Archetype");
            cantripKnown=3;
            spellsKnown=3;
            spellSlot1=2;
        }

        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=4;
            spellSlot1=3;
        }

        if (level>=5){
            classAbilities.add("Uncanny Dodge");
        }

        if (level>=6){
            classAbilities.add("Expertise 2");
        }

        if (level>=7){
            classAbilities.add("Evasion");
            spellsKnown=5;
            spellSlot1=4;
            spellSlot2=2;
        }

        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=6;
        }

        if (level>=9){
            classAbilities.add("Roguish Archetype feature lvl 9");
        }

        if (level>=10){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown=4;
            spellsKnown=7;
            spellSlot2=3;
        }

        if (level>=11){
            classAbilities.add("Reliable Talent");
            spellsKnown=8;
        }

        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=13){
            classAbilities.add("Roguish Archetype feature lvl 13");
            spellsKnown=9;
            spellSlot3=2;
        }

        if (level>=14){
            classAbilities.add("Blindsense");
            spellsKnown=10;
        }

        if (level>=15){
            classAbilities.add("Slippery Mind");
        }

        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=11;
            spellSlot3=3;
        }

        if (level>=17){
            classAbilities.add("Roguish Archetype feature lvl 17");
        }

        if (level>=18){
            classAbilities.add("Elusive");
        }

        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=12;
            spellSlot5=1;
        }

        if (level>=20){
            classAbilities.add("Stroke of Luck");
            spellsKnown=13;
        }
    }

    @Override
    public ArrayList<String> getSkills() {
        for (int i = 0; i < 2; i++) {
            String skill = validSkills.get(new Random().nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }
        return (ArrayList<String>) knownSkills;
    }

    @Override
    public boolean[] setSavingThrows() {
        return new boolean[]{strST, dexST, conST, intelST, wisST, chaST};
    }
}
