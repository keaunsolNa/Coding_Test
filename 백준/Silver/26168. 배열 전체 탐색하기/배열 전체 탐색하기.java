import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long [] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = n - 1;
            if(query == 1) {

                long target = Long.parseLong(st.nextToken());
                while(start <= end && end <= n) {

                    if(arr[end] >= target) end--;

                    else if(arr[start] <= target) start++;


                }

                sb.append(n - end - 1);

            } else if(query == 2) {

                long target = Long.parseLong(st.nextToken());

                while(start <= end && end <= n) {

                    if(arr[end] > target) end--;

                    else if(arr[start] <= target) start++;

                }

                sb.append(n - end - 1);

            } else {

                long startTarget = Long.parseLong(st.nextToken());
                long endTarget = Long.parseLong(st.nextToken());

                int count = 0;
                for (int q = 0; q < n; q++) if (arr[q] >= startTarget && arr[q] <= endTarget) count++;
                sb.append(count);

            }


            sb.append("\n");

        }

        System.out.println(sb);
	}
}
