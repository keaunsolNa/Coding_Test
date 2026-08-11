import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int temp = Integer.parseInt(st.nextToken());
		char L = (temp + "").charAt(0);
		
		int idx = 1;
		while(N != 0) {
			
			String str = idx+"";
			boolean chk = true;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == L) chk = false;
			}
			
			if(chk) N--;
			idx++;
		}
		
		System.out.println(idx - 1);
	}
}
