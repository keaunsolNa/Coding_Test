package baekjoon_implement;

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

public class Implement16 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// 저항
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, int[]> map = new HashMap<>();
		map.put("black", new int[]{0, 1});
		map.put("brown", new int[]{1, 10});
		map.put("red", new int[]{2, 100});
		map.put("orange", new int[]{3, 1000});
		map.put("yellow", new int[]{4, 10000});
		map.put("green", new int[]{5, 100000});
		map.put("blue", new int[]{6, 1000000});
		map.put("violet", new int[]{7, 10000000});
		map.put("grey", new int[]{8, 100000000});
		map.put("white", new int[]{9, 1000000000});
		
		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();
		long value = Long.parseLong(map.get(color1)[0] + "" + map.get(color2)[0]);
		System.out.println(value * map.get(color3)[1]);
		
	}
	
	
	// 캔디
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        double num = Math.pow(10, K);
		int ans = (int) ((int)Math.round(C/num)*num);
		
		System.out.println(ans);
		
	}
	
	
}
