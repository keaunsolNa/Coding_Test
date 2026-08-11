import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] milk = {0, 1, 2};
		int cnt = 0;
		int answer = 0;
		int index = 0;
		while(true) {
			if (index == N) {
				break;
			}
			int i = Integer.parseInt(st.nextToken());
			
			if(i == milk[cnt]) {
				answer++;
				cnt++;
			}
			
			if(cnt == 3) {
				cnt = 0;
			}
			index++;
			
		}
		
		System.out.println(answer);
	}
}
