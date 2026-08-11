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
		test09();
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
