package Tablice;


/*Napisz metodę, która odwraca daną tablicę liczb całkowitych.
swap([1,2,3]) = [3,2,1]
*/

public class Zadanie9 {

    private static void reverse(int[] arr, int length){
        for(int i=length;i>0;i--)    {
            System.out.println(arr[i-1]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        reverse(arr, arr.length);

    }

}
