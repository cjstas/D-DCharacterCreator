package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Bard extends Character{

    public Bard(){

    }

    public Bard(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(dexST);
        setSavingThrow(chaST);

        sa=setSpellcastingAbility(cha);
        dc=setSpellSaveDC(cha);
        totalHealth=setHealth(totalHealth,level);

        List<String> bardSkills = new ArrayList<>();
        bardSkills.add("acrobatics");
        bardSkills.add("animalHandeling");
        bardSkills.add("arcana");
        bardSkills.add("athletics");
        bardSkills.add("deception");
        bardSkills.add("history");
        bardSkills.add("insight");
        bardSkills.add("intimidation");
        bardSkills.add("investigation");
        bardSkills.add("medicine");
        bardSkills.add("nature");
        bardSkills.add("perception");
        bardSkills.add("performance");
        bardSkills.add("persuasion");
        bardSkills.add("religion");
        bardSkills.add("sleightofHand");
        bardSkills.add("stealth");
        bardSkills.add("survival");

        Random randomize = new Random();
        String x = bardSkills.get(randomize.nextInt(bardSkills.size()));
        setSkills(parseBoolean(x));
        String y = bardSkills.get(randomize.nextInt(bardSkills.size()));
        while (x.equals(y)) {
            y = bardSkills.get(randomize.nextInt(bardSkills.size()));
        }
        setSkills(parseBoolean(y));
        String z = bardSkills.get(randomize.nextInt(bardSkills.size()));
        while (x.equals(z) || y.equals(z)){
            z = bardSkills.get(randomize.nextInt(bardSkills.size()));
        }
        setSkills(parseBoolean(z));

        List<String> proficiency = new ArrayList<>();
        proficiency.add("Light armor");
        proficiency.add("Simple weapons");
        proficiency.add("Hand crossbows");

        equipment.add("Choose one: Rapier, Longsword, Any simple weapon");
        equipment.add("Choose one: Diplomat's pack or Entertainer's pack");
        equipment.add("Choose one: A Lute or any other musical instrument");
        equipment.add("Leather Armour");
        equipment.add("Dagger");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Spellcasting");
        classAbilities.add("Bardic Inspiration (D6)");

        cantripKnown=2;
        spellsKnown=4;
        spellSlot1=2;

        if (level>=2){
            classAbilities.add("Jack of all Trades");
            classAbilities.add("Song of Rest (D6)");
            spellsKnown=5;
            spellSlot1=3;
        }
        if (level>=3){
            classAbilities.add("Bard College: choose one");
            classAbilities.add("Expertise");
            spellsKnown=6;
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            cantripKnown=3;
            spellsKnown=7;
            spellSlot2=3;
        }
        if (level>=5){
            classAbilities.add("Bardic Inspiration (D8)");
            classAbilities.add("Font of Inspiration");
            spellsKnown=8;
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.add("Countercharm");
            classAbilities.add("Bard College Feature lvl 6");
            spellsKnown=9;
            spellSlot3=3;
        }
        if (level>=7) {
            spellsKnown=10;
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=11;
            spellSlot4=2;
        }
        if (level>=9){
            classAbilities.set(classAbilities.indexOf("Song of Rest (D6)"), "Song of Rest (D8)");
            spellsKnown=12;
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.set(classAbilities.indexOf("Bardic Inspiration (D6)"), "Bardic Inspiration (D10)");
            classAbilities.add("Expertise");
            classAbilities.add("Magical Secrets");
            cantripKnown=4;
            spellsKnown=14;
            spellSlot5=2;
        }
        if (level>=11) {
            spellsKnown=15;
            spellSlot6=1;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            classAbilities.set(classAbilities.indexOf("Song of Rest (D8)"), "Song of Rest (D10)");
            spellsKnown=16;
            spellSlot7=1;
        }
        if (level>=14){
            classAbilities.add("Magical Secrets");
            classAbilities.add("Bard College feature lvl 14");
            spellsKnown=18;
        }
        if (level>=15){
            classAbilities.set(classAbilities.indexOf("Bardic Inspiration (D8)"), "Bardic Inspiration (D12)");
            spellsKnown=19;
            spellSlot8=1;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            classAbilities.set(classAbilities.indexOf("Song of Rest (D10)"), "Song of Rest (D12)");
            spellsKnown=20;
            spellSlot9=1;
        }
        if (level>=18){
            classAbilities.add("Magical Secrets");
            spellsKnown=22;
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.add("Superior Inspiration");
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
