package edu.bsu.cs222.finalproject.functionality;

import java.util.HashMap;
import java.util.Map;

public abstract class Character implements CharacterInterface {

    private String alignment;
    private String playerName;
    private int experiencePoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int inteligence;
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
        inteligence = intel;
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
        playerName = playerName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        race = race;
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
        pb= this.pbMap.get(proficiencyBonus);
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
                switch (number){
                    case 1:
                        sTrait="I cheat at games of chance.";
                        break;
                    case 2:
                        sTrait="I shave coins or forge documents";
                        break;
                    case 3:
                        sTrait="I insinuate myself into people's lives to prey on their weakness and secure their fortunes";
                        break;
                    case 4:
                        sTrait="I put on new identities like clothes";
                        break;
                    case 5:
                        sTrait="I run sleight-of-hand cons on street corners.";
                        break;
                    case 6:
                        sTrait="I convince people that worthless junk is worth their hard-earned money";
                        break;
                    default:
                        break;
                }
            case "criminal":
                switch (number){
                    case 1:
                        sTrait="Blackmailer";
                        break;
                    case 2:
                        sTrait="Burglar";
                        break;
                    case 3:
                        sTrait="Enforcer";
                        break;
                    case 4:
                        sTrait="Fence";
                        break;
                    case 5:
                        sTrait="Highway robber";
                        break;
                    case 6:
                        sTrait="Hired killer";
                        break;
                    case 7:
                        sTrait="Pickpocket";
                        break;
                    case 8:
                        sTrait="Smuggler";
                        break;
                    default:
                        break;
                }
            case "entertainer":
                switch (number){
                    case 1:
                        sTrait="Actor";
                        break;
                    case 2:
                        sTrait="Dancer";
                        break;
                    case 3:
                        sTrait="Fire-eater";
                        break;
                    case 4:
                        sTrait="Jester";
                        break;
                    case 5:
                        sTrait="Juggler";
                        break;
                    case 6:
                        sTrait="Instrumentalist";
                        break;
                    case 7:
                        sTrait="Poet";
                        break;
                    case 8:
                        sTrait="Singer";
                        break;
                    case 9:
                        sTrait="Storyteller";
                        break;
                    case 10:
                        sTrait="Tumbler";
                        break;
                    default:
                        break;
                }
            case "folk hero":
                switch (number) {
                    case 1:
                        sTrait = "I stood up to a tyrant's agents";
                        break;
                    case 2:
                        sTrait = "I saved people during a nature disaster";
                        break;
                    case 3:
                        sTrait = "I stood alone against a terrible monster.";
                        break;
                    case 4:
                        sTrait = "I stole a corrupt merchant to help the poor.";
                        break;
                    case 5:
                        sTrait = "I led a militia to fight off and invading army.";
                        break;
                    case 6:
                        sTrait = "I broke into a tyrant's castle and stole weapons to arm the people";
                        break;
                    case 7:
                        sTrait = "I trained the peasantry to use farm implements as weapon against a tyrant's soldiers";
                        break;
                    case 8:
                        sTrait = "A lord rescinded an unpopular decree after I led a symbolic act of protest against it.";
                        break;
                    case 9:
                        sTrait = "A celestial, fey, or similar creature gave me a blessing or revealed my secret origin.";
                        break;
                    case 10:
                        sTrait = "Recruited into a lord's army, I rose to leadership and was commended for my heroism";
                    default:
                        break;
                }
        }
    }

    public Integer getMod(int stat){
        return this.modMap.get(stat);
    }
}