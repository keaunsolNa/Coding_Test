import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++) {
			
			if(i % 2 == 0) sb.append('*');
			else sb.append(' ');
			
		}
		
		sb.append('\n');
 
		for(int i = 0; i < N ; i++) {
			
			if(i % 2 != 0) sb.append('*');
			else sb.append(' ');
			
		}
		
		sb.append('\n');
 
		String str = sb.toString();
		for(int i = 1; i < N ; i++) sb.append(str);
		System.out.println(sb);
		
	}
}
