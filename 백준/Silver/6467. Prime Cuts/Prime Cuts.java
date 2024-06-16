import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String input = "";
        while ((input = br.readLine()) != null) {

            st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int cnt = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {

                if (isPrime(i)) {

                    cnt++;
                    list.add(i);
                }
            }

            sb.append(n).append(" ").append(c).append(": ");

            int start = Math.max(0, (list.size() + 1) / 2 - c);
            int end = Math.min(list.size(), list.size() / 2 + c);

            for (int i = start; i < end; i++) sb.append(list.get(i)).append(" ");

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }


    public static boolean isPrime(long n) {

        if(n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;

    }

}