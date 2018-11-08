package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CharacterSheets extends Application {

    private TextField str, dex, cons, intel, wis, cha, passWis,
            strMod, dexMod, consMod, intelMod, wisMod, chaMod,
            strSav, dexSav, consSav, intelSav, wisSav, chaSav,
            insp, profBonus, AC,init, speed, hitMax, currHP, tempHP, HD, DS, pp, gp, sp, cp,
            acrF,aniHandF,arcanF,athlF,decF,histF,insF,intimF,invesF,medF,natF,percepF,performF,
            persF,relgF,sliOfHandF,stealF,survF;
    private TextArea languages, pers, ideal, bon, flaw, featAndTraits, equip,atkWeapons,
            cantrips, spellLv1, spellLv2, spellLv3, spellLv4, spellLv5, spellLv6, spellLv7, spellLv8, spellLv9;
    private RadioButton acrRb, aniHandRb, arcanRb, athlRb, decRb, histRb, insRb, intimRb, invesRb, medRb, natRb, percepRb, performRb, persRb, relgRb, sliOfHandRb, stealRb, survRb;

    public Pane setSheet(String sheet) {
        if(sheet.equals("3.5")){
            return sheet35();
        }else{
            return sheet5e();
        }
    }

    private Pane sheet35() {
        Pane sheet35 = new BorderPane();
        sheet35.getStyleClass().add("SheetThreeFive.css");
        return sheet35;
    }

    private Pane sheet5e() {
        Pane sheet5e = new BorderPane();
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
        ((BorderPane) sheet5e).setRight(right);
        ((BorderPane) sheet5e).setCenter(center);
        ((BorderPane) sheet5e).setLeft(left);
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
                new HBox(chaSav, new Label("charisma")));
    }

    private VBox skillBox() {
         VBox skillBox = new VBox(
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

        return skillBox;
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

    public void populateSheet(String sheetNumber, Character player) {
        if("5".equals(sheetNumber)){
            str.setText(player.getStrength()+"");
            dex.setText(player.getDexterity()+"");
            cons.setText(player.getConstitution()+"");
            intel.setText(player.getIntelligence()+"");
            wis.setText(player.getWisdom()+"");
            cha.setText(player.getCharisma()+"");

            strMod.setText(""+player.getMod(player.getStrength()));
            dexMod.setText(""+player.getMod(player.getDexterity()));
            consMod.setText(""+player.getMod(player.getConstitution()));
            intelMod.setText(""+player.getMod(player.getIntelligence()));
            wisMod.setText(""+player.getMod(player.getWisdom()));
            chaMod.setText(""+player.getMod(player.getCharisma()));

           // passWis.setText(""+(player.getMod(player.getWisdom())+10));

            if(player.strST){
                strSav.setText(strMod.getText());
            }
            if(player.conST){
                dexSav.setText(dexMod.getText());
            }

            for(String ability: player.abilities){
                switch(ability.toLowerCase()){
                    case "acrobatics":
                        acrRb.setSelected(true);
                        acrF.setText(dexMod.getText());
                        break;
                    case "animal handling":
                        aniHandRb.setSelected(true);
                        acrF.setText(wisMod.getText());
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
                    case "performance":
                        performRb.setSelected(true);
                        performF.setText(chaMod.getText());
                        break;
                    case "persuasion":
                        persRb.setSelected(true);
                        persF.setText(chaMod.getText());
                        break;
                    case "religion":
                        relgRb.setSelected(true);
                        relgF.setText(intelMod.getText());
                        break;
                    case "slight of hand":
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

        }else{
            /*
            todo 3.5 variable set up
             */
        }
    }

    public BorderPane getSpellSheet() {
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

        spellSheet.setLeft(new VBox(cantrips,spellLv1,spellLv2));
        spellSheet.setCenter(new VBox(spellLv3, spellLv4, spellLv5));
        spellSheet.setLeft(new VBox(spellLv6, spellLv7, spellLv8, spellLv9));
        return spellSheet;
    }

    public ArrayList<String> toPrint(){
        return null;
    }

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Scene sheetVeiw = new Scene(sheet5e());
        sheetVeiw.getStylesheets().clear();
        sheetVeiw.getStylesheets().add("SheetFive.css");
        primaryStage.setMinWidth(970);
        primaryStage.setMaxWidth(970);
        primaryStage.setScene(sheetVeiw);
        primaryStage.show();
    }
}
