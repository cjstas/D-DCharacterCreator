package edu.bsu.cs222.finalproject.functionality;
import java.util.*;

@SuppressWarnings({"WeakerAccess", "CanBeFinal"})
public abstract class Character implements CharacterInterface {

    String CharacterName, classtype, race, background, alignment, playerName;
    int level, experience, strength, dexterity, constitution, intelligence, wisdom, charisma;
    int speed, health, experiencePoints, proficiencyBonus, initiative, totalHealth, spellAbility, dc;
    int subrace;

    public boolean inspiration;
    public int ac = 10;

    public String bg, sTrait, personalityTrait, bond, ideal, flaw;

    public List<String> language = new ArrayList<>();
    public List<String> abilities = new ArrayList<>();
    public List<String> spellsFromRace = new ArrayList<>();
    public List<String> equipment = new ArrayList<>();
    public List<String> items = new ArrayList<>();
    public List<String> classAbilities = new ArrayList<>();
    public List<String> proficiency = new ArrayList<>();


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

    static final Map<Integer, Integer> modMap = createModMap();
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
        this.CharacterName = CharacterName;
        this.classtype = classtype;
        this.level = level;
        this.race = race;
        this.background = background;
        this.alignment = alignment;
        this.playerName=playerName;
        this.experience = experience;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void setBackgroundTrait(String background) {
        switch (background.toLowerCase()){
            case "acolyte":
                personalityTrait = Background.acolytePTMap.get(DiceRoll.D8());
                ideal =  Background.acolyteIdealMap.get(DiceRoll.D6());
                bond = Background.acolyteBondMap.get(DiceRoll.D6());
                flaw = Background.acolyteFlawMap.get(DiceRoll.D6());
                break;
            case "charlatan":
                sTrait =  Background.charlatanMap.get(DiceRoll.D6());
                personalityTrait = Background.charlatanPTMap.get(DiceRoll.D8());
                ideal = Background.charlatanIdealMap.get(DiceRoll.D6());
                bond = Background.charlatanBondMap.get(DiceRoll.D6());
                flaw = Background.charlatanFlawMap.get(DiceRoll.D6());
                break;
            case "criminal":
                sTrait = Background.criminalMap.get(DiceRoll.D8());
                personalityTrait = Background.criminalPTlMap.get(DiceRoll.D8());
                ideal = Background.criminalIdealMap.get(DiceRoll.D6());
                bond = Background.criminalBondMap.get(DiceRoll.D6());
                flaw = Background.criminalFlawMap.get(DiceRoll.D6());
                break;
            case "entertainer":
                sTrait = Background.entertainerMap.get(DiceRoll.D10());
                personalityTrait = Background.entertainerPTMap.get(DiceRoll.D8());
                ideal = Background.entertainerIdealMap.get(DiceRoll.D6());
                bond = Background.entertainerBondMap.get(DiceRoll.D6());
                flaw = Background.entertainerFlawMap.get(DiceRoll.D6());
                break;
            case "folk hero":
                sTrait = Background.folkHeroMap.get(DiceRoll.D10());
                personalityTrait = Background.folkHeroPTMap.get(DiceRoll.D8());
                ideal = Background.folkHeroIdealMap.get(DiceRoll.D6());
                bond = Background.folkHeroBondMap.get(DiceRoll.D6());
                flaw = Background.folkHeroFlawMap.get(DiceRoll.D6());
                break;
            case "guild artisan":
                sTrait = Background.guildArtisanMap.get(DiceRoll.D20());
                personalityTrait = Background.guildArtisanPTMap.get(DiceRoll.D8());
                ideal = Background.guildArtisanIdealMap.get(DiceRoll.D6());
                bond = Background.guildArtisanBondMap.get(DiceRoll.D6());
                flaw = Background.guildArtisanFlawMap.get(DiceRoll.D6());
                break;
            case "hermit":
                sTrait = Background.hermitMap.get(DiceRoll.D8());
                personalityTrait = Background.hermitPTMap.get(DiceRoll.D8());
                ideal = Background.hermitIdealMap.get(DiceRoll.D6());
                bond = Background.hermitBondMap.get(DiceRoll.D6());
                flaw = Background.hermitFlawMap.get(DiceRoll.D6());
                break;
            case "noble":
                personalityTrait = Background.noblePTMap.get(DiceRoll.D8());
                ideal = Background.nobleIdealMap.get(DiceRoll.D6());
                bond = Background.nobleBondMap.get(DiceRoll.D6());
                flaw = Background.nobleFlawMap.get(DiceRoll.D6());
                break;
            case "outlander":
                sTrait = Background.outlanderMap.get(DiceRoll.D10());
                personalityTrait = Background.outlanderPTMap.get(DiceRoll.D8());
                ideal = Background.outlanderIdealMap.get(DiceRoll.D6());
                bond = Background.outlanderBondMap.get(DiceRoll.D6());
                flaw = Background.outlanderFlawMap.get(DiceRoll.D6());
                break;
            case "sage":
                sTrait = Background.sageMap.get(DiceRoll.D8());
                personalityTrait = Background.sagePTMap.get(DiceRoll.D8());
                ideal = Background.sageIdealMap.get(DiceRoll.D6());
                bond = Background.sageBondMap.get(DiceRoll.D6());
                flaw = Background.sageFlawMap.get(DiceRoll.D6());
                break;
            case "sailor":
                personalityTrait = Background.sailorPTMap.get(DiceRoll.D8());
                ideal = Background.sailorIdealMap.get(DiceRoll.D6());
                bond = Background.sailorBondMap.get(DiceRoll.D6());
                flaw = Background.sailorFlawMap.get(DiceRoll.D6());
                break;
            case "soldier":
                sTrait = Background.soldierMap.get(DiceRoll.D8());
                personalityTrait = Background.soldierPTMap.get(DiceRoll.D8());
                ideal = Background.soldierIdealMap.get(DiceRoll.D6());
                bond = Background.soldierBondMap.get(DiceRoll.D6());
                flaw = Background.soldierFlawMap.get(DiceRoll.D6());
                break;
            case "urchin":
                personalityTrait = Background.urchinPTMap.get(DiceRoll.D8());
                ideal = Background.urchinIdealMap.get(DiceRoll.D6());
                bond = Background.urchinBondMap.get(DiceRoll.D6());
                flaw = Background.urchinFlawMap.get(DiceRoll.D6());
                break;
        }
    }

