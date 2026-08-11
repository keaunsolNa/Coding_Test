package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy01 {
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// Holes 
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hole = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		if(hole == 0) {
			sb.append(1);
		} else if(hole == 1) {
			sb.append(0);
		} else {
			if(hole%2 == 0) {
				for(int i = 0; i < hole/2; i++) {
					sb.append(8);
				}
			} else {
				sb.append(4);
				for(int i = 0; i < hole/2; i++) {
					sb.append(8);
				}
			}
		}
		System.out.println(sb);
		
	}


}