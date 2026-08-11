import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String K = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < K.length(); i++) {
			if(K.charAt(i) == '1') {
				answer++;
			}
		}
		
		System.out.println(answer);
		
    }
}
