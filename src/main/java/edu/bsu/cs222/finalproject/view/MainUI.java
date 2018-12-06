package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.*;
import edu.bsu.cs222.finalproject.functionality.Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;


public class MainUI extends Application {

    private CharacterSheets sheets;
    private BorderPane mainLayout;
    private Character player;
    private Stage primaryStage;

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
        ChoiceBox<String> races = new ChoiceBox<>();
        races.setItems(InfoHolding.racesArray());
        ChoiceBox<String> classes = new ChoiceBox<>();
        classes.setItems(InfoHolding.classesArray());
        TextField level = new TextField();
        ChoiceBox<String> alignmentG_E = new ChoiceBox<>();
        alignmentG_E.setItems(InfoHolding.alignmentG_EArray());
        ChoiceBox<String> alignmentL_U = new ChoiceBox<>();
        alignmentL_U.setItems(InfoHolding.alignmentL_UArray());
        Button buildStartSheetButton = new Button("Build Sheet");
        Button buildRandomCharacter = new Button("Random Character");

        presetup.getChildren().addAll(
                new HBox(new Label("Name"), name),
                new HBox(new Label("Race"), races),
                new HBox(new Label("Class"), classes),
                new HBox(new Label("Level"), level),
                new Label("Alignment"),
                new HBox(alignmentL_U, alignmentG_E),
                new HBox(buildStartSheetButton, buildRandomCharacter));

        buildRandomCharacter.setOnAction(event ->primaryStage.setScene(NPCSetupScreen()));

        buildStartSheetButton.setOnAction(event -> {
                initPlayer(classes.getValue());
                player.CharacterName=name.getText();
                player.level= checkLevel(Integer.parseInt(level.getText()));
                player.race = races.getValue();
                player.classType = classes.getValue();
                player.alignment = alignmentL_U.getValue() + " " + alignmentG_E.getValue();
                player.setBackgroundTrait(InfoHolding.backgroundFinder(player.classType.toLowerCase()));
                primaryStage.setScene(setSheetScene());
        });

