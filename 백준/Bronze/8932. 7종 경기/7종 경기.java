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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int total = 0;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			
			int pointA = (int)(9.23076 * Math.pow((26.7 - a), 1.835));
			int pointB = (int)(1.84523 * Math.pow((b - 75), 1.348));
			int pointC = (int)(56.0211 * Math.pow((c - 1.5), 1.05));
			int pointD = (int)(4.99087 * Math.pow((42.5 - d), 1.81));
			int pointE = (int)(0.188807 * Math.pow((e - 210), 	1.41));
			int pointF = (int)(15.9803 * Math.pow((f - 3.8), 1.04));
			int pointG = (int)(0.11193 * Math.pow((254 - g), 1.88));
			
			total = pointA + pointB + pointC + pointD + pointE + pointF + pointG; 
			
			System.out.println(total);
		}
	}
}
