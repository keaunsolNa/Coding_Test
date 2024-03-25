import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 1; i <= 9; i++) {

            System.out.println("? A " + i);
            System.out.flush();

            int resp = sc.nextInt();

            if(resp == 1) { a = i; break; }
        }

        for (int i = 1; i <= 9; i++) {

            System.out.println("? B " + i);
            System.out.flush();

            int resp = sc.nextInt();

            if(resp == 1) { b = i; break; }
        }

        System.out.println("! " + (a + b));
        System.out.flush();
    }



}