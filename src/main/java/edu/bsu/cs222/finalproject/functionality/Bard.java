package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Boolean.parseBoolean;

public class Bard extends Character{

    private List<String> equipment = new ArrayList<>();
    private List<String> items = new ArrayList<>();
    private List<String> classAbilities = new ArrayList<>();
    private List<String> proficiency = new ArrayList<>();

    public Bard(String cName, String classtype, int level, String r, String bg, String align, String pName, int exp, int str, int dex, int con, int intel, int wis, int cha) {
        super(cName, classtype, level, r, bg, align, pName, exp, str, dex, con, intel, wis, cha);
        setSavingThrow(dexST);
        setSavingThrow(chaST);

        List<String> bardSkills = new ArrayList<>();
        bardSkills.add("acrobatics");
        bardSkills.add("animalHandeling");
        bardSkills.add("arcana");
        bardSkills.add("athletics");
        bardSkills.add("deception");
        bardSkills.add("history");
        bardSkills.add("insight");
        bardSkills.add("intimidation");
        bardSkills.add("investigation");
        bardSkills.add("medicine");
        bardSkills.add("nature");
        bardSkills.add("perception");
        bardSkills.add("persuasion");
        bardSkills.add("religion");
        bardSkills.add("sleightofHand");
        bardSkills.add("stealth");
        bardSkills.add("survival");

        Random randomize = new Random();
        String x = bardSkills.get(randomize.nextInt(bardSkills.size()));
        setSkills(parseBoolean(x));
        String y = bardSkills.get(randomize.nextInt(bardSkills.size()));
        while (x.equals(y)) {
            y = bardSkills.get(randomize.nextInt(bardSkills.size()));
        }
        setSkills(parseBoolean(y));
        String z = bardSkills.get(randomize.nextInt(bardSkills.size()));
        while (x.equals(z) || y.equals(z)){
            z = bardSkills.get(randomize.nextInt(bardSkills.size()));
        }
        setSkills(parseBoolean(z));

        classAbilities.add("Spellcasting");
        classAbilities.add("Bardic Inspiration (D6)");
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
