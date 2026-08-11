import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] number = new int[5];
		for(int i = 0; i < 5; i++) number[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(number);
		
		for(int i = number[0]; ; i++) {
			
			int cnt = 0;
			for(int j = 0; j < 5; j++) {
				
				if(i % number[j] == 0) cnt++;
			}
			
			if(cnt >= 3) {
				System.out.println(i);
				break;
			}
		}
	}
}
