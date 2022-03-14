package ru.bain.main;

public class Z3 {
    public static void main(String[] args) {
        doubleExpression(0.2, 0.3, 1.1);
    }

    private static final double EPSILON = 0.0001;

    public static boolean doubleExpression(double a, double b, double c) {
        boolean result;

        result = Math.abs(a + b - c) < 0.0001;

//        if ((a + b - c) < EPSILON) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        System.out.println(result);
        return result;
    }

}
