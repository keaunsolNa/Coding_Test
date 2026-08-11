import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			
			int T = Integer.parseInt(br.readLine());
			
			long maxP = 0;
			String maxName = "";
			for(int j = 0; j < T; j++) {
				
				String[] str = br.readLine().split(" ");
				long price = Long.parseLong(str[0]);
				String name = str[1];
				if(price > maxP) {
					maxP = price;
					maxName = name;
				}
			}
			
			System.out.println(maxName);
		}
		
	}
}
