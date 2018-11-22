package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Barbarian extends Character {

    public Barbarian() {

    }

    public void Barbarian(){
    }

    public Barbarian(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        strST=true;
        conST=true;

        boolean spellcaster = false;
        setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("animalHandling");
        validSkills.add("athletics");
        validSkills.add("intimidation");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("survival");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Light Armour");
        proficiency.add("Medium Armour");
        proficiency.add("Shields");
        proficiency.add("Simple Weapons");
        proficiency.add("Martial Weapons");

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

    @Override
    public int getStats() {
        return 0;
    }

    @Override
    public void setStats(int str, int dex, int con, int intel, int wis, int cha) {
    }

    @Override
    public int setHealth) {
        int i = 0;
        this.health=health+12+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D12()+getMod(this.constitution);
                i++;
            }
        }
        return health;
    }

    @Override
    public void setEquipment() {
        equipment.add("Greataxe or Martial melee weapon");
        equipment.add("Two handaxes or any simple weapon");
        equipment.add("4 Javelins");
        items.add("Explorer's Pack");
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
    }
}