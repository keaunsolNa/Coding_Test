import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int half = n % 2 == 0 ? n / 2 : n / 2 + 1;

        st = new StringTokenizer(br.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) total += Integer.parseInt(st.nextToken()) == 1 ? 1 : 0;

        System.out.println(half <= total ? 0 : half - total);

    }

}
