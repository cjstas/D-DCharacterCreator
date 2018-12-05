package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Paladin extends Character {

    public Paladin(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        wisST=true;
        chaST=true;
        health=setHealth();

        ArrayList<String> validSkills= new ArrayList<>();
        validSkills.add("athletics");
        validSkills.add("insight");
        validSkills.add("intimidation");
        validSkills.add("medicine");
        validSkills.add("persuasion");
        validSkills.add("religion");

        int spellAttackBonus = returnSpellAttackBonus("Charisma");
        int spellSaveDC = returnSpellSaveDC("Charisma");
        int spellCastingModifier = returnSpellCastingModifier("Charisma");

        Random randomize = new Random();
        for (int i = 0; i < 2 ; i++) {
            String skill = validSkills.get(randomize.nextInt(validSkills.size()));
            validSkills.remove(skill);
            knownSkills.add(skill);
        }

        proficiency.add("All Armour");
        proficiency.add("Shields");
        proficiency.add("Simple and Martial Weapons");

        equipment.add("Choose one: A martial weapon and shield or two martial weapons");
        equipment.add("Choose one: Five javelins or any simple melee weapon");
        equipment.add("Chain mail");
        items.add("A Priest's pack or an Explorer's pack");
        items.add("Holy symbol");

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

    public Paladin() {
    }
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
}
