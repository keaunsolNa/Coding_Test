import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] lts = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        lts[0] = arr[0];
        int length = 1;

        for(int i = 1; i < n; i++) {

            int target = arr[i];

            if(lts[length - 1] < target) {

                length++;
                lts[length - 1] = target;

            }

            else {

                int start = 0;
                int end = length;

                while (start < end) {

                    int mid = (start + end) / 2;

                    if(lts[mid] < target) start = mid + 1;
                    else end = mid;
                }

                lts[start] = target;
            }
        }

        System.out.println(length);
    }
}