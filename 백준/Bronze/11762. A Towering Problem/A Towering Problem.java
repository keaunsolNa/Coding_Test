import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int sum1 = Integer.parseInt(st.nextToken());
        int sum2 = Integer.parseInt(st.nextToken());

        Integer[] ans1 = new Integer[3];
        Integer[] ans2 = new Integer[3];

        solve(arr, sum1, ans1);
        solve(arr, sum2, ans2);

        for (int i = 0; i < 3; i++) System.out.print(ans1[i] + " ");
        for (int i = 0; i < 3; i++) System.out.print(ans2[i] + " ");
    }

    private static void solve(int[] arr, int sumP, Integer[] ans) {
        for (int i = 0; i < 6; i++) {

            for (int j = i + 1; j < 6; j++) {

                for (int q = j + 1; q < 6; q++) {

                    int sum = arr[i] + arr[j] + arr[q];
                    if (sumP == sum) {

                        ans[0] = arr[i];
                        ans[1] = arr[j];
                        ans[2] = arr[q];

                        Arrays.sort(ans, Collections.reverseOrder());
                        return;
                    }
                }
            }
        }

    }

}
