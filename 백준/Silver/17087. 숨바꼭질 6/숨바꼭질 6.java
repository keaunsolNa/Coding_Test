import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long gcd = Math.abs(Integer.parseInt(st.nextToken()) - s);
        for (int i = 1; i < n; i++)
            gcd = Math.min(gcd, gcd(Math.abs(Integer.parseInt(st.nextToken()) - s), gcd));

        System.out.println(gcd);
    }
    private static long gcd(long num1, long num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
