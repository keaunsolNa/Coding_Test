import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] sort = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }

        sort(arr);

        for(int i = 0; i < n; i++) {

            int index = arr[i][1];
            sort[index] = i;
        }

        for(int i : sort) sb.append(i).append(" ");

        System.out.println(sb);

    }

    private static void sort(int[][] arr) {

        Arrays.sort(arr, (next, current) -> {

            if(next[0] < current[0]) return -1;

            else if(next[0] > current[0]) return 1;

            else return Integer.compare(next[1], current[1]);
        });
    }
}