package Metody;

public class Zadanie4 {

    public static void main(String[] args) {

        int division = divide(10, 5);
        System.out.println(division);

    }
    public static int divide(int a, int b){
        if(b==0) {
            System.out.println("Nie dziel przez zero");
            return 0;
        }
        return a/b;
    }
}
