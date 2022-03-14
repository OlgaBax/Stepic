//Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
// Во всех остальных случаях метод должен возвращать false.
package ru.bain.main;

public class Stepik2_1_1 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(false, true, true, true));

    }

    public static boolean booleanExpression(boolean first, boolean second, boolean third, boolean fourth) {

//        return ((first  && second ) || (second  && third ) || (third  && fourth ) ||
//                (first  && third ) || (first  && fourth ) || (second  && fourth ));
//    }


        if ((first && second) && (!third && !fourth)) { //  в ответе будет всего 3 логич оператора и 4 знака сравнения
                                                          // переписать код в одну строку.
            return true;
        }
        if ((second && third) && (!first && !fourth)) {
            return true;
        }
        if ((third && fourth) && (!first && !second)) {
            return true;
        }
        if ((first && third) && (!second && !fourth)) {
            return true;
        }
        if ((first && fourth) && (!second && !third)) {
            return true;
        }
        if ((second && fourth) && (!first && !third)) {
            return true;
        }
        return false;
    }
}

