import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < n / 2; i++) sum += arr[i];
        for (int i = n / 2; i < n; i++) sum += arr[i] / 2;

        System.out.println(sum);
    }
}
