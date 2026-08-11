import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] need = new int[n];
        for(int i = 0; i < n; i++) {

        	st = new StringTokenizer(br.readLine());
        	int P = Integer.parseInt(st.nextToken());
        	int L = Integer.parseInt(st.nextToken());
        	
        	Integer[] find = new Integer[P];
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < P; j++) find[j] = Integer.parseInt(st.nextToken());
        	
        	Arrays.sort(find, Collections.reverseOrder());
        	
        	if(P >= L) need[i] = find[L - 1];
        	else if(P < L) need[i] = 1;
        }
        
        Arrays.sort(need);
        
        int ans = 0;
        for(int i = 0; i < need.length; i++) {
        	if(m - need[i] >= 0) {
        		ans++;
        		m -= need[i];
        	}
        }
        
        System.out.println(ans);
	}
}
