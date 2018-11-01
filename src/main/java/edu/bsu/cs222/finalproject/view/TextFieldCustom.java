package edu.bsu.cs222.finalproject.view;

import javafx.scene.control.TextField;

public class TextFieldCustom extends TextField {

    public Boolean isEmpty(){
        try{
            String  test = getText();
        }catch (NullPointerException e){
            return true;
        }
        return false;
    }

}
