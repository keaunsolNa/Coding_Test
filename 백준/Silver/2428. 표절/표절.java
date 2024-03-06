import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        double[] fileSize = new double[n];

        for (int i = 0; i < n; i++) fileSize[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(fileSize);
        long sum = 0;
        for (int i = 0; i < n; i++) {

            int start = i + 1;
            int end = n - 1;

            while (start <= end) {

                int mid = (start + end) / 2;
                if(fileSize[mid] * 0.9 <= fileSize[i]) start = mid + 1;
                else end = mid - 1;

            }

            sum += (start - i - 1);
        }

        System.out.println(sum);

    }
}
