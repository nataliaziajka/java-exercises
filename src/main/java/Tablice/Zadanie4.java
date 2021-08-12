package Tablice;

public class Zadanie4 {

    /*Napisz metodę, która dla danej tablicy zwraca sumę pierwszego i ostatniego
elementu tablicy.
sumArray([1, 2, 3]) = 1+2 = 3
*/
    private static int sumArray(int[] array){
        return array[0]+array[array.length-1];

    }

    public static void main(String[] args) {
        int[] array = new int[]{12 , - 2 , 3 , 4};
        System.out.println(sumArray(array));
    }
}
