import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int finger = n%8;
		
		switch(finger) {
			case 0 : System.out.println("2"); break;
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 4 : System.out.println("4"); break;
			case 5 : System.out.println("5"); break;
			case 6 : System.out.println("4"); break;
			case 7 : System.out.println("3"); break;
		}
	}
}
