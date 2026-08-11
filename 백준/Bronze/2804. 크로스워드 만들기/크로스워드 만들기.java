import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int x = 0;
		int y = 0;
		boolean flag = false;
		for(int i = 0; i < A.length(); i++) {
			char aChar = A.charAt(i);
			for(int j = 0; j < B.length(); j++) {
				char bChar = B.charAt(j);
				if(aChar == bChar) {
					x = i;
					y = j;
					flag = true;
					break;
				}
			}
			if(flag)break;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < B.length(); i++) {
			if(i == y) {
				sb.append(A).append("\n");
				continue;
			}
			
			for(int j = 0; j < A.length(); j++) {
				if(j == x) {
					sb.append(B.charAt(i));
				}
				else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
