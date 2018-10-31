package edu.bsu.cs222.finalproject.functionality;

import java.util.HashMap;
import java.util.Map;

public class Background {

    private static final Map<Integer, String> acolytePTMap = createAcolytePTMap();
    private static Map<Integer, String> createAcolytePTMap() {
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

    private static final Map<Integer, String> acolyteIdealMap = createAcolyteIdealMap();
    private static Map<Integer, String> createAcolyteIdealMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Tradition: The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)");
        myMap.put(2, "Charity: I always trt to help those in need, no matter what the personal cost. (Good)");
        myMap.put(3, "Change: We must help bring about the changes the gods are constantly working in the world. (Chaotic)");
        myMap.put(4, "Power: I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)");
        myMap.put(5, "Faith: I trust the my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)");
        myMap.put(6, "Aspiration: I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings. (Any)");
        return myMap;
    }

    private static final Map<Integer, String> acolyteBondMap = createAcolyteBondMap();
    private static Map<Integer, String> createAcolyteBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I would die to recover an ancient relic of my faith that was lost long ago.");
        myMap.put(2, "I will someday get revenge on the corrupt temple heirarchy who branded me a heretic.");
        myMap.put(3, "I owe my life to the priest who took me in when my parents died.");
        myMap.put(4, "Everything I do is for the common people.");
        myMap.put(5, "I will do anything to protect the temple where I served.");
        myMap.put(6, "I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.");
        return myMap;
    }

    private static final Map<Integer, String> acolyteFlawMap = createAcolyteFlawMap();
    private static Map<Integer, String> createAcolyteFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I judge others harshly, and myself even more severely.");
        myMap.put(2, "I put too much trust in those who wield power within my temple's hierarchy");
        myMap.put(3, "My piety sometimes leads me to blindly trust those that profess faith in my god");
        myMap.put(4, "I am inflexible in my thinking.");
        myMap.put(5, "I am suspicious of strangers and expect the worst of them.");
        myMap.put(6, "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.");
        return myMap;
    }

    private static final Map<Integer, String> charlatanMap = createCharlatanMap();
    private static Map<Integer, String> createCharlatanMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I cheat at games of chance.");
        myMap.put(2, "I shave coins or forge documents");
        myMap.put(3, "I insinuate myself into people's lives to prey on their weakness and secure their fortunes");
        myMap.put(4, "I put on new identities like clothes");
        myMap.put(5, "I run sleight-of-hand cons on street corners.");
        myMap.put(6, "I convince people that worthless junk is worth their hard-earned money");
        return myMap;
    }

    private static final Map<Integer, String> charlatanPTMap = createCharlatanPTMap();
    private static Map<Integer, String> createCharlatanPTMap() {
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

    private static final Map<Integer, String> charlatanIdealMap = createCharlatanIdealMap();
    private static Map<Integer, String> createCharlatanIdealMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Independence: I am a free spirit no one tells me what to do. (Chaotic)");
        myMap.put(2, "Fairness: I never target people who can't afford to lose a few coins. (Lawful)");
        myMap.put(3, "Charity: I distribute the money I acquire to the people who really need it. (Good)");
        myMap.put(4, "Creativity: I never run the same con twice. (Chaotic)");
        myMap.put(5, "Friendship: Material goods come and go. Bonds of friendship last forever. (Good)");
        myMap.put(6, "Aspiration: I'm determined to make something of myself. (Any)");
        return myMap;
    }

    private static final Map<Integer, String> charlatanBondMap = createCharlatanBondMap();
    private static Map<Integer, String> createCharlatanBondMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.");
        myMap.put(2, "I owe everything to my mentor a horrible person who's probably rotting in jail somewhere.");
        myMap.put(3, "Somewhere out there, I have a child who doesn't know me. I'm making the world better for him or her.");
        myMap.put(4, "I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.");
        myMap.put(5, "A powerful person killed someone I love. Some day soon, I'll have my revenge.");
        myMap.put(6, "I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself");
        return myMap;
    }

    private static final Map<Integer, String> charlatanFlawMap = createCharlatanFlawMap();
    private static Map<Integer, String> createCharlatanFlawMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I can't resist a pretty face.");
        myMap.put(2, "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in.");
        myMap.put(3, "I'm convinced that no one could ever fool me the way I fool others.");
        myMap.put(4, "I'm too greedy for my own good. I can't resist taking a risk if there's money involved.");
        myMap.put(5, "I can't resist swindling people who are more powerful than me.");
        myMap.put(6, "I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.");
        return myMap;
    }

    private static final Map<Integer, String> criminalMap = createCriminalMap();
    private static Map<Integer, String> createCriminalMap(){
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

    private static final Map<Integer, String> criminaPTlMap = createCriminalPTMap();
    private static Map<Integer, String> createCriminalPTMap(){
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

    private static final Map<Integer, String> criminalIdealMap = createCriminalIdealMap();
    private static Map<Integer, String> createCriminalIdealMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Honor: I don't steal from others in the trade (Lawful)");
        myMap.put(2, "Freedom: Chains are meant to be broken, as are those who would forge them. (Chaotic)");
        myMap.put(3, "Charity: I steal from the wealthy so that I can help people in need. (Good)");
        myMap.put(4, "Greed: I will do whatever it takes to become wealthy. (Evil)");
        myMap.put(5, "People: I'm loyal to my friends, not to any ideals, and everyone else can take a trip down to the Styx for all I care. (Neutral)");
        myMap.put(6, "Redemption: There's a spark of good in everyone. (Good)");
        return myMap;
    }

    private static final Map<Integer, String> criminalBondMap = createCriminalBondMap();
    private static Map<Integer, String> createCriminalBondMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "I'm trying to pay off an old debt I owe to a generous benefactor");
        myMap.put(2, "My ill-gotten gains go to support my family.");
        myMap.put(3, "Something important was taken from me, and I aim to steal it back.");
        myMap.put(4, "I will become the greatest thief that ever lived.");
        myMap.put(5, "I'm guilty of a terrible crime. I hope I can redeem myself for it.");
        myMap.put(6, "Someone I loved died because of a mistake I made. That will never happen again");
        return myMap;
    }

    private static final Map<Integer, String> entertainerMap = createEntertainerMap();
    private static Map<Integer, String> createEntertainerMap() {
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

    private static final Map<Integer, String> folkHeroMap = createFolkHeroMap();
    private static Map<Integer, String> createFolkHeroMap() {
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

}