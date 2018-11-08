package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Cleric extends Character{

    public Cleric(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(wisST);
        setSavingThrow(chaST);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("medicine");
        validSkills.add("persuasion");
        validSkills.add("religion");

        sa=setSpellcastingAbility(wis);
        dc=setSpellSaveDC(wis);
        totalHealth=setHealth(totalHealth,level);


        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Light armor");
        proficiency.add("Medium Armour");
        proficiency.add("Shields");
        proficiency.add("Simple weapons");

        equipment.add("Choose one: Mace or warhammer (if proficient in Martial weapons)");
        equipment.add("Choose one: Scale mail, Leather armour, or chain mail (if proficient in Heavy armour)");
        equipment.add("Choose one: a light crossbow and 20 bolts or any simple weapon");
        equipment.add("Shield");
        items.add("Choose one: A priest pack or an explorer pack");
        items.add("Holy symbol");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Spellcasting");
        classAbilities.add("Divine domain");

        cantripKnown=3;
        spellSlot1=2;

        if (level>=2){
            classAbilities.add("Channel Divinity (1/rest)");
            classAbilities.add("Divine domain feature lvl 2");
            spellSlot1=3;
            cantripKnown=3;
        }
        if (level>=3){
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown=4;
            spellSlot2=3;
        }
        if (level>=5){
            classAbilities.add("Destroy Undead (CR 1/2)");
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.set(classAbilities.indexOf("Channel Divinity (1/rest)"), "Channel Divinity (2/rest)");
            classAbilities.add("Divine Domain Feature lvl 6");
            spellSlot3=3;
        }
        if (level>=7) {
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 1/2)"), "Destroy Undead (CR 1)");
            classAbilities.add("Divine Domain Feature lvl 8");
            spellSlot4=2;
        }
        if (level>=9){
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.add("Divine Intervention");
            cantripKnown=5;
            spellSlot5=2;
        }
        if (level>=11) {
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 1)"), "Destroy Undead (CR 2");
            spellSlot6=1;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            spellSlot7=1;
        }
        if (level>=14){
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 2)"), "Destroy Undead (CR 3)");
        }
        if (level>=15){
            spellSlot8=1;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 3)"), "Destroy Undead (CR 4)");
            classAbilities.add("Divine Domain Feature lvl 17");
            spellSlot9=1;
        }
        if (level>=18){
            classAbilities.set(classAbilities.indexOf("Channel Divinity (2/rest)"), "Channel Divinity (3/rest)");
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.set(classAbilities.indexOf("Divine Intervention"), "Improved Divine Intervention");
            spellSlot7=2;
        }
    }

    public Cleric() {

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
