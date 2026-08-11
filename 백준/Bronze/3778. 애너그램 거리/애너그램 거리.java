import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			String input1 = br.readLine();
			int[] alp1 = new int[26];
			for(int j = 0; j < input1.length(); j++) alp1[input1.charAt(j) -'a']++;
			
			String input2 = br.readLine();
			int[] alp2 = new int[26];
			for(int j = 0; j < input2.length(); j++) alp2[input2.charAt(j) -'a']++;
			
			int total = 0;
			for(int j = 0; j < 26; j++ ) total += Math.abs(alp1[j] - alp2[j]);
			
			System.out.println("Case #" + (i + 1) + ": " + total);
		}
	}
}
