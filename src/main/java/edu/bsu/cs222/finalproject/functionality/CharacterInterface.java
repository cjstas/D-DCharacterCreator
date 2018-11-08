package edu.bsu.cs222.finalproject.functionality;

public interface CharacterInterface {

    //everything a default character would have is here
    String getCharacterName();

    void setCharacterName(String characterName);

    int getLevel();

    void setLevel(int totalLevel);

    String getBackground();

    void setBackground(String background);

    String getClassType();

    void setClassType(String classType);

    String getPlayerName();

    void setPlayerName(String playerName);

    String getRace();

    void setRace(String race);

    String getAlignment();

    void setAlignment(String alignment);

    int getEXP();

    void setEXP(int exp);

    boolean getInspiration();

    void setInspiration(boolean active);

    int getProficiencyBonus();

    void setProficiencyBonus(int proficiencyBonus);

    int getAC();

    void setAC(int armour);

    int getInitiative();

    void setInitiative(int dex);

    int getSpeed();

    void setSpeed(int speed);

    String getSpecialTrait();

    void setBackgroundTrait(String background);

    String getPersonalityTrait();

    void setPersonalityTrait(String personalityTrait);

    String getIdeals();

    void setIdeals(String ideals);

    String getBonds();

    void setBonds(String bonds);

    String getFlaws();

    void setFlaws(String flaws);

    int getStats();

    void setStats (int str, int dex, int con, int intel, int wis, int cha);

    int getHealth();

    int setHealth(int health, int level);

    String getLanguages();

    void setLanguages(String languages);

    String getEquipment();

    void setEquipment();

    String getEquippedArmour();

    void setEquippedArmour(String armour);

    String getFeatsAndTraits();

    void setFeatsAndTraits(String feats, String traits);

    int getSpellcastingAbility();

    int setSpellcastingAbility(int ability);

    int setSpellSaveDC(int dc);

    int getSpellAttackBonus();

    void setSpellAttackBonus(int bonus);

}
