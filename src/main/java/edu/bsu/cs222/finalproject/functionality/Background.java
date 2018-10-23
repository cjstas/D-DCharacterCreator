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


    private static final Map<Integer, String> criminalMap = createCriminalMap();
    private static Map<Integer, String> createCriminalMap() {
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