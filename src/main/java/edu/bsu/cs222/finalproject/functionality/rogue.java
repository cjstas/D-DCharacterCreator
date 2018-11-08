package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class rogue extends Character {
    public rogue(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(dexST);
        setSavingThrow(intelST);

        totalHealth=setHealth(totalHealth,level);

        List<String> rogueSkills = new ArrayList<>();
        rogueSkills.add("acrobatics");
        rogueSkills.add("athletics");
        rogueSkills.add("deception");
        rogueSkills.add("insight");
        rogueSkills.add("intimidation");
        rogueSkills.add("investigation");
        rogueSkills.add("perception");
        rogueSkills.add("performance");
        rogueSkills.add("persuasion");
        rogueSkills.add("sleightofHand");
        rogueSkills.add("stealth");

        Random randomize = new Random();
        String x = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        setSkills(parseBoolean(x));
        String y = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        while (x.equals(y)) {
            y = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        }
        setSkills(parseBoolean(y));
        String z = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        while (x.equals(z) || y.equals(z)){
            z = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        }
        setSkills(parseBoolean(z));
        String zz = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        while (z.equals(zz) || y.equals(zz) || x.equals(zz)){
            zz = rogueSkills.get(randomize.nextInt(rogueSkills.size()));
        }

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Light Armour");
        proficiency.add("Medium Armour");
        proficiency.add("Shields");
        proficiency.add("Simple Weapons");
        proficiency.add("Martial Weapons");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Rage");
        classAbilities.add("Unarmored Defense");

        if (level>=2){
            classAbilities.add("Reckless Attack");
            classAbilities.add("Danger Sense");
        }

        if (level>=3){
            classAbilities.add("Primal Path: Berserker or Totem Warrior");
            classAbilities.add("Insert lvl 3 path ability");
        }

        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=5){
            classAbilities.add("Extra Attack");
            classAbilities.add("Fast Movement");
        }

        if (level>=6){
            classAbilities.add("Primal path: 6th level ability");
        }

        if (level>=7){
            classAbilities.add("Feral Instinct");
        }

        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=9){
            classAbilities.add("Brutal Critical");
        }

        if (level>=10){
            classAbilities.add("Primal path: 10th level ability");
        }

        if (level>=11){
            classAbilities.add("Relentless Rage");
        }

        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=13){
            classAbilities.add("2 dice on Brutal Critical");
        }

        if (level>=14){
            classAbilities.add("Primal Path: 14th level ability");
        }

        if (level>=15){
            classAbilities.add("Persistent Rage");
        }

        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=17){
            classAbilities.add("3 dice on Brutal Critical");
        }

        if (level>=18){
            classAbilities.add("Indomitable Might");
        }

        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=20){
            classAbilities.add("Primal Champion");
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
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
