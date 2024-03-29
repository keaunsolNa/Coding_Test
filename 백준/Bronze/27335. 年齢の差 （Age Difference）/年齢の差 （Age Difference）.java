import java.io.*;
import java.util.Arrays;
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

        int[] sort = arr.clone();
        Arrays.sort(sort);

        for (int i = 0; i < n; i++) {
            sb.append(Math.max(Math.abs(sort[0] - arr[i]), Math.abs(sort[n - 1] - arr[i]))).append("\n");
        }

        System.out.print(sb);


    }


}