package ru.bain.main;

public class Year {
    public static void main(String[] args) {
        leapYearCount(100);
    }

    public static int leapYearCount(int year) {
        year = (year / 4) - (year / 100) + (year / 400);
        System.out.println(year);
        return year;

    }

}


