package edu.bsu.cs222.finalproject.functionality;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class StatArrayPopulater {

    private int[] statsArray;

    public void arrayFillPromt(int[] useThisArray){
        ObservableList<Integer> listOfOptions = FXCollections.observableArrayList();
        int[] selectedArray = new int[6];
        Button submit = new Button("Submit");
        Label str = new Label(), dex = new Label(), cons = new Label(), intel = new Label(), wis = new Label(), cha = new Label();
        ChoiceBox<Integer> strList = new ChoiceBox<Integer>(), dexList = new ChoiceBox<Integer>(), consList = new ChoiceBox<Integer>(),
                intelList = new ChoiceBox<Integer>(), wisList = new ChoiceBox<Integer>(), chaList = new ChoiceBox<Integer>();
        GridPane layout = new GridPane();
        Scene scene = new Scene(layout);
        Stage stage = new Stage();

        for(int integer: useThisArray){
            listOfOptions.add(integer);
        }

        strList.setItems(listOfOptions);
        dexList.setItems(listOfOptions);
        consList.setItems(listOfOptions);
        intelList.setItems(listOfOptions);
        wisList.setItems(listOfOptions);
        chaList.setItems(listOfOptions);

        ConnectedComboBox conCB = new ConnectedComboBox(listOfOptions);
        conCB.addComboBox(strList);
        conCB.addComboBox(dexList);
        conCB.addComboBox(consList);
        conCB.addComboBox(intelList);
        conCB.addComboBox(wisList);
        conCB.addComboBox(chaList);



        str.setText("Strength");
        dex.setText("Dexterity");
        cons.setText("Constitution");
        intel.setText("Intelligence");
        wis.setText("Wisdom");
        cha.setText("Charisma");

        submit.setOnAction(event -> {
            stage.close();
            selectedArray[0] = strList.getValue();
            selectedArray[1] = dexList.getValue();
            selectedArray[2] = consList.getValue();
            selectedArray[3] = intelList.getValue();
            selectedArray[4] = wisList.getValue();
            selectedArray[5] = chaList.getValue();
            pushToStatsArray(selectedArray);
        });

        layout.addColumn(0,str, dex, cons, intel, wis, cha);
        layout.addColumn(1,strList, dexList, consList, intelList, wisList, chaList,submit);
        scene.setFill(Color.LIGHTPINK);
        stage.setScene(scene);
        stage.show();
    }

    private void pushToStatsArray(int[] selectedArray) {
        statsArray = selectedArray;
    }

    public int[] getStatsArray(){
        return statsArray;
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

}
