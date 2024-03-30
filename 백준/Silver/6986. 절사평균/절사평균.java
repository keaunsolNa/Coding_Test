import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) arr[i] = Double.parseDouble(br.readLine());


        Arrays.sort(arr);
        double sum = 0.0;
        for (int i = k; i < n - k; i++) sum += arr[i];
        System.out.printf("%.2f%n", sum / (n - k * 2) + 1e-8);

        for (int i = 0; i < k; i++) {
            sum += arr[k];
            sum += arr[n - k - 1];
        }

        System.out.printf("%.2f%n", sum / n + 1e-8);
    }


}