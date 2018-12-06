package edu.bsu.cs222.finalproject.functionality;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class InfoHolding {

    public static final int[] standardArray = {15,14,13,12,10,8};
    public static final int[] eliteArray = {17,16,15,14,12,10};
    public static final int[] dunceArray = {13,12,11,10,8,8};
    private static final HashMap<String,String> backgrounds = backgroundIntializer();

    private static HashMap<String,String> backgroundIntializer(){
        HashMap<String, String> backgroundMap = new HashMap<>();
        backgroundMap.put("barbarian", "outlander");
        backgroundMap.put("bard", "entertainer");
        backgroundMap.put("cleric", "acolyte");
        backgroundMap.put("druid","hermit");
        backgroundMap.put("fighter","soldier");
        backgroundMap.put("monk","hermit");
        backgroundMap.put("paladin","noble");
        backgroundMap.put("ranger","outlander");
        backgroundMap.put("rogue","charlatan");
        backgroundMap.put("sorcerer","hermit");
        backgroundMap.put("warlock","charlatan");
        backgroundMap.put("wizard","sage");
        return  backgroundMap;
    }

    public static ObservableList <String> alignmentL_UArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = {"Lawful", "Neutral", "Chaotic"};
        list.addAll(Arrays.asList(item));
        return list;
    }

    public static ObservableList <String> alignmentG_EArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = {"Good", "Neutral", "Evil"};
        Collections.addAll(list, item);
        return list;
    }

    public static ObservableList <String> classesArray() {
        ObservableList <String> list = FXCollections.observableArrayList();

        String[] item = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        list.addAll(Arrays.asList(item));
        return list;

    }

    public static ObservableList <String> racesArray() {
        ObservableList <String> list = FXCollections.observableArrayList();
        String[] item = { "Mountain Dwarf", "Hill Dwarf",  "High Elf",
                         "Wood Elf", "Dark Elf/ Drow", "Stout Halfling",
                         "Lightfoot Halfling", "Human", "Dragonborn",
                         "Rock Gnome", "Forest Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
        Collections.addAll(list, item);
        return list;
    }

    public static ObservableList <String> statArrayArray(){
        ObservableList<String> stat = FXCollections.observableArrayList();
        stat.add("standardArray");
        stat.add("eliteArray");
        stat.add("dunceArray");
        return stat;
    }

    public static String backgroundFinder(String playerClass){
        return backgrounds.get(playerClass);
    }

    public static String listToString(List<String> stringList) {
        StringBuilder retString = new StringBuilder();
        for(String obj: stringList){
            retString.append(obj.concat("\n"));
        }
        return retString.toString();
    }

    public static String giveRandomOption(ObservableList<String> list){
        return list.get(new Random().nextInt(list.size()));
    }
}
