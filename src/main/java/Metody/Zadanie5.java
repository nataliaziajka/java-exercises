package Metody;

public class Zadanie5 {

    public static void main(String[] args) {

        boolean numbers = isPitarogas(3, 4, 5);
        System.out.println(numbers);
    }
    public static boolean isPitarogas(int a, int b, int c){
        if((a * a) + (b * b) == c * c) {
            return true;
        }
        else {
            return false;
        }
    }

}
