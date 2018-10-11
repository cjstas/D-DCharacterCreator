package edu.bsu.cs222.finalproject.view;

public class Character {


    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    private String name;

    public void CharacterName(String name){
        this.name=name;
    }

    public void stats (int str, int dex, int con, int intel, int wis, int cha){
        this.str=str;
        this.dex=dex;
        this.con=con;
        this.intel=intel;
        this.wis=wis;
        this.cha=cha;
    }


}
