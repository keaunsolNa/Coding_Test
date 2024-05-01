import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        char[] alp = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int k = Integer.parseInt(br.readLine()) % 26;
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int temp = (int) arr[i] - 'a';
            int position = temp - k >= 0 ? temp - k : 26 + temp - k;
            if (temp >= 0 && temp <= 25) {
                arr[i] = alp[position];
                k++;
            }

            sb.append(arr[i]);
            if (k > 25) k = 1;
        }

        System.out.println(sb);

    }
}
