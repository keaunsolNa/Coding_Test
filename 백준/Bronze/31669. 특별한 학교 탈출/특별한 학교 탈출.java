import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {

            char[] input = br.readLine().toCharArray();
            map[i] = input;
        }

        for (int i = 0; i < m; i++) {

            boolean check = true;
            for (int j = 0; j < n; j++) {
                if (map[j][i] == 'O') check = false;
            }

            if(check) {

                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("ESCAPE FAILED");
    }
}
