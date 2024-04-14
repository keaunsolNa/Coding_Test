import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        int[] arr = new int[4];

        for (int i = 0; i < n; i++) {

            switch (input[i]) {

                case 'N' : arr[0]++; break;
                case 'S' : arr[1]++; break;
                case 'W' : arr[2]++; break;
                case 'E' : arr[3]++; break;

            }
        }

        Arrays.sort(arr);

        System.out.println(n - arr[3]);

    }

}
