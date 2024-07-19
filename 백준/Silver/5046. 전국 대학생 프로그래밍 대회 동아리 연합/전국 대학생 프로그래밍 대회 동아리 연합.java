import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < h; i++)
        {

            int p = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++)
            {
                int a = Integer.parseInt(st.nextToken());
                if (a >= n && p * n <= b) min = Math.min(n * p, min);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? "stay home" : min);

    }


}