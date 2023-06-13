package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement57 {
    
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 10219번 - Meats On The Grill 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = N;

		while(cnt!=0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());        
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            char[][] arr= new char[H][W];
            
            for(int i = 0; i < H; i++) {
            
            	String temp = br.readLine();
                for(int j = 0; j < W; j++) arr[i][j] = temp.charAt(j);

            }
            
            for(int i = 0; i < H; i++) {
            
            	for(int j = W - 1; j >= 0; j--) System.out.print(arr[i][j]);
                System.out.print("\n");

            }

            cnt--;

		}
	}
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
