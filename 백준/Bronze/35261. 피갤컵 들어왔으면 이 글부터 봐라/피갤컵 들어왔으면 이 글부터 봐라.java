import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int max = 0;
        for (int i = 0; i < n - 4; i++){

            int check = 0;
            if (arr[i] == 'e') check++;
            if (arr[i + 1] == 'a') check++;
            if (arr[i + 2] == 'g') check++;
            if (arr[i + 3] == 'l') check++;
            if (arr[i + 4] == 'e') check++;

            max = Math.max(max, check);
        }

        bw.write(String.valueOf(5 - max));
        bw.flush();
        bw.close();
    }
}