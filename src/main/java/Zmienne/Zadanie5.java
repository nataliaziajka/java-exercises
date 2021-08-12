package Zmienne;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();

        System.out.println("Suma dwoch powyzszych liczb wynosi:" + ( a+b));
    }
}
