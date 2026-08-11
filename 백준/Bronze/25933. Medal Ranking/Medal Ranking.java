import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int ag = Integer.parseInt(st.nextToken());
			int as = Integer.parseInt(st.nextToken());
			int ab = Integer.parseInt(st.nextToken());
			int rg = Integer.parseInt(st.nextToken());
			int rs = Integer.parseInt(st.nextToken());
			int rb = Integer.parseInt(st.nextToken());
			
			boolean count = false;
			boolean color = false;
			
			if(ag + as + ab > rg + rs + rb) count = true;
			
			if(ag > rg) color = true;
			else if(ag == rg) {
				
				if(as > rs) color = true;
				else if(as == rs) {
					
					if(ab > rb) color = true;
				}
			} 
			
			sb.append(ag + " " + as + " " + ab + " " + rg + " " + rs + " " + rb + "\n");
			if(count && color) sb.append("both");
			else if(count) sb.append("count");
			else if(color) sb.append("color");
			else sb.append("none");
			
			sb.append("\n");
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
}
