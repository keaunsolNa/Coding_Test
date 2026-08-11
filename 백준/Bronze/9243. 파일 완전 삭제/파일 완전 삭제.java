import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		String input2 = br.readLine();
		
		if(N%2 == 0) {
			
			if(input.equals(input2)) {
				System.out.println("Deletion succeeded");
			} else {
				System.out.println("Deletion failed");
			}
			
		} else {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < input2.length(); i++) {
				if(input2.charAt(i) == '0') {
					sb.append('1');
				} else {
					sb.append('0');
				}
			}
			
			if(sb.toString().equals(input)) {
				System.out.println("Deletion succeeded");
			} else {
				System.out.println("Deletion failed");
			}
		}
		
	}
}
