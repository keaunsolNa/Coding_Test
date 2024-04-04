import java.io.*;
import java.util.*;

public class Main {


    private static long[] arr, minTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int salary = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String nation = st.nextToken();

            if (nation.equals("Russia") && salary > max) {
                max = salary;
                ans = name;
            }
        }

        System.out.println(ans);


    }


}
