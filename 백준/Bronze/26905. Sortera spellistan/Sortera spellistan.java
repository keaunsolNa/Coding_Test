import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] sort = arr.clone();
        Arrays.sort(sort);

        int ans = 0;
        while(!Arrays.equals(arr, sort)) {

            for(int i = 0; i < n - 1; i++) {

                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ans++;
                }
            }
        }

        System.out.print(ans);
    }
}