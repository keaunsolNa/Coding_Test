import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int year = Integer.parseInt(br.readLine());
			if (year == 0) break;
			
			String msg = "";
			
			sb.append(year);
			
	        if (year < 1896)  sb.append(" No summer games");
	        
	        else if(year == 1916 || year == 1940 || year == 1944) sb.append(" Games cancelled");
	        
	        else if (year > 2020 && year % 4 == 0) sb.append(" No city yet chosen");

	        else if (year % 4 == 0) sb.append(" Summer Olympics");
	        
	        else sb.append(" No summer games");
			
	        sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
