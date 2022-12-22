package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test12_BruteForce {
	private static boolean[] visit;
	private static int sumNumber = 0;
	private static int[] result = new int[3];
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 블랙잭
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int cardAmount = Integer.parseInt(st.nextToken());
		int keyNumber = Integer.parseInt(st.nextToken());
		
		int[] card = new int[cardAmount];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < cardAmount; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		visit = new boolean[card.length];
		int depth = 0;
		dfs(depth, keyNumber, cardAmount, card);
		
		System.out.println(sumNumber);
	}
	
	// 블랙잭 dfs 메서드
	public static void dfs(int depth, int keyNumber, int cardAmount, int[] card) {
		
		if(depth == 3) {
			int sum = 0;

			for (int i : result) {
				sum += i;
			}
			
			if (sum > keyNumber) {
				return;
			}
			
			if(sum <= keyNumber) {
				sumNumber = Math.max(sumNumber, sum);
			}
		} else {
			
			for(int i = depth; i < cardAmount; i++) {
				
				if(!visit[i]) {
					visit[i] = true;
					result[depth] = card[i];
					dfs(depth+1, keyNumber, cardAmount, card);
					visit[i] = false;
				}
			}
		}
		
	}
	
	// 분해합
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int targetNumber = 0;
		for(targetNumber = 0; targetNumber < N; targetNumber++) {
			sum = targetNumber;
			for(int j = 0; j < (targetNumber + "").length(); j++) {
				sum += Character.getNumericValue((targetNumber + "").charAt(j));
			}
			if(sum == N) {
				break;
			}
		}
		if(targetNumber == N) {
			targetNumber = 0;
		}
		System.out.println(targetNumber);
	}

	// 덩치
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[][] people = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] ranking = new int[N];
		int rank = 1;
		for(int i = 0; i < people.length; i++) {
			int tempWeight = people[i][0];
			int tempHeight = people[i][1];
			for(int j = 0; j < people.length; j++) {
				if(tempWeight < people[j][0] && tempHeight < people[j][1]) {
					rank++;
				} 
			}
			ranking[i] = rank;
			rank = 1;
		}
	
		StringBuilder sb = new StringBuilder();
		for (int i : ranking) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
	
	// 체스판 다시 칠하기
	public static void test04() throws IOException {
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

	// 체스판 다시 칠하기 체크 메소드
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
	
}
