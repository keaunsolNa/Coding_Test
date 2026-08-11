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
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sbRL = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringBuilder str = new StringBuilder(br.readLine()).reverse();
			sb.append(str.reverse()).append("\n");
			if(i != testCase-1) {
				sbRL.append(str.reverse()).append("\n");
			} else {
				sbRL.append(str.reverse());
			}
		}
		
		int upset = Integer.parseInt(br.readLine());
		
		if(upset == 1) {
			System.out.println(sb);
		} else if(upset == 2) {
			System.out.println(sbRL);
		} else if(upset == 3) {
			System.out.println(sbRL.reverse());
		}
	}
}