    public void setRaceBonus(int subrace){
        switch(this.race){
            case "Dwarf":
                this.constitution= this.constitution+2;
                setSpeed(25);
                language.add("Common");
                language.add("Dwarvish");
                abilities.add("Dwarven Resilience");
                abilities.add("Dwarven Combat Training");
                abilities.add("Tool Proficiency");
                abilities.add("Stonecunning");
                if (subrace == 0){
                    setRace("Hill Dwarf");
                    this.wisdom=this.wisdom+1;
                    abilities.add("Dwarven Toughness");
                } if (subrace == 1){
                    setRace("Mountain Dwarf");
                    this.strength=this.strength+2;
                    abilities.add("Dwarven Armour Training");
                }
                break;
            case "Elf":
                this.dexterity=this.dexterity+2;
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Keen Senses");
                abilities.add("Fey Ancestry");
                abilities.add("Trance");
                if (subrace==0){
                    this.intelligence=this.intelligence+1;
                    abilities.add("Elf Weapon Training");
                    setRace("High Elf");
                }
                if (subrace==1){
                    setRace("Wood Elf");
                    this.wisdom=this.wisdom+1;
                    abilities.add("Elf Weapon Proficiency");
                    abilities.add("Fleet of Foot");
                    setSpeed(35);
                    abilities.add("Mask of the Wild");
                } if(subrace==2){
                    setRace("Drow Elf");
                    this.charisma=this.charisma+1;
                    abilities.add("Superior Darkvision");
                    abilities.add("Sunlight Sensitivity");
                    abilities.add("Drow Magic");
                    abilities.add("Drow Weapon Training");
                }
                break;
            case "Halfling":
                this.dexterity=this.dexterity+2;
                setSpeed(25);
                abilities.add("Lucky");
                abilities.add("Brave");
                abilities.add("Halfling Nimbleness");
                language.add("Common");
                language.add("Halfling");
                if (subrace==0){
                    setRace("Lightfoot Halfling");
                    this.charisma=this.charisma+1;
                    abilities.add("Naturally Stealthy");
                }
                if (subrace==1){
                    setRace("Stout Halfling");
                    this.constitution=this.constitution+1;
                    abilities.add("Stout Resilience");
                }
                break;
            case "Human":
                this.strength=this.strength+1;
                this.dexterity=this.dexterity+1;
                this.constitution=this.constitution+1;
                this.intelligence=this.intelligence+1;
                this.wisdom=this.wisdom+1;
                this.charisma=this.charisma+1;
                setSpeed(30);
                language.add("Common");
                break;
            case "Dragonborn":
                this.strength=this.strength+2;
                this.charisma=this.charisma+1;
                setSpeed(30);
                abilities.add("Draconic Ancestry");
                abilities.add("Breath Weapon");
                abilities.add("Damage Resistance");
                language.add("Common");
                language.add("Draconic");
                break;
            case "Gnome":
                this.intelligence=this.intelligence+2;
                setSpeed(25);
                abilities.add("Darkvision");
                abilities.add("Gnome Cunning");
                language.add("Common");
                language.add("Gnomish");
                if (subrace==0){
                    setRace("Forest Gnome");
                    this.dexterity=this.dexterity+1;
                    abilities.add("Natural Illusionist");
                    abilities.add("Speak with Small Beasts");
                }
                if (subrace==1){
                    setRace("Rock Gnome");
                    this.constitution=this.constitution+1;
                    abilities.add("Artificer's Lore");
                    abilities.add("Tinker");
                }
                break;
            case "Half-elf":
                this.charisma=this.charisma+2;
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Fey ancestry");
                abilities.add("Skill versatility");
                language.add("Common");
                language.add("Elvish");
                break;
            case "Half-orc":
                this.strength=this.strength+2;
                this.constitution=this.constitution+1;
                setSpeed(30);
                abilities.add("Darkvision");
                abilities.add("Menacing");
                abilities.add("Relentless endurance");
                abilities.add("Savage Attacks");
                language.add("Common");
                language.add("Orc");
                break;
            case "Tiefling":
                this.intelligence=this.intelligence+1;
                this.charisma=this.charisma+2;
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
}