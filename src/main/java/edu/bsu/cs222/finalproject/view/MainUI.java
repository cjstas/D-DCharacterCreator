package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.*;
import edu.bsu.cs222.finalproject.functionality.Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class MainUI extends Application {

    private CharacterSheets sheets;
    private BorderPane mainLayout;
    private Character player;
    private Button buildStartSheetButton;
    private Stage primaryStage;
    private String preferedFileLocation;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        Scene root = new Scene(presetupPane());
        this.primaryStage.setScene(root);
        this.primaryStage.show();

    }

    private VBox presetupPane(){
        VBox presetup = new VBox();

        TextField name = new TextField();
        ChoiceBox<String> races = new ChoiceBox();
        races.setItems(InfoHolding.racesArray());
        ChoiceBox<String> classes = new ChoiceBox();
        classes.setItems(InfoHolding.classesArray());
        TextField level = new TextField();
        ChoiceBox<String> alignmentG_E = new ChoiceBox();
        alignmentG_E.setItems(InfoHolding.alignmentG_EArray());
        ChoiceBox<String> alignmentL_U = new ChoiceBox();
        alignmentL_U.setItems(InfoHolding.alignmentL_UArray());
        TextField age = new TextField();
        age.setPrefColumnCount(4);
        Label warn = new Label("Please don't leave any field empty");

        buildStartSheetButton = new Button("Build Sheet");
        presetup.getChildren().addAll(
                new HBox(new Label("Name"), name),
                new HBox(new Label("Age"), age),
                new HBox(new Label("Race"), races),
                new HBox(new Label("Class"), classes),
                new HBox(new Label("Level"), level),
                new Label("Alignment"),
                new HBox(alignmentL_U, alignmentG_E),
                buildStartSheetButton);

        buildStartSheetButton.setOnAction(event -> {
            initPlayer(classes.getValue());
            player.CharacterName = name.getText();
            int safeLevel = checkLevel(Integer.parseInt(level.getText().trim()));
            player.level = safeLevel;
            player.setRace(races.getValue());
            player.setClassType(classes.getValue());
            player.setAlignment(alignmentL_U.getValue() + " " + alignmentG_E.getValue());
            primaryStage.setScene(setSheetScene());
        });

        return presetup;
    }

    private int checkLevel(int level) {
        if(level>20){
            level = 20;
        } else if(level<1){
            level = 1;
        }
        return level;
    }

    private void initPlayer(String classType) {
        switch (classType.toLowerCase()){
            case "barbarian":
                player = new Barbarian();
                break;
            case "bard":
                player = new Bard();
                break;
            case "cleric":
                player = new Cleric();
                break;
            case "druid":
                player = new Druid();
                break;
            case "fighter":
                player = new Fighter();
                break;
            case "monk":
                player = new Monk();
                break;
            case "paladin":
                player = new Paladin();
                break;
            case "ranger":
                player = new Ranger();
                break;
            case "rogue":
                player = new Rogue();
                break;
            case "sorcerer":
                player = new Sourcerer();
                break;
            case "warlock":
                player = new Warlock();
                break;
            case "wizard":
               player = new Wizard();
                break;

        }
    }

    private Scene setSheetScene() {
        mainLayout = new BorderPane();
        sheets  = new CharacterSheets();
        mainLayout.setCenter(sheets.setSheet());
        mainLayout.setTop(basicInfo());
        Scene sheetScene = new Scene(mainLayout);
        mainLayout.setLeft(setOptionPane());
        sheetScene.getStylesheets().clear();
        sheetScene.getStylesheets().add("SheetFive.css");
        this.primaryStage.setMaxWidth(1200);

        return sheetScene;
    }

    private HBox basicInfo() {
        //todo make readable
        return new HBox(new Label("Name: "),new Label(player.CharacterName+"  "),
                new Label("Race: "),new Label(player.race+"  "),
                /*new Label("age "),new Label(),*/
                new Label("Class: "),new Label(player.classType+"  "),
                new Label("Level: "),new Label(player.level+"  "),
                new Label("Alignment: "),new Label(player.alignment));
    }

    private VBox setOptionPane() {
        VBox controlLayout = new VBox();
        Button randomStatsButt = new Button("Random Stats \nRoll");
        Button eliteArrayButt = new Button("Use elite \nArray");
        Button standardArrayButt = new Button("Use Standard \nArray");
        Button dunceArrayButt = new Button("Use non-elite \nArray");
        Button returnToCharacterSheet = new Button("Return to character sheet");
        Button spellSearch = new Button("Spell Look Up");
        Button ruleSearch = new Button("Basic Rules");
        Button monsterSearch = new Button("Official Moster Search");
        Button homeBrewSearch = new Button("Home Brew search");
        Button generateBackground = new Button("Generate Background");
        Button editSpellSheet = new Button("Edit Spell\nSheet");
        Button toPDF = new Button("create PDF");



        /*todo make the array populator function properly
         * currently - failing to fill with out screen rewrite
         * working means it will out put on the sheet in the scores section*/
        StatArrayPopulater statPop = new StatArrayPopulater(player);

        returnToCharacterSheet.setOnAction(event -> {
            mainLayout.setCenter(sheets.setSheet());
            sheets.populateSheet(player);
            controlLayout.getChildren().add(6, editSpellSheet);
            controlLayout.getChildren().remove(returnToCharacterSheet);
        });
        editSpellSheet.setOnAction(event -> {
            mainLayout.setCenter(sheets.getSpellSheet());
            controlLayout.getChildren().add(6, returnToCharacterSheet);
            controlLayout.getChildren().remove(editSpellSheet);
        });

        randomStatsButt.setOnAction(event-> {
            int[] stats = statPop.rollRandomStat();
            player.strength=stats[0];
            player.dexterity=stats[1];
            player.constitution=stats[2];
            player.intelligence=stats[3];
            player.wisdom=stats[4];
            player.charisma=stats[5];
            sheets.populateSheet(player);
        });
        standardArrayButt.setOnAction(event -> {
            statPop.arrayFillPromt(InfoHolding.standardArray );
            this.player = statPop.returnPlayer();
            mainLayout.setCenter(sheets.setSheet());
            sheets.populateSheet(player);
        });
        eliteArrayButt.setOnAction(event -> {
            statPop.arrayFillPromt(InfoHolding.eliteArray);
            this.player = statPop.returnPlayer();
            mainLayout.setCenter(sheets.setSheet());
            sheets.populateSheet(player);
        });
        dunceArrayButt.setOnAction(event -> {
            statPop.arrayFillPromt(InfoHolding.dunceArray);
            this.player = statPop.returnPlayer();
            mainLayout.setCenter(sheets.setSheet());
            sheets.populateSheet(player);
        });

        spellSearch.setOnAction(event -> webview(URLDeterminer("spell")));
        ruleSearch.setOnAction(event -> webview(URLDeterminer("srd")));
        homeBrewSearch.setOnAction(event -> webview(URLDeterminer("wikia")));
        monsterSearch.setOnAction(event -> webview(URLDeterminer("monsters")));

        controlLayout.getChildren().addAll(new Label("Sheet Control buttons"),randomStatsButt,standardArrayButt,eliteArrayButt,dunceArrayButt,editSpellSheet);
        controlLayout.getChildren().addAll(new Label("Searching Buttons"), spellSearch, ruleSearch, homeBrewSearch, monsterSearch);
        return controlLayout;
    }

    private String URLDeterminer(String key) {
        switch (key) {
          case "spell":
            return "http://5e.d20srd.org/indexes/spells.htm";
          case "wikia":
            return "https://www.dandwiki.com/wiki/5e_Homebrew";
          case "monsters":
            return "https://www.dandwiki.com/wiki/5e_SRD:Monsters";
          case "srd":
            return "http://5e.d20srd.org/";
          case "selected":
            return "http://5e.d20srd.org/srd/spellLists/"
                + player.classType.toLowerCase()
                + "Spells.htm";
        }
        return key;
    }

    private void webview(String siteToDisplay) {
        Stage webStage = new Stage();
        WebView webPage = new WebView();
        Button spellByClass = new Button("sorted by Class");
        BorderPane holder = new BorderPane();

        webPage.getEngine().load(siteToDisplay);
        holder.setCenter(webPage);

        if(siteToDisplay.equals("http://5e.d20srd.org/indexes/spells.htm") || siteToDisplay.equals("http://www.d20srd.org/indexes/spells.htm")){
            holder.setBottom(spellByClass);
        }

        spellByClass.setOnAction(event -> {
            webview(URLDeterminer("selected"));
            webStage.close();
        });
        webStage.setTitle(webPage.getEngine().getTitle());
        webStage.setScene(new Scene(holder));
        webStage.show();
    }

    private void toFinalPdf(){
        PDFCreation pdf = new PDFCreation(player, preferedFileLocation);
        pdf.fillEmptySheet();
    }

}