        return presetup;
    }

    private Scene NPCSetupScreen() {
        GridPane center = new GridPane();
        Label name = new Label("set Name"),
                race = new Label("set race"),
                classType = new Label("set class"),
                level = new Label("set level"),
                alignment = new Label("set alignment"),
                stats = new Label("stat Array");
        CheckBox randoRace = new CheckBox("random"),
                randoClassType = new CheckBox("random"),
                randoLevel  = new CheckBox("random"),
                randoAlignmment = new CheckBox("random"),
                randoStat = new CheckBox("random"),
                randoAll = new CheckBox("randomize everything");
        ChoiceBox<String> classes = new ChoiceBox<>();
        classes.setItems(InfoHolding.classesArray());
        ChoiceBox<String> races = new ChoiceBox<>();
        races.setItems(InfoHolding.racesArray());
        ChoiceBox<String> alignmentG_E = new ChoiceBox<>();
        alignmentG_E.setItems(InfoHolding.alignmentG_EArray());
        ChoiceBox<String> alignmentL_U = new ChoiceBox<>();
        alignmentL_U.setItems(InfoHolding.alignmentL_UArray());
        ChoiceBox<String> statArrays = new ChoiceBox<>();
        statArrays.setItems(InfoHolding.statArrayArray());
        TextField levelField = new TextField(), nameFeild = new TextField();
        Button createCharacter = new Button("To The Sheet");

        randoAll.setOnAction(event -> {
            if(randoAll.isSelected()){
                randoClassType.setSelected(true);
                randoRace.setSelected(true);
                randoAlignmment.setSelected(true);
                randoLevel.setSelected(true);
                randoStat.setSelected(true);
            }else{
                randoClassType.setSelected(false);
                randoRace.setSelected(false);
                randoAlignmment.setSelected(false);
                randoLevel.setSelected(false);
                randoStat.setSelected(false);
            }
        });

        randoAlignmment.setOnAction(event ->{
            if(!randoAlignmment.isSelected()){
                randoAll.setSelected(false);
            }
        });
        randoClassType.setOnAction(event -> {
            if(!randoClassType.isSelected()){
                randoAll.setSelected(false);
            }
        });
        randoLevel.setOnAction(event -> {
            if(!randoLevel.isSelected()){
                randoAll.setSelected(false);
            }
        });
        randoStat.setOnAction(event -> {
            if(!randoStat.isSelected()){
                randoAll.setSelected(false);
            }
        });
        randoRace.setOnAction(event ->{
            if(!randoRace.isSelected()){
                randoAll.setSelected(false);
            }
        });

        createCharacter.setOnAction(event -> {

            if(randoClassType.isSelected()){
                String hold =InfoHolding.giveRandomOption(InfoHolding.classesArray());
                initPlayer(hold);
                player.classType = hold;
            }else{
                initPlayer(classes.getValue());
                player.classType = classes.getValue();
            }
            player.CharacterName = nameFeild.getText();
            if(randoRace.isSelected()){
                player.race = InfoHolding.giveRandomOption(InfoHolding.racesArray());
            }else{
                player.race = races.getValue();
            }
            if(randoLevel.isSelected()){
                player.level = DiceRoll.D20();
            }else{
                player.level= checkLevel(Integer.parseInt(levelField.getText()));
            }
            if(randoAlignmment.isSelected()){
                player.alignment = InfoHolding.giveRandomOption(InfoHolding.alignmentL_UArray())+" "+InfoHolding.giveRandomOption(InfoHolding.alignmentG_EArray());
            }else{
                player.alignment = alignmentL_U.getValue() + " " + alignmentG_E.getValue();
            }
            StatArrayPopulater statPop = new StatArrayPopulater(player);
            if(randoStat.isSelected()){
                int[] randStats = statPop.rollRandomStat();
                player.strength=randStats[0];
                player.dexterity=randStats[1];
                player.constitution=randStats[2];
                player.intelligence=randStats[3];
                player.wisdom=randStats[4];
                player.charisma=randStats[5];
            }else{
                int [] randStats = statPop.randomOrder(statArrays.getValue());
                player.strength=randStats[0];
                player.dexterity=randStats[1];
                player.constitution=randStats[2];
                player.intelligence=randStats[3];
                player.wisdom=randStats[4];
                player.charisma=randStats[5];
            }

            player.setBackgroundTrait(InfoHolding.backgroundFinder(player.classType.toLowerCase()));
            primaryStage.setScene(setSheetScene());

        });
        center.addColumn(0,new Label(), name, race, classType, level, alignment, stats);//label
        center.addColumn(1, randoAll, new Label(" "),randoRace, randoClassType, randoLevel, randoAlignmment, randoStat);//checkBox
        center.addColumn(2, new Label(),nameFeild,races, classes, levelField, new HBox(alignmentL_U, alignmentG_E), statArrays);//enteredData

        BorderPane layout = new BorderPane(center);
        layout.setBottom(createCharacter);
        return new Scene(layout);
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
        sheets.populateSheet(player);
        mainLayout.setTop(basicInfo());
        mainLayout.setLeft(setOptionPane());
        Scene sheetScene = new Scene(mainLayout);
        sheetScene.getStylesheets().clear();
        sheetScene.getStylesheets().add("SheetFive.css");
        this.primaryStage.setMaxWidth(1200);

        return sheetScene;
    }

    private HBox basicInfo() {
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
        Button editSpellSheet = new Button("Edit Spell\nSheet");
        Button toPDF = new Button("create PDF");
        Button playerFill = new Button("Enter in Stats");

        StatArrayPopulater statPop = new StatArrayPopulater(player);

        returnToCharacterSheet.setOnAction(event -> {
            mainLayout.setCenter(sheets.setSheet());
            sheets.populateSheet(player);
            player = sheets.grabSpells(player);
            controlLayout.getChildren().add(6, editSpellSheet);
            controlLayout.getChildren().remove(returnToCharacterSheet);
        });

        editSpellSheet.setOnAction(event -> {
            mainLayout.setCenter(sheets.getSpellSheet());
            sheets.populateSpells(player);
            controlLayout.getChildren().add(6, returnToCharacterSheet);
            controlLayout.getChildren().remove(editSpellSheet);
        });

        playerFill.setOnAction(event ->{
            int[] statsArray = sheets.grabEnteredStats();
            player.strength = statsArray[0];
            player.dexterity = statsArray[1];
            player.constitution = statsArray[2];
            player.intelligence = statsArray[3];
            player.wisdom = statsArray[4];
            player.charisma = statsArray[5];
            sheets.populateSheet(player);
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
            sheets.populateSheet(player);
            mainLayout.setCenter(sheets.setSheet());
        });
        eliteArrayButt.setOnAction(event -> {
            statPop.arrayFillPromt(InfoHolding.eliteArray);
            this.player = statPop.returnPlayer();
            sheets.populateSheet(player);
            mainLayout.setCenter(sheets.setSheet());
        });
        dunceArrayButt.setOnAction(event -> {
            statPop.arrayFillPromt(InfoHolding.dunceArray);
            this.player = statPop.returnPlayer();
            sheets.populateSheet(player);
            mainLayout.setCenter(sheets.setSheet());
        });

        spellSearch.setOnAction(event -> webview(URLDeterminer("spell")));
        ruleSearch.setOnAction(event -> webview(URLDeterminer("srd")));
        homeBrewSearch.setOnAction(event -> webview(URLDeterminer("wikia")));
        monsterSearch.setOnAction(event -> webview(URLDeterminer("monsters")));
        toPDF.setOnAction(event ->{
            PDFCreation pdf = new PDFCreation(player);
            sheets.toFinalPdf(pdf);
        });

        controlLayout.getChildren().addAll(
                new Label("Sheet Control buttons"),
                randomStatsButt,
                standardArrayButt,
                eliteArrayButt,
                dunceArrayButt,
                playerFill,
                editSpellSheet);
        controlLayout.getChildren().addAll(
                new Label("Searching Buttons"),
                spellSearch,
                ruleSearch,
                homeBrewSearch,
                monsterSearch,
                toPDF);
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

        if(siteToDisplay.equals("http://5e.d20srd.org/indexes/spells.htm")){
            holder.setBottom(spellByClass);
        }

    spellByClass.setOnAction(
        event -> {
          String url = URLDeterminer("selected");
          if (CheckURL(url)) {
            webview(url);
            webStage.close();
          } else {
              noSpellForClass(player.classType);
          }
        });

        webStage.setTitle(webPage.getEngine().getTitle());
        webStage.setScene(new Scene(holder));
        webStage.show();
    }

    private void noSpellForClass(String classType) {
        Stage warningStage = new Stage();
        warningStage.setScene(new Scene(new VBox(new Label(
                "Sorry the "+classType+" class \ndoesn't have any Spell casting ability"))));
    }

    private boolean CheckURL(String selected) {
      try {
          URL testURL = new URL(selected);
          InputStream testIn = testURL.openStream();
      } catch (Exception e) {
          return false;
      }

      return true;
  }
}
