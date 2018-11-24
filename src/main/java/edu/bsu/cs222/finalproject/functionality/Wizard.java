package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Wizard extends Character {

    public Wizard(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        intelST=true;
        wisST=true;

        spellAbility=setSpellcastingAbility(intel);
        dc=setSpellSaveDC(intel);
        totalHealth=setHealth(totalHealth,level);

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("arcana");
        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("investigation");
        validSkills.add("medicine");
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

        equipment.add("Choose one: A quarterstaff or dagger");
        equipment.add("Spellbook");
        items.add("Choose one: a component pouch or arcane focus");
        items.add("Choose one: a scholar's pack or explorer's pack");

        List<String> classAbilities = new ArrayList<>();
        classAbilities.add("Spellcasting");
        classAbilities.add("Arcane Recovery");

        cantripKnown=3;
        spellSlot1=2;

        if (level>=2){
            classAbilities.add("Arcane Tradition");
            spellSlot1=3;
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
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.add("Arcane Tradition Feature lvl 6");
            spellSlot3=3;
        }
        if (level>=7) { ;
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot4=2;
        }
        if (level>=9){
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.add("Arcane Tradition Feature lvl 10");
            cantripKnown=5;
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
            classAbilities.add("Arcane Tradition feature lvl 14");
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
            classAbilities.add("Spell mastery");
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.add("Signature Spell");
            spellSlot7=2;
        }
    }

    public Wizard() {

    }

    @Override
    public String getBackground() {
        return null;
    }

    @Override
    public void setBackground(String background) {

    }

    @Override
    public void setClassType(String classType) {

    }

    @Override
    public void setPlayerName(String playerName) {

    }

    @Override
    public void setRace(String race) {

    }

    @Override
    public void setAlignment(String alignment) {

    }

    @Override
    public int getProficiencyBonus() {
        return 0;
    }

    @Override
    public void setProficiencyBonus(int proficiencyBonus) {

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

    public int setHealth(int health, int level) {
        int i = 0;
        health=health+6+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D6()+modMap.get(this.constitution);
                i++;
            }
        }
        return health;
    }

    @Override
    public void setEquipment() {

    }

    @Override
    public int setSpellcastingAbility(int ability) {
        return 0;
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return 0;
    }
}
