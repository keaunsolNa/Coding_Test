import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = gcd(Math.max(a, b), Math.min(a, b));

        for (int i = 1; i <= gcd; i++) sb.append("1");

        System.out.println(sb);


    }
    private static long gcd(long num1, long num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
