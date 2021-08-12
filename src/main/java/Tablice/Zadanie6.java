package Tablice;

/*
Zakładamy, że mamy 2 tablice 2 elementowe. Nasza metoda powinna zwrócić
nową tablicę, która jest połączona z dwóch tablic.
plusTwoArrays([-4, 4], [8, 2]) → [-4, 4, 8, 2]
plusTwoArrays([9, 1], [3, 10]) → [9, 1, 3, 10]
 */

public class Zadanie6 {

    static int[] sumArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array1.length + array2.length; i++) {
            array3[i] = array2[j++];
        }
        return array3;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{5, 6, 7, 8};
        int[] sum = sumArrays(a1, a2);
        for (int value : sum) {
            System.out.println(value);
        }
    }
}