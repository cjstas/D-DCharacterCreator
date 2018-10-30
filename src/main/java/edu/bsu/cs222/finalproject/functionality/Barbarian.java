package edu.bsu.cs222.finalproject.functionality;

import static jdk.vm.ci.sparc.SPARC.d12;

public class Barbarian extends Character {

    public Barbarian(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(strST);
        setSavingThrow(conST);
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {

    }

    @Override
    public String getPersonalityTrait() {
        return null;
    }

    @Override
    public void setPersonalityTrait(String personalityTrait) {

    }

    @Override
    public String getIdeals() {
        return null;
    }

    @Override
    public void setIdeals(String ideals) {

    }

    @Override
    public String getBonds() {
        return null;
    }

    @Override
    public void setBonds(String bonds) {

    }

    @Override
    public String getFlaws() {
        return null;
    }

    @Override
    public void setFlaws(String flaws) {

    }

    @Override
    public int getStats() {
        return 0;
    }

    @Override
    public void setStats(int str, int dex, int con, int intel, int wis, int cha) {

    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int health) {

    }

    @Override
    public void setHealth(int health,int level) {
        int i = 0;
        health=health+12+getMod(getConstitution());
        if (level > 1){
            while  (i<= level){
                health=health+DiceRoll.D12();
            }
        }
    }


    public boolean getSavingThrow(boolean skill) {
        return skill;
    }


    public void setSavingThrow(boolean str, boolean dex, boolean con, boolean intel, boolean wis, boolean cha) {
    }

    @Override
    public int getDeathSaves() {
        return 0;
    }

    @Override
    public void setDeathSaves(int fail, int pass) {

    }

    @Override
    public boolean getSkills() {
        return false;
    }

    @Override
    public void setSkills(boolean acrobatics, boolean animalHandling, boolean arcana, boolean athletics, boolean deception, boolean history, boolean insight, boolean intimidation, boolean investigation, boolean medicine, boolean nature, boolean perception, boolean performance, boolean persuasion, boolean religion, boolean sleightOfHand, boolean stealth, boolean survival) {

    }

    @Override
    public String getWeapon() {
        return null;
    }

    @Override
    public void setWeapon(String weapon1, String weapon2, String weapon3) {

    }

    @Override
    public String getLanguages() {
        return null;
    }

    @Override
    public void setLanguages(String languages) {

    }

    @Override
    public String getEquipment() {
        return null;
    }

    @Override
    public void setEquipment(String equipment) {

    }

    @Override
    public String getEquippedArmour() {
        return null;
    }

    @Override
    public void setEquippedArmour(String armour) {

    }

    @Override
    public String getFeatsAndTraits() {
        return null;
    }

    @Override
    public void setFeatsAndTraits(String feats, String traits) {

    }

    @Override
    public int getSpellcastingAbility() {
        return 0;
    }

    @Override
    public void setSpellcastingAbility(int ability) {

    }

    @Override
    public int getSpellSaveDC() {
        return 0;
    }

    @Override
    public void setSpellSaveDC(int dc) {

    }

    @Override
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }

    @Override
    public int getSpellSlots() {
        return 0;
    }

    @Override
    public void setSpellSlots(int cantrip, int level1, int level2, int level3, int level4, int level5, int level6, int level7, int level8, int level9) {

    }
}
