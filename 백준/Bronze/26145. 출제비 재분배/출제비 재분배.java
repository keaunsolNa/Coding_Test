import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] pay = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) pay[i] = Integer.parseInt(st.nextToken());
        
        int[] result = new int[n + m];
        
        for (int i = 0; i < n; i++) result[i] = pay[i];
        
        for (int i = 0; i < m; i++) result[i + n] = 0;
        
        for (int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n + m; j++) {
            	
                int tmp = Integer.parseInt(st.nextToken());
                result[i] -= tmp;
                result[j] += tmp;
                
            }
        }
        
        for (int i = 0; i < n + m; i++) 
            System.out.print(result[i] + " ");
	}
}
