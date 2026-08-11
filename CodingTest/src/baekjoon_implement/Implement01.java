package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Implement01 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// N 찍기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N  = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
	}

	
}
