import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[c];
        int ans = 0;

        for(int i = 0; i < c; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i = 0; i < c; i++) {

            if(t - arr[i] >= 0) { ans++; t -= arr[i]; }
        }

        System.out.println(ans);
    }
}