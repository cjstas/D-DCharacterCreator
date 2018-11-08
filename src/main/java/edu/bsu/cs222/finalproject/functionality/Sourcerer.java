package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Sourcerer extends Character {

    public Sourcerer(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(conST);
        setSavingThrow(chaST);

        sa=setSpellcastingAbility(cha);
        dc=setSpellSaveDC(cha);
        totalHealth=setHealth(totalHealth,level);

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

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Daggers");
        proficiency.add("Darts");
        proficiency.add("Slings");
        proficiency.add("Quarterstaffs");
        proficiency.add("Light crossbows");

        equipment.add("Choose one: a light crossbow and 20 bolts or any simple weapon");
        items.add("Choose one: a component pouch or an arcane focus");
        items.add("Choose one: a dungeoneer's pack or explorer;s pack");
        equipment.add("Two daggers");

        List<String> classAbilities = new ArrayList<>();
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
        health=health+6+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D6()+getMod(getConstitution());
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
    public int setSpellcastingAbility(int ability) {
        return getProficiencyBonus()+getMod(ability);
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return 8+getProficiencyBonus()+getMod(dc);
    }

    @Override
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
