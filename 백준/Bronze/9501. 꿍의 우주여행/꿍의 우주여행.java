import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int N = Integer.parseInt(st.nextToken());
        	int D = Integer.parseInt(st.nextToken());
        	int answer = 0;
        	
        	for(int j = 0; j < N; j++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		double V = Integer.parseInt(st.nextToken());
        		double F = Integer.parseInt(st.nextToken());
        		double C = Integer.parseInt(st.nextToken());
        		
        		double FC = F / C;
        		double TV = FC * V;
        		if(TV >= D) {
        			answer++;
        		}
        	}
        	System.out.println(answer);
        }
        
	}
}
