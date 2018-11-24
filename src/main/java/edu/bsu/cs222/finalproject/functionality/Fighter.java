package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Fighter extends Character {

    public Fighter(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);

        strST=true;
        conST=true;

        spellAbility=setSpellcastingAbility(intel);
        dc=setSpellSaveDC(intel);
        totalHealth=setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("acrobatics");
        validSkills.add("animalHandeling");
        validSkills.add("athletics");
        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("perception");
        validSkills.add("survival");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("All armour");
        proficiency.add("Shield");
        proficiency.add("Simple weapons");
        proficiency.add("Martial weapons");

        equipment.add("Choose one: Chain Mail or Leather armour,longbow, and 20 arrows");
        equipment.add("Choose one: A martial weapon and shield or two martial weapons");
        equipment.add("Choose one: A light crossbow and 20 bolts or two hand axes");

        items.add("Choose one: A dungeoneer's pack or an explorer's pack");

        classAbilities.add("Fighting style");
        classAbilities.add("Second wind");

        if (level>=2){
            classAbilities.add("Action Surge");
        }

        if (level>=3){
            classAbilities.add("Martial Archetype");
            cantripKnown=2;
            spellsKnown=3;
            spellSlot1=2;
        }

        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=4;
            spellSlot1=3;
        }

        if (level>=5){
            classAbilities.add("Extra Attack");
        }

        if (level>=6){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=7){
            classAbilities.add("Martial Archetype feature lvl 7");
            spellsKnown=5;
            spellSlot1=4;
            spellSlot2=2;
        }

        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=6;
        }

        if (level>=9){
            classAbilities.add("Indomitable");
        }

        if (level>=10){
            classAbilities.add("Martial Archetype feature lvl 10");
            spellsKnown=7;
            spellSlot2=3;
        }

        if (level>=11){
            classAbilities.add("Extra Attack (2)");
            spellsKnown=8;
        }

        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=13){
            classAbilities.add("Indomitable (2)");
            spellsKnown=9;
            spellSlot3=2;
        }

        if (level>=14){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=10;
        }

        if (level>=15){
            classAbilities.add("Martial Archetype feature lvl 15");
        }

        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=11;
            spellSlot3=3;
        }

        if (level>=17){
            classAbilities.add("Action Surge (2)");
            classAbilities.add("Indomitable (3)");
        }

        if (level>=18){
            classAbilities.add("Martial Archetype lvl 18");
        }

        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=12;
            spellSlot4=1;
        }

        if (level>=20){
            classAbilities.add("Extra Attack (3)");
            spellsKnown=13;
        }
    }

    public Fighter() {

    }

    @Override
    public String getBackground() {
        return null;
    }

    @Override
    public void setBackground(String background) {

    }

    @Override
    public void setClassType(String classType) {

    }

    @Override
    public void setPlayerName(String playerName) {

    }

    @Override
    public void setRace(String race) {

    }

    @Override
    public void setAlignment(String alignment) {

    }

    @Override
    public int getProficiencyBonus() {
        return 0;
    }

    @Override
    public void setProficiencyBonus(int proficiencyBonus) {

    }

    @Override
    public void setSpeed(int speed) {

    }

    @Override
    public void setPersonalityTrait(String personalityTrait) {

    }

    @Override
    public void setIdeals(String ideals) {

    }

    @Override
    public void setBonds(String bonds) {

    }

    @Override
    public void setFlaws(String flaws) {

    }

    public int setHealth(int health, int level) {
        int i = 0;
        health=health+10+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D10()+modMap.get(this.constitution);
                i++;
            }
        }
        return health;
    }

    @Override
    public void setEquipment() {

    }

    @Override
    public int setSpellcastingAbility(int ability) {
        return getProficiencyBonus() + modMap.get(ability);
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return getProficiencyBonus()+modMap.get(dc)+8;
    }
}
