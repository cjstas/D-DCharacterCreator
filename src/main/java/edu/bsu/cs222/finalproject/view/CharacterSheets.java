package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Character;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/*
    this is a mess because of just the sheer amount of things on the page
    after it is all done in this manner it will be refactored for readability and usage in the
*/


public class CharacterSheets extends Application {

    private Character player;
    private TextField str, dex, cons, intel, wis, cha, passWis,
            strMod, dexMod, consMod, intelMod, wisMod, chaMod,
            strSav, dexSav, consSav, intelSav, wisSav, chaSav,
            insp, profBonus, AC,init, speed, hitMax, currHP, tempHP, HD, DS, atkWeapons, pp, gp, sp, cp, equip;
    private TextArea languages, pers, ideal, bon, flaw, featAndTraits;


    public Pane setSheet(String sheet) {
        if(sheet.equals("3.5")){
            return sheet35();
        }else{
            return sheet5e();
        }
    }

    private Pane sheet35() {
        Pane sheet35 = new BorderPane();

        return sheet35;
    }

    private Pane sheet5e() {
        Pane sheet5e = new BorderPane();
         str = new TextField();
         dex = new TextField();
         cons = new TextField();
         intel = new TextField();
         wis = new TextField();
         cha = new TextField();
         passWis = new TextField();
         strMod = new TextField();
         dexMod = new TextField();
         consMod = new TextField();
         intelMod = new TextField();
         wisMod = new TextField();
         chaMod = new TextField();
         strSav = new TextField();
         dexSav = new TextField();
         consSav = new TextField();
         intelSav = new TextField();
         wisSav = new TextField();
         chaSav = new TextField();
         insp = new TextField();
         profBonus = new TextField();
         AC = new TextField();
         init = new TextField();
         speed = new TextField();
         hitMax = new TextField();
         currHP = new TextField();
         tempHP = new TextField();
         HD = new TextField();
         DS = new TextField();
         atkWeapons = new TextField();
         pp = new TextField();
         gp = new TextField();
         sp = new TextField();
         cp = new TextField();
         equip = new TextField();
        languages = new TextArea();
        pers = new TextArea();
        ideal = new TextArea();
        bon = new TextArea();
        flaw = new TextArea();
        featAndTraits = new TextArea();
        VBox stats = new VBox(
                new Label("str"),str,new Label("str modifier"),strMod,
                new Label("dex"),dex,new Label("dex modifier"),dexMod,
                new Label("con"),cons, new Label("Con modifier"),consMod,
                new Label("int"),intel, new Label("int modifier"),intelMod,
                new Label("wis"),wis,new Label("wis modifier"),wisMod,
                new Label("cha"),cha,new Label("cha modifier"),chaMod);
        VBox skills = new VBox(
                new HBox(insp,new Label("Inspiration")),
                new HBox(profBonus,new Label("Proficiency Bonus")),
                new VBox(new HBox(strSav, new Label("strength")),
                        new HBox(dexSav, new Label("dexterity")),
                        new HBox(consSav, new Label("constitution")),
                        new HBox(intelSav, new Label("intelligence")),
                        new HBox(wisSav, new Label("wisdom")),
                        new HBox(chaSav, new Label("charisma")),
                        new HBox(new Label("Saving Throws"))),
                skillBox());
        HBox topLeft = new HBox(stats, skills);
        VBox left = new VBox(
                topLeft,
                new HBox(new Label("passive Wis"),passWis),
                        new Label("languages"),languages);
        VBox center = new VBox(
                new HBox(
                        new VBox(new Label("Armor Class "), AC),
                        new VBox(new Label("Initiative"),init),
                        new VBox(new Label(" Speed"),speed)),
                new Label("max HP"), hitMax,
                new Label("current HP"),currHP,
                new Label("temp HP"), tempHP,
                new HBox(new VBox(new Label("hit die"),HD),
                        new VBox(new Label("Death Saves"), DS)),
                atkWeapons,
                new HBox(new VBox(new HBox(new Label("pp"),pp),new HBox(new Label("gp"),gp),new HBox(new Label("sp"),sp),new HBox(new Label("cp"),cp)),equip));
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

    private VBox skillBox() {

        RadioButton acr = new RadioButton(),
                aniHand = new RadioButton(),
                arcan = new RadioButton(),
                athl = new RadioButton(),
                dec = new RadioButton(),
                hist = new RadioButton(),
                ins = new RadioButton(),
                intim = new RadioButton(),
                inves = new RadioButton(),
                med = new RadioButton(),
                nat = new RadioButton(),
                percep = new RadioButton(),
                perform = new RadioButton(),
                pers = new RadioButton(),
                relg = new RadioButton(),
                sliOfHand = new RadioButton(),
                steal = new RadioButton(),
                surv = new RadioButton();

        TextField acrF = new TextField(),
                aniHandF = new TextField(),
                arcanF = new TextField(),
                athlF = new TextField(),
                decF = new TextField(),
                histF = new TextField(),
                insF = new TextField(),
                intimF = new TextField(),
                invesF = new TextField(),
                medF = new TextField(),
                natF = new TextField(),
                percepF = new TextField(),
                performF = new TextField(),
                persF = new TextField(),
                relgF = new TextField(),
                sliOfHandF = new TextField(),
                stealF = new TextField(),
                survF = new TextField();
        setUpTextFeilds();
        VBox skillBox = new VBox(
                new HBox( acr, acrF, new Label("Acrobatics(dex)")),
                new HBox(aniHand, aniHandF, new Label("Animal Handling(wis)")),
                new HBox(arcan, arcanF, new Label("Arcana(int)")),
                new HBox(athl, athlF, new Label("Athletics(str)")),
                new HBox(dec, decF, new Label("Deception(cha)")),
                new HBox(hist, histF,new Label("History(int)")),
                new HBox(ins, insF, new Label("Insight(wis)")),
                new HBox(intim, intimF, new Label("Intimidation(cha)")),
                new HBox(inves, invesF, new Label("Investigation(int)")),
                new HBox(med, medF, new Label("Medicine(wis)")),
                new HBox(nat, natF, new Label("Nature(int)")),
                new HBox(percep, percepF, new Label("Perception(wis)")),
                new HBox(perform, performF, new Label("Performance(cha)")),
                new HBox(pers, persF, new Label("Persuasion(cha)")),
                new HBox(relg, relgF, new Label("Religion(int)")),
                new HBox(sliOfHand, sliOfHandF, new Label("Sleight of hand(dex)")),
                new HBox(steal, stealF, new Label("Stealth(dex)")),
                new HBox(surv, survF, new Label("Survival(wis)"))
        );

        return skillBox;
    }

    private void setUpTextFeilds() {
        str.setPrefColumnCount(4);
        dex.setPrefColumnCount(4);
        cons.setPrefColumnCount(4);
        intel.setPrefColumnCount(4);
        wis.setPrefColumnCount(4);
        cha.setPrefColumnCount(4);
        passWis.setPrefColumnCount(4);
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
        atkWeapons.setPrefColumnCount(4);
        pp.setPrefColumnCount(4);
        gp.setPrefColumnCount(4);
        sp.setPrefColumnCount(4);
        cp.setPrefColumnCount(4);
        equip.setPrefColumnCount(4);

        str.setAlignment(Pos.CENTER);
        dex.setAlignment(Pos.CENTER);
        cons.setAlignment(Pos.CENTER);
        intel.setAlignment(Pos.CENTER);
        wis.setAlignment(Pos.CENTER);
        cha.setAlignment(Pos.CENTER);
        passWis.setAlignment(Pos.CENTER);
        strMod.setAlignment(Pos.CENTER);
        dexMod.setAlignment(Pos.CENTER);
        consMod.setAlignment(Pos.CENTER);
        intelMod.setAlignment(Pos.CENTER);
        wisMod.setAlignment(Pos.CENTER);
        chaMod.setAlignment(Pos.CENTER);
        strSav.setAlignment(Pos.CENTER);
        dexSav.setAlignment(Pos.CENTER);
        consSav.setAlignment(Pos.CENTER);
        intelSav.setAlignment(Pos.CENTER);
        wisSav.setAlignment(Pos.CENTER);
        chaSav.setAlignment(Pos.CENTER);
        insp.setAlignment(Pos.CENTER);
        profBonus.setAlignment(Pos.CENTER);
        AC.setAlignment(Pos.CENTER);
        init.setAlignment(Pos.CENTER);
        speed.setAlignment(Pos.CENTER);
        hitMax.setAlignment(Pos.CENTER);
        currHP.setAlignment(Pos.CENTER);
        tempHP.setAlignment(Pos.CENTER);
        HD.setAlignment(Pos.CENTER);
        DS.setAlignment(Pos.CENTER);
        atkWeapons.setAlignment(Pos.CENTER);
        pp.setAlignment(Pos.CENTER);
        gp.setAlignment(Pos.CENTER);
        sp.setAlignment(Pos.CENTER);
        cp.setAlignment(Pos.CENTER);
        equip.setAlignment(Pos.CENTER);
    }

    public void updateSheet(Character player, String sheetNumber){
        this.player = player;
        populateSheet(sheetNumber);
    }

    private void populateSheet(String sheetNumber) {
        if("5".equals(sheetNumber)){
            str.setText(""+player.getStats());
            dex.setText(""+player.getStats());
            cons.setText(""+player.getStats());
            intel.setText(""+player.getStats());
            wis.setText(""+player.getStats());
            cha.setText(""+player.getStats());

            strMod.setText(""+player.getMod(player.getStats()));
            dexMod.setText(""+player.getMod(player.getStats()));
            consMod.setText(""+player.getMod(player.getStats()));
            intelMod.setText(""+player.getMod(player.getStats()));
            wisMod.setText(""+player.getMod(player.getStats()));
            chaMod.setText(""+player.getMod(player.getStats()));

        }else{

        }
    }

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(sheet5e()));
        primaryStage.show();
    }
}
