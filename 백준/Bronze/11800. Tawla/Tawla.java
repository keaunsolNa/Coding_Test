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
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			int A = Integer.parseInt(temp[0]);
			int B = Integer.parseInt(temp[1]);

			String answer = "";
			if(B > A) {
				int number = A;
				A = B;
				B = number;
			}
			
			if(A == B) {
				
				switch(A) {
					case 1 : answer = "Habb Yakk"; break;
					case 2 : answer = "Dobara"; break;
					case 3 : answer = "Dousa"; break;
					case 4 : answer = "Dorgy"; break;
					case 5 : answer = "Dabash"; break;
					case 6 : answer = "Dosh"; break;
				}
				
			} else if(A == 6 && B == 5) answer = "Sheesh Beesh";
			
			else {
				
				switch(A) {
					case 1 : answer = "Yakk"; break;
					case 2 : answer = "Doh"; break;
					case 3 : answer = "Seh"; break;
					case 4 : answer = "Ghar"; break;
					case 5 : answer = "Bang"; break;
					case 6 : answer = "Sheesh"; break;
				}
				
				switch(B) {
				
					case 1 : answer += " Yakk"; break;
					case 2 : answer += " Doh"; break;
					case 3 : answer += " Seh"; break;
					case 4 : answer += " Ghar"; break;
					case 5 : answer += " Bang"; break;
					case 6 : answer += " Sheesh"; break;
				}
			}
			
			sb.append("Case " + (i+1) + ": " + answer + "\n");
		}
		
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
