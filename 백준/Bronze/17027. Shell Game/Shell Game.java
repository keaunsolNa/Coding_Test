import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[3][3];
        arr[0] = new boolean[] { true, false, false };
        arr[1] = new boolean[] { false, true, false };
        arr[2] = new boolean[] { false, false, true };

        int[] answer = new int[3];

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            boolean temp = arr[0][a - 1];
            arr[0][a - 1] = arr[0][b - 1];
            arr[0][b - 1] = temp;
            if (arr[0][g - 1]) answer[0]++;

            temp = arr[1][a - 1];
            arr[1][a - 1] = arr[1][b - 1];
            arr[1][b - 1] = temp;
            if (arr[1][g - 1]) answer[1]++;

            temp = arr[2][a - 1];
            arr[2][a - 1] = arr[2][b - 1];
            arr[2][b - 1] = temp;
            if (arr[2][g - 1]) answer[2]++;

        }

        Arrays.sort(answer);
        bw.write(String.valueOf(answer[2]));

        bw.flush();
        bw.close();
        br.close();
    }
}
