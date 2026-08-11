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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		Map<Integer, Integer> cowMap = new HashMap<>();
		
		for(int i = 1;  i <= 10; i ++) cowMap.put(i, 3);
		int cnt = 0;
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			if(cowMap.get(cow) != 3) {
				
				if(cowMap.get(cow) != dir) {
					cowMap.put(cow, dir);
					cnt++;
				}
			} else cowMap.put(cow, dir);
			
		}
		
		System.out.println(cnt);
	}
}
