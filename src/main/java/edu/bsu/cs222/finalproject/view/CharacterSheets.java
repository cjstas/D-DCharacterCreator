package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Character;
import edu.bsu.cs222.finalproject.functionality.ListMaker;
import edu.bsu.cs222.finalproject.functionality.PDFCreation;
import edu.bsu.cs222.finalproject.functionality.Spell;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Collections;

class CharacterSheets {

    private TextField str, dex, cons, intel, wis, cha, passWis,
            strMod, dexMod, consMod, intelMod, wisMod, chaMod,
            strSav, dexSav, consSav, intelSav, wisSav, chaSav,
            insp, profBonus, AC,init, speed, hitMax, currHP, tempHP, HD, DS, pp, gp, sp, cp,
            acrF,aniHandF,arcanF,athlF,decF,histF,insF,intimF,invesF,medF,natF,percepF,performF,
            persF,relgF,sliOfHandF,stealF,survF;
    private TextArea languages, pers, ideal, bon, flaw, featAndTraits, equip,atkWeapons,
            cantrips, spellLv1, spellLv2, spellLv3, spellLv4, spellLv5, spellLv6, spellLv7, spellLv8, spellLv9;
    private RadioButton acrRb, aniHandRb, arcanRb, athlRb, decRb, histRb, insRb, intimRb, invesRb, medRb, natRb,
            percepRb, performRb, persRb, relgRb, sliOfHandRb, stealRb, survRb;

    Pane setSheet() {
            return sheet5e();
    }

    private Pane sheet5e() {
        BorderPane sheet5e = new BorderPane();
        setUpPaneControls();
        VBox skillsAndSaves = new VBox(
                new HBox(insp,new Label("Inspiration")),
                new HBox(profBonus,new Label("Proficiency Bonus")),
                savesBox(),
                skillBox());

        HBox topLeft = new HBox(statsBox(), skillsAndSaves);
        VBox left = new VBox(
                topLeft,
                new HBox(new Label("passive Wis"),passWis));

        VBox center = new VBox(
                acBox(),
                new Label("max HP"), hitMax,
                new Label("current HP"),currHP,
                new Label("temp HP"), tempHP,
                new HBox(new VBox(new Label("hit die"),HD),
                        new VBox(new Label("Death Saves"), DS)),
                new Label("Spell attacks/weapons"),atkWeapons,
                equipmentBox(),
                new Label("Languages"),languages);
        VBox right = new VBox(
                new Label("Personality"), pers,
                new Label("Ideals"), ideal,
                new Label("Bonds"), bon,
                new Label("Flaws"), flaw,
                new Label("Feature and Traits"), featAndTraits
        );
        sheet5e.setRight(right);
        sheet5e.setCenter(center);
        sheet5e.setLeft(left);
        return sheet5e;
    }

    private VBox statsBox(){
        return  new VBox(
                new Label("str"),str,new Label("str modifier"),strMod,
                new Label("dex"),dex,new Label("dex modifier"),dexMod,
                new Label("con"),cons, new Label("Con modifier"),consMod,
                new Label("int"),intel, new Label("int modifier"),intelMod,
                new Label("wis"),wis,new Label("wis modifier"),wisMod,
                new Label("cha"),cha,new Label("cha modifier"),chaMod);
    }

    private VBox savesBox(){
        return new VBox(new HBox(strSav, new Label("strength")),
                new HBox(dexSav, new Label("dexterity")),
                new HBox(consSav, new Label("constitution")),
                new HBox(intelSav, new Label("intelligence")),
                new HBox(wisSav, new Label("wisdom")),
                new HBox(chaSav, new Label("charisma")),
                new Label("Saving Throws"));
    }

