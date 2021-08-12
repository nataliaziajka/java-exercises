package Tablice;

/*Napisz metodę, która jako argument przyjmuje zawsze tablice składającą się z
dwóch elementów liczb całkowitych. Metoda ma zwróci sumę elementów tablicy.
sum([1,2]) = 3
sum([4,8]) = 12
*/

public class Zadanie3 {

    public static int sum(int[] numbers) {
        int result = numbers[0] + numbers[1];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{2,1}));
    }

}
