package ru.bain.main;

public class FlipBit {
    public static void main(String[] args) {
        flipBit(15, 1);
        System.out.println();

    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
}
