package edu.bsu.cs222.finalproject.functionality;

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
    private int ac;
    private int initiative;

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

    public void setProficiencyBonus() {
        switch (lvl){
            case 1:
            case 2:
            case 3:
            case 4:
                pb=2;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                pb=3;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                pb=4;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                pb=5;
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                pb=6;
                break;
        }
    }

    public int getAC() {
        return ac;
    }

    public void setAC(int ac) {
        ac=ac;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int dex) {
        initiative=getMod(dex);
    }


    public int getMod(int stat){
        int modifier = 0;
        switch (stat){
            case 1:
                modifier=(-5);
                break;
            case 2:
            case 3:
                modifier=(-4);
                break;
            case 4:
            case 5:
                modifier=(-3);
                break;
            case 6:
            case 7:
                modifier=(-2);
                break;
            case 8:
            case 9:
                modifier=(-1);
                break;
            case 10:
            case 11:
                modifier=0;
                break;
            case 12:
            case 13:
                modifier=1;
                break;
            case 14:
            case 15:
                modifier=2;
                break;
            case 16:
            case 17:
                modifier=3;
                break;
            case 18:
            case 19:
                modifier=4;
                break;
            case 20:
            case 21:
                modifier=5;
                break;
            case 22:
            case 23:
                modifier=6;
                break;
            case 24:
            case 25:
                modifier=7;
                break;
            case 26:
            case 27:
                modifier=8;
                break;
            case 28:
            case 29:
                modifier=9;
                break;
            case 30:
                modifier=10;
                break;
        }
        return modifier;
    }
}
