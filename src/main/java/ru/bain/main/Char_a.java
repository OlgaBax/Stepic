package ru.bain.main;

public class Char_a {
    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }
    public static char charExpression(int a) {
        return  (char)('\\'+ a);
    }
}
