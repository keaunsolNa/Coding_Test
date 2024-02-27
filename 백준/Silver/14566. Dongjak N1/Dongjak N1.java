import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int total = 0;
        Arrays.sort(arr);

        for(int i = 1; i < n; i++) {

            int distance = arr[i] - arr[i - 1];
            if(min > distance) {

                min = distance;
                total = 1;
            } else if(min == distance) total++;
        }

        System.out.println(min + " " + total);


    }
}