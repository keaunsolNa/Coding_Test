import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		boolean gold = true;
		int star = 0;
		
		for(int i = 0; i < N; i++) {
			
			int score = Integer.parseInt(br.readLine());
			int penalty = Integer.parseInt(br.readLine());
			
			if(score * 5 - penalty * 3 > 40) star++;
			else gold = false;
				
		}
		
		if(gold) System.out.println(star + "+");
		else System.out.println(star);
	}
}
