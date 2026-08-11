import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			int g = 0;
			int h = 0;
			
			for(int j = 0; j <= 37; j++) {
				
				String str = input.substring(j, j + 3);
				
				switch(str) {
					case "TTT" : a++; break;
					case "TTH" : b++; break;
					case "THT" : c++; break;
					case "THH" : d++; break;
					case "HTT" : e++; break;
					case "HTH" : f++; break;
					case "HHT" : g++; break;
					case "HHH" : h++; break;
				}
			}
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f +" " + g + " " + h);
		}
		
	}
}