    private VBox skillBox() {

        return new VBox(
                new HBox(acrRb, acrF, new Label("Acrobatics(dex)")),
                new HBox(aniHandRb, aniHandF, new Label("Animal Handling(wis)")),
                new HBox(arcanRb, arcanF, new Label("Arcana(int)")),
                new HBox(athlRb, athlF, new Label("Athletics(str)")),
                new HBox(decRb, decF, new Label("Deception(cha)")),
                new HBox(histRb, histF,new Label("History(int)")),
                new HBox(insRb, insF, new Label("Insight(wis)")),
                new HBox(intimRb, intimF, new Label("Intimidation(cha)")),
                new HBox(invesRb, invesF, new Label("Investigation(int)")),
                new HBox(medRb, medF, new Label("Medicine(wis)")),
                new HBox(natRb, natF, new Label("Nature(int)")),
                new HBox(percepRb, percepF, new Label("Perception(wis)")),
                new HBox(performRb, performF, new Label("Performance(cha)")),
                new HBox(persRb, persF, new Label("Persuasion(cha)")),
                new HBox(relgRb, relgF, new Label("Religion(int)")),
                new HBox(sliOfHandRb, sliOfHandF, new Label("Sleight of hand(dex)")),
                new HBox(stealRb, stealF, new Label("Stealth(dex)")),
                new HBox(survRb, survF, new Label("Survival(wis)"))
        );
    }

    private HBox acBox(){
        return  new HBox(
                new VBox(new Label("Armor\nClass "), AC),
                new VBox(new Label("Initiative"),init),
                new VBox(new Label(" Speed"),speed));
    }

    private HBox equipmentBox(){

        return new HBox(
                new VBox(new Label(" "),
                        new HBox(new Label("pp"), pp),
                        new HBox(new Label("gp"),gp),
                        new HBox(new Label("sp"),sp),
                        new HBox(new Label("cp"),cp)),
                new VBox(new Label("equipment"),equip));
    }

