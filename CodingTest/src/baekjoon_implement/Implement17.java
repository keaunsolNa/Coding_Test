package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Implement17 {

	public static void main(String[] args) throws IOException {
		test05();
	}
	
	
	// 3의 배수
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 0;
		while(input.length() != 1) {
			input = plusStr(input)+"";
			cnt++;
		}
		
		System.out.println(cnt);
		if(Integer.parseInt(input) % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static int plusStr(String input) {
		
		String[] temp = input.split("");
		int answer = 0;

		for(int i = 0; i < temp.length; i++) {
			answer += Integer.parseInt(temp[i]);
		}
		return answer;
	}
	

}
