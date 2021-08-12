package Zmienne;

import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbe: ");
        int c = scanner.nextInt();
        System.out.println("Srednia powyższych liczb wynosi: " +((double)(a+b+c)/3));
    }
}
