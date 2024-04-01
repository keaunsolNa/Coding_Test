import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }

        int ans = 0;
        for (int i = 0; i < idx; i++) ans += arr[i];

        System.out.println(ans);
        ans = 0;

        for (int i = idx + 1; i < n; i++) ans += arr[i];
        System.out.println(ans);




    }
}
