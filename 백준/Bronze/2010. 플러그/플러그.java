import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int multitap = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < multitap; i++) {
			sum += Integer.parseInt(br.readLine()) - 1;
		}
		
		System.out.println(sum+1);
	}
}
