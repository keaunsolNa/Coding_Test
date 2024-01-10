import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int tc = 1;

        while(t --> 0) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            int answer = 0;

            for(int i = 0; i < n; i++) {

                int start = i;
                int end = n - 1;
                while(start < end) {

                    int sum = arr[start] + arr[end];
                    if(sum > m) end--;
                    else if(sum < m) break;
                    else if(sum == m) { answer++; break; }
                }
            }

            System.out.print("Case #" + tc++ + ": " + answer + "\n");
        }
    }


}