package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Character implements CharacterInterface {

    private String alignment;
    private String playerName;
    private int experiencePoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String background;
    private String race;
    private String charName;
    private int lvl;
    private String classT;
    private boolean inspiration;
    private int pb;
    private int ac = 10;
    private int initiative;
    private String bg;
    private String sTrait;
    private List<String> language = new ArrayList<String>();
    private List<String> abilities = new ArrayList<String>();

    private static final Map<Integer, Integer> modMap = createModMap();
    private static Map<Integer, Integer> createModMap() {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, -5);
        myMap.put(2, -4);
        myMap.put(3,-4);
        myMap.put(4,-3);
        myMap.put(5,-3);
        myMap.put(6,-2);
        myMap.put(7,-2);
        myMap.put(8,-1);
        myMap.put(9,-1);
        myMap.put(10,0);
        myMap.put(11,0);
        myMap.put(12,1);
        myMap.put(13,1);
        myMap.put(14,2);
        myMap.put(15,2);
        myMap.put(16,3);
        myMap.put(17,3);
        myMap.put(18,4);
        myMap.put(19,4);
        myMap.put(20,5);
        myMap.put(21,5);
        myMap.put(22,6);
        myMap.put(23,6);
        myMap.put(24,7);
        myMap.put(25,7);
        myMap.put(26,8);
        myMap.put(27,8);
        myMap.put(28,9);
        myMap.put(29,9);
        myMap.put(30,10);
        return myMap;
    }
    
    private static final Map<Integer, Integer> pbMap = createPBMap();
    private static Map<Integer, Integer> createPBMap() {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1,2);
        myMap.put(2,2);
        myMap.put(3,2);
        myMap.put(4,2);
        myMap.put(5,3);
        myMap.put(6,3);
        myMap.put(7,3);
        myMap.put(8,3);
        myMap.put(9,4);
        myMap.put(10,4);
        myMap.put(11,4);
        myMap.put(12,4);
        myMap.put(13,5);
        myMap.put(14,5);
        myMap.put(15,5);
        myMap.put(16,5);
        myMap.put(17,6);
        myMap.put(18,6);
        myMap.put(19,6);
        myMap.put(20,6);
        return myMap;
    }

    public Character(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha){
        charName = cName;
        classT = classtype;
        lvl= level;
        race = r;
        background = bg;
        alignment = align;
        playerName =  pName;
        experiencePoints = exp;
        strength = str;
        dexterity = dex;
        constitution = con;
        intelligence = intel;
        wisdom = wis;
        charisma = cha;

    }

    public String getCharacterName() {
        return charName;
    }

    public void setCharacterName(String characterName) {
        charName=characterName;
    }

    public int getLevel() {
        return lvl;
    }

    public void setLevel(int totalLevel) {
        lvl=totalLevel;
    }

    public String getBackground() {
        return bg;
    }

    public void setBackground(String background) {
        bg=background;
    }

    public String getClassType() {
        return classT;
    }

    public void setClassType(String classType) {
        classT=classType;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRace() {

        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String align) {
        alignment=align;
    }

    public int getEXP() {
        return experiencePoints;
    }

    public void setEXP(int exp) {
        experiencePoints = exp;
    }

    public boolean getInspiration() {
        return inspiration;
    }

    public void setInspiration(boolean active) {
        inspiration = active;
    }

    public int getProficiencyBonus() {
        return pb;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        pb= pbMap.get(proficiencyBonus);
    }

    public int getAC() {
        return ac;
    }

    public void setAC(int armour) {
        ac=ac+getMod(dexterity)+armour;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int dex) {
        initiative=getMod(dex);
    }

    public String getSpecialTrait() {
        return sTrait;
    }

    public void setSpecialTrait(String background,int number) {
        switch (background.toLowerCase()){
            case "acolyte":
                break;
            case "charlatan":
            case "criminal":
            case "entertainer":
            case "folk hero":
        }
    }

    public void setRaceBonus(String race){
        switch(race){
            case "dwarf":
                setConstitution(getConstitution()+2);
                setSpeed(25);
                language.add("Common");
                language.add("Dwarvish");
                abilities.add("Dwarven Resilience");
                abilities.add("Dwarven Combat Training");
                abilities.add("Tool Proficiency");
                abilities.add("Stonecunning");
                break;
            case "elf":
                setDexterity(getDexterity()+2);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Keen Senses");
                abilities.add("Fey Ancestry");
                abilities.add("Trance");
                break;
            case "halfling":
                setDexterity(getDexterity()+2);
                setSpeed(25);
                abilities.add("Lucky");
                abilities.add("Brave");
                abilities.add("Halfling Nimbleness");
                language.add("Common");
                language.add("Halfling");
                break;
            case "human":
                setStrength(getStrength()+1);
                setDexterity(getDexterity()+1);
                setConstitution(getConstitution()+1);
                setIntelligence(getIntelligence()+1);
                setWisdom(getWisdom()+1);
                setCharisma(getCharisma()+1);
                setSpeed(30);
                language.add("Common");
                break;
            case "dragonborn":
                setStrength(getStrength()+2);
                setCharisma(getCharisma()+1);
                setSpeed(30);
                abilities.add("Draconic Ancestry");
                abilities.add("Breath Weapon");
                abilities.add("Damage Resistance");
                language.add("Common");
                language.add("Draconic");
                break;
            case "gnome":
                setIntelligence(getIntelligence()+2);
                setSpeed(25);
                abilities.add("Darkvision");
                abilities.add("Gnome Cunning");
                language.add("Common");
                language.add("Gnomish");
                break;
            case  "half-elf":
                setCharisma(getCharisma()+2);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Fey ancestry");
                abilities.add("Skill versatility");
                language.add("Common");
                language.add("Elvish");
                break;
            case "half-orc":
                setStrength(getStrength()+2);
                setConstitution(getConstitution()+1);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Menacing");
                abilities.add("Relentless endurance");
                abilities.add("Savage Attacks");
                language.add("Common");
                language.add("Orc");
                break;
            case "tiefling":
                setIntelligence(getIntelligence()+1);
                setCharisma(getCharisma()+2);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Hellish Resistance");
                abilities.add("Infernal Legacy");
                language.add("Common");
                language.add("Infernal");
                break;
        }
    }

    private int getDexterity() {
        return dexterity;
    }

    public Integer getMod(int stat){
        return modMap.get(stat);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}