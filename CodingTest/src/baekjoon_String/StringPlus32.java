package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus32 {
	
	public static void main(String[] args) throws IOException {
		test02();
	}

	// 27522번 - 카트라이더: 드리프트
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<Integer, String> map = new TreeMap<>();
		for(int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			int[] inputs = Arrays.stream(st.nextToken().split(":")).map(String::trim).mapToInt(Integer::parseInt).toArray();			
			
			int time = (inputs[0] * 60000) + (inputs[1] * 1000) + inputs[2];
			String team = st.nextToken();
			
			map.put(time, team);
		}
		
		int point = 10;
		int red = 0;
		int blue = 0;
		for (int key : map.keySet()) {
			
			if(map.get(key).equals("B")) blue += point;
			else red += point;
			
			if(point > 6) point -= 2;
			else point--;
			
		}
		
		if(red > blue) System.out.println("Red");
		else System.out.println("Blue");
	}
	
	// 
	private String A;
	private String B;
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = "\0" + br.readLine();
		String B = "\0" + br.readLine();
		int result = 0;
		
		for(int i = 0; i < A.length(); i++) {
			
			for(int j = 0; j < B.length(); j++) {
				
				
			}
		}
	}
	
    public int lcs(int i, int j) {
        if (i == 0 || j == 0) return 0;
 
        if (A.charAt(i) == B.charAt(j)) return lcs(i - 1, j - 1) + 1;
 
        else
            return 0;
    }
    
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	
}
