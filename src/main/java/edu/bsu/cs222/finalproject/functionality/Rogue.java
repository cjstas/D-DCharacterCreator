package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Rogue extends Character {
    public Rogue(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(dexST);
        setSavingThrow(intelST);

        sa=setSpellcastingAbility(intel);
        dc=setSpellSaveDC(intel);
        totalHealth=setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
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

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Light Armour");
        proficiency.add("Simple Weapons");
        proficiency.add("Hand Crossbow");
        proficiency.add("Longsword");
        proficiency.add("Rapier");
        proficiency.add("Shortsword");
        proficiency.add("Thieve's Tools");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Expertise");
        classAbilities.add("Sneak Attack");
        language.add("Thieves' Cant");


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

    public Rogue() {

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
        health=health+8+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D8()+getMod(getConstitution());
                i++;
            }
        }
        return health;
    }

    @Override
    public void setSkills(boolean skill) {

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
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
