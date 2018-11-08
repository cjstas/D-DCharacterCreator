package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;


public class Monk extends Character {

    public Monk(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(strST);
        setSavingThrow(dexST);

        totalHealth=setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("acrobatics");
        validSkills.add("athletics");
        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("religion");
        validSkills.add("stealth");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Simple Weapons");
        proficiency.add("Shortswords");
        proficiency.add("Choose one type of artisan's tool or one musical instrument");

        equipment.add("Choose one: Shortsword or simple weapon.");
        equipment.add("10 darts");
        items.add("Choose one: Dungeoneer's pack or an Explorer's Pack");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Unarmored Defense");
        classAbilities.add("Martial Arts");


        if (level>=2){
            classAbilities.add("Ki");
            classAbilities.add("Unarmored Movement");
            int ki = level;
        }

        if (level>=3){
            classAbilities.add("Monastic Tradition");
            classAbilities.add("Deflect Missiles");
        }

        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.add("Slow Fall");
        }

        if (level>=5){
            classAbilities.add("Extra Attack");
            classAbilities.add("Stunning Strike");
        }

        if (level>=6){
            classAbilities.add("Ki-Empowered Strikes");
            classAbilities.add("Monastic Tradition: 6th level ability");
        }

        if (level>=7){
            classAbilities.add("Evasion");
            classAbilities.add("Stillness of Mind");
        }

        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=9){
            classAbilities.add("Unarmoured Movement improvement");
        }

        if (level>=10){
            classAbilities.add("Purity of Body");
        }

        if (level>=11){
            classAbilities.add("Monastic Tradition: 10th level ability");
        }

        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=13){
            classAbilities.add("Tongue of the Sun and Moon");
        }

        if (level>=14){
            classAbilities.add("Diamond Soul");
        }

        if (level>=15){
            classAbilities.add("Timeless Body");
        }

        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=17){
            classAbilities.add("Monastic Tradition: 17th level ability");
        }

        if (level>=18){
            classAbilities.add("Empty Body");
        }

        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }

        if (level>=20){
            classAbilities.add("Perfect Self");
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
