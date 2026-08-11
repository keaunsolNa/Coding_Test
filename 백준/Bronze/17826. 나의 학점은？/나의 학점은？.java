import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int idx = 1;
		
		while(idx != 51) {
			map.put(Integer.parseInt(st.nextToken()), idx);
			idx++;
		}
		
		int getPoint = Integer.parseInt(br.readLine());
		int grade = map.get(getPoint);
		
		if(grade < 6) {
			System.out.println("A+");
		} else if(grade < 16) {
			System.out.println("A0");
		} else if(grade < 31) {
			System.out.println("B+");
		} else if(grade < 36) {
			System.out.println("B0");
		} else if(grade < 46) {
			System.out.println("C+");
		} else if(grade < 49) {
			System.out.println("C0");
		} else if(grade < 51) {
			System.out.println("F");
		}
		
	}
}
