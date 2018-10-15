package edu.bsu.cs222.finalproject.functionality;

public abstract class Character implements CharacterInterface {

    private String charName;
    private int lvl;
    private String classT;

    protected enum stats{
        str,dex,con,intel,wis,cha,
    }

    public Character(String charName, String classT, int lvl, String race, String bg, String align, String pName, int exp, int stats){

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

}
