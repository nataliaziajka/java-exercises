package String;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = scanner.next();
        System.out.println("Pierwsza litera z Twojego wyrazu to:" + wyraz.charAt(0));

    }
}
