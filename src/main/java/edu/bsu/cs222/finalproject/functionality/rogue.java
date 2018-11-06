package edu.bsu.cs222.finalproject.functionality;

public class rogue extends Character {
    public rogue(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
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
    public void setEquipment() {

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
    public int getSpellAttackBonus() {
        return 0;
    }

    @Override
    public void setSpellAttackBonus(int bonus) {

    }
}
