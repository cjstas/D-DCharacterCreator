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

    public PDFCreation(Character player){
        this.player = player;
        destination = "CharacterArchive\\".concat(this.player.CharacterName+""+this.player.classType+""+this.player.level+".pdf");
    }

    public void fillEmptySheet(){
        try {
            PdfDocument characterSheet = new PdfDocument(new PdfReader(pdf5e),new PdfWriter(destination));
            PdfAcroForm characterForm = PdfAcroForm.getAcroForm(characterSheet, false);
            Map<String, PdfFormField> characterFeilds = characterForm.getFormFields();
            characterFeilds.get("CharacterName").setValue(player.CharacterName);
            characterFeilds.get("Race ").setValue(player.race);
            characterFeilds.get("ClassLevel").setValue(player.classType+" "+player.level);
            characterFeilds.get("Alignment").setValue(player.alignment);
            characterFeilds.get("STR").setValue(""+player.strength);
            characterFeilds.get("STRmod").setValue(""+player.modMap.get(player.strength));
            characterFeilds.get("DEX").setValue(""+player.dexterity);
            characterFeilds.get("DEXmod ").setValue(""+player.modMap.get(player.dexterity));
            characterFeilds.get("CON").setValue(""+player.constitution);
            characterFeilds.get("CONmod").setValue(""+player.modMap.get(player.constitution));
            characterFeilds.get("INT").setValue(""+player.intelligence);
            characterFeilds.get("INTmod").setValue(""+player.modMap.get(player.intelligence));
            characterFeilds.get("WIS").setValue(""+player.wisdom);
            characterFeilds.get("WISmod").setValue(""+player.modMap.get(player.wisdom));
            characterFeilds.get("CHA").setValue(""+player.charisma);
            characterFeilds.get("CHamod").setValue(""+player.modMap.get(player.charisma));
            characterFeilds.get("Initiative").setValue(""+player.initiative);
            characterFeilds.get("Ideals").setValue(player.ideal);
            characterFeilds.get("Bonds").setValue(player.bond);
            characterFeilds.get("AC").setValue(""+player.ac);
            characterFeilds.get("Speed").setValue(""+player.speed);
            characterFeilds.get("PersonalityTraits ").setValue(player.personalityTrait);
            characterFeilds.get("HPMax").setValue(""+player.health);

            characterSheet.close();

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }

}
