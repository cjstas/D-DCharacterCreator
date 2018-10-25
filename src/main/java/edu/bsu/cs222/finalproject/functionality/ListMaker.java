package edu.bsu.cs222.finalproject.functionality;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMaker {

    public ArrayList<Spell> returnSpellsArrayList5e() {
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
                //Level 1 Spells

        };
        return new ArrayList<>(Arrays.asList(SpellsArray));
    }

    public ArrayList<ArrayList<Spell>> returnClassArrays() {
        ArrayList<Spell> AllSpells = returnSpellsArrayList5e();
        ArrayList<Spell> WizardSpells = new ArrayList<>();
        ArrayList<Spell> BardSpells = new ArrayList<>();
        ArrayList<Spell> ClericSpells = new ArrayList<>();
        ArrayList<Spell> DruidSpells = new ArrayList<>();
        ArrayList<Spell> PaladinSpells = new ArrayList<>();
        ArrayList<Spell> RangerSpells = new ArrayList<>();
        ArrayList<Spell> SorcererSpells = new ArrayList<>();
        ArrayList<Spell> WarlockSpells = new ArrayList<>();
        ArrayList<ArrayList<Spell>> returnArray = new ArrayList<>();

        for(Spell spell : AllSpells) {
            for(String name : spell.useableBy) {
                switch (name) {
                    case "Wizard":
                        WizardSpells.add(spell);
                        break;
                    case "Bard":
                        BardSpells.add(spell);
                        break;
                    case "Cleric":
                        ClericSpells.add(spell);
                        break;
                    case "Druid":
                        DruidSpells.add(spell);
                        break;
                    case "Paladin":
                        PaladinSpells.add(spell);
                        break;
                    case "Ranger":
                        RangerSpells.add(spell);
                        break;
                    case "Sorcerer":
                        SorcererSpells.add(spell);
                        break;
                    case "Warlock":
                        WarlockSpells.add(spell);
                        break;
                }
            }
        }

        returnArray.add(WizardSpells);
        returnArray.add(BardSpells);
        returnArray.add(ClericSpells);
        returnArray.add(DruidSpells);
        returnArray.add(PaladinSpells);
        returnArray.add(RangerSpells);
        returnArray.add(SorcererSpells);
        returnArray.add(WarlockSpells);

        return returnArray;
    }

    public String[] returnTrinkets() {

        return new String[]{"A mummified goblin hand",
        "A piece of crystal that faintly glows in the moonlight",
                "A gold coin minted in an unknown land",
                "A diary written in a language you don’t know",
                "A brass ring that never tarnishes",
                "An old chess piece made from glass",
                "A pair of knucklebone dice, each with a skull symbol on the side that would normally show six pips",
                "A small idol depicting a nightmarish creature that gives you unsettling dreams when you sleep near it",
                "A rope necklace from which dangles four mummified elf fingers",
                "The deed for a parcel of land in a realm unknown to you",
                "A 1-ounce block made from an unknown material",
                "A small cloth doll skewered with needles",
                "A tooth from an unknown beast",
                "An enormous scale, perhaps from a dragon",
                "A bright green feather",
                "An old divination card bearing your likeness",
                "A glass orb filled with moving smoke",
                "A 1-pound egg with a bright red shell",
                "A pipe that blows bubbles",
                "A glass jar containing a weird bit of flesh floating in pickling fluid",
                "A tiny gnome-crafted music box that plays a song you dimly remember from your childhood",
                "A small wooden statuette of a smug halfling",
                "A brass orb etched with strange runes",
                "A multicolored stone disk",
                "A tiny silver icon of a raven",
                "A bag containing forty-seven humanoid teeth, one of which is rotten",
                "A shard of obsidian that always feels warm to the touch",
                "A dragon's bony talon hanging from a plain leather necklace",
                "A pair of old socks",
                "A blank book whose pages refuse to hold ink, chalk, graphite, or any other substance or marking",
                "A silver badge in the shape of a five-pointed star",
                "A knife that belonged to a relative",
                "A glass vial filled with nail clippings",
                "A rectangular metal device with two tiny metal cups on one end that throws sparks when wet",
                "A white, sequined glove sized for a human",
                "A vest with one hundred tiny pockets",
                "A small, weightless stone block",
                "A tiny sketch portrait of a goblin",
                "An empty glass vial that smells of perfume when opened",
                "A gemstone that looks like a lump of coal when examined by anyone but you",
                "A scrap of cloth from an old banner",
                "A rank insignia from a lost legionnaire",
                "A tiny silver bell without a clapper",
                "A mechanical canary inside a gnome-crafted lamp",
                "A tiny chest carved to look like it has numerous feet on the bottom",
                "A dead sprite inside a clear glass bottle",
                "A metal can that has no opening but sounds as if it is filled with liquid, sand, spiders, or broken glass (your choice)",
                "A glass orb filled with water, in which swims a clockwork goldfish",
                "A silver spoon with an M engraved on the handle",
                "A whistle made from gold-colored wood",
                "A dead scarab beetle the size of your hand",
                "Two toy soldiers, one with a missing head",
                "A small box filled with different-sized buttons",
                "A candle that can’t be lit",
                "A tiny cage with no door",
                "An old key",
                "An indecipherable treasure map",
                "A hilt from a broken sword",
                "A rabbit’s foot",
                "A glass eye",
                "A cameo carved in the likeness of a hideous person",
                "A silver skull the size of a coin",
                "An alabaster mask",
                "A pyramid of sticky black incense that smells very bad",
                "A nightcap that, when worn, gives you pleasant dreams",
                "A single caltrop made from bone",
                "A gold monocle frame without the lens",
                "A 1-inch cube, each side painted a different color",
                "A crystal knob from a door",
                "A small packet filled with pink dust",
                "A fragment of a beautiful song, written as musical notes on two pieces of parchment",
                "A silver teardrop earring made from a real teardrop",
                "The shell of an egg painted with scenes of human misery in disturbing detail",
                "A fan that, when unfolded, shows a sleeping cat",
                "A set of bone pipes",
                "A four-leaf clover pressed inside a book discussing manners and etiquette",
                "A sheet of parchment upon which is drawn a complex mechanical contraption",
                "An ornate scabbard that fits no blade you have found so far",
                "An invitation to a party where a murder happened",
                "A bronze pentacle with an etching of a rat's head in its center",
                "A purple handkerchief embroidered with the name of a powerful archmage",
                "Half of a floorplan for a temple, castle, or some other structure",
                "A bit of folded cloth that, when unfolded, turns into a stylish cap",
                "A receipt of deposit at a bank in a far-flung city",
                "A diary with seven missing pages",
                "An empty silver snuffbox bearing an inscription on the surface that says “dreams”",
                "An iron holy symbol devoted to an unknown god",
                "A book that tells the story of a legendary hero's rise and fall, with the last chapter missing",
                "A vial of dragon blood",
                "An ancient arrow of elven design",
                "A needle that never bends",
                "An ornate brooch of dwarven design",
                "An empty wine bottle bearing a pretty label that says, “The Wizard of Wines Winery, Red Dragon Crush, 331422-W”",
                "A mosaic tile with a multicolored, glazed surface",
                "A petrified mouse",
                "A black pirate flag adorned with a dragon's skull and crossbones",
                "A tiny mechanical crab or spider that moves about when it’s not being observed",
                "A glass jar containing lard with a label that reads, “Griffon Grease”",
                "A wooden box with a ceramic bottom that holds a living worm with a head on each end of its body",
                "A metal urn containing the ashes of a hero"

        };
    }

}
