package edu.bsu.cs222.finalproject.functionality;

import java.util.HashMap;
import java.util.Map;

public class Background {

    public static final Map<Integer, String> acolytePTMap = createAcolytePTMap();
    public static Map<Integer, String> createAcolytePTMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I idolize a particular hero of my faith, and constantly refer to that person's deeds and example.");
        myMap.put(2, "I can find common ground between the fiercest of enemies, empathizing with them and always working toward peace.");
        myMap.put(3, "I see omens in every event and action. The gods try to speak to us, we just need to listen");
        myMap.put(4, "Nothing can shake my optimistic attitude.");
        myMap.put(5, "I quote (or misquote) sacred texts and proverbs in almost every situation.");
        myMap.put(6, "I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.");
        myMap.put(7, "I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me.");
        myMap.put(8, "I've spent so long in the temple that I have little practical experience dealing with people in the outside world.");
        return myMap;
    }

    public static final Map<Integer, String> acolyteIdealMap = createAcolyteIdealMap();
    public static Map<Integer, String> createAcolyteIdealMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Tradition: The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)");
        myMap.put(2, "Charity: I always trt to help those in need, no matter what the personal cost. (Good)");
        myMap.put(3, "Change: We must help bring about the changes the gods are constantly working in the world. (Chaotic)");
        myMap.put(4, "Power: I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)");
        myMap.put(5, "Faith: I trust the my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)");
        myMap.put(6, "Aspiration: I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings. (Any)");
        return myMap;
    }

    public static final Map<Integer, String> acolyteBondMap = createAcolyteBondMap();
    public static Map<Integer, String> createAcolyteBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I would die to recover an ancient relic of my faith that was lost long ago.");
        myMap.put(2, "I will someday get revenge on the corrupt temple heirarchy who branded me a heretic.");
        myMap.put(3, "I owe my life to the priest who took me in when my parents died.");
        myMap.put(4, "Everything I do is for the common people.");
        myMap.put(5, "I will do anything to protect the temple where I served.");
        myMap.put(6, "I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.");
        return myMap;
    }

    public static final Map<Integer, String> acolyteFlawMap = createAcolyteFlawMap();
    public static Map<Integer, String> createAcolyteFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I judge others harshly, and myself even more severely.");
        myMap.put(2, "I put too much trust in those who wield power within my temple's hierarchy");
        myMap.put(3, "My piety sometimes leads me to blindly trust those that profess faith in my god");
        myMap.put(4, "I am inflexible in my thinking.");
        myMap.put(5, "I am suspicious of strangers and expect the worst of them.");
        myMap.put(6, "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.");
        return myMap;
    }

    public static final Map<Integer, String> charlatanMap = createCharlatanMap();
    public static Map<Integer, String> createCharlatanMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I cheat at games of chance.");
        myMap.put(2, "I shave coins or forge documents");
        myMap.put(3, "I insinuate myself into people's lives to prey on their weakness and secure their fortunes");
        myMap.put(4, "I put on new identities like clothes");
        myMap.put(5, "I run sleight-of-hand cons on street corners.");
        myMap.put(6, "I convince people that worthless junk is worth their hard-earned money");
        return myMap;
    }

    public static final Map<Integer, String> charlatanPTMap = createCharlatanPTMap();
    public static Map<Integer, String> createCharlatanPTMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I fall in and out of love easily, and am always pursuing someone.");
        myMap.put(2, "I have a joke for every occasion, especially occasions where humor is inappropriate.");
        myMap.put(3, "Flattery is my preferred trick for getting what I want.");
        myMap.put(4, "I'm a born gambler who can't resist taking a risk for a potential payoff");
        myMap.put(5, "I lie about almost everything, even when there's no good reason to.");
        myMap.put(6, "Sarcasm and insults are my weapons of choice.");
        myMap.put(7, "I keep multiple holy symbols on me and invoke whatever deity might come in useful at any given moment.");
        myMap.put(8, "I pocket anything I see that might have some value.");
        return myMap;
    }

    public static final Map<Integer, String> charlatanIdealMap = createCharlatanIdealMap();
    public static Map<Integer, String> createCharlatanIdealMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Independence: I am a free spirit no one tells me what to do. (Chaotic)");
        myMap.put(2, "Fairness: I never target people who can't afford to lose a few coins. (Lawful)");
        myMap.put(3, "Charity: I distribute the money I acquire to the people who really need it. (Good)");
        myMap.put(4, "Creativity: I never run the same con twice. (Chaotic)");
        myMap.put(5, "Friendship: Material goods come and go. Bonds of friendship last forever. (Good)");
        myMap.put(6, "Aspiration: I'm determined to make something of myself. (Any)");
        return myMap;
    }

    public static final Map<Integer, String> charlatanBondMap = createCharlatanBondMap();
    public static Map<Integer, String> createCharlatanBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.");
        myMap.put(2, "I owe everything to my mentor a horrible person who's probably rotting in jail somewhere.");
        myMap.put(3, "Somewhere out there, I have a child who doesn't know me. I'm making the world better for him or her.");
        myMap.put(4, "I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.");
        myMap.put(5, "A powerful person killed someone I love. Some day soon, I'll have my revenge.");
        myMap.put(6, "I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself");
        return myMap;
    }

    public static final Map<Integer, String> charlatanFlawMap = createCharlatanFlawMap();
    public static Map<Integer, String> createCharlatanFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I can't resist a pretty face.");
        myMap.put(2, "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in.");
        myMap.put(3, "I'm convinced that no one could ever fool me the way I fool others.");
        myMap.put(4, "I'm too greedy for my own good. I can't resist taking a risk if there's money involved.");
        myMap.put(5, "I can't resist swindling people who are more powerful than me.");
        myMap.put(6, "I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.");
        return myMap;
    }

    public static final Map<Integer, String> criminalMap = createCriminalMap();
    public static Map<Integer, String> createCriminalMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Blackmailer");
        myMap.put(2, "Burglar");
        myMap.put(3, "Enforcer");
        myMap.put(4, "Fence");
        myMap.put(5, "Highway robber");
        myMap.put(6, "Hired killer");
        myMap.put(7, "Pickpocket");
        myMap.put(8, "Smuggler");
        return myMap;
    }

    public static final Map<Integer, String> criminalPTlMap = createCriminalPTMap();
    public static Map<Integer, String> createCriminalPTMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I always have a plan for what to do when things go wrong.");
        myMap.put(2, "I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.");
        myMap.put(3, "The first thing I do in a new place is note the locations of everything valuable, or where such things could be hidden.");
        myMap.put(4, "I would rather make a new friend than a new enemy.");
        myMap.put(5, "I am incredibly slow to trust. Those who seem the fairest often have the most to hide.");
        myMap.put(6, "I don't pay attention to the risks in a situation. Never tell me the odds.");
        myMap.put(7, "The best way to get me to do something is to tell me I can't do it.");
        myMap.put(8, "I blow up at the slightest insult.");
        return myMap;
    }

    public static final Map<Integer, String> criminalIdealMap = createCriminalIdealMap();
    public static Map<Integer, String> createCriminalIdealMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Honor: I don't steal from others in the trade (Lawful)");
        myMap.put(2, "Freedom: Chains are meant to be broken, as are those who would forge them. (Chaotic)");
        myMap.put(3, "Charity: I steal from the wealthy so that I can help people in need. (Good)");
        myMap.put(4, "Greed: I will do whatever it takes to become wealthy. (Evil)");
        myMap.put(5, "People: I'm loyal to my friends, not to any ideals, and everyone else can take a trip down to the Styx for all I care. (Neutral)");
        myMap.put(6, "Redemption: There's a spark of good in everyone. (Good)");
        return myMap;
    }

    public static final Map<Integer, String> criminalBondMap = createCriminalBondMap();
    public static Map<Integer, String> createCriminalBondMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I'm trying to pay off an old debt I owe to a generous benefactor");
        myMap.put(2, "My ill-gotten gains go to support my family.");
        myMap.put(3, "Something important was taken from me, and I aim to steal it back.");
        myMap.put(4, "I will become the greatest thief that ever lived.");
        myMap.put(5, "I'm guilty of a terrible crime. I hope I can redeem myself for it.");
        myMap.put(6, "Someone I loved died because of a mistake I made. That will never happen again");
        return myMap;
    }

    public static final Map<Integer, String> criminalFlawMap = createCriminalFlawMap();
    public static Map<Integer, String> createCriminalFlawMap(){
        Map<Integer, String> myMap =  new HashMap<>();
        myMap.put(1, "When I see something valuable, I can't think about anything but how to steal it.");
        myMap.put(2, "When faced with a choice between money and my friends, I usually choose the money.");
        myMap.put(3, "If there's a plan, I'llforget it. If I don't forget it. I'll ignore it.");
        myMap.put(4, "I have a \"tell\" that reveals when I'm lying");
        myMap.put(5, "I turn tail and run when things look bad.");
        myMap.put(6, "An innocent person is in prison for a crime that I committed. I'm okay with that.");
        return myMap;
    }

    public static final Map<Integer, String> entertainerMap = createEntertainerMap();
    public static Map<Integer, String> createEntertainerMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Actor");
        myMap.put(2, "Dancer");
        myMap.put(3, "Fire-eater");
        myMap.put(4, "Jester");
        myMap.put(5, "Juggler");
        myMap.put(6, "Instrumentalist");
        myMap.put(7, "Poet");
        myMap.put(8, "Singer");
        myMap.put(9, "Storyteller");
        myMap.put(10, "Tumbler");
        return myMap;
    }

    public static final Map<Integer, String> entertainerPTMap = createEntertainerPTMap();
    public static Map<Integer, String> createEntertainerPTMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I know a story relevant to almost every situation.");
        myMap.put(2, "Whenever I come to a new place, I collect local rumors and spread gossip");
        myMap.put(3, "I'm a hopeless romantic, always searching for that \"special someone\"");
        myMap.put(4, "Nobody stays angry at me or around me for long, since I can defuse any amount of tension.");
        myMap.put(5, "I love a good insult, even one directed at me.");
        myMap.put(6, "I get bitter if I'm not the center of attention.");
        myMap.put(7, "I'll settle for nothing less than perfection.");
        myMap.put(8, "I change my mood or my mind as quickly as I change key in a song.");
        return myMap;
    }

    public static final Map<Integer, String> entertainerIdealMap = createEntertainerIdealMap();
    public static Map<Integer, String> createEntertainerIdealMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"Beauty: When I perform, I make the world better than it was. (Good)");
        myMap.put(2,"Tradition: The stories, legends, and songs of the past must never be forgotten, for they teach us who we are. (Lawful)");
        myMap.put(3,"Creativity: The world is in need of new ideas and bold action. (Chaotic)");
        myMap.put(4,"Greed: I’m only in it for the money and fame. (Evil)");
        myMap.put(5,"People: I like seeing the smiles on people’s faces when I perform. That’s all that matters. (Neutral)");
        myMap.put(6,"Honesty: Art should reflect the soul; it should come from within and reveal who we really are. (Any)");
        return myMap;
    }

    public static final Map<Integer, String> entertainerBondMap = createEntertainerBondMap();
    public static Map<Integer, String> createEntertainerBondMap() {
        Map<Integer, String> myMap =  new HashMap<>();
        myMap.put(1,"My instrument is my most treasured possession, and it reminds me of someone I love.");
        myMap.put(2,"Someone stole my precious instrument, and someday I’ll get it back.");
        myMap.put(3,"I want to be famous, whatever it takes.");
        myMap.put(4,"I idolize a hero of the old tales and measure my deeds against that person’s");
        myMap.put(5,"I will do anything to prove myself superior to my hated rival.");
        myMap.put(6,"I would do anything for the other members of my old troupe.");
        return myMap;
    }

    public static final Map<Integer, String> entertainerFlawMap = createEntertainerFlawMap();
    public static Map<Integer, String> createEntertainerFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"I’ll do anything to win fame and renown.");
        myMap.put(2,"I’m a sucker for a pretty face.");
        myMap.put(3,"A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.");
        myMap.put(4,"I once satirized a noble who still wants my head. It was a mistake that I will likely repeat.");
        myMap.put(5,"I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble.");
        myMap.put(6,"Despite my best efforts, I am unreliable to my friends.");
        return myMap;
    }

    public static final Map<Integer, String> folkHeroMap = createFolkHeroMap();
    public static Map<Integer, String> createFolkHeroMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I stood up to a tyrant's agents");
        myMap.put(2, "I saved people during a nature disaster");
        myMap.put(3, "I stood alone against a terrible monster.");
        myMap.put(4, "I stole a corrupt merchant to help the poor.");
        myMap.put(5, "I led a militia to fight off and invading army.");
        myMap.put(6, "I broke into a tyrant's castle and stole weapons to arm the people");
        myMap.put(7, "I trained the peasantry to use farm implements as weapon against a tyrant's soldiers");
        myMap.put(8, "A lord rescinded an unpopular decree after I led a symbolic act of protest against it.");
        myMap.put(9, "A celestial, fey, or similar creature gave me a blessing or revealed my secret origin.");
        myMap.put(10, "Recruited into a lord's army, I rose to leadership and was commended for my heroism");
        return myMap;
    }

    public static final Map<Integer, String> folkHeroPTMap = createFolkHeroPTMap();
    public static Map<Integer, String> createFolkHeroPTMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"I judge people by their actions, not their words.");
        myMap.put(2,"If someone is in trouble, I’m always ready to lend help.");
        myMap.put(3,"When I set my mind to something, I follow through no matter what gets in my way.");
        myMap.put(4,"I have a strong sense of fair play and always try to find the most equitable solution to arguments.");
        myMap.put(5,"I’m confident in my own abilities and do what I can to instill confidence in others.");
        myMap.put(6,"Thinking is for other people. I prefer action.");
        myMap.put(7,"I misuse long words in an attempt to sound smarter.");
        myMap.put(8,"I get bored easily. When am I going to get on with my destiny?");
        return myMap;
    }

    public static final Map<Integer, String> folkHeroIdealMap = createFolkHeroIdealMap();
    public static Map<Integer, String> createFolkHeroIdealMap() {
        Map<Integer, String> myMap =  new HashMap<>();
        myMap.put(1,"Respect: People deserve to be treated with dignity and respect. (Good)");
        myMap.put(2,"Fairness: No one should get preferential treatment before the law, and no one is above the law. (Lawful)");
        myMap.put(3,"Freedom: Tyrants must not be allowed to oppress the people. (Chaotic)");
        myMap.put(4,"Might: If I become strong, I can take what I want—what I deserve. (Evil)");
        myMap.put(5,"Sincerity: There’s no good in pretending to be something I’m not. (Neutral)");
        myMap.put(6,"Destiny: Nothing and no one can steer me away from my higher calling. (Any)");
        return myMap;
    }

    public static final Map<Integer, String> folkHeroBondMap = createFolkHeroBondMap();
    public static Map<Integer, String> createFolkHeroBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"I have a family, but I have no idea where they are. One day, I hope to see them again.");
        myMap.put(2,"I worked the land, I love the land, and I will protect the land.");
        myMap.put(3,"A proud noble once gave me a horrible beating, and I will take my revenge on any bully I encounter.");
        myMap.put(4,"My tools are symbols of my past life, and I carry them so that I will never forget my roots.");
        myMap.put(5,"I protect those who cannot protect themselves.");
        myMap.put(6,"I wish my childhood sweetheart had come with me to pursue my destiny.");
        return myMap;
    }

    public static final Map<Integer, String> folkHeroFlawMap = createFolkHeroFlawMap();
    public static Map<Integer, String> createFolkHeroFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"The tyrant who rules my land will stop at nothing to see me killed.");
        myMap.put(2,"I’m convinced of the significance of my destiny, and blind to my shortcomings and the risk of failure.");
        myMap.put(3,"The people who knew me when I was young know my shameful secret, so I can never go home again.");
        myMap.put(4,"I have a weakness for the vices of the city, especially hard drink.");
        myMap.put(5,"Secretly, I believe that things would be better if I were a tyrant lording over the land.");
        myMap.put(6,"I have trouble trusting in my allies.");
        return myMap;
    }

    public static final Map<Integer, String> guildArtisanMap = createGuildArtisanMap();
    public static Map<Integer, String> createGuildArtisanMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"Alchemists and apothecaries");
        myMap.put(2,"Armorers, locksmiths, and finesmiths");
        myMap.put(3,"Brewers, distillers, and vintners");
        myMap.put(4,"Calligraphers, scribes, and scriveners");
        myMap.put(5,"Carpenters, roofers, and plasterers");
        myMap.put(6,"Cartographers, surveyors, and chart-makers");
        myMap.put(7,"Cobblers and shoemakers");
        myMap.put(8,"Cooks and bakers");
        myMap.put(9,"Glassblowers and glaziers");
        myMap.put(10,"Jewelers and gemcutters");
        myMap.put(11,"Leatherworkers, skinners, and tanners");
        myMap.put(12,"Masons and stonecutters");
        myMap.put(13,"Painters, limners, and sign-makers");
        myMap.put(14,"Potters and tile-makers");
        myMap.put(15,"Shipwrights and sailmakers");
        myMap.put(16,"Smiths and metal-forgers");
        myMap.put(17,"Tinkers, pewterers, and casters");
        myMap.put(18,"Wagon-makers and wheelwrights");
        myMap.put(19,"Weavers and dyers");
        myMap.put(20,"Woodcarvers, coopers, and bowyers");
        return myMap;
    }

    public static final Map<Integer, String> guildArtisanPTMap = createGuildArtisanPTMap();
    public static Map<Integer, String> createGuildArtisanPTMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"I believe that anything worth doing is worth doing right. I can’t help it— I’m a perfectionist.");
        myMap.put(2,"I’m a snob who looks down on those who can’t appreciate fine art.");
        myMap.put(3,"I always want to know how things work and what makes people tick.");
        myMap.put(4,"I’m full of witty aphorisms and have a proverb for every occasion.");
        myMap.put(5,"I’m rude to people who lack my commitment to hard work and fair play.");
        myMap.put(6,"I like to talk at length about my profession.");
        myMap.put(7,"I don’t part with my money easily and will haggle tirelessly to get the best deal possible.");
        myMap.put(8,"I’m well known for my work, and I want to make sure everyone appreciates it. I'm always taken aback when people haven’t heard of me.");
        return myMap;
    }

    public static final Map<Integer, String> guildArtisanIdealMap = createGuildArtisanIdealMap();
    public static Map<Integer, String> createGuildArtisanIdealMap() {
        Map<Integer, String> myMap =  new HashMap<>();
        myMap.put(1,"Community: It is the duty of all civilized people to strengthen the bonds of community and the security of civilization. (Lawful)");
        myMap.put(2,"Generosity: My talents were given to me so that I could use them to benefit the world. (Good)");
        myMap.put(3,"Freedom: Everyone should be free to pursue his or her own livelihood. (Chaotic)");
        myMap.put(4,"Greed: I’m only in it for the money. (Evil)");
        myMap.put(5,"People: I’m committed to the people I care about, not to ideals. (Neutral)");
        myMap.put(6,"Aspiration: I work hard to be the best there is at my craft.");
        return myMap;
    }

    public static final Map<Integer, String> guildArtisanBondMap = createGuildArtisanBondMap();
    public static Map<Integer, String> createGuildArtisanBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        return myMap;
    }

    public static final Map<Integer, String> guildArtisanFlawMap = createGuildArtisanFlawMap();
    public static Map<Integer, String> createGuildArtisanFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        return myMap;
    }
}