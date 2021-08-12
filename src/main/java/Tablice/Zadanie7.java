package Tablice;
/*
Napisz metodę, która zwraca sumę elementów tablicy całkowitej.
sum([1,2,3]) = 6
 */

public class Zadanie7 {

    static int sum(int[] added){
    int sum=0;
    for(int value:added){
        sum+=value;
    }
    return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(sum(array));
    }
}
