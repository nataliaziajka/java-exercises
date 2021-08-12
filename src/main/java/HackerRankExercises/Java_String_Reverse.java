package HackerRankExercises;
import java.util.*;
public class Java_String_Reverse {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.println(isPalindrom(s));
        }
        private static String isPalindrom(String s) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String rev = sb.toString();
            if (s.equals(rev)) {
                return "Yes";
            }
            else {
            }
            return "No";
        }
    }
