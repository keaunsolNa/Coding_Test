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
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(br.readLine());
			StringBuilder binaryTemp = new StringBuilder(Integer.toBinaryString(temp));
			binaryTemp.reverse();
			
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < binaryTemp.length(); j++) {
				if(binaryTemp.charAt(j) == '1') {
					sb.append(j).append(" ");
				}
			}
			System.out.println(sb);
		}
	}
}
