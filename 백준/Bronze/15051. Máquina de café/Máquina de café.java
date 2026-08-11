import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int AT = (B*2) + (C*4);
		int BT = (A*2) + (C*2);
		int CT = (A*4) + (B*2);
		
		System.out.println(Math.min(Math.min(AT, BT), CT));
		
	}
}
