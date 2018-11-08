package edu.bsu.cs222.finalproject.functionality;

import java.util.*;

@SuppressWarnings({"WeakerAccess", "CanBeFinal"})
public abstract class Character implements CharacterInterface {


    public String alignment;
    public String playerName;
    public int experiencePoints;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public String background;
    public String race;
    public String charName;
    public int lvl;
    public String classT;
    public boolean inspiration;
    public int pb;
    public int ac = 10;
    public int initiative;
    public int totalHealth;
    public String bg;
    public String sTrait;
    public int sa;
    public int dc;
    public int subrace;

    public List<String> language = new ArrayList<>();
    public List<String> abilities = new ArrayList<>();
    public List<String> spellsFromRace = new ArrayList<>();
    public List<String> equipment = new ArrayList<>();
    public List<String> items = new ArrayList<>();

    public boolean strST;
    public boolean dexST;
    public boolean conST;
    public boolean intelST;
    public boolean wisST;
    public boolean chaST;

    public List<String> knownSkills = new ArrayList<>();

    public int cantripKnown=0;
    public int spellsKnown=0;
    public int spellSlot1=0;
    public int spellSlot2=0;
    public int spellSlot3=0;
    public int spellSlot4=0;
    public int spellSlot5=0;
    public int spellSlot6=0;
    public int spellSlot7=0;
    public int spellSlot8=0;
    public int spellSlot9=0;

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

    public Character(){

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
        setRaceBonus();
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

    public int setHealth(int health, int level) {
        return 0;
    }

    public boolean getSavingThrow(boolean skill) {
        return skill;
    }

    public void setSavingThrow(boolean skill){
        skill=true;
    }

    @Override
    public boolean getSkills(boolean skill) {
        return skill;
    }

    @Override
    public int setSpellcastingAbility(int ability) {
        return getProficiencyBonus()+getMod(ability);
    }

    @Override
    public int setSpellSaveDC(int dc) {
        return 8+getProficiencyBonus()+getMod(dc);
    }

    public void setRaceBonus(){
        setSubrace();
        switch(this.race){
            case "Dwarf":
                setConstitution(getConstitution()+2);
                setSpeed(25);
                language.add("Common");
                language.add("Dwarvish");
                abilities.add("Dwarven Resilience");
                abilities.add("Dwarven Combat Training");
                abilities.add("Tool Proficiency");
                abilities.add("Stonecunning");
                if (subrace == 0){
                    setRace("Hill Dwarf");
                    setWisdom(getWisdom()+1);
                    abilities.add("Dwarven Toughness");
                } if (subrace == 1){
                    setRace("Mountain Dwarf");
                    setStrength(getStrength()+2);
                    abilities.add("Dwarven Armour Training");
                }
                break;
            case "Elf":
                setDexterity(getDexterity()+2);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Keen Senses");
                abilities.add("Fey Ancestry");
                abilities.add("Trance");
                if (subrace==0){
                    setIntelligence(getIntelligence()+1);
                    abilities.add("Elf Weapon Training");
                    setRace("High Elf");
                }
                if (subrace==1){
                    setRace("Wood Elf");
                    setWisdom(getWisdom()+1);
                    abilities.add("Elf Weapon Proficiency");
                    abilities.add("Fleet of Foot");
                    setSpeed(35);
                    abilities.add("Mask of the Wild");
                } if(subrace==2){
                    setRace("Drow Elf");
                    setCharisma(getCharisma()+1);
                    abilities.add("Superior Darkvision");
                    abilities.add("Sunlight Sensitivity");
                    abilities.add("Drow Magic");
                    abilities.add("Drow Weapon Training");
                }
                break;
            case "Halfling":
                setDexterity(getDexterity()+2);
                setSpeed(25);
                abilities.add("Lucky");
                abilities.add("Brave");
                abilities.add("Halfling Nimbleness");
                language.add("Common");
                language.add("Halfling");
                if (subrace==0){
                    setRace("Lightfoot Halfling");
                    setCharisma(getCharisma()+1);
                    abilities.add("Naturally Stealthy");
                }
                if (subrace==1){
                    setRace("Stout Halfling");
                    setConstitution(getConstitution()+1);
                    abilities.add("Stout Resilience");
                }
                break;
            case "Human":
                setStrength(getStrength()+1);
                setDexterity(getDexterity()+1);
                setConstitution(getConstitution()+1);
                setIntelligence(getIntelligence()+1);
                setWisdom(getWisdom()+1);
                setCharisma(getCharisma()+1);
                setSpeed(30);
                language.add("Common");
                break;
            case "Dragonborn":
                setStrength(getStrength()+2);
                setCharisma(getCharisma()+1);
                setSpeed(30);
                abilities.add("Draconic Ancestry");
                abilities.add("Breath Weapon");
                abilities.add("Damage Resistance");
                language.add("Common");
                language.add("Draconic");
                break;
            case "Gnome":
                setIntelligence(getIntelligence()+2);
                setSpeed(25);
                abilities.add("Darkvision");
                abilities.add("Gnome Cunning");
                language.add("Common");
                language.add("Gnomish");
                if (subrace==0){
                    setRace("Forest Gnome");
                    setDexterity(getDexterity()+1);
                    abilities.add("Natural Illusionist");
                    abilities.add("Speak with Small Beasts");
                }
                if (subrace==1){
                    setRace("Rock Gnome");
                    setConstitution(getConstitution()+1);
                    abilities.add("Artificer's Lore");
                    abilities.add("Tinker");
                }
                break;
            case "Half-elf":
                setCharisma(getCharisma()+2);
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Fey ancestry");
                abilities.add("Skill versatility");
                language.add("Common");
                language.add("Elvish");
                break;
            case "Half-orc":
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
            case "Tiefling":
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

    private void setSubrace(){
        switch(this.race){
            case "Mountain Dwarf":
                subrace = 0;
                this.race = "Dwarf";
                break;
            case "Hill Dwarf":
                subrace = 1;
                this.race = "Dwarf";
                break;
            case "High Elf":
                subrace = 0;
                this.race = "Elf";
                break;
            case "Wood Elf":
                subrace = 1;
                this.race = "Elf";
                break;
            case "Dark Elf/ Drow":
                subrace = 2;
                this.race = "Elf";
                break;
            case "Stout Halfling":
                subrace = 0;
                this.race = "Halfling";
                break;
            case "Lightfoot Halfling":
                subrace = 1;
                this.race = "Halfing";
                break;
            case "Human":
                subrace = 0;
                this.race = "Human";
                break;
            case "Dragonborn":
                subrace = 0;
                this.race = "Dragonborn";
                break;
            case "Rock Gnome":
                subrace = 0;
                this.race = "Gnome";
                break;
            case "Forest Gnome":
                subrace = 1;
                this.race = "Gnome";
                break;
            case "Half-Elf":
                subrace = 0;
                this.race = "Half-Elf";
                break;
            case "Half-Orc":
                subrace = 0;
                this.race = "Half-Orc";
                break;
            case "Tiefling":
                subrace = 0;
                this.race = "Tiefling";
                break;
            case "Homebrew":
                subrace = 0;
                this.race = "Custom";
                break;
        }
    }

    public int getDexterity() {
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

    public int getHealth(int health) {
        return health;
    }
}