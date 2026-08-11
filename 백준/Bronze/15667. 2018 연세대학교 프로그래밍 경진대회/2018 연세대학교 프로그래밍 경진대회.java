import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1;
	
		int answer = 0;
		for(int i = 1; i < N; i++) {
			
			if(i*i + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
