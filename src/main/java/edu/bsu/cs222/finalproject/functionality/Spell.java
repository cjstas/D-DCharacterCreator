package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;

public class Spell {
    public String name;
    private ArrayList<String> useableBy;
    public int spellSlotLevel;

    Spell(String name,ArrayList<String> useableBy, int spellSlotLevel) {
        this.name = name;
        this.useableBy = useableBy;
        this.spellSlotLevel = spellSlotLevel;
    }


    public boolean isCastableBy(String user) {
        boolean result = false;
        for(String users : useableBy) {
            if(user.equals(users)) {
                result = true;
            }
        }
        return result;
    }
}
