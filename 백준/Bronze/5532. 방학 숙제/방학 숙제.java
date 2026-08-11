import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L  = Integer.parseInt(br.readLine());
		int A  = Integer.parseInt(br.readLine());
		int B  = Integer.parseInt(br.readLine());
		int C  = Integer.parseInt(br.readLine());
		int D  = Integer.parseInt(br.readLine());
		
		double mathDay = Math.ceil((double)B/D);
		double langDay = Math.ceil((double)A/C);
		
		int SD = (int)Math.max(mathDay, langDay);
		System.out.println(L - SD);
	}
}
