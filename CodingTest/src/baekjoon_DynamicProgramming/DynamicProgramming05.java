package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class DynamicProgramming05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	
	// 9658번 - 돌 게임 5
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		if(N % 2 == 0) System.out.println("CY");
		else System.out.println("SK");
	}

}
