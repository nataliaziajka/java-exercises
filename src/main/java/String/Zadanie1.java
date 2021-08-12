package String;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie: ");
        String imie = scanner.next();
        System.out.println("Wprowadz nazwisko: ");
        String nazwisko = scanner.next();
        System.out.println("Twoje imię i nazwisko to " + (imie + " " +nazwisko));
    }
}
