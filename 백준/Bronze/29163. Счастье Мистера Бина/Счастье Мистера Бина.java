import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < N; i++) {

			if(Integer.parseInt(st.nextToken()) % 2 == 0) even++; 
			else odd++;
			
		}
		
		System.out.println(even > odd ? "Happy" : "Sad");
	}
}
