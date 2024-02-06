import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int temp = 0;
        int x = 0;
        for(int i = 0; i < n - 1; i++) {

            int target = (arr[i] + arr[i + 1]) / 2;
            if(target != arr[i]) {

                int min = Math.min(target - arr[i], arr[i + 1] - target);
                if(min > x) {
                    temp = target;
                    x = min;
                }
            }
        }

        System.out.println(temp == 0 ? -1 : temp);
    }
}
