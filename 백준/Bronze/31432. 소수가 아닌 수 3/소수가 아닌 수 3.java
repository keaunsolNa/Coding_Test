import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(n == 1 && arr[0] == 0) {
            System.out.println("YES\n0");
        }

        else {

            System.out.println("YES");
            System.out.println("" + arr[n - 1] + arr[n - 1] + arr[n - 1]);
        }


    }

}
