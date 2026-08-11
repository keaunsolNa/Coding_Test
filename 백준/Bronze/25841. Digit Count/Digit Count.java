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

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int area1 = Integer.parseInt(input[0]);
		int area2 = Integer.parseInt(input[1]);
		int number = Integer.parseInt(input[2]);
		int cnt = 0;
		for(int i = area1; i <= area2; i++) {
			
			for(int j = 0; j < 4; j++) {
				if((i+"").charAt(j) == (number+"").charAt(0)) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
