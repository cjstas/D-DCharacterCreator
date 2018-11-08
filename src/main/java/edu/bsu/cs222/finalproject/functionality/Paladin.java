package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Paladin extends Character {

    public Paladin(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(wisST);
        setSavingThrow(chaST);

        sa=setSpellcastingAbility(cha);
        dc=setSpellSaveDC(cha);
        totalHealth=setHealth(totalHealth,level);

        List<String> paladinSkills = new ArrayList<>();
        paladinSkills.add("athletics");
        paladinSkills.add("insight");
        paladinSkills.add("intimidation");
        paladinSkills.add("medicine");
        paladinSkills.add("persuasion");
        paladinSkills.add("religion");

        sa=setSpellcastingAbility(cha);
        dc=setSpellSaveDC(cha);

        Random randomize = new Random();
        String x = paladinSkills.get(randomize.nextInt(paladinSkills.size()));
        setSkills(parseBoolean(x));
        String y = paladinSkills.get(randomize.nextInt(paladinSkills.size()));
        while (x.equals(y)) {
            y = paladinSkills.get(randomize.nextInt(paladinSkills.size()));
        }
        setSkills(parseBoolean(y));

        List<String> proficiency = new ArrayList<>();
        proficiency.add("All Armour");
        proficiency.add("Shields");
        proficiency.add("Simple and Martial Weapons");

        equipment.add("Choose one: A martial weapon and shield or two martial weapons");
        equipment.add("Choose one: Five javelins or any simple melee weapon");
        equipment.add("Chain mail");
        items.add("A Priest's pack or an Explorer's pack");
        items.add("Holy symbol");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Divine sense");
        classAbilities.add("Lay on Hands");

        if (level>=2){
            classAbilities.add("Spellcasting");
            classAbilities.add("Fighting Style");
            classAbilities.add("Divine Smite");
            spellSlot1=2;
        }
        if (level>=3){
            classAbilities.add("Divine Health");
            classAbilities.add("Sacred Oath");
            spellSlot1=3;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=5){
            classAbilities.add("Extra attack");
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=6){
            classAbilities.add("Aura of Protection");
        }
        if (level>=7) {
            classAbilities.add("Sacred oath feature");
            spellSlot2=3;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=9){
            spellSlot3=2;
        }
        if (level>=10){
            classAbilities.add("Aura of Courage");
        }
        if (level>=11) {
            classAbilities.add("improved divine smite");
            spellSlot3=3;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            spellSlot4=1;
        }
        if (level>=14){
            classAbilities.add("Cleansing Touch");
        }
        if (level>=15){
            classAbilities.add("Sacred Oath Feature");
            spellSlot4=2;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=18){
            classAbilities.add("Aura Improvements");
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot5=2;
        }
        if (level>=20){
            classAbilities.add("Sacred Oath Feature");
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
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
