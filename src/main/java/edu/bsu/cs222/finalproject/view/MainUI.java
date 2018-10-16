package edu.bsu.cs222.finalproject.view;

import edu.bsu.cs222.finalproject.functionality.Character;
import edu.bsu.cs222.finalproject.functionality.DiceRoll;
import javafx.application.Application;
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

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button to35eBuilder = new Button("Build A 3.5 Character");
        Button to5eBuilder = new Button("Build a 5e Character");
        Button toNPCCreation = new Button("Random Character");
        to5eBuilder.setOnAction(e -> primaryStage.setScene(setScene("5")));
        to35eBuilder.setOnAction(e->primaryStage.setScene(setScene("3.5")));
        toNPCCreation.setOnAction(null);
        Scene root = new Scene(new VBox(to35eBuilder, to5eBuilder, toNPCCreation));
        primaryStage.setScene(root);
        primaryStage.show();
    }

    private Scene setScene(String sheetNumber) {
        this.sheetNumber = sheetNumber;
        mainLayout = new BorderPane();
        this.sheets  = new CharacterSheets();
        HBox menuBox = setMenuBox();
        VBox optionsBox = setOptionBox();
        mainLayout.setTop(menuBox);
        mainLayout.setLeft(optionsBox);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));

        return new Scene(mainLayout);
    }

    private VBox setOptionBox() {
        Button randomStats = new Button("Random Stats \nRoll");
        randomStats.setOnAction(e->updateRandom());
        Button standardArray = new Button("Use Standard \nArray");
        Button eliteArray = new Button("Use elite \nArray");
        Button dunceArray = new Button("Use non-elite \nArray");
        return new VBox(randomStats,standardArray,eliteArray,dunceArray);
    }

    private void updateRandom() {
        player.setStats(statRoll(),statRoll(),statRoll(),statRoll(),statRoll(),statRoll());
        sheets.updateSheet(player, sheetNumber);
        mainLayout.setCenter(sheets.setSheet(sheetNumber));
    }

    private int statRoll() {
        DiceRoll dr = new DiceRoll();
        return dr.D6()+dr.D6()+dr.D6();
    }

    private HBox setMenuBox() {
        HBox topInfo = new HBox();
        Label lv2 = new Label("lvl.");
        Label class2 = new Label("2nd Class");
        ChoiceBox<String> classes2 = new ChoiceBox();
        classes2.setItems(InfoHolding.classesArray());
        TextField level2 = new TextField();
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
        Button saveButton = new Button("save");
        saveButton.setOnAction(e->{
            player.setCharacterName(name.getText());
            player.setClassType(classes.getValue());
            player.setLevel(Integer.parseInt(level.getText()));
            player.setRace(races.getValue());
            player.setAlignment(alignmentL_U.getValue().concat(" "+alignmentG_E.getValue()));
        });
        topInfo.getChildren().add(isMulticlassed);
        topInfo.getChildren().add(new Label("  "));
        topInfo.getChildren().add(new Label("name"));
        topInfo.getChildren().add(name);
        topInfo.getChildren().add(new Label("age"));
        topInfo.getChildren().add(age);
        topInfo.getChildren().add(new Label("race"));
        topInfo.getChildren().add(races);
        topInfo.getChildren().add(new Label("class"));
        topInfo.getChildren().add(classes);
        topInfo.getChildren().add(new Label("lv."));
        topInfo.getChildren().add(level);
        topInfo.getChildren().add(new Label("alignment"));
        topInfo.getChildren().add(alignmentL_U);
        topInfo.getChildren().add(alignmentG_E);
        isMulticlassed.setOnAction(event -> {
            if(isMulticlassed.isSelected()) {
                topInfo.getChildren().addAll(class2, classes2, lv2, level2);
            }else{
                if(topInfo.getChildren().contains(level2)){
                    topInfo.getChildren().removeAll(class2, classes2, lv2, level2);
                }
            }
        });
        topInfo.getChildren().add(saveButton);
        return topInfo;
    }


}
