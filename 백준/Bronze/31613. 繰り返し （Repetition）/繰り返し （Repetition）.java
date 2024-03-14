import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(x < n) {

            switch (x % 3) {

                case 0 : x += 1; break;
                case 1 : x *= 2; break;
                case 2 : x *= 3; break;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
