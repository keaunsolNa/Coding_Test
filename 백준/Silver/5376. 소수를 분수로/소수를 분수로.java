import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            String input = br.readLine();
            input = input.substring(2);
            int idx = input.indexOf('(');

            long up, down;

            if(idx == -1) {

                up = Long.parseLong(input);
                down = (long) Math.pow(10, input.length());

            } else {

                StringBuilder a = new StringBuilder();
                StringBuilder b = new StringBuilder();

                for(int i = 0; i < idx; i++) a.append(input.charAt(i));

                for(int i = 0; i < input.length() - 1; i++) {

                    if(i == idx) continue;
                    b.append(input.charAt(i));
                }

                String A = a.toString();
                String B = b.toString();
                up = (A.isEmpty()) ? Long.parseLong(B) : Long.parseLong(B) - Long.parseLong(A);
                down = (long) Math.pow(10, B.length()) - (long) Math.pow(10, A.length());
            }

            long g = GCD(up, down);

            up /= g;
            down /= g;
            System.out.println(up + "/" + down);
        }
    }

    private static long GCD(long n, long m) {

        if(m == 0) return n;
        return GCD(m, n % m);
    }

}