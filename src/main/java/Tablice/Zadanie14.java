package Tablice;
/*
Napisz metodę, która jako argument przyjmuje tablicę Stringów. Jako wynik ma
zwracać tablice tej samej długości, w której wyrazy są napisane małymi literami(
duże litery zamieniamy na małe).
 */

import java.util.Arrays;

public class Zadanie14 {

     public static String[] toLowerCase(String[] array){
        String[] arrayStr= new String[array.length];
        for( int i =0; i< array.length;i++){
            arrayStr[i]= array[i].toLowerCase();
        }
        return arrayStr;
    }

    public static void main(String[] args) {
        String[] arrayAfter = new String[]{"Kasia", "ma","Królika"};
        toLowerCase(arrayAfter);
    }


}
