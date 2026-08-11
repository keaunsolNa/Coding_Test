package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Implement04 {

	public static void main(String[] args) throws IOException {
		test05();
	}
	
	
	// Vera and Outfits 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N*(N-1));
	}
	
	
}
