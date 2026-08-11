import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			st = new StringTokenizer(br.readLine());
			
			int w1 = 0;
			int w2 = 0;
			for(int i = 0; i < input; i++) {
				
				int x = Integer.parseInt(st.nextToken());
				if(x == 0) w1++;
				else w2++;
				
			}
			
			sb.append("Mary won " + w1 +" times and John won " + w2 + " times" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
