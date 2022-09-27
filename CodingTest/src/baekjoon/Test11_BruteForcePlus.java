package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11_BruteForcePlus {
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 완전제곱수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double M = Math.sqrt(Double.parseDouble(br.readLine()));
		double N = Math.sqrt(Double.parseDouble(br.readLine()));
		
		int sum = 0;
		for(int i = (int)Math.ceil(M); i <= N; i++) {
			sum += i*i;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println((int)Math.ceil(M) * (int)Math.ceil(M));
		}
	}
	
}
