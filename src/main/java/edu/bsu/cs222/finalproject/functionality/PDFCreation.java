package edu.bsu.cs222.finalproject.functionality;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.IOException;
import java.util.Map;

public class PDFCreation {

    private final String destination;
    private final Character player;

    public PDFCreation(Character player){
        this.player = player;
        destination = "CharacterArchive\\".concat(this.player.CharacterName+""+this.player.classType+""+this.player.level+".pdf");
    }

    public void fillEmptySheet(){
        try {
            final String pdf5e = "src\\resources\\TWC-DnD-5E-Character-Sheet-v1.3.pdf";
            PdfDocument characterSheet = new PdfDocument(new PdfReader(pdf5e),new PdfWriter(destination));
            PdfAcroForm characterForm = PdfAcroForm.getAcroForm(characterSheet, false);
            Map<String, PdfFormField> characterFeilds = characterForm.getFormFields();
            characterFeilds.get("CharacterName").setValue(player.CharacterName);
            characterFeilds.get("Race ").setValue(player.race);
            characterFeilds.get("ClassLevel").setValue(player.classType+" "+player.level);
            characterFeilds.get("Alignment").setValue(player.alignment);
            characterFeilds.get("STR").setValue(""+player.strength);
            characterFeilds.get("STRmod").setValue(""+ Character.modMap.get(player.strength));
            characterFeilds.get("DEX").setValue(""+player.dexterity);
            characterFeilds.get("DEXmod ").setValue(""+ Character.modMap.get(player.dexterity));
            characterFeilds.get("CON").setValue(""+player.constitution);
            characterFeilds.get("CONmod").setValue(""+ Character.modMap.get(player.constitution));
            characterFeilds.get("INT").setValue(""+player.intelligence);
            characterFeilds.get("INTmod").setValue(""+ Character.modMap.get(player.intelligence));
            characterFeilds.get("WIS").setValue(""+player.wisdom);
            characterFeilds.get("WISmod").setValue(""+ Character.modMap.get(player.wisdom));
            characterFeilds.get("CHA").setValue(""+player.charisma);
            characterFeilds.get("CHamod").setValue(""+ Character.modMap.get(player.charisma));
            characterFeilds.get("Initiative").setValue(""+player.initiative);
            characterFeilds.get("Ideals").setValue(player.ideal);
            characterFeilds.get("Bonds").setValue(player.bond);
            characterFeilds.get("AC").setValue(""+player.ac);
            characterFeilds.get("Speed").setValue(""+player.speed);
            characterFeilds.get("PersonalityTraits ").setValue(player.personalityTrait);
            characterFeilds.get("HPMax").setValue(""+player.health);
            characterFeilds.get("HPCurrent").setValue(""+player.health);
            characterFeilds.get("CharacterName 2").setValue(player.CharacterName);
            characterFeilds.get("Treasure").setValue("");
            characterFeilds.get("XP").setValue(""+player.experiencePoints);
            characterFeilds.get("Inspiration").setValue(""+player.inspiration);
            characterFeilds.get("ProfBonus").setValue(""+player.proficiencyBonus);
            characterFeilds.get("Equipment").setValue(InfoHolding.listToString(player.equipment));
            characterFeilds.get("Flaws").setValue(player.flaw);
            characterFeilds.get("ProficienciesLang").setValue(InfoHolding.listToString(player.language));

            if(player.setSavingThrows()[0]) {
                characterFeilds.get("ST Strength").setValue(""+ Character.modMap.get(player.strength));
                characterFeilds.get("Check Box 11").setValue("X");
            }
            if (player.setSavingThrows()[1]) {
                characterFeilds.get("ST Dexterity").setValue(""+ Character.modMap.get(player.dexterity));
                characterFeilds.get("Check Box 18").setValue("X");
            }
            if (player.setSavingThrows()[2]) {
                characterFeilds.get("ST Constitution").setValue(""+ Character.modMap.get(player.constitution));
                characterFeilds.get("Check Box 19").setValue("X");
            }
            if (player.setSavingThrows()[3]) {
                characterFeilds.get("ST Intelligence").setValue(""+ Character.modMap.get(player.intelligence));
                characterFeilds.get("Check Box 20").setValue("X");
            }
            if (player.setSavingThrows()[4]) {
                characterFeilds.get("ST Wisdom").setValue(""+ Character.modMap.get(player.wisdom));
                characterFeilds.get("Check Box 21").setValue("X");
            }
            if(player.setSavingThrows()[5]){
                characterFeilds.get("ST Charisma").setValue(""+ Character.modMap.get(player.charisma));
                characterFeilds.get("Check Box 22").setValue("X");
            }

            for(String e: player.knownSkills){
                characterFeilds.get(getOK(e)).setValue(""+fillSkill(e));
                characterFeilds.get(getCBOK(e)).setValue("X");
            }



            characterSheet.close();

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }

    private String getCBOK(String skillName) {
        String Id = "";
        switch (skillName) {
          case "acrobatics":
            Id = "Check Box 23";
            break;
          case "animalHandling":
            Id = "Check Box 24";
            break;
          case "arcana":
            Id = "Check Box 25";
            break;
          case "athletics":
            Id = "Check Box 26";
            break;
          case "deception":
            Id = "Check Box 27";
            break;
          case "history":
            Id = "Check Box 28";
            break;
          case "insight":
            Id = "Check Box 29";
            break;
          case "intimidation":
            Id = "Check Box 30";
            break;
          case "investigation":
            Id = "Check Box 31";
            break;
          case "medicine":
            Id = "Check Box 32";
            break;
          case "nature":
            Id = "Check Box 33";
            break;
          case "perception":
            Id = "Check Box 34";
            break;
          case "perfomance":
            Id = "Check Box 35";
            break;
          case "persuasion":
            Id = "Check Box 36";
            break;
          case "religion":
            Id = "Check Box 37";
            break;
          case "slightOfHand":
            Id = "Check Box 38";
            break;
          case "stealth":
            Id = "Check Box 39";
            break;
          case "survival":
            Id = "Check Box 40";
            break;
        }
        return Id;
    }

    private String getOK(String skillName) {
        String feildName = null;
        switch(skillName){
            case "acrobatics":
                feildName = "Acrobatics";
                break;
            case "animalHandling":
                feildName = "Animal";
                break;
            case "arcana":
                feildName = "Arcana";
                break;
            case "athletics":
                feildName = "Athletics";
                break;
            case "deception":
                feildName = "Deception ";
                break;
            case "history":
                feildName = "History";
                break;
            case "insight":
                feildName = "Insight";
                break;
            case "intimidation":
                feildName = "Intimidation";
                break;
            case "investigation":
                feildName = "Investigation";
                break;
            case "medicine":
                feildName = "Medicine";
                break;
            case "nature":
                feildName = "Nature";
                break;
            case "perception":
                feildName = "Perception";
                break;
            case "perfomance":
                feildName = "Performance";
                break;
            case "persuasion":
                feildName = "Persuasion";
                break;
            case "religion":
                feildName = "Religion";
                break;
            case "slightOfHand":
                feildName = "SleightofHand";
                break;
            case "stealth":
                feildName = "Stealth ";
                break;
            case "survival":
                feildName = "Survival";
                break;
        }
        return feildName;
    }

    private int fillSkill(String skill) {
        int skillpoint=0;
        switch(skill){
            case "acrobatics":
                skillpoint = Character.modMap.get(player.dexterity);
                break;
            case "animalHandling":
                skillpoint = Character.modMap.get(player.wisdom);
                break;
            case "arcana":
                skillpoint = Character.modMap.get(player.intelligence);
                break;
            case "athletics":
                skillpoint = Character.modMap.get(player.strength);
                break;
            case "deception":
                skillpoint = Character.modMap.get(player.charisma);
                break;
            case "history":
                skillpoint = Character.modMap.get(player.intelligence);
                break;
            case "insight":
                skillpoint = Character.modMap.get(player.wisdom);
                break;
            case "intimidation":
                skillpoint = Character.modMap.get(player.charisma);
                break;
            case "investigation":
                skillpoint = Character.modMap.get(player.intelligence);
                break;
            case "medicine":
                skillpoint = Character.modMap.get(player.wisdom);
                break;
            case "nature":
                skillpoint = Character.modMap.get(player.intelligence);
                break;
            case "perception":
                skillpoint = Character.modMap.get(player.wisdom);
                break;
            case "perfomance":
                skillpoint = Character.modMap.get(player.charisma);
                break;
            case "persuasion":
                skillpoint = Character.modMap.get(player.charisma);
                break;
            case "religion":
                skillpoint = Character.modMap.get(player.intelligence);
                break;
            case "slightOfHand":
                skillpoint = Character.modMap.get(player.dexterity);
                break;
            case "stealth":
                skillpoint = Character.modMap.get(player.dexterity);
                break;
            case "survival":
                skillpoint = Character.modMap.get(player.wisdom);
                break;
        }

        return skillpoint;
    }

}
