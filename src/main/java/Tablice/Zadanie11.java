package Tablice;
/*
Napisz metodę, która zwraca posortowaną tablicę liczb.
mySort([4,1,9,15]) = [1,4,9,15]
 */

import java.util.Arrays;

public class Zadanie11 {

    public static void main(String[] args) {

        int[] beforeSort = new int[]{4,1,9,15};
        Arrays.sort(beforeSort);
        System.out.println(Arrays.toString(beforeSort));
    }
}
