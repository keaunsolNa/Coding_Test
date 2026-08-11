import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int APay = A*7;
		int BPay = B*13;
		
		if(APay > BPay) {
			System.out.println("Axel");
		} else if(APay == BPay) {
			System.out.println("lika");
		} else {
			System.out.println("Petra");
		}
	}
}
