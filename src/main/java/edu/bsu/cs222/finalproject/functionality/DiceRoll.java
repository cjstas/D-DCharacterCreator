package edu.bsu.cs222.finalproject.functionality;

import java.util.Random;

@SuppressWarnings("CanBeFinal")
public class DiceRoll {
    private static Random random = new Random();
    public static int D100() {
        return random.nextInt(100)+1;
    }

    public static int D20() {
            return random.nextInt(20)+1;
    }

    public static int D10() {
        return random.nextInt(10)+1;
    }

    public static int D12() {
        return random.nextInt(12)+1;
    }

    public static int D8() {return random.nextInt(8)+1;}

    public static int D6() {
        return random.nextInt(6)+1;
    }

    public static int D4() {
        return random.nextInt(4)+1;
    }


}
