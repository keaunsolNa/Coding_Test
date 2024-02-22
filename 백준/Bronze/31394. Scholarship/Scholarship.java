import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean flag = false;
        boolean flag2 = true;
        long total = 0;

        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp == 3) { flag = true; break; }
            if(temp != 5) { flag2 = false; }

            total += temp;
        }

        double avr = (double) total / n;

        if(flag) System.out.println("None");
        else if(flag2) System.out.println("Named");
        else if(avr >= 4.5) System.out.println("High");
        else System.out.println("Common");
    }


}