    private void setUpPaneControls() {
        acrRb = new RadioButton();
        aniHandRb = new RadioButton();
        arcanRb = new RadioButton();
        athlRb = new RadioButton();
        decRb = new RadioButton();
        histRb = new RadioButton();
        insRb = new RadioButton();
        intimRb = new RadioButton();
        invesRb = new RadioButton();
        medRb = new RadioButton();
        natRb = new RadioButton();
        percepRb = new RadioButton();
        performRb = new RadioButton();
        persRb = new RadioButton();
        relgRb = new RadioButton();
        sliOfHandRb = new RadioButton();
        stealRb = new RadioButton();
        survRb = new RadioButton();

        passWis = new TextField();
        str = new TextField();
        dex = new TextField();
        cons = new TextField();
        intel = new TextField();
        wis = new TextField();
        cha = new TextField();
        passWis = new TextField();
        strMod = new TextField();
        dexMod= new TextField();
        consMod= new TextField();
        intelMod= new TextField();
        wisMod= new TextField();
        chaMod= new TextField();
        strSav = new TextField();
        dexSav = new TextField();
        consSav = new TextField();
        intelSav = new TextField();
        wisSav = new TextField();
        chaSav = new TextField();
        pp = new TextField();
        gp = new TextField();
        sp = new TextField();
        cp = new TextField();
        equip = new TextArea();
        AC = new TextField();
        init = new TextField();
        speed = new TextField();
        acrF = new TextField();
        aniHandF = new TextField();
        arcanF = new TextField();
        athlF = new TextField();
        decF = new TextField();
        histF = new TextField();
        insF = new TextField();
        intimF = new TextField();
        invesF = new TextField();
        medF = new TextField();
        natF = new TextField();
        percepF = new TextField();
        performF = new TextField();
        persF = new TextField();
        relgF = new TextField();
        sliOfHandF = new TextField();
        stealF = new TextField();
        survF = new TextField();
        insp = new TextField();
        profBonus = new TextField();
        hitMax = new TextField();
        currHP = new TextField();
        tempHP = new TextField();
        HD = new TextField();
        DS = new TextField();

        atkWeapons = new TextArea();
        languages = new TextArea();
        pers = new TextArea();
        ideal = new TextArea();
        bon = new TextArea();
        flaw = new TextArea();
        featAndTraits = new TextArea();
        cantrips = new TextArea();
        spellLv1 = new TextArea();
        spellLv2 = new TextArea();
        spellLv3 = new TextArea();
        spellLv4 = new TextArea();
        spellLv5 = new TextArea();
        spellLv6 = new TextArea();
        spellLv7 = new TextArea();
        spellLv8 = new TextArea();
        spellLv9 = new TextArea();

        atkWeapons.setPrefRowCount(20);
        atkWeapons.setPrefRowCount(4);
        languages.setPrefColumnCount(20);
        languages.setPrefRowCount(4);
        pers.setPrefColumnCount(20);
        pers.setPrefRowCount(4);
        ideal.setPrefColumnCount(20);
        ideal.setPrefRowCount(4);
        bon.setPrefColumnCount(20);
        bon.setPrefRowCount(4);
        flaw.setPrefColumnCount(20);
        flaw.setPrefRowCount(4);
        featAndTraits.setPrefColumnCount(20);
        featAndTraits.setPrefRowCount(4);
        equip.setPrefColumnCount(20);

        acrF.setPrefColumnCount(4);
        aniHandF.setPrefColumnCount(4);
        arcanF.setPrefColumnCount(4);
        athlF.setPrefColumnCount(4);
        decF.setPrefColumnCount(4);
        histF.setPrefColumnCount(4);
        insF.setPrefColumnCount(4);
        intimF.setPrefColumnCount(4);
        invesF.setPrefColumnCount(4);
        medF.setPrefColumnCount(4);
        natF.setPrefColumnCount(4);
        percepF.setPrefColumnCount(4);
        performF.setPrefColumnCount(4);
        persF.setPrefColumnCount(4);
        relgF.setPrefColumnCount(4);
        sliOfHandF.setPrefColumnCount(4);
        stealF.setPrefColumnCount(4);
        survF.setPrefColumnCount(4);
        str.setPrefColumnCount(4);
        dex.setPrefColumnCount(4);
        cons.setPrefColumnCount(4);
        intel.setPrefColumnCount(4);
        wis.setPrefColumnCount(4);
        cha.setPrefColumnCount(4);
        strMod.setPrefColumnCount(4);
        dexMod.setPrefColumnCount(4);
        consMod.setPrefColumnCount(4);
        intelMod.setPrefColumnCount(4);
        wisMod.setPrefColumnCount(4);
        chaMod.setPrefColumnCount(4);
        strSav.setPrefColumnCount(4);
        dexSav.setPrefColumnCount(4);
        consSav.setPrefColumnCount(4);
        intelSav.setPrefColumnCount(4);
        wisSav.setPrefColumnCount(4);
        chaSav.setPrefColumnCount(4);
        passWis.setPrefColumnCount(4);
        insp.setPrefColumnCount(4);
        profBonus.setPrefColumnCount(4);
        AC.setPrefColumnCount(4);
        init.setPrefColumnCount(4);
        speed.setPrefColumnCount(4);
        hitMax.setPrefColumnCount(10);
        currHP.setPrefColumnCount(10);
        tempHP.setPrefColumnCount(10);
        HD.setPrefColumnCount(4);
        DS.setPrefColumnCount(4);
        pp.setPrefColumnCount(4);
        gp.setPrefColumnCount(4);
        sp.setPrefColumnCount(4);
        cp.setPrefColumnCount(4);
    }

