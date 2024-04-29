import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        sb.append(tc).append("\n");

        for (int i = 0; i < tc; i++) {

            sb.append("\n");

            br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());

            sb.append(n).append("\n");
            for (int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            sb.append(arr[1]).append(" ").append(arr[0]).append(" ");

            for (int j = 2; j < n; j++) sb.append(arr[j]).append(" ");

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
