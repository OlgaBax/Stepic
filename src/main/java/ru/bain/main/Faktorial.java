package ru.bain.main;

import java.math.BigInteger;

public class Faktorial {
    public static void main(String[] args) {
        factorial(4);
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE; // присвоили результату значение 1.
        int counterNumber = 1;
        for (counterNumber = 1; counterNumber <= value;counterNumber++ ){
            result = result.multiply(BigInteger.valueOf(counterNumber));
            /* BigInteger.valueOf() - преобразует тип int в BigInteger, т.к counterNumber-это int;
               multiply - метод, который умножает числа в классе BigInteger.
             */

        }
        System.out.println(result);
        return result;
    }
}

