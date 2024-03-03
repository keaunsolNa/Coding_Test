import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println("? 1");
        System.out.flush();
        int a = Integer.parseInt(br.readLine());

        System.out.println("? " + n);
        System.out.flush();
        int b = Integer.parseInt(br.readLine());

        if (a == 1 && b == 0) System.out.println("! -1");
        else if (a == 0 && b == 1) System.out.println("! 1");
        else System.out.println("! 0");

        System.out.flush();
        System.exit(0);
    }

}