    void populateSheet(Character player) {
            player.setRaceBonus();
            player.setHealth();

            str.setText(player.strength+"");
            dex.setText(player.dexterity+"");
            cons.setText(player.constitution+"");
            intel.setText(player.intelligence+"");
            wis.setText(player.wisdom+"");
            cha.setText(player.charisma+"");

            strMod.setText(""+ Character.modMap.get(player.strength));
            dexMod.setText(""+ Character.modMap.get(player.dexterity));
            consMod.setText(""+ Character.modMap.get(player.constitution));
            intelMod.setText(""+ Character.modMap.get(player.intelligence));
            wisMod.setText(""+ Character.modMap.get(player.wisdom));
            chaMod.setText(""+ Character.modMap.get(player.charisma));

            passWis.setText(""+(Character.modMap.get(player.wisdom)+10));

            if(player.setSavingThrows()[0]) {
                strSav.setText("" + (Integer.parseInt(strMod.getText())+ 10));
            }
            if (player.setSavingThrows()[1]) {
                dexSav.setText("" + (Integer.parseInt(dexMod.getText()) + 10));
            }
            if (player.setSavingThrows()[2]) {
                consSav.setText("" + (Integer.parseInt(consMod.getText()) + 10));
            }
            if (player.setSavingThrows()[3]) {
                wisSav.setText("" + (Integer.parseInt(wisMod.getText()) + 10));
            }
            if (player.setSavingThrows()[4]) {
                intelSav.setText("" + (Integer.parseInt(intelMod.getText()) + 10));
            }
            if(player.setSavingThrows()[5]){
                chaSav.setText(""+(Integer.parseInt(chaMod.getText())+10));
            }
            if(filledPreviously()){
                for(String skill: player.getSkills()){
                    fillSkills(skill);
                }
            }

            ideal.setText("");
            ideal.setText(player.ideal);

            equip.setText("");
            for(String item: player.equipment){
                equip.appendText(item.concat("\n"));
            }
            featAndTraits.setText("");
            for(String ability: player.abilities) {
                featAndTraits.appendText(ability.concat("\n"));
            }
            languages.setText("");
            for(String language: player.language){
                this.languages.appendText(language.concat("\n"));
            }

            AC.setText(""+player.ac);
            speed.setText(""+player.speed);
            currHP.setText(""+player.health);
            hitMax.setText(""+player.health);
            flaw.setText(player.flaw);
            bon.setText(player.bond);
            pers.setText(player.personalityTrait);


    }

    @SuppressWarnings("RedundantIfStatement")
    private boolean filledPreviously() {

        if(aniHandRb.isSelected()){return false;}
        if(athlRb.isSelected()){return false;}
        if(acrRb.isSelected()){return false;}
        if(arcanRb.isSelected()){return false;}
        if(decRb.isSelected()){return false;}
        if(histRb.isSelected()){return false;}
        if(insRb.isSelected()){return false;}
        if(intimRb.isSelected()){return false;}
        if(invesRb.isSelected()){return false;}
        if(medRb.isSelected()){return false;}
        if(natRb.isSelected()){return false;}
        if(percepRb.isSelected()){return false;}
        if(performRb.isSelected()){return false;}
        if(persRb.isSelected()){return false;}
        if(relgRb.isSelected()){return false;}
        if(sliOfHandRb.isSelected()){return false;}
        if(stealRb.isSelected()){return false;}
        if(survRb.isSelected()){return false;}


        return true;
    }

    private void fillSkills(String skill) {
        switch(skill){
            case "acrobatics":
                acrRb.setSelected(true);
                acrF.setText(dexMod.getText());
                break;
            case "animalHandling":
                aniHandRb.setSelected(true);
                aniHandF.setText(wisMod.getText());
                break;
            case "arcana":
                arcanRb.setSelected(true);
                arcanF.setText(intelMod.getText());
                break;
            case "athletics":
                athlRb.setSelected(true);
                athlF.setText(strMod.getText());
                break;
            case "deception":
                decRb.setSelected(true);
                decF.setText(chaMod.getText());
                break;
            case "history":
                histRb.setSelected(true);
                histF.setText(intelMod.getText());
                break;
            case "insight":
                insRb.setSelected(true);
                insF.setText(wisMod.getText());
                break;
            case "intimidation":
                intimRb.setSelected(true);
                intimF.setText(chaMod.getText());
                break;
            case "investigation":
                invesRb.setSelected(true);
                invesF.setText(intelMod.getText());
                break;
            case "medicine":
                medRb.setSelected(true);
                medF.setText(wisMod.getText());
                break;
            case "nature":
                natRb.setSelected(true);
                natF.setText(intelMod.getText());
                break;
            case "perception":
                percepRb.setSelected(true);
                percepF.setText(wisMod.getText());
                break;
            case "perfomance":
                performRb.setSelected(true);
                performF.setText(chaMod.getText());
                break;
            case "persuasion":
                persRb.setSelected(true);
                persF.setText(chaMod.getText());
                break;
            case "religion":
                relgRb.setSelected(true);
                relgF.setText(intel.getText());
                break;
            case "slightOfHand":
                sliOfHandRb.setSelected(true);
                sliOfHandF.setText(dexMod.getText());
                break;
            case "stealth":
                stealRb.setSelected(true);
                stealF.setText(dexMod.getText());
                break;
            case "survival":
                survRb.setSelected(true);
                survF.setText(wisMod.getText());
                break;
        }
    }

