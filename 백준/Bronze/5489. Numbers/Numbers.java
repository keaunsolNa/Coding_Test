import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] number = new int[10001];

        for (int i = 0; i < n; i++) {

            int temp = Integer.parseInt(br.readLine());
            number[temp]++;

        }

        int max = 0;
        int ans = 0;
        for (int i = 0; i < 10001; i++) {

            if (number[i] > max) {
                max = number[i];
                ans = i;
            }
        }

        System.out.println(ans);

    }


}