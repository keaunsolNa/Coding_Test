import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        while (n --> 1) {

            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = Math.abs(arr[i + 1] - arr[i]);
            }
            arr = temp;

        }

        System.out.println(arr[0]);
    }


}