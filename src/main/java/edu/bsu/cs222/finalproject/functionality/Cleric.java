package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Random;

public class Cleric extends Character{

    public Cleric(String CharacterName, String classtype, int level, String race, String background, String alignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(CharacterName, classtype,level, race, background, alignment, playerName,experience,strength,dexterity,constitution, intelligence,wisdom, charisma);
        wisST=true;
        chaST=true;

        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("medicine");
        validSkills.add("persuasion");
        validSkills.add("religion");


        spellAttackBonus = returnSpellAttackBonus("Wisdom");
        spellSaveDC = returnSpellSaveDC("Wisdom");
        spellCastingModifier = returnSpellCastingModifier("Wisdom");
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
        proficiency.add("Simple weapons");

        equipment.add("Choose one: Mace or warhammer (if proficient in Martial weapons)");
        equipment.add("Choose one: Scale mail, Leather armour, or chain mail (if proficient in Heavy armour)");
        equipment.add("Choose one: a light crossbow and 20 bolts or any simple weapon");
        equipment.add("Shield");
        items.add("Choose one: A priest pack or an explorer pack");
        items.add("Holy symbol");

        classAbilities.add("Spellcasting");
        classAbilities.add("Divine domain");

        cantripKnown=3;
        spellSlot1=2;

        setLevelAbilities();

    }

    public Cleric() {
        wisST=true;
        chaST=true;

        validSkills.add("history");
        validSkills.add("insight");
        validSkills.add("medicine");
        validSkills.add("persuasion");
        validSkills.add("religion");

        proficiency.add("Light armor");
        proficiency.add("Medium Armour");
        proficiency.add("Shields");
        proficiency.add("Simple weapons");

        equipment.add("Choose one: Mace or warhammer (if proficient in Martial weapons)");
        equipment.add("Choose one: Scale mail, Leather armour, or chain mail (if proficient in Heavy armour)");
        equipment.add("Choose one: a light crossbow and 20 bolts or any simple weapon");
        equipment.add("Shield");
        items.add("Choose one: A priest pack or an explorer pack");
        items.add("Holy symbol");

        classAbilities.add("Spellcasting");
        classAbilities.add("Divine domain");

        cantripKnown=3;
        spellSlot1=2;

        setLevelAbilities();

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
            classAbilities.add("Channel Divinity (1/rest)");
            classAbilities.add("Divine domain feature lvl 2");
            spellSlot1=3;
            cantripKnown=3;
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
            classAbilities.add("Destroy Undead (CR 1/2)");
            spellSlot3=2;
        }
        if (level>=6){
            classAbilities.set(classAbilities.indexOf("Channel Divinity (1/rest)"), "Channel Divinity (2/rest)");
            classAbilities.add("Divine Domain Feature lvl 6");
            spellSlot3=3;
        }
        if (level>=7) {
            spellSlot4=1;
        }
        if (level>=8){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 1/2)"), "Destroy Undead (CR 1)");
            classAbilities.add("Divine Domain Feature lvl 8");
            spellSlot4=2;
        }
        if (level>=9){
            spellSlot4=3;
            spellSlot5=1;
        }
        if (level>=10){
            classAbilities.add("Divine Intervention");
            cantripKnown=5;
            spellSlot5=2;
        }
        if (level>=11) {
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 1)"), "Destroy Undead (CR 2");
            spellSlot6=1;
        }
        if (level>=12){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=13){
            spellSlot7=1;
        }
        if (level>=14){
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 2)"), "Destroy Undead (CR 3)");
        }
        if (level>=15){
            spellSlot8=1;
        }
        if (level>=16){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
        }
        if (level>=17){
            classAbilities.set(classAbilities.indexOf("Destroy Undead (CR 3)"), "Destroy Undead (CR 4)");
            classAbilities.add("Divine Domain Feature lvl 17");
            spellSlot9=1;
        }
        if (level>=18){
            classAbilities.set(classAbilities.indexOf("Channel Divinity (2/rest)"), "Channel Divinity (3/rest)");
            spellSlot5=3;
        }
        if (level>=19){
            classAbilities.add("Ability Score Improvement: +2 total points to your ability score and no score can go over 20");
            spellSlot6=2;
        }
        if (level>=20){
            classAbilities.set(classAbilities.indexOf("Divine Intervention"), "Improved Divine Intervention");
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

    public int returnSpellSaveDC() {
        return 8+this.proficiencyBonus+modMap.get(this.dc);
    }
}
