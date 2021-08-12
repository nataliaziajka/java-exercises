package Petle;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        int searchNumber = 600;
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe");
            userNumber = scanner.nextInt();
            if (userNumber > searchNumber) {
                System.out.println("Podales zbyt duza liczbe");
            } else if (userNumber < searchNumber) {
                System.out.println("Podales za mala liczbe");
            }
        } while (searchNumber != userNumber);
        System.out.println("Podales poprawna liczbe");
    }
}
