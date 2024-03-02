import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for(int t = 1; t <= tc; t++) {

            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            List<Integer> alx = new ArrayList<>();
            List<Integer> bob = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                int temp = Integer.parseInt(st.nextToken());
                if(temp % 2 == 0) bob.add(temp);
                else alx.add(temp);
                arr[i] = temp;
            }

            Collections.sort(alx);
            bob.sort(Collections.reverseOrder());
            int alxCnt = 0;
            int bobCnt = 0;
            sb.append("Case #").append(t).append(": ");

            for(int i = 0; i < n; i++) {

                if(arr[i] % 2 != 0) {
                    sb.append(alx.get(alxCnt++)).append(" ");
                } else sb.append(bob.get(bobCnt++)).append(" ");

            }
            sb.append("\n");
        }

        System.out.println(sb);
    }



}