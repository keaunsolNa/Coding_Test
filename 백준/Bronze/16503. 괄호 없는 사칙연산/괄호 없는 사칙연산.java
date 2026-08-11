import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		String oper1 = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		String oper2 = st.nextToken();
		int C = Integer.parseInt(st.nextToken());
		
		int ans1 = calculation(calculation(A, B, oper1), C, oper2); 
		int ans2 = calculation(A, calculation(B, C, oper2), oper1);
		
		System.out.println(Math.min(ans1, ans2));
		System.out.print(Math.max(ans2, ans1));
		
	}

	private static int calculation(int N1, int N2, String oper) {
		
		switch(oper) {
		
			case "+" : return N1 + N2; 
			case "-" : return N1 - N2;
			case "*" : return N1 * N2;
			case "/" : 
				
				if(N1 < 0) return (Math.abs(N1) / N2 * -1);
				else if(N2 < 0) return (N1 / Math.abs(N2) * -1);
				else return N1 / N2;
		}
		
		return -1;
	}
}
