import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][][] count = new int[4][4][4];
        String a, b, c;

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            c = st.nextToken();

            count[solve(a)][solve(b)][solve(c)]++;
            count[solve(a)][solve(b)][3]++;
            count[solve(a)][3][solve(c)]++;
            count[solve(a)][3][3]++;
            count[3][solve(b)][solve(c)]++;
            count[3][solve(b)][3]++;
            count[3][3][solve(c)]++;
            count[3][3][3]++;
        }
        while (m --> 0)
        {

            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            c = st.nextToken();

            sb.append(count[solve(a)][solve(b)][solve(c)]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static int solve(String s)
    {
        return switch (s) {
            case "kor", "apple", "red" -> 0;
            case "eng", "pear", "blue" -> 1;
            case "math", "orange", "green" -> 2;
            default -> 3;
        };
    }
}