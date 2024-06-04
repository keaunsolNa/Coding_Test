import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];

        }

        Arrays.sort(arr);

        System.out.printf("%.6f", sum / n);
        System.out.println();

        if (n % 2 == 0) {

            if (n > 2) {

                int mid = n / 2;
                double median = (arr[mid - 1] + arr[mid]) / 2.0;
                System.out.printf("%.6f", median);
            }

            else {

                double median = (arr[0] + arr[1]) / 2.0;
                System.out.printf("%.6f", median);
            }
        }

        else {

            int mid = n / 2;
            System.out.printf("%.6f", arr[mid]);
        }

    }


}
