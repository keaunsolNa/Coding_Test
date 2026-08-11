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
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T + 2; i++) System.out.print("@");
		System.out.println();
		
		for(int i = 0; i < T; i++) {
			System.out.print("@");
			
			for(int j = 0; j < T; j++) System.out.print(" ");
			
			System.out.println("@");
		}
		
		for(int i= 0; i < T + 2; i++) System.out.print("@");
	}
}
