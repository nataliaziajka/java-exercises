package Zmienne;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.println("Iloraz liczb wynosi:" + (double)(a*b));
    }
}
