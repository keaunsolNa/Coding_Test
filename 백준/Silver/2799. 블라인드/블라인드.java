import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] res = new int[5];
        int[] count = new int[N];

        for (int k = 0; k < M; k++) {
        	
            br.readLine(); 

            for (int i = 0; i < 4; i++) {
            	
                String str = br.readLine();
                int idx = 0;

                for (int j = 1; j < 5 * N + 1; j += 5) {
                    if (str.charAt(j) == '*') {
                        count[idx]++;
                        idx++;
                    }
                }
            }

            for (int i = 0; i < N; i++) res[count[i]]++;

            Arrays.fill(count, 0);
        }

        br.readLine(); 

        for (int i = 0; i < 5; i++) System.out.print(res[i] + " ");
   }
}