import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		int idx = 1;
		while(!(input = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(input);
			int p = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			sb.append("Hole #" + idx + "\n");
			
			
			if(s == 1) {
				sb.append("Hole-in-one.");
				sb.append("\n" + "\n");
				idx++;
				continue;
			}
			
			switch(s - p) {
				
				case -2 : sb.append("Eagle." + "\n"); break;
				
				case -1 : sb.append("Birdie." + "\n"); break;
				
				case 0 : sb.append("Par." + "\n"); break;
				
				case 1 : sb.append("Bogey." + "\n"); break;
				
				default : 
					if(s - p < - 2) sb.append("Double eagle." + "\n"); 
					else sb.append("Double Bogey." + "\n"); break;
			}
			
			sb.append("\n");
			idx++;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
