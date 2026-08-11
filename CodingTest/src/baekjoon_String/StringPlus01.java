package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus01 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// 팰린드롬수 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0")) {
				break;
			}
			int answer = 0;
			for(int i = 0; i < temp.length()/2; i++) {
				if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) answer++;
			}
			if(answer > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}


}
