import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int left = Integer.parseInt(st.nextToken());
		int right = Integer.parseInt(st.nextToken());
		
		while(st.hasMoreTokens()){
			if(left > right) right += Integer.parseInt(st.nextToken());
			else left += Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		while(left != right) {
			int dif = Math.abs(left - right);
			int plus = dif >= 100 ? 100 : dif >= 50 ? 50 : dif >= 20 ? 20 : dif >= 10 ? 10 : dif >= 5 ? 5 : dif >= 2 ? 2 : 1;
			
			if(left > right) right += plus;
			else left += plus;
			dif -= plus;
			cnt++;
			
		}
		
		System.out.println(cnt);
	}
}
