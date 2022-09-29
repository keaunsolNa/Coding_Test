package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06_StringPlus2 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 명령 프롬프트
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stringArray = new String[N];
		for(int i = 0; i < N; i++) {
			stringArray[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < stringArray[0].length(); i++) {
			char temp = stringArray[0].charAt(i);
			int cnt = 0;
			for(int j = 1; j < N; j++) {
				if(temp != stringArray[j].charAt(i)) {
					cnt = -1;
				}
			}
			
			if(cnt == -1) {
				sb.append("?");
			} else {
				sb.append(stringArray[0].charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}

	// 8진수 2진수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		if(N.equals("8")) {
			N = "0";
		}
		long octalToDecimal = Integer.parseInt(N, 8);
		String binary = Long.toBinaryString(octalToDecimal);
		System.out.println(binary);
	}
}
