import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		long prev = 1;
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			String oper = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			
			long result = 0;
			
			switch(oper) {
				case "+" : result = (A + B - prev); break;
				case "-" : result = ((A - B) * prev); break;
				case "*" : result = (long) Math.pow(A * B, 2); break;
				case "/" :
					if(A % 2 == 0) result = A / 2;
					else result = (A + 1) / 2;
			}
			
			System.out.println(result);
			prev = result;
		}
		
	}
}
