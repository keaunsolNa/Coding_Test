import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

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
}
