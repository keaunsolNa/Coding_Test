import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int R = Integer.parseInt(input.split(" ")[0]);
		int C = Integer.parseInt(input.split(" ")[1]);
		
		input = br.readLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < R; i++) {
			
			for(int k = 0; k < A; k++) {
				
				for(int j = 0; j < C; j++) {
					
					for(int q = 0; q < B; q++) {
					
						if((i + j)%2 == 0) {
							sb.append("X");
						} else {
							sb.append(".");
						}
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
