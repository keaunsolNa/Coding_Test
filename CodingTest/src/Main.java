import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        System.out.println(solve(a, b, n, arr));
    }

    private static int solve(int a, int b, int n, int[] arr) {

        int left = 0;
        int right = 0;
        boolean flag = true;

        for (int i = 0; i < a; i++) {

            b -= arr[i] / 2;
            right = i + 1;

            if (b < 0) {
                flag = false;
                return i;
            }
        }

        if (flag) {

            while (right < n) {

                if (right - left < a) {

                    b -= arr[right] / 2;
                    if (b < 0) break;
                    right++;
                }

                else {

                    if (a > 0) b -= arr[left++] / 2;

                    else {

                        b -= arr[right];
                        if (b < 0) break;
                        right++;
                    }
                }
            }

            return right;
        }

        return right;
    }

}