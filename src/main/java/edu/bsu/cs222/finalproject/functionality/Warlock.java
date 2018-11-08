package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;


public class Warlock extends Character {

    public Warlock(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        wisST=true;
        chaST=true;

        sa=setSpellcastingAbility(cha);
        dc=setSpellSaveDC(cha);
        totalHealth=setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("arcana");
        validSkills.add("deception");
        validSkills.add("history");
        validSkills.add("intimidation");
        validSkills.add("investigation");
        validSkills.add("nature");
        validSkills.add("religion");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }


        proficiency.add("Light Armor");
        proficiency.add("Simple Weapons");

        equipment.add("Choose one: A light crossbow and 20 bolts or any simple weapon");
        equipment.add("Leather armor");
        equipment.add("any simple weapon");
        equipment.add("two daggers");
        items.add("a scholar's pack or a dungeoneer's pack");
        items.add("a component pouch or an arcane focus");

        classAbilities.add("Otherworldly Patron");
        classAbilities.add("Pact Magic");

        cantripKnown=2;
        spellsKnown=2;
        int spellSlots=1;
        int spellSlotLvl=1;

        if (level>=2){
            classAbilities.add("Eldritch Invocation 1");
            classAbilities.add("Invocation 2");
            spellsKnown=3;
            spellSlots=2;
        }

        if (level>=3){
            classAbilities.add("Pact Boon");
            spellsKnown=4;
            spellSlotLvl=2;
        }

        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown=3;
            spellsKnown=5;
        }

        if (level>=5){
            classAbilities.add("Invocation 3");
            spellsKnown=6;
            spellSlotLvl=3;
        }

        if (level>=6){
            classAbilities.add("Otherworldly Patron: 6th level ability");
            spellsKnown=7;
        }

        if (level>=7){
            spellsKnown=8;
            spellSlotLvl=4;
            classAbilities.add("Invocation 4");
        }

        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=9;
        }

        if (level>=9){
            classAbilities.add("Invocation 5");
            spellsKnown=10;
            spellSlotLvl=5;
        }

        if (level>=10){
            classAbilities.add("Otherworldly Patron: 10th level ability");
            cantripKnown=4;
        }

        if (level>=11){
            classAbilities.add("Mystic Arcanum (6th level)");
            spellsKnown=11;
            spellSlots=3;
        }

        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.add("Invocation 6");
        }

        if (level>=13){
            classAbilities.add("Mystic Arcanum (7th level)");
            spellsKnown=12;
        }

        if (level>=14){
            classAbilities.add("Otherworldly Patron: 14th level ability");
        }

        if (level>=15){
            classAbilities.add("Mystic Arcanum (8th level)");
            classAbilities.add("Invocation 7");
            spellsKnown=13;
        }

        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=17){
            classAbilities.add("Mystic Arcanum (9th level)");
            spellsKnown=14;
            spellSlots=4;
        }

        if (level>=18){
            classAbilities.add("Invocation 8");
        }

        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=15;
        }

        if (level>=20){
            classAbilities.add("Eldritch Master");
        }
    }

    public Warlock() {

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
