package Metody;

public class Zadanie6 {

    public static void main(String[] args) {

        int sum = sumChar(45);
        System.out.println(sum);
    }

    private static int sumChar(int a) {
        String number = String.valueOf(a);
        int sum =0;
        for(int i =0; i< number.length();i++ ){

            sum += Character.getNumericValue(number.charAt(i));

        }

        return sum;

    }

}
