import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long[] arr = new long[n + 1];
        boolean reverse = false;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            k -= arr[i];
            if (k < 0) {
                System.out.println(i + 1);
                reverse = true;
                break;
            }
        }

        if (!reverse) {

            for (int i = n - 1; i >= 0; i--) {

                k -= arr[i];
                if (k < 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

    }

}
