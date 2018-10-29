package edu.bsu.cs222.finalproject.view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InfoHolding {
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
        String[] item = {"Dwarf", "Mountain Dwarf", "Hill Dwarf", "Elf", "High Elf",
                         "Wood Elf", "Dark Elf/ Drow", "Hafling", "Stout Hafling",
                         "Lightfoot Hafling", "Human", "Dragonborn", "Gnome",
                         "Rock Gnome", "Forest Gnome", "Half-Elf", "Half-Orc", "Tiefling", "Homebrew"};
        for(String e: item){
            list.add(e);
        }
        return list;
    }
}
