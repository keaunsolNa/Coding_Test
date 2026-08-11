import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long[] arr = new long[n];
        long[] ans = new long[m];
        
        st = new StringTokenizer(br.readLine());
        int idx = 0;
        while(st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        
        for(int i = 0; i < m; i++){
            StringTokenizer queryst = new StringTokenizer(br.readLine());
            String qr = queryst.nextToken();
            
            if("1".equals(qr)){
            	
                long a = Integer.parseInt(queryst.nextToken());
                long b = Integer.parseInt(queryst.nextToken());
                
                long sum = 0;
                long temp;
        
                for(long j = a - 1; j <= b - 1; j++) sum += arr[(int)j];
        
                temp = arr[(int)a - 1];
                arr[(int)a - 1] = arr[(int)b - 1];
                arr[(int)b - 1] = temp;
        
                ans[i] = sum;
            }
            
            else if("2".equals(qr)){
            	
                long a = Integer.parseInt(queryst.nextToken());
                long b = Integer.parseInt(queryst.nextToken());
                long c = Integer.parseInt(queryst.nextToken());
                long d = Integer.parseInt(queryst.nextToken());
                
                long sum1 = 0;
                long sum2 = 0;
        
                for(long j = a - 1; j <= b - 1; j++) sum1 += arr[(int)j];
                for(long j = c - 1; j <= d - 1; j++) sum2 += arr[(int)j];
        
                ans[i] = sum1 - sum2;
            }
        }  
        
        for(int i = 0; i < m; i++) System.out.println(ans[i]);
	
	}
}
