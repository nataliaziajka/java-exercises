package Tablice;

/*Napisz metodę, która zwraca element środkowy tablicy.
middleElement( ([1, 2, 3]) = 2
middleElement( ([1, 5, 3, 4]) = 5
*/

public class Zadanie5 {

    private static int midArray(int [] array){
        return array[(array.length-1)/2];
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        System.out.println(midArray(array1));
    }


}
