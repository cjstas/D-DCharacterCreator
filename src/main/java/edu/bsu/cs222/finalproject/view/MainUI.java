package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Barbarian;
import edu.bsu.cs222.finalproject.functionality.Character;
import edu.bsu.cs222.finalproject.functionality.DiceRoll;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    private CharacterSheets sheets;
    private  String sheetNumber;
    private BorderPane mainLayout;
    private Character player;
    Button createMultiClass, submit, buildStartSheetButton;
    Stage primaryStage;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        Scene root = new Scene(startUpScreen(primaryStage));
        primaryStage.setScene(root);
        primaryStage.show();
    }

    private VBox startUpScreen(Stage primaryStage){
        Button to35eBuilder = new Button("Build A 3.5 Character");
        Button to5eBuilder = new Button("Build a 5e Character");
        Button toNPCCreation = new Button("Random Character");

        to5eBuilder.setOnAction(e ->{
            primaryStage.setScene(new Scene(presetupPane()));
            sheetNumber = "5";
        });
        to35eBuilder.setOnAction(e->{
            primaryStage.setScene(new Scene(new HBox(
                                new Label("Sorry for the Inconvenience," +
                                        "\nBut the 3.5 character Sheet is under Construction" +
                                        "\nHope Your Gaming time is fun!!"))));
            sheetNumber = "3.5";
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

        ChoiceBox<String> classes2 = new ChoiceBox();
        classes2.setItems(InfoHolding.classesArray());
        TextField level2 = new TextField();
        TextField numOfMultiClasses = new TextFieldCustom();
        VBox multi = new VBox();
        Label warn = new Label("Please don't leave field empty");
        Label lv2 = new Label("lvl.");
        Label class2 = new Label("2nd Class");
        createMultiClass = new Button();
        buildStartSheetButton = new Button("Build Sheet");
        submit = new Button("submit");


        isMulticlassed.setOnAction(event -> {
            if(isMulticlassed.isSelected()) {
                multi.getChildren().addAll(numOfMultiClasses, submit);
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
                    multi.getChildren().add(new HBox(class2, level2));
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
            initPlayer(classes.getValue());
            player.setPlayerName(name.getText());
            player.setLevel(Integer.parseInt(level.getText()));
            player.setRace(races.getValue());
            player.setClassType(classes.getValue());
            player.setAlignment(alignmentL_U.getValue()+" "+alignmentG_E.getValue());
            primaryStage.setScene(setScene());

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
        sheets.updateSheet(player, sheetNumber);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));
        return new Scene(mainLayout);
    }

    private VBox setOptionPane() {
        Button randomStats = new Button("Random Stats \nRoll");
        randomStats.setOnAction(e->rollRandomStat());
        Button standardArray = new Button("Use Standard \nArray");
        standardArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        Button eliteArray = new Button("Use elite \nArray");
        eliteArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        Button dunceArray = new Button("Use non-elite \nArray");
        dunceArray.setOnAction(event -> {
            /*code to to generate prompt to fill in using array
             */
        });
        return new VBox(randomStats,standardArray,eliteArray,dunceArray);
    }

    private void rollRandomStat() {
        player.setStats(statRoll(),statRoll(),statRoll(),statRoll(),statRoll(),statRoll());
        sheets.updateSheet(player, sheetNumber);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));
    }

    private int statRoll() {
        DiceRoll dr = new DiceRoll();
        return dr.D6()+dr.D6()+dr.D6();
    }
}
