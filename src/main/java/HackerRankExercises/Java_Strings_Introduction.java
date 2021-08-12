package HackerRankExercises;
import java.util.*;
public class Java_Strings_Introduction {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A = sc.nextLine();
            String B = sc.nextLine();

            int C = A.length();
            int D = B.length();
            System.out.println(C+D);

            int i = A.compareTo(B);
            if(i>0){
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            String cap1 = A.substring(0, 1).toUpperCase() + A.substring(1);
            String cap2 = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(cap1 + " " + cap2);
        }
    }

