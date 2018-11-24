package edu.bsu.cs222.finalproject.functionality;

public interface CharacterInterface {

    //everything a default character would have is here
    String getBackground();

    void setBackground(String background);

    void setClassType(String classType);

    void setPlayerName(String playerName);

    void setRace(String race);

    void setAlignment(String alignment);

    int getProficiencyBonus();

    void setProficiencyBonus(int proficiencyBonus);

    void setSpeed(int speed);

    void setBackgroundTrait(String background);

    void setPersonalityTrait(String personalityTrait);

    void setIdeals(String ideals);

    void setBonds(String bonds);

    void setFlaws(String flaws);

    int setHealth(int health, int level);

    void setEquipment();

    int setSpellcastingAbility(int ability);

    int setSpellSaveDC(int dc);
}
