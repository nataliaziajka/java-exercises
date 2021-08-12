package Petle;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        int wysokoscWiezyczki;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc wiezyczki");
        wysokoscWiezyczki = scanner.nextInt();

        StringBuilder stars = new StringBuilder("*");
        for(int i=1; i<=wysokoscWiezyczki;i++){
            System.out.println(stars);
            stars.append("*");
        }
    }
}
