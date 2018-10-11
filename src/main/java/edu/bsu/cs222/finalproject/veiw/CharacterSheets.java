package edu.bsu.cs222.finalproject.veiw;

import javafx.scene.layout.*;

public class CharacterSheets {

    public static Pane setSheet(String sheet) {
        if(sheet.equals("3.5")){
            return sheet35();
        }else{
            return sheet5e();
        }
    }

    private static Pane sheet35() {
        Pane sheet35 = new BorderPane();
        BorderPane stats = new BorderPane();


        return sheet35;
    }

    private static Pane sheet5e() {
        Pane sheet5e = new BorderPane();
        BorderPane stats = new BorderPane();
        return sheet5e;
    }
}
