package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Druid extends Character {

    public Druid(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);

        wisST=true;
        intelST=true;


        validSkills.add("animalHandeling");
        validSkills.add("arcana");
        validSkills.add("insight");
        validSkills.add("medicine");
        validSkills.add("nature");
        validSkills.add("perception");
        validSkills.add("religion");
        validSkills.add("survival");

        int spellAttackBonus = returnSpellAttackBonus("Wisdom");
        int spellSaveDC = returnSpellSaveDC("Wisdom");
        int spellCastingModifier = returnSpellCastingModifier("Wisdom");
        health=setHealth();

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

        setLevelAbilities();

    }

    public Druid() {

    }

    public int setHealth() {
        int i = 0;
        health=health+8+modMap.get(this.constitution);
        if (level > 1){
            while  (i<= level){
                int healthAdd = DiceRoll.D8()+modMap.get(this.constitution);
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
