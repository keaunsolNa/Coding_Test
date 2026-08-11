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
		
		int N = Integer.parseInt(br.readLine());
		
		int gan[] = new int[10];
		char zi[] = new char[12];
		
		for(int i = 0; i < 10; i++) gan[i] = i;
		for(int i = 0; i < 12; i++) zi[i] = (char)(i + 65);
		

		System.out.print(zi[(N + 8) % 12]);
		System.out.print(gan[(N + 6) % 10]);
		
	}
}
