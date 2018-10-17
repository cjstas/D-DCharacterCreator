package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMaker {

    private ArrayList<Spell> returnSpellsArrayList5e() {
        //Cantrips
            ArrayList<String> Acid_SplashList = new ArrayList<>(); Acid_SplashList.add("Wizard"); Acid_SplashList.add("Sorcerer");
        Spell Acid_Splash = new Spell("Acid Splash", Acid_SplashList, 0);
            ArrayList<String> Blade_WardList = new ArrayList<>(); Blade_WardList.add("Bard"); Blade_WardList.add("Sorcerer"); Blade_WardList.add("Wizard");
        Spell Blade_Ward = new Spell("Blade Ward", Blade_WardList, 0);
            ArrayList<String> Booming_BladeList = new ArrayList<>(); Booming_BladeList.add("Sorcerer");Booming_BladeList.add("Wizard");Booming_BladeList.add("Warlock");
        Spell Booming_Blade = new Spell("Booming Blade", Booming_BladeList, 0);
            ArrayList<String> Chill_TouchList = new ArrayList<>(); Chill_TouchList.add("Sorcerer"); Chill_TouchList.add("Warlock");Chill_TouchList.add("Wizard");
        Spell ChillTouch = new Spell("Chill Touch", Chill_TouchList, 0);
            ArrayList<String> Control_FlamesList = new ArrayList<>(); Control_FlamesList.add("Druid");Control_FlamesList.add("Sorcerer");Control_FlamesList.add("Wizard");
        Spell Control_Flames = new Spell("Control Flames", Control_FlamesList, 0);
            ArrayList<String> Create_BonfireList = new ArrayList<>();Create_BonfireList.add("Druid");Create_BonfireList.add("Sorcerer");Create_BonfireList.add("Warlock");Create_BonfireList.add("Wizard");
        Spell Create_Bonfire = new Spell("Create Bonfire", Create_BonfireList, 0);
            ArrayList<String> Dancing_LightsList = new ArrayList<>(); Dancing_LightsList.add("Bard");Dancing_LightsList.add("Sorcerer");Dancing_LightsList.add("Wizard");
        Spell Dancing_Lights = new Spell("Dancing Lights", Dancing_LightsList, 0);
            ArrayList<String> Druid_CraftList = new ArrayList<>();Druid_CraftList.add("Druid");
        Spell Druid_Craft = new Spell("Druid Craft", Druid_CraftList, 0);
            ArrayList<String> Eldritch_BlastList = new ArrayList<>();Eldritch_BlastList.add("Warlock");
        Spell Eldritch_Blast = new Spell("Eldritch Blast", Eldritch_BlastList, 0);
            ArrayList<String> Fire_BoltList = new ArrayList<>();Fire_BoltList.add("Sorcerer");Fire_BoltList.add("Wizard");
        Spell Fire_Bolt = new Spell("Fire Bolt", Fire_BoltList, 0);
            ArrayList<String> FriendsList = new ArrayList<>();FriendsList.add("Bard");FriendsList.add("Sorcerer");FriendsList.add("Warlock");FriendsList.add("Wizard");
        Spell Friends = new Spell("Friends", FriendsList, 0);
            ArrayList<String> FrostbiteList = new ArrayList<>();FrostbiteList.add("Druid");FrostbiteList.add("Sorcerer");FrostbiteList.add("Warlock");FrostbiteList.add("Wizard");
        Spell Frostbite = new Spell("Frostbite", FrostbiteList, 0);
            ArrayList<String> Green_Flame_BladeList = new ArrayList<>();Green_Flame_BladeList.add("Sorcerer");Green_Flame_BladeList.add("Warlock");Green_Flame_BladeList.add("Wizard");
        Spell Green_Flame_Blade = new Spell("Green-Flame Blade", Green_Flame_BladeList, 0);
            ArrayList<String> GuidanceList = new ArrayList<>();GuidanceList.add("Cleric");GuidanceList.add("Druid");
        Spell Guidance = new Spell("Guidance", GuidanceList, 0);
            ArrayList<String> GustList = new ArrayList<>();GustList.add("Druid");GustList.add("Sorcerer");GustList.add("Wizard");
        Spell Gust = new Spell("Gust", GustList, 0);
            ArrayList<String> InfestationList = new ArrayList<>();InfestationList.add("Druid");InfestationList.add("Sorcerer");InfestationList.add("Warlock");InfestationList.add("Wizard");
        Spell Infestation = new Spell("Infestation", InfestationList, 0);
            ArrayList<String> LightList = new ArrayList<>();LightList.add("Bard");LightList.add("Cleric");LightList.add("Sorcerer");LightList.add("Wizard");
        Spell Light = new Spell("Light", LightList, 0);
            ArrayList<String> Lightning_LureList = new ArrayList<>();Lightning_LureList.add("Sorcerer");Lightning_LureList.add("Warlock");Lightning_LureList.add("Wizard");
        Spell Lightning_Lure = new Spell("Lightning Lure", Lightning_LureList, 0);
            ArrayList<String> Mage_HandList = new ArrayList<>();Mage_HandList.add("Bard");Mage_HandList.add("Sorcerer");Mage_HandList.add("Warlock");Mage_HandList.add("Wizard");
        Spell Mage_Hand = new Spell("Mage Hand", Mage_HandList, 0);
            ArrayList<String> Magic_StoneList = new ArrayList<>();Magic_StoneList.add("Druid");Magic_StoneList.add("Warlock");
        Spell Magic_Stone = new Spell("Magic Stone", Magic_StoneList, 0);
            ArrayList<String> MendingList = new ArrayList<>();MendingList.add("Bard");MendingList.add("Cleric");MendingList.add("Druid");MendingList.add("Sorcerer");MendingList.add("Wizard");
        Spell Mending = new Spell("Mending", MendingList, 0);
            ArrayList<String> MessageList = new ArrayList<>();MessageList.add("Bard");MessageList.add("Sorcerer");MessageList.add("Wizard");
        Spell Message = new Spell("Message", MessageList, 0);
            ArrayList<String> Minor_IllusionList = new ArrayList<>();Minor_IllusionList.add("Bard");Minor_IllusionList.add("Sorcerer");Minor_IllusionList.add("Warlock");Minor_IllusionList.add("Wizard");
        Spell Minor_Illusion = new Spell("Minor Illusion", Minor_IllusionList, 0);
            ArrayList<String> Mold_EarthList = new ArrayList<>();Mold_EarthList.add("Druid");Mold_EarthList.add("Sorcerer");Mold_EarthList.add("Wizard");
        Spell Mold_Earth = new Spell("Mold Earth", Mold_EarthList, 0);
            ArrayList<String> Poison_SprayList = new ArrayList<>();Poison_SprayList.add("Druid");Poison_SprayList.add("Sorcerer");Poison_SprayList.add("Warlock");Poison_SprayList.add("Wizard");
        Spell Poison_Spray = new Spell("Poison Spray", Poison_SprayList, 0);
            ArrayList<String> PrestidigitationList = new ArrayList<>();PrestidigitationList.add("Bard");PrestidigitationList.add("Sorcerer");PrestidigitationList.add("Warlock");PrestidigitationList.add("Wizard");
        Spell Prestidigitation = new Spell("Prestidigitation", PrestidigitationList, 0);
            ArrayList<String> Primal_SavageryList = new ArrayList<>();Primal_SavageryList.add("Druid");
        Spell Primal_Savagery = new Spell("Primal Savagery", Primal_SavageryList, 0);
            ArrayList<String> Produce_FlameList = new ArrayList<>();Produce_FlameList.add("Druid");
        Spell Produce_Flame = new Spell("Produce Flame", Produce_FlameList, 0);
            ArrayList<String> Ray_of_FrostList = new ArrayList<>();Ray_of_FrostList.add("Sorcerer");Ray_of_FrostList.add("Wizard");
        Spell Ray_of_Frost = new Spell("Ray of Frost", Ray_of_FrostList, 0);
            ArrayList<String> ResistanceList = new ArrayList<>();ResistanceList.add("Cleric");ResistanceList.add("Druid");
        Spell Resistance = new Spell("Resistance", ResistanceList, 0);
            ArrayList<String> Sacred_FlameList = new ArrayList<>();Sacred_FlameList.add("Cleric");
        Spell Sacred_Flame = new Spell("Sacred Flame", Sacred_FlameList, 0);
            ArrayList<String> Shape_WaterList = new ArrayList<>();Shape_WaterList.add("Druid");Shape_WaterList.add("Sorcerer");Shape_WaterList.add("Wizard");
        Spell Shape_Water = new Spell("Shape Water", Shape_WaterList, 0);
            ArrayList<String> ShillelaghList = new ArrayList<>();ShillelaghList.add("Druid");
        Spell Shillelagh = new Spell("Shillelagh", ShillelaghList, 0);
            ArrayList<String> Shocking_GraspList = new ArrayList<>();Shocking_GraspList.add("Sorcerer");Shocking_GraspList.add("Wizard");
        Spell Shocking_Grasp = new Spell("Shocking Grasp", Shocking_GraspList, 0);
            ArrayList<String> Spare_the_DyingList = new ArrayList<>();Spare_the_DyingList.add("Cleric");
        Spell Spare_the_Dying = new Spell("Spare the Dying", Spare_the_DyingList, 0);
            ArrayList<String> Sword_BurstList = new ArrayList<>();Sword_BurstList.add("Sorcerer");Sword_BurstList.add("Warlock");Sword_BurstList.add("Wizard");
        Spell Sword_Burst = new Spell("Sword Burst", Sword_BurstList, 0);
            ArrayList<String> ThaumaturgyList = new ArrayList<>();ThaumaturgyList.add("Cleric");
        Spell Thaumaturgy = new Spell("Thaumaturgy", ThaumaturgyList, 0);
            ArrayList<String> Thorn_WhipList = new ArrayList<>();Thorn_WhipList.add("Druid");
        Spell Thorn_Whip = new Spell("Thorn Whip", Thorn_WhipList, 0);
            ArrayList<String> ThunderclapList = new ArrayList<>();ThunderclapList.add("Bard");ThunderclapList.add("Druid");ThunderclapList.add("Sorcerer");ThunderclapList.add("Warlock");ThunderclapList.add("Wizard");
        Spell Thunderclap = new Spell("Thunderclap", LightList, 0);
            ArrayList<String> Toll_the_DeadList = new ArrayList<>();Toll_the_DeadList.add("Cleric");Toll_the_DeadList.add("Warlock");Toll_the_DeadList.add("Wizard");
        Spell Toll_the_Dead = new Spell("Toll the Dead", Toll_the_DeadList, 0);
            ArrayList<String> True_StrikeList = new ArrayList<>();True_StrikeList.add("Bard");True_StrikeList.add("Sorcerer");True_StrikeList.add("Warlock");True_StrikeList.add("Wizard");
        Spell True_Strike = new Spell("True Strike", True_StrikeList, 0);
            ArrayList<String> Vicious_MockeryList = new ArrayList<>();Vicious_MockeryList.add("Bard");
        Spell Vicious_Mockery = new Spell("Vicious Mockery", Vicious_MockeryList, 0);
            ArrayList<String> Word_of_RadianceList = new ArrayList<>();Word_of_RadianceList.add("Cleric");
        Spell Word_of_Radiance = new Spell("Word of Radiance", Word_of_RadianceList, 0);

        //Level 1 Spells


        Spell[] SpellsArray = {
                //Cantrips
                Acid_Splash,Blade_Ward,Booming_Blade,ChillTouch,Control_Flames,Create_Bonfire,Dancing_Lights,Druid_Craft,Eldritch_Blast,Fire_Bolt,Friends,Frostbite,Green_Flame_Blade,Guidance,Gust,Infestation,Light,Lightning_Lure,Mage_Hand,Magic_Stone,Mending,Message,Minor_Illusion,Mold_Earth,Poison_Spray,Prestidigitation,Primal_Savagery,Produce_Flame,Ray_of_Frost,Resistance,Sacred_Flame,Shape_Water,Shillelagh,Shocking_Grasp,Spare_the_Dying,Sword_Burst,Thaumaturgy,Thorn_Whip,Thunderclap,Toll_the_Dead,True_Strike,Vicious_Mockery,Word_of_Radiance
        };
        return new ArrayList<>(Arrays.asList(SpellsArray));
    }

    public ArrayList<ArrayList<Spell>> returnClassArrays() {
        ArrayList<Spell> AllSpells = returnSpellsArrayList5e();
        ArrayList<Spell> WizardSpells = new ArrayList<>();
        ArrayList<ArrayList<Spell>> returnArray = new ArrayList<>();

        for(Spell spell : AllSpells) {
            for(String name : spell.useableBy) {
                if(name.equals("Wizard")) {
                    WizardSpells.add(spell);
                }
            }
        }

        return null;
    }



}
