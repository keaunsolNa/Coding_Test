import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int PA = Integer.parseInt(st.nextToken());
		int PC = Integer.parseInt(st.nextToken());
		int PE = Integer.parseInt(st.nextToken());
		
		int AH = 0;
		int CH = 0;
		
		if(A%2 == 0) {
			AH = A/2;
		} else {
			AH = A/2 + 1;
		}

		if(C%2 == 0) {
			CH = C/2;
		} else {
			CH = C/2 + 1;
		}
				
		if(PA == A && PC == C && PE == E) {
			System.out.println("A");
		} else if(AH <= PA && C == PC && E == PE) {
			System.out.println("B");
		} else if(C == PC && E == PE) {
			System.out.println("C");
		} else if(CH <= PC && E == PE) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}
