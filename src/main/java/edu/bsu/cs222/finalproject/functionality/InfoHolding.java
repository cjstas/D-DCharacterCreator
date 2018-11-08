package edu.bsu.cs222.finalproject.functionality;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InfoHolding {

    public static final int[] standardArray = {15,14,13,12,10,8};
    public static final int[] eliteArray = {17,16,15,14,12,10};
    public static final int[] dunceArray = {13,12,11,10,8,8};

    public static ObservableList <String> alignmentL_UArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = {"Lawful", "Neutral", "Chaotic"};
        for(String e: item){
            list.add(e);
        }
        return list;
    }

    public static ObservableList <String> alignmentG_EArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = {"Good", "Neutral", "Evil"};
        for(String e: item){
            list.add(e);
        }
        return list;
    }

    public static ObservableList <String> classesArray() {
        ObservableList <String> list = FXCollections.observableArrayList();

        String[] item = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        for(String e: item){
            list.add(e);
        }
        return list;

    }

    public static ObservableList <String> racesArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = { "Mountain Dwarf", "Hill Dwarf",  "High Elf",
                         "Wood Elf", "Dark Elf/ Drow", "Stout Halfling",
                         "Lightfoot Halfling", "Human", "Dragonborn",
                         "Rock Gnome", "Forest Gnome", "Half-Elf", "Half-Orc", "Tiefling", "Homebrew"};
        for(String e: item){
            list.add(e);
        }
        return list;
    }
}
