package edu.bsu.cs222.finalproject.functionality;

public interface CharacterInterface {

    //everything a default character would have is here
    String getCharacterName();

    void setCharacterName(String characterName);

    int getLevel();

    void setLevel(int totalLevel);

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

    void setAC(int ac);

    int getInitiative();

    void setInitiative(int initiative);

    int getSpeed();

    void setSpeed(int speed);

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

    void setHealth(int health);

    boolean getSavingThrow();

    void setSavingThrow(boolean str, boolean dex, boolean con, boolean intel, boolean wis, boolean cha);

    int getDeathSaves();

    void setDeathSaves(int fail, int pass);

    boolean getSkills();

    void setSkills(boolean acrobatics,boolean animalHandling, boolean arcana, boolean athletics, boolean deception, boolean history, boolean insight, boolean intimidation,
                   boolean investigation, boolean medicine, boolean nature, boolean perception, boolean performance, boolean persuasion, boolean religion, boolean sleightOfHand,
                   boolean stealth, boolean survival);

    String getWeapon();

    void setWeapon(String weapon1, String weapon2, String weapon3);

    String getLanguages();

    void setLanguages(String languages);

    String getEquipment();

    void setEquipment(String equipment);

    String getEquippedArmour();

    void setEquippedArmour(String armour);

    String getFeatsAndTraits();

    void setFeatsAndTraits(String feats, String traits);

    int getSpellcastingAbility();

    void setSpellcastingAbility(int ability);

    int getSpellSaveDC();

    void setSpellSaveDC(int dc);

    int getSpellAttackBonus();

    void setSpellAttackBonus(int bonus);

    int getSpellSlots();

    void setSpellSlots(int cantrip, int level1, int level2, int level3, int level4, int level5, int level6, int level7, int level8, int level9);
}
