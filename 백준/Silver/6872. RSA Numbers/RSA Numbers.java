import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = a; i <= b; i++) {

            int cnt = getMaxMeasure(i);
            if (cnt == 4) ans++;
        }

        sb.append("The number of RSA numbers between ").append(a).append(" and ").append(b).append(" is ").append(ans);

        System.out.println(sb);
    }

    public static int getMaxMeasure(int n) {
        int count = 0;

        for(int i = 1; i * i <= n; i++){
            if(i * i == n) {
                count++;
            } else if(n % i == 0){
                count += 2;
            }
        }

        return count;
    }


}