package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Barbarian;
import edu.bsu.cs222.finalproject.functionality.Character;
import edu.bsu.cs222.finalproject.functionality.DiceRoll;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    private CharacterSheets sheets;
    private String sheetNumber, styleSheet;
    private BorderPane mainLayout;
    private Character player;
    private Button createMultiClass, submit, buildStartSheetButton, editSpellSheet;
    private Stage primaryStage;



    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        Scene root = new Scene(startUpScreen());
        this.primaryStage.setScene(root);
        this.primaryStage.onCloseRequestProperty().setValue(event -> {
            setOptionStage().close();
        });
        this.primaryStage.show();

    }

    private VBox startUpScreen(){
        Button to35eBuilder = new Button("Build A 3.5 Character");
        Button to5eBuilder = new Button("Build a 5e Character");
        Button toNPCCreation = new Button("Random Character");

        to5eBuilder.setOnAction(e ->{
            primaryStage.setScene(new Scene(presetupPane()));
            sheetNumber = "5";
            styleSheet = "SheetFive.css";
        });
        to35eBuilder.setOnAction(e->{
            primaryStage.setScene(new Scene(new HBox(
                                new Label("Sorry for the Inconvenience," +
                                        "\nBut the 3.5 character Sheet is under Construction" +
                                        "\nHope Your Gaming time is fun!!"))));
            sheetNumber = "3.5";
            styleSheet = "SheetTreeFive.css";
        });
        toNPCCreation.setOnAction(e -> primaryStage.setScene(
                new Scene(new HBox(
                                new Label("Sorry for the Inconvenience," +
                                        "\nBut the NPC Creation section is under Construction" +
                                        "\nHappy Rolling!!")))));
        return new VBox(to35eBuilder, to5eBuilder, toNPCCreation);
    }

    private VBox presetupPane(){
        VBox presetup = new VBox();

        ToggleButton isMulticlassed = new RadioButton("Multiclassed");
        TextField name = new TextFieldCustom();
        ChoiceBox<String> races = new ChoiceBox();
        races.setItems(InfoHolding.racesArray());
        ChoiceBox<String> classes = new ChoiceBox();
        classes.setItems(InfoHolding.classesArray());
        TextField level = new TextFieldCustom();
        ChoiceBox<String> alignmentG_E = new ChoiceBox();
        alignmentG_E.setItems(InfoHolding.alignmentG_EArray());
        ChoiceBox<String> alignmentL_U = new ChoiceBox();
        alignmentL_U.setItems(InfoHolding.alignmentL_UArray());
        TextField age = new TextFieldCustom();
        age.setPrefColumnCount(4);

        ChoiceBox<String> classes2 = new ChoiceBox();
        classes2.setItems(InfoHolding.classesArray());
        TextField level2 = new TextFieldCustom();
        TextField numOfMultiClasses = new TextFieldCustom();
        VBox multi = new VBox();
        Label warn = new Label("Please don't leave field empty");
        Label lv2 = new Label("lvl.");
        Label class2 = new Label("2nd Class");
        createMultiClass = new Button();
        buildStartSheetButton = new Button("Build Sheet");
        submit = new Button("submit");

        presetup.getChildren().addAll(
                new HBox(new Label("Name"), name),
                new HBox(new Label("Age"), age),
                new HBox(new Label("Race"), races),
                new HBox(new Label("Class"), classes),
                new HBox(new Label("Level"), level),
                multi,
                new Label("Alignment"),
                new HBox(alignmentL_U, alignmentG_E),
                buildStartSheetButton
        );

        isMulticlassed.setOnAction(event -> {
            if(isMulticlassed.isSelected()) {
                multi.getChildren().addAll(new Label("Number of Classes"),new HBox(numOfMultiClasses, submit));
            }else{
                if(presetup.getChildren().contains(level2)){
                    multi.getChildren().clear();
                }
            }
        });
        submit.setOnAction(event-> {
            if(!((TextFieldCustom) numOfMultiClasses).isEmpty()){
                int numOfMC = Integer.parseInt(numOfMultiClasses.getText());
                for(int i = 0; i< numOfMC; i++){
                    multi.getChildren().addAll(new HBox(new Label("class"),class2),new HBox(new Label("level "),level2));
                }
                multi.getChildren().add(createMultiClass);
            }else{
                multi.getChildren().add(warn);
            }
        });
        createMultiClass.setOnAction(event -> {
            /*code that creates a multiclass character
             */
        });

        buildStartSheetButton.setOnAction(event ->{
            //todo implement when Character is fully functional
            if(((TextFieldCustom) name).isEmpty()|| ((TextFieldCustom) level).isEmpty()||((TextFieldCustom)age).isEmpty()){
                presetup.getChildren().add(warn);
            }else {
                initPlayer(classes.getValue());
                player.setPlayerName(name.getText());
                player.setLevel(Integer.parseInt(level.getText()));
                player.setRace(races.getValue());
                player.setClassType(classes.getValue());
                player.setAlignment(alignmentL_U.getValue() + " " + alignmentG_E.getValue());
                primaryStage.setScene(setScene());
            }
            setOptionStage().show();
            if(false/*todo code to Check Class of the Character*/){
                editSpellSheet.setVisible(true);
            }



        });

        return presetup;
    }

    private void initPlayer(String classType) {
        switch (classType.toLowerCase()){
            case "barbarian":
                player = new Barbarian(null,null, 0, null,null, null, null, 0, 0,0,0,0,0,0);
        }
    }

    private Scene setScene() {
        mainLayout = new BorderPane();
        this.sheets  = new CharacterSheets();
      //  sheets.updateSheet(player, sheetNumber);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));
        mainLayout.setTop(basicInfo());
        Scene sheetScene = new Scene(mainLayout);
        sheetScene.getStylesheets().clear();
        sheetScene.getStylesheets().add(styleSheet);
        this.primaryStage.setX(100);
        this.primaryStage.setY(0);
        this.primaryStage.setMaxWidth(970);

        return sheetScene;
    }

    private HBox basicInfo() {
        //todo make readable
        return new HBox(new Label("Name: "),new Label(player.getCharacterName()+"  "),
                new Label("Race: "),new Label(player.getRace()+"  "),
                /*new Label("age "),new Label(),*/
                new Label("Class: "),new Label(player.getClassType()+"  "),
                new Label("Level: "),new Label(player.getLevel()+"  "),
                new Label("Alignment: "),new Label(player.getAlignment()));
    }

    private Stage setOptionStage() {
        Button randomStats = new Button("Random Stats \nRoll");
        Button eliteArray = new Button("Use elite \nArray");
        Button standardArray = new Button("Use Standard \nArray");
        Button dunceArray = new Button("Use non-elite \nArray");
        editSpellSheet = new Button("Edit Spell\nSheet");

        editSpellSheet.setVisible(false);

        editSpellSheet.setOnAction(event -> primaryStage.setScene(sheets.getSpellSheet()));
        randomStats.setOnAction(e->rollRandomStat());
        standardArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        eliteArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        dunceArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        GridPane controlLayout = new GridPane();
        controlLayout.setAlignment(Pos.CENTER);
        controlLayout.addColumn(0, randomStats);

        Stage controlStage = new Stage();
        controlStage.setScene(new Scene(controlLayout));
        controlStage.setX(20);
        controlStage.setY(20);
        return controlStage;
    }

    private void rollRandomStat() {
        player.setStrength(statRoll());
        player.setDexterity(statRoll());
        player.setConstitution(statRoll());
        player.setIntelligence(statRoll());
        player.setWisdom(statRoll());
        player.setCharisma(statRoll());
        sheets.updateSheet(player, sheetNumber);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));
    }

    private int statRoll() {
        DiceRoll dr = new DiceRoll();
        return dr.D6()+dr.D6()+dr.D6();
    }
}
