import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int aWin = 0;
        int bWin = 0;

        while(a >= 3) {
            a -= 3;
            aWin++;
        };

        while(b >= 3) {
            b -= 3;
            bWin++;
        };

        if(a != b) System.out.println(-1);
        else System.out.println(aWin + " " + a + " " + bWin);

    }

}