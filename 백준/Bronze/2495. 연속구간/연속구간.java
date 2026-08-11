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
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++) {
			String str = br.readLine();
			
			int cnt = 1;
			int maxCnt = 1;
			for(int j = 0; j < 8; j++) {
				
				if(j != 7) {
					if(str.charAt(j) == str.charAt(j+1)) {
						cnt++;
						if(cnt > maxCnt) {
							maxCnt = cnt;
						}
					} else {
						cnt = 1;
					}
				}
			}
			System.out.println(maxCnt);
		}
		
	}
}
