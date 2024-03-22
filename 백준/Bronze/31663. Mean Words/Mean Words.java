import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][];
        int max = 0;
        for (int i = 0; i < n; i++) {

            String tee = br.readLine();
            char[] temp = tee.toCharArray();
            arr[i] = temp;
            max = Math.max(max, temp.length);
        }

        int[] total = new int[max], length = new int[max];
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < n; j++) {

                if(arr[j].length > i) {

                    total[i] += arr[j][i];
                    length[i]++;
                }
            }
        }

        for (int i = 0; i < max; i++) {

            int avr = total[i] / length[i];
            sb.append((char)avr);
        }

        System.out.println(sb);
    }


}