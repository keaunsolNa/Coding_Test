import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int win = 0;
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String P1 = st.nextToken();
				String P2 = st.nextToken();

				switch(P1) {
					case "P" : 
						win += P2.equals("R") ? 1 : P2.equals("S") ? -1 : 0;
						break;
					case "R" : 
						win += P2.equals("P") ? -1 : P2.equals("S") ? 1 : 0;
						break;
					case "S" : 
						win += P2.equals("P") ? 1 : P2.equals("R") ? -1 : 0;
						break;
				}
				
			}
			
			if(win > 0) {
				System.out.println("Player 1");
			} else if(win == 0) {
				System.out.println("TIE");
			} else {
				System.out.println("Player 2");
			}
		}
	}
}
