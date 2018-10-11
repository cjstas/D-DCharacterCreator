package edu.bsu.cs222.finalproject.veiw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {



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
        Scene root = new Scene(new VBox(to35eBuilder, to5eBuilder, toNPCCreation));
        primaryStage.setScene(root);
        primaryStage.show();
    }

    private Scene setScene(String sheet) {
        BorderPane mainLayout = new BorderPane();
        HBox menuBox = setMenuBox();
        VBox optionsBox = setOptionBox();
        mainLayout.setTop(menuBox);
        mainLayout.setLeft(optionsBox);
        mainLayout.setCenter(CharacterSheets.setSheet(sheet));
        return new Scene(mainLayout);
    }

    private VBox setOptionBox() {
        Button randomStats = new Button("Random Stats \nRoll");
        Button standardArray = new Button("Use Standard \nArray");
        Button eliteArray = new Button("Use elite \nArray");
        Button dunceArray = new Button("Use non-elite \nArray");
        return new VBox(randomStats,standardArray,eliteArray,dunceArray);
    }

    private HBox setMenuBox() {
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
        return new HBox(isMulticlassed,new Label("  "),new Label("name"),name,new Label("age"),age,new Label("race"),races,new Label("class"),classes,new Label("lv."),level,new Label("alignment"),alignmentL_U,alignmentG_E);
    }


}
