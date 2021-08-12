package Zmienne;

import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = scanner.nextInt();
        System.out.println("Liczba b po zmienie: ");
        b= b+3;
        System.out.println(b);
    }
}
