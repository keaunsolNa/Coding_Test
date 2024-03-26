import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       long ans = 1;

       if (n == 0 && m == 1) {
           System.out.println(0);
           return;
       }
       for (int i = 0; i < n; i++) {

           int temp = Integer.parseInt(br.readLine());
           temp = temp == 0 ? 1 : temp;
           ans = (ans * temp) % m;
       }

        System.out.println(ans);
    }
}