    BorderPane getSpellSheet(){
        BorderPane spellSheet = new BorderPane();

        cantrips.setPrefRowCount(8);
        spellLv1.setPrefRowCount(13);
        spellLv2.setPrefRowCount(13);
        spellLv3.setPrefRowCount(13);
        spellLv4.setPrefRowCount(13);
        spellLv5.setPrefRowCount(9);
        spellLv6.setPrefRowCount(9);
        spellLv7.setPrefRowCount(9);
        spellLv8.setPrefRowCount(7);
        spellLv9.setPrefRowCount(7);

        spellSheet.setLeft(new VBox(
                new Label("Cantrips"),cantrips,
                new Label("Level 1 spells"),spellLv1,
                new Label("Level 2 spells"),spellLv2));
        spellSheet.setCenter(new VBox(
                new Label("Level 3 spells"),spellLv3,
                new Label("Level 4 spells"),spellLv4,
                new Label("Level 5 spells"),spellLv5));
        spellSheet.setRight(new VBox(
                new Label("Level 6 spells"),spellLv6,
                new Label("Level 7 spells"),spellLv7,
                new Label("Level 8 spells"),spellLv8,
                new Label("Level 9 spells"),spellLv9));
        return spellSheet;
    }

    void populateSpells(Character player) {
        ArrayList<String> raceSet = (ArrayList<String>) player.spellsFromRace;
        for(String  spell: raceSet){
            locationDeterminer(spell);
        }
        for(int i= 0; i < player.knownSpells.size(); i++){
            if(i>player.cantripKnown-1){
                cantrips.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot1-1){
                spellLv1.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot2-1){
                spellLv2.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot3-1){
                spellLv3.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot4-1){
                spellLv4.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot5-1){
                spellLv5.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot6-1){
                spellLv6.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot7-1){
                spellLv7.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot8-1){
                spellLv8.setText(player.knownSpells.get(i));
            }
            if(i>player.spellSlot9-1){
                spellLv9.setText(player.knownSpells.get(i));
            }

        }

    }

    private void locationDeterminer(String spell) {
        ArrayList<Spell> spellList = ListMaker.returnSpellsArrayList5e();
        for(Spell spells: spellList){
            if(spells.name.equals(spell)){
                switch(spells.spellSlotLevel){
                    case 0:
                        cantrips.appendText(spell);
                        break;
                    case 1:
                        spellLv1.appendText(spell);
                        break;
                    case 2:
                        spellLv2.appendText(spell);
                        break;
                    case 3:
                        spellLv3.appendText(spell);
                        break;
                    case 4:
                        spellLv4.appendText(spell);
                        break;
                    case 5:
                        spellLv5.appendText(spell);
                        break;
                    case 6:
                        spellLv6.appendText(spell);
                        break;
                    case 7:
                        spellLv7.appendText(spell);
                        break;
                    case 8:
                        spellLv8.appendText(spell);
                        break;
                    case 9:
                        spellLv9.appendText(spell);
                        break;
                }
            }
        }
    }

    void toFinalPdf(PDFCreation pdf){
        pdf.fillEmptySheet();
    }

    Character grabSpells(Character player) {

        Collections.addAll(player.knownSpells, cantrips.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv1.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv2.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv3.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv4.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv5.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv6.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv7.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv8.getText().split("\n"));
        Collections.addAll(player.knownSpells, spellLv9.getText().split("\n"));

        return player;
    }

    int[] grabEnteredStats() {
        int[] stats = new int[6];
        String[] statsString = {str.getText(), dex.getText(), cons.getText(), intel.getText(), wis.getText(), cha.getText()};
        for(int i = 0; i<statsString.length; i++){
            stats[i] = Integer.parseInt(statsString[i]);
        }
        return stats;
    }
}
