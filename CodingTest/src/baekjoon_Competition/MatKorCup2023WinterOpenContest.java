package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MatKorCup2023WinterOpenContest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// A번 - 몇개고?
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		if(T >= 12 && T <= 16 && S ==0) System.out.println(320);
		else System.out.println(280);
			
	}
}