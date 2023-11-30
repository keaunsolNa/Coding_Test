import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];
        
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int start = 0, end = 0, sum = 0, ans = Integer.MAX_VALUE;
        
        while(start <= end && end <= N) {
        	
        	if(sum < S) sum += arr[end++];
        	else if(sum >= S) {
        		ans = Math.min(end - start, ans);
        		sum -= arr[start++];
        	}
        }
        
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
   }
}