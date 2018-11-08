package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Druid extends Character {

    public Druid(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);

        wisST=true;
        intelST=true;

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("animalHandeling");
        validSkills.add("arcana");
        validSkills.add("insight");
        validSkills.add("medicine");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("religion");
        validSkills.add("survival");

        sa=setSpellcastingAbility(wis   );
        dc=setSpellSaveDC(wis);
        totalHealth=setHealth(totalHealth,level);

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Light armor");
        proficiency.add("Medium Armour");
        proficiency.add("Shields");
        proficiency.add("Simple weapons: Clubs, Daggers, Darts, Javelins, Maces, Quarterstaffs, Sickles, Slings, Spears");
        proficiency.add("Martial weapons: Scimitars");
        proficiency.add("herbalism kit");

        equipment.add("Choose one: A wooden shield or a simple weapon");
        equipment.add("Choose one: a Scimitar or any simple weapon");
        equipment.add("Leather armor");
        items.add("Explorer pack");
        items.add("Druid Focus");

        classAbilities.add("Spellcasting");
        classAbilities.add("Druidic");
        language.add("Druidic");

        cantripKnown=2;
        spellSlot1=2;

        if (level>=2){
            classAbilities.add("Wild Shape");
            classAbilities.add("Druid Circle");
            spellSlot1=3;
        }
        if (level>=3){
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.add("Wild Shape Improvement lvl 4");
            cantripKnown=3;
            spellSlot2=3;
        }
        if (level>=5){
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.add("Druid Circle Feature lvl 6");
            spellSlot3=3;
        }
        if (level>=7) {
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.add("Wild Shape Improvement lvl 8");
            spellSlot4=2;
        }
        if (level>=9){
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.add("Divine Circle Feature lvl 10");
            cantripKnown=4;
            spellSlot5=2;
        }
        if (level>=11) {
            spellSlot6=1;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            spellSlot7=1;
        }
        if (level>=14){
            classAbilities.add("Druid Circle Feature lvl 14");
        }
        if (level>=15){
            spellSlot8=1;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            spellSlot9=1;
        }
        if (level>=18){
            classAbilities.add("Timeless body");
            classAbilities.add("Beast Spells");
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.add("Archdruid");
            spellSlot7=2;
        }
    }

    public Druid() {

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
