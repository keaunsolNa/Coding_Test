import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < T; i++) {
			int day = Integer.parseInt(br.readLine().replaceAll("D-", ""));
			if(day <= 90 ) answer++;
		}
		
		System.out.println(answer);
	}
}
