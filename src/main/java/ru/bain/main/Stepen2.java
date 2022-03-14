package ru.bain.main;

public class Stepen2 {
    public static boolean isPowerOfTwo(int value) {
        int a = Math.abs(value);// возвращает модуль числа
        Integer b = Integer.bitCount(a); // bitCount(a)-возвращает количество 1 из двоичной системы исчисления.
        System.out.println(a);
        return b == 1 ? true : false;

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}