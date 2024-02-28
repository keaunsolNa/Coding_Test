import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int loc = i - 1;
            int newItem = arr[i];

            while (loc >= 0 && newItem < arr[loc]) {

                if(K == 0) {
                    System.out.println(arr[loc + 1] );
                    return;
                }
                arr[loc + 1] = arr[loc];
                loc--;
                K--;
            }
            if (loc + 1 != i) {

                if(K == 0) {
                    System.out.println(arr[loc + 1]);
                    return;
                }
                arr[loc + 1] = newItem;
                K--;
            }
        }

        System.out.println(-1);
    }
}