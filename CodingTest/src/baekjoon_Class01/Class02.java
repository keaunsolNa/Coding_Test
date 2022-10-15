package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Class02 {

	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 체스판 다시 칠하기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int Column = Integer.parseInt(st.nextToken());		// 세로
		int Row = Integer.parseInt(st.nextToken());			// 가로
		char[][] chessBoard = new char[Column][Row];
		
		for(int i = 0; i < Column; i++) {
			chessBoard[i] = br.readLine().toCharArray();
		}
		
		int min = 9999;
		String[] compareChess = new String[8];
		for(int i = 0; i <= Column - 8; i++) {
			for(int j = 0; j <= Row - 8; j++) {
				for (int t = 0; t < 8 ; t++) {
					StringBuilder sb = new StringBuilder();
					for (int c = 0; c < 8; c++) {
						sb.append(chessBoard[t + i][c + j]);
					}
					compareChess[t] = sb.toString();
				}
				int temp = cutting(compareChess, 'W', 'B');
				int temp2 = cutting(compareChess, 'B', 'W');
				if(temp > temp2) {
					temp = temp2;
				}
				if(min > temp) {
					min = temp;
				}
			}
		}

		System.out.println(min);
	}
    
	// 판 자르기 메서드
    public static int cutting(String[] chess, char firstChess, char nextChess) {
		int answer = 0;
		for (String string : chess) {
			for(int i = 0; i < string.length(); i++) {
				if(i%2 == 0 || i == 0) {
					if(!(firstChess == string.charAt(i))) {
						answer++;
					} 
				} else {
					if((firstChess == string.charAt(i))) {
						answer++;
					} 
				}
			}
			char temp = firstChess;
			firstChess = nextChess;
			nextChess = temp;
		}
		
		return answer;
	}

    // 직사각형에서 탈출
    public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xOut = Math.min(w-x, Math.abs(0-x));
		int yOut = Math.min(h-y, Math.abs(0-y));
		System.out.println(Math.min(xOut, yOut));
    }

    // 단어 정렬
    public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Set<String> arrSet = new LinkedHashSet<>();
		
		for(int i = 0; i < testCase; i++) {
			arrSet.add(br.readLine());
		}
		
		String[] strArr = new String[arrSet.size()];
		int loop = 0;
		for (Iterator<String> iter = arrSet.iterator(); iter.hasNext();) {
			strArr[loop] = iter.next();
			loop++;
		}

		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
	
		for (String string : strArr) {
			System.out.println(string);
		}
    }

    // 팰린드롬 수
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0")) {
				break;
			}
			int answer = 0;
			for(int i = 0; i < temp.length()/2; i++) {
				if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) answer++;
			}
			if(answer > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
    }
    
    // 영화감독 숌
    public static void test05() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
    }

    // 랜선 자르기
    public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int need = N-K;
		
		int sum = 0;
		long min = 214748368;
    	for(int i = 0; i < K; i++) {
    		int length = Integer.parseInt(br.readLine());
    		sum += length;
    	}

    	int max = sum/N;
    	
    	
    }


}
