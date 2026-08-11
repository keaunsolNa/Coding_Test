import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) cnt += S.charAt(i) == 'I' ? 0 : 1; 
			if(i % 2 == 1) cnt += S.charAt(i) == 'O' ? 0 : 1; 
		}
		
		
		if(S.length() % 2 == 0) cnt++;
		
		System.out.println(cnt);
		
    }
}
