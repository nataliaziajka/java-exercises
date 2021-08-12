package Tablice;

/*Napisz metodę, która dla danej tablicy liczb całkowitych zwraca pierwszy element
        tablicy.*/

public class Zadanie1 {

    public static int first(int[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(first(new int[]{12, 412, 412, 31, 55, 523}));

    }

}
