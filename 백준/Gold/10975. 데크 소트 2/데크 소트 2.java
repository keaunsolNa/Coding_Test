import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sort = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sort[i] = Integer.parseInt(br.readLine());

        Arrays.sort(sort);
        int ans = 0;

        if(n == 1) { System.out.println(1); return; }

        for(int i = 0; i < n; i++) {

            int j;
            for (j = 0; j < n; j++) {

                if (Objects.equals(arr[i], sort[j])) {
                    sort[j] = 10000;
                    break;
                }
            }

            if (j == 0) {

                if (sort[j + 1] != 10000) ans++;
            }

            else if (j == n - 1) {

                if (sort[j - 1] != 10000) ans++;

            }

            else if (sort[j - 1] == 10000 || sort[j + 1] == 10000) continue;

            else ans++;

        }

        System.out.println(ans);
    }
}