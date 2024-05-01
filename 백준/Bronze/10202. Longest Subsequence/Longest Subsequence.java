import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int t = 1; t <= n; t++) {

            st = new StringTokenizer(br.readLine());
            int tc = Integer.parseInt(st.nextToken());
            char prev = st.nextToken().charAt(0);
            int now = prev == 'X' ? 1 : 0;
            int max = now;

            for (int j = 1; j < tc; j++) {

                if (st.nextToken().charAt(0) == 'X') now++;
                else now = 0;

                max = Math.max(max, now);
            }

            sb.append("The longest contiguous subsequence of X's is of length ").append(max).append("\n");

        }

        System.out.print(sb);
    }
}
