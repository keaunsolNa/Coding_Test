import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        int mid = n % 2 == 0 ? n / 2 : n / 2 + 1;

        for(int i = 0; i < n; i++) {

            if(i < mid) min.add(arr[i]);
            else max.add(arr[i]);
        }

        min.sort(Collections.reverseOrder());

        int idx = 0;
        int idx2 = 0;
        for(int i = 0; i < n; i++) {

            if(i % 2 == 0) sb.append(min.get(idx++)).append(" ");
            else sb.append(max.get(idx2++)).append(" ");
        }

        System.out.println(sb);

    }


}