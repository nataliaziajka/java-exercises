package String;

import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz swoj wyraz: ");
        String wyraz = scanner.next();
        System.out.println("Czy wyraz konczy sie na \"tka\"?: " + wyraz.endsWith("tka"));
    }


}
