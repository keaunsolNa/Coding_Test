import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[] order = br.readLine().toCharArray();
		
		int now = 1;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			
			if(order[i] == 'R') {
				
				if(now != 3) now += 1;
				
			} else {
				
				if(now != 1) now -= 1;
			}
			
			if(now == 3) ans++;
			
		}
		
		System.out.println(ans);
	}
}
