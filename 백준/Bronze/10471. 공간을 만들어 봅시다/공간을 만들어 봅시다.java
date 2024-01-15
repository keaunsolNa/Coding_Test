import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[] arr = new int[p];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < p; i++) arr[i] = Integer.parseInt(st.nextToken());

        Set<Integer> list = new TreeSet<>();
        list.add(w);

        for(int i = 0; i < p; i++) {
            list.add(w - arr[i]);
            list.add(arr[i]);

            for(int j = 0; j < i; j++)
                list.add(arr[i] - arr[j]);

        }

        for(int i : list)
            sb.append(i).append(" ");


        System.out.println(sb);

    }

}