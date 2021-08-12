package String;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz do zamiany na male litery: ");
        String wyraz = scanner.next();
        System.out.println("Zamieniony wyraz na małe litery:" + wyraz.toLowerCase());
    }
}
