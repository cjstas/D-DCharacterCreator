package edu.bsu.cs222.finalproject.functionality;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.IOException;
import java.util.Map;

public class PDFCreation {

    private final String pdf5e = "TWC-DnD-5E-Character-Sheet-v1.3.pdf",
                destination;
    private final Character player;

    public PDFCreation(Character player, String prefFileLocale){
        this.player = player;
        destination = prefFileLocale.concat(player.CharacterName.concat(player.level+"".concat("_5eAutoGenerate")));
    }

    public void fillEmptySheet(){
        try {
            PdfDocument characterSheet = new PdfDocument(new PdfReader(pdf5e),new PdfWriter(destination));
            PdfAcroForm characterForm = PdfAcroForm.getAcroForm(characterSheet, false);
            Map<String, PdfFormField> characterFeilds = characterForm.getFormFields();
            characterFeilds.get("CharacterName").setValue(player.CharacterName);
            characterFeilds.get("PlayerName").setValue(player.playerName);
            characterFeilds.get("Race").setValue(player.race);
            characterFeilds.get("ClassLevel").setValue(player.classType+" "+player.level);
            characterFeilds.get("Alignment").setValue(player.alignment);
            characterFeilds.get("STR").setValue(""+player.strength);
            characterFeilds.get("STRmod").setValue(""+player.modMap.get(player.strength));
            characterFeilds.get("DEX");
            characterFeilds.get("DEXmod");
            characterFeilds.get("CON");
            characterFeilds.get("CONmod");
            characterFeilds.get("INT");
            characterFeilds.get("INTmod");
            characterFeilds.get("WIS");
            characterFeilds.get("WISmod");
            characterFeilds.get("CHA");
            characterFeilds.get("CHamod");

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }

        /*
        todo create pdf object
        todo fill the correct locations with characterInfo
        todo set global feild as the filled PDFSave under the filename DND{SHEET#}_{CharacterName}.pdf
         */
    }

}
