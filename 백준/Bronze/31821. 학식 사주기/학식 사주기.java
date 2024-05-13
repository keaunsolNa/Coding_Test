import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i = 0; i < m; i++) total += arr[Integer.parseInt(br.readLine()) - 1];

        System.out.println(total);
    }
}
