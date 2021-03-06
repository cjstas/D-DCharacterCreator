package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Ranger extends Character {

    public Ranger(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        dexST=true;
        strST=true;

        spellAttackBonus = returnSpellAttackBonus("Wisdom");
        spellSaveDC = returnSpellSaveDC("Wisdom");
        spellCastingModifier = returnSpellCastingModifier("Wisdom");
        health=setHealth();

        validSkills.add("animalHandeling");
        validSkills.add("athletics");
        validSkills.add("insight");
        validSkills.add("investigation");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("stealth");
        validSkills.add("survival");

        Random randomize = new Random();
        for (int i = 0; i < 3 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("Light armor");
        proficiency.add("Medium armor");
        proficiency.add("Shields");
        proficiency.add("Simple weapons");
        proficiency.add("Martial weapons");

        equipment.add("Choose one: Scale mail or Leather Armor");
        equipment.add("Choose one: two shortswords or two simple weapons");
        equipment.add("A longbow");
        equipment.add("20 arrows");
        items.add("Choose one: a dungeoneer's pack or an explorer's pack");

        classAbilities.add("Favored Enemy");
        classAbilities.add("Natural Explorer");

        setLevelAbilities();
    }

    public Ranger() {
        dexST=true;
        strST=true;

        validSkills.add("animalHandeling");
        validSkills.add("athletics");
        validSkills.add("insight");
        validSkills.add("investigation");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("stealth");
        validSkills.add("survival");

        proficiency.add("Light armor");
        proficiency.add("Medium armor");
        proficiency.add("Shields");
        proficiency.add("Simple weapons");
        proficiency.add("Martial weapons");

        equipment.add("Choose one: Scale mail or Leather Armor");
        equipment.add("Choose one: two shortswords or two simple weapons");
        equipment.add("A longbow");
        equipment.add("20 arrows");
        items.add("Choose one: a dungeoneer's pack or an explorer's pack");

        classAbilities.add("Favored Enemy");
        classAbilities.add("Natural Explorer");

        setLevelAbilities();

    }

    @SuppressWarnings("Duplicates")
    public int setHealth() {
        int i = 0;
        health=health+10+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                int healthAdd = DiceRoll.D10()+modMap.get(this.constitution);
                if (healthAdd <0){
                    healthAdd = 0;
                }
                health=health+healthAdd;
                i++;
            }
        }
        return health;
    }

    @Override
    public void setLevelAbilities() {
        if (level>=2){
            classAbilities.add("Fighting Style");
            classAbilities.add("Spellcasting");
            spellsKnown=2;
            spellSlot1=2;
        }
        if (level>=3){
            classAbilities.add("Ranger Archetype");
            classAbilities.add("Primeval Awareness");
            spellsKnown=3;
            spellSlot1=3;
        }
        if (level>=4){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=5){
            classAbilities.add("Extra Attack");
            spellsKnown=4;
            spellSlot1=4;
            spellSlot2=2;
        }
        if (level>=6){
            classAbilities.add("Favored Enemy improvement");
            classAbilities.add("Natural Explorer improvement");

        }
        if (level>=7) {
            classAbilities.add("Ranger Archetype feature");
            spellsKnown=5;
            spellSlot2=3;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.add("Land's Stride");
        }
        if (level>=9){
            spellsKnown=6;
            spellSlot3=2;
        }
        if (level>=10){
            classAbilities.add("Natural Explorer improvement");
            classAbilities.add("Hide in Plain Sight");
        }
        if (level>=11) {
            classAbilities.add("Ranger Archetype feature");
            spellsKnown=7;
            spellSlot3=3;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            classAbilities.set(classAbilities.indexOf("Song of Rest (D8)"), "Song of Rest (D10)");
            spellsKnown=8;
            spellSlot4=1;
        }
        if (level>=14){
            classAbilities.add("Favored Enemy improvement");
            classAbilities.add("Vanish");
        }
        if (level>=15){
            classAbilities.add("Ranger Archetype Feature");
            spellsKnown=9;
            spellSlot4=2;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            spellsKnown=10;
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=18){
            classAbilities.add("Feral Senses");
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellsKnown=11;
            spellSlot5=2;
        }
        if (level>=20){
            classAbilities.add("Foe Slayer");
        }
    }

    @Override
    public ArrayList<String> getSkills() {
        for (int i = 0; i < 2; i++) {
            String skill = validSkills.get(new Random().nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }
        return (ArrayList<String>) knownSkills;
    }

    @Override
    public boolean[] setSavingThrows() {
        return new boolean[]{strST, dexST, conST, intelST, wisST, chaST};
    }

    public int returnSpellcastingAbility(int ability) {
        return this.proficiencyBonus+modMap.get(ability);
    }

    public int returnSpellSaveDC(int dc) {
        return 8+this.proficiencyBonus+modMap.get(dc);
    }

}
