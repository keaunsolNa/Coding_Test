import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int G = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			int need = E - C;
			
			if(need <= 0) {
				System.out.println(0); 
				continue;
			}
			
			switch(G) {
				
				case 1 : System.out.println(need); break;
				
				case 2 : System.out.println(need * 3); break;
				
				case 3 : System.out.println(need * 5); break;
					
			}
		}
	}
}
