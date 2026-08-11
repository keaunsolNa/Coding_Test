package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SciOI2022OpenContest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// A번 - 카드 뽑기
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) card[i] = Integer.parseInt(st.nextToken());
		
	}
	
	// B번 - 최대 점수
	private static int totalPoint;
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken()) - 1;
		
		st = new StringTokenizer(br.readLine());
		int[] map = new int[N];
		for(int i = 0; i < N; i++) map[i] = Integer.parseInt(st.nextToken());
		
		totalPoint = 0;
		while(true) {
			System.out.println("TOTAL : " + totalPoint);
			if(S - 1 >= 0) {
				if(totalPoint + map[S-1] >= 0) {
					S -= 1;
					totalPoint += map[S];
					map[S] = 0;
					continue;
				} else {
					if(S + 1 < N) {
						
						if(totalPoint + map[S + 1] >= 0) {
							S += 1;
							totalPoint += map[S];
							map[S] = 0;
							continue;
						} else {
							System.out.println("C2");
							break;
						}
					}

				}
			}
			
			
			System.out.println("T");
			break;
			
		}
		System.out.println(totalPoint);
	}
	
	
}