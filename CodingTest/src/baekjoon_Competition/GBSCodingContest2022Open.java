package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GBSCodingContest2022Open {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		if(input <= 205) {
			System.out.println(1);
		} else if(input <= 217) {
			System.out.println(2);
		} else if(input <= 228) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
	
}
