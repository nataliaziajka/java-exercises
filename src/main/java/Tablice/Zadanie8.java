package Tablice;
/*
Napisz metodę, która zwraca największy element tablicy całkowitej.
max([2,3,5,1,20,25]) = 25
 */

import java.util.Arrays;

public class Zadanie8 {

    private static Object a;

    static int max(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
    static int max2(int[]array ){
        int max = array[0];
        for(int value:array){
            if(value>max){
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arrayX = new int[]{35 , 3 , 3001 , 51 , 255 , 2000 , 6000 , 713 ,- 15 ,- 10 , 7000};
        System.out.println(max(arrayX));
        System.out.println(max2(arrayX));
    }
}
