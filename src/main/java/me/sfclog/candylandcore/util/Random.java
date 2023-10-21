package me.sfclog.candylandcore.util;

public class Random {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
