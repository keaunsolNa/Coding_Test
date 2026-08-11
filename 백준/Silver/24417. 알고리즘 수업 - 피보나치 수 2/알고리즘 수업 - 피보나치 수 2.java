import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
		
		int z;
		int x = 1; 
		int y = 1;
		
		for(int i = 3; i <= N; i++) {
			z = y;
			y = (x+y) % 1000000007; 
			x = z;
		}
		
		System.out.println(y + " " + (N - 2));
		
	}
}
