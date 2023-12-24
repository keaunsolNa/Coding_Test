import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long max = 0;
        long min = 0;
        if(a - k >= n - 1) {
            max = n;

            if((a - k) % m == 0) min = (a - k) / m + 1;
            else min = (a - k) / m + 2;
        }

        else {
            max = a - k + 1;
            if(a - k == 0) min = 1;
            else if((a - k) % m == 0) min = (a - k) / m + 1;
            else min = (a - k) / m + 2;
        }

        System.out.println(max + " " + min);


    }
}

