package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Implement18 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	
	// Pyramids 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = 0;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			input++;
			int pyramids = 0;
			while(input --> 0) {
				pyramids += input;
			}
			
			System.out.println(pyramids);
		}
	}
	
	// Copier
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(a + " " + a);
		}
		
	}
	
	
	// Reverse 
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	String input = br.readLine();
        	String text = input.split(" ")[0];
        	int start = Integer.parseInt(input.split(" ")[1]);
        	int end = Integer.parseInt(input.split(" ")[2]);
        	
        	text = text.substring(0, start) + text.substring(end, text.length());
        	System.out.println(text);
        }
        
	}
	
	
}
