package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;

public class Spell {
    public String name;
    public ArrayList<String> useableBy;
    public int spellSlotLevel;

    Spell(String name,ArrayList<String> useableBy, int spellSlotLevel) {
        this.name = name;
        this.useableBy = useableBy;
        this.spellSlotLevel = spellSlotLevel;
    }

    public boolean isCastableBy(String name) {
        boolean result = false;
        for(String names : useableBy) {
            if(names.equals(name)) {
                result = true;
            }
        }
        return result;
    }

}
