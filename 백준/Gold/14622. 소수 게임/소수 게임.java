import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static boolean[] isPrime;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        sieve(5000000);
        boolean[] visited = new boolean[5000001];
        
        long dw = 0;
        long gs = 0; 
        
        PriorityQueue<Integer> dws = new PriorityQueue<>(); 
        PriorityQueue<Integer> gss = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
        	
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            
            if (!isPrime[d]) {
            	
                if (gss.size() == 3) gs += gss.peek();
                else gs += 1000;
                
            }
            
            else if (visited[d]) dw -= 1000;
            
            else {
            	
                visited[d] = true;
                if (dws.size() < 3) dws.offer(d);
                
                else {
                	
                    if (dws.peek() < d) {
                        dws.poll();
                        dws.add(d);
                    }
                    
                }
            }
            
            if (!isPrime[g]) {

            	if (dws.size() == 3) dw += dws.peek();
                else dw += 1000;
            	
            }
            
            else if (visited[g]) gs -= 1000;
            
            else {
            	
                visited[g] = true;
                
                if (gss.size() < 3) gss.offer(g);
                
                else {
                	
                    if (gss.peek() < g) {
                        gss.poll();
                        gss.add(g);
                    }
                    
                }
            }
        }
        
        if (dw > gs) System.out.println("소수의 신 갓대웅");
        else if (dw < gs) System.out.println("소수 마스터 갓규성");
        else System.out.println("우열을 가릴 수 없음");
        
	}

	private static void sieve(int N) {
		
        isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < N + 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
