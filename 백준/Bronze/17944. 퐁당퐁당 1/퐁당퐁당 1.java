import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		int max = N * 2;
		int min = 1;
		
		int cnt = 0;
		boolean flag = true;
		
		for(int i = 0; i < T; i++) {
			
			if(flag) cnt++;
			else cnt--;
			
			if(flag && cnt >= max) flag = false;
			else if(!flag && cnt <= min) flag = true;
		}
		
		System.out.println(cnt);
	}
}
