package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Character;
import javafx.application.Application;
import javafx.scene.Node;
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

    Character player;


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
        TextField str = new TextField(), dex = new TextField(), cons = new TextField(), intel = new TextField(), wis = new TextField(), cha = new TextField(), passWis = new TextField();
        TextArea languages = new TextArea();
        TextField strMod = new TextField(), dexMod = new TextField(), consMod = new TextField(), intelMod = new TextField(), wisMod = new TextField(), chaMod = new TextField();
        TextField strSav = new TextField(), dexSav = new TextField(), consSav = new TextField(), intelSav = new TextField(), wisSav = new TextField(), chaSav = new TextField();
        Label AC, init, speed, hitmax, currHP, tempHP, HD, DS, atkWeapons, pp, gp, cp, equip;
        Label pers, ideal, bon, flaw, featAtraits;
        TextField insp = new TextField(), profBonus = new TextField();
        VBox money = new VBox();
        VBox stats = new VBox(new Label("str"),str,new Label("str modifier"),strMod,new Label("dex"),dex,new Label("dex modifier"),dexMod,new Label("con"),cons, new Label("Con modifier"),consMod,new Label("int"),intel, new Label("int modifier"),intelMod, new Label("wis"),wis,new Label("wis modifier"),wisMod,new Label("cha"),cha,new Label("cha modifier"),chaMod);
        VBox skills = new VBox(new HBox(insp,new Label("Inspiration")), new HBox(profBonus,new Label("Proficiency Bonus")),
                new VBox(
                        new HBox(strSav, new Label("strength")),
                        new HBox(dexSav, new Label("dexterity")),
                        new HBox(consSav, new Label("constitution")),
                        new HBox(intelSav, new Label("intelligence")),
                        new HBox(wisSav, new Label("wisdom")),
                        new HBox(chaSav, new Label("charisma")),
                        new HBox(new Label("Saving Throws"))),
            skillBox());

        HBox topRight = new HBox(stats, skills);
        HBox ACbox, HDbox,equipment;
        VBox right = new VBox(topRight,new HBox(new Label("passive Wis"),passWis),new Label("languages"),languages);
        VBox center = new VBox();
        VBox left = new VBox();
        ((BorderPane) sheet5e).setRight(right);
        ((BorderPane) sheet5e).setCenter(center);
        ((BorderPane) sheet5e).setLeft(left);
        return sheet5e;
    }

    private VBox skillBox() {
        VBox skillBox = new VBox(
                new HBox(new RadioButton(),new TextField(),new Label("Acrobatics(dex)")),
                new HBox(new RadioButton(),new TextField(),new Label("Animal Handling(wis)")),
                new HBox(new RadioButton(),new TextField(),new Label("Arcana(int)")),
                new HBox(new RadioButton(),new TextField(),new Label("Athletics(str)")),
                new HBox(new RadioButton(),new TextField(),new Label("Deception(cha)")),
                new HBox(new RadioButton(),new TextField(),new Label("History(int)")),
                new HBox(new RadioButton(),new TextField(),new Label("Insight(wis)")),
                new HBox(new RadioButton(),new TextField(),new Label("Intimidation(cha)")),
                new HBox(new RadioButton(),new TextField(),new Label("Investigation(int)")),
                new HBox(new RadioButton(),new TextField(),new Label("Medicine(wis)")),
                new HBox(new RadioButton(),new TextField(),new Label("Nature(int)")),
                new HBox(new RadioButton(),new TextField(),new Label("Perception(wis)")),
                new HBox(new RadioButton(),new TextField(),new Label("Performance(cha)")),
                new HBox(new RadioButton(),new TextField(),new Label("Persuasion(cha)")),
                new HBox(new RadioButton(),new TextField(),new Label("Religion(int)")),
                new HBox(new RadioButton(),new TextField(),new Label("Sleight of hand(dex)")),
                new HBox(new RadioButton(),new TextField(),new Label("Stealth(dex)")),
                new HBox(new RadioButton(),new TextField(),new Label("Survival(wis)"))
        );

        return skillBox;
    }

    public void updateSheet(Character player, String sheetNumber){
        this.player = player;
        populateSheet(sheetNumber);
    }

    private void populateSheet(String sheetNumber) {

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
