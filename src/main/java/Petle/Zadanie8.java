package Petle;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        String correctPassword = "Polska";
        String yourPassword;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj haslo");
            yourPassword = scanner.next();

        }
        while(!correctPassword.equals(yourPassword));
        System.out.println("Podales poprawne haslo");
    }
}
