import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int start = Integer.parseInt(br.readLine());
		
		boolean[][] map1 = new boolean[3][3];
		boolean[][] map2 = new boolean[3][3];

		while(true) {
			String input = br.readLine();
			
			if(input == null) {
				System.out.println(0);
				return;
			}
			
			st = new StringTokenizer(input);
			
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			
			if(start == 1) map1[x][y] = true;
			else map2[x][y] = true;
			
			
			if(check(map1)) {
				System.out.println(1);
				return;
			};
			
			if(check(map2)) {
				System.out.println(2);
				return;
			}
			
			start = (start == 1) ? 0 : 1;
		}
	}

	private static boolean check(boolean[][] map) {
		
		if(map[0][0] && map[0][1] && map[0][2]) return true;
		if(map[1][0] && map[1][1] && map[1][2]) return true;
		if(map[2][0] && map[2][1] && map[2][2]) return true;
		if(map[0][0] && map[1][0] && map[2][0]) return true;
		if(map[0][1] && map[1][1] && map[2][1]) return true;
		if(map[0][2] && map[1][2] && map[2][2]) return true;
		if(map[0][2] && map[1][1] && map[2][0]) return true;
		if(map[0][0] && map[1][1] && map[2][2]) return true;
		
		return false;
	}
}
