package edu.bsu.cs222.finalproject.functionality;

import edu.bsu.cs222.finalproject.view.CharacterSheets;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;


public class StatArrayPopulater {

    private Character emptyPlayer;

    public StatArrayPopulater(Character player) {
        this.emptyPlayer = player;
    }

    public void arrayFillPromt(int[] useThisArray){
        ObservableList<Integer> listOfOptions = FXCollections.observableArrayList();
        Button strSubmit = new Button("submit"), dexSubmit = new Button("submit"),
                consSubmit= new Button("submit"), intelSubmit= new Button("submit"), wisSubmit= new Button("submit"),
                submit = new Button("Submit");
        Label str = new Label(), dex = new Label(), cons = new Label(), intel = new Label(), wis = new Label(), cha = new Label();
        ChoiceBox<Integer> strList = new ChoiceBox<Integer>(), dexList = new ChoiceBox<Integer>(), consList = new ChoiceBox<Integer>(),
                intelList = new ChoiceBox<Integer>(), wisList = new ChoiceBox<Integer>(), chaList = new ChoiceBox<Integer>();
        Stage stage = new Stage();
        ArrayList<HBox> layouts = new ArrayList<HBox>();
        for(int integer: useThisArray){
            listOfOptions.add(integer);
        }

        str.setText("Strength");
        dex.setText("Dexterity");
        cons.setText("Constitution");
        intel.setText("Intelligence");
        wis.setText("Wisdom");
        cha.setText("Charisma");

        strList.setItems(listOfOptions);
        strSubmit.setOnAction(event ->{
            emptyPlayer.strength = strList.getValue();
            listOfOptions.remove(strList.getValue());
            dexList.setItems(listOfOptions);
            stage.setScene(new Scene(layouts.get(1)));
        });
        dexSubmit.setOnAction(event -> {
            emptyPlayer.dexterity = dexList.getValue();
            listOfOptions.remove(dexList.getValue());
            consList.setItems(listOfOptions);
            stage.setScene(new Scene(layouts.get(2)));
        });
        consSubmit.setOnAction(event -> {
            emptyPlayer.constitution = consList.getValue();
            listOfOptions.remove(consList.getValue());
            intelList.setItems(listOfOptions);
            stage.setScene(new Scene(layouts.get(3)));
        });
        intelSubmit.setOnAction(event -> {
            emptyPlayer.intelligence = intelList.getValue();
            listOfOptions.remove(intelList.getValue());
            wisList.setItems(listOfOptions);
            stage.setScene(new Scene(layouts.get(4)));
        });
        wisSubmit.setOnAction(event -> {
            emptyPlayer.wisdom = wisList.getValue();
            listOfOptions.remove(wisList.getValue());
            chaList.setItems(listOfOptions);
            stage.setScene(new Scene(layouts.get(5)));
        });
        submit.setOnAction(event -> {
            emptyPlayer.charisma = chaList.getValue();
            stage.close();
        });

        HBox strScene = new HBox(str, strList, strSubmit),
                dexScene = new HBox(dex, dexList, dexSubmit),
                consScene = new HBox(cons, consList, consSubmit),
                intelScene = new HBox(intel, intelList, intelSubmit),
                wisScene = new HBox(wis, wisList, wisSubmit),
                chaScene = new HBox(cha, chaList, submit);

        layouts.add(0, strScene);
        layouts.add(1, dexScene);
        layouts.add(2, consScene);
        layouts.add(3, intelScene);
        layouts.add(4,wisScene);
        layouts.add(5,chaScene);

        stage.setScene(new Scene(layouts.get(0)));
        stage.setMinWidth(200.0);
        stage.show();
    }

    public int[] rollRandomStat() {
        int[] randomStat = new int[6];
        for(int i=0; i<randomStat.length; i++){
            randomStat[i] = statRoll();
        }
        return randomStat;

    }

    private int statRoll() {
        return DiceRoll.D6()+ DiceRoll.D6()+ DiceRoll.D6();
    }

    public Character returnPlayer(){
        return emptyPlayer;
    }

    public CharacterSheets returnEditedSheet(CharacterSheets sheet){
        sheet.populateSheet(emptyPlayer);
        return sheet;
    }

}
