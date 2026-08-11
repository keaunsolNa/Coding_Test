import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token;
		
		while(true) {
			token = new StringTokenizer(br.readLine());
			int p = 0;
			double sp = Double.parseDouble(token.nextToken());
			double w = Double.parseDouble(token.nextToken());
			double st = Double.parseDouble(token.nextToken());
			
			if(sp == 0 && w == 0 && st == 0) break;
			
		    if (sp <= 4.5 && w >= 150 && st >= 200) {
		    	p = 1; 
		    	sb.append("Wide Receiver");
		    }

		    if (sp <= 6.0 && w >= 300 && st >= 500) {
		    	if(p == 1) sb.append(" ");
		    	p = 1; 
		    	sb.append("Lineman");
		    }
		    
		    if (sp <= 5.0 && w >= 200 && st >= 300) {
		    	if(p == 1) sb.append(" ");
		    	p = 1; 
		    	sb.append("Quarterback");
		    }
		    
		    if (p == 0) {
		    	sb.append("No positions");
		    }
		    
		    sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
