package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus13 {
	
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	
	// Rock, Paper, Scissors 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("E")) {
			String P1 = input;
			String P2 = br.readLine();
			int P1W = 0;
			int P2W = 0;
			for(int i = 0; i < P1.length(); i++) {
				switch(P1.charAt(i)) {
					case 'R' :
						if(P2.charAt(i) == 'S') {
							P1W++;
						} else if(P2.charAt(i) == 'P') {
							P2W++;
						}
						break;
					case 'S' :
						if(P2.charAt(i) == 'R') {
							P2W++;
						} else if(P2.charAt(i) == 'P') {
							P1W++;
						}
						break;
					case 'P' :
						if(P2.charAt(i) == 'S') {
							P2W++;
						} else if(P2.charAt(i) == 'R') {
							P1W++;
						}
						break;
				}
			}
			System.out.println("P1: "+P1W);
			System.out.println("P2: "+P2W);
		}
	}
	
	
}
