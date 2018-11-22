package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FakeCharacter {
    String CharacterName, classtype, race, background, alignment, playerName;
    int level, experience, strength, dexterity, constitution, intelligence, wisdom, charisma;

    int speed, health;

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
    ArrayList<String> language = new ArrayList<>();
    ArrayList<String> abilities = new ArrayList<>();
    ArrayList<String> KnownSkills = new ArrayList<>();
    public FakeCharacter(String CharacterName, String classtype, int level, String race, String background, String allignment, String playerName, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.CharacterName = CharacterName;
        this.classtype = classtype;
        this.level = level;
        this.race = race;
        this.background = background;
        this.alignment = allignment;
        this.playerName=playerName;
        this.experience = experience;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    public FakeCharacter() {}


    public void setRaceBonus(int mod){
        switch(this.race){
            case "Dwarf":
                this.constitution += 2;
                speed = 25;
                language.add("Common");
                language.add("Dwarvish");
                abilities.add("Dwarven Resilience");
                abilities.add("Dwarven Combat Training");
                abilities.add("Tool Proficiency");
                abilities.add("Stonecunning");
                if (mod == 0){
                    this.race = "Hill Dwarf";
                    this.wisdom +=1;
                    abilities.add("Dwarven Toughness");
                } if (mod == 1){
                this.race="Mountain Dwarf";
                this.strength +=2;
                abilities.add("Dwarven Armour Training");
            }
                break;
            case "Elf":
                this.dexterity+=2;
                this.speed=30;
                abilities.add("Darkvision");
                abilities.add("Keen Senses");
                abilities.add("Fey Ancestry");
                abilities.add("Trance");
                if (mod==0){
                    this.intelligence+=1;
                    abilities.add("Elf Weapon Training");
                    this.race = "High Elf";
                }
                if (mod==1){
                    this.race = "Wood Elf";
                    this.wisdom+=1;
                    abilities.add("Elf Weapon Proficiency");
                    abilities.add("Fleet of Foot");
                    this.speed=35;
                    abilities.add("Mask of the Wild");
                } if(mod==2){
                this.race ="Drow Elf";
                this.charisma+=1;
                abilities.add("Superior Darkvision");
                abilities.add("Sunlight Sensitivity");
                abilities.add("Drow Magic");
                abilities.add("Drow Weapon Training");
            }
                break;
            case "Halfling":
                this.dexterity+=2;
                this.speed=25;
                abilities.add("Lucky");
                abilities.add("Brave");
                abilities.add("Halfling Nimbleness");
                language.add("Common");
                language.add("Halfling");
                if (mod==0){
                    this.race ="Lightfoot Halfling";
                    this.charisma+=1;
                    abilities.add("Naturally Stealthy");
                }
                if (mod==1){
                    this.race = "Stout Halfling";
                    this.constitution +=1;
                    abilities.add("Stout Resilience");
                }
                break;
            case "Human":
                this.strength+=1;
                this.dexterity+=1;
                this.constitution+=1;
                this.intelligence+=1;
                this.wisdom+=1;
                this.charisma+=1;
                this.speed = 30;
                language.add("Common");
                break;
            case "Dragonborn":
                this.strength+=2;
                this.charisma+=1;
                this.speed=30;
                abilities.add("Draconic Ancestry");
                abilities.add("Breath Weapon");
                abilities.add("Damage Resistance");
                language.add("Common");
                language.add("Draconic");
                break;
            case "Gnome":
                this.intelligence+=2;
                this.speed=25;
                abilities.add("Darkvision");
                abilities.add("Gnome Cunning");
                language.add("Common");
                language.add("Gnomish");
                if (mod==0){
                    this.race="Forest Gnome";
                    this.dexterity+=1;
                    abilities.add("Natural Illusionist");
                    abilities.add("Speak with Small Beasts");
                }
                if (mod==1){
                    this.race ="Rock Gnome";
                    this.constitution+=1;
                    abilities.add("Artificer's Lore");
                    abilities.add("Tinker");
                }
                break;
            case "Half-elf":
                this.charisma+=2;
                this.speed=30;
                abilities.add("Darkvision");
                abilities.add("Fey ancestry");
                abilities.add("Skill versatility");
                language.add("Common");
                language.add("Elvish");
                break;
            case "Half-orc":
                this.strength+=2;
                this.constitution+=2;
                this.speed=30;
                abilities.add("Darkvision");
                abilities.add("Menacing");
                abilities.add("Relentless endurance");
                abilities.add("Savage Attacks");
                language.add("Common");
                language.add("Orc");
                break;
            case "Tiefling":
                this.intelligence+=1;
                this.charisma+=2;
                this.speed=30;
                abilities.add("Darkvision");
                abilities.add("Hellish Resistance");
                abilities.add("Infernal Legacy");
                language.add("Common");
                language.add("Infernal");
                break;
        }
    }

    public Integer getMod(int stat){
        return modMap.get(stat);
    }

}
