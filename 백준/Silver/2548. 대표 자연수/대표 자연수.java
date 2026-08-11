import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        int[] sum = new int[100001];
        int[] cnt = new int[100001];
        
        for (int i = 1; i <= n; i++) {
        	
            int cur = Integer.parseInt(st.nextToken());
            sum[cur] += cur;
            cnt[cur]++;
            
        }
        
        for (int i = 1; i <= 10000; i++) {
        	
            sum[i] += sum[i - 1];
            cnt[i] += cnt[i - 1];
            
        }
        
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int i = 1; i <= 10000; i++) {
        	
            if (cnt[i] - cnt[i - 1] == 0) continue;
            int calc = (i * cnt[i - 1] - sum[i - 1]) + (sum[10000] - sum[i] - i * (cnt[10000] - cnt[i]));
            if (min > calc) {
                min = calc;
                answer = i;
            }
        }
        
        System.out.println(answer);
		
	}
}
