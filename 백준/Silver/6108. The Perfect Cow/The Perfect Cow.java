import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] out = new int[n];
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int[] in = new int[n];
            for (int j = 0; j < n; j++) in[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(in);
            out[i] = in[n / 2];

        }

        Arrays.sort(out);
        System.out.println(out[n / 2]);
    }
}
