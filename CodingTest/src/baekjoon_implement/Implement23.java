package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement23 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Serca
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) sb.append(
			  " @@@   @@@  \n"
			+ "@   @ @   @ \n"
			+ "@    @    @ \n"
			+ "@         @ \n"
			+ " @       @  \n"
			+ "  @     @   \n"
			+ "   @   @    \n"
			+ "    @ @     \n"
			+ "     @      \n");
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - 정사각형
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T + 2; i++) System.out.print("@");
		System.out.println();
		
		for(int i = 0; i < T; i++) {
			System.out.print("@");
			
			for(int j = 0; j < T; j++) System.out.print(" ");
			
			System.out.println("@");
		}
		
		for(int i= 0; i < T + 2; i++) System.out.print("@");
	}
	
	// 골뱅이 찍기 - ㄷ
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 3*T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - ㅁ
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5*N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 3*N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3*N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5*N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 골뱅이 찍기 - 뒤집힌 ㄱ
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < T; j++) {
			for(int i = 0; i < 5 * T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 4 * T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - ㅂ
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < 2 * N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 골뱅이 찍기 - 돌아간 ㅍ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - 돌아간 ㅋ
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N * 5; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N * 5; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < 2 * N; j++) {
        	for(int i = 0; i < N; i++) sb.append("@");
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
	
	// 준오는 조류혐오야!!
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] nine = new int[n][m];
        int[] rowNine = new int[n];
        int maxRowNine = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		nine[i][j] = Integer.parseInt(st.nextToken());
        		rowNine[i] += (int)countChar(nine[i][j] + "", '9');
        		if(maxRowNine < rowNine[i]) maxRowNine = rowNine[i];
        	}
        }
        
        
        int[] colNine = new int[m];
        int maxColNine = Integer.MIN_VALUE;
        int sumNine = 0;
        for(int i = 0; i < m; i++) {			
        	for(int j = 0; j < n; j++) {		
        		colNine[i] += (int)countChar(nine[j][i] + "", '9');
        		if(maxColNine < colNine[i]) maxColNine = colNine[i];
        	}
        	sumNine += colNine[i];
        }
        
        System.out.println(sumNine - Math.max(maxColNine, maxRowNine));
	}
	
	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
	
	// 골뱅이 찍기 - ㅌ
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	
}
