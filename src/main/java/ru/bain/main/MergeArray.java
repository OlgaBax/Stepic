/*Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один
 отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 */
package ru.bain.main;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{0, 2, 2};
        int[] a2 = new int[]{1, 3, 5, 7};
        mergeArrays(a1, a2);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int indexa1 = 0;
        int indexa2 = 0;
        for (int indexResult = 0; indexResult < result.length; indexResult++) {
            if (indexa1 > a1.length-1){
                result[indexResult] = a2[indexa2++]; // инкремент
            } else if (indexa2 > a2.length-1){
                result[indexResult] = a1[indexa1++];
            } else if (a1[indexa1]<a2[indexa2]) {
                result[indexResult] = a1[indexa1++];
            } else {
                result[indexResult] = a2[indexa2++];
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}

