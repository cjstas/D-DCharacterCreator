package edu.bsu.cs222.finalproject.functionality;

public class Character {


    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    private String name;
    private String race;

    public void Character(){

    }

    public void CharacterName(String name){
        this.name=name;
    }

    public void Stats (int str, int dex, int con, int intel, int wis, int cha){
        this.str=str;
        this.dex=dex;
        this.con=con;
        this.intel=intel;
        this.wis=wis;
        this.cha=cha;
    }

    public void Race(String race){
        this.race=race;
    }


}
