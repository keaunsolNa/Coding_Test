package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DynamicProgramming06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	// 9660번 - 돌 게임 6
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger number = new BigInteger(br.readLine());
		BigInteger seven = new BigInteger("7");
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
				
		if(number.mod(seven).compareTo(zero) == 0 || number.mod(seven).compareTo(two) == 0) System.out.println("CY");
		else System.out.println("SK");
		
	}
	
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	

}
