package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Implement47 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	
	// 1173번 - 운동
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int totalTime = -1;
        if (M - m >= T) {
        	
        	totalTime = 0;
            int pulse = m;
            for (int cnt = 0; cnt < N; ) {
            	
                totalTime++;
                
                if (pulse + T <= M) {
                	
                	pulse += T;
                    cnt++;
                    
                } else {
                	
                	pulse -= R;
                    if (pulse < m) pulse = m;
                    
                }
            }
        }

        System.out.print(totalTime);
	}
	
	
}
