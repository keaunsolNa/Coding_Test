package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus17 {
	
	public static void main(String[] args) throws IOException {
		test03();
	}

	// 문서 검색
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String word = br.readLine();
		
		String[] splict = input.split(word);
		System.out.println((input.length() - input.replaceAll(word, "").length()) / word.length());
	}
	
	// 비밀 이메일
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int length = input.length;
		int r = 1; 
		int c = 1;
		
        for (int i = 1; i < length; i++) {
            if (length % i == 0 && i <= length / i) {
                r = i;
                c = length / i;
            }
        }
        
        if (r == 0 && c == 0) {
            r = 1;
            c = 1;
        }
		
		int idx = 0;
		char answer[][] = new char[r][c];
		for(int i = 0; i < c; i++) {
			
			for(int j = 0; j < r; j++) {
				answer[j][i] = input[idx++];
			}
		}
		
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(answer[i][j]);
            }
        }
	}

	// 
	public static void test03() throws IOException {
		
	}
	
	// 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int n = Integer.parseInt(br.readLine());
	}
	
	// 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	}
	
    // 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

	//
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	

    // 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	}
	
	
}
