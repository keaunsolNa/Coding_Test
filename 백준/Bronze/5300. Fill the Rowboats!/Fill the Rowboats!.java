import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			if(i%6 == 0) {
				sb.append(i).append(" Go! ");
			} else if(i == N) {
				sb.append(i);
				sb.append(" Go!");
			} else {
				sb.append(i).append(" ");
			}
			
			if(i == N) {
			}
		}
		System.out.println(sb);
	}
}
