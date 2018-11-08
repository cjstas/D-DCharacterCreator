package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Fighter extends Character {

    public Fighter(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);

        setSavingThrow(strST);
        setSavingThrow(conST);
        sa=setSpellcastingAbility(intel);
        dc=setSpellSaveDC(intel);
        totalHealth=setHealth(totalHealth,level);

        List<String> fighterSkills = new ArrayList<>();
        fighterSkills.add("acrobatics");
        fighterSkills.add("animalHandeling");
        fighterSkills.add("athletics");
        fighterSkills.add("history");
        fighterSkills.add("insight");
        fighterSkills.add("intimidation");
        fighterSkills.add("perception");
        fighterSkills.add("survival");

        Random randomize = new Random();
        String x = fighterSkills.get(randomize.nextInt(fighterSkills.size()));
        setSkills(parseBoolean(x));
        String y = fighterSkills.get(randomize.nextInt(fighterSkills.size()));
        while (x.equals(y)) {
            y = fighterSkills.get(randomize.nextInt(fighterSkills.size()));
        }
        setSkills(parseBoolean(y));

        List<String> proficiency = new ArrayList<>();
        proficiency.add("All armour");
        proficiency.add("Shield");
        proficiency.add("Simple weapons");
        proficiency.add("Martial weapons");

        equipment.add("Choose one: Chain Mail or Leather armour,longbow, and 20 arrows");
        equipment.add("Choose one: A martial weapon and shield or two martial weapons");
        equipment.add("Choose one: A light crossbow and 20 bolts or two hand axes");

        items.add("Choose one: A dungeoneer's pack or an explorer's pack");

        List<String> classAbilities = new ArrayList<>();

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

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {

    }

    @Override
    public String getPersonalityTrait() {
        return null;
    }

    @Override
    public void setPersonalityTrait(String personalityTrait) {

    }

    @Override
    public String getIdeals() {
        return null;
    }

    @Override
    public void setIdeals(String ideals) {

    }

    @Override
    public String getBonds() {
        return null;
    }

    @Override
    public void setBonds(String bonds) {

    }

    @Override
    public String getFlaws() {
        return null;
    }

    @Override
    public void setFlaws(String flaws) {

    }

    @Override
    public int getStats() {
        return 0;
    }

    @Override
    public void setStats(int str, int dex, int con, int intel, int wis, int cha) {

    }

    @Override
    public int getHealth() {
        return 0;
    }

    public int setHealth(int health, int level) {
        int i = 0;
        health=health+10+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D10()+getMod(getConstitution());
                i++;
            }
        }
        return health;
    }

    @Override
    public String getLanguages() {
        return null;
    }

    @Override
    public void setLanguages(String languages) {

    }

    @Override
    public String getEquipment() {
        return null;
    }

    @Override
    public void setEquipment() {

    }

    @Override
    public String getEquippedArmour() {
        return null;
    }

    @Override
    public void setEquippedArmour(String armour) {

    }

    @Override
    public String getFeatsAndTraits() {
        return null;
    }

    @Override
    public void setFeatsAndTraits(String feats, String traits) {

    }

    @Override
    public int getSpellcastingAbility() {
        return 0;
    }

    @Override
    public int setSpellcastingAbility(int ability) {
        return getProficiencyBonus() + getMod(ability);
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return getProficiencyBonus()+getMod(dc)+8;
    }

    @Override
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
