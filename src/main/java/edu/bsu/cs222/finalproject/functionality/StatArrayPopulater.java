package edu.bsu.cs222.finalproject.functionality;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;


public class StatArrayPopulater {

    private final Character emptyPlayer;

    public StatArrayPopulater(Character player) {
        this.emptyPlayer = player;
    }

    public int[] randomOrder(String arrayName){
        int[] use = getArrayByName(arrayName);
        Random rand = new Random();
        for(int i = Objects.requireNonNull(use).length -1; i>0; i--){
            int newIndex = rand.nextInt(i+1);
            int tempStat = use[newIndex];
            use[newIndex] = use[i];
            use[i] = tempStat;
        }
        return use;
    }

    private int[] getArrayByName(String arrayName) {
        switch(arrayName){
            case "standardArray":
                return InfoHolding.standardArray;
            case "dunceArray":
                return InfoHolding.dunceArray;
            case "eliteArray":
                return InfoHolding.eliteArray;
        }
        return null;
    }


    public void arrayFillPromt(int[] useThisArray){
        ObservableList<Integer> listOfOptions = FXCollections.observableArrayList();
        Button strSubmit = new Button("submit"), dexSubmit = new Button("submit"),
                consSubmit= new Button("submit"), intelSubmit= new Button("submit"), wisSubmit= new Button("submit"),
                submit = new Button("Submit");
        Label str = new Label(), dex = new Label(), cons = new Label(), intel = new Label(), wis = new Label(), cha = new Label();
        ChoiceBox<Integer> strList = new ChoiceBox<>(), dexList = new ChoiceBox<>(), consList = new ChoiceBox<>(),
                intelList = new ChoiceBox<>(), wisList = new ChoiceBox<>(), chaList = new ChoiceBox<>();
        Stage stage = new Stage();
        ArrayList<HBox> layouts = new ArrayList<>();
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
        int stat =0;

        for(int i =0; i<3; i++){
            int temp =0;
         while(temp<3){
             temp = DiceRoll.D6();
         }
         stat+=temp;
        }
        return stat;
    }

    public Character returnPlayer(){
        return emptyPlayer;
    }

}