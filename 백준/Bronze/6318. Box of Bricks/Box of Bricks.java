import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int set = 1;
        
        while (true) {
        	
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(st.nextToken());
                sum += cur;
                arr[i] = cur;
            }
            
            int cnt = 0;
            sum /= n;
            
            for (int i = 0; i < n; i++) 
                if (arr[i] > sum) cnt += arr[i] - sum;
            
            sb.append(String.format("Set #%d\nThe minimum number of moves is %d.\n\n", set++, cnt));
        }
        
        System.out.print(sb);
	}
}
