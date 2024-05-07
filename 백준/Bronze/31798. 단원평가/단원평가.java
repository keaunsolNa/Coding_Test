import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == 0) {
            System.out.println(c * c - b);
        }

        else if (b == 0) {
            System.out.println(c * c - a);
        }

        else if (c == 0) {
            System.out.println((int)Math.sqrt(a + b));
        }
    }



}
