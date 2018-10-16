package edu.bsu.cs222.finalproject.functionality;

import java.util.Random;

public class DiceRoll {
    private Random random = new Random();

    int D100() {
        return random.nextInt(100)+1;
    }

    private int D20() {
            return random.nextInt(20)+1;
    }

    private int D10() {
        return random.nextInt(10)+1;
    }

    private int D6() {
        return random.nextInt(6)+1;
    }

    private int D4() {
        return random.nextInt(4)+1;
    }


}
