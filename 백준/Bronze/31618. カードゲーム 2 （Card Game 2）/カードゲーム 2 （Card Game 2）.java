import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int correct = 0;
        boolean yes = false;
        for (int i = 0; i < n - 1; i++) {

            if(arr[i + 1] - arr[i] == 3) correct++;
            else correct = 0;

            if(correct == 2) yes = true;
        }

        System.out.println(yes ? "Yes" : "No");

    }
}
