package Tablice;

/*Napisz metodę, która dla danej tablicy liczb całkowitych zwraca ostatni element
tablicy.*/

public class Zadanie2 {


    public static int last(int[] array) {
        int len = array.length;
        if(len ==0){
            return Integer.MIN_VALUE;
        }
        return array[len-1];
    }

    public static void main(String[] args) {
        System.out.println(last(new int[]{12, 412, 412, 31, 55, 526}));

    }

}
