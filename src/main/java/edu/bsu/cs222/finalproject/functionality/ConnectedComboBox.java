package edu.bsu.cs222.finalproject.functionality;
/* This IS NOT OUR CODE
 * It is a class from StackOverflow user varren's answer to a question "How to temporarily remove items from a choicebox (or maybe a combobox)?"
 * this is the answer @URL: https://stackoverflow.com/a/30625810
 * this is the entire discussion @URL: https://stackoverflow.com/questions/30618532/how-to-temporarily-remove-items-from-a-choicebox-or-maybe-a-combobox
 *
 */



import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectedComboBox<T> implements ChangeListener<T> {

    private ObservableList<T> items;
    private List<ChoiceBox<T>> comboBoxList = new ArrayList<ChoiceBox<T>>();

    public ConnectedComboBox(ObservableList<T> items){
        this.items = items;
        if (this.items == null) this.items = FXCollections.observableArrayList();
    }

    public void addComboBox(ChoiceBox<T> comboBox){
        comboBoxList.add(comboBox);
        comboBox.valueProperty().addListener(this);
        updateSelection();
    }

    public void removeComboBox(ChoiceBox<T> comboBox){
        comboBoxList.remove(comboBox);
        comboBox.valueProperty().removeListener(this);
        updateSelection();
    }

    // this boolean needed because we can set combobox Value in updateSelection()
    // this will trigger a value listener and update selection one more time => stack overflow
    // this behavior occurs only if we have more than one equal item in source ObservableList<T> items list.
    private boolean updating = false;
    private void updateSelection() {
        if (updating) return;
        updating = true;

        List<T> availableChoices = items.stream().collect(Collectors.toList());
        for (ChoiceBox<T> comboBox: comboBoxList){
            if (comboBox.getValue()!= null) {
                availableChoices.remove(comboBox.getValue());
            }
        }

        for (ChoiceBox<T> comboBox: comboBoxList){
            T selectedValue = comboBox.getValue();
            ObservableList<T> items = comboBox.getItems();
            items.setAll(availableChoices);

            if (selectedValue != null) {
                items.add(selectedValue);
                comboBox.setValue(selectedValue);
            }
        }

        updating = false;
    }

    @Override
    public void changed(ObservableValue<? extends T> observable, T oldValue, T newValue) {
        updateSelection();
    }

}
