import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());

       for (int i = 0; i < k; i++) {

           st = new StringTokenizer(br.readLine());

           int si = Integer.parseInt(st.nextToken());
           int ti = Integer.parseInt(st.nextToken());
           int ri = Integer.parseInt(st.nextToken());

           int c = si * ti;
           double res =0, cnt = 0;

           while (true) {

               if (n - cnt <= c) {
                   res += Math.ceil((n - cnt) / si);
                   break;
               }

               else {
                   cnt += c;
                   res += ti + ri;
               }
           }

           System.out.println((int)res);


       }


    }


}