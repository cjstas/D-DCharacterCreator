package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Barbarian extends Character {

    private List<String> equipment = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    public void Barbarian(){
    }

    public Barbarian(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(strST);
        setSavingThrow(conST);

        boolean spellcaster = false;

        List<String> barbSkills =  new ArrayList<>();
        barbSkills.add("animalHandling");
        barbSkills.add("athletics");
        barbSkills.add("intimidation");
        barbSkills.add("nature");
        barbSkills.add("perception");
        barbSkills.add("survival");

        Random randomize = new Random();
        String x = barbSkills.get(randomize.nextInt(barbSkills.size()));
        setSkills(parseBoolean(x));
        String z = barbSkills.get(randomize.nextInt(barbSkills.size()));
        while (x.equals(z)) {
            z = barbSkills.get(randomize.nextInt(barbSkills.size()));
        }
        setSkills(parseBoolean(z));

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
    @Override
    public void setHealth(int health,int level) {
        int i = 0;
        health=health+12+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D12()+getMod(getConstitution());
                i++;
            }
        }
    }


    public boolean getSavingThrow(boolean skill) {
        return skill;
    }


    public void setSavingThrow(boolean skill) {
        skill=true;
    }

    @Override
    public void setSkills(boolean skill) {
    }

    @Override
    public boolean getSkills(boolean skill) {
        return skill;
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
        equipment.add("Greataxe or Martial melee weapon");
        equipment.add("Two handaxes or any simple weapon");
        equipment.add("4 Javelins");
        items.add("Explorer's Pack");
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
        return Integer.parseInt(null);
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return Integer.parseInt(null);
    }

    @Override
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}