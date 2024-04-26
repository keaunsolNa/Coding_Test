import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int loc[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) loc[i][j] = Integer.parseInt(st.nextToken());

        }

        int ans = 0;
        for (int i = 0; i < 2; i++) {

            ans += (loc[i][2] - loc[i][0]) * (loc[i][3] - loc[i][1]);
            int w = Math.min(loc[2][2], loc[i][2]) - Math.max(loc[2][0], loc[i][0]);
            int h = Math.min(loc[2][3], loc[i][3]) - Math.max(loc[2][1], loc[i][1]);

            if (w > 0 && h > 0) ans -= (w * h);
        }

        System.out.println(ans);

    }




}
