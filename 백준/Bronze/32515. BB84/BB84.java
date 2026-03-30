import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[4][n];

        for (int i = 0; i < 4; i++) {

            arr[i] = new boolean[n];
            String line = br.readLine();

            for (int j = 0; j < n; j++) {
                char token = line.charAt(j);
                if (token == '1' || token == 'H') arr[i][j] = true;
            }
        }

        boolean check = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

            if (arr[0][i] == arr[2][i] && arr[1][i] != arr[3][i]) {
                check = true;
                break;
            }

            if (arr[0][i] == arr[2][i]) sb.append(arr[1][i] ? "1" : "0");
        }

        bw.write(check ? "htg!" : sb.toString());
        bw.flush();
        bw.close();
    